###一、关于搭建的流程

1. 创建仓库 A；
2. 创建两个分支：master 与 hexo，hexo分支用来存放网站的原始文件，master分支用来存放生成的静态网页
3. 设置hexo为默认分支（因为我们只需要手动管理这个分支上的Hexo网站文件）；
4. 使用git clone  拷贝A仓库；
5. 在本地A克隆文件夹下依次执行npm install hexo、hexo init、npm install 和 npm install hexo-d（此时当前分支应显示为hexo）;
6. 修改_config.yml中的deploy参数，分支应为master；
7. 依次执行git add .、git commit -m "..."、git push origin hexo提交网站相关的文件；
8. 执行hexo g -d生成网站并部署到GitHub上。

###二、关于日常的改动流程
在本地对博客进行修改（添加新博文、修改样式等等）后，通过下面的流程进行管理。
1. 依次执行git add .、git commit -m "..."、git push origin hexo指令将改动推送到GitHub（此时当前分支应为hexo）；
2. 然后才执行hexo g -d发布网站到master分支上。

###三、本地资料丢失后的流程
当重装电脑之后，或者想在其他电脑上修改博客，可以使用下列步骤：
1. 使用git clone 拷贝A仓库（默认分支为hexo）；
2. 在本地新拷贝的文件夹下通过Git bash依次执行下列指令：npm install hexo、npm install、npm install hexo-d（不需要hexo init这条指令）。

###四、常用命令
npm install hexo -g #安装  
npm update hexo -g #升级  
hexo init #初始化
hexo list <type>      #  列出网站资料
hexo --debug   #调试模式，调试信息输出到debug.log中
hexo --save   #安全模式， 不载入插件和脚本
hexo --silent   #简洁模式，隐藏终端信息
hexo --config custom.yml   #自定义使用的配置文件
####简写
hexo n "我的博客" == hexo new "我的博客" #新建文章
hexo p == hexo publish
hexo g == hexo generate#生成
hexo s == hexo server #启动服务预览
hexo d == hexo deploy#部署
####服务器
hexo server #Hexo 会监视文件变动并自动更新，您无须重启服务器。
hexo server -s #静态模式
hexo server -p 5000 #更改端口
hexo server -i 192.168.1.1 #自定义 IP
hexo clean #清除缓存 网页正常情况下可以忽略此条命令
hexo g #生成静态页面至public目录
hexo d #开始部署
hexo d -g #生成并部署
####草稿
hexo new draft "文章名" #生成草稿
hexo --draft # 显示草稿箱中的文章
hexo publish [layout] <title> // 发布
####新建
hexo new page "pageName" #新建页面
hexo new [layout] <title>#新建文章 默认post 布局
####设置文章摘要
以上是文章摘要 <!--more--> 以下是余下全文 

