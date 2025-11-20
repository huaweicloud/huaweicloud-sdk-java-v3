package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDomainNameConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

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
    @JsonProperty(value = "pp_enable")

    private Integer ppEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overseas_type")

    private Integer overseasType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls")

    private String tls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher")

    private String cipher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_enable")

    private Boolean http2Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header_map")

    private Object headerMap;

    public ShowDomainNameConfigResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowDomainNameConfigResponse withDomainName(String domainName) {
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

    public ShowDomainNameConfigResponse withRealServerType(Integer realServerType) {
        this.realServerType = realServerType;
        return this;
    }

    /**
     * 源站类型，0 - 源站IP， 1 - 源站域名
     * minimum: 0
     * maximum: 2000
     * @return realServerType
     */
    public Integer getRealServerType() {
        return realServerType;
    }

    public void setRealServerType(Integer realServerType) {
        this.realServerType = realServerType;
    }

    public ShowDomainNameConfigResponse withPortHttp(List<Integer> portHttp) {
        this.portHttp = portHttp;
        return this;
    }

    public ShowDomainNameConfigResponse addPortHttpItem(Integer portHttpItem) {
        if (this.portHttp == null) {
            this.portHttp = new ArrayList<>();
        }
        this.portHttp.add(portHttpItem);
        return this;
    }

    public ShowDomainNameConfigResponse withPortHttp(Consumer<List<Integer>> portHttpSetter) {
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

    public ShowDomainNameConfigResponse withPortHttps(List<Integer> portHttps) {
        this.portHttps = portHttps;
        return this;
    }

    public ShowDomainNameConfigResponse addPortHttpsItem(Integer portHttpsItem) {
        if (this.portHttps == null) {
            this.portHttps = new ArrayList<>();
        }
        this.portHttps.add(portHttpsItem);
        return this;
    }

    public ShowDomainNameConfigResponse withPortHttps(Consumer<List<Integer>> portHttpsSetter) {
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

    public ShowDomainNameConfigResponse withRealServer(String realServer) {
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

    public ShowDomainNameConfigResponse withPpEnable(Integer ppEnable) {
        this.ppEnable = ppEnable;
        return this;
    }

    /**
     * pp是否开启, 1-开启，0-关闭
     * minimum: 0
     * maximum: 2000
     * @return ppEnable
     */
    public Integer getPpEnable() {
        return ppEnable;
    }

    public void setPpEnable(Integer ppEnable) {
        this.ppEnable = ppEnable;
    }

    public ShowDomainNameConfigResponse withOverseasType(Integer overseasType) {
        this.overseasType = overseasType;
        return this;
    }

    /**
     * 防护区域,0-大陆,1-海外
     * minimum: 0
     * maximum: 2000
     * @return overseasType
     */
    public Integer getOverseasType() {
        return overseasType;
    }

    public void setOverseasType(Integer overseasType) {
        this.overseasType = overseasType;
    }

    public ShowDomainNameConfigResponse withTls(String tls) {
        this.tls = tls;
        return this;
    }

    /**
     * tls(请求参数type=waf时)
     * @return tls
     */
    public String getTls() {
        return tls;
    }

    public void setTls(String tls) {
        this.tls = tls;
    }

    public ShowDomainNameConfigResponse withCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }

    /**
     * 加密套件(请求参数type=waf时)
     * @return cipher
     */
    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public ShowDomainNameConfigResponse withHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
        return this;
    }

    /**
     * 是否允许http2(请求参数type=waf时)
     * @return http2Enable
     */
    public Boolean getHttp2Enable() {
        return http2Enable;
    }

    public void setHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
    }

    public ShowDomainNameConfigResponse withHeaderMap(Object headerMap) {
        this.headerMap = headerMap;
        return this;
    }

    /**
     * 字段转发(请求参数type=waf时)
     * @return headerMap
     */
    public Object getHeaderMap() {
        return headerMap;
    }

    public void setHeaderMap(Object headerMap) {
        this.headerMap = headerMap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainNameConfigResponse that = (ShowDomainNameConfigResponse) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.realServerType, that.realServerType) && Objects.equals(this.portHttp, that.portHttp)
            && Objects.equals(this.portHttps, that.portHttps) && Objects.equals(this.realServer, that.realServer)
            && Objects.equals(this.ppEnable, that.ppEnable) && Objects.equals(this.overseasType, that.overseasType)
            && Objects.equals(this.tls, that.tls) && Objects.equals(this.cipher, that.cipher)
            && Objects.equals(this.http2Enable, that.http2Enable) && Objects.equals(this.headerMap, that.headerMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            domainName,
            realServerType,
            portHttp,
            portHttps,
            realServer,
            ppEnable,
            overseasType,
            tls,
            cipher,
            http2Enable,
            headerMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainNameConfigResponse {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    realServerType: ").append(toIndentedString(realServerType)).append("\n");
        sb.append("    portHttp: ").append(toIndentedString(portHttp)).append("\n");
        sb.append("    portHttps: ").append(toIndentedString(portHttps)).append("\n");
        sb.append("    realServer: ").append(toIndentedString(realServer)).append("\n");
        sb.append("    ppEnable: ").append(toIndentedString(ppEnable)).append("\n");
        sb.append("    overseasType: ").append(toIndentedString(overseasType)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    headerMap: ").append(toIndentedString(headerMap)).append("\n");
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
