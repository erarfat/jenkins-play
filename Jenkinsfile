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
        
        stage("Deploy"){
            // input {
            //     message "Enter To which ENV to Deploy "      // note that it is message "" not message: ""
            //     ok "Done"
            //     parameters{
            //         choice(name: "ENV",choices:["Dev","Stage","Prob"], description: "")
            //         choice(name: "Ver",choices:["v0.1","v0.2","v0.3"], description: ""  )
            //     }
            
            steps{
                script{
                    env.ENV=input message: "To Deploy in ", ok "Done", parameters: [choice(name: "ENV",choices:["Dev","Stage","Prob"], description: "")]
                }
                echo "Deploying to Env ${ENV}}"
            }
        }

        }
    }
