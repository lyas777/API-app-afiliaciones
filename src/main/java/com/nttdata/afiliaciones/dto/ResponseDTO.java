package com.nttdata.afiliaciones.dto;

import lombok.Data;

@Data
public class ResponseDTO {
    private String message;
    private boolean succes;
    private Object data;
}
