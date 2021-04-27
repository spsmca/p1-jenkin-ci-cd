pipeline { 
    agent any  
    tools {
        maven "maven-3.6.2"
    }
   
    stages { 
        stage('Build') { 
            steps { 
                    bat 'mvn clean compile'
                    echo 'This is build stage in pipeline....' 
            }
        }
        
       stage('Test') { 
            steps { 
                bat 'mvn test'
                echo 'This is Test stage in pipeline....' 
            }
        }
        
        stage('Deploy') { 
            steps { 
                bat 'mvn install'
                echo 'This is Deploy stage in pipeline....' 
            }
        }
    }
}




