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
                sh "Build ${server}"
            }
        }

        stage("test"){
            
            steps{
                echo "Test ${version}"

                withCredentials([usernamePassword(credentials: 'lala' , usernameVariable: USER , passwordVariable: PWD)]){
                sh "test ${USER}"
            }
            }
        }
    }
}