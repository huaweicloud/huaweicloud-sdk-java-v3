package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 属性数据
 */
public class PropertiesDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "correlation_data")

    private String correlationData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_topic")

    private String responseTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_properties")

    private List<UserPropDTO> userProperties = null;

    public PropertiesDTO withCorrelationData(String correlationData) {
        this.correlationData = correlationData;
        return this;
    }

    /**
     * **参数说明**：MQTT 5.0版本请求和响应模式中的相关数据，可选。用户可以通过该参数配置MQTT协议请求和响应模式中的相关数据。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return correlationData
     */
    public String getCorrelationData() {
        return correlationData;
    }

    public void setCorrelationData(String correlationData) {
        this.correlationData = correlationData;
    }

    public PropertiesDTO withResponseTopic(String responseTopic) {
        this.responseTopic = responseTopic;
        return this;
    }

    /**
     * **参数说明**：MQTT 5.0版本请求和响应模式中的响应主题，可选。用户可以通过该参数配置MQTT协议请求和响应模式中的响应主题。 **取值范围**：长度不超过128, 只允许字母、数字、以及_-?=$#+/等字符的组合。
     * @return responseTopic
     */
    public String getResponseTopic() {
        return responseTopic;
    }

    public void setResponseTopic(String responseTopic) {
        this.responseTopic = responseTopic;
    }

    public PropertiesDTO withUserProperties(List<UserPropDTO> userProperties) {
        this.userProperties = userProperties;
        return this;
    }

    public PropertiesDTO addUserPropertiesItem(UserPropDTO userPropertiesItem) {
        if (this.userProperties == null) {
            this.userProperties = new ArrayList<>();
        }
        this.userProperties.add(userPropertiesItem);
        return this;
    }

    public PropertiesDTO withUserProperties(Consumer<List<UserPropDTO>> userPropertiesSetter) {
        if (this.userProperties == null) {
            this.userProperties = new ArrayList<>();
        }
        userPropertiesSetter.accept(this.userProperties);
        return this;
    }

    /**
     * **参数说明**：用户自定义属性，可选。用户可以通过该参数配置用户自定义属性。可以配置的最大自定义属性数量为20。
     * @return userProperties
     */
    public List<UserPropDTO> getUserProperties() {
        return userProperties;
    }

    public void setUserProperties(List<UserPropDTO> userProperties) {
        this.userProperties = userProperties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertiesDTO propertiesDTO = (PropertiesDTO) o;
        return Objects.equals(this.correlationData, propertiesDTO.correlationData)
            && Objects.equals(this.responseTopic, propertiesDTO.responseTopic)
            && Objects.equals(this.userProperties, propertiesDTO.userProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationData, responseTopic, userProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertiesDTO {\n");
        sb.append("    correlationData: ").append(toIndentedString(correlationData)).append("\n");
        sb.append("    responseTopic: ").append(toIndentedString(responseTopic)).append("\n");
        sb.append("    userProperties: ").append(toIndentedString(userProperties)).append("\n");
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
