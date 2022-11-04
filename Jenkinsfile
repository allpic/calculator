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
publishHTML (target: [
reportDir: 'build/reports/jacoco/test/html',
reportFiles: 'index.html',
reportName: "JaCoCo Report"
])
sh "./gradlew jacocoTestCoverageVerification"
}
}
stage('MutationTesting') {
  steps {
    sh './gradlew pitest'
publishHTML (target: [
reportDir: 'build/reports/pitest/html',
reportFiles: 'index.html',
reportName: "Pitest Report"
]
   }
 }
          stage("Compile") {
            steps {
                sh "./gradlew compileJava"
        }
    }
  }
}

