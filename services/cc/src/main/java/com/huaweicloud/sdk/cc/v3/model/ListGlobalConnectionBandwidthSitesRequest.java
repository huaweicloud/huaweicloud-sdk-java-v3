package com.huaweicloud.sdk.cc.v3.model;

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
 * Request Object
 */
public class ListGlobalConnectionBandwidthSitesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

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
     * 站点类型： - Area: 大区 - SubArea: 区域 - Region: 城域
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

    public ListGlobalConnectionBandwidthSitesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListGlobalConnectionBandwidthSitesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 翻页信息，从上次API调用返回的翻页数据中获取，可填写前一页marker或者后一页marker，填入前一页previous_marker就向前翻页，后一页next_marker就向后翻页。 翻页过程中，查询条件不能修改，包括过滤条件、排序条件、limit。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListGlobalConnectionBandwidthSitesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListGlobalConnectionBandwidthSitesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListGlobalConnectionBandwidthSitesRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据ID查询，可查询多个ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListGlobalConnectionBandwidthSitesRequest withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 站点信息自定义英文名称。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public ListGlobalConnectionBandwidthSitesRequest withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 站点信息自定义中文名称。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public ListGlobalConnectionBandwidthSitesRequest withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 站点编码。
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public ListGlobalConnectionBandwidthSitesRequest withSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * 站点类型： - Area: 大区 - SubArea: 区域 - Region: 城域
     * @return siteType
     */
    public SiteTypeEnum getSiteType() {
        return siteType;
    }

    public void setSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConnectionBandwidthSitesRequest that = (ListGlobalConnectionBandwidthSitesRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.id, that.id) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCn, that.nameCn) && Objects.equals(this.siteCode, that.siteCode)
            && Objects.equals(this.siteType, that.siteType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, nameEn, nameCn, siteCode, siteType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConnectionBandwidthSitesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
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
