pipeline { 
   agent any  
   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "maven-3.6.2"
   }

   stages { 
      stage('Clean') { 
         steps { 
             echo 'Hey Philip..This is Clean stage in pipeline....' 
             bat 'mvn clean'
         }
      }
      stage('Compile') { 
         steps { 
             echo 'Hey Philip..This is Compile stage in pipeline....' 
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
             echo 'This is Deploy stage in pipeline....' 
             bat 'mvn install'
         }
      }
   }
}




