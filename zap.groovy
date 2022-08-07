pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
<<<<<<< HEAD
                sh 'ssh root@192.168.0.51  "zap.sh -daemon -quickurl https://www.qafqazinfo.az/  -quickout /opt/OWSPZP/nahid.rp"'
=======
                sh 'ssh root@192.168.0.51 -pw "Xelisa#29" -m "zap.sh -daemon -quickurl https://www.qafqazinfo.az/  -quickout /opt/OWSPZP/nahid.rp"'
>>>>>>> cb6b612ab0d6a2271bf9083bfda44efd63a61695
            }
        }
    }
}
