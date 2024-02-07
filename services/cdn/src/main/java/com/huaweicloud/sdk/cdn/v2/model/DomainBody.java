package com.huaweicloud.sdk.cdn.v2.model;

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
 * 创建域名Body
 */
public class DomainBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    /**
     * 域名业务类型，若为web，则表示类型为网页加速；若为download，则表示业务类型为文件下载加速；若为video，则表示业务类型为点播加速；若为wholeSite，则表示业务类型为全站加速。
     */
    public static final class BusinessTypeEnum {

        /**
         * Enum WEB for value: "web"
         */
        public static final BusinessTypeEnum WEB = new BusinessTypeEnum("web");

        /**
         * Enum DOWNLOAD for value: "download"
         */
        public static final BusinessTypeEnum DOWNLOAD = new BusinessTypeEnum("download");

        /**
         * Enum VIDEO for value: "video"
         */
        public static final BusinessTypeEnum VIDEO = new BusinessTypeEnum("video");

        /**
         * Enum WHOLESITE for value: "wholeSite"
         */
        public static final BusinessTypeEnum WHOLESITE = new BusinessTypeEnum("wholeSite");

        private static final Map<String, BusinessTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BusinessTypeEnum> createStaticFields() {
            Map<String, BusinessTypeEnum> map = new HashMap<>();
            map.put("web", WEB);
            map.put("download", DOWNLOAD);
            map.put("video", VIDEO);
            map.put("wholeSite", WHOLESITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BusinessTypeEnum(String value) {
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
        public static BusinessTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BusinessTypeEnum(value));
        }

        public static BusinessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BusinessTypeEnum) {
                return this.value.equals(((BusinessTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private BusinessTypeEnum businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<Sources> sources = null;

    /**
     * 域名服务范围，若为mainland_china，则表示服务范围为中国大陆；若为outside_mainland_china，则表示服务范围为中国大陆境外；若为global，则表示服务范围为全球。
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

        private static final Map<String, ServiceAreaEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceAreaEnum> createStaticFields() {
            Map<String, ServiceAreaEnum> map = new HashMap<>();
            map.put("mainland_china", MAINLAND_CHINA);
            map.put("outside_mainland_china", OUTSIDE_MAINLAND_CHINA);
            map.put("global", GLOBAL);
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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public DomainBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 加速域名。（ 由字母（A-Z，a-z，大小写等价）、数字（0-9）和连接符（-）组成，各级域名之间用（.）连接，域名长度不超过75个字符。连接符（-）不能作为域名的开头或结尾字符。）
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainBody withBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * 域名业务类型，若为web，则表示类型为网页加速；若为download，则表示业务类型为文件下载加速；若为video，则表示业务类型为点播加速；若为wholeSite，则表示业务类型为全站加速。
     * @return businessType
     */
    public BusinessTypeEnum getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
    }

    public DomainBody withSources(List<Sources> sources) {
        this.sources = sources;
        return this;
    }

    public DomainBody addSourcesItem(Sources sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public DomainBody withSources(Consumer<List<Sources>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 源站配置。
     * @return sources
     */
    public List<Sources> getSources() {
        return sources;
    }

    public void setSources(List<Sources> sources) {
        this.sources = sources;
    }

    public DomainBody withServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * 域名服务范围，若为mainland_china，则表示服务范围为中国大陆；若为outside_mainland_china，则表示服务范围为中国大陆境外；若为global，则表示服务范围为全球。
     * @return serviceArea
     */
    public ServiceAreaEnum getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
    }

    public DomainBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 当用户开启企业项目功能时，该参数生效，表示添加加速域名到该企业项目。注意：当使用子帐号调用接口时，该参数必传。  您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainBody that = (DomainBody) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.sources, that.sources) && Objects.equals(this.serviceArea, that.serviceArea)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, businessType, sources, serviceArea, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainBody {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
