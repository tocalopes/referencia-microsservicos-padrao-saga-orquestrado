package br.com.microservices.orchestrated.orchestratorservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum Etopics {
    START_SAGE("start-saga"),
    BASE_ORCHESTRATOR("orchestrator"),
    FINISH_SUCCES("finish-success"),
    FINISH_FAILED("finish-failed"),
    PRODUCT_VALIDATION_SUCCESS("product-validation-success"),
    PRODUCT_VALIDATION_FAILED("product-validation-failed"),
    PAYMENT_SUCCESS("payment-success"),
    PAYMENT_FAILED("payment-failed"),
    INVENTORY_SUCCESS("inventory-success"),
    INVENTORY_FAILED("inventory-failed"),
    NOTIFY_ENDING("notify-ending");

    private String topic;
}
