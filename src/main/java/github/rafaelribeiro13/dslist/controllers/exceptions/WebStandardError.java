package github.rafaelribeiro13.dslist.controllers.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class WebStandardError {

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
        LocalDateTime instant;
        Integer status;
        String error;
        String message;

        public WebStandardError() {
        }

        public WebStandardError(LocalDateTime instant, Integer status, String error, String message) {
                this.instant = instant;
                this.status = status;
                this.error = error;
                this.message = message;
        }

        public LocalDateTime getInstant() {
                return instant;
        }

        public Integer getStatus() {
                return status;
        }

        public String getError() {
                return error;
        }

        public String getMessage() {
                return message;
        }
        
}
