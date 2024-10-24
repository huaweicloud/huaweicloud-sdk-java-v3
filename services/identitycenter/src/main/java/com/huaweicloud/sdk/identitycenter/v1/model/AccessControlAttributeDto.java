package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * These are IAM Identity Center identity store attributes that you can configure for use in attributes-based access control (ABAC).
 */
public class AccessControlAttributeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private AccessControlAttributeValueDto value;

    public AccessControlAttributeDto withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 与您的身份源中的身份关联的属性的名称
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AccessControlAttributeDto withValue(AccessControlAttributeValueDto value) {
        this.value = value;
        return this;
    }

    public AccessControlAttributeDto withValue(Consumer<AccessControlAttributeValueDto> valueSetter) {
        if (this.value == null) {
            this.value = new AccessControlAttributeValueDto();
            valueSetter.accept(this.value);
        }

        return this;
    }

    /**
     * Get value
     * @return value
     */
    public AccessControlAttributeValueDto getValue() {
        return value;
    }

    public void setValue(AccessControlAttributeValueDto value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlAttributeDto that = (AccessControlAttributeDto) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessControlAttributeDto {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
