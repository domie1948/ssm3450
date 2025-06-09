const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm7i245/",
            name: "ssm7i245",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm7i245/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中学课内小说阅读与学习系统"
        } 
    }
}
export default base
