package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ApplyConfigurationAsyncRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    @JacksonXmlProperty(localName = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_id")

    @JacksonXmlProperty(localName = "config_id")

    private String configId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ApplyConfigurationRequest body;

    public ApplyConfigurationAsyncRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ApplyConfigurationAsyncRequest withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    /**
     * 参数模板ID。
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public ApplyConfigurationAsyncRequest withBody(ApplyConfigurationRequest body) {
        this.body = body;
        return this;
    }

    public ApplyConfigurationAsyncRequest withBody(Consumer<ApplyConfigurationRequest> bodySetter) {
        if (this.body == null) {
            this.body = new ApplyConfigurationRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ApplyConfigurationRequest getBody() {
        return body;
    }

    public void setBody(ApplyConfigurationRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplyConfigurationAsyncRequest applyConfigurationAsyncRequest = (ApplyConfigurationAsyncRequest) o;
        return Objects.equals(this.xLanguage, applyConfigurationAsyncRequest.xLanguage)
            && Objects.equals(this.configId, applyConfigurationAsyncRequest.configId)
            && Objects.equals(this.body, applyConfigurationAsyncRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, configId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyConfigurationAsyncRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
