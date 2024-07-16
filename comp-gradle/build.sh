#!/bin/bash

gradle build jacocoTestReport sonar $*

exit $?
