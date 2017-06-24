package br.com.cit.logistics_center.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by neto on 23/06/17.
 */

/**
 * not found object exception.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class GenericNotFoundException extends RuntimeException {

    /**
     * Create a custom message to exception.
     *
     * @param id Long - Id of object persisted.
     * @param typeClass Class - Id entity persisted.
     */
    public GenericNotFoundException(Long id, Class<?> typeClass) {
        super("Not found id: " + id + " referenced a class " + typeClass.getName());
    }
}
