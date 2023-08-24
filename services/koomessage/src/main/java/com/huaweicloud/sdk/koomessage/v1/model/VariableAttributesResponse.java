package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户增长任务列表。
 */
public class VariableAttributesResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_index")

    private Integer variableIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_length")

    private Integer variableLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_type")

    private String variableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_desc")

    private String variableDesc;

    public VariableAttributesResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * ID。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VariableAttributesResponse withVariableIndex(Integer variableIndex) {
        this.variableIndex = variableIndex;
        return this;
    }

    /**
     * 变量索引。
     * @return variableIndex
     */
    public Integer getVariableIndex() {
        return variableIndex;
    }

    public void setVariableIndex(Integer variableIndex) {
        this.variableIndex = variableIndex;
    }

    public VariableAttributesResponse withVariableLength(Integer variableLength) {
        this.variableLength = variableLength;
        return this;
    }

    /**
     * 变量长度。
     * @return variableLength
     */
    public Integer getVariableLength() {
        return variableLength;
    }

    public void setVariableLength(Integer variableLength) {
        this.variableLength = variableLength;
    }

    public VariableAttributesResponse withVariableType(String variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * 变量类型。
     * @return variableType
     */
    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public VariableAttributesResponse withVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc;
        return this;
    }

    /**
     * 变量描述。
     * @return variableDesc
     */
    public String getVariableDesc() {
        return variableDesc;
    }

    public void setVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VariableAttributesResponse that = (VariableAttributesResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.variableIndex, that.variableIndex)
            && Objects.equals(this.variableLength, that.variableLength)
            && Objects.equals(this.variableType, that.variableType)
            && Objects.equals(this.variableDesc, that.variableDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, variableIndex, variableLength, variableType, variableDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableAttributesResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    variableIndex: ").append(toIndentedString(variableIndex)).append("\n");
        sb.append("    variableLength: ").append(toIndentedString(variableLength)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
        sb.append("    variableDesc: ").append(toIndentedString(variableDesc)).append("\n");
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
