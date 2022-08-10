pipeline {
    agent (map.agent == null ? "any" : "${map.agent}") {
        stages {
        stage ('maven install'){
            steps {
                withMaven(maven:'maven3') {
                  sh 'mvn clean install'
                }
              }
            }
        }
    }
}
