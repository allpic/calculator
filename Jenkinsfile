pipeline {
    agent any
        stages {
        stage("Unit test") {
           steps {
                sh "./gradlew test"
        }
    }
          stage("Compile") {
            steps {
                sh "./gradlew compileJava"
        }
    }
  }
}

