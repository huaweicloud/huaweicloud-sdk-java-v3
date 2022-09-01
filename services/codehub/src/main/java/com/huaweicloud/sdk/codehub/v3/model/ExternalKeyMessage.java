package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ExternalKeyMessage
 */
public class ExternalKeyMessage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_key_message")

    @JacksonXmlProperty(localName = "external_key_message")

    private String externalKeyMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_service")

    @JacksonXmlProperty(localName = "external_service")

    private String externalService;

    public ExternalKeyMessage withExternalKeyMessage(String externalKeyMessage) {
        this.externalKeyMessage = externalKeyMessage;
        return this;
    }

    /**
     * 第三方保存在codehub的关键信息
     * @return externalKeyMessage
     */
    public String getExternalKeyMessage() {
        return externalKeyMessage;
    }

    public void setExternalKeyMessage(String externalKeyMessage) {
        this.externalKeyMessage = externalKeyMessage;
    }

    public ExternalKeyMessage withExternalService(String externalService) {
        this.externalService = externalService;
        return this;
    }

    /**
     * 外部服务名称
     * @return externalService
     */
    public String getExternalService() {
        return externalService;
    }

    public void setExternalService(String externalService) {
        this.externalService = externalService;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalKeyMessage externalKeyMessage = (ExternalKeyMessage) o;
        return Objects.equals(this.externalKeyMessage, externalKeyMessage.externalKeyMessage)
            && Objects.equals(this.externalService, externalKeyMessage.externalService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalKeyMessage, externalService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalKeyMessage {\n");
        sb.append("    externalKeyMessage: ").append(toIndentedString(externalKeyMessage)).append("\n");
        sb.append("    externalService: ").append(toIndentedString(externalService)).append("\n");
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
