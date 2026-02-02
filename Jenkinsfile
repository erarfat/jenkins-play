def gv
pipeline{
    agent any

        options {
        buildDiscarder(
            logRotator(
                numToKeepStr: '10',     // keep last 10 builds
                daysToKeepStr: '1'     // or 15 days
            )
        )
    }
    parameters{
        choice(name:'Version' , choices : ['1.1','1.2','1.3'], description: '')
        booleanParam(name:'Check' , defaultValue : true, description: '')
    }
    stages {

        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }

        stage("Build"){

            steps{
                script {
                    gv.build()
                }
            }
        }

        stage("test"){
            
            steps{
               script {
                gv.test()
               }
            }
            }
        }
    }
