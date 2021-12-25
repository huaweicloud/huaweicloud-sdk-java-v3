package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 端点详情 */
public class EndpointObj {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief_instance_id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, String> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public EndpointObj withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 端点描述，最大长度255，不允许^~#$%&*<>()[]{}'\"\\
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EndpointObj withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /** 铂金版实例ID，如果为空则表示是专业版实例。
     * 
     * @return iefInstanceId */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public EndpointObj withName(String name) {
        this.name = name;
        return this;
    }

    /** 端点名称，只允许中文字符、英文字符、数字、下划线、中划线，最大长度64 同一个帐号中创建的端点名唯一
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EndpointObj withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public EndpointObj putPropertiesItem(String key, String propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public EndpointObj withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /** 端点的属性，端点需要对外展示的属性，示例： - dis: {\"domain_id\":\"user's domain id\"} - servicebus: {\"service_port\":8080} - apigw:
     * {\"domain_id\":\"user's domain id\"}
     * 
     * @return properties */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public EndpointObj withType(String type) {
        this.type = type;
        return this;
    }

    /** 端点类型 枚举值： - dis - servicebus - apigw
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EndpointObj endpointObj = (EndpointObj) o;
        return Objects.equals(this.description, endpointObj.description)
            && Objects.equals(this.iefInstanceId, endpointObj.iefInstanceId)
            && Objects.equals(this.name, endpointObj.name) && Objects.equals(this.properties, endpointObj.properties)
            && Objects.equals(this.type, endpointObj.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, iefInstanceId, name, properties, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointObj {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
