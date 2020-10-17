package com.digitalinnovationone.personapi.dto.response;

import java.util.Objects;

public class MessageResponseDTO {

    private String message;

    public MessageResponseDTO() {

    }

    public MessageResponseDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageResponseDTO that = (MessageResponseDTO) o;
        return message.equals(that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
