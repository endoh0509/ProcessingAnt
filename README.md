# ProcessingAnt

## Overview

Ant template for [Processing](https://processing.org/)

## Why Ant?

Many documents for using Processing with Eclipse, IntelliJ, and other IDEs are posted.
However, they are not common to each IDEs.
Using Ant can develop with many IDEs.

## Usage

### 1. Download Repository

```
$ git clone git@github.com:endoh0509/ProcessingAnt.git
$ cd ProcessingAnt
```
### 2. Edit build.xml

```
...
<property name="p5core" location="path/to/core_dir"/>
<property name="p5dir" location="path/to/processing_dir"/>
...
```
Please write the path of the directory containing core.jar to p5core.
e.g.  
`/Applications/Processing.app/Contents/Java/core/library`  
Please write the path of your Processing Directory in p5dir.  
e.g.  
`/Users/USER_NAME/Documents/Processing`

### 3. Run Sketch

```
# Run Sketch!!
$ ant
```
