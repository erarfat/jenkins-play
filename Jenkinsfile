pipeline{
    agent any
    environment{
        version="1.21"
        server = credentials('lala')
    }
    stages {

        stage("Build"){
            steps{
                echo "Build ss---"
                echo "Build ${version}"
                echo "===================="
                echo "Build ${server}"
            }
        }

        stage("test"){
            steps{
                echo "Test ${version}"
            }
        }
    }
}