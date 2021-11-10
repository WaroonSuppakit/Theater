pipeline {
     agent { label 'master' }
     stages {
          stage('Source') {
               steps {
                    git branch: 'main',
                        url: 'https://github.com/WaroonSuppakit/Theater.git'
               }
          }
          stage('Build') {
               steps {
                    sh 'mvn package -DskipTests'
               }
          }
          stage('Test') {
               steps {
                    echo 'testing...'
                    //sh 'mvn test'
               }
          }
          stage('Deploy') {
               steps {
                    sh 'java -jar ./target/Theater-0.0.1-SNAPSHOT.jar'
               }
          }
     }
}
