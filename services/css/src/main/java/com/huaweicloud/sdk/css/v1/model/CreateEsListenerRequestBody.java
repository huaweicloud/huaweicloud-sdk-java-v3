package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateEsListenerRequestBody
 */
public class CreateEsListenerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_cert_id")

    private String serverCertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_cert_id")

    private String caCertId;

    public CreateEsListenerRequestBody withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型，支持HTTP、HTTPS
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreateEsListenerRequestBody withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * 端口。
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public CreateEsListenerRequestBody withServerCertId(String serverCertId) {
        this.serverCertId = serverCertId;
        return this;
    }

    /**
     * server证书Id。如protocol为HTTPS则该字段必选。
     * @return serverCertId
     */
    public String getServerCertId() {
        return serverCertId;
    }

    public void setServerCertId(String serverCertId) {
        this.serverCertId = serverCertId;
    }

    public CreateEsListenerRequestBody withCaCertId(String caCertId) {
        this.caCertId = caCertId;
        return this;
    }

    /**
     * CA证书Id。如protocol为HTTPS且为双向认证时则该字段必选。
     * @return caCertId
     */
    public String getCaCertId() {
        return caCertId;
    }

    public void setCaCertId(String caCertId) {
        this.caCertId = caCertId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEsListenerRequestBody that = (CreateEsListenerRequestBody) obj;
        return Objects.equals(this.protocol, that.protocol) && Objects.equals(this.protocolPort, that.protocolPort)
            && Objects.equals(this.serverCertId, that.serverCertId) && Objects.equals(this.caCertId, that.caCertId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, protocolPort, serverCertId, caCertId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEsListenerRequestBody {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    serverCertId: ").append(toIndentedString(serverCertId)).append("\n");
        sb.append("    caCertId: ").append(toIndentedString(caCertId)).append("\n");
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
