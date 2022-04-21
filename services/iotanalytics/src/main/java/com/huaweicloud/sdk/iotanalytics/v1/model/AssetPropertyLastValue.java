package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AssetPropertyLastValue
 */
public class AssetPropertyLastValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_name")

    private String propertyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private String timestamp;

    public AssetPropertyLastValue withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * 资产属性名称
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public AssetPropertyLastValue withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 资产属性值
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public AssetPropertyLastValue withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 资产属性值最后更新时间
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetPropertyLastValue assetPropertyLastValue = (AssetPropertyLastValue) o;
        return Objects.equals(this.propertyName, assetPropertyLastValue.propertyName)
            && Objects.equals(this.value, assetPropertyLastValue.value)
            && Objects.equals(this.timestamp, assetPropertyLastValue.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyName, value, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetPropertyLastValue {\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
