package github.rafaelribeiro13.dslist.controllers.exceptions;

import java.time.LocalDateTime;

public class WebValidationStandardError extends WebStandardError {

    private String fiedlds;
    private String fieldsMessage;

    public WebValidationStandardError(LocalDateTime instant, Integer status, String error
            , String message, String fiedlds, String fieldsMessage) {
        super(instant, status, error, message);
        this.fiedlds = fiedlds;
        this.fieldsMessage = fieldsMessage;
    }

    public String getFiedlds() {
        return fiedlds;
    }

    public String getFieldsMessage() {
        return fieldsMessage;
    }

}
