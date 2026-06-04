package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAuthConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config_id")

    private String authConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAuthConfigReq body;

    public UpdateAuthConfigRequest withAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
        return this;
    }

    /**
     * 认证配置ID
     * @return authConfigId
     */
    public String getAuthConfigId() {
        return authConfigId;
    }

    public void setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
    }

    public UpdateAuthConfigRequest withBody(UpdateAuthConfigReq body) {
        this.body = body;
        return this;
    }

    public UpdateAuthConfigRequest withBody(Consumer<UpdateAuthConfigReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAuthConfigReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAuthConfigReq getBody() {
        return body;
    }

    public void setBody(UpdateAuthConfigReq body) {
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
        UpdateAuthConfigRequest that = (UpdateAuthConfigRequest) obj;
        return Objects.equals(this.authConfigId, that.authConfigId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authConfigId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuthConfigRequest {\n");
        sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
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
