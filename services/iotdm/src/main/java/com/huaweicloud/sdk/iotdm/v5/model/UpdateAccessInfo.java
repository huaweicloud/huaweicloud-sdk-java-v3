package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备接入实例的接入信息。用户可以使用该结构体中的信息将应用服务器和设备接入到物联网平台。 约束：只有企业版实例支持自定义接入信息。 
 */
public class UpdateAccessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private String accessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_addresses_enable")

    private Boolean publicAddressesEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_whitelist")

    private IPWhiteList ipWhitelist;

    public UpdateAccessInfo withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * **参数说明**：接入地址的类型，如应用接入的HTTPS协议的取值为：APP_HTTPS，设备接入的MQTT协议的取值为：DEVICE_MQTT。 **取值范围**： - APP_HTTPS：应用接入HTTPS协议 - APP_AMQP：应用接入AMQP协议 - APP_MQTT：应用接入MQTT协议 - DEVICE_COAP：设备接入COAP协议 - DEVICE_MQTT：设备接入MQTT协议 - DEVICE_HTTPS：设备接入HTTPS协议 
     * @return accessType
     */
    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public UpdateAccessInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数说明**：接入域名，如果需要更新域名，则携带该字段。 
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public UpdateAccessInfo withPublicAddressesEnable(Boolean publicAddressesEnable) {
        this.publicAddressesEnable = publicAddressesEnable;
        return this;
    }

    /**
     * **参数说明**：是否配置公网接入地址。 **取值范围**： - true：配置公网接入地址，平台将自动分配公网接入地址。约束：分配地址后将不能修改或删除。 
     * @return publicAddressesEnable
     */
    public Boolean getPublicAddressesEnable() {
        return publicAddressesEnable;
    }

    public void setPublicAddressesEnable(Boolean publicAddressesEnable) {
        this.publicAddressesEnable = publicAddressesEnable;
    }

    public UpdateAccessInfo withIpWhitelist(IPWhiteList ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }

    public UpdateAccessInfo withIpWhitelist(Consumer<IPWhiteList> ipWhitelistSetter) {
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
        UpdateAccessInfo that = (UpdateAccessInfo) obj;
        return Objects.equals(this.accessType, that.accessType) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.publicAddressesEnable, that.publicAddressesEnable)
            && Objects.equals(this.ipWhitelist, that.ipWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessType, domainName, publicAddressesEnable, ipWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessInfo {\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    publicAddressesEnable: ").append(toIndentedString(publicAddressesEnable)).append("\n");
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
