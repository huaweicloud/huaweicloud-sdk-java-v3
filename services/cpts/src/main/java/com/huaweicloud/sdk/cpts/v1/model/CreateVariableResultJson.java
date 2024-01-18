package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateVariableResultJson
 */
public class CreateVariableResultJson {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_id")

    private Integer variableId;

    public CreateVariableResultJson withVariableId(Integer variableId) {
        this.variableId = variableId;
        return this;
    }

    /**
     * 变量id
     * minimum: 0
     * maximum: 2147483647
     * @return variableId
     */
    public Integer getVariableId() {
        return variableId;
    }

    public void setVariableId(Integer variableId) {
        this.variableId = variableId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVariableResultJson that = (CreateVariableResultJson) obj;
        return Objects.equals(this.variableId, that.variableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVariableResultJson {\n");
        sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
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
