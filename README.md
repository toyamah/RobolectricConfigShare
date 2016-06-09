# RobolectricConfigShare

Robolectricの`@Config`の設定を共通化させる方法

#### ファイルに切り出す 
[robolectric.properties](http://robolectric.org/configuring/)というファイルを設置する。

* [Robolectric3.0の例](https://github.com/egugue/RobolectricConfigShare/tree/ver3.0/file/src/test/resources)
* [Robolectric3.1の例](https://github.com/egugue/RobolectricConfigShare/tree/ver3.1/file/src/test/resources)

#### テストランナーを作成する
`RobolectricGradleTestRunner`を継承したクラスで、`@Config`を共通化させる。

* [Robolectric3.0の例](https://github.com/egugue/RobolectricConfigShare/blob/ver3.0/runner/src/test/java/com/htoyama/robolectricconfigshare/RobolectricCustomRunner.java)
* [Robolectric3.1の例](https://github.com/egugue/RobolectricConfigShare/blob/ver3.1/runner/src/test/java/com/htoyama/robolectricconfigshare/RobolectricCustomRunner.java)

※ Robolectric.Implementationの引数に変更があります

----
#### 資料
* [Speacker Deck](https://speakerdeck.com/egugue/robolectricfalse-at-configwogong-tong-hua-surufang-fa)
