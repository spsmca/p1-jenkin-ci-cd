pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
                withMaven( maven: 'maven-3.6.2') {
                    sh 'mvn clean install'
                } 
            }
        }
        
        stage('Deploy') { 
            steps { 
                echo 'This is a Deploy stage in pipeline....' 
            }
        }
    }
}




