
var projectName = '中学课内小说阅读与学习系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '小说',
	url: './pages/xiaoshuo/list.html'
}, 

{
	name: '小说资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm7i245/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"老师","menuJump":"列表","tableName":"laoshi"}],"menu":"老师管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"小说","menuJump":"列表","tableName":"xiaoshuo"}],"menu":"小说管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"小说类型","menuJump":"列表","tableName":"xiaoshuoleixing"}],"menu":"小说类型管理"},{"child":[{"buttons":["查看","删除"],"menu":"作业","menuJump":"列表","tableName":"zuoye"}],"menu":"作业管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班级","menuJump":"列表","tableName":"banji"}],"menu":"班级管理"},{"child":[{"buttons":["查看","删除"],"menu":"作业完成信息","menuJump":"列表","tableName":"zuoyewanchengxinxi"}],"menu":"作业完成信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"作业批改信息","menuJump":"列表","tableName":"zuoyepigaixinxi"}],"menu":"作业批改信息管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"小说资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"小说列表","menuJump":"列表","tableName":"xiaoshuo"}],"menu":"小说模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"小说","menuJump":"列表","tableName":"xiaoshuo"}],"menu":"小说管理"},{"child":[{"buttons":["完成作业","查看"],"menu":"作业","menuJump":"列表","tableName":"zuoye"}],"menu":"作业管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业完成信息","menuJump":"列表","tableName":"zuoyewanchengxinxi"}],"menu":"作业完成信息管理"},{"child":[{"buttons":["查看","删除","订正"],"menu":"作业批改信息","menuJump":"列表","tableName":"zuoyepigaixinxi"}],"menu":"作业批改信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"小说列表","menuJump":"列表","tableName":"xiaoshuo"}],"menu":"小说模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论","作业发布"],"menu":"小说","menuJump":"列表","tableName":"xiaoshuo"}],"menu":"小说管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业","menuJump":"列表","tableName":"zuoye"}],"menu":"作业管理"},{"child":[{"buttons":["查看","作业批改","审核"],"menu":"作业完成信息","menuJump":"列表","tableName":"zuoyewanchengxinxi"}],"menu":"作业完成信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"作业批改信息","menuJump":"列表","tableName":"zuoyepigaixinxi"}],"menu":"作业批改信息管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"小说列表","menuJump":"列表","tableName":"xiaoshuo"}],"menu":"小说模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"老师","tableName":"laoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
