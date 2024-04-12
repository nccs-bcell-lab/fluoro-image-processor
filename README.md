## About
A tool to process images and count contrast points of interest

## Running the tool
### Unzip the downloaded artifact and go to the `bin` directory
% cd bin

### You may have to make the script executable in Unix environment (If you are on Windows, you can skip this step)
chmod +x vati

### Start the Tool Terminal
% ./vati     # For Unix/Mac OS

% .\vati.bat # For Windows

### Now, you can execute available tools, for example:
```
% .\vati.bat -h

Usage: vati [-hV] [COMMAND]
Vati Tools - a set of commands for Bio Informatics related data processing
Hit <TAB> to see available commands.
Hit ALT-S to toggle tailtips.
  -h, --help      Show this help message and exit.
  -V, --version   Print version information and exit.
Commands:
  IMAGE_PROCESSOR  Image processor to highlight and count high contrast points

% .\vati.bat IMAGE_PROCESSOR -h
Usage: vati IMAGE_PROCESSOR [-hV] --input-dir=<inputDir>
                            --output-dir=<outputDir>
Image processor to highlight and count high contrast points
  -h, --help      Show this help message and exit.
      --input-dir=<inputDir>
                  Directory with input files
      --output-dir=<outputDir>
                  Directory where output files should be saved
  -V, --version   Print version information and exit.
```

## Available Tools
### Image Processor
```
Image processor to highlight and count high contrast points
      --input-dir=<inputDir>
                  Directory with input files
      --output-dir=<outputDir>
                  Directory where output files should be saved
```
```
IMAGE_PROCESSOR --input-dir="<input dir path>" --output-dir="<output dir path>"
```
