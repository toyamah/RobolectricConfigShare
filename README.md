# RobolectricConfigShare

Robolectricの`@Config`の設定を共通化させる方法

#### ファイルに切り出す 
[robolectric.properties](http://robolectric.org/configuring/)というファイルを設置する。

https://github.com/egugue/RobolectricConfigShare/tree/master/file/src/test/resources

#### テストランナーを作成する
`RobolectricGradleRunner`を継承したクラスで、`@Config`を共通化させる。

[RobolectricCustomRunner.java](https://github.com/egugue/RobolectricConfigShare/blob/master/runner/src/test/java/com/htoyama/robolectricconfigshare/RobolectricCustomRunner.java)
