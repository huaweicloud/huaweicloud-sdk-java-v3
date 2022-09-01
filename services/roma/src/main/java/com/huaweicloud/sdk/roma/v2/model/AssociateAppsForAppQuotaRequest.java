package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociateAppsForAppQuotaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_quota_id")

    @JacksonXmlProperty(localName = "app_quota_id")

    private String appQuotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CreateAppQuotaBindingApp body;

    public AssociateAppsForAppQuotaRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AssociateAppsForAppQuotaRequest withAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
        return this;
    }

    /**
     * 客户端配额编号
     * @return appQuotaId
     */
    public String getAppQuotaId() {
        return appQuotaId;
    }

    public void setAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
    }

    public AssociateAppsForAppQuotaRequest withBody(CreateAppQuotaBindingApp body) {
        this.body = body;
        return this;
    }

    public AssociateAppsForAppQuotaRequest withBody(Consumer<CreateAppQuotaBindingApp> bodySetter) {
        if (this.body == null) {
            this.body = new CreateAppQuotaBindingApp();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateAppQuotaBindingApp getBody() {
        return body;
    }

    public void setBody(CreateAppQuotaBindingApp body) {
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
        AssociateAppsForAppQuotaRequest associateAppsForAppQuotaRequest = (AssociateAppsForAppQuotaRequest) o;
        return Objects.equals(this.instanceId, associateAppsForAppQuotaRequest.instanceId)
            && Objects.equals(this.appQuotaId, associateAppsForAppQuotaRequest.appQuotaId)
            && Objects.equals(this.body, associateAppsForAppQuotaRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appQuotaId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateAppsForAppQuotaRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appQuotaId: ").append(toIndentedString(appQuotaId)).append("\n");
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
