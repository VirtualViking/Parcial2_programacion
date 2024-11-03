package cue.edu.co.hijosdelaanarquia.exceptions;

import cue.edu.co.hijosdelaanarquia.models.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalAdviceController {
  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
    Map<String, String> errors = new HashMap<>();

    ex.getBindingResult().getFieldErrors().forEach(error -> {
      String fieldName = error.getField();
      String errorMessage = error.getDefaultMessage();
      errors.put(fieldName, errorMessage);
    });

    return ResponseEntity
            .badRequest()
            .body(errors);
  }
  @ExceptionHandler(SerieException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ResponseEntity<ErrorResponse> handleSerieException(SerieException ex) {
    return ResponseEntity.badRequest().body(
            new ErrorResponse(
                    ex.getMessage(),
                    HttpStatus.BAD_REQUEST
            )
    );
  }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException ex) {
      return new ResponseEntity<>(
              new ErrorResponse(
                      ex.getMessage(),
                      HttpStatus.NOT_FOUND
              ),
              HttpStatus.NOT_FOUND
      );
    }
}
