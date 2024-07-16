#!/bin/bash

gradle jacocoTestReport sonarqube $*

exit $?
