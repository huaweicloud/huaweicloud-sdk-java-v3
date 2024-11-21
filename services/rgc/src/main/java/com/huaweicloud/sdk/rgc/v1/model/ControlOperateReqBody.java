package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作控制策略的请求体。
 */
public class ControlOperateReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_identifier")

    private String targetIdentifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<EnableControlParameters> parameters = null;

    public ControlOperateReqBody withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 控制策略ID。
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ControlOperateReqBody withTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
        return this;
    }

    /**
     * 组织单元的ID信息。
     * @return targetIdentifier
     */
    public String getTargetIdentifier() {
        return targetIdentifier;
    }

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public ControlOperateReqBody withParameters(List<EnableControlParameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ControlOperateReqBody addParametersItem(EnableControlParameters parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public ControlOperateReqBody withParameters(Consumer<List<EnableControlParameters>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 策略参数。
     * @return parameters
     */
    public List<EnableControlParameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<EnableControlParameters> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ControlOperateReqBody that = (ControlOperateReqBody) obj;
        return Objects.equals(this.identifier, that.identifier)
            && Objects.equals(this.targetIdentifier, that.targetIdentifier)
            && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, targetIdentifier, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ControlOperateReqBody {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    targetIdentifier: ").append(toIndentedString(targetIdentifier)).append("\n");
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
