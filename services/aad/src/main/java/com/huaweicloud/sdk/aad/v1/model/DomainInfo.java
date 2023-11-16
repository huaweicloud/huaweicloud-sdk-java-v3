package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DomainInfo
 */
public class DomainInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname")

    private String cname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private List<String> protocol = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_server_type")

    private Integer realServerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_servers")

    private String realServers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_status")

    private Integer wafStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public DomainInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DomainInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainInfo withCname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * 域名cname
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public DomainInfo withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    public DomainInfo addProtocolItem(String protocolItem) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        this.protocol.add(protocolItem);
        return this;
    }

    public DomainInfo withProtocol(Consumer<List<String>> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * 域名协议
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    public DomainInfo withRealServerType(Integer realServerType) {
        this.realServerType = realServerType;
        return this;
    }

    /**
     * 源站类型
     * @return realServerType
     */
    public Integer getRealServerType() {
        return realServerType;
    }

    public void setRealServerType(Integer realServerType) {
        this.realServerType = realServerType;
    }

    public DomainInfo withRealServers(String realServers) {
        this.realServers = realServers;
        return this;
    }

    /**
     * 源站
     * @return realServers
     */
    public String getRealServers() {
        return realServers;
    }

    public void setRealServers(String realServers) {
        this.realServers = realServers;
    }

    public DomainInfo withWafStatus(Integer wafStatus) {
        this.wafStatus = wafStatus;
        return this;
    }

    /**
     * waf防护状态
     * @return wafStatus
     */
    public Integer getWafStatus() {
        return wafStatus;
    }

    public void setWafStatus(Integer wafStatus) {
        this.wafStatus = wafStatus;
    }

    public DomainInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainInfo that = (DomainInfo) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.cname, that.cname) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.realServerType, that.realServerType)
            && Objects.equals(this.realServers, that.realServers) && Objects.equals(this.wafStatus, that.wafStatus)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(domainId, domainName, cname, protocol, realServerType, realServers, wafStatus, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainInfo {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    realServerType: ").append(toIndentedString(realServerType)).append("\n");
        sb.append("    realServers: ").append(toIndentedString(realServers)).append("\n");
        sb.append("    wafStatus: ").append(toIndentedString(wafStatus)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
