# Framework de automatización de web
#####Autor: Emerson Espinoza Espino
Proyecto de automatización web

Ejecución de pruebas
---
    mvn clean verify -Dtags="@Prueba"
---

Si se usa el archivo de configuracion serenity.conf, se debe utilizar la propiedad de ambiente -Denvironment={ambiente}

```bash
Reemplazar xxxx por el nombre del ambiente(objecto) configurado en el archivo serenity.conf

mvn clean verify -Dtags="@Prueba" -Denvironment=dev
```

```
environments{
    dev {
       url = "https://parabank.parasoft.com/parabank/index.htm"
    }
}
```

Si se desea reimportar las dependencias ejecutar el siguiente comando:
    
    * $mvn intall -DskipTests
    