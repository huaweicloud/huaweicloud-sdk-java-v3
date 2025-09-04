package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备接入实例的接入信息。用户可以使用该结构体中的信息将应用服务器和设备接入到物联网平台。 
 */
public class AccessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_tls_port")

    private Integer nonTlsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "websocket_port")

    private Integer websocketPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_addresses")

    private List<String> privateAddresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_address")

    private List<String> publicAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_address")

    private List<String> ipv6Address = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_whitelist")

    private IPWhiteList ipWhitelist;

    public AccessInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数说明**：接入地址的类型，如应用接入的HTTPS协议的取值为：APP_HTTPS，设备接入的MQTT协议的取值为：DEVICE_MQTT。 **取值范围**： - APP_HTTPS：应用接入HTTPS协议 - APP_AMQP：应用接入AMQP协议 - APP_MQTT：应用接入MQTT协议 - DEVICE_COAP：设备接入COAP协议 - DEVICE_MQTT：设备接入MQTT协议 - DEVICE_HTTPS：设备接入HTTPS协议 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AccessInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数说明**：实例的应用/设备的安全接入端口。 
     * minimum: 0
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public AccessInfo withNonTlsPort(Integer nonTlsPort) {
        this.nonTlsPort = nonTlsPort;
        return this;
    }

    /**
     * **参数说明**：实例的应用/设备的非安全接入端口。返回null时表示该类型的接入地址不支持非安全端口接入。 
     * minimum: 0
     * maximum: 65535
     * @return nonTlsPort
     */
    public Integer getNonTlsPort() {
        return nonTlsPort;
    }

    public void setNonTlsPort(Integer nonTlsPort) {
        this.nonTlsPort = nonTlsPort;
    }

    public AccessInfo withWebsocketPort(Integer websocketPort) {
        this.websocketPort = websocketPort;
        return this;
    }

    /**
     * **参数说明**：基于WebSocket的MQTT接入端口。返回null时表示该类型的接入地址不支持WebSocket端口接入。 
     * minimum: 0
     * maximum: 65535
     * @return websocketPort
     */
    public Integer getWebsocketPort() {
        return websocketPort;
    }

    public void setWebsocketPort(Integer websocketPort) {
        this.websocketPort = websocketPort;
    }

    public AccessInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数说明**：实例的接入域名。 
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public AccessInfo withPrivateAddresses(List<String> privateAddresses) {
        this.privateAddresses = privateAddresses;
        return this;
    }

    public AccessInfo addPrivateAddressesItem(String privateAddressesItem) {
        if (this.privateAddresses == null) {
            this.privateAddresses = new ArrayList<>();
        }
        this.privateAddresses.add(privateAddressesItem);
        return this;
    }

    public AccessInfo withPrivateAddresses(Consumer<List<String>> privateAddressesSetter) {
        if (this.privateAddresses == null) {
            this.privateAddresses = new ArrayList<>();
        }
        privateAddressesSetter.accept(this.privateAddresses);
        return this;
    }

    /**
     * **参数说明**：实例的私网接入地址列表。 
     * @return privateAddresses
     */
    public List<String> getPrivateAddresses() {
        return privateAddresses;
    }

    public void setPrivateAddresses(List<String> privateAddresses) {
        this.privateAddresses = privateAddresses;
    }

    public AccessInfo withPublicAddress(List<String> publicAddress) {
        this.publicAddress = publicAddress;
        return this;
    }

    public AccessInfo addPublicAddressItem(String publicAddressItem) {
        if (this.publicAddress == null) {
            this.publicAddress = new ArrayList<>();
        }
        this.publicAddress.add(publicAddressItem);
        return this;
    }

    public AccessInfo withPublicAddress(Consumer<List<String>> publicAddressSetter) {
        if (this.publicAddress == null) {
            this.publicAddress = new ArrayList<>();
        }
        publicAddressSetter.accept(this.publicAddress);
        return this;
    }

    /**
     * **参数说明**：实例的公网接入地址。 
     * @return publicAddress
     */
    public List<String> getPublicAddress() {
        return publicAddress;
    }

    public void setPublicAddress(List<String> publicAddress) {
        this.publicAddress = publicAddress;
    }

    public AccessInfo withIpv6Address(List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    public AccessInfo addIpv6AddressItem(String ipv6AddressItem) {
        if (this.ipv6Address == null) {
            this.ipv6Address = new ArrayList<>();
        }
        this.ipv6Address.add(ipv6AddressItem);
        return this;
    }

    public AccessInfo withIpv6Address(Consumer<List<String>> ipv6AddressSetter) {
        if (this.ipv6Address == null) {
            this.ipv6Address = new ArrayList<>();
        }
        ipv6AddressSetter.accept(this.ipv6Address);
        return this;
    }

    /**
     * **参数说明**：实例的ipv6接入地址列表。 
     * @return ipv6Address
     */
    public List<String> getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public AccessInfo withIpWhitelist(IPWhiteList ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }

    public AccessInfo withIpWhitelist(Consumer<IPWhiteList> ipWhitelistSetter) {
        if (this.ipWhitelist == null) {
            this.ipWhitelist = new IPWhiteList();
            ipWhitelistSetter.accept(this.ipWhitelist);
        }

        return this;
    }

    /**
     * Get ipWhitelist
     * @return ipWhitelist
     */
    public IPWhiteList getIpWhitelist() {
        return ipWhitelist;
    }

    public void setIpWhitelist(IPWhiteList ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessInfo that = (AccessInfo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.port, that.port)
            && Objects.equals(this.nonTlsPort, that.nonTlsPort)
            && Objects.equals(this.websocketPort, that.websocketPort)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.privateAddresses, that.privateAddresses)
            && Objects.equals(this.publicAddress, that.publicAddress)
            && Objects.equals(this.ipv6Address, that.ipv6Address) && Objects.equals(this.ipWhitelist, that.ipWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            port,
            nonTlsPort,
            websocketPort,
            domainName,
            privateAddresses,
            publicAddress,
            ipv6Address,
            ipWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    nonTlsPort: ").append(toIndentedString(nonTlsPort)).append("\n");
        sb.append("    websocketPort: ").append(toIndentedString(websocketPort)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    privateAddresses: ").append(toIndentedString(privateAddresses)).append("\n");
        sb.append("    publicAddress: ").append(toIndentedString(publicAddress)).append("\n");
        sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
        sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
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
