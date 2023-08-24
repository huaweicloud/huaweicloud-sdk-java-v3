package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowModuleShadowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Object properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties_update_time")

    private Object propertiesUpdateTime;

    public ShowModuleShadowResponse withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * 应用配置内容
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public ShowModuleShadowResponse withPropertiesUpdateTime(Object propertiesUpdateTime) {
        this.propertiesUpdateTime = propertiesUpdateTime;
        return this;
    }

    /**
     * 应用配置更新时间
     * @return propertiesUpdateTime
     */
    public Object getPropertiesUpdateTime() {
        return propertiesUpdateTime;
    }

    public void setPropertiesUpdateTime(Object propertiesUpdateTime) {
        this.propertiesUpdateTime = propertiesUpdateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowModuleShadowResponse that = (ShowModuleShadowResponse) obj;
        return Objects.equals(this.properties, that.properties)
            && Objects.equals(this.propertiesUpdateTime, that.propertiesUpdateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties, propertiesUpdateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowModuleShadowResponse {\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    propertiesUpdateTime: ").append(toIndentedString(propertiesUpdateTime)).append("\n");
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
