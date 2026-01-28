pipeline{
    agent any
    environment{
        version="1.21"
    }
    stages {

        stage("Build"){
            steps{
                echo "Build ss---"
                echo "Build ${version}"
            }
        }

        stage("test"){
            steps{
                echo "Test ${version}"
            }
        }
    }
}