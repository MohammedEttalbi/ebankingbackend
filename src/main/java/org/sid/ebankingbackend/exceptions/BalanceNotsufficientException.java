package org.sid.ebankingbackend.exceptions;

public class BalanceNotsufficientException extends Exception {
    public BalanceNotsufficientException(String message) {
        super(message);
    }
}
