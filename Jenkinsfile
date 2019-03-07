#!/usr/bin/env groovy
pipeline{
    agent any

    //Define stages for the build process
    stages{
        //Define the deploy stage
        stage('Deploy'){
            steps{
                script{
                    docker.withRegistry('https://gt-build.hdap.gatech.edu') {
                        //Build and push the database image
                        def pacerIndexImage = docker.build("pacerindex:${env.BUILD_NUMBER}", "-f ./Dockerfile .")
                        pacerIndexImage.push("${env.BUILD_NUMBER}")
                    }
                }
            }
        }

        //Define stage to notify rancher
        stage('Notify'){
            steps{
                script{
                    rancher confirm: true, credentialId: 'gt-rancher-server', endpoint: 'https://gt-rancher.hdap.gatech.edu/v2-beta', environmentId: '1a7', environments: '', image: 'gt-build.hdap.gatech.edu/pacerindex:${env.BUILD_NUMBER}', ports: '', service: 'GPHD/pacer-index-api', timeout: 60
                }
            }
        }
    }
}