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
 * 独享模式域名详情
 */
public class PremiumWafHost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainid")

    private String domainid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_code")

    private String accessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private List<PremiumWafServer> server = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificateid")

    private String certificateid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificatename")

    private String certificatename;

    /**
     * 支持最低的TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本
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

    private TlsEnum tls;

    /**
     * 加密套件（cipher_1，cipher_2，cipher_3，cipher_4，cipher_default）：  cipher_1： 加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!DES:!MD5:!PSK:!RC4:!kRSA:!SRP:!3DES:!DSS:!EXP:!CAMELLIA:@STRENGTH   cipher_2：加密算法为EECDH+AESGCM:EDH+AESGCM    cipher_3：加密算法为ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-SHA384:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH    cipher_4：加密算法为ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!EDH    cipher_default： 加密算法为ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!AESGCM
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

    private CipherEnum cipher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Integer locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_page")

    private BlockPage blockPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Map<String, String> extend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mark")

    private TrafficMark trafficMark;

    public PremiumWafHost withId(String id) {
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

    public PremiumWafHost withPolicyid(String policyid) {
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

    public PremiumWafHost withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 创建的独享模式防护域名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public PremiumWafHost withDomainid(String domainid) {
        this.domainid = domainid;
        return this;
    }

    /**
     * 用户Domain ID
     * @return domainid
     */
    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }

    public PremiumWafHost withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 用户的project_id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PremiumWafHost withAccessCode(String accessCode) {
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

    public PremiumWafHost withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http协议类型
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public PremiumWafHost withServer(List<PremiumWafServer> server) {
        this.server = server;
        return this;
    }

    public PremiumWafHost addServerItem(PremiumWafServer serverItem) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public PremiumWafHost withServer(Consumer<List<PremiumWafServer>> serverSetter) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        serverSetter.accept(this.server);
        return this;
    }

    /**
     * 源站信息
     * @return server
     */
    public List<PremiumWafServer> getServer() {
        return server;
    }

    public void setServer(List<PremiumWafServer> server) {
        this.server = server;
    }

    public PremiumWafHost withCertificateid(String certificateid) {
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

    public PremiumWafHost withCertificatename(String certificatename) {
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

    public PremiumWafHost withTls(TlsEnum tls) {
        this.tls = tls;
        return this;
    }

    /**
     * 支持最低的TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本
     * @return tls
     */
    public TlsEnum getTls() {
        return tls;
    }

    public void setTls(TlsEnum tls) {
        this.tls = tls;
    }

    public PremiumWafHost withCipher(CipherEnum cipher) {
        this.cipher = cipher;
        return this;
    }

    /**
     * 加密套件（cipher_1，cipher_2，cipher_3，cipher_4，cipher_default）：  cipher_1： 加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!DES:!MD5:!PSK:!RC4:!kRSA:!SRP:!3DES:!DSS:!EXP:!CAMELLIA:@STRENGTH   cipher_2：加密算法为EECDH+AESGCM:EDH+AESGCM    cipher_3：加密算法为ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-SHA384:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH    cipher_4：加密算法为ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!EDH    cipher_default： 加密算法为ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!AESGCM
     * @return cipher
     */
    public CipherEnum getCipher() {
        return cipher;
    }

    public void setCipher(CipherEnum cipher) {
        this.cipher = cipher;
    }

    public PremiumWafHost withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * 是否开启了代理
     * @return proxy
     */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    public PremiumWafHost withLocked(Integer locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 锁定状态
     * @return locked
     */
    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public PremiumWafHost withProtectStatus(Integer protectStatus) {
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

    public PremiumWafHost withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * 接入状态
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public PremiumWafHost withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建防护域名的时间
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public PremiumWafHost withBlockPage(BlockPage blockPage) {
        this.blockPage = blockPage;
        return this;
    }

    public PremiumWafHost withBlockPage(Consumer<BlockPage> blockPageSetter) {
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

    public PremiumWafHost withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public PremiumWafHost putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public PremiumWafHost withExtend(Consumer<Map<String, String>> extendSetter) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }

    /**
     * 可扩展属性
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    public PremiumWafHost withTrafficMark(TrafficMark trafficMark) {
        this.trafficMark = trafficMark;
        return this;
    }

    public PremiumWafHost withTrafficMark(Consumer<TrafficMark> trafficMarkSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PremiumWafHost premiumWafHost = (PremiumWafHost) o;
        return Objects.equals(this.id, premiumWafHost.id) && Objects.equals(this.policyid, premiumWafHost.policyid)
            && Objects.equals(this.hostname, premiumWafHost.hostname)
            && Objects.equals(this.domainid, premiumWafHost.domainid)
            && Objects.equals(this.projectId, premiumWafHost.projectId)
            && Objects.equals(this.accessCode, premiumWafHost.accessCode)
            && Objects.equals(this.protocol, premiumWafHost.protocol)
            && Objects.equals(this.server, premiumWafHost.server)
            && Objects.equals(this.certificateid, premiumWafHost.certificateid)
            && Objects.equals(this.certificatename, premiumWafHost.certificatename)
            && Objects.equals(this.tls, premiumWafHost.tls) && Objects.equals(this.cipher, premiumWafHost.cipher)
            && Objects.equals(this.proxy, premiumWafHost.proxy) && Objects.equals(this.locked, premiumWafHost.locked)
            && Objects.equals(this.protectStatus, premiumWafHost.protectStatus)
            && Objects.equals(this.accessStatus, premiumWafHost.accessStatus)
            && Objects.equals(this.timestamp, premiumWafHost.timestamp)
            && Objects.equals(this.blockPage, premiumWafHost.blockPage)
            && Objects.equals(this.extend, premiumWafHost.extend)
            && Objects.equals(this.trafficMark, premiumWafHost.trafficMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            policyid,
            hostname,
            domainid,
            projectId,
            accessCode,
            protocol,
            server,
            certificateid,
            certificatename,
            tls,
            cipher,
            proxy,
            locked,
            protectStatus,
            accessStatus,
            timestamp,
            blockPage,
            extend,
            trafficMark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PremiumWafHost {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    domainid: ").append(toIndentedString(domainid)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    blockPage: ").append(toIndentedString(blockPage)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    trafficMark: ").append(toIndentedString(trafficMark)).append("\n");
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
