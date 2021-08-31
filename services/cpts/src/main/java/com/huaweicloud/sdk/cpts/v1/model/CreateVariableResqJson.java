package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** json */
public class CreateVariableResqJson {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_id")

    private Integer variableId;

    public CreateVariableResqJson withVariableId(Integer variableId) {
        this.variableId = variableId;
        return this;
    }

    /** variable_id minimum: 0 maximum: 2147483647
     * 
     * @return variableId */
    public Integer getVariableId() {
        return variableId;
    }

    public void setVariableId(Integer variableId) {
        this.variableId = variableId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVariableResqJson createVariableResqJson = (CreateVariableResqJson) o;
        return Objects.equals(this.variableId, createVariableResqJson.variableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVariableResqJson {\n");
        sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
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
