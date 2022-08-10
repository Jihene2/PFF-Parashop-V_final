pipeline {
    agent any
        stage ('build'){
            steps{
                withMaven(maven:'maven3'){
                  sh 'mvn clean install'
                }
            }
        }
    
}

