package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProxyProtocolExtension
 */
public class ProxyProtocolExtension {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_address")

    private String ipv6VipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension")

    private Extension extension;

    public ProxyProtocolExtension withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /**
     * **参数解释**：ipv4 vip地址。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public ProxyProtocolExtension withIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    /**
     * **参数解释**：ipv6 vip地址。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return ipv6VipAddress
     */
    public String getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    public ProxyProtocolExtension withExtension(Extension extension) {
        this.extension = extension;
        return this;
    }

    public ProxyProtocolExtension withExtension(Consumer<Extension> extensionSetter) {
        if (this.extension == null) {
            this.extension = new Extension();
            extensionSetter.accept(this.extension);
        }

        return this;
    }

    /**
     * Get extension
     * @return extension
     */
    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyProtocolExtension that = (ProxyProtocolExtension) obj;
        return Objects.equals(this.vipAddress, that.vipAddress)
            && Objects.equals(this.ipv6VipAddress, that.ipv6VipAddress)
            && Objects.equals(this.extension, that.extension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vipAddress, ipv6VipAddress, extension);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyProtocolExtension {\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
        sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
