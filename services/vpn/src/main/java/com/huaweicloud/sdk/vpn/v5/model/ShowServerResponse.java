package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowServerResponse
 */
public class ShowServerResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p2c_vgw_id")

    private String p2cVgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_cidr")

    private String clientCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subnets")

    private List<String> localSubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_auth_type")

    private String clientAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_protocol")

    private String tunnelProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_certificate")

    private ShowServerResponseServerCertificate serverCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_certificates")

    private List<QueryClientCaCertificateBody> clientCaCertificates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_options")

    private ShowServerResponseSslOptions sslOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public ShowServerResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 服务端 ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowServerResponse withP2cVgwId(String p2cVgwId) {
        this.p2cVgwId = p2cVgwId;
        return this;
    }

    /**
     * P2C VPN 网关 ID
     * @return p2cVgwId
     */
    public String getP2cVgwId() {
        return p2cVgwId;
    }

    public void setP2cVgwId(String p2cVgwId) {
        this.p2cVgwId = p2cVgwId;
    }

    public ShowServerResponse withClientCidr(String clientCidr) {
        this.clientCidr = clientCidr;
        return this;
    }

    /**
     * 客户端网段
     * @return clientCidr
     */
    public String getClientCidr() {
        return clientCidr;
    }

    public void setClientCidr(String clientCidr) {
        this.clientCidr = clientCidr;
    }

    public ShowServerResponse withLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
        return this;
    }

    public ShowServerResponse addLocalSubnetsItem(String localSubnetsItem) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        this.localSubnets.add(localSubnetsItem);
        return this;
    }

    public ShowServerResponse withLocalSubnets(Consumer<List<String>> localSubnetsSetter) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        localSubnetsSetter.accept(this.localSubnets);
        return this;
    }

    /**
     * 本端网段列表
     * @return localSubnets
     */
    public List<String> getLocalSubnets() {
        return localSubnets;
    }

    public void setLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
    }

    public ShowServerResponse withClientAuthType(String clientAuthType) {
        this.clientAuthType = clientAuthType;
        return this;
    }

    /**
     * 客户端认证类型
     * @return clientAuthType
     */
    public String getClientAuthType() {
        return clientAuthType;
    }

    public void setClientAuthType(String clientAuthType) {
        this.clientAuthType = clientAuthType;
    }

    public ShowServerResponse withTunnelProtocol(String tunnelProtocol) {
        this.tunnelProtocol = tunnelProtocol;
        return this;
    }

    /**
     * 隧道协议类型
     * @return tunnelProtocol
     */
    public String getTunnelProtocol() {
        return tunnelProtocol;
    }

    public void setTunnelProtocol(String tunnelProtocol) {
        this.tunnelProtocol = tunnelProtocol;
    }

    public ShowServerResponse withServerCertificate(ShowServerResponseServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }

    public ShowServerResponse withServerCertificate(
        Consumer<ShowServerResponseServerCertificate> serverCertificateSetter) {
        if (this.serverCertificate == null) {
            this.serverCertificate = new ShowServerResponseServerCertificate();
            serverCertificateSetter.accept(this.serverCertificate);
        }

        return this;
    }

    /**
     * Get serverCertificate
     * @return serverCertificate
     */
    public ShowServerResponseServerCertificate getServerCertificate() {
        return serverCertificate;
    }

    public void setServerCertificate(ShowServerResponseServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
    }

    public ShowServerResponse withClientCaCertificates(List<QueryClientCaCertificateBody> clientCaCertificates) {
        this.clientCaCertificates = clientCaCertificates;
        return this;
    }

    public ShowServerResponse addClientCaCertificatesItem(QueryClientCaCertificateBody clientCaCertificatesItem) {
        if (this.clientCaCertificates == null) {
            this.clientCaCertificates = new ArrayList<>();
        }
        this.clientCaCertificates.add(clientCaCertificatesItem);
        return this;
    }

    public ShowServerResponse withClientCaCertificates(
        Consumer<List<QueryClientCaCertificateBody>> clientCaCertificatesSetter) {
        if (this.clientCaCertificates == null) {
            this.clientCaCertificates = new ArrayList<>();
        }
        clientCaCertificatesSetter.accept(this.clientCaCertificates);
        return this;
    }

    /**
     * Get clientCaCertificates
     * @return clientCaCertificates
     */
    public List<QueryClientCaCertificateBody> getClientCaCertificates() {
        return clientCaCertificates;
    }

    public void setClientCaCertificates(List<QueryClientCaCertificateBody> clientCaCertificates) {
        this.clientCaCertificates = clientCaCertificates;
    }

    public ShowServerResponse withSslOptions(ShowServerResponseSslOptions sslOptions) {
        this.sslOptions = sslOptions;
        return this;
    }

    public ShowServerResponse withSslOptions(Consumer<ShowServerResponseSslOptions> sslOptionsSetter) {
        if (this.sslOptions == null) {
            this.sslOptions = new ShowServerResponseSslOptions();
            sslOptionsSetter.accept(this.sslOptions);
        }

        return this;
    }

    /**
     * Get sslOptions
     * @return sslOptions
     */
    public ShowServerResponseSslOptions getSslOptions() {
        return sslOptions;
    }

    public void setSslOptions(ShowServerResponseSslOptions sslOptions) {
        this.sslOptions = sslOptions;
    }

    public ShowServerResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 服务端状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowServerResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ShowServerResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerResponse that = (ShowServerResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.p2cVgwId, that.p2cVgwId)
            && Objects.equals(this.clientCidr, that.clientCidr) && Objects.equals(this.localSubnets, that.localSubnets)
            && Objects.equals(this.clientAuthType, that.clientAuthType)
            && Objects.equals(this.tunnelProtocol, that.tunnelProtocol)
            && Objects.equals(this.serverCertificate, that.serverCertificate)
            && Objects.equals(this.clientCaCertificates, that.clientCaCertificates)
            && Objects.equals(this.sslOptions, that.sslOptions) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            p2cVgwId,
            clientCidr,
            localSubnets,
            clientAuthType,
            tunnelProtocol,
            serverCertificate,
            clientCaCertificates,
            sslOptions,
            status,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    p2cVgwId: ").append(toIndentedString(p2cVgwId)).append("\n");
        sb.append("    clientCidr: ").append(toIndentedString(clientCidr)).append("\n");
        sb.append("    localSubnets: ").append(toIndentedString(localSubnets)).append("\n");
        sb.append("    clientAuthType: ").append(toIndentedString(clientAuthType)).append("\n");
        sb.append("    tunnelProtocol: ").append(toIndentedString(tunnelProtocol)).append("\n");
        sb.append("    serverCertificate: ").append(toIndentedString(serverCertificate)).append("\n");
        sb.append("    clientCaCertificates: ").append(toIndentedString(clientCaCertificates)).append("\n");
        sb.append("    sslOptions: ").append(toIndentedString(sslOptions)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
