SRC = $(wildcard src/*.java)
TESTS = $(wildcard test/*.java)
ALLSRC = $(SRC) $(TESTS)
CLASSPATH = lib/junit-4.8.1.jar:src/:test
CLASSES = $(ALLSRC:.java=.class)
JAVA = /local/solaris86/apps/jdk1.6.0/bin/java
JAVAC = /local/solaris86/apps/jdk1.6.0/bin/javac
#JAVA = java
#JAVAC = javac

.SUFFIXES: .java .class 

.java.class:
	$(JAVAC) -classpath $(CLASSPATH) $<

default: $(CLASSES)

test: $(CLASSES)
	$(JAVA) -classpath $(CLASSPATH) org.junit.runner.JUnitCore SimpleTest

clean:
	rm -f src/*.class
	rm -f test/*.class
