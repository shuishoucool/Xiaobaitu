pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // 从 'main' 分支检出代码
                git branch: 'main', url: 'https://github.com/shuishoucool/Xiaobaitu.git'
            }
        }

        // 根据需要添加其他阶段
    }
}
