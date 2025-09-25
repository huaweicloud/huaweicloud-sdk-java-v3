package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOrderInformationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_code")

    private String modelCode;

    public ShowOrderInformationRequest withModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }

    /**
     * 服务单类型编码
     * @return modelCode
     */
    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOrderInformationRequest that = (ShowOrderInformationRequest) obj;
        return Objects.equals(this.modelCode, that.modelCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrderInformationRequest {\n");
        sb.append("    modelCode: ").append(toIndentedString(modelCode)).append("\n");
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
