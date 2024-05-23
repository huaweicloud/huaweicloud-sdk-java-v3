package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对象数组
 */
public class ObjectArrayPatterns {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private Double maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_value")

    private Double minValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nullable")

    private Boolean nullable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hint")

    private String hint;

    public ObjectArrayPatterns withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ObjectArrayPatterns withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ObjectArrayPatterns withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * 最大长度
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public ObjectArrayPatterns withMaxValue(Double maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * 最大值
     * @return maxValue
     */
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public ObjectArrayPatterns withMinValue(Double minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * 最小值
     * @return minValue
     */
    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public ObjectArrayPatterns withNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    /**
     * 是否可以为空值
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public ObjectArrayPatterns withHint(String hint) {
        this.hint = hint;
        return this;
    }

    /**
     * 提示信息
     * @return hint
     */
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectArrayPatterns that = (ObjectArrayPatterns) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.type, that.type)
            && Objects.equals(this.maxLength, that.maxLength) && Objects.equals(this.maxValue, that.maxValue)
            && Objects.equals(this.minValue, that.minValue) && Objects.equals(this.nullable, that.nullable)
            && Objects.equals(this.hint, that.hint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, type, maxLength, maxValue, minValue, nullable, hint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectArrayPatterns {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
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
