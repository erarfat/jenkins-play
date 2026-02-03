def gv

pipeline {
    agent any

    tools {
        maven "Maveen 3.9.2"
    }

    environment {
        VAULT_ADDR = "http://43.205.240.167:8200"
    }

    stages {

        stage("init-script") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }

        stage("Build-jar") {
            steps {
                script {
                    gv.BuildJar()
                }
            }
        }

        stage("Test") {
            steps {
                script {
                    gv.Test()
                }
            }
        }

        stage("Repo push (Vault)") {
            steps {
                script {

                    withVault(
                        vaultSecrets: [[
                            path: 'secret/data/nexus',
                            secretValues: [
                                [envVar: 'NEXUS_USER', vaultKey: 'username'],
                                [envVar: 'NEXUS_PASS', vaultKey: 'password']
                            ]
                        ]],
                        vaultCredentialId: 'vault-approle'
                    ) {

                        gv.Push(
                            env.NEXUS_USER,
                            env.NEXUS_PASS
                        )

                    }
                }
            }
        }
    }
}
