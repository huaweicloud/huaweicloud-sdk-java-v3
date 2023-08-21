package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建防护域名的请求
 */
public class CreateEdgeWafDomainsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_tag")

    private String webTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 域名在CDN所属区域，通过查询CDN域名接口获取
     */
    public static final class AreaTypeEnum {

        /**
         * Enum MAINLAND_CHINA for value: "mainland_china"
         */
        public static final AreaTypeEnum MAINLAND_CHINA = new AreaTypeEnum("mainland_china");

        /**
         * Enum OUTSIDE_MAINLAND_CHINA for value: "outside_mainland_china"
         */
        public static final AreaTypeEnum OUTSIDE_MAINLAND_CHINA = new AreaTypeEnum("outside_mainland_china");

        /**
         * Enum GLOBAL for value: "global"
         */
        public static final AreaTypeEnum GLOBAL = new AreaTypeEnum("global");

        /**
         * Enum EUROPE for value: "europe"
         */
        public static final AreaTypeEnum EUROPE = new AreaTypeEnum("europe");

        private static final Map<String, AreaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AreaTypeEnum> createStaticFields() {
            Map<String, AreaTypeEnum> map = new HashMap<>();
            map.put("mainland_china", MAINLAND_CHINA);
            map.put("outside_mainland_china", OUTSIDE_MAINLAND_CHINA);
            map.put("global", GLOBAL);
            map.put("europe", EUROPE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AreaTypeEnum(String value) {
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
        public static AreaTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AreaTypeEnum(value));
        }

        public static AreaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AreaTypeEnum) {
                return this.value.equals(((AreaTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_type")

    private AreaTypeEnum areaType;

    public CreateEdgeWafDomainsRequestBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 防护域名（可带端口），通过查询CDN域名接口获取
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public CreateEdgeWafDomainsRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateEdgeWafDomainsRequestBody withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 防护域名关联的策略id，通过查询WAF防护策略接口获取
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public CreateEdgeWafDomainsRequestBody withCertificateId(String certificateId) {
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

    public CreateEdgeWafDomainsRequestBody withWebTag(String webTag) {
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

    public CreateEdgeWafDomainsRequestBody withDescription(String description) {
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

    public CreateEdgeWafDomainsRequestBody withAreaType(AreaTypeEnum areaType) {
        this.areaType = areaType;
        return this;
    }

    /**
     * 域名在CDN所属区域，通过查询CDN域名接口获取
     * @return areaType
     */
    public AreaTypeEnum getAreaType() {
        return areaType;
    }

    public void setAreaType(AreaTypeEnum areaType) {
        this.areaType = areaType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEdgeWafDomainsRequestBody that = (CreateEdgeWafDomainsRequestBody) obj;
        return Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.certificateId, that.certificateId)
            && Objects.equals(this.webTag, that.webTag) && Objects.equals(this.description, that.description)
            && Objects.equals(this.areaType, that.areaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, enterpriseProjectId, policyId, certificateId, webTag, description, areaType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeWafDomainsRequestBody {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
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
