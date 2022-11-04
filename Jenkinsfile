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
stage('MutationTesting')
 {
  steps
   {
    sh 'mvn --batch-mode org.pitest:pitest-maven:mutationCoverage'
   }
 }
          stage("Compile") {
            steps {
                sh "./gradlew compileJava"
        }
    }
  }
}

