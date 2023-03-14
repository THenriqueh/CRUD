package br.com.erudio.foo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMethodOperationExcption extends RuntimeException{

    public UnsuportedMethodOperationExcption (String exception){
        super(exception);
    }
}
