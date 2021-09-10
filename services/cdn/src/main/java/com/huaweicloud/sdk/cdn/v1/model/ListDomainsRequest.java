package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListDomainsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    /** 加速域名的业务类型。取值： - web（网站加速） - download（文件下载加速） - video（点播加速） - wholeSite（全站加速） */
    public static final class BusinessTypeEnum {

        /** Enum WEB for value: "web" */
        public static final BusinessTypeEnum WEB = new BusinessTypeEnum("web");

        /** Enum DOWNLOAD for value: "download" */
        public static final BusinessTypeEnum DOWNLOAD = new BusinessTypeEnum("download");

        /** Enum VIDEO for value: "video" */
        public static final BusinessTypeEnum VIDEO = new BusinessTypeEnum("video");

        /** Enum WHOLESITE for value: "wholeSite" */
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
            BusinessTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BusinessTypeEnum(value);
            }
            return result;
        }

        public static BusinessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BusinessTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** 加速域名状态。取值意义： - online表示“已开启” - offline表示“已停用” - configuring表示“配置中” - configure_failed表示“配置失败” - checking表示“审核中”
     * - check_failed表示“审核未通过” - deleting表示“删除中”。 */
    public static final class DomainStatusEnum {

        /** Enum ONLINE for value: "online" */
        public static final DomainStatusEnum ONLINE = new DomainStatusEnum("online");

        /** Enum OFFLINE for value: "offline" */
        public static final DomainStatusEnum OFFLINE = new DomainStatusEnum("offline");

        /** Enum CONFIGURING for value: "configuring" */
        public static final DomainStatusEnum CONFIGURING = new DomainStatusEnum("configuring");

        /** Enum CONFIGURE_FAILED for value: "configure_failed" */
        public static final DomainStatusEnum CONFIGURE_FAILED = new DomainStatusEnum("configure_failed");

        /** Enum CHECKING for value: "checking" */
        public static final DomainStatusEnum CHECKING = new DomainStatusEnum("checking");

        /** Enum CHECK_FAILED for value: "check_failed" */
        public static final DomainStatusEnum CHECK_FAILED = new DomainStatusEnum("check_failed");

        /** Enum DELETING for value: "deleting" */
        public static final DomainStatusEnum DELETING = new DomainStatusEnum("deleting");

        private static final Map<String, DomainStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainStatusEnum> createStaticFields() {
            Map<String, DomainStatusEnum> map = new HashMap<>();
            map.put("online", ONLINE);
            map.put("offline", OFFLINE);
            map.put("configuring", CONFIGURING);
            map.put("configure_failed", CONFIGURE_FAILED);
            map.put("checking", CHECKING);
            map.put("check_failed", CHECK_FAILED);
            map.put("deleting", DELETING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainStatusEnum(String value) {
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
        public static DomainStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DomainStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DomainStatusEnum(value);
            }
            return result;
        }

        public static DomainStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DomainStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainStatusEnum) {
                return this.value.equals(((DomainStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_status")

    private DomainStatusEnum domainStatus;

    /** 华为云CDN提供的加速服务范围，包含： - mainland_china 中国大陆 - outside_mainland_china 中国大陆境外 - global 全球。 */
    public static final class ServiceAreaEnum {

        /** Enum MAINLAND_CHINA for value: "mainland_china" */
        public static final ServiceAreaEnum MAINLAND_CHINA = new ServiceAreaEnum("mainland_china");

        /** Enum OUTSIDE_MAINLAND_CHINA for value: "outside_mainland_china" */
        public static final ServiceAreaEnum OUTSIDE_MAINLAND_CHINA = new ServiceAreaEnum("outside_mainland_china");

        /** Enum GLOBAL for value: "global" */
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
            ServiceAreaEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ServiceAreaEnum(value);
            }
            return result;
        }

        public static ServiceAreaEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ServiceAreaEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListDomainsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 加速域名，采用模糊匹配的方式。（长度限制为1-255字符）。
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ListDomainsRequest withBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
        return this;
    }

    /** 加速域名的业务类型。取值： - web（网站加速） - download（文件下载加速） - video（点播加速） - wholeSite（全站加速）
     * 
     * @return businessType */
    public BusinessTypeEnum getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
    }

    public ListDomainsRequest withDomainStatus(DomainStatusEnum domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    /** 加速域名状态。取值意义： - online表示“已开启” - offline表示“已停用” - configuring表示“配置中” - configure_failed表示“配置失败” - checking表示“审核中”
     * - check_failed表示“审核未通过” - deleting表示“删除中”。
     * 
     * @return domainStatus */
    public DomainStatusEnum getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(DomainStatusEnum domainStatus) {
        this.domainStatus = domainStatus;
    }

    public ListDomainsRequest withServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /** 华为云CDN提供的加速服务范围，包含： - mainland_china 中国大陆 - outside_mainland_china 中国大陆境外 - global 全球。
     * 
     * @return serviceArea */
    public ServiceAreaEnum getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ListDomainsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /** 每页的数量，取值范围1-10000，不设值时默认值为30。 minimum: 1 maximum: 10000
     * 
     * @return pageSize */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListDomainsRequest withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /** 查询的页码。取值范围1-65535，不设值时默认值为1。 minimum: 1 maximum: 65535
     * 
     * @return pageNumber */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ListDomainsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。该参数仅对开启了企业项目功能的用户生效，不传表示查询default项目。\"ALL\"表示查询所有该用户已授权项目的资源。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDomainsRequest listDomainsRequest = (ListDomainsRequest) o;
        return Objects.equals(this.domainName, listDomainsRequest.domainName)
            && Objects.equals(this.businessType, listDomainsRequest.businessType)
            && Objects.equals(this.domainStatus, listDomainsRequest.domainStatus)
            && Objects.equals(this.serviceArea, listDomainsRequest.serviceArea)
            && Objects.equals(this.pageSize, listDomainsRequest.pageSize)
            && Objects.equals(this.pageNumber, listDomainsRequest.pageNumber)
            && Objects.equals(this.enterpriseProjectId, listDomainsRequest.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(domainName, businessType, domainStatus, serviceArea, pageSize, pageNumber, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainsRequest {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
