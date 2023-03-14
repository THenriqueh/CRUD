package br.com.erudio.foo.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = 1;

    private Date timestemp;
    private String message;
    private String status;

    public ExceptionResponse(Date timestemp, String message, String status) {
        this.timestemp = timestemp;
        this.message = message;
        this.status = status;
    }

    public Date getTimestemp() {
        return timestemp;
    }


    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}
