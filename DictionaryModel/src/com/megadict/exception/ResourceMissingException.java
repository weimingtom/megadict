package com.megadict.exception;

import java.io.File;

public class ResourceMissingException extends RuntimeException {
    
    private static final long serialVersionUID = -6568658901793220837L;
    
    public ResourceMissingException(String resourceName) {
        super(makeMessage(resourceName));
    }
    
    public ResourceMissingException(File resouceFile) {
        super(makeMessage(resouceFile));
    }
    
    private static String makeMessage(Object resourceName) {
        return resourceName.toString() + " does not exist.";
    }
    
    public ResourceMissingException(File resourceName, Exception rootCause) {
        super(makeMessage(resourceName), rootCause);
    }    
}
