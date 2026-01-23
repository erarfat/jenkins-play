pipeline {
    agent any 

    stages{

        stage("build"){
            when {
                expression {
                    env.BRANCH_NAME == null
                }
            }
            steps{
                echo "Jenkins in build Var "
            }
        }

        stage("test"){
            steps{
                echo "Ready for test ${env.BRANCH_NAME}"
            }
        }

    }
}