package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
public class CreatePremiumHostResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    @JacksonXmlProperty(localName = "hostname")

    private String hostname;

    /**
     * 对外协议，客户端（例如浏览器）请求访问网站的协议类型
     */
    public static final class ProtocolEnum {

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("HTTPS");

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");

        /**
         * Enum HTTP_HTTPS for value: "HTTP&HTTPS"
         */
        public static final ProtocolEnum HTTP_HTTPS = new ProtocolEnum("HTTP&HTTPS");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("HTTPS", HTTPS);
            map.put("HTTP", HTTP);
            map.put("HTTP&HTTPS", HTTP_HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    @JacksonXmlProperty(localName = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    @JacksonXmlProperty(localName = "server")

    private List<PremiumWafServer> server = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    @JacksonXmlProperty(localName = "proxy")

    private Boolean proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    @JacksonXmlProperty(localName = "locked")

    private Integer locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    @JacksonXmlProperty(localName = "timestamp")

    private Long timestamp;

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

        /**
         * Enum TLS_V1_3 for value: "TLS v1.3"
         */
        public static final TlsEnum TLS_V1_3 = new TlsEnum("TLS v1.3");

        private static final Map<String, TlsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TlsEnum> createStaticFields() {
            Map<String, TlsEnum> map = new HashMap<>();
            map.put("TLS v1.0", TLS_V1_0);
            map.put("TLS v1.1", TLS_V1_1);
            map.put("TLS v1.2", TLS_V1_2);
            map.put("TLS v1.3", TLS_V1_3);
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
            TlsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TlsEnum(value);
            }
            return result;
        }

        public static TlsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TlsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "tls")

    private TlsEnum tls;

    /**
     * 对外协议为https时才有cipher参数，加密套件（cipher_1，cipher_2，cipher_3，cipher_4，cipher_default）：  - cipher_1： 加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!DES:!MD5:!PSK:!RC4:!kRSA:!SRP:!3DES:!DSS:!EXP:!CAMELLIA:@STRENGTH   - cipher_2：加密算法为EECDH+AESGCM:EDH+AESGCM   - cipher_3：加密算法为ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-SHA384:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH   - cipher_4：加密算法为ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!EDH   - cipher_default： 加密算法为ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!AESGCM
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
            CipherEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CipherEnum(value);
            }
            return result;
        }

        public static CipherEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CipherEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "cipher")

    private CipherEnum cipher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    @JacksonXmlProperty(localName = "extend")

    private Map<String, String> extend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    @JacksonXmlProperty(localName = "flag")

    private Flag flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    @JacksonXmlProperty(localName = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainid")

    @JacksonXmlProperty(localName = "domainid")

    private String domainid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectid")

    @JacksonXmlProperty(localName = "projectid")

    private String projectid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    @JacksonXmlProperty(localName = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    @JacksonXmlProperty(localName = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_page")

    @JacksonXmlProperty(localName = "block_page")

    private BlockPage blockPage;

    public CreatePremiumHostResponse withId(String id) {
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

    public CreatePremiumHostResponse withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 防护域名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public CreatePremiumHostResponse withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 对外协议，客户端（例如浏览器）请求访问网站的协议类型
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public CreatePremiumHostResponse withServer(List<PremiumWafServer> server) {
        this.server = server;
        return this;
    }

    public CreatePremiumHostResponse addServerItem(PremiumWafServer serverItem) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public CreatePremiumHostResponse withServer(Consumer<List<PremiumWafServer>> serverSetter) {
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

    public CreatePremiumHostResponse withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * 是否使用代理   - true：代表使用代理   - false：代表未使用代理
     * @return proxy
     */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    public CreatePremiumHostResponse withLocked(Integer locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 域名冻结状态，0表示未冻结，1表示为冻结，冗余参数
     * @return locked
     */
    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public CreatePremiumHostResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建域名的时间，13位毫秒时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public CreatePremiumHostResponse withTls(TlsEnum tls) {
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

    public CreatePremiumHostResponse withCipher(CipherEnum cipher) {
        this.cipher = cipher;
        return this;
    }

    /**
     * 对外协议为https时才有cipher参数，加密套件（cipher_1，cipher_2，cipher_3，cipher_4，cipher_default）：  - cipher_1： 加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!DES:!MD5:!PSK:!RC4:!kRSA:!SRP:!3DES:!DSS:!EXP:!CAMELLIA:@STRENGTH   - cipher_2：加密算法为EECDH+AESGCM:EDH+AESGCM   - cipher_3：加密算法为ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-SHA384:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH   - cipher_4：加密算法为ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!EDH   - cipher_default： 加密算法为ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!AESGCM
     * @return cipher
     */
    public CipherEnum getCipher() {
        return cipher;
    }

    public void setCipher(CipherEnum cipher) {
        this.cipher = cipher;
    }

    public CreatePremiumHostResponse withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public CreatePremiumHostResponse putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public CreatePremiumHostResponse withExtend(Consumer<Map<String, String>> extendSetter) {
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

    public CreatePremiumHostResponse withFlag(Flag flag) {
        this.flag = flag;
        return this;
    }

    public CreatePremiumHostResponse withFlag(Consumer<Flag> flagSetter) {
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

    public CreatePremiumHostResponse withDescription(String description) {
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

    public CreatePremiumHostResponse withPolicyid(String policyid) {
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

    public CreatePremiumHostResponse withDomainid(String domainid) {
        this.domainid = domainid;
        return this;
    }

    /**
     * 帐号ID,对应华为云控制台用户名->我的凭证->帐号ID
     * @return domainid
     */
    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }

    public CreatePremiumHostResponse withProjectid(String projectid) {
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

    public CreatePremiumHostResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreatePremiumHostResponse withProtectStatus(Integer protectStatus) {
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

    public CreatePremiumHostResponse withAccessStatus(Integer accessStatus) {
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

    public CreatePremiumHostResponse withBlockPage(BlockPage blockPage) {
        this.blockPage = blockPage;
        return this;
    }

    public CreatePremiumHostResponse withBlockPage(Consumer<BlockPage> blockPageSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePremiumHostResponse createPremiumHostResponse = (CreatePremiumHostResponse) o;
        return Objects.equals(this.id, createPremiumHostResponse.id)
            && Objects.equals(this.hostname, createPremiumHostResponse.hostname)
            && Objects.equals(this.protocol, createPremiumHostResponse.protocol)
            && Objects.equals(this.server, createPremiumHostResponse.server)
            && Objects.equals(this.proxy, createPremiumHostResponse.proxy)
            && Objects.equals(this.locked, createPremiumHostResponse.locked)
            && Objects.equals(this.timestamp, createPremiumHostResponse.timestamp)
            && Objects.equals(this.tls, createPremiumHostResponse.tls)
            && Objects.equals(this.cipher, createPremiumHostResponse.cipher)
            && Objects.equals(this.extend, createPremiumHostResponse.extend)
            && Objects.equals(this.flag, createPremiumHostResponse.flag)
            && Objects.equals(this.description, createPremiumHostResponse.description)
            && Objects.equals(this.policyid, createPremiumHostResponse.policyid)
            && Objects.equals(this.domainid, createPremiumHostResponse.domainid)
            && Objects.equals(this.projectid, createPremiumHostResponse.projectid)
            && Objects.equals(this.enterpriseProjectId, createPremiumHostResponse.enterpriseProjectId)
            && Objects.equals(this.protectStatus, createPremiumHostResponse.protectStatus)
            && Objects.equals(this.accessStatus, createPremiumHostResponse.accessStatus)
            && Objects.equals(this.blockPage, createPremiumHostResponse.blockPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hostname,
            protocol,
            server,
            proxy,
            locked,
            timestamp,
            tls,
            cipher,
            extend,
            flag,
            description,
            policyid,
            domainid,
            projectid,
            enterpriseProjectId,
            protectStatus,
            accessStatus,
            blockPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePremiumHostResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    domainid: ").append(toIndentedString(domainid)).append("\n");
        sb.append("    projectid: ").append(toIndentedString(projectid)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    blockPage: ").append(toIndentedString(blockPage)).append("\n");
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
