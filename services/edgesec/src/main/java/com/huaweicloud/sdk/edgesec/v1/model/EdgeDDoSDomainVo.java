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
 * EdgeDDoSDomainVo
 */
public class EdgeDDoSDomainVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    /**
     * 域名在CDN所属区域
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
         * Enum EUROPE for value: "europe"
         */
        public static final AreaTypeEnum EUROPE = new AreaTypeEnum("europe");

        /**
         * Enum GLOBAL for value: "global"
         */
        public static final AreaTypeEnum GLOBAL = new AreaTypeEnum("global");

        private static final Map<String, AreaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AreaTypeEnum> createStaticFields() {
            Map<String, AreaTypeEnum> map = new HashMap<>();
            map.put("mainland_china", MAINLAND_CHINA);
            map.put("outside_mainland_china", OUTSIDE_MAINLAND_CHINA);
            map.put("europe", EUROPE);
            map.put("global", GLOBAL);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dispatch_status")

    private Integer dispatchStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_switch")

    private Integer protectedSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_date")

    private Long openDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_date")

    private Long closeDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public EdgeDDoSDomainVo withId(String id) {
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

    public EdgeDDoSDomainVo withDomainName(String domainName) {
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

    public EdgeDDoSDomainVo withTenantId(String tenantId) {
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

    public EdgeDDoSDomainVo withAreaType(AreaTypeEnum areaType) {
        this.areaType = areaType;
        return this;
    }

    /**
     * 域名在CDN所属区域
     * @return areaType
     */
    public AreaTypeEnum getAreaType() {
        return areaType;
    }

    public void setAreaType(AreaTypeEnum areaType) {
        this.areaType = areaType;
    }

    public EdgeDDoSDomainVo withDispatchStatus(Integer dispatchStatus) {
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

    public EdgeDDoSDomainVo withProtectedSwitch(Integer protectedSwitch) {
        this.protectedSwitch = protectedSwitch;
        return this;
    }

    /**
     * 防护开关（0:关，1:开）
     * @return protectedSwitch
     */
    public Integer getProtectedSwitch() {
        return protectedSwitch;
    }

    public void setProtectedSwitch(Integer protectedSwitch) {
        this.protectedSwitch = protectedSwitch;
    }

    public EdgeDDoSDomainVo withOpenDate(Long openDate) {
        this.openDate = openDate;
        return this;
    }

    /**
     * 开启时间
     * @return openDate
     */
    public Long getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Long openDate) {
        this.openDate = openDate;
    }

    public EdgeDDoSDomainVo withCloseDate(Long closeDate) {
        this.closeDate = closeDate;
        return this;
    }

    /**
     * 关闭时间
     * @return closeDate
     */
    public Long getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Long closeDate) {
        this.closeDate = closeDate;
    }

    public EdgeDDoSDomainVo withEnterpriseProjectId(String enterpriseProjectId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EdgeDDoSDomainVo that = (EdgeDDoSDomainVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.areaType, that.areaType)
            && Objects.equals(this.dispatchStatus, that.dispatchStatus)
            && Objects.equals(this.protectedSwitch, that.protectedSwitch)
            && Objects.equals(this.openDate, that.openDate) && Objects.equals(this.closeDate, that.closeDate)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainName,
            tenantId,
            areaType,
            dispatchStatus,
            protectedSwitch,
            openDate,
            closeDate,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeDDoSDomainVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
        sb.append("    dispatchStatus: ").append(toIndentedString(dispatchStatus)).append("\n");
        sb.append("    protectedSwitch: ").append(toIndentedString(protectedSwitch)).append("\n");
        sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
        sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
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
