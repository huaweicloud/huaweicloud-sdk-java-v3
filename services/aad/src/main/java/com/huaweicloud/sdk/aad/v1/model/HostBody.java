package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HostBody
 */
public class HostBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vips")

    private List<String> vips = null;

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

    public HostBody withDomainName(String domainName) {
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

    public HostBody withEnterpriseProjectId(String enterpriseProjectId) {
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

    public HostBody withVips(List<String> vips) {
        this.vips = vips;
        return this;
    }

    public HostBody addVipsItem(String vipsItem) {
        if (this.vips == null) {
            this.vips = new ArrayList<>();
        }
        this.vips.add(vipsItem);
        return this;
    }

    public HostBody withVips(Consumer<List<String>> vipsSetter) {
        if (this.vips == null) {
            this.vips = new ArrayList<>();
        }
        vipsSetter.accept(this.vips);
        return this;
    }

    /**
     * 高防实例ip列表。多个高防实例ip必须属于同一企业项目。
     * @return vips
     */
    public List<String> getVips() {
        return vips;
    }

    public void setVips(List<String> vips) {
        this.vips = vips;
    }

    public HostBody withRealServerType(Integer realServerType) {
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

    public HostBody withPortHttp(List<Integer> portHttp) {
        this.portHttp = portHttp;
        return this;
    }

    public HostBody addPortHttpItem(Integer portHttpItem) {
        if (this.portHttp == null) {
            this.portHttp = new ArrayList<>();
        }
        this.portHttp.add(portHttpItem);
        return this;
    }

    public HostBody withPortHttp(Consumer<List<Integer>> portHttpSetter) {
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

    public HostBody withPortHttps(List<Integer> portHttps) {
        this.portHttps = portHttps;
        return this;
    }

    public HostBody addPortHttpsItem(Integer portHttpsItem) {
        if (this.portHttps == null) {
            this.portHttps = new ArrayList<>();
        }
        this.portHttps.add(portHttpsItem);
        return this;
    }

    public HostBody withPortHttps(Consumer<List<Integer>> portHttpsSetter) {
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

    public HostBody withRealServer(String realServer) {
        this.realServer = realServer;
        return this;
    }

    /**
     * 源站ip/源站域名
     * @return realServer
     */
    public String getRealServer() {
        return realServer;
    }

    public void setRealServer(String realServer) {
        this.realServer = realServer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostBody that = (HostBody) obj;
        return Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.vips, that.vips) && Objects.equals(this.realServerType, that.realServerType)
            && Objects.equals(this.portHttp, that.portHttp) && Objects.equals(this.portHttps, that.portHttps)
            && Objects.equals(this.realServer, that.realServer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, enterpriseProjectId, vips, realServerType, portHttp, portHttps, realServer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostBody {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    vips: ").append(toIndentedString(vips)).append("\n");
        sb.append("    realServerType: ").append(toIndentedString(realServerType)).append("\n");
        sb.append("    portHttp: ").append(toIndentedString(portHttp)).append("\n");
        sb.append("    portHttps: ").append(toIndentedString(portHttps)).append("\n");
        sb.append("    realServer: ").append(toIndentedString(realServer)).append("\n");
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
