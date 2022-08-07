pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'ssh root@192.168.0.51  "zap.sh -daemon -quickurl https://www.qafqazinfo.az/  -quickout /opt/OWSPZP/nahid.rp"'
            }
        }
    }
}
