package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateVpnUserRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_server_id")

    private String vpnServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateVpnUserRequestBody body;

    public UpdateVpnUserRequest withVpnServerId(String vpnServerId) {
        this.vpnServerId = vpnServerId;
        return this;
    }

    /**
     * VPN服务端 ID
     * @return vpnServerId
     */
    public String getVpnServerId() {
        return vpnServerId;
    }

    public void setVpnServerId(String vpnServerId) {
        this.vpnServerId = vpnServerId;
    }

    public UpdateVpnUserRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UpdateVpnUserRequest withBody(UpdateVpnUserRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateVpnUserRequest withBody(Consumer<UpdateVpnUserRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateVpnUserRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateVpnUserRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateVpnUserRequestBody body) {
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
        UpdateVpnUserRequest that = (UpdateVpnUserRequest) obj;
        return Objects.equals(this.vpnServerId, that.vpnServerId) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnServerId, userId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpnUserRequest {\n");
        sb.append("    vpnServerId: ").append(toIndentedString(vpnServerId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
