package com.huaweicloud.sdk.geip.v3.model;

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
public class ListSupportRegionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    /**
     * Gets or Sets fields
     */
    public static final class FieldsEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final FieldsEnum ID = new FieldsEnum("id");

        /**
         * Enum INSTANCE_TYPE for value: "instance_type"
         */
        public static final FieldsEnum INSTANCE_TYPE = new FieldsEnum("instance_type");

        /**
         * Enum ACCESS_SITE for value: "access_site"
         */
        public static final FieldsEnum ACCESS_SITE = new FieldsEnum("access_site");

        /**
         * Enum REGION_ID for value: "region_id"
         */
        public static final FieldsEnum REGION_ID = new FieldsEnum("region_id");

        /**
         * Enum PUBLIC_BORDER_GROUP for value: "public_border_group"
         */
        public static final FieldsEnum PUBLIC_BORDER_GROUP = new FieldsEnum("public_border_group");

        /**
         * Enum REMOTE_ENDPOINT for value: "remote_endpoint"
         */
        public static final FieldsEnum REMOTE_ENDPOINT = new FieldsEnum("remote_endpoint");

        /**
         * Enum STATUS for value: "status"
         */
        public static final FieldsEnum STATUS = new FieldsEnum("status");

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final FieldsEnum CREATED_AT = new FieldsEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final FieldsEnum UPDATED_AT = new FieldsEnum("updated_at");

        private static final Map<String, FieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldsEnum> createStaticFields() {
            Map<String, FieldsEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("instance_type", INSTANCE_TYPE);
            map.put("access_site", ACCESS_SITE);
            map.put("region_id", REGION_ID);
            map.put("public_border_group", PUBLIC_BORDER_GROUP);
            map.put("remote_endpoint", REMOTE_ENDPOINT);
            map.put("status", STATUS);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FieldsEnum(String value) {
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
        public static FieldsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FieldsEnum(value));
        }

        public static FieldsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FieldsEnum) {
                return this.value.equals(((FieldsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<FieldsEnum> fields = null;

    /**
     * Gets or Sets sortKey
     */
    public static final class SortKeyEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final SortKeyEnum ID = new SortKeyEnum("id");

        /**
         * Enum INSTANCE_TYPE for value: "instance_type"
         */
        public static final SortKeyEnum INSTANCE_TYPE = new SortKeyEnum("instance_type");

        /**
         * Enum ACCESS_SITE for value: "access_site"
         */
        public static final SortKeyEnum ACCESS_SITE = new SortKeyEnum("access_site");

        /**
         * Enum PUBLIC_BORDER_GROUP for value: "public_border_group"
         */
        public static final SortKeyEnum PUBLIC_BORDER_GROUP = new SortKeyEnum("public_border_group");

        /**
         * Enum REGION_ID for value: "region_id"
         */
        public static final SortKeyEnum REGION_ID = new SortKeyEnum("region_id");

        /**
         * Enum REMOTE_ENDPOINT for value: "remote_endpoint"
         */
        public static final SortKeyEnum REMOTE_ENDPOINT = new SortKeyEnum("remote_endpoint");

        /**
         * Enum STATUS for value: "status"
         */
        public static final SortKeyEnum STATUS = new SortKeyEnum("status");

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortKeyEnum CREATED_AT = new SortKeyEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final SortKeyEnum UPDATED_AT = new SortKeyEnum("updated_at");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("instance_type", INSTANCE_TYPE);
            map.put("access_site", ACCESS_SITE);
            map.put("public_border_group", PUBLIC_BORDER_GROUP);
            map.put("region_id", REGION_ID);
            map.put("remote_endpoint", REMOTE_ENDPOINT);
            map.put("status", STATUS);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortKeyEnum(value));
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private List<SortKeyEnum> sortKey = null;

    /**
     * Gets or Sets sortDir
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortDirEnum(value));
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private List<SortDirEnum> sortDir = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private List<String> instanceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private List<String> publicBorderGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_site")

    private List<String> accessSite = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private List<String> regionId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_endpoint")

    private List<String> remoteEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    public ListSupportRegionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页条数
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSupportRegionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页起始点
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSupportRegionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页起始点
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSupportRegionsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 翻页方向
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListSupportRegionsRequest withFields(List<FieldsEnum> fields) {
        this.fields = fields;
        return this;
    }

    public ListSupportRegionsRequest addFieldsItem(FieldsEnum fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListSupportRegionsRequest withFields(Consumer<List<FieldsEnum>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * Get fields
     * @return fields
     */
    public List<FieldsEnum> getFields() {
        return fields;
    }

    public void setFields(List<FieldsEnum> fields) {
        this.fields = fields;
    }

    public ListSupportRegionsRequest withSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListSupportRegionsRequest addSortKeyItem(SortKeyEnum sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListSupportRegionsRequest withSortKey(Consumer<List<SortKeyEnum>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    /**
     * 按照sort_key指定的字段排序
     * @return sortKey
     */
    public List<SortKeyEnum> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
    }

    public ListSupportRegionsRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListSupportRegionsRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListSupportRegionsRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 排序的方向，倒序或者正序
     * @return sortDir
     */
    public List<SortDirEnum> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
    }

    public ListSupportRegionsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListSupportRegionsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListSupportRegionsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListSupportRegionsRequest withInstanceType(List<String> instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public ListSupportRegionsRequest addInstanceTypeItem(String instanceTypeItem) {
        if (this.instanceType == null) {
            this.instanceType = new ArrayList<>();
        }
        this.instanceType.add(instanceTypeItem);
        return this;
    }

    public ListSupportRegionsRequest withInstanceType(Consumer<List<String>> instanceTypeSetter) {
        if (this.instanceType == null) {
            this.instanceType = new ArrayList<>();
        }
        instanceTypeSetter.accept(this.instanceType);
        return this;
    }

    /**
     * Get instanceType
     * @return instanceType
     */
    public List<String> getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(List<String> instanceType) {
        this.instanceType = instanceType;
    }

    public ListSupportRegionsRequest withPublicBorderGroup(List<String> publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    public ListSupportRegionsRequest addPublicBorderGroupItem(String publicBorderGroupItem) {
        if (this.publicBorderGroup == null) {
            this.publicBorderGroup = new ArrayList<>();
        }
        this.publicBorderGroup.add(publicBorderGroupItem);
        return this;
    }

    public ListSupportRegionsRequest withPublicBorderGroup(Consumer<List<String>> publicBorderGroupSetter) {
        if (this.publicBorderGroup == null) {
            this.publicBorderGroup = new ArrayList<>();
        }
        publicBorderGroupSetter.accept(this.publicBorderGroup);
        return this;
    }

    /**
     * Get publicBorderGroup
     * @return publicBorderGroup
     */
    public List<String> getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(List<String> publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListSupportRegionsRequest withAccessSite(List<String> accessSite) {
        this.accessSite = accessSite;
        return this;
    }

    public ListSupportRegionsRequest addAccessSiteItem(String accessSiteItem) {
        if (this.accessSite == null) {
            this.accessSite = new ArrayList<>();
        }
        this.accessSite.add(accessSiteItem);
        return this;
    }

    public ListSupportRegionsRequest withAccessSite(Consumer<List<String>> accessSiteSetter) {
        if (this.accessSite == null) {
            this.accessSite = new ArrayList<>();
        }
        accessSiteSetter.accept(this.accessSite);
        return this;
    }

    /**
     * Get accessSite
     * @return accessSite
     */
    public List<String> getAccessSite() {
        return accessSite;
    }

    public void setAccessSite(List<String> accessSite) {
        this.accessSite = accessSite;
    }

    public ListSupportRegionsRequest withRegionId(List<String> regionId) {
        this.regionId = regionId;
        return this;
    }

    public ListSupportRegionsRequest addRegionIdItem(String regionIdItem) {
        if (this.regionId == null) {
            this.regionId = new ArrayList<>();
        }
        this.regionId.add(regionIdItem);
        return this;
    }

    public ListSupportRegionsRequest withRegionId(Consumer<List<String>> regionIdSetter) {
        if (this.regionId == null) {
            this.regionId = new ArrayList<>();
        }
        regionIdSetter.accept(this.regionId);
        return this;
    }

    /**
     * Get regionId
     * @return regionId
     */
    public List<String> getRegionId() {
        return regionId;
    }

    public void setRegionId(List<String> regionId) {
        this.regionId = regionId;
    }

    public ListSupportRegionsRequest withRemoteEndpoint(List<String> remoteEndpoint) {
        this.remoteEndpoint = remoteEndpoint;
        return this;
    }

    public ListSupportRegionsRequest addRemoteEndpointItem(String remoteEndpointItem) {
        if (this.remoteEndpoint == null) {
            this.remoteEndpoint = new ArrayList<>();
        }
        this.remoteEndpoint.add(remoteEndpointItem);
        return this;
    }

    public ListSupportRegionsRequest withRemoteEndpoint(Consumer<List<String>> remoteEndpointSetter) {
        if (this.remoteEndpoint == null) {
            this.remoteEndpoint = new ArrayList<>();
        }
        remoteEndpointSetter.accept(this.remoteEndpoint);
        return this;
    }

    /**
     * Get remoteEndpoint
     * @return remoteEndpoint
     */
    public List<String> getRemoteEndpoint() {
        return remoteEndpoint;
    }

    public void setRemoteEndpoint(List<String> remoteEndpoint) {
        this.remoteEndpoint = remoteEndpoint;
    }

    public ListSupportRegionsRequest withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListSupportRegionsRequest addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListSupportRegionsRequest withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSupportRegionsRequest that = (ListSupportRegionsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.id, that.id)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.accessSite, that.accessSite) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.remoteEndpoint, that.remoteEndpoint) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            offset,
            marker,
            pageReverse,
            fields,
            sortKey,
            sortDir,
            id,
            instanceType,
            publicBorderGroup,
            accessSite,
            regionId,
            remoteEndpoint,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSupportRegionsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    remoteEndpoint: ").append(toIndentedString(remoteEndpoint)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
