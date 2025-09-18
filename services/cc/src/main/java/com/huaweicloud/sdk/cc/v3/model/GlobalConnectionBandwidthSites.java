package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 站点信息。
 */
public class GlobalConnectionBandwidthSites {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    /**
     * 功能说明：站点类型，必须跟站点编码对应，一段编码为大区，两段编码为区域，三段编码为城域。 取值范围： - Area: 大区站点 - SubArea: 区域站点 - Region: 城域站点
     */
    public static final class SiteTypeEnum {

        /**
         * Enum AREA for value: "Area"
         */
        public static final SiteTypeEnum AREA = new SiteTypeEnum("Area");

        /**
         * Enum SUBAREA for value: "SubArea"
         */
        public static final SiteTypeEnum SUBAREA = new SiteTypeEnum("SubArea");

        /**
         * Enum REGION for value: "Region"
         */
        public static final SiteTypeEnum REGION = new SiteTypeEnum("Region");

        private static final Map<String, SiteTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SiteTypeEnum> createStaticFields() {
            Map<String, SiteTypeEnum> map = new HashMap<>();
            map.put("Area", AREA);
            map.put("SubArea", SUBAREA);
            map.put("Region", REGION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SiteTypeEnum(String value) {
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
        public static SiteTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SiteTypeEnum(value));
        }

        public static SiteTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SiteTypeEnum) {
                return this.value.equals(((SiteTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_type")

    private SiteTypeEnum siteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_list")

    private String serviceList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_list")

    private List<SiteGroupReferenceInfo> groupList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    public GlobalConnectionBandwidthSites withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GlobalConnectionBandwidthSites withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GlobalConnectionBandwidthSites withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 实例创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public GlobalConnectionBandwidthSites withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 实例更新时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GlobalConnectionBandwidthSites withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * RegionID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public GlobalConnectionBandwidthSites withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 功能说明：站点信息自定义的英文名称。 取值范围：1-255个字符
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public GlobalConnectionBandwidthSites withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 功能说明：站点信息自定义的中文名称。 取值范围：1-64个字符。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public GlobalConnectionBandwidthSites withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 功能说明：站点编码，格式为<area_code>[-<subarea_code>[-<region_code>]]。 取值范围：1-64个字符。
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public GlobalConnectionBandwidthSites withSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * 功能说明：站点类型，必须跟站点编码对应，一段编码为大区，两段编码为区域，三段编码为城域。 取值范围： - Area: 大区站点 - SubArea: 区域站点 - Region: 城域站点
     * @return siteType
     */
    public SiteTypeEnum getSiteType() {
        return siteType;
    }

    public void setSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
    }

    public GlobalConnectionBandwidthSites withServiceList(String serviceList) {
        this.serviceList = serviceList;
        return this;
    }

    /**
     * 功能说明：站点支持的服务列表，多个服务用\",\"分隔。 取值范围：0-255个字符
     * @return serviceList
     */
    public String getServiceList() {
        return serviceList;
    }

    public void setServiceList(String serviceList) {
        this.serviceList = serviceList;
    }

    public GlobalConnectionBandwidthSites withGroupList(List<SiteGroupReferenceInfo> groupList) {
        this.groupList = groupList;
        return this;
    }

    public GlobalConnectionBandwidthSites addGroupListItem(SiteGroupReferenceInfo groupListItem) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        this.groupList.add(groupListItem);
        return this;
    }

    public GlobalConnectionBandwidthSites withGroupList(Consumer<List<SiteGroupReferenceInfo>> groupListSetter) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        groupListSetter.accept(this.groupList);
        return this;
    }

    /**
     * Get groupList
     * @return groupList
     */
    public List<SiteGroupReferenceInfo> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<SiteGroupReferenceInfo> groupList) {
        this.groupList = groupList;
    }

    public GlobalConnectionBandwidthSites withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 功能说明：用于标记是中心还是边缘站点。中心：center 取值范围：0-255个字符。
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalConnectionBandwidthSites that = (GlobalConnectionBandwidthSites) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCn, that.nameCn) && Objects.equals(this.siteCode, that.siteCode)
            && Objects.equals(this.siteType, that.siteType) && Objects.equals(this.serviceList, that.serviceList)
            && Objects.equals(this.groupList, that.groupList)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            createdAt,
            updatedAt,
            regionId,
            nameEn,
            nameCn,
            siteCode,
            siteType,
            serviceList,
            groupList,
            publicBorderGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalConnectionBandwidthSites {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
        sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
        sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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
