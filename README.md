# KmpConcept

### Pasos

#### Crear proyecto Android con Android Studio 4.

El proyecto debe tener las sgtes caracteristicas:

* Debe usar kotlin `1.3.72`
* Debe usar `'com.android.tools.build:gradle:4.0.0`
* Se debe tener corriendo java 14 en la mac.

	Para ver version de java, el comando
	
	`java -version`
	
	Comando para ver que version de java tienes en mac:
	
	`/usr/libexec/java_home -V`
	
	Si te aparecen mas de 1, debes seleccionar en este caso la version 14.
	
	```
	Matching Java Virtual Machines (3):
	    14.0.1, x86_64:     "Java SE 14.0.1"        /Library/Java/JavaVirtualMachines/jdk-14.0.1.jdk/Contents/Home
	    12.0.2, x86_64:     "Java SE 12.0.2"        /Library/Java/JavaVirtualMachines/jdk-12.0.2.jdk/Contents/Home
	    1.8.0_231, x86_64:  "Java SE 8"     /Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home
	```
	
	seguir estos pasos:
	
	- `sudo nano ~/.bash_profile`
	
	- poner contrasena
	
	- y luego podras editar el archivo `~/.bash_profile`. Cambiar version al numero que te sale en tu lista de javas. 
	
		export JAVA_HOME=`/usr/libexec/java_home -v 14.0.1`
		
		luego guardarmos.
		
	- Finalmente con este comando `source ~/.bash_profile` refrescamos el cambio en toda la maquina.

#### Anadir `Android Library` 	

- Ahora agregamos un modulo de tipo `Android Library` y le hacemos las sgtes modificaciones.

 - Configuramos las carpetas `src` para los modulos android, common y iOS.
 
 - Configuramos el gradle de la libreria android.

#### Anadir proyecto xcode 11.5	

- 	Creamos un project con `XCODE 11.5` y lo configuramos con los sgtes pasos.

	-  Primero agregamos nuestro `framework` en el target -> `General` -> `Frameworks, libraries and embedded context` -> Add file y buscamos en la carpera `{{project}}/common/build/bin/ios/releaseFramework/common.framework`.

	- Luego agregamos la carpeta de framework donde se encuentra la version debu y release en target -> `Build Settings` -> `Search Paths` -> `Framework Search path` y apuntamos a la carpeta `debugFramework ` y `releaseFramework `.
	
	-  Finalmente, agregamos el script para generar automaticamente el *.framework cada vez que corramos el iOS app en xcode en target -> `Build Phases` -> `Run script` 
	
	```
		cd "$SRCROOT/.."
	./gradlew :common:copyFramework -PXCODE_CONFIGURATION=${CONFIGURATION}
	```

	- Ahora ya se podria importar la libreria `common` y usar la clase `HelloWorldCommonKt.helloWorld()`

	
	
	
