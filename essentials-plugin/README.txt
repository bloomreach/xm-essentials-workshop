Essentials Plugin Feature
===============================
This project is a Essentials Plugin Feature. Add it as a dependency to the Essentials module of a CMS
project. After a (re)build, it will show up as a Feature in the Feature Library.

<dependency>
  <groupId>org.example</groupId>
  <artifactId>my-essentials-plugin</artifactId>
  <version>[MOST RECENT PLUGIN VERSION HERE]</version>
</dependency>


About this module
=================
This module has been generated using the Hippo Essentials Plugin archetype:

mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate \
  -DarchetypeRepository=https://maven.onehippo.com/maven2 \
  -DarchetypeGroupId=org.onehippo.cms7 \
  -DarchetypeArtifactId=hippo-essentials-plugin-archetype \
  -DarchetypeVersion=<essentials.version>

For ease of use, it has then been linked as a Maven module into this workshop demo project, and it was added to the
project's Essentials web application by adding the following dependency to the essentials/pom.xml:

  <dependency>
    <groupId>org.example</groupId>
    <artifactId>my-essentials-plugin</artifactId>
    <version>0.1.0-SNAPSHOT</version>
  </dependency>

How to develop this plugin
==========================
In order to make changes to the plugin available to your locally running Essentials, rebuild the plugin, rebuild
essentials and restart the project. In the parent directory, the following command takes care of all of this:

$ mvn clean verify && mvn -Pcargo.run -Drepo.path=storage

Start with documentation at https://documentation.bloomreach.com/library/essentials-plugins/overview.html