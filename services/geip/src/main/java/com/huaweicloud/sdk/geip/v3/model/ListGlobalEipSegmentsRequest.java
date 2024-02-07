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
public class ListGlobalEipSegmentsRequest {

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
         * Enum NAME for value: "name"
         */
        public static final FieldsEnum NAME = new FieldsEnum("name");

        /**
         * Enum DESCRIPTION for value: "description"
         */
        public static final FieldsEnum DESCRIPTION = new FieldsEnum("description");

        /**
         * Enum DOMAIN_ID for value: "domain_id"
         */
        public static final FieldsEnum DOMAIN_ID = new FieldsEnum("domain_id");

        /**
         * Enum ACCESS_SITE for value: "access_site"
         */
        public static final FieldsEnum ACCESS_SITE = new FieldsEnum("access_site");

        /**
         * Enum GEIP_POOL_NAME for value: "geip_pool_name"
         */
        public static final FieldsEnum GEIP_POOL_NAME = new FieldsEnum("geip_pool_name");

        /**
         * Enum ISP for value: "isp"
         */
        public static final FieldsEnum ISP = new FieldsEnum("isp");

        /**
         * Enum IP_VERSION for value: "ip_version"
         */
        public static final FieldsEnum IP_VERSION = new FieldsEnum("ip_version");

        /**
         * Enum CIDR for value: "cidr"
         */
        public static final FieldsEnum CIDR = new FieldsEnum("cidr");

        /**
         * Enum CIDR_V6 for value: "cidr_v6"
         */
        public static final FieldsEnum CIDR_V6 = new FieldsEnum("cidr_v6");

        /**
         * Enum FREEZEN for value: "freezen"
         */
        public static final FieldsEnum FREEZEN = new FieldsEnum("freezen");

        /**
         * Enum FREEZEN_INFO for value: "freezen_info"
         */
        public static final FieldsEnum FREEZEN_INFO = new FieldsEnum("freezen_info");

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

        /**
         * Enum INTERNET_BANDWIDTH for value: "internet_bandwidth"
         */
        public static final FieldsEnum INTERNET_BANDWIDTH = new FieldsEnum("internet_bandwidth");

        /**
         * Enum ASSOCIATE_INSTANCE for value: "associate_instance"
         */
        public static final FieldsEnum ASSOCIATE_INSTANCE = new FieldsEnum("associate_instance");

        /**
         * Enum IS_PRE_PAID for value: "is_pre_paid"
         */
        public static final FieldsEnum IS_PRE_PAID = new FieldsEnum("is_pre_paid");

        /**
         * Enum TAGS for value: "tags"
         */
        public static final FieldsEnum TAGS = new FieldsEnum("tags");

        /**
         * Enum SYS_TAGS for value: "sys_tags"
         */
        public static final FieldsEnum SYS_TAGS = new FieldsEnum("sys_tags");

        /**
         * Enum ENTERPRISE_PROJECT_ID for value: "enterprise_project_id"
         */
        public static final FieldsEnum ENTERPRISE_PROJECT_ID = new FieldsEnum("enterprise_project_id");

