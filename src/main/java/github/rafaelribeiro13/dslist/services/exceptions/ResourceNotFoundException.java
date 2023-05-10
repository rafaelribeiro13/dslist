package github.rafaelribeiro13.dslist.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Long id) {
        super("Resource not found: Id= " + id);
    }

}
