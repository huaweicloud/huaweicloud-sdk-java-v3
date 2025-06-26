package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateInstanceLtCredentialRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_id")

    private String credentialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateLongTermCredentialRequestBody body;

    public UpdateInstanceLtCredentialRequest withInstanceId(String instanceId) {
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

    public UpdateInstanceLtCredentialRequest withCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }

    /**
     * 访问凭证ID，即token_id
     * @return credentialId
     */
    public String getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(String credentialId) {
        this.credentialId = credentialId;
    }

    public UpdateInstanceLtCredentialRequest withBody(UpdateLongTermCredentialRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateInstanceLtCredentialRequest withBody(Consumer<UpdateLongTermCredentialRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateLongTermCredentialRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateLongTermCredentialRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateLongTermCredentialRequestBody body) {
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
        UpdateInstanceLtCredentialRequest that = (UpdateInstanceLtCredentialRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.credentialId, that.credentialId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, credentialId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceLtCredentialRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
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
