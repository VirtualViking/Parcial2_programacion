package cue.edu.co.hijosdelaanarquia.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ErrorResponse {
  private String message;
  private HttpStatus status;
}
