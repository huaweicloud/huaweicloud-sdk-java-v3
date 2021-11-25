package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowHostResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_code")

    private String accessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificateid")

    private String certificateid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificatename")

    private String certificatename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private List<CloudWafServer> server = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive_ip")

    private Boolean exclusiveIp;

    public ShowHostResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 域名id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowHostResponse withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 创建的云模式防护域名
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public ShowHostResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /** 策略id
     * 
     * @return policyid */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public ShowHostResponse withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    /** cname前缀
     * 
     * @return accessCode */
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public ShowHostResponse withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /** 域名防护状态： - -1：bypass，该域名的请求直接到达其后端服务器，不再经过WAF - 0：暂停防护，WAF只转发该域名的请求，不做攻击检测 - 1：开启防护，WAF根据您配置的策略进行攻击检测
     * 
     * @return protectStatus */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ShowHostResponse withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /** 接入状态
     * 
     * @return accessStatus */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public ShowHostResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /** 后端包含的协议类型：HTTPS、HTTP、HTTP&HTTPS
     * 
     * @return protocol */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ShowHostResponse withCertificateid(String certificateid) {
        this.certificateid = certificateid;
        return this;
    }

    /** https证书id
     * 
     * @return certificateid */
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    public ShowHostResponse withCertificatename(String certificatename) {
        this.certificatename = certificatename;
        return this;
    }

    /** 证书名称
     * 
     * @return certificatename */
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    public ShowHostResponse withServer(List<CloudWafServer> server) {
        this.server = server;
        return this;
    }

    public ShowHostResponse addServerItem(CloudWafServer serverItem) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public ShowHostResponse withServer(Consumer<List<CloudWafServer>> serverSetter) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        serverSetter.accept(this.server);
        return this;
    }

    /** 源站信息
     * 
     * @return server */
    public List<CloudWafServer> getServer() {
        return server;
    }

    public void setServer(List<CloudWafServer> server) {
        this.server = server;
    }

    public ShowHostResponse withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /** 是否开启了代理
     * 
     * @return proxy */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    public ShowHostResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** 创建防护域名的时间
     * 
     * @return timestamp */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ShowHostResponse withExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
        return this;
    }

    /** 是否使用独享ip
     * 
     * @return exclusiveIp */
    public Boolean getExclusiveIp() {
        return exclusiveIp;
    }

    public void setExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHostResponse showHostResponse = (ShowHostResponse) o;
        return Objects.equals(this.id, showHostResponse.id) && Objects.equals(this.hostname, showHostResponse.hostname)
            && Objects.equals(this.policyid, showHostResponse.policyid)
            && Objects.equals(this.accessCode, showHostResponse.accessCode)
            && Objects.equals(this.protectStatus, showHostResponse.protectStatus)
            && Objects.equals(this.accessStatus, showHostResponse.accessStatus)
            && Objects.equals(this.protocol, showHostResponse.protocol)
            && Objects.equals(this.certificateid, showHostResponse.certificateid)
            && Objects.equals(this.certificatename, showHostResponse.certificatename)
            && Objects.equals(this.server, showHostResponse.server)
            && Objects.equals(this.proxy, showHostResponse.proxy)
            && Objects.equals(this.timestamp, showHostResponse.timestamp)
            && Objects.equals(this.exclusiveIp, showHostResponse.exclusiveIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hostname,
            policyid,
            accessCode,
            protectStatus,
            accessStatus,
            protocol,
            certificateid,
            certificatename,
            server,
            proxy,
            timestamp,
            exclusiveIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHostResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    exclusiveIp: ").append(toIndentedString(exclusiveIp)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
