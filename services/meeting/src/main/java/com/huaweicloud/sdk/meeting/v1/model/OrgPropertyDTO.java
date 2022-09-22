package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OrgPropertyDTO
 */
public class OrgPropertyDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propertyKey")

    private String propertyKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propertyValue")

    private String propertyValue;

    public OrgPropertyDTO withPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
        return this;
    }

    /**
     * 配置项key。 开通本地录制功能，参数填写：enableClientRecord。 
     * @return propertyKey
     */
    public String getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public OrgPropertyDTO withPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }

    /**
     * 配置项值。 开通本地录制功能，参数填写：true。 
     * @return propertyValue
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgPropertyDTO orgPropertyDTO = (OrgPropertyDTO) o;
        return Objects.equals(this.propertyKey, orgPropertyDTO.propertyKey)
            && Objects.equals(this.propertyValue, orgPropertyDTO.propertyValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyKey, propertyValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgPropertyDTO {\n");
        sb.append("    propertyKey: ").append(toIndentedString(propertyKey)).append("\n");
        sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
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
