package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAadDomainRequestBody
 */
public class CreateAadDomainRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private List<String> ips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_server_type")

    private Integer realServerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_http")

    private List<Integer> portHttp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_https")

    private List<Integer> portHttps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_server")

    private String realServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overseas_type")

    private String overseasType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_switch")

    private String wafSwitch;

    public CreateAadDomainRequestBody withDomainName(String domainName) {
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

    public CreateAadDomainRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，与接入的高防实例所属企业项目保持一致。可在华为云EPS服务中查看企业项目id，default企业项目id为\"0\"。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateAadDomainRequestBody withIps(List<String> ips) {
        this.ips = ips;
        return this;
    }

    public CreateAadDomainRequestBody addIpsItem(String ipsItem) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public CreateAadDomainRequestBody withIps(Consumer<List<String>> ipsSetter) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        ipsSetter.accept(this.ips);
        return this;
    }

    /**
     * 高防实例ip列表。多个高防实例ip必须属于同一企业项目。
     * @return ips
     */
    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    public CreateAadDomainRequestBody withRealServerType(Integer realServerType) {
        this.realServerType = realServerType;
        return this;
    }

    /**
     * 源站类型。 0 - 源站IP， 1 - 源站域名。
     * @return realServerType
     */
    public Integer getRealServerType() {
        return realServerType;
    }

    public void setRealServerType(Integer realServerType) {
        this.realServerType = realServerType;
    }

    public CreateAadDomainRequestBody withPortHttp(List<Integer> portHttp) {
        this.portHttp = portHttp;
        return this;
    }

    public CreateAadDomainRequestBody addPortHttpItem(Integer portHttpItem) {
        if (this.portHttp == null) {
            this.portHttp = new ArrayList<>();
        }
        this.portHttp.add(portHttpItem);
        return this;
    }

    public CreateAadDomainRequestBody withPortHttp(Consumer<List<Integer>> portHttpSetter) {
        if (this.portHttp == null) {
            this.portHttp = new ArrayList<>();
        }
        portHttpSetter.accept(this.portHttp);
        return this;
    }

    /**
     * HTTP端口，与port_https不能同时为空。DDoS高防支持的HTTP端口可在控制台查看。
     * @return portHttp
     */
    public List<Integer> getPortHttp() {
        return portHttp;
    }

    public void setPortHttp(List<Integer> portHttp) {
        this.portHttp = portHttp;
    }

    public CreateAadDomainRequestBody withPortHttps(List<Integer> portHttps) {
        this.portHttps = portHttps;
        return this;
    }

    public CreateAadDomainRequestBody addPortHttpsItem(Integer portHttpsItem) {
        if (this.portHttps == null) {
            this.portHttps = new ArrayList<>();
        }
        this.portHttps.add(portHttpsItem);
        return this;
    }

    public CreateAadDomainRequestBody withPortHttps(Consumer<List<Integer>> portHttpsSetter) {
        if (this.portHttps == null) {
            this.portHttps = new ArrayList<>();
        }
        portHttpsSetter.accept(this.portHttps);
        return this;
    }

    /**
     * HTTPS端口，与port_http不能同时为空。DDoS高防支持的HTTPS端口可在控制台查看。
     * @return portHttps
     */
    public List<Integer> getPortHttps() {
        return portHttps;
    }

    public void setPortHttps(List<Integer> portHttps) {
        this.portHttps = portHttps;
    }

    public CreateAadDomainRequestBody withRealServer(String realServer) {
        this.realServer = realServer;
        return this;
    }

    /**
     * 源站（源站ip/源站域名）
     * @return realServer
     */
    public String getRealServer() {
        return realServer;
    }

    public void setRealServer(String realServer) {
        this.realServer = realServer;
    }

    public CreateAadDomainRequestBody withOverseasType(String overseasType) {
        this.overseasType = overseasType;
        return this;
    }

    /**
     * 防护区域，0-大陆，1-海外
     * @return overseasType
     */
    public String getOverseasType() {
        return overseasType;
    }

    public void setOverseasType(String overseasType) {
        this.overseasType = overseasType;
    }

    public CreateAadDomainRequestBody withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * 证书名称（必须是已经存在的证书）
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public CreateAadDomainRequestBody withWafSwitch(String wafSwitch) {
        this.wafSwitch = wafSwitch;
        return this;
    }

    /**
     * 开启0，关闭1
     * @return wafSwitch
     */
    public String getWafSwitch() {
        return wafSwitch;
    }

    public void setWafSwitch(String wafSwitch) {
        this.wafSwitch = wafSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAadDomainRequestBody that = (CreateAadDomainRequestBody) obj;
        return Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId) && Objects.equals(this.ips, that.ips)
            && Objects.equals(this.realServerType, that.realServerType) && Objects.equals(this.portHttp, that.portHttp)
            && Objects.equals(this.portHttps, that.portHttps) && Objects.equals(this.realServer, that.realServer)
            && Objects.equals(this.overseasType, that.overseasType) && Objects.equals(this.certName, that.certName)
            && Objects.equals(this.wafSwitch, that.wafSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName,
            enterpriseProjectId,
            ips,
            realServerType,
            portHttp,
            portHttps,
            realServer,
            overseasType,
            certName,
            wafSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAadDomainRequestBody {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    realServerType: ").append(toIndentedString(realServerType)).append("\n");
        sb.append("    portHttp: ").append(toIndentedString(portHttp)).append("\n");
        sb.append("    portHttps: ").append(toIndentedString(portHttps)).append("\n");
        sb.append("    realServer: ").append(toIndentedString(realServer)).append("\n");
        sb.append("    overseasType: ").append(toIndentedString(overseasType)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    wafSwitch: ").append(toIndentedString(wafSwitch)).append("\n");
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
