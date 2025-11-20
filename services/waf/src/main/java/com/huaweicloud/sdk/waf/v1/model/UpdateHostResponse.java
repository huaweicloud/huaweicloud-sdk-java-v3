package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateHostResponse extends SdkResponse {

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
    @JsonProperty(value = "domainid")

    private String domainid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectid")

    private String projectid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private List<CloudWafServer> server = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_code")

    private String accessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Integer locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificateid")

    private String certificateid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificatename")

    private String certificatename;

    /**
     * 配置的最低TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本，对于低于最低TLS版本的请求，将无法正常访问网站
     */
    public static final class TlsEnum {

        /**
         * Enum TLS_V1_0 for value: "TLS v1.0"
         */
        public static final TlsEnum TLS_V1_0 = new TlsEnum("TLS v1.0");

        /**
         * Enum TLS_V1_1 for value: "TLS v1.1"
         */
        public static final TlsEnum TLS_V1_1 = new TlsEnum("TLS v1.1");

        /**
         * Enum TLS_V1_2 for value: "TLS v1.2"
         */
        public static final TlsEnum TLS_V1_2 = new TlsEnum("TLS v1.2");

        private static final Map<String, TlsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TlsEnum> createStaticFields() {
            Map<String, TlsEnum> map = new HashMap<>();
            map.put("TLS v1.0", TLS_V1_0);
            map.put("TLS v1.1", TLS_V1_1);
            map.put("TLS v1.2", TLS_V1_2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TlsEnum(String value) {
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
        public static TlsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TlsEnum(value));
        }

        public static TlsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TlsEnum) {
                return this.value.equals(((TlsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls")

    private TlsEnum tls;

    /**
     * 加密套件（cipher_1，cipher_2，cipher_3，cipher_4，cipher_default）：  - cipher_1： 加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!DES:!MD5:!PSK:!RC4:!kRSA:!SRP:!3DES:!DSS:!EXP:!CAMELLIA:@STRENGTH   - cipher_2：加密算法为EECDH+AESGCM:EDH+AESGCM   - cipher_3：加密算法为ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-SHA384:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH   - cipher_4：加密算法为ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!EDH    cipher_5：加密算法为AES128-SHA:AES256-SHA:AES128-SHA256:AES256-SHA256:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!EXPORT:!DES:!MD5:!PSK:!RC4:!DHE:@STRENGTH    cipher_6：加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES256-SHA384:ECDHE-RSA-AES256-SHA384:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA256   - cipher_default： 加密算法为ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!AESGCM
     */
    public static final class CipherEnum {

        /**
         * Enum CIPHER_1 for value: "cipher_1"
         */
        public static final CipherEnum CIPHER_1 = new CipherEnum("cipher_1");

        /**
         * Enum CIPHER_2 for value: "cipher_2"
         */
        public static final CipherEnum CIPHER_2 = new CipherEnum("cipher_2");

        /**
         * Enum CIPHER_3 for value: "cipher_3"
         */
        public static final CipherEnum CIPHER_3 = new CipherEnum("cipher_3");

        /**
         * Enum CIPHER_4 for value: "cipher_4"
         */
        public static final CipherEnum CIPHER_4 = new CipherEnum("cipher_4");

        /**
         * Enum CIPHER_5 for value: "cipher_5"
         */
        public static final CipherEnum CIPHER_5 = new CipherEnum("cipher_5");

        /**
         * Enum CIPHER_6 for value: "cipher_6"
         */
        public static final CipherEnum CIPHER_6 = new CipherEnum("cipher_6");

        /**
         * Enum CIPHER_DEFAULT for value: "cipher_default"
         */
        public static final CipherEnum CIPHER_DEFAULT = new CipherEnum("cipher_default");

        private static final Map<String, CipherEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CipherEnum> createStaticFields() {
            Map<String, CipherEnum> map = new HashMap<>();
            map.put("cipher_1", CIPHER_1);
            map.put("cipher_2", CIPHER_2);
            map.put("cipher_3", CIPHER_3);
            map.put("cipher_4", CIPHER_4);
            map.put("cipher_5", CIPHER_5);
            map.put("cipher_6", CIPHER_6);
            map.put("cipher_default", CIPHER_DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CipherEnum(String value) {
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
        public static CipherEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CipherEnum(value));
        }

        public static CipherEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CipherEnum) {
                return this.value.equals(((CipherEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher")

    private CipherEnum cipher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_page")

    private BlockPage blockPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Map<String, String> extend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_tag")

    private String webTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mark")

    private TrafficMark trafficMark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "circuit_breaker")

    private CircuitBreaker circuitBreaker;

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
    @JsonProperty(value = "timeout_config")

    private TimeoutConfig timeoutConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Flag flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_enable")

    private Boolean http2Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive_ip")

    private Boolean exclusiveIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_progress")

    private List<AccessProgress> accessProgress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_header_map")

    private Map<String, String> forwardHeaderMap = null;

    public UpdateHostResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 域名id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateHostResponse withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 创建的云模式防护域名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public UpdateHostResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 防护域名的防护策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public UpdateHostResponse withDomainid(String domainid) {
        this.domainid = domainid;
        return this;
    }

    /**
     * 账号ID,对应华为云控制台用户名->我的凭证->账号ID
     * @return domainid
     */
    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }

    public UpdateHostResponse withProjectid(String projectid) {
        this.projectid = projectid;
        return this;
    }

    /**
     * 项目ID，对应华为云控制台用户名->我的凭证->项目列表->项目ID
     * @return projectid
     */
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public UpdateHostResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，对应华为云控制台用户名->企业->项目管理->点击项目名称->ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateHostResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 后端包含的协议类型：HTTPS、HTTP、HTTP&HTTPS
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public UpdateHostResponse withServer(List<CloudWafServer> server) {
        this.server = server;
        return this;
    }

    public UpdateHostResponse addServerItem(CloudWafServer serverItem) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public UpdateHostResponse withServer(Consumer<List<CloudWafServer>> serverSetter) {
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

    public UpdateHostResponse withProxy(Boolean proxy) {
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

    public UpdateHostResponse withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 域名防护状态：  - -1：bypass，该域名的请求直接到达其后端服务器，不再经过WAF  - 0：暂停防护，WAF只转发该域名的请求，不做攻击检测  - 1：开启防护，WAF根据您配置的策略进行攻击检测
     * @return protectStatus
     */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    public UpdateHostResponse withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * 域名接入状态，0表示未接入，1表示已接入
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public UpdateHostResponse withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    /**
     * cname前缀
     * @return accessCode
     */
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public UpdateHostResponse withLocked(Integer locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 预留参数，用于后期设计冻结域名，解锁域名功能，目前暂不支持
     * @return locked
     */
    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public UpdateHostResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建防护域名的时间戳（毫秒）
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public UpdateHostResponse withCertificateid(String certificateid) {
        this.certificateid = certificateid;
        return this;
    }

    /**
     * https证书id
     * @return certificateid
     */
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    public UpdateHostResponse withCertificatename(String certificatename) {
        this.certificatename = certificatename;
        return this;
    }

    /**
     * 证书名称
     * @return certificatename
     */
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    public UpdateHostResponse withTls(TlsEnum tls) {
        this.tls = tls;
        return this;
    }

    /**
     * 配置的最低TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本，对于低于最低TLS版本的请求，将无法正常访问网站
     * @return tls
     */
    public TlsEnum getTls() {
        return tls;
    }

    public void setTls(TlsEnum tls) {
        this.tls = tls;
    }

    public UpdateHostResponse withCipher(CipherEnum cipher) {
        this.cipher = cipher;
        return this;
    }

    /**
     * 加密套件（cipher_1，cipher_2，cipher_3，cipher_4，cipher_default）：  - cipher_1： 加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!DES:!MD5:!PSK:!RC4:!kRSA:!SRP:!3DES:!DSS:!EXP:!CAMELLIA:@STRENGTH   - cipher_2：加密算法为EECDH+AESGCM:EDH+AESGCM   - cipher_3：加密算法为ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-SHA384:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH   - cipher_4：加密算法为ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!EDH    cipher_5：加密算法为AES128-SHA:AES256-SHA:AES128-SHA256:AES256-SHA256:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!EXPORT:!DES:!MD5:!PSK:!RC4:!DHE:@STRENGTH    cipher_6：加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES256-SHA384:ECDHE-RSA-AES256-SHA384:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA256   - cipher_default： 加密算法为ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!AESGCM
     * @return cipher
     */
    public CipherEnum getCipher() {
        return cipher;
    }

    public void setCipher(CipherEnum cipher) {
        this.cipher = cipher;
    }

    public UpdateHostResponse withBlockPage(BlockPage blockPage) {
        this.blockPage = blockPage;
        return this;
    }

    public UpdateHostResponse withBlockPage(Consumer<BlockPage> blockPageSetter) {
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

    public UpdateHostResponse withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public UpdateHostResponse putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public UpdateHostResponse withExtend(Consumer<Map<String, String>> extendSetter) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }

    /**
     * 扩展字段，用于保存防护域名的一些配置信息。
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    public UpdateHostResponse withWebTag(String webTag) {
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

    public UpdateHostResponse withTrafficMark(TrafficMark trafficMark) {
        this.trafficMark = trafficMark;
        return this;
    }

    public UpdateHostResponse withTrafficMark(Consumer<TrafficMark> trafficMarkSetter) {
        if (this.trafficMark == null) {
            this.trafficMark = new TrafficMark();
            trafficMarkSetter.accept(this.trafficMark);
        }

        return this;
    }

    /**
     * Get trafficMark
     * @return trafficMark
     */
    public TrafficMark getTrafficMark() {
        return trafficMark;
    }

    public void setTrafficMark(TrafficMark trafficMark) {
        this.trafficMark = trafficMark;
    }

    public UpdateHostResponse withCircuitBreaker(CircuitBreaker circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
        return this;
    }

    public UpdateHostResponse withCircuitBreaker(Consumer<CircuitBreaker> circuitBreakerSetter) {
        if (this.circuitBreaker == null) {
            this.circuitBreaker = new CircuitBreaker();
            circuitBreakerSetter.accept(this.circuitBreaker);
        }

        return this;
    }

    /**
     * Get circuitBreaker
     * @return circuitBreaker
     */
    public CircuitBreaker getCircuitBreaker() {
        return circuitBreaker;
    }

    public void setCircuitBreaker(CircuitBreaker circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
    }

    public UpdateHostResponse withLbAlgorithm(LbAlgorithmEnum lbAlgorithm) {
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

    public UpdateHostResponse withTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }

    public UpdateHostResponse withTimeoutConfig(Consumer<TimeoutConfig> timeoutConfigSetter) {
        if (this.timeoutConfig == null) {
            this.timeoutConfig = new TimeoutConfig();
            timeoutConfigSetter.accept(this.timeoutConfig);
        }

        return this;
    }

    /**
     * Get timeoutConfig
     * @return timeoutConfig
     */
    public TimeoutConfig getTimeoutConfig() {
        return timeoutConfig;
    }

    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    public UpdateHostResponse withFlag(Flag flag) {
        this.flag = flag;
        return this;
    }

    public UpdateHostResponse withFlag(Consumer<Flag> flagSetter) {
        if (this.flag == null) {
            this.flag = new Flag();
            flagSetter.accept(this.flag);
        }

        return this;
    }

    /**
     * Get flag
     * @return flag
     */
    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public UpdateHostResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 网站备注
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateHostResponse withHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
        return this;
    }

    /**
     * 是否支持http2   - true：表示支持http2   - false：表示不支持http2
     * @return http2Enable
     */
    public Boolean getHttp2Enable() {
        return http2Enable;
    }

    public void setHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
    }

    public UpdateHostResponse withExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
        return this;
    }

    /**
     * 是否使用独享ip   - true：使用独享ip   - false：不使用独享ip
     * @return exclusiveIp
     */
    public Boolean getExclusiveIp() {
        return exclusiveIp;
    }

    public void setExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
    }

    public UpdateHostResponse withAccessProgress(List<AccessProgress> accessProgress) {
        this.accessProgress = accessProgress;
        return this;
    }

    public UpdateHostResponse addAccessProgressItem(AccessProgress accessProgressItem) {
        if (this.accessProgress == null) {
            this.accessProgress = new ArrayList<>();
        }
        this.accessProgress.add(accessProgressItem);
        return this;
    }

    public UpdateHostResponse withAccessProgress(Consumer<List<AccessProgress>> accessProgressSetter) {
        if (this.accessProgress == null) {
            this.accessProgress = new ArrayList<>();
        }
        accessProgressSetter.accept(this.accessProgress);
        return this;
    }

    /**
     * 接入进度，仅用于新版console(前端)使用
     * @return accessProgress
     */
    public List<AccessProgress> getAccessProgress() {
        return accessProgress;
    }

    public void setAccessProgress(List<AccessProgress> accessProgress) {
        this.accessProgress = accessProgress;
    }

    public UpdateHostResponse withForwardHeaderMap(Map<String, String> forwardHeaderMap) {
        this.forwardHeaderMap = forwardHeaderMap;
        return this;
    }

    public UpdateHostResponse putForwardHeaderMapItem(String key, String forwardHeaderMapItem) {
        if (this.forwardHeaderMap == null) {
            this.forwardHeaderMap = new HashMap<>();
        }
        this.forwardHeaderMap.put(key, forwardHeaderMapItem);
        return this;
    }

    public UpdateHostResponse withForwardHeaderMap(Consumer<Map<String, String>> forwardHeaderMapSetter) {
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
        UpdateHostResponse that = (UpdateHostResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.hostname, that.hostname)
            && Objects.equals(this.policyid, that.policyid) && Objects.equals(this.domainid, that.domainid)
            && Objects.equals(this.projectid, that.projectid)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.server, that.server)
            && Objects.equals(this.proxy, that.proxy) && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.accessStatus, that.accessStatus) && Objects.equals(this.accessCode, that.accessCode)
            && Objects.equals(this.locked, that.locked) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.certificateid, that.certificateid)
            && Objects.equals(this.certificatename, that.certificatename) && Objects.equals(this.tls, that.tls)
            && Objects.equals(this.cipher, that.cipher) && Objects.equals(this.blockPage, that.blockPage)
            && Objects.equals(this.extend, that.extend) && Objects.equals(this.webTag, that.webTag)
            && Objects.equals(this.trafficMark, that.trafficMark)
            && Objects.equals(this.circuitBreaker, that.circuitBreaker)
            && Objects.equals(this.lbAlgorithm, that.lbAlgorithm)
            && Objects.equals(this.timeoutConfig, that.timeoutConfig) && Objects.equals(this.flag, that.flag)
            && Objects.equals(this.description, that.description) && Objects.equals(this.http2Enable, that.http2Enable)
            && Objects.equals(this.exclusiveIp, that.exclusiveIp)
            && Objects.equals(this.accessProgress, that.accessProgress)
            && Objects.equals(this.forwardHeaderMap, that.forwardHeaderMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hostname,
            policyid,
            domainid,
            projectid,
            enterpriseProjectId,
            protocol,
            server,
            proxy,
            protectStatus,
            accessStatus,
            accessCode,
            locked,
            timestamp,
            certificateid,
            certificatename,
            tls,
            cipher,
            blockPage,
            extend,
            webTag,
            trafficMark,
            circuitBreaker,
            lbAlgorithm,
            timeoutConfig,
            flag,
            description,
            http2Enable,
            exclusiveIp,
            accessProgress,
            forwardHeaderMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHostResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    domainid: ").append(toIndentedString(domainid)).append("\n");
        sb.append("    projectid: ").append(toIndentedString(projectid)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
        sb.append("    blockPage: ").append(toIndentedString(blockPage)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
        sb.append("    trafficMark: ").append(toIndentedString(trafficMark)).append("\n");
        sb.append("    circuitBreaker: ").append(toIndentedString(circuitBreaker)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    timeoutConfig: ").append(toIndentedString(timeoutConfig)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    exclusiveIp: ").append(toIndentedString(exclusiveIp)).append("\n");
        sb.append("    accessProgress: ").append(toIndentedString(accessProgress)).append("\n");
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
