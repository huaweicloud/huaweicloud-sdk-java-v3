package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateServerRequest
 */
public class CreateServerRequest {

    /**
     * 隧道协议类型
     */
    public static final class TunnelProtocolEnum {

        /**
         * Enum SSL for value: "SSL"
         */
        public static final TunnelProtocolEnum SSL = new TunnelProtocolEnum("SSL");

        private static final Map<String, TunnelProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TunnelProtocolEnum> createStaticFields() {
            Map<String, TunnelProtocolEnum> map = new HashMap<>();
            map.put("SSL", SSL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TunnelProtocolEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TunnelProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TunnelProtocolEnum(value));
        }

        public static TunnelProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TunnelProtocolEnum) {
                return this.value.equals(((TunnelProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_protocol")

    private TunnelProtocolEnum tunnelProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_cidr")

    private String clientCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subnets")

    private List<String> localSubnets = null;

    /**
     * 客户端认证类型
     */
    public static final class ClientAuthTypeEnum {

        /**
         * Enum CERT for value: "CERT"
         */
        public static final ClientAuthTypeEnum CERT = new ClientAuthTypeEnum("CERT");

        /**
         * Enum LOCAL_PASSWORD for value: "LOCAL_PASSWORD"
         */
        public static final ClientAuthTypeEnum LOCAL_PASSWORD = new ClientAuthTypeEnum("LOCAL_PASSWORD");

        private static final Map<String, ClientAuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClientAuthTypeEnum> createStaticFields() {
            Map<String, ClientAuthTypeEnum> map = new HashMap<>();
            map.put("CERT", CERT);
            map.put("LOCAL_PASSWORD", LOCAL_PASSWORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClientAuthTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ClientAuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClientAuthTypeEnum(value));
        }

        public static ClientAuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClientAuthTypeEnum) {
                return this.value.equals(((ClientAuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_auth_type")

    private ClientAuthTypeEnum clientAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_certificate")

    private CreateServerRequestServerCertificate serverCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_certificates")

    private List<CreateServerRequestClientCaCertificates> clientCaCertificates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_options")

    private CreateServerRequestSslOptions sslOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_servers")

    private List<String> dnsServers = null;

    public CreateServerRequest withTunnelProtocol(TunnelProtocolEnum tunnelProtocol) {
        this.tunnelProtocol = tunnelProtocol;
        return this;
    }

    /**
     * 隧道协议类型
     * @return tunnelProtocol
     */
    public TunnelProtocolEnum getTunnelProtocol() {
        return tunnelProtocol;
    }

    public void setTunnelProtocol(TunnelProtocolEnum tunnelProtocol) {
        this.tunnelProtocol = tunnelProtocol;
    }

    public CreateServerRequest withClientCidr(String clientCidr) {
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

    public CreateServerRequest withLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
        return this;
    }

    public CreateServerRequest addLocalSubnetsItem(String localSubnetsItem) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        this.localSubnets.add(localSubnetsItem);
        return this;
    }

    public CreateServerRequest withLocalSubnets(Consumer<List<String>> localSubnetsSetter) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        localSubnetsSetter.accept(this.localSubnets);
        return this;
    }

    /**
     * 本端网段列表，至少有一个本端网段
     * @return localSubnets
     */
    public List<String> getLocalSubnets() {
        return localSubnets;
    }

    public void setLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
    }

    public CreateServerRequest withClientAuthType(ClientAuthTypeEnum clientAuthType) {
        this.clientAuthType = clientAuthType;
        return this;
    }

    /**
     * 客户端认证类型
     * @return clientAuthType
     */
    public ClientAuthTypeEnum getClientAuthType() {
        return clientAuthType;
    }

    public void setClientAuthType(ClientAuthTypeEnum clientAuthType) {
        this.clientAuthType = clientAuthType;
    }

    public CreateServerRequest withServerCertificate(CreateServerRequestServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }

    public CreateServerRequest withServerCertificate(
        Consumer<CreateServerRequestServerCertificate> serverCertificateSetter) {
        if (this.serverCertificate == null) {
            this.serverCertificate = new CreateServerRequestServerCertificate();
            serverCertificateSetter.accept(this.serverCertificate);
        }

        return this;
    }

    /**
     * Get serverCertificate
     * @return serverCertificate
     */
    public CreateServerRequestServerCertificate getServerCertificate() {
        return serverCertificate;
    }

    public void setServerCertificate(CreateServerRequestServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
    }

    public CreateServerRequest withClientCaCertificates(
        List<CreateServerRequestClientCaCertificates> clientCaCertificates) {
        this.clientCaCertificates = clientCaCertificates;
        return this;
    }

    public CreateServerRequest addClientCaCertificatesItem(
        CreateServerRequestClientCaCertificates clientCaCertificatesItem) {
        if (this.clientCaCertificates == null) {
            this.clientCaCertificates = new ArrayList<>();
        }
        this.clientCaCertificates.add(clientCaCertificatesItem);
        return this;
    }

    public CreateServerRequest withClientCaCertificates(
        Consumer<List<CreateServerRequestClientCaCertificates>> clientCaCertificatesSetter) {
        if (this.clientCaCertificates == null) {
            this.clientCaCertificates = new ArrayList<>();
        }
        clientCaCertificatesSetter.accept(this.clientCaCertificates);
        return this;
    }

    /**
     * 客户端证书列表。隧道协议类型是SSL且认证方式是证书认证时，必填
     * @return clientCaCertificates
     */
    public List<CreateServerRequestClientCaCertificates> getClientCaCertificates() {
        return clientCaCertificates;
    }

    public void setClientCaCertificates(List<CreateServerRequestClientCaCertificates> clientCaCertificates) {
        this.clientCaCertificates = clientCaCertificates;
    }

    public CreateServerRequest withSslOptions(CreateServerRequestSslOptions sslOptions) {
        this.sslOptions = sslOptions;
        return this;
    }

    public CreateServerRequest withSslOptions(Consumer<CreateServerRequestSslOptions> sslOptionsSetter) {
        if (this.sslOptions == null) {
            this.sslOptions = new CreateServerRequestSslOptions();
            sslOptionsSetter.accept(this.sslOptions);
        }

        return this;
    }

    /**
     * Get sslOptions
     * @return sslOptions
     */
    public CreateServerRequestSslOptions getSslOptions() {
        return sslOptions;
    }

    public void setSslOptions(CreateServerRequestSslOptions sslOptions) {
        this.sslOptions = sslOptions;
    }

    public CreateServerRequest withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    public CreateServerRequest addDnsServersItem(String dnsServersItem) {
        if (this.dnsServers == null) {
            this.dnsServers = new ArrayList<>();
        }
        this.dnsServers.add(dnsServersItem);
        return this;
    }

    public CreateServerRequest withDnsServers(Consumer<List<String>> dnsServersSetter) {
        if (this.dnsServers == null) {
            this.dnsServers = new ArrayList<>();
        }
        dnsServersSetter.accept(this.dnsServers);
        return this;
    }

    /**
     * DNS服务器列表，最多两个DNS
     * @return dnsServers
     */
    public List<String> getDnsServers() {
        return dnsServers;
    }

    public void setDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateServerRequest that = (CreateServerRequest) obj;
        return Objects.equals(this.tunnelProtocol, that.tunnelProtocol)
            && Objects.equals(this.clientCidr, that.clientCidr) && Objects.equals(this.localSubnets, that.localSubnets)
            && Objects.equals(this.clientAuthType, that.clientAuthType)
            && Objects.equals(this.serverCertificate, that.serverCertificate)
            && Objects.equals(this.clientCaCertificates, that.clientCaCertificates)
            && Objects.equals(this.sslOptions, that.sslOptions) && Objects.equals(this.dnsServers, that.dnsServers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tunnelProtocol,
            clientCidr,
            localSubnets,
            clientAuthType,
            serverCertificate,
            clientCaCertificates,
            sslOptions,
            dnsServers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerRequest {\n");
        sb.append("    tunnelProtocol: ").append(toIndentedString(tunnelProtocol)).append("\n");
        sb.append("    clientCidr: ").append(toIndentedString(clientCidr)).append("\n");
        sb.append("    localSubnets: ").append(toIndentedString(localSubnets)).append("\n");
        sb.append("    clientAuthType: ").append(toIndentedString(clientAuthType)).append("\n");
        sb.append("    serverCertificate: ").append(toIndentedString(serverCertificate)).append("\n");
        sb.append("    clientCaCertificates: ").append(toIndentedString(clientCaCertificates)).append("\n");
        sb.append("    sslOptions: ").append(toIndentedString(sslOptions)).append("\n");
        sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
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
