pipeline{
    agent any
    environment{
        version="1.21"
        //server = credentials('lala')
    }
    stages {

        stage("Build"){
            steps{
                echo "Build ss---"
                echo "Build ${version}"
                echo "===================="
            }
        }

        stage("test"){
            
            steps{
                echo "Test ${version}"

                withCredentials([usernamePassword(credentialsId: 'lala' , usernameVariable: 'USER' , passwordVariable: 'PWD')]){
                echo "test ${USER}"
            }
            }
        }
    }
}