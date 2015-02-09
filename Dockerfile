FROM        ubuntu:14.04

MAINTAINER  Dejan Djekic <dejan.djekic@gmail.com>

ENV         ACTIVATOR_VERSION 1.2.12
ENV         DEBIAN_FRONTEND noninteractive

# INSTALL OS DEPENDENCIES
RUN         apt-get update; apt-get install -y software-properties-common unzip

# INSTALL JAVA 7
RUN         echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
            echo debconf shared/accepted-oracle-license-v1-1 seen true | debconf-set-selections && \
            add-apt-repository -y ppa:webupd8team/java && \
            apt-get update && \
            apt-get install -y oracle-java8-installer

# INSTALL TYPESAFE ACTIVATOR
RUN         cd /tmp && \
            wget http://downloads.typesafe.com/typesafe-activator/$ACTIVATOR_VERSION/typesafe-activator-$ACTIVATOR_VERSION.zip && \
            unzip typesafe-activator-$ACTIVATOR_VERSION.zip -d /usr/local && \
            mv /usr/local/activator-$ACTIVATOR_VERSION /usr/local/activator && \
            rm typesafe-activator-$ACTIVATOR_VERSION.zip

# COMMIT PROJECT FILES
ADD         app /QRGenerator/app
ADD         test /QRGenerator/test
ADD         conf /QRGenerator/conf
ADD         lib /QRGenerator/lib
ADD         public /QRGenerator/public
ADD         build.sbt /QRGenerator/
ADD         project/plugins.sbt /QRGenerator/project/
ADD         project/build.properties /QRGenerator/project/

# TEST AND BUILD THE PROJECT -- FAILURE WILL HALT IMAGE CREATION
#RUN         cd /root; /usr/local/activator/activator test stage
#RUN         rm /root/target/universal/stage/bin/*.bat

# TESTS PASSED -- CONFIGURE IMAGE
WORKDIR     /QRGenerator
ENTRYPOINT  target/universal/stage/bin/$(ls target/universal/stage/bin)
EXPOSE      9000
