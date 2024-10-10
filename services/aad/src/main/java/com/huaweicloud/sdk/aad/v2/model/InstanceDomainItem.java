package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceDomainItem
 */
public class InstanceDomainItem {

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
    @JsonProperty(value = "domain_status")

    private String domainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc_status")

    private Integer ccStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_cert_status")

    private Integer httpsCertStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private List<String> protocolType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_server_type")

    private Integer realServerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_servers")

    private String realServers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_status")

    private Integer wafStatus;

    public InstanceDomainItem withDomainId(String domainId) {
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

    public InstanceDomainItem withDomainName(String domainName) {
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

    public InstanceDomainItem withCname(String cname) {
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

    public InstanceDomainItem withDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    /**
     * 域名状态 NORMAL = '0', FREEZE = '1'
     * @return domainStatus
     */
    public String getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    public InstanceDomainItem withCcStatus(Integer ccStatus) {
        this.ccStatus = ccStatus;
        return this;
    }

    /**
     * cc防护状态
     * @return ccStatus
     */
    public Integer getCcStatus() {
        return ccStatus;
    }

    public void setCcStatus(Integer ccStatus) {
        this.ccStatus = ccStatus;
    }

    public InstanceDomainItem withHttpsCertStatus(Integer httpsCertStatus) {
        this.httpsCertStatus = httpsCertStatus;
        return this;
    }

    /**
     * 证书状态：1---已上传  2---未上传
     * @return httpsCertStatus
     */
    public Integer getHttpsCertStatus() {
        return httpsCertStatus;
    }

    public void setHttpsCertStatus(Integer httpsCertStatus) {
        this.httpsCertStatus = httpsCertStatus;
    }

    public InstanceDomainItem withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * 证书名称
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public InstanceDomainItem withProtocolType(List<String> protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    public InstanceDomainItem addProtocolTypeItem(String protocolTypeItem) {
        if (this.protocolType == null) {
            this.protocolType = new ArrayList<>();
        }
        this.protocolType.add(protocolTypeItem);
        return this;
    }

    public InstanceDomainItem withProtocolType(Consumer<List<String>> protocolTypeSetter) {
        if (this.protocolType == null) {
            this.protocolType = new ArrayList<>();
        }
        protocolTypeSetter.accept(this.protocolType);
        return this;
    }

    /**
     * 域名协议
     * @return protocolType
     */
    public List<String> getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(List<String> protocolType) {
        this.protocolType = protocolType;
    }

    public InstanceDomainItem withRealServerType(Integer realServerType) {
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

    public InstanceDomainItem withRealServers(String realServers) {
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

    public InstanceDomainItem withWafStatus(Integer wafStatus) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDomainItem that = (InstanceDomainItem) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.cname, that.cname) && Objects.equals(this.domainStatus, that.domainStatus)
            && Objects.equals(this.ccStatus, that.ccStatus)
            && Objects.equals(this.httpsCertStatus, that.httpsCertStatus)
            && Objects.equals(this.certName, that.certName) && Objects.equals(this.protocolType, that.protocolType)
            && Objects.equals(this.realServerType, that.realServerType)
            && Objects.equals(this.realServers, that.realServers) && Objects.equals(this.wafStatus, that.wafStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            domainName,
            cname,
            domainStatus,
            ccStatus,
            httpsCertStatus,
            certName,
            protocolType,
            realServerType,
            realServers,
            wafStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDomainItem {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
        sb.append("    ccStatus: ").append(toIndentedString(ccStatus)).append("\n");
        sb.append("    httpsCertStatus: ").append(toIndentedString(httpsCertStatus)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    realServerType: ").append(toIndentedString(realServerType)).append("\n");
        sb.append("    realServers: ").append(toIndentedString(realServers)).append("\n");
        sb.append("    wafStatus: ").append(toIndentedString(wafStatus)).append("\n");
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
