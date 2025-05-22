package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 内网域名信息。 **取值范围**： 不涉及。
 */
public class PrivateEndpointResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name_suffix")

    private String domainNameSuffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name_ttl")

    private Integer domainNameTtl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name_status")

    private String domainNameStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_ip")

    private String elbIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_manage_ip_status")

    private Integer bindManageIpStatus;

    public PrivateEndpointResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释**： 内网IP信息，多个IP逗号分割。 **取值范围**： 不涉及。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public PrivateEndpointResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 端口信息。 **取值范围**： 8000~30000
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public PrivateEndpointResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释**： 子域名前缀。 **取值范围**： 不涉及。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public PrivateEndpointResponse withDomainNameSuffix(String domainNameSuffix) {
        this.domainNameSuffix = domainNameSuffix;
        return this;
    }

    /**
     * **参数解释**： 子域名后缀。 **取值范围**： 不涉及。
     * @return domainNameSuffix
     */
    public String getDomainNameSuffix() {
        return domainNameSuffix;
    }

    public void setDomainNameSuffix(String domainNameSuffix) {
        this.domainNameSuffix = domainNameSuffix;
    }

    public PrivateEndpointResponse withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * **参数解释**： 子域名信息。 **取值范围**： 不涉及。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public PrivateEndpointResponse withDomainNameTtl(Integer domainNameTtl) {
        this.domainNameTtl = domainNameTtl;
        return this;
    }

    /**
     * **参数解释**： 内网域名TTL。 **取值范围**： 不涉及。
     * @return domainNameTtl
     */
    public Integer getDomainNameTtl() {
        return domainNameTtl;
    }

    public void setDomainNameTtl(Integer domainNameTtl) {
        this.domainNameTtl = domainNameTtl;
    }

    public PrivateEndpointResponse withDomainNameStatus(String domainNameStatus) {
        this.domainNameStatus = domainNameStatus;
        return this;
    }

    /**
     * **参数解释**： 内网域名状态。 **取值范围**： 不涉及。
     * @return domainNameStatus
     */
    public String getDomainNameStatus() {
        return domainNameStatus;
    }

    public void setDomainNameStatus(String domainNameStatus) {
        this.domainNameStatus = domainNameStatus;
    }

    public PrivateEndpointResponse withElbIp(String elbIp) {
        this.elbIp = elbIp;
        return this;
    }

    /**
     * **参数解释**： ELB的内网IP信息。 **取值范围**： 不涉及。
     * @return elbIp
     */
    public String getElbIp() {
        return elbIp;
    }

    public void setElbIp(String elbIp) {
        this.elbIp = elbIp;
    }

    public PrivateEndpointResponse withBindManageIpStatus(Integer bindManageIpStatus) {
        this.bindManageIpStatus = bindManageIpStatus;
        return this;
    }

    /**
     * **参数解释**： IP绑定状态。 **取值范围**： 不涉及。
     * @return bindManageIpStatus
     */
    public Integer getBindManageIpStatus() {
        return bindManageIpStatus;
    }

    public void setBindManageIpStatus(Integer bindManageIpStatus) {
        this.bindManageIpStatus = bindManageIpStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateEndpointResponse that = (PrivateEndpointResponse) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.port, that.port)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.domainNameSuffix, that.domainNameSuffix)
            && Objects.equals(this.zoneName, that.zoneName) && Objects.equals(this.domainNameTtl, that.domainNameTtl)
            && Objects.equals(this.domainNameStatus, that.domainNameStatus) && Objects.equals(this.elbIp, that.elbIp)
            && Objects.equals(this.bindManageIpStatus, that.bindManageIpStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip,
            port,
            domainName,
            domainNameSuffix,
            zoneName,
            domainNameTtl,
            domainNameStatus,
            elbIp,
            bindManageIpStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateEndpointResponse {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    domainNameSuffix: ").append(toIndentedString(domainNameSuffix)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    domainNameTtl: ").append(toIndentedString(domainNameTtl)).append("\n");
        sb.append("    domainNameStatus: ").append(toIndentedString(domainNameStatus)).append("\n");
        sb.append("    elbIp: ").append(toIndentedString(elbIp)).append("\n");
        sb.append("    bindManageIpStatus: ").append(toIndentedString(bindManageIpStatus)).append("\n");
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
