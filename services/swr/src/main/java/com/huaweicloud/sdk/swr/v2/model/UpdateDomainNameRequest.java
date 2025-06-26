package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDomainNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainname_id")

    private String domainnameId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDomainNameRequestBody body;

    public UpdateDomainNameRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 企业仓库实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateDomainNameRequest withDomainnameId(String domainnameId) {
        this.domainnameId = domainnameId;
        return this;
    }

    /**
     * 域名ID
     * @return domainnameId
     */
    public String getDomainnameId() {
        return domainnameId;
    }

    public void setDomainnameId(String domainnameId) {
        this.domainnameId = domainnameId;
    }

    public UpdateDomainNameRequest withBody(UpdateDomainNameRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDomainNameRequest withBody(Consumer<UpdateDomainNameRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDomainNameRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateDomainNameRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateDomainNameRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDomainNameRequest that = (UpdateDomainNameRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.domainnameId, that.domainnameId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, domainnameId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainNameRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    domainnameId: ").append(toIndentedString(domainnameId)).append("\n");
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
