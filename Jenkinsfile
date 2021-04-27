pipeline { 
    agent any  
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven-3.6.2"
    }

    stages { 
        stage('Build') { 
            steps { 
                   echo 'This is build stage in pipeline....' 
                    bat 'mvn compile'
                    
            }
        }
        
       stage('Test') { 
            steps { 
                echo 'This is Test stage in pipeline....' 
                bat 'mvn test'
                
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




