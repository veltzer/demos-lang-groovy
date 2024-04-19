#!/usr/bin/groovy

def variableName = "PATH"
def variableValue = System.getenv(variableName)

if (variableValue != null) {
  println "Environment variable '${variableName}' is set to: ${variableValue}"
} else {
  println "Environment variable '${variableName}' is not set."
}
