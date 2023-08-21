package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 防护域名详情
 */
public class ShowWafDomainResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_time")

    private Long openTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_time")

    private Long closeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dispatch_status")

    private Integer dispatchStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private String serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_tag")

    private String webTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    /**
     * 协议
     */
    public static final class ProtocolEnum {

        /**
         * Enum HTTP for value: "http"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("http");

        /**
         * Enum HTTPS for value: "https"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("https");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("http", HTTP);
            map.put("https", HTTPS);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_name")

    private String certificateName;

    /**
     * 配置的最低TLS版本（TLS v1.0/TLS v1.1/TLS v1.2），默认为TLS v1.0版本，对外协议为https时才有tls参数
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
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_page")

    private WafBlockPage blockPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mark")

    private WafTrafficMark trafficMark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Flag flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Map<String, String> extend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_added")

    private Boolean isAdded;

    public ShowWafDomainResponseBody withId(String id) {
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

    public ShowWafDomainResponseBody withDomainName(String domainName) {
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

    public ShowWafDomainResponseBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowWafDomainResponseBody withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ShowWafDomainResponseBody withOpenTime(Long openTime) {
        this.openTime = openTime;
        return this;
    }

    /**
     * 上一次开启防护的时间
     * @return openTime
     */
    public Long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Long openTime) {
        this.openTime = openTime;
    }

    public ShowWafDomainResponseBody withCloseTime(Long closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
     * 上一次关闭防护的时间
     * @return closeTime
     */
    public Long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Long closeTime) {
        this.closeTime = closeTime;
    }

    public ShowWafDomainResponseBody withDispatchStatus(Integer dispatchStatus) {
        this.dispatchStatus = dispatchStatus;
        return this;
    }

    /**
     * cdn域名调度情况（0：未防护，1：配置中，2：已防护，3：删除中）
     * @return dispatchStatus
     */
    public Integer getDispatchStatus() {
        return dispatchStatus;
    }

    public void setDispatchStatus(Integer dispatchStatus) {
        this.dispatchStatus = dispatchStatus;
    }

    public ShowWafDomainResponseBody withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * 域名在CDN所属区域
     * @return serviceArea
     */
    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ShowWafDomainResponseBody withWebTag(String webTag) {
        this.webTag = webTag;
        return this;
    }

    /**
     * 域名名称
     * @return webTag
     */
    public String getWebTag() {
        return webTag;
    }

    public void setWebTag(String webTag) {
        this.webTag = webTag;
    }

    public ShowWafDomainResponseBody withDescription(String description) {
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

    public ShowWafDomainResponseBody withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ShowWafDomainResponseBody withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public ShowWafDomainResponseBody withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * 证书id
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public ShowWafDomainResponseBody withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * 证书名称
     * @return certificateName
     */
    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public ShowWafDomainResponseBody withTls(TlsEnum tls) {
        this.tls = tls;
        return this;
    }

    /**
     * 配置的最低TLS版本（TLS v1.0/TLS v1.1/TLS v1.2），默认为TLS v1.0版本，对外协议为https时才有tls参数
     * @return tls
     */
    public TlsEnum getTls() {
        return tls;
    }

    public void setTls(TlsEnum tls) {
        this.tls = tls;
    }

    public ShowWafDomainResponseBody withCipher(CipherEnum cipher) {
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

    public ShowWafDomainResponseBody withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态：  - 0-关闭   - 1-开启
     * @return protectStatus
     */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ShowWafDomainResponseBody withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * 接入状态：  - 0-未接入   - 1-已接入
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public ShowWafDomainResponseBody withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建域名的时间，13位时间戳
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowWafDomainResponseBody withBlockPage(WafBlockPage blockPage) {
        this.blockPage = blockPage;
        return this;
    }

    public ShowWafDomainResponseBody withBlockPage(Consumer<WafBlockPage> blockPageSetter) {
        if (this.blockPage == null) {
            this.blockPage = new WafBlockPage();
            blockPageSetter.accept(this.blockPage);
        }

        return this;
    }

    /**
     * Get blockPage
     * @return blockPage
     */
    public WafBlockPage getBlockPage() {
        return blockPage;
    }

    public void setBlockPage(WafBlockPage blockPage) {
        this.blockPage = blockPage;
    }

    public ShowWafDomainResponseBody withTrafficMark(WafTrafficMark trafficMark) {
        this.trafficMark = trafficMark;
        return this;
    }

    public ShowWafDomainResponseBody withTrafficMark(Consumer<WafTrafficMark> trafficMarkSetter) {
        if (this.trafficMark == null) {
            this.trafficMark = new WafTrafficMark();
            trafficMarkSetter.accept(this.trafficMark);
        }

        return this;
    }

    /**
     * Get trafficMark
     * @return trafficMark
     */
    public WafTrafficMark getTrafficMark() {
        return trafficMark;
    }

    public void setTrafficMark(WafTrafficMark trafficMark) {
        this.trafficMark = trafficMark;
    }

    public ShowWafDomainResponseBody withFlag(Flag flag) {
        this.flag = flag;
        return this;
    }

    public ShowWafDomainResponseBody withFlag(Consumer<Flag> flagSetter) {
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

    public ShowWafDomainResponseBody withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public ShowWafDomainResponseBody putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public ShowWafDomainResponseBody withExtend(Consumer<Map<String, String>> extendSetter) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }

    /**
     * 域名可扩展属性
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    public ShowWafDomainResponseBody withIsAdded(Boolean isAdded) {
        this.isAdded = isAdded;
        return this;
    }

    /**
     * 是否为ddos防护域名
     * @return isAdded
     */
    public Boolean getIsAdded() {
        return isAdded;
    }

    public void setIsAdded(Boolean isAdded) {
        this.isAdded = isAdded;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWafDomainResponseBody that = (ShowWafDomainResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.openTime, that.openTime)
            && Objects.equals(this.closeTime, that.closeTime)
            && Objects.equals(this.dispatchStatus, that.dispatchStatus)
            && Objects.equals(this.serviceArea, that.serviceArea) && Objects.equals(this.webTag, that.webTag)
            && Objects.equals(this.description, that.description) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.certificateId, that.certificateId)
            && Objects.equals(this.certificateName, that.certificateName) && Objects.equals(this.tls, that.tls)
            && Objects.equals(this.cipher, that.cipher) && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.accessStatus, that.accessStatus) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.blockPage, that.blockPage) && Objects.equals(this.trafficMark, that.trafficMark)
            && Objects.equals(this.flag, that.flag) && Objects.equals(this.extend, that.extend)
            && Objects.equals(this.isAdded, that.isAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainName,
            enterpriseProjectId,
            tenantId,
            openTime,
            closeTime,
            dispatchStatus,
            serviceArea,
            webTag,
            description,
            policyId,
            protocol,
            certificateId,
            certificateName,
            tls,
            cipher,
            protectStatus,
            accessStatus,
            createTime,
            blockPage,
            trafficMark,
            flag,
            extend,
            isAdded);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWafDomainResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    dispatchStatus: ").append(toIndentedString(dispatchStatus)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    blockPage: ").append(toIndentedString(blockPage)).append("\n");
        sb.append("    trafficMark: ").append(toIndentedString(trafficMark)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    isAdded: ").append(toIndentedString(isAdded)).append("\n");
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
