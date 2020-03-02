# Makefile for Assignment One
SRC_DIR = ./src
BIN_DIR = ./bin
DOC_DIR = ./doc

JAVAC = javac
JFLAGS = -g -d $(BIN_DIR) -cp $(BIN_DIR)

vpath %.java $(SRC_DIR)
vpath %.class $(BIN_DIR)

# General build rule for java sources
.SUFFIXES:  .java  .class

.java.class:
	$(JAVAC)  $(JFLAGS)  $<

#$< expands to a matching source file
#default rule - will be invoked by make

ClASSES:LSInfoItem.class \
	LSArray.class \
	LSArrayApp.class \
	BinaryTreeNode.class \
	BTQueueNode.class \
	BTQueue.class \
	BinaryTree.class \
	LSBSTApp.class 


clean:
	@rm -f  $(BIN_DIR)/*.class

docs:
	javadoc  -classpath ${BIN_DIR} -d ${DOC_DIR} ${SRC_DIR}/*.java

cleandocs:
	rm -rf ${DOC_DIR}/*

