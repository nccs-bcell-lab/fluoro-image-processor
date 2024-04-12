package com.bcell_lab.tool;

import com.bcell_lab.tool.impl.ImageProcessorTool;
import picocli.CommandLine;

@CommandLine.Command(name = "vati",
        mixinStandardHelpOptions = true,
        version = "14-Aug-2022",
        description = {"Vati Tools - a set of commands for Bio Informatics related data processing",
                       "Hit @|magenta <TAB>|@ to see available commands.",
                       "Hit @|magenta ALT-S|@ to toggle tailtips."},
        subcommands = {
                ImageProcessorTool.class,
        })
public class VatiTool {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new VatiTool()).execute(args);
        System.exit(exitCode);
    }
}
