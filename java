Para configurar jvm:

	- Criar um ficheiro jmxremote.password com permissões de R
	- Setenvh.sh
		○ -Dcom.sun.management.jmxremote=true -Dcom.sun.management.jmxremote.port=64001 -Dcom.sun.management.jmxr                                                                                                                                                       emote.password.file=/root/jmxremote.password -Dcom.sun.management.jmxremote.ssl=false"
	- Instala jdk no pc e aceder
		○ Ip:64001
		○ Credenciais

Para diagnosticar o JAVA, sugere-se o uso dos seguintes comandos:

Ps -ef | grep java

Jmap -heap PID
Jmap -histo PID
Jmap -histo:live PID
Jmap -dump PID
Jstack PID
Jinfo PID

