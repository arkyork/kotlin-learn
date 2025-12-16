# Kotlin学習リポジトリ

このリポジトリは、[Google Kotlin公式ドキュメント](https://developer.android.com/courses/android-basics-compose/course?authuser=1&hl=ja)を参考にして、Kotlinの基礎から応用までを学習するためのサンプルコード集です。


### Dockerでセットアップ

#### コンテナの起動と実行
```bash
docker compose up -d
```

コンテナ内で:
```bash
cd helloworld
kotlinc main.kt -d .
kotlin Main
```


## 開発環境

- **言語**: Kotlin 1.9.23
- **JDK**: Eclipse Temurin 17
- **エディタ**: Visual Studio Code
- **コンテナ**: Docker / Docker Compose

## 実行方法

### コンパイルと実行
```bash
cd <ディレクトリ名>
kotlinc main.kt -d .
kotlin Main
```

または、VS Code タスクを使用:
```
Ctrl+Shift+B
```
