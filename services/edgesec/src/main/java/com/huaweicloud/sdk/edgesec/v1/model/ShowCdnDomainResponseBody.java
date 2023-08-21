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
 * CDN域名详情
 */
public class ShowCdnDomainResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_status")

    private String domainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    /**
     * 域名业务区域
     */
    public static final class ServiceAreaEnum {

        /**
         * Enum MAINLAND_CHINA for value: "mainland_china"
         */
        public static final ServiceAreaEnum MAINLAND_CHINA = new ServiceAreaEnum("mainland_china");

        /**
         * Enum OUTSIDE_MAINLAND_CHINA for value: "outside_mainland_china"
         */
        public static final ServiceAreaEnum OUTSIDE_MAINLAND_CHINA = new ServiceAreaEnum("outside_mainland_china");

        /**
         * Enum GLOBAL for value: "global"
         */
        public static final ServiceAreaEnum GLOBAL = new ServiceAreaEnum("global");

        /**
         * Enum EUROPE for value: "europe"
         */
        public static final ServiceAreaEnum EUROPE = new ServiceAreaEnum("europe");

        private static final Map<String, ServiceAreaEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceAreaEnum> createStaticFields() {
            Map<String, ServiceAreaEnum> map = new HashMap<>();
            map.put("mainland_china", MAINLAND_CHINA);
            map.put("outside_mainland_china", OUTSIDE_MAINLAND_CHINA);
            map.put("global", GLOBAL);
            map.put("europe", EUROPE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceAreaEnum(String value) {
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
        public static ServiceAreaEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServiceAreaEnum(value));
        }

        public static ServiceAreaEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceAreaEnum) {
                return this.value.equals(((ServiceAreaEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private ServiceAreaEnum serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_accelerate")

    private Integer ipv6Accelerate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_status")

    private Integer httpsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect")

    private Integer forceRedirect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extended_tags")

    private CdnDomainTags extendedTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_added")

    private Boolean isAdded;

    public ShowCdnDomainResponseBody withDomainName(String domainName) {
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

    public ShowCdnDomainResponseBody withDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    /**
     * 加速域名状态。取值意义： - online表示“已开启” - offline表示“已停用” - configuring表示“配置中” - configure_failed表示“配置失败” - checking表示“审核中” - check_failed表示“审核未通过” - deleting表示“删除中”。
     * @return domainStatus
     */
    public String getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    public ShowCdnDomainResponseBody withDomainId(String domainId) {
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

    public ShowCdnDomainResponseBody withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * 域名使用的证书id
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public ShowCdnDomainResponseBody withServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * 域名业务区域
     * @return serviceArea
     */
    public ServiceAreaEnum getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ShowCdnDomainResponseBody withIpv6Accelerate(Integer ipv6Accelerate) {
        this.ipv6Accelerate = ipv6Accelerate;
        return this;
    }

    /**
     * 是否开启ipv6加速：0关闭/1开启
     * @return ipv6Accelerate
     */
    public Integer getIpv6Accelerate() {
        return ipv6Accelerate;
    }

    public void setIpv6Accelerate(Integer ipv6Accelerate) {
        this.ipv6Accelerate = ipv6Accelerate;
    }

    public ShowCdnDomainResponseBody withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * 域名业务类型。取值意义： - web表示“网站加速” - download表示“文件下载加速” - video表示“点播加速” - wholeSite表示“全站加速”
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public ShowCdnDomainResponseBody withHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    /**
     * 是否启用https：0关闭/1开启
     * @return httpsStatus
     */
    public Integer getHttpsStatus() {
        return httpsStatus;
    }

    public void setHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
    }

    public ShowCdnDomainResponseBody withForceRedirect(Integer forceRedirect) {
        this.forceRedirect = forceRedirect;
        return this;
    }

    /**
     * 强制重定向：0不开启重定向/1强制重定向为HTTP/2强制重定向为HTTPS
     * @return forceRedirect
     */
    public Integer getForceRedirect() {
        return forceRedirect;
    }

    public void setForceRedirect(Integer forceRedirect) {
        this.forceRedirect = forceRedirect;
    }

    public ShowCdnDomainResponseBody withExtendedTags(CdnDomainTags extendedTags) {
        this.extendedTags = extendedTags;
        return this;
    }

    public ShowCdnDomainResponseBody withExtendedTags(Consumer<CdnDomainTags> extendedTagsSetter) {
        if (this.extendedTags == null) {
            this.extendedTags = new CdnDomainTags();
            extendedTagsSetter.accept(this.extendedTags);
        }

        return this;
    }

    /**
     * Get extendedTags
     * @return extendedTags
     */
    public CdnDomainTags getExtendedTags() {
        return extendedTags;
    }

    public void setExtendedTags(CdnDomainTags extendedTags) {
        this.extendedTags = extendedTags;
    }

    public ShowCdnDomainResponseBody withIsAdded(Boolean isAdded) {
        this.isAdded = isAdded;
        return this;
    }

    /**
     * 是否为waf防护域名
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
        ShowCdnDomainResponseBody that = (ShowCdnDomainResponseBody) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.domainStatus, that.domainStatus)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.certificateId, that.certificateId)
            && Objects.equals(this.serviceArea, that.serviceArea)
            && Objects.equals(this.ipv6Accelerate, that.ipv6Accelerate)
            && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.httpsStatus, that.httpsStatus)
            && Objects.equals(this.forceRedirect, that.forceRedirect)
            && Objects.equals(this.extendedTags, that.extendedTags) && Objects.equals(this.isAdded, that.isAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName,
            domainStatus,
            domainId,
            certificateId,
            serviceArea,
            ipv6Accelerate,
            businessType,
            httpsStatus,
            forceRedirect,
            extendedTags,
            isAdded);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCdnDomainResponseBody {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    ipv6Accelerate: ").append(toIndentedString(ipv6Accelerate)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    httpsStatus: ").append(toIndentedString(httpsStatus)).append("\n");
        sb.append("    forceRedirect: ").append(toIndentedString(forceRedirect)).append("\n");
        sb.append("    extendedTags: ").append(toIndentedString(extendedTags)).append("\n");
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
