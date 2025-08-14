package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SAML响应接收方
 */
public class ConsumersDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding")

    private String binding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private Boolean defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    public ConsumersDto withBinding(String binding) {
        this.binding = binding;
        return this;
    }

    /**
     * SAML传输协议
     * @return binding
     */
    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public ConsumersDto withDefaultValue(Boolean defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 是否是默认接收方
     * @return defaultValue
     */
    public Boolean getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ConsumersDto withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * SAML ACS Url
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumersDto that = (ConsumersDto) obj;
        return Objects.equals(this.binding, that.binding) && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(binding, defaultValue, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumersDto {\n");
        sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
