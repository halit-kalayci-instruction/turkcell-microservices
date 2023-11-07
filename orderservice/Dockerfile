#docker image'ını configure et
#sıfır kurulumu olan bir linux makinaya bu uygulamayı kurmak

#alias => takma ad
# java kurmak
FROM openjdk:17-slim as build

# build dosyalarını kopyalamak
#COPY LOCAL_YOL                              CLOUD_YOLU
COPY  target/orderservice-0.0.1-SNAPSHOT.jar orderservice-0.0.1-SNAPSHOT.jar

# build dosyalarını ayağa kaldırmak
#java -jar orderservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "orderservice-0.0.1-SNAPSHOT.jar"]

# 7:20

# dockerfile -> image -> container(s)