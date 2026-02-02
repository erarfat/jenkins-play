pipeline{
    agent any
    tools {
        maven "Maveen 3.9.2"
    }
    stages{
        stage("Build-jar"){
            steps{
                script{
                    echo "Building Jar"
                    sh 'mvn package'
                }
            }
        }
    }
}