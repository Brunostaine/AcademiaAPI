package br.com.brunostaine.academia.exceptions;

public class CpfUniqueViolationException extends RuntimeException{
    public CpfUniqueViolationException(String message) {
        super(message);
    }
}
