module org.xmlobjects.classindex {
    requires java.compiler;

    exports org.atteo.classindex;
    exports org.atteo.classindex.processor;

    provides javax.annotation.processing.Processor with org.atteo.classindex.processor.ClassIndexProcessor;
}