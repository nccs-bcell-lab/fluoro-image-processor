package com.bcell_lab.tool.impl;

import java.util.concurrent.Callable;

import com.bcell_lab.exception.ToolExecutionException;
import picocli.CommandLine;

public interface BaseTool extends Callable<Integer> {
    void execute() throws ToolExecutionException;

    @Override
    default Integer call() {
        try {
            execute();
        } catch (CommandLine.ParameterException e) {
            throw e;
        } catch (Exception e) {
            return 1;
        }

        return 0;
    }
}
