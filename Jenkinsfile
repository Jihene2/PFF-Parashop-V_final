pipeline {
    agent any
        tools {
        maven  "maven3"
    }
    stages {
        stage ('build'){
            steps{
                
                  bat 'mvn clean install'
                }
            }
        }
}

