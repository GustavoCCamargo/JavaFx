#!/bin/bash

JAVA_FX_LIB="/home/aluno/Downloads/JavaFX/lib"

# Compilar ambos os arquivos
javac --module-path "$JAVA_FX_LIB" --add-modules javafx.controls -d out src/*.java


# Rodar a aplicação
java --module-path "$JAVA_FX_LIB" --add-modules javafx.controls -cp out Main
