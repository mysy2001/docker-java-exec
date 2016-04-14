FROM java

MAINTAINER mysy

RUN mkdir /opt/application
WORKDIR /opt/application
ADD run.sh run.sh
ADD docker-java-exec-jar-with-dependencies.jar dockerjob.jar
RUN chmod +x run.sh

CMD ["./run.sh"]
