pipeline{
    agent any

        options {
        buildDiscarder(
            logRotator(
                numToKeepStr: '10',     // keep last 10 builds
                daysToKeepStr: '15'     // or 15 days
            )
        )
    }
    parameters{
        choice(name:'Version' , choices : ['1.1','1.2','1.3'], description: '')
        booleanParam(name:'Check' , defaultValue : true, description: '')
    }
    stages {

        stage("Build"){
            when{
                expression{
                    params.Check
                }
            }
            steps{
                echo "Build ss---"
                echo "===================="

            }
        }

        stage("test"){
            
            steps{
                echo "Test version --- ${params.Version}"
            }
            }
        }
    }
