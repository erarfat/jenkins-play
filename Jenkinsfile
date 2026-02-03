def gv
pipeline{
    agent any
    tools {
        maven "Maveen 3.9.2"
    }
    stages{
        stage("init-script"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage("Build-jar"){
            steps{
                script{
                    gv.BuildJar()
                }
            }
        }

        stage("Test"){
            steps{
                script{
                    gv.Test()
                }
            }
        }

        stage("Repo push"){
            steps{
                script{
                    withCredentials([usernamePassword(credentialsId: "nexus", passwordVariable: "PASS", usernameVariable: "USER")]){
                        gv.Push()
                    }
                }
            }
        }
    }
}