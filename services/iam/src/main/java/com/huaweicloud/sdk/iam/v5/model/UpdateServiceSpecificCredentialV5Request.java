package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateServiceSpecificCredentialV5Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_id")

    private String credentialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateServiceSpecificCredentialReq body;

    public UpdateServiceSpecificCredentialV5Request withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * IAM用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UpdateServiceSpecificCredentialV5Request withCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }

    /**
     * 服务专属凭证ID。
     * @return credentialId
     */
    public String getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(String credentialId) {
        this.credentialId = credentialId;
    }

    public UpdateServiceSpecificCredentialV5Request withBody(UpdateServiceSpecificCredentialReq body) {
        this.body = body;
        return this;
    }

    public UpdateServiceSpecificCredentialV5Request withBody(Consumer<UpdateServiceSpecificCredentialReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateServiceSpecificCredentialReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateServiceSpecificCredentialReq getBody() {
        return body;
    }

    public void setBody(UpdateServiceSpecificCredentialReq body) {
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
        UpdateServiceSpecificCredentialV5Request that = (UpdateServiceSpecificCredentialV5Request) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.credentialId, that.credentialId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, credentialId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServiceSpecificCredentialV5Request {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
