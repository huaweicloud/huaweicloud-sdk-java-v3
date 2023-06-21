package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * LifecycleProcess
 */
public class LifecycleProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private LifecycleProcessParameter parameters;

    public LifecycleProcess withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 取值为command或者http。command为执行命令行，http为发送http请求。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LifecycleProcess withParameters(LifecycleProcessParameter parameters) {
        this.parameters = parameters;
        return this;
    }

    public LifecycleProcess withParameters(Consumer<LifecycleProcessParameter> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new LifecycleProcessParameter();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public LifecycleProcessParameter getParameters() {
        return parameters;
    }

    public void setParameters(LifecycleProcessParameter parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LifecycleProcess lifecycleProcess = (LifecycleProcess) o;
        return Objects.equals(this.type, lifecycleProcess.type)
            && Objects.equals(this.parameters, lifecycleProcess.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LifecycleProcess {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