        private static final Map<String, FieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldsEnum> createStaticFields() {
            Map<String, FieldsEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("name", NAME);
            map.put("description", DESCRIPTION);
            map.put("domain_id", DOMAIN_ID);
            map.put("access_site", ACCESS_SITE);
            map.put("geip_pool_name", GEIP_POOL_NAME);
            map.put("isp", ISP);
            map.put("ip_version", IP_VERSION);
            map.put("cidr", CIDR);
            map.put("cidr_v6", CIDR_V6);
            map.put("freezen", FREEZEN);
            map.put("freezen_info", FREEZEN_INFO);
            map.put("status", STATUS);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            map.put("internet_bandwidth", INTERNET_BANDWIDTH);
            map.put("associate_instance", ASSOCIATE_INSTANCE);
            map.put("is_pre_paid", IS_PRE_PAID);
            map.put("tags", TAGS);
            map.put("sys_tags", SYS_TAGS);
            map.put("enterprise_project_id", ENTERPRISE_PROJECT_ID);
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
         * Enum CIDR for value: "cidr"
         */
        public static final SortKeyEnum CIDR = new SortKeyEnum("cidr");

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
            map.put("cidr", CIDR);
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
    @JsonProperty(value = "internet_bandwidth_id")

    private List<String> internetBandwidthId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_like")

    private String nameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_site")

    private List<String> accessSite = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geip_pool_name")

    private List<String> geipPoolName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private List<String> isp = null;

    /**
     * Gets or Sets ipVersion
     */
    public static final class IpVersionEnum {

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final IpVersionEnum NUMBER_4 = new IpVersionEnum(4);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final IpVersionEnum NUMBER_6 = new IpVersionEnum(6);

        private static final Map<Integer, IpVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IpVersionEnum> createStaticFields() {
            Map<Integer, IpVersionEnum> map = new HashMap<>();
            map.put(4, NUMBER_4);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IpVersionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IpVersionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpVersionEnum(value));
        }

        public static IpVersionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private List<IpVersionEnum> ipVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private List<String> cidr = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_v6")

    private List<String> cidrV6 = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezen")

    private List<Boolean> freezen = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth_is_null")

    private List<Boolean> internetBandwidthIsNull = null;

    /**
     * Gets or Sets status
     */
    public static final class StatusEnum {

        /**
         * Enum IDLE for value: "idle"
         */
        public static final StatusEnum IDLE = new StatusEnum("idle");

        /**
         * Enum INUSE for value: "inuse"
         */
        public static final StatusEnum INUSE = new StatusEnum("inuse");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("idle", IDLE);
            map.put("inuse", INUSE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private List<StatusEnum> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.region")

    private List<String> associateInstanceRegion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.instance_type")

    private List<String> associateInstanceInstanceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.public_border_group")

    private List<String> associateInstancePublicBorderGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.instance_site")

    private List<String> associateInstanceInstanceSite = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.instance_id")

    private List<String> associateInstanceInstanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.project_id")

    private List<String> associateInstanceProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.service_id")

    private List<String> associateInstanceServiceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.service_type")

    private List<String> associateInstanceServiceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public ListGlobalEipSegmentsRequest withLimit(Integer limit) {
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

    public ListGlobalEipSegmentsRequest withOffset(Integer offset) {
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

    public ListGlobalEipSegmentsRequest withMarker(String marker) {
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

    public ListGlobalEipSegmentsRequest withPageReverse(Boolean pageReverse) {
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

    public ListGlobalEipSegmentsRequest withFields(List<FieldsEnum> fields) {
        this.fields = fields;
        return this;
    }

    public ListGlobalEipSegmentsRequest addFieldsItem(FieldsEnum fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withFields(Consumer<List<FieldsEnum>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 只显示指定的字段
     * @return fields
     */
    public List<FieldsEnum> getFields() {
        return fields;
    }

    public void setFields(List<FieldsEnum> fields) {
        this.fields = fields;
    }

    public ListGlobalEipSegmentsRequest withSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListGlobalEipSegmentsRequest addSortKeyItem(SortKeyEnum sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withSortKey(Consumer<List<SortKeyEnum>> sortKeySetter) {
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

    public ListGlobalEipSegmentsRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListGlobalEipSegmentsRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
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

    public ListGlobalEipSegmentsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListGlobalEipSegmentsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据资源ID过滤
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListGlobalEipSegmentsRequest withInternetBandwidthId(List<String> internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }

    public ListGlobalEipSegmentsRequest addInternetBandwidthIdItem(String internetBandwidthIdItem) {
        if (this.internetBandwidthId == null) {
            this.internetBandwidthId = new ArrayList<>();
        }
        this.internetBandwidthId.add(internetBandwidthIdItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withInternetBandwidthId(Consumer<List<String>> internetBandwidthIdSetter) {
        if (this.internetBandwidthId == null) {
            this.internetBandwidthId = new ArrayList<>();
        }
        internetBandwidthIdSetter.accept(this.internetBandwidthId);
        return this;
    }

    /**
     * 根据全域公网带宽的ID过滤
     * @return internetBandwidthId
     */
    public List<String> getInternetBandwidthId() {
        return internetBandwidthId;
    }

    public void setInternetBandwidthId(List<String> internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
    }

    public ListGlobalEipSegmentsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListGlobalEipSegmentsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 根据名称过滤
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListGlobalEipSegmentsRequest withNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    /**
     * 根据名称模糊匹配
     * @return nameLike
     */
    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public ListGlobalEipSegmentsRequest withAccessSite(List<String> accessSite) {
        this.accessSite = accessSite;
        return this;
    }

    public ListGlobalEipSegmentsRequest addAccessSiteItem(String accessSiteItem) {
        if (this.accessSite == null) {
            this.accessSite = new ArrayList<>();
        }
        this.accessSite.add(accessSiteItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withAccessSite(Consumer<List<String>> accessSiteSetter) {
        if (this.accessSite == null) {
            this.accessSite = new ArrayList<>();
        }
        accessSiteSetter.accept(this.accessSite);
        return this;
    }

    /**
     * 根据接入点过滤
     * @return accessSite
     */
    public List<String> getAccessSite() {
        return accessSite;
    }

    public void setAccessSite(List<String> accessSite) {
        this.accessSite = accessSite;
    }

    public ListGlobalEipSegmentsRequest withGeipPoolName(List<String> geipPoolName) {
        this.geipPoolName = geipPoolName;
        return this;
    }

    public ListGlobalEipSegmentsRequest addGeipPoolNameItem(String geipPoolNameItem) {
        if (this.geipPoolName == null) {
            this.geipPoolName = new ArrayList<>();
        }
        this.geipPoolName.add(geipPoolNameItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withGeipPoolName(Consumer<List<String>> geipPoolNameSetter) {
        if (this.geipPoolName == null) {
            this.geipPoolName = new ArrayList<>();
        }
        geipPoolNameSetter.accept(this.geipPoolName);
        return this;
    }

    /**
     * 根据全域弹性公网IP池名称过滤
     * @return geipPoolName
     */
    public List<String> getGeipPoolName() {
        return geipPoolName;
    }

    public void setGeipPoolName(List<String> geipPoolName) {
        this.geipPoolName = geipPoolName;
    }

    public ListGlobalEipSegmentsRequest withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    public ListGlobalEipSegmentsRequest addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withIsp(Consumer<List<String>> ispSetter) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        ispSetter.accept(this.isp);
        return this;
    }

    /**
     * 根据运营商线路过滤
     * @return isp
     */
    public List<String> getIsp() {
        return isp;
    }

    public void setIsp(List<String> isp) {
        this.isp = isp;
    }

    public ListGlobalEipSegmentsRequest withIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public ListGlobalEipSegmentsRequest addIpVersionItem(IpVersionEnum ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withIpVersion(Consumer<List<IpVersionEnum>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /**
     * 根据可分配的IP版本过滤
     * @return ipVersion
     */
    public List<IpVersionEnum> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListGlobalEipSegmentsRequest withCidr(List<String> cidr) {
        this.cidr = cidr;
        return this;
    }

    public ListGlobalEipSegmentsRequest addCidrItem(String cidrItem) {
        if (this.cidr == null) {
            this.cidr = new ArrayList<>();
        }
        this.cidr.add(cidrItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withCidr(Consumer<List<String>> cidrSetter) {
        if (this.cidr == null) {
            this.cidr = new ArrayList<>();
        }
        cidrSetter.accept(this.cidr);
        return this;
    }

    /**
     * 根据分配的CIDR过滤
     * @return cidr
     */
    public List<String> getCidr() {
        return cidr;
    }

    public void setCidr(List<String> cidr) {
        this.cidr = cidr;
    }

    public ListGlobalEipSegmentsRequest withCidrV6(List<String> cidrV6) {
        this.cidrV6 = cidrV6;
        return this;
    }

    public ListGlobalEipSegmentsRequest addCidrV6Item(String cidrV6Item) {
        if (this.cidrV6 == null) {
            this.cidrV6 = new ArrayList<>();
        }
        this.cidrV6.add(cidrV6Item);
        return this;
    }

    public ListGlobalEipSegmentsRequest withCidrV6(Consumer<List<String>> cidrV6Setter) {
        if (this.cidrV6 == null) {
            this.cidrV6 = new ArrayList<>();
        }
        cidrV6Setter.accept(this.cidrV6);
        return this;
    }

    /**
     * 根据分配的IPv6 CIDR过滤
     * @return cidrV6
     */
    public List<String> getCidrV6() {
        return cidrV6;
    }

    public void setCidrV6(List<String> cidrV6) {
        this.cidrV6 = cidrV6;
    }

    public ListGlobalEipSegmentsRequest withFreezen(List<Boolean> freezen) {
        this.freezen = freezen;
        return this;
    }

    public ListGlobalEipSegmentsRequest addFreezenItem(Boolean freezenItem) {
        if (this.freezen == null) {
            this.freezen = new ArrayList<>();
        }
        this.freezen.add(freezenItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withFreezen(Consumer<List<Boolean>> freezenSetter) {
        if (this.freezen == null) {
            this.freezen = new ArrayList<>();
        }
        freezenSetter.accept(this.freezen);
        return this;
    }

    /**
     * 根据是否冻结过滤
     * @return freezen
     */
    public List<Boolean> getFreezen() {
        return freezen;
    }

    public void setFreezen(List<Boolean> freezen) {
        this.freezen = freezen;
    }

    public ListGlobalEipSegmentsRequest withInternetBandwidthIsNull(List<Boolean> internetBandwidthIsNull) {
        this.internetBandwidthIsNull = internetBandwidthIsNull;
        return this;
    }

    public ListGlobalEipSegmentsRequest addInternetBandwidthIsNullItem(Boolean internetBandwidthIsNullItem) {
        if (this.internetBandwidthIsNull == null) {
            this.internetBandwidthIsNull = new ArrayList<>();
        }
        this.internetBandwidthIsNull.add(internetBandwidthIsNullItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withInternetBandwidthIsNull(
        Consumer<List<Boolean>> internetBandwidthIsNullSetter) {
        if (this.internetBandwidthIsNull == null) {
            this.internetBandwidthIsNull = new ArrayList<>();
        }
        internetBandwidthIsNullSetter.accept(this.internetBandwidthIsNull);
        return this;
    }

    /**
     * 根据是否绑定全域公网带宽过滤
     * @return internetBandwidthIsNull
     */
    public List<Boolean> getInternetBandwidthIsNull() {
        return internetBandwidthIsNull;
    }

    public void setInternetBandwidthIsNull(List<Boolean> internetBandwidthIsNull) {
        this.internetBandwidthIsNull = internetBandwidthIsNull;
    }

    public ListGlobalEipSegmentsRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public ListGlobalEipSegmentsRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 根据状态过滤
     * @return status
     */
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceRegion(List<String> associateInstanceRegion) {
        this.associateInstanceRegion = associateInstanceRegion;
        return this;
    }

    public ListGlobalEipSegmentsRequest addAssociateInstanceRegionItem(String associateInstanceRegionItem) {
        if (this.associateInstanceRegion == null) {
            this.associateInstanceRegion = new ArrayList<>();
        }
        this.associateInstanceRegion.add(associateInstanceRegionItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceRegion(
        Consumer<List<String>> associateInstanceRegionSetter) {
        if (this.associateInstanceRegion == null) {
            this.associateInstanceRegion = new ArrayList<>();
        }
        associateInstanceRegionSetter.accept(this.associateInstanceRegion);
        return this;
    }

    /**
     * 根据绑定实例所属的局点过滤
     * @return associateInstanceRegion
     */
    public List<String> getAssociateInstanceRegion() {
        return associateInstanceRegion;
    }

    public void setAssociateInstanceRegion(List<String> associateInstanceRegion) {
        this.associateInstanceRegion = associateInstanceRegion;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceInstanceType(List<String> associateInstanceInstanceType) {
        this.associateInstanceInstanceType = associateInstanceInstanceType;
        return this;
    }

    public ListGlobalEipSegmentsRequest addAssociateInstanceInstanceTypeItem(String associateInstanceInstanceTypeItem) {
        if (this.associateInstanceInstanceType == null) {
            this.associateInstanceInstanceType = new ArrayList<>();
        }
        this.associateInstanceInstanceType.add(associateInstanceInstanceTypeItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceInstanceType(
        Consumer<List<String>> associateInstanceInstanceTypeSetter) {
        if (this.associateInstanceInstanceType == null) {
            this.associateInstanceInstanceType = new ArrayList<>();
        }
        associateInstanceInstanceTypeSetter.accept(this.associateInstanceInstanceType);
        return this;
    }

    /**
     * 根据绑定实例的类型过滤
     * @return associateInstanceInstanceType
     */
    public List<String> getAssociateInstanceInstanceType() {
        return associateInstanceInstanceType;
    }

    public void setAssociateInstanceInstanceType(List<String> associateInstanceInstanceType) {
        this.associateInstanceInstanceType = associateInstanceInstanceType;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstancePublicBorderGroup(
        List<String> associateInstancePublicBorderGroup) {
        this.associateInstancePublicBorderGroup = associateInstancePublicBorderGroup;
        return this;
    }

    public ListGlobalEipSegmentsRequest addAssociateInstancePublicBorderGroupItem(
        String associateInstancePublicBorderGroupItem) {
        if (this.associateInstancePublicBorderGroup == null) {
            this.associateInstancePublicBorderGroup = new ArrayList<>();
        }
        this.associateInstancePublicBorderGroup.add(associateInstancePublicBorderGroupItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstancePublicBorderGroup(
        Consumer<List<String>> associateInstancePublicBorderGroupSetter) {
        if (this.associateInstancePublicBorderGroup == null) {
            this.associateInstancePublicBorderGroup = new ArrayList<>();
        }
        associateInstancePublicBorderGroupSetter.accept(this.associateInstancePublicBorderGroup);
        return this;
    }

    /**
     * 根据绑定实例所属的边缘信息过滤
     * @return associateInstancePublicBorderGroup
     */
    public List<String> getAssociateInstancePublicBorderGroup() {
        return associateInstancePublicBorderGroup;
    }

    public void setAssociateInstancePublicBorderGroup(List<String> associateInstancePublicBorderGroup) {
        this.associateInstancePublicBorderGroup = associateInstancePublicBorderGroup;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceInstanceSite(List<String> associateInstanceInstanceSite) {
        this.associateInstanceInstanceSite = associateInstanceInstanceSite;
        return this;
    }

    public ListGlobalEipSegmentsRequest addAssociateInstanceInstanceSiteItem(String associateInstanceInstanceSiteItem) {
        if (this.associateInstanceInstanceSite == null) {
            this.associateInstanceInstanceSite = new ArrayList<>();
        }
        this.associateInstanceInstanceSite.add(associateInstanceInstanceSiteItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceInstanceSite(
        Consumer<List<String>> associateInstanceInstanceSiteSetter) {
        if (this.associateInstanceInstanceSite == null) {
            this.associateInstanceInstanceSite = new ArrayList<>();
        }
        associateInstanceInstanceSiteSetter.accept(this.associateInstanceInstanceSite);
        return this;
    }

    /**
     * 根据绑定实例所在的站点过滤
     * @return associateInstanceInstanceSite
     */
    public List<String> getAssociateInstanceInstanceSite() {
        return associateInstanceInstanceSite;
    }

    public void setAssociateInstanceInstanceSite(List<String> associateInstanceInstanceSite) {
        this.associateInstanceInstanceSite = associateInstanceInstanceSite;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceInstanceId(List<String> associateInstanceInstanceId) {
        this.associateInstanceInstanceId = associateInstanceInstanceId;
        return this;
    }

    public ListGlobalEipSegmentsRequest addAssociateInstanceInstanceIdItem(String associateInstanceInstanceIdItem) {
        if (this.associateInstanceInstanceId == null) {
            this.associateInstanceInstanceId = new ArrayList<>();
        }
        this.associateInstanceInstanceId.add(associateInstanceInstanceIdItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceInstanceId(
        Consumer<List<String>> associateInstanceInstanceIdSetter) {
        if (this.associateInstanceInstanceId == null) {
            this.associateInstanceInstanceId = new ArrayList<>();
        }
        associateInstanceInstanceIdSetter.accept(this.associateInstanceInstanceId);
        return this;
    }

    /**
     * 根据绑定实例的ID过滤
     * @return associateInstanceInstanceId
     */
    public List<String> getAssociateInstanceInstanceId() {
        return associateInstanceInstanceId;
    }

    public void setAssociateInstanceInstanceId(List<String> associateInstanceInstanceId) {
        this.associateInstanceInstanceId = associateInstanceInstanceId;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceProjectId(List<String> associateInstanceProjectId) {
        this.associateInstanceProjectId = associateInstanceProjectId;
        return this;
    }

    public ListGlobalEipSegmentsRequest addAssociateInstanceProjectIdItem(String associateInstanceProjectIdItem) {
        if (this.associateInstanceProjectId == null) {
            this.associateInstanceProjectId = new ArrayList<>();
        }
        this.associateInstanceProjectId.add(associateInstanceProjectIdItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceProjectId(
        Consumer<List<String>> associateInstanceProjectIdSetter) {
        if (this.associateInstanceProjectId == null) {
            this.associateInstanceProjectId = new ArrayList<>();
        }
        associateInstanceProjectIdSetter.accept(this.associateInstanceProjectId);
        return this;
    }

    /**
     * 根据绑定实例所属的项目ID过滤
     * @return associateInstanceProjectId
     */
    public List<String> getAssociateInstanceProjectId() {
        return associateInstanceProjectId;
    }

    public void setAssociateInstanceProjectId(List<String> associateInstanceProjectId) {
        this.associateInstanceProjectId = associateInstanceProjectId;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceServiceId(List<String> associateInstanceServiceId) {
        this.associateInstanceServiceId = associateInstanceServiceId;
        return this;
    }

    public ListGlobalEipSegmentsRequest addAssociateInstanceServiceIdItem(String associateInstanceServiceIdItem) {
        if (this.associateInstanceServiceId == null) {
            this.associateInstanceServiceId = new ArrayList<>();
        }
        this.associateInstanceServiceId.add(associateInstanceServiceIdItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceServiceId(
        Consumer<List<String>> associateInstanceServiceIdSetter) {
        if (this.associateInstanceServiceId == null) {
            this.associateInstanceServiceId = new ArrayList<>();
        }
        associateInstanceServiceIdSetter.accept(this.associateInstanceServiceId);
        return this;
    }

    /**
     * 根据绑定实例所属的服务ID过滤
     * @return associateInstanceServiceId
     */
    public List<String> getAssociateInstanceServiceId() {
        return associateInstanceServiceId;
    }

    public void setAssociateInstanceServiceId(List<String> associateInstanceServiceId) {
        this.associateInstanceServiceId = associateInstanceServiceId;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceServiceType(List<String> associateInstanceServiceType) {
        this.associateInstanceServiceType = associateInstanceServiceType;
        return this;
    }

    public ListGlobalEipSegmentsRequest addAssociateInstanceServiceTypeItem(String associateInstanceServiceTypeItem) {
        if (this.associateInstanceServiceType == null) {
            this.associateInstanceServiceType = new ArrayList<>();
        }
        this.associateInstanceServiceType.add(associateInstanceServiceTypeItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withAssociateInstanceServiceType(
        Consumer<List<String>> associateInstanceServiceTypeSetter) {
        if (this.associateInstanceServiceType == null) {
            this.associateInstanceServiceType = new ArrayList<>();
        }
        associateInstanceServiceTypeSetter.accept(this.associateInstanceServiceType);
        return this;
    }

    /**
     * 根据绑定实例的服务类型过滤
     * @return associateInstanceServiceType
     */
    public List<String> getAssociateInstanceServiceType() {
        return associateInstanceServiceType;
    }

    public void setAssociateInstanceServiceType(List<String> associateInstanceServiceType) {
        this.associateInstanceServiceType = associateInstanceServiceType;
    }

    public ListGlobalEipSegmentsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListGlobalEipSegmentsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 根据企业项目ID过滤
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListGlobalEipSegmentsRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ListGlobalEipSegmentsRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListGlobalEipSegmentsRequest withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 根据标签过滤
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalEipSegmentsRequest that = (ListGlobalEipSegmentsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.id, that.id)
            && Objects.equals(this.internetBandwidthId, that.internetBandwidthId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameLike, that.nameLike)
            && Objects.equals(this.accessSite, that.accessSite) && Objects.equals(this.geipPoolName, that.geipPoolName)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.cidr, that.cidr) && Objects.equals(this.cidrV6, that.cidrV6)
            && Objects.equals(this.freezen, that.freezen)
            && Objects.equals(this.internetBandwidthIsNull, that.internetBandwidthIsNull)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.associateInstanceRegion, that.associateInstanceRegion)
            && Objects.equals(this.associateInstanceInstanceType, that.associateInstanceInstanceType)
            && Objects.equals(this.associateInstancePublicBorderGroup, that.associateInstancePublicBorderGroup)
            && Objects.equals(this.associateInstanceInstanceSite, that.associateInstanceInstanceSite)
            && Objects.equals(this.associateInstanceInstanceId, that.associateInstanceInstanceId)
            && Objects.equals(this.associateInstanceProjectId, that.associateInstanceProjectId)
            && Objects.equals(this.associateInstanceServiceId, that.associateInstanceServiceId)
            && Objects.equals(this.associateInstanceServiceType, that.associateInstanceServiceType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
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
            internetBandwidthId,
            name,
            nameLike,
            accessSite,
            geipPoolName,
            isp,
            ipVersion,
            cidr,
            cidrV6,
            freezen,
            internetBandwidthIsNull,
            status,
            associateInstanceRegion,
            associateInstanceInstanceType,
            associateInstancePublicBorderGroup,
            associateInstanceInstanceSite,
            associateInstanceInstanceId,
            associateInstanceProjectId,
            associateInstanceServiceId,
            associateInstanceServiceType,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalEipSegmentsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internetBandwidthId: ").append(toIndentedString(internetBandwidthId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    geipPoolName: ").append(toIndentedString(geipPoolName)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    cidrV6: ").append(toIndentedString(cidrV6)).append("\n");
        sb.append("    freezen: ").append(toIndentedString(freezen)).append("\n");
        sb.append("    internetBandwidthIsNull: ").append(toIndentedString(internetBandwidthIsNull)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    associateInstanceRegion: ").append(toIndentedString(associateInstanceRegion)).append("\n");
        sb.append("    associateInstanceInstanceType: ")
            .append(toIndentedString(associateInstanceInstanceType))
            .append("\n");
        sb.append("    associateInstancePublicBorderGroup: ")
            .append(toIndentedString(associateInstancePublicBorderGroup))
            .append("\n");
        sb.append("    associateInstanceInstanceSite: ")
            .append(toIndentedString(associateInstanceInstanceSite))
            .append("\n");
        sb.append("    associateInstanceInstanceId: ")
            .append(toIndentedString(associateInstanceInstanceId))
            .append("\n");
        sb.append("    associateInstanceProjectId: ").append(toIndentedString(associateInstanceProjectId)).append("\n");
        sb.append("    associateInstanceServiceId: ").append(toIndentedString(associateInstanceServiceId)).append("\n");
        sb.append("    associateInstanceServiceType: ")
            .append(toIndentedString(associateInstanceServiceType))
            .append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
