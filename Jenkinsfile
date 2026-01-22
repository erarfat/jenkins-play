pipeline {
    agent any 

    stages{

        stage("build"){
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