package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 域名请求体
 */
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
    @JsonProperty(value = "web_tag")

    private String webTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive_ip")

    private Boolean exclusiveIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paid_type")

    private String paidType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

    /**
     * LB负载均衡，仅专业版和企业版支持配置负载均衡算法   - 源IP Hash：将某个IP的请求定向到同一个服务器   - 加权轮询：所有请求将按权重轮流分配给源站服务器   - Session Hash：将某个Session标识的请求定向到同一个源站服务器，请确保在域名添加完毕后配置攻击惩罚的流量标识，否则Session Hash配置不生效
     */
    public static final class LbAlgorithmEnum {

        /**
         * Enum IP_HASH for value: "ip_hash"
         */
        public static final LbAlgorithmEnum IP_HASH = new LbAlgorithmEnum("ip_hash");

        /**
         * Enum ROUND_ROBIN for value: "round_robin"
         */
        public static final LbAlgorithmEnum ROUND_ROBIN = new LbAlgorithmEnum("round_robin");

        /**
         * Enum SESSION_HASH for value: "session_hash"
         */
        public static final LbAlgorithmEnum SESSION_HASH = new LbAlgorithmEnum("session_hash");

        private static final Map<String, LbAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LbAlgorithmEnum> createStaticFields() {
            Map<String, LbAlgorithmEnum> map = new HashMap<>();
            map.put("ip_hash", IP_HASH);
            map.put("round_robin", ROUND_ROBIN);
            map.put("session_hash", SESSION_HASH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LbAlgorithmEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LbAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LbAlgorithmEnum(value));
        }

        public static LbAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LbAlgorithmEnum) {
                return this.value.equals(((LbAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    private LbAlgorithmEnum lbAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_header_map")

    private Map<String, String> forwardHeaderMap = null;

    public CreateHostRequestBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 域名（域名只能由字母、数字、-、_和.组成，长度不能超过64个字符，如www.domain.com）
     * @return hostname
     */
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

    /**
     * 防护域名初始绑定的策略ID,可以通过策略名称调用查询防护策略列表（ListPolicy）接口查询到对应的策略id
     * @return policyid
     */
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

    /**
     * 防护域名的源站服务器配置信息
     * @return server
     */
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

    public CreateHostRequestBody withCertificatename(String certificatename) {
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

    public CreateHostRequestBody withWebTag(String webTag) {
        this.webTag = webTag;
        return this;
    }

    /**
     * 网站名称，对应WAF控制台域名详情中的网站名称
     * @return webTag
     */
    public String getWebTag() {
        return webTag;
    }

    public void setWebTag(String webTag) {
        this.webTag = webTag;
    }

    public CreateHostRequestBody withExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
        return this;
    }

    /**
     * 是否使用独享ip   - true：使用独享ip   - false：不实用独享ip
     * @return exclusiveIp
     */
    public Boolean getExclusiveIp() {
        return exclusiveIp;
    }

    public void setExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
    }

    public CreateHostRequestBody withPaidType(String paidType) {
        this.paidType = paidType;
        return this;
    }

    /**
     * 套餐付费模式，默认值为prePaid。prePaid：包周期款模式；postPaid：按需模式。
     * @return paidType
     */
    public String getPaidType() {
        return paidType;
    }

    public void setPaidType(String paidType) {
        this.paidType = paidType;
    }

    public CreateHostRequestBody withProxy(Boolean proxy) {
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

    public CreateHostRequestBody withLbAlgorithm(LbAlgorithmEnum lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    /**
     * LB负载均衡，仅专业版和企业版支持配置负载均衡算法   - 源IP Hash：将某个IP的请求定向到同一个服务器   - 加权轮询：所有请求将按权重轮流分配给源站服务器   - Session Hash：将某个Session标识的请求定向到同一个源站服务器，请确保在域名添加完毕后配置攻击惩罚的流量标识，否则Session Hash配置不生效
     * @return lbAlgorithm
     */
    public LbAlgorithmEnum getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(LbAlgorithmEnum lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public CreateHostRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 域名描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateHostRequestBody withForwardHeaderMap(Map<String, String> forwardHeaderMap) {
        this.forwardHeaderMap = forwardHeaderMap;
        return this;
    }

    public CreateHostRequestBody putForwardHeaderMapItem(String key, String forwardHeaderMapItem) {
        if (this.forwardHeaderMap == null) {
            this.forwardHeaderMap = new HashMap<>();
        }
        this.forwardHeaderMap.put(key, forwardHeaderMapItem);
        return this;
    }

    public CreateHostRequestBody withForwardHeaderMap(Consumer<Map<String, String>> forwardHeaderMapSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHostRequestBody that = (CreateHostRequestBody) obj;
        return Objects.equals(this.hostname, that.hostname) && Objects.equals(this.policyid, that.policyid)
            && Objects.equals(this.server, that.server) && Objects.equals(this.certificateid, that.certificateid)
            && Objects.equals(this.certificatename, that.certificatename) && Objects.equals(this.webTag, that.webTag)
            && Objects.equals(this.exclusiveIp, that.exclusiveIp) && Objects.equals(this.paidType, that.paidType)
            && Objects.equals(this.proxy, that.proxy) && Objects.equals(this.lbAlgorithm, that.lbAlgorithm)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.forwardHeaderMap, that.forwardHeaderMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname,
            policyid,
            server,
            certificateid,
            certificatename,
            webTag,
            exclusiveIp,
            paidType,
            proxy,
            lbAlgorithm,
            description,
            forwardHeaderMap);
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
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
        sb.append("    exclusiveIp: ").append(toIndentedString(exclusiveIp)).append("\n");
        sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    forwardHeaderMap: ").append(toIndentedString(forwardHeaderMap)).append("\n");
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
