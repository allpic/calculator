pipeline {
    agent any
triggers {
pollSCM('* * * * *')
}
        stages {
        stage("Unit test") {
           steps {
                sh "./gradlew test"
        }
    }
stage("Static code analysis") {
steps {
sh "./gradlew checkstyleMain"
publishHTML (target: [
reportDir: 'build/reports/checkstyle/',
reportFiles: 'main.html',
reportName: "Checkstyle Report"
])
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
reportDir: 'build/reports/pitest',
reportFiles: 'index.html',
reportName: "Pitest Report"
])
   }
 }
          stage("Compile") {
            steps {
                sh "./gradlew compileJava"
        }
    }
        stage('echo Cron working') {
            steps {
                echo 'Are you ok ?'
                echo 'Yes'
                echo 'Cron task is working !!!'
            }
        }
stage("Package") {
steps {
sh "./gradlew build"
}
}
stage("Docker build") {
steps {
sh "docker build -t localhost:443/xtasy/ubuntu_with_python ."
}
}
       stage('echo Docker working') {
            steps {
                echo 'is it ok ?'
                echo 'Yes'
                echo 'docker task is working !!!'
            }
        }
stage("Docker push") {
steps {
sh "docker push localhost:443/xtasy/ubuntu_with_python:1.1"
       stage('echo Docker push working') {
}
}
            steps {
                echo 'is it ok ?'
                echo 'Yes'
                echo 'docker push is working !!!'
            }
        }
  }
}
