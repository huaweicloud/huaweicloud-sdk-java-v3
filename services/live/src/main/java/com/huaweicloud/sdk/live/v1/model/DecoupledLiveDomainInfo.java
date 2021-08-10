package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** DecoupledLiveDomainInfo */
public class DecoupledLiveDomainInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    /** 域名类型 */
    public static final class DomainTypeEnum {

        /** Enum PULL for value: "pull" */
        public static final DomainTypeEnum PULL = new DomainTypeEnum("pull");

        /** Enum PUSH for value: "push" */
        public static final DomainTypeEnum PUSH = new DomainTypeEnum("push");

        private static final Map<String, DomainTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainTypeEnum> createStaticFields() {
            Map<String, DomainTypeEnum> map = new HashMap<>();
            map.put("pull", PULL);
            map.put("push", PUSH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainTypeEnum(String value) {
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
        public static DomainTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DomainTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DomainTypeEnum(value);
            }
            return result;
        }

        public static DomainTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DomainTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainTypeEnum) {
                return this.value.equals(((DomainTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private DomainTypeEnum domainType;

    /** CDN厂商 */
    public static final class VendorEnum {

        /** Enum CHINANETCENTER for value: "ChinaNetCenter" */
        public static final VendorEnum CHINANETCENTER = new VendorEnum("ChinaNetCenter");

        /** Enum KINGSOFT for value: "KingSoft" */
        public static final VendorEnum KINGSOFT = new VendorEnum("KingSoft");

        /** Enum TENCENT for value: "Tencent" */
        public static final VendorEnum TENCENT = new VendorEnum("Tencent");

        /** Enum UCDN for value: "uCDN" */
        public static final VendorEnum UCDN = new VendorEnum("uCDN");

        /** Enum TENCENTOUTSIDE for value: "TencentOutside" */
        public static final VendorEnum TENCENTOUTSIDE = new VendorEnum("TencentOutside");

        /** Enum DNION for value: "Dnion" */
        public static final VendorEnum DNION = new VendorEnum("Dnion");

        /** Enum BAISHAN for value: "Baishan" */
        public static final VendorEnum BAISHAN = new VendorEnum("Baishan");

        /** Enum BAIDU for value: "Baidu" */
        public static final VendorEnum BAIDU = new VendorEnum("Baidu");

        /** Enum ONETHING for value: "Onething" */
        public static final VendorEnum ONETHING = new VendorEnum("Onething");

        private static final Map<String, VendorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VendorEnum> createStaticFields() {
            Map<String, VendorEnum> map = new HashMap<>();
            map.put("ChinaNetCenter", CHINANETCENTER);
            map.put("KingSoft", KINGSOFT);
            map.put("Tencent", TENCENT);
            map.put("uCDN", UCDN);
            map.put("TencentOutside", TENCENTOUTSIDE);
            map.put("Dnion", DNION);
            map.put("Baishan", BAISHAN);
            map.put("Baidu", BAIDU);
            map.put("Onething", ONETHING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VendorEnum(String value) {
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
        public static VendorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VendorEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VendorEnum(value);
            }
            return result;
        }

        public static VendorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VendorEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VendorEnum) {
                return this.value.equals(((VendorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private VendorEnum vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_cname")

    private String domainCname;

    /** 直播域名的状态 */
    public static final class StatusEnum {

        /** Enum ON for value: "on" */
        public static final StatusEnum ON = new StatusEnum("on");

        /** Enum OFF for value: "off" */
        public static final StatusEnum OFF = new StatusEnum("off");

        /** Enum CONFIGURING for value: "configuring" */
        public static final StatusEnum CONFIGURING = new StatusEnum("configuring");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            map.put("configuring", CONFIGURING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_domain")

    private String relatedDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public DecoupledLiveDomainInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 直播域名
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public DecoupledLiveDomainInfo withDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
        return this;
    }

    /** 域名类型
     * 
     * @return domainType */
    public DomainTypeEnum getDomainType() {
        return domainType;
    }

    public void setDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
    }

    public DecoupledLiveDomainInfo withVendor(VendorEnum vendor) {
        this.vendor = vendor;
        return this;
    }

    /** CDN厂商
     * 
     * @return vendor */
    public VendorEnum getVendor() {
        return vendor;
    }

    public void setVendor(VendorEnum vendor) {
        this.vendor = vendor;
    }

    public DecoupledLiveDomainInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /** 直播所属直播中心
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DecoupledLiveDomainInfo withDomainCname(String domainCname) {
        this.domainCname = domainCname;
        return this;
    }

    /** 直播域名的CName
     * 
     * @return domainCname */
    public String getDomainCname() {
        return domainCname;
    }

    public void setDomainCname(String domainCname) {
        this.domainCname = domainCname;
    }

    public DecoupledLiveDomainInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 直播域名的状态
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DecoupledLiveDomainInfo withRelatedDomain(String relatedDomain) {
        this.relatedDomain = relatedDomain;
        return this;
    }

    /** 播放域名关联的推流域名（只有domain_type为pull的时候有效）
     * 
     * @return relatedDomain */
    public String getRelatedDomain() {
        return relatedDomain;
    }

    public void setRelatedDomain(String relatedDomain) {
        this.relatedDomain = relatedDomain;
    }

    public DecoupledLiveDomainInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 域名创建时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间
     * 
     * @return createTime */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DecoupledLiveDomainInfo decoupledLiveDomainInfo = (DecoupledLiveDomainInfo) o;
        return Objects.equals(this.domain, decoupledLiveDomainInfo.domain)
            && Objects.equals(this.domainType, decoupledLiveDomainInfo.domainType)
            && Objects.equals(this.vendor, decoupledLiveDomainInfo.vendor)
            && Objects.equals(this.region, decoupledLiveDomainInfo.region)
            && Objects.equals(this.domainCname, decoupledLiveDomainInfo.domainCname)
            && Objects.equals(this.status, decoupledLiveDomainInfo.status)
            && Objects.equals(this.relatedDomain, decoupledLiveDomainInfo.relatedDomain)
            && Objects.equals(this.createTime, decoupledLiveDomainInfo.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, domainType, vendor, region, domainCname, status, relatedDomain, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecoupledLiveDomainInfo {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    domainCname: ").append(toIndentedString(domainCname)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    relatedDomain: ").append(toIndentedString(relatedDomain)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
