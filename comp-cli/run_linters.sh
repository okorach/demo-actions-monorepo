#!/bin/bash

# This script runs pylint, bandit and flake8 to generate 3rd party linters issues

buildDir="build"

pylintReport="$buildDir/pylint-report.out"
flake8Report="$buildDir/flake8-report.out"

[ ! -d $buildDir ] && mkdir $buildDir

echo "Running pylint"
rm -f $pylintReport
pylint src test -r n > $pylintReport

echo "Running flake8"
rm -f $flake8Report
flake8 . > $flake8Report
