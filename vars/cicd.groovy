def gitv(repo){
  git "https://github.com/Muthuvignesh25/${repo}"
}
def mavenv(){
  sh "mvn package"
}
def deployv(workspace,ip,contextpath){
  sh "scp /var/lib/jenkins/workspace/${workspace}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}
def testv(workspace){
  sh "java -jar /var/lib/jenkins/workspace/${workspace}/testing.jar"
}
