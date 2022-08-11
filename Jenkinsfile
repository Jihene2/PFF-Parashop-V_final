pipeline {
    agent any
        tools {
        maven  "maven3"
    }
    stages {
        stage ('build'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'MyGitHub', url: 'https://github.com/Jihene2/PFF-Parashop-V_final.git']]])
                bat 'mvn install'  
                bat 'mvn test'
                }
            }
        }
}

