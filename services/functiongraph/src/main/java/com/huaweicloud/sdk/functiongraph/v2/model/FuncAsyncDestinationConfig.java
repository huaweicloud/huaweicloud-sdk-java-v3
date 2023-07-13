package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 函数异步调用目标参数配置。
 */
public class FuncAsyncDestinationConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_success")

    private FuncDestinationConfig onSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_failure")

    private FuncDestinationConfig onFailure;

    public FuncAsyncDestinationConfig withOnSuccess(FuncDestinationConfig onSuccess) {
        this.onSuccess = onSuccess;
        return this;
    }

    public FuncAsyncDestinationConfig withOnSuccess(Consumer<FuncDestinationConfig> onSuccessSetter) {
        if (this.onSuccess == null) {
            this.onSuccess = new FuncDestinationConfig();
            onSuccessSetter.accept(this.onSuccess);
        }

        return this;
    }

    /**
     * Get onSuccess
     * @return onSuccess
     */
    public FuncDestinationConfig getOnSuccess() {
        return onSuccess;
    }

    public void setOnSuccess(FuncDestinationConfig onSuccess) {
        this.onSuccess = onSuccess;
    }

    public FuncAsyncDestinationConfig withOnFailure(FuncDestinationConfig onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    public FuncAsyncDestinationConfig withOnFailure(Consumer<FuncDestinationConfig> onFailureSetter) {
        if (this.onFailure == null) {
            this.onFailure = new FuncDestinationConfig();
            onFailureSetter.accept(this.onFailure);
        }

        return this;
    }

    /**
     * Get onFailure
     * @return onFailure
     */
    public FuncDestinationConfig getOnFailure() {
        return onFailure;
    }

    public void setOnFailure(FuncDestinationConfig onFailure) {
        this.onFailure = onFailure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FuncAsyncDestinationConfig that = (FuncAsyncDestinationConfig) obj;
        return Objects.equals(this.onSuccess, that.onSuccess) && Objects.equals(this.onFailure, that.onFailure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onSuccess, onFailure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuncAsyncDestinationConfig {\n");
        sb.append("    onSuccess: ").append(toIndentedString(onSuccess)).append("\n");
        sb.append("    onFailure: ").append(toIndentedString(onFailure)).append("\n");
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
