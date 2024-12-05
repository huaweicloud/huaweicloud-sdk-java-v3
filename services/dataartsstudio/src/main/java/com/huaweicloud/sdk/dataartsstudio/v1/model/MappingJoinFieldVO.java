package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MappingJoinFieldVO
 */
public class MappingJoinFieldVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field1_id")

    private String field1Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field2_id")

    private String field2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field1_name")

    private String field1Name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field2_name")

    private String field2Name;

    public MappingJoinFieldVO withField1Id(String field1Id) {
        this.field1Id = field1Id;
        return this;
    }

    /**
     * 属性1ID，ID字符串。
     * @return field1Id
     */
    public String getField1Id() {
        return field1Id;
    }

    public void setField1Id(String field1Id) {
        this.field1Id = field1Id;
    }

    public MappingJoinFieldVO withField2Id(String field2Id) {
        this.field2Id = field2Id;
        return this;
    }

    /**
     * 属性2ID，ID字符串。
     * @return field2Id
     */
    public String getField2Id() {
        return field2Id;
    }

    public void setField2Id(String field2Id) {
        this.field2Id = field2Id;
    }

    public MappingJoinFieldVO withField1Name(String field1Name) {
        this.field1Name = field1Name;
        return this;
    }

    /**
     * 属性1名称。
     * @return field1Name
     */
    public String getField1Name() {
        return field1Name;
    }

    public void setField1Name(String field1Name) {
        this.field1Name = field1Name;
    }

    public MappingJoinFieldVO withField2Name(String field2Name) {
        this.field2Name = field2Name;
        return this;
    }

    /**
     * 属性2名称。
     * @return field2Name
     */
    public String getField2Name() {
        return field2Name;
    }

    public void setField2Name(String field2Name) {
        this.field2Name = field2Name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MappingJoinFieldVO that = (MappingJoinFieldVO) obj;
        return Objects.equals(this.field1Id, that.field1Id) && Objects.equals(this.field2Id, that.field2Id)
            && Objects.equals(this.field1Name, that.field1Name) && Objects.equals(this.field2Name, that.field2Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1Id, field2Id, field1Name, field2Name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MappingJoinFieldVO {\n");
        sb.append("    field1Id: ").append(toIndentedString(field1Id)).append("\n");
        sb.append("    field2Id: ").append(toIndentedString(field2Id)).append("\n");
        sb.append("    field1Name: ").append(toIndentedString(field1Name)).append("\n");
        sb.append("    field2Name: ").append(toIndentedString(field2Name)).append("\n");
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
