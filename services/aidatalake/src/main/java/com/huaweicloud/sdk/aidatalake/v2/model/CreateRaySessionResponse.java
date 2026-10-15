package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateRaySessionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_grpc_server_port")

    private String rayGrpcServerPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public CreateRaySessionResponse withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**：会话ID。 **取值范围**：长度为1~36的英文、数字和中划线的组合。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public CreateRaySessionResponse withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * **参数解释**：pod-agency委托Secret名称，用于挂载联邦身份凭证。非AIHub联邦认证场景下返回空字符串。 **约束限制**：不涉及。 **取值范围**：长度不超过256个字符，为空时返回空字符串。 **默认取值**：空字符串。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public CreateRaySessionResponse withRayGrpcServerPort(String rayGrpcServerPort) {
        this.rayGrpcServerPort = rayGrpcServerPort;
        return this;
    }

    /**
     * **参数解释**：Ray集群GRPC连接端口号。 **约束限制**：不涉及。 **取值范围**：长度不超过5个字符，为空时返回空字符串。 **默认取值**：空字符串。
     * @return rayGrpcServerPort
     */
    public String getRayGrpcServerPort() {
        return rayGrpcServerPort;
    }

    public void setRayGrpcServerPort(String rayGrpcServerPort) {
        this.rayGrpcServerPort = rayGrpcServerPort;
    }

    public CreateRaySessionResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRaySessionResponse that = (CreateRaySessionResponse) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.rayGrpcServerPort, that.rayGrpcServerPort)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, secretName, rayGrpcServerPort, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRaySessionResponse {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    rayGrpcServerPort: ").append(toIndentedString(rayGrpcServerPort)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
