package com.huaweicloud.sdk.identitycenteroidc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartDeviceAuthorizationReqBody
 */
public class StartDeviceAuthorizationReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_url")

    private String startUrl;

    public StartDeviceAuthorizationReqBody withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 在IAM身份中心注册的客户端的唯一标识符
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public StartDeviceAuthorizationReqBody withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * 为客户端生成的秘密字符串。客户端将使用此字符串在后续调用中获得服务的身份验证
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public StartDeviceAuthorizationReqBody withStartUrl(String startUrl) {
        this.startUrl = startUrl;
        return this;
    }

    /**
     * 访问门户的URL
     * @return startUrl
     */
    public String getStartUrl() {
        return startUrl;
    }

    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartDeviceAuthorizationReqBody that = (StartDeviceAuthorizationReqBody) obj;
        return Objects.equals(this.clientId, that.clientId) && Objects.equals(this.clientSecret, that.clientSecret)
            && Objects.equals(this.startUrl, that.startUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientSecret, startUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartDeviceAuthorizationReqBody {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
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
