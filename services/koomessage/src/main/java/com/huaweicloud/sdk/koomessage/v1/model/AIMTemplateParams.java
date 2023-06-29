package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模板参数。
 */
public class AIMTemplateParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_length")

    private Boolean hasLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_length")

    private Integer fixLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length_restrict")

    private Boolean lengthRestrict;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_length")

    private Integer minLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    public AIMTemplateParams withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 参数类型。 - string：文本 - integer：数字 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AIMTemplateParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AIMTemplateParams withHasLength(Boolean hasLength) {
        this.hasLength = hasLength;
        return this;
    }

    /**
     * 动态参数是否长度限制。 - false：不可设置  - true：可设置 
     * @return hasLength
     */
    public Boolean getHasLength() {
        return hasLength;
    }

    public void setHasLength(Boolean hasLength) {
        this.hasLength = hasLength;
    }

    public AIMTemplateParams withFixLength(Integer fixLength) {
        this.fixLength = fixLength;
        return this;
    }

    /**
     * 固定长度。
     * @return fixLength
     */
    public Integer getFixLength() {
        return fixLength;
    }

    public void setFixLength(Integer fixLength) {
        this.fixLength = fixLength;
    }

    public AIMTemplateParams withLengthRestrict(Boolean lengthRestrict) {
        this.lengthRestrict = lengthRestrict;
        return this;
    }

    /**
     * 长度限制。
     * @return lengthRestrict
     */
    public Boolean getLengthRestrict() {
        return lengthRestrict;
    }

    public void setLengthRestrict(Boolean lengthRestrict) {
        this.lengthRestrict = lengthRestrict;
    }

    public AIMTemplateParams withMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * 最小长度。
     * @return minLength
     */
    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public AIMTemplateParams withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * 最大长度。
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AIMTemplateParams that = (AIMTemplateParams) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.hasLength, that.hasLength) && Objects.equals(this.fixLength, that.fixLength)
            && Objects.equals(this.lengthRestrict, that.lengthRestrict)
            && Objects.equals(this.minLength, that.minLength) && Objects.equals(this.maxLength, that.maxLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, hasLength, fixLength, lengthRestrict, minLength, maxLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMTemplateParams {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hasLength: ").append(toIndentedString(hasLength)).append("\n");
        sb.append("    fixLength: ").append(toIndentedString(fixLength)).append("\n");
        sb.append("    lengthRestrict: ").append(toIndentedString(lengthRestrict)).append("\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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
