FROM eclipse-temurin:17-jdk

# 必要なツールをインストール
RUN apt-get update && apt-get install -y \
    curl \
    unzip \
    && rm -rf /var/lib/apt/lists/*

# Kotlin compiler を入れる
RUN curl -L https://github.com/JetBrains/kotlin/releases/download/v1.9.23/kotlin-compiler-1.9.23.zip \
    -o kotlin.zip && \
    unzip kotlin.zip && \
    mv kotlinc /usr/local/kotlinc && \
    rm kotlin.zip

ENV PATH="/usr/local/kotlinc/bin:${PATH}"

WORKDIR /app
