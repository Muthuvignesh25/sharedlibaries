def git(repo){
  git 'https://github.com/intelliqittrainings/${repo}'
}
def maven(){
  sh 'mvn package'
}
def deploy(workspace,ip,contextpath){
  sh 'scp /var/lib/jenkins/workspace/{workspace}/webapp/target/webapp.war ubuntu@{ip}:/var/lib/tomcat9/webapps/{contextpath}.war'
}
def test(workspace){
  sh 'java -jar /var/lib/jenkins/workspace/{workspace}/testing.jar'
}
