pipeline {
    agent any
        tools {
        maven  "maven3"
    }
    stages {
        stage ('build'){
            steps{
                  bat 'mvn -Dmaven.test.falure.ignore=true clean package'
                }
            }
        }
}

