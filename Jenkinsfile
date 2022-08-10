pipeline {
    agent any{
        stage ('maven install'){
            steps{
                withMaven(maven:'maven3'){
                  sh 'mvn clean install'
                }
            }
        }
    }
}
