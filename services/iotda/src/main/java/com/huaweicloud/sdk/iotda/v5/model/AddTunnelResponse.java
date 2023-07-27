package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class AddTunnelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_id")

    private String tunnelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_access_token")

    private String tunnelAccessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_in")

    private Integer expiresIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_uri")

    private String tunnelUri;

    public AddTunnelResponse withTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }

    /**
     * 隧道ID
     * @return tunnelId
     */
    public String getTunnelId() {
        return tunnelId;
    }

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    public AddTunnelResponse withTunnelAccessToken(String tunnelAccessToken) {
        this.tunnelAccessToken = tunnelAccessToken;
        return this;
    }

    /**
     * 鉴权信息
     * @return tunnelAccessToken
     */
    public String getTunnelAccessToken() {
        return tunnelAccessToken;
    }

    public void setTunnelAccessToken(String tunnelAccessToken) {
        this.tunnelAccessToken = tunnelAccessToken;
    }

    public AddTunnelResponse withExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * 鉴权信息的过期时间, 单位：秒
     * minimum: 0
     * maximum: 86400000
     * @return expiresIn
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public AddTunnelResponse withTunnelUri(String tunnelUri) {
        this.tunnelUri = tunnelUri;
        return this;
    }

    /**
     * websocket接入地址
     * @return tunnelUri
     */
    public String getTunnelUri() {
        return tunnelUri;
    }

    public void setTunnelUri(String tunnelUri) {
        this.tunnelUri = tunnelUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddTunnelResponse that = (AddTunnelResponse) obj;
        return Objects.equals(this.tunnelId, that.tunnelId)
            && Objects.equals(this.tunnelAccessToken, that.tunnelAccessToken)
            && Objects.equals(this.expiresIn, that.expiresIn) && Objects.equals(this.tunnelUri, that.tunnelUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tunnelId, tunnelAccessToken, expiresIn, tunnelUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTunnelResponse {\n");
        sb.append("    tunnelId: ").append(toIndentedString(tunnelId)).append("\n");
        sb.append("    tunnelAccessToken: ").append(toIndentedString(tunnelAccessToken)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
        sb.append("    tunnelUri: ").append(toIndentedString(tunnelUri)).append("\n");
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
