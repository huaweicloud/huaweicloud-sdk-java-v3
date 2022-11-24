package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PrecheckDisasterRecoveryOperationBody
 */
public class PrecheckDisasterRecoveryOperationBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_instance")

    private PrecheckDisasterRecoveryInstance disasterRecoveryInstance;

    public PrecheckDisasterRecoveryOperationBody withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 指定预校验的具体容灾操作。
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public PrecheckDisasterRecoveryOperationBody withDisasterRecoveryInstance(
        PrecheckDisasterRecoveryInstance disasterRecoveryInstance) {
        this.disasterRecoveryInstance = disasterRecoveryInstance;
        return this;
    }

    public PrecheckDisasterRecoveryOperationBody withDisasterRecoveryInstance(
        Consumer<PrecheckDisasterRecoveryInstance> disasterRecoveryInstanceSetter) {
        if (this.disasterRecoveryInstance == null) {
            this.disasterRecoveryInstance = new PrecheckDisasterRecoveryInstance();
            disasterRecoveryInstanceSetter.accept(this.disasterRecoveryInstance);
        }

        return this;
    }

    /**
     * Get disasterRecoveryInstance
     * @return disasterRecoveryInstance
     */
    public PrecheckDisasterRecoveryInstance getDisasterRecoveryInstance() {
        return disasterRecoveryInstance;
    }

    public void setDisasterRecoveryInstance(PrecheckDisasterRecoveryInstance disasterRecoveryInstance) {
        this.disasterRecoveryInstance = disasterRecoveryInstance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrecheckDisasterRecoveryOperationBody precheckDisasterRecoveryOperationBody =
            (PrecheckDisasterRecoveryOperationBody) o;
        return Objects.equals(this.operation, precheckDisasterRecoveryOperationBody.operation) && Objects
            .equals(this.disasterRecoveryInstance, precheckDisasterRecoveryOperationBody.disasterRecoveryInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, disasterRecoveryInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrecheckDisasterRecoveryOperationBody {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    disasterRecoveryInstance: ").append(toIndentedString(disasterRecoveryInstance)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
