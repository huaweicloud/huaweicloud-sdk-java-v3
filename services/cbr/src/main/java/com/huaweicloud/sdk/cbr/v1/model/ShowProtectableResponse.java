package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowProtectableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private ProtectablesResp instance;

    public ShowProtectableResponse withInstance(ProtectablesResp instance) {
        this.instance = instance;
        return this;
    }

    public ShowProtectableResponse withInstance(Consumer<ProtectablesResp> instanceSetter) {
        if (this.instance == null) {
            this.instance = new ProtectablesResp();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /** Get instance
     * 
     * @return instance */
    public ProtectablesResp getInstance() {
        return instance;
    }

    public void setInstance(ProtectablesResp instance) {
        this.instance = instance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProtectableResponse showProtectableResponse = (ShowProtectableResponse) o;
        return Objects.equals(this.instance, showProtectableResponse.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProtectableResponse {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
