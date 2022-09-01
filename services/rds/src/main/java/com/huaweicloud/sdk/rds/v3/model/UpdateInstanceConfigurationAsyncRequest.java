package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateInstanceConfigurationAsyncRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    @JacksonXmlProperty(localName = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateInstanceConfigurationRequestBody body;

    public UpdateInstanceConfigurationAsyncRequest withXLanguage(String xLanguage) {
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

    public UpdateInstanceConfigurationAsyncRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateInstanceConfigurationAsyncRequest withBody(UpdateInstanceConfigurationRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateInstanceConfigurationAsyncRequest withBody(
        Consumer<UpdateInstanceConfigurationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateInstanceConfigurationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateInstanceConfigurationRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateInstanceConfigurationRequestBody body) {
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
        UpdateInstanceConfigurationAsyncRequest updateInstanceConfigurationAsyncRequest =
            (UpdateInstanceConfigurationAsyncRequest) o;
        return Objects.equals(this.xLanguage, updateInstanceConfigurationAsyncRequest.xLanguage)
            && Objects.equals(this.instanceId, updateInstanceConfigurationAsyncRequest.instanceId)
            && Objects.equals(this.body, updateInstanceConfigurationAsyncRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceConfigurationAsyncRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
