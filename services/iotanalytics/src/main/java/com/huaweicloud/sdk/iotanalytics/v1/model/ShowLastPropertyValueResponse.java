package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowLastPropertyValueResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<AssetPropertyLastValue> properties = null;

    public ShowLastPropertyValueResponse withProperties(List<AssetPropertyLastValue> properties) {
        this.properties = properties;
        return this;
    }

    public ShowLastPropertyValueResponse addPropertiesItem(AssetPropertyLastValue propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public ShowLastPropertyValueResponse withProperties(Consumer<List<AssetPropertyLastValue>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /** 查询到的资产属性列表
     * 
     * @return properties */
    public List<AssetPropertyLastValue> getProperties() {
        return properties;
    }

    public void setProperties(List<AssetPropertyLastValue> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLastPropertyValueResponse showLastPropertyValueResponse = (ShowLastPropertyValueResponse) o;
        return Objects.equals(this.properties, showLastPropertyValueResponse.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLastPropertyValueResponse {\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
