package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建密钥或者更新密钥的请求体
 */
public class SecretRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private SecretObjectInSecretRequestBody secret;

    public SecretRequestBody withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID。默认为default。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public SecretRequestBody withSecret(SecretObjectInSecretRequestBody secret) {
        this.secret = secret;
        return this;
    }

    public SecretRequestBody withSecret(Consumer<SecretObjectInSecretRequestBody> secretSetter) {
        if (this.secret == null) {
            this.secret = new SecretObjectInSecretRequestBody();
            secretSetter.accept(this.secret);
        }

        return this;
    }

    /**
     * Get secret
     * @return secret
     */
    public SecretObjectInSecretRequestBody getSecret() {
        return secret;
    }

    public void setSecret(SecretObjectInSecretRequestBody secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretRequestBody secretRequestBody = (SecretRequestBody) o;
        return Objects.equals(this.workspaceId, secretRequestBody.workspaceId)
            && Objects.equals(this.secret, secretRequestBody.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretRequestBody {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
