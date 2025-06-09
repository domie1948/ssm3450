import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import zuoyepigaixinxi from '@/views/modules/zuoyepigaixinxi/list'
    import laoshi from '@/views/modules/laoshi/list'
    import storeup from '@/views/modules/storeup/list'
    import zuoye from '@/views/modules/zuoye/list'
    import zuoyewanchengxinxi from '@/views/modules/zuoyewanchengxinxi/list'
    import messages from '@/views/modules/messages/list'
    import banji from '@/views/modules/banji/list'
    import xiaoshuo from '@/views/modules/xiaoshuo/list'
    import config from '@/views/modules/config/list'
    import discussxiaoshuo from '@/views/modules/discussxiaoshuo/list'
    import xiaoshuoleixing from '@/views/modules/xiaoshuoleixing/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '小说资讯',
        component: news
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/zuoyepigaixinxi',
        name: '作业批改信息',
        component: zuoyepigaixinxi
      }
      ,{
	path: '/laoshi',
        name: '老师',
        component: laoshi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/zuoye',
        name: '作业',
        component: zuoye
      }
      ,{
	path: '/zuoyewanchengxinxi',
        name: '作业完成信息',
        component: zuoyewanchengxinxi
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/banji',
        name: '班级',
        component: banji
      }
      ,{
	path: '/xiaoshuo',
        name: '小说',
        component: xiaoshuo
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussxiaoshuo',
        name: '小说评论',
        component: discussxiaoshuo
      }
      ,{
	path: '/xiaoshuoleixing',
        name: '小说类型',
        component: xiaoshuoleixing
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
