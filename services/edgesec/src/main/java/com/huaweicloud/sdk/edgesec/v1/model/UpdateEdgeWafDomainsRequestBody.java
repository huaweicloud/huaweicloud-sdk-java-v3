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
 * 更新防护域名的请求
 */
public class UpdateEdgeWafDomainsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_tag")

    private String webTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 配置的最低TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本，对外协议为https时才有tls参数
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

    public UpdateEdgeWafDomainsRequestBody withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态
     * minimum: 0
     * maximum: 1
     * @return protectStatus
     */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    public UpdateEdgeWafDomainsRequestBody withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * 接入状态
     * minimum: 0
     * maximum: 1
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public UpdateEdgeWafDomainsRequestBody withWebTag(String webTag) {
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

    public UpdateEdgeWafDomainsRequestBody withDescription(String description) {
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

    public UpdateEdgeWafDomainsRequestBody withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * 证书id，通过查询证书列表接口（ListCertificates）接口获取证书id   - 对外协议为HTTP时不需要填写   - 对外协议HTTPS时为必填参数   - 查询证书列表接口未开放时，从边缘安全控制台->边缘WAF->证书管理获取
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public UpdateEdgeWafDomainsRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
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

    public UpdateEdgeWafDomainsRequestBody withTls(TlsEnum tls) {
        this.tls = tls;
        return this;
    }

    /**
     * 配置的最低TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本，对外协议为https时才有tls参数
     * @return tls
     */
    public TlsEnum getTls() {
        return tls;
    }

    public void setTls(TlsEnum tls) {
        this.tls = tls;
    }

    public UpdateEdgeWafDomainsRequestBody withCipher(CipherEnum cipher) {
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

    public UpdateEdgeWafDomainsRequestBody withBlockPage(WafBlockPage blockPage) {
        this.blockPage = blockPage;
        return this;
    }

    public UpdateEdgeWafDomainsRequestBody withBlockPage(Consumer<WafBlockPage> blockPageSetter) {
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

    public UpdateEdgeWafDomainsRequestBody withTrafficMark(WafTrafficMark trafficMark) {
        this.trafficMark = trafficMark;
        return this;
    }

    public UpdateEdgeWafDomainsRequestBody withTrafficMark(Consumer<WafTrafficMark> trafficMarkSetter) {
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

    public UpdateEdgeWafDomainsRequestBody withFlag(Flag flag) {
        this.flag = flag;
        return this;
    }

    public UpdateEdgeWafDomainsRequestBody withFlag(Consumer<Flag> flagSetter) {
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

    public UpdateEdgeWafDomainsRequestBody withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public UpdateEdgeWafDomainsRequestBody putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public UpdateEdgeWafDomainsRequestBody withExtend(Consumer<Map<String, String>> extendSetter) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }

    /**
     * 域名可扩展字段
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEdgeWafDomainsRequestBody that = (UpdateEdgeWafDomainsRequestBody) obj;
        return Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.accessStatus, that.accessStatus) && Objects.equals(this.webTag, that.webTag)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.certificateId, that.certificateId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId) && Objects.equals(this.tls, that.tls)
            && Objects.equals(this.cipher, that.cipher) && Objects.equals(this.blockPage, that.blockPage)
            && Objects.equals(this.trafficMark, that.trafficMark) && Objects.equals(this.flag, that.flag)
            && Objects.equals(this.extend, that.extend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectStatus,
            accessStatus,
            webTag,
            description,
            certificateId,
            enterpriseProjectId,
            tls,
            cipher,
            blockPage,
            trafficMark,
            flag,
            extend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeWafDomainsRequestBody {\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
        sb.append("    blockPage: ").append(toIndentedString(blockPage)).append("\n");
        sb.append("    trafficMark: ").append(toIndentedString(trafficMark)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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
