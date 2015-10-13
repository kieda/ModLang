#!/bin/bash
dest="src/edu/cmu/cs/zkieda/modlang"
java -jar ./java-cup/java-cup-11b.jar -destdir $dest -parser Parser src/lang/ModuleParser.cup
java -jar ./jflex/jflex-1.6.1.jar -d $dest src/lang/ModuleLexer.jflex
