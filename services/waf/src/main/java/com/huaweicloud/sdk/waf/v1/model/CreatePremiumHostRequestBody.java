package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建独享模式域名的请求体
 */
public class CreatePremiumHostRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificateid")

    private String certificateid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificatename")

    private String certificatename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private List<PremiumWafServer> server = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_page")

    private BlockPage blockPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_header_map")

    private Map<String, String> forwardHeaderMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreatePremiumHostRequestBody withCertificateid(String certificateid) {
        this.certificateid = certificateid;
        return this;
    }

    /**
     * 证书id，通过查询证书列表接口（ListCertificates）接口获取证书id   - 对外协议为HTTP时不需要填写   - 对外协议HTTPS时为必填参数
     * @return certificateid
     */
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    public CreatePremiumHostRequestBody withCertificatename(String certificatename) {
        this.certificatename = certificatename;
        return this;
    }

    /**
     * 证书名   - 对外协议为HTTP时不需要填写   - 对外协议HTTPS时为必填参数
     * @return certificatename
     */
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    public CreatePremiumHostRequestBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 防护域名或IP（可带端口）
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public CreatePremiumHostRequestBody withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * 防护域名是否使用代理   - false：不使用代理   - true：使用代理
     * @return proxy
     */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    public CreatePremiumHostRequestBody withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 防护域名初始绑定的防护策略ID,可以通过策略名称调用查询防护策略列表（ListPolicy）接口查询到对应的策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public CreatePremiumHostRequestBody withServer(List<PremiumWafServer> server) {
        this.server = server;
        return this;
    }

    public CreatePremiumHostRequestBody addServerItem(PremiumWafServer serverItem) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public CreatePremiumHostRequestBody withServer(Consumer<List<PremiumWafServer>> serverSetter) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        serverSetter.accept(this.server);
        return this;
    }

    /**
     * 防护域名的源站服务器配置信息
     * @return server
     */
    public List<PremiumWafServer> getServer() {
        return server;
    }

    public void setServer(List<PremiumWafServer> server) {
        this.server = server;
    }

    public CreatePremiumHostRequestBody withBlockPage(BlockPage blockPage) {
        this.blockPage = blockPage;
        return this;
    }

    public CreatePremiumHostRequestBody withBlockPage(Consumer<BlockPage> blockPageSetter) {
        if (this.blockPage == null) {
            this.blockPage = new BlockPage();
            blockPageSetter.accept(this.blockPage);
        }

        return this;
    }

    /**
     * Get blockPage
     * @return blockPage
     */
    public BlockPage getBlockPage() {
        return blockPage;
    }

    public void setBlockPage(BlockPage blockPage) {
        this.blockPage = blockPage;
    }

    public CreatePremiumHostRequestBody withForwardHeaderMap(Map<String, String> forwardHeaderMap) {
        this.forwardHeaderMap = forwardHeaderMap;
        return this;
    }

    public CreatePremiumHostRequestBody putForwardHeaderMapItem(String key, String forwardHeaderMapItem) {
        if (this.forwardHeaderMap == null) {
            this.forwardHeaderMap = new HashMap<>();
        }
        this.forwardHeaderMap.put(key, forwardHeaderMapItem);
        return this;
    }

    public CreatePremiumHostRequestBody withForwardHeaderMap(Consumer<Map<String, String>> forwardHeaderMapSetter) {
        if (this.forwardHeaderMap == null) {
            this.forwardHeaderMap = new HashMap<>();
        }
        forwardHeaderMapSetter.accept(this.forwardHeaderMap);
        return this;
    }

    /**
     * 字段转发配置，WAF会将添加的字段插到header中，转给源站；Key不能跟nginx原生字段重复。Value支持的值包括:   - $time_local   - $request_id   - $connection_requests   - $tenant_id   - $project_id   - $remote_addr   - $remote_port   - $scheme   - $request_method   - $http_host   -$origin_uri   - $request_length   - $ssl_server_name   - $ssl_protocol   - $ssl_curves   - $ssl_session_reused
     * @return forwardHeaderMap
     */
    public Map<String, String> getForwardHeaderMap() {
        return forwardHeaderMap;
    }

    public void setForwardHeaderMap(Map<String, String> forwardHeaderMap) {
        this.forwardHeaderMap = forwardHeaderMap;
    }

    public CreatePremiumHostRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 添加云模式elb接入域名时，请输入elb-shared，否则不输入
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public CreatePremiumHostRequestBody withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 负载均衡器（ELB）id,可以在ELB侧查询其id，添加云模式elb接入域名时，此为必须输入的值
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CreatePremiumHostRequestBody withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 监听器id，可在ELB侧监听器页签下查询其id；不输入时，负载均衡器（ELB）下的所有监听器都将接入WAF防护，包括该ELB下未来新增的符合条件的监听器，添加云模式elb接入域名时，可考虑输入此项id
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreatePremiumHostRequestBody withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * 业务端口，添加云模式elb接入域名时，此为必须输入的值（0 - 65535）
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public CreatePremiumHostRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 防护域名备注
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePremiumHostRequestBody that = (CreatePremiumHostRequestBody) obj;
        return Objects.equals(this.certificateid, that.certificateid)
            && Objects.equals(this.certificatename, that.certificatename)
            && Objects.equals(this.hostname, that.hostname) && Objects.equals(this.proxy, that.proxy)
            && Objects.equals(this.policyid, that.policyid) && Objects.equals(this.server, that.server)
            && Objects.equals(this.blockPage, that.blockPage)
            && Objects.equals(this.forwardHeaderMap, that.forwardHeaderMap) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.listenerId, that.listenerId) && Objects.equals(this.protocolPort, that.protocolPort)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateid,
            certificatename,
            hostname,
            proxy,
            policyid,
            server,
            blockPage,
            forwardHeaderMap,
            mode,
            loadbalancerId,
            listenerId,
            protocolPort,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePremiumHostRequestBody {\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    blockPage: ").append(toIndentedString(blockPage)).append("\n");
        sb.append("    forwardHeaderMap: ").append(toIndentedString(forwardHeaderMap)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
