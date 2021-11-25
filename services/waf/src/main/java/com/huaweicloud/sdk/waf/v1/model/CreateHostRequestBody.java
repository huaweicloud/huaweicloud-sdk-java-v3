package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 域名请求体 */
public class CreateHostRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private List<CloudWafServer> server = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificateid")

    private String certificateid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificatename")

    private String certificatename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateHostRequestBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 域名（域名只能由字母、数字、-、_和.组成，长度不能超过64个字符，如www.domain.com）
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public CreateHostRequestBody withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /** 防护域名初始绑定的策略ID,可以通过策略名称调用查询防护策略列表（ListPolicy）接口查询到对应的策略id
     * 
     * @return policyid */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public CreateHostRequestBody withServer(List<CloudWafServer> server) {
        this.server = server;
        return this;
    }

    public CreateHostRequestBody addServerItem(CloudWafServer serverItem) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public CreateHostRequestBody withServer(Consumer<List<CloudWafServer>> serverSetter) {
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

    public CreateHostRequestBody withCertificateid(String certificateid) {
        this.certificateid = certificateid;
        return this;
    }

    /** 证书id，通过查询证书列表接口（ListCertificates）接口获取证书id - 对外协议为HTTP时不需要填写 - 对外协议HTTPS时为必填参数
     * 
     * @return certificateid */
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    public CreateHostRequestBody withCertificatename(String certificatename) {
        this.certificatename = certificatename;
        return this;
    }

    /** 证书名 - 对外协议为HTTP时不需要填写 - 对外协议HTTPS时为必填参数
     * 
     * @return certificatename */
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    public CreateHostRequestBody withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /** 是否使用代理
     * 
     * @return proxy */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    public CreateHostRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 域名描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateHostRequestBody createHostRequestBody = (CreateHostRequestBody) o;
        return Objects.equals(this.hostname, createHostRequestBody.hostname)
            && Objects.equals(this.policyid, createHostRequestBody.policyid)
            && Objects.equals(this.server, createHostRequestBody.server)
            && Objects.equals(this.certificateid, createHostRequestBody.certificateid)
            && Objects.equals(this.certificatename, createHostRequestBody.certificatename)
            && Objects.equals(this.proxy, createHostRequestBody.proxy)
            && Objects.equals(this.description, createHostRequestBody.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, policyid, server, certificateid, certificatename, proxy, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHostRequestBody {\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
