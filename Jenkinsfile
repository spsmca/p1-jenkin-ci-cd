pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
                withMaven( maven: 'maven-3.6.2') {
                    sh 'mvn clean compile'
                    echo 'This is build stage in pipeline....' 
                } 
            }
        }
        
       stage('Test') { 
            steps { 
                sh 'mvn test'
                echo 'This is Test stage in pipeline....' 
            }
        }
        
        stage('Deploy') { 
            steps { 
                sh 'mvn install'
                echo 'This is Deploy stage in pipeline....' 
            }
        }
    }
}




