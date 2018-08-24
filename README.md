

# LogcatDialog 
> 一款可以在手机中打开logcat控制台

- 方便快捷
- 支持内容搜索
- 支持自定义标题
- 支持根据tag筛选(类似Android studio的logcat规则)
- 支持根据log级别显示
- 支持是否显示time,是否显示tag(点击按钮即可切换)

## 如何引入

### Android Studio 引入

#### 第1步 将JitPack存储库添加到您的构建文件  
将其添加到存储库末尾的根build.gradle中：

       allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }

#### 第2步 添加依赖关系

        dependencies {
        	   compile 'com.github.hss01248:LogCatDialog:1.0.4'
        }


### Eclipse 引入
建议使用As，方便版本更新。

        dependencies {
               compile project(path: ':logcatdialog')
        }


## 如何使用

        //显示dialog
        LogcatDialogUtil.(Context context,String title)
                
        //清除dialog
        LogCatControl.getBuilder(this).clear();
        或者点击x按钮

## 效果图

### 首页写了几个功能测试用例，您可根据需求组合搭配使用。

![首页](http://blog.9aiplay.com/zb_users/upload/2018/06/20180622135955152964719564867.png)

##

### 默认方式打开

上方time关闭的效果,下方time打开的效果

![time](/pic/time.jpg)



上方tag关闭,下方tag显示的效果:

![tag](/pic/tag.jpg)

#

### 自定义标题方式打开

![自定义标题方式打开](http://blog.9aiplay.com/zb_users/upload/2018/06/20180622135958152964719853179.png)

##

### 自定义搜索内容方式打开

![自定义搜索内容方式打开](http://blog.9aiplay.com/zb_users/upload/2018/06/20180622140004152964720426154.png)

##

### 自定义目标TAG方式打开

![自定义目标TAG方式打开](http://blog.9aiplay.com/zb_users/upload/2018/06/20180622140001152964720177860.png)

##
### 自定义LOG级别方式打开

![自定义LOG级别方式打开](http://blog.9aiplay.com/zb_users/upload/2018/06/20180622140007152964720766879.png)



## 作者信息：

* [zhangyong](http://9aiplay.com)

