pipeline {
    agent (map.agent == null ? "any" : "${map.agent}") {
        stage ('install'){
            steps {
                withMaven(maven:'maven3') {
                  sh 'mvn clean install'
                }
            }
        }
    }
}
