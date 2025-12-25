package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 公网域名、公网IP信息对象。 **取值范围**： 不涉及。
 */
public class PublicEndpointResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_id")

    private String ipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_bandwidth")

    private String ipBandwidth;

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
    @JsonProperty(value = "ip_status")

    private String ipStatus;

    public PublicEndpointResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释**： 公网IP信息。 **取值范围**： 不涉及。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public PublicEndpointResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 端口信息，创建集群时如果未指定端口则默认8000。 **取值范围**： 不涉及。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public PublicEndpointResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**： 当前局点是否支持公网域名。 **取值范围**： 不涉及。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PublicEndpointResponse withIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }

    /**
     * **参数解释**： 公网IP的ID。 **取值范围**： 不涉及。
     * @return ipId
     */
    public String getIpId() {
        return ipId;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public PublicEndpointResponse withIpBandwidth(String ipBandwidth) {
        this.ipBandwidth = ipBandwidth;
        return this;
    }

    /**
     * **参数解释**： 公网IP的带宽信息。 **取值范围**： 不涉及。
     * @return ipBandwidth
     */
    public String getIpBandwidth() {
        return ipBandwidth;
    }

    public void setIpBandwidth(String ipBandwidth) {
        this.ipBandwidth = ipBandwidth;
    }

    public PublicEndpointResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释**： 公网域名子域名信息。 **取值范围**： 不涉及。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public PublicEndpointResponse withDomainNameSuffix(String domainNameSuffix) {
        this.domainNameSuffix = domainNameSuffix;
        return this;
    }

    /**
     * **参数解释**： 公网域名后缀信息。 **取值范围**： 不涉及。
     * @return domainNameSuffix
     */
    public String getDomainNameSuffix() {
        return domainNameSuffix;
    }

    public void setDomainNameSuffix(String domainNameSuffix) {
        this.domainNameSuffix = domainNameSuffix;
    }

    public PublicEndpointResponse withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * **参数解释**： 公网域名后缀信息。 **取值范围**： 不涉及。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public PublicEndpointResponse withDomainNameTtl(Integer domainNameTtl) {
        this.domainNameTtl = domainNameTtl;
        return this;
    }

    /**
     * **参数解释**： 公网域名TTL。 **取值范围**： 不涉及。
     * @return domainNameTtl
     */
    public Integer getDomainNameTtl() {
        return domainNameTtl;
    }

    public void setDomainNameTtl(Integer domainNameTtl) {
        this.domainNameTtl = domainNameTtl;
    }

    public PublicEndpointResponse withDomainNameStatus(String domainNameStatus) {
        this.domainNameStatus = domainNameStatus;
        return this;
    }

    /**
     * **参数解释**： 公网域名状态。 **取值范围**： - ACTIVE：正常 - PENDING_CREATE：创建中 - PENDING_UPDATE：更新中 - PENDING_DELETE：删除中 - PENDING_FREEZE：冻结中 - FREEZE：冻结 - ILLEGAL：违规冻结 - POLICE：公安冻结 - PENDING_DISABLE：暂停中 - DISABLE：暂停 - ERROR：失败
     * @return domainNameStatus
     */
    public String getDomainNameStatus() {
        return domainNameStatus;
    }

    public void setDomainNameStatus(String domainNameStatus) {
        this.domainNameStatus = domainNameStatus;
    }

    public PublicEndpointResponse withIpStatus(String ipStatus) {
        this.ipStatus = ipStatus;
        return this;
    }

    /**
     * **参数解释**： 公网IP状态。 **取值范围**： - FREEZED：冻结 - BIND_ERROR：绑定失败 - BINDING：绑定中 - PENDING_DELETE：释放中 - PENDING_CREATE：创建中 - NOTIFYING：创建中 - NOTIFY_DELETE：释放中 - PENDING_UPDATE：更新中 - DOWN：未绑定 - ACTIVE：绑定 - ELB：绑定ELB - VPN：绑定VPN - ERROR：失败
     * @return ipStatus
     */
    public String getIpStatus() {
        return ipStatus;
    }

    public void setIpStatus(String ipStatus) {
        this.ipStatus = ipStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicEndpointResponse that = (PublicEndpointResponse) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.port, that.port)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.ipId, that.ipId)
            && Objects.equals(this.ipBandwidth, that.ipBandwidth) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.domainNameSuffix, that.domainNameSuffix)
            && Objects.equals(this.zoneName, that.zoneName) && Objects.equals(this.domainNameTtl, that.domainNameTtl)
            && Objects.equals(this.domainNameStatus, that.domainNameStatus)
            && Objects.equals(this.ipStatus, that.ipStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip,
            port,
            enabled,
            ipId,
            ipBandwidth,
            domainName,
            domainNameSuffix,
            zoneName,
            domainNameTtl,
            domainNameStatus,
            ipStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicEndpointResponse {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    ipId: ").append(toIndentedString(ipId)).append("\n");
        sb.append("    ipBandwidth: ").append(toIndentedString(ipBandwidth)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    domainNameSuffix: ").append(toIndentedString(domainNameSuffix)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    domainNameTtl: ").append(toIndentedString(domainNameTtl)).append("\n");
        sb.append("    domainNameStatus: ").append(toIndentedString(domainNameStatus)).append("\n");
        sb.append("    ipStatus: ").append(toIndentedString(ipStatus)).append("\n");
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
