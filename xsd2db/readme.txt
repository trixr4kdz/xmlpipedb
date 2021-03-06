Last updated:  05 / 28 / 2006

What is XSD2DB?
XSD2DB is a program for converting an XML Schema Definition (XSD) or Document Type Definition (DTD) into a database schema (SQL) file and a set of Hibernate mapping files and Java classes. The output includes a build.xml file, which will run under ANT to build a .jar file for you. Jar file allows you to access your database using Hibernate (http://www.hibernate.org/).

Other applications you may need: UniprotDb, GoDb, XMLPipeDb Utilities, GenMAPP Builder.

Features:
- takes XSD or DTD files
- outputs SQL schema file
- outputs all Hibernate .java files
- outputs all Hibernate mapping (.hbm) files
- outputs customized build.xml to compile all classes and generate a jar file 

Requirements:
ANT (http://ant.apache.org/) version 1.6.5 or better is required to build a .jar file, but the program will run without this.

Installation:
-- clean install --
Simply extract all files into a folder (e.g. xsd2db).
WARNING: DO NOT use folders with special characters in them, e.g. "!temp" will not work.

-- upgrade --
Delete all previous file / versions, then follow the instructions for a "clean install".


Running XSD2DB:
Windows:
xsd2db [--outputDirectory=dirname] [--bindings=filename] [[-updateXSD] --xsdURL=url] [-help]

Unix/Linux/OSX:
./xsd2db [--outputDirectory=dirname] [--bindings=filename] [[-updateXSD] --xsdURL=url] [-help]


--outputDirectory=dirname 
The directory when generating the source code and file; defaults to db-gen

--bindings=filename       
The binding file used when generating the data base source code and files for the time. Defaults to standard binding file supplied by XSD-To-DB

--xsdURL=url              
The URL of the XSD to convert. This must be a URL on the web. A file URL will not work.

--dtdSchema               
Enables support for DTDs

-updateXSD                
Replaces the XSD being used with the new version

-help  


Internationalization:
Although internationalization was thought of when writing this program, it has not yet been internationalized. If you would like to internationalize it, please join the project and have at it! 

Known Issues:
- Does not support file URLs.


Copyright Notice:
(c) Copyright 2006 Loyola Marymount University Computer Science Department.

License:
This program is covered under the Lesser GNU Public License. For details on this license, please refer to: http://www.gnu.org/licenses/lgpl.html

Credits:
We would like to thank Loyola Marymount University and both the Biology and Computer Science departments for making this program possible.

Numerous students have put their blood sweat and tears into bringing this to you. So, if this program is helpful, be kind to a student today. If not, then, well, you know what to do.

This application is brought to you by the letter A.


Version History:
1.03
Changes:
GrammarLoader now catches throwable. Error message indicates that "!" is not supported in folder names.
Changed name of readme from "README" TO "readme.txt".
Added "all" target to build.xml that does clean, then compile.
Changed build.xml to move readme.txt to the root of the dist folder.

1.02
Changes:
Added capability to customize the build.xml during copy to output folder.
- custom projectname depending on output folder

1.01
Changes:
Added capability to customize the build.xml during copy to output folder.
- custom jar file name depending on xsd or dtd file name

1.0
Changes:
Added support for DTD schemas
Hibernate mapping files are now generated
SQL DDL file is now also generated and called schema.sql

.9B
TODO:  currently the binding file is ignored and not used.
TODO:  HBM mapping files are placed in the src directory rather than the HBM 
directory
TODO:  Hibernates sql export is not run.

Documentation & Support:
The first-level of support is YOU. Read the User's and Developers Manual and this readme. After that, if something doesn't work or you just can't figure it out, second-level support can be obtained by going to http://sourceforge.net/projects/xmlpipedb/ and clicking on "support requests". We will try to help you as soon as possible. In the meantime (or even before submitting your request) check to see if someone else had the same problem -- maybe all the answers you need are already there! 
