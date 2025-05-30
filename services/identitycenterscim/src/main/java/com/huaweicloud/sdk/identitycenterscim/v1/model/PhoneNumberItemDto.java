package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PhoneNumberItemDto
 */
public class PhoneNumberItemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary")

    private Boolean primary;

    public PhoneNumberItemDto withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 包含电话号码的字符串
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PhoneNumberItemDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 表示电话号码类型的字符串
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PhoneNumberItemDto withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * 一个布尔值，表示这是否是用户的主电话号码
     * @return primary
     */
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhoneNumberItemDto that = (PhoneNumberItemDto) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.type, that.type)
            && Objects.equals(this.primary, that.primary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type, primary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneNumberItemDto {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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
