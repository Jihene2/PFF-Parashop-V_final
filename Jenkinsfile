pipeline {
    agent any
        stage ('maven'){
            steps{
                withMaven(maven:'maven3'){
                  sh 'mvn clean install'
                }
            }
        }
    
}

