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
 * UpdateServerRequest
 */
public class UpdateServerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_cidr")

    private String clientCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subnets")

    private List<String> localSubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_certificate")

    private UpdateServerRequestServerCertificate serverCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_options")

    private UpdateServerRequestSslOptions sslOptions;

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

    public UpdateServerRequest withClientCidr(String clientCidr) {
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

    public UpdateServerRequest withLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
        return this;
    }

    public UpdateServerRequest addLocalSubnetsItem(String localSubnetsItem) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        this.localSubnets.add(localSubnetsItem);
        return this;
    }

    public UpdateServerRequest withLocalSubnets(Consumer<List<String>> localSubnetsSetter) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        localSubnetsSetter.accept(this.localSubnets);
        return this;
    }

    /**
     * 本端网段列表,至少有一个本端网段
     * @return localSubnets
     */
    public List<String> getLocalSubnets() {
        return localSubnets;
    }

    public void setLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
    }

    public UpdateServerRequest withServerCertificate(UpdateServerRequestServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }

    public UpdateServerRequest withServerCertificate(
        Consumer<UpdateServerRequestServerCertificate> serverCertificateSetter) {
        if (this.serverCertificate == null) {
            this.serverCertificate = new UpdateServerRequestServerCertificate();
            serverCertificateSetter.accept(this.serverCertificate);
        }

        return this;
    }

    /**
     * Get serverCertificate
     * @return serverCertificate
     */
    public UpdateServerRequestServerCertificate getServerCertificate() {
        return serverCertificate;
    }

    public void setServerCertificate(UpdateServerRequestServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
    }

    public UpdateServerRequest withSslOptions(UpdateServerRequestSslOptions sslOptions) {
        this.sslOptions = sslOptions;
        return this;
    }

    public UpdateServerRequest withSslOptions(Consumer<UpdateServerRequestSslOptions> sslOptionsSetter) {
        if (this.sslOptions == null) {
            this.sslOptions = new UpdateServerRequestSslOptions();
            sslOptionsSetter.accept(this.sslOptions);
        }

        return this;
    }

    /**
     * Get sslOptions
     * @return sslOptions
     */
    public UpdateServerRequestSslOptions getSslOptions() {
        return sslOptions;
    }

    public void setSslOptions(UpdateServerRequestSslOptions sslOptions) {
        this.sslOptions = sslOptions;
    }

    public UpdateServerRequest withClientAuthType(ClientAuthTypeEnum clientAuthType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateServerRequest that = (UpdateServerRequest) obj;
        return Objects.equals(this.clientCidr, that.clientCidr) && Objects.equals(this.localSubnets, that.localSubnets)
            && Objects.equals(this.serverCertificate, that.serverCertificate)
            && Objects.equals(this.sslOptions, that.sslOptions)
            && Objects.equals(this.clientAuthType, that.clientAuthType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientCidr, localSubnets, serverCertificate, sslOptions, clientAuthType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerRequest {\n");
        sb.append("    clientCidr: ").append(toIndentedString(clientCidr)).append("\n");
        sb.append("    localSubnets: ").append(toIndentedString(localSubnets)).append("\n");
        sb.append("    serverCertificate: ").append(toIndentedString(serverCertificate)).append("\n");
        sb.append("    sslOptions: ").append(toIndentedString(sslOptions)).append("\n");
        sb.append("    clientAuthType: ").append(toIndentedString(clientAuthType)).append("\n");
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
