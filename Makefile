srcD = src
binD = bin
docD = doc

JF = src/Tester.java

JFLAGS = -g -d $(binD) -cp $(binD)
JC = javac

vpath %.java $(srcD)
vpath %.class $(binD)

.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $<


all: Tester.class doc

.PHONY: doc

doc: 
	@javadoc -d docD $(JF)

cleandoc: 
	@rm -rf $(docD)
	@mkdir $(docD)

clean:
	@rm -f  $(binD)/*.class

run:
	@java -cp bin Tester 