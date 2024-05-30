package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 码表属性值。
 */
public class CodeTableFieldValueVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_id")

    private String fdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_value")

    private String fdValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CodeTableFieldValueVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 码表字段ID，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CodeTableFieldValueVO withFdId(String fdId) {
        this.fdId = fdId;
        return this;
    }

    /**
     * 所属码表属性ID，填写String类型替代Long类型。
     * @return fdId
     */
    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    public CodeTableFieldValueVO withFdValue(String fdValue) {
        this.fdValue = fdValue;
        return this;
    }

    /**
     * 码表属性值。
     * @return fdValue
     */
    public String getFdValue() {
        return fdValue;
    }

    public void setFdValue(String fdValue) {
        this.fdValue = fdValue;
    }

    public CodeTableFieldValueVO withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 序号。
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public CodeTableFieldValueVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodeTableFieldValueVO that = (CodeTableFieldValueVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fdId, that.fdId)
            && Objects.equals(this.fdValue, that.fdValue) && Objects.equals(this.ordinal, that.ordinal)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fdId, fdValue, ordinal, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeTableFieldValueVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fdId: ").append(toIndentedString(fdId)).append("\n");
        sb.append("    fdValue: ").append(toIndentedString(fdValue)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
