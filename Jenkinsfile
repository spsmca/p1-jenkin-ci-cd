pipeline { 
    agent any  

    stages { 
        stage('Build') { 
            steps { 
                   echo 'This is build stage in pipeline....' 
                    bat 'mvn clean compile'
                    
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




