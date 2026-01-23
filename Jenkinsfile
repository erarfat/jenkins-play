pipeline {
    agent any 

    stages{

        stage("build"){
            when {
                expression {
                    env.BRANCH_NAME == 'main'
                }
            }
            steps{
                echo "Jenkins in build Var "
            }
        }

        stage("test"){
            steps{
                echo 'Ready for test $BRANCH_NAME'
            }
        }

    }
}