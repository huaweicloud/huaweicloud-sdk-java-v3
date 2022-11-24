package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExtractAudioTaskReq
 */
public class ExtractAudioTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter")

    private Parameter parameter;

    public ExtractAudioTaskReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 媒资ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ExtractAudioTaskReq withParameter(Parameter parameter) {
        this.parameter = parameter;
        return this;
    }

    public ExtractAudioTaskReq withParameter(Consumer<Parameter> parameterSetter) {
        if (this.parameter == null) {
            this.parameter = new Parameter();
            parameterSetter.accept(this.parameter);
        }

        return this;
    }

    /**
     * Get parameter
     * @return parameter
     */
    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtractAudioTaskReq extractAudioTaskReq = (ExtractAudioTaskReq) o;
        return Objects.equals(this.assetId, extractAudioTaskReq.assetId)
            && Objects.equals(this.parameter, extractAudioTaskReq.parameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, parameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtractAudioTaskReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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
