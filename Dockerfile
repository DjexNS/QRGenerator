FROM		ubuntu:14.04

MAINTAINER	Dejan Djekic <dejan.djekic@gmail.com>

RUN apt-get update
RUN apt-get install -y nginx zip curl

RUN echo "daemon off;" >> /etc/nginx/nginx.conf
RUN curl -o /usr/share/nginx/www/master.zip -L https://github.com/DjexNS/QRGenerator/zip/master
RUN cd /usr/share/nginx/www/ && unzip master.zip && mv QRGenerator-master/* . && rm -rf QRGenerator-master master.zip

EXPOSE 9000 9999

CMD ["/usr/sbin/nginx", "-c", "/etc/nginx/nginx.conf"]

