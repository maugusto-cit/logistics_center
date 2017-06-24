package br.com.cit.logistics_center.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by neto on 23/06/17.
 */

/**
 * Already persisted object exception.
 */
@ResponseStatus(HttpStatus.CONFLICT)
public class GenericExistsRecordException extends RuntimeException {

    /**
     * Create a custom message to exception.
     *
     * @param id Long - Id of object persisted.
     * @param typeClass Class - Id entity persisted.
     */
    public GenericExistsRecordException(Long id, Class<?> typeClass) {
        super("id: " + id + " already exists in database, referenced a class " + typeClass.getName());
    }
}
