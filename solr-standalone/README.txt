To run the application
-----------------------------
1:Change the following value in /profiles/dev/config.properties to point the correct path of the downloaded solr4.8.0
solr.solr.home=<path to the extracted solr folder>/example/priX

2:cd to the project directory and execute the following maven commands
mvn eclipse:eclipse
mvn clean install
mvn jetty:run