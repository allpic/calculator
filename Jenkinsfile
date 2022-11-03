pipeline {
    agent any
        stages {
        stage("Unit test") {
           steps {
                sh "./gradlew test"
        }
    }
stage("Code coverage") {
steps {
sh "./gradlew jacocoTestReport"
sh "./gradlew jacocoTestCoverageVerification"
}
}
          stage("Compile") {
            steps {
                sh "./gradlew compileJava"
        }
    }
  }
}

