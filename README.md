##Android自定义方向监听
####完成对四个方向的监听，解决sensor旋转不能完成监听的问题
####一丶集成功能
1.一行代码完成使用传感器对四个方向的监听
2.屏幕旋转
####二丶如何导入
1.Module下
```
dependencies {
    //...
    compile 'com.github.shuhaoSCode:GravitySensor:1.0.1'
}
```
2.Project下(对照下都有没有 没有加上就好啦)
```
allprojects {
    repositories {
        //...
        maven { url 'https://jitpack.io' }
    }
}
```
####三丶如何使用
```
//setlsAutoRotate() 设置是否旋转
//gravitySensorListener提供四个回调分别是横屏，反向横屏（按键在左边），竖屏，反向竖屏（按键在上）
GravitySensorManager.getInstance(this).setIsAutoRotate(false).setGravitySensorListener(new GravitySensorManager.GravitySensorListener() {
            @Override
            public void onLandscape() {
            }

            @Override
            public void onFlipLandscape() {
            }

            @Override
            public void onPortpait() {
            }

            @Override
            public void onFlipPortpait() {
            }
        });
```
