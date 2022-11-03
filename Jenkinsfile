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
        stage("Checkout") {
            steps {
                git url: 'https://github.com/allpic/calculator.git',
                branch: 'main'
        }
    }
  }
}

