# Mutantes - Mercado Libre

## Problemática.
 Basados en una secuencia de ADN se quiere conocer si un humano es mutante.
 
## Desarrollo
Para el desarrollo de la aplicación se utilizo. 

- Lenguaje de desarrollo: JAVA Versión 1.8
- Motor de Base de datos: MYSQL
- Construcción del API: SpringBoot
- Publicación de API: Google App Engine



 ## Implementación
 Las url de las API creadas son:
 
 1. Validación del ADN: Este método nos permite identificar si el ADN suministrado es pertenece a un humano mutante. 
    * Método: POST.
    * URL local: http://localhost:8090/mutant/
    * URL: https://deida-gcloud-mutant.uc.r.appspot.com/mutant/
    * Request: 
    {
     "dna":["ATGCGA","CAGTCC", "TTATGT","AGAAAG","CGTCTA","TCACTG"]
    }
    
    * Responde: 200 OK - Respuesta para el ADN Mutante.
              403 FORBIDDEN - Respuesta para el ADN Humano
    
 2. Estadisticas: Este método nos indica cuantos de las peticiones realizadas han sido ADN de mutantes y cuantos humanos. 
    * Método: GET
    * Url local: http://localhost:8090/stats/
    * Url: https://deida-gcloud-mutant.uc.r.appspot.com/stats/
    * Request:
    * Response:
      {
       "count_mutant_dna": 6,
       "count_human_dna": 1,
       "ratio": 6.0
      }
 
 
 #### Desarrollado por: Deisy Martinez Ruiz ####
