package github.rafaelribeiro13.dslist.controllers.handler;

import github.rafaelribeiro13.dslist.controllers.exceptions.WebStandardError;
import github.rafaelribeiro13.dslist.services.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class WebControllerAdivice {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<WebStandardError> handlerResourceNotFoundException(ResourceNotFoundException ex) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        String error = "Resource not found";

        var standardError = new WebStandardError(LocalDateTime.now()
                , status.value(), error, ex.getMessage());

        return ResponseEntity.status(status).body(standardError);
    }

}
