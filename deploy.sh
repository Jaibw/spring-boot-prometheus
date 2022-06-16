git clone https://github.com/Jaibw/spring-boot-prometheus.git
sudo apt update
sudo apt install -y default-jdk prometheus adduser libfontconfig1
wget https://dl.grafana.com/enterprise/release/grafana-enterprise_8.5.5_amd64.deb
sudo dpkg -i grafana-enterprise_8.5.5_amd64.deb
sudo service grafana-server start
sudo service grafana-server status 

nohup java -jar spring-boot-prometheus/monitor.jar  & 
sleep 120
curl localhost:5000
curl localhost:5000/actuator/prometheus


