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
public class ListGlobalEipsRequest {

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
         * Enum IP_ADDRESS for value: "ip_address"
         */
        public static final FieldsEnum IP_ADDRESS = new FieldsEnum("ip_address");

        /**
         * Enum IPV6_ADDRESS for value: "ipv6_address"
         */
        public static final FieldsEnum IPV6_ADDRESS = new FieldsEnum("ipv6_address");

        /**
         * Enum FREEZEN for value: "freezen"
         */
        public static final FieldsEnum FREEZEN = new FieldsEnum("freezen");

        /**
         * Enum FREEZEN_INFO for value: "freezen_info"
         */
        public static final FieldsEnum FREEZEN_INFO = new FieldsEnum("freezen_info");

        /**
         * Enum POLLUTED for value: "polluted"
         */
        public static final FieldsEnum POLLUTED = new FieldsEnum("polluted");

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
         * Enum INTERNET_BANDWIDTH_INFO for value: "internet_bandwidth_info"
         */
        public static final FieldsEnum INTERNET_BANDWIDTH_INFO = new FieldsEnum("internet_bandwidth_info");

        /**
         * Enum GLOBAL_CONNECTION_BANDWIDTH_INFO for value: "global_connection_bandwidth_info"
         */
        public static final FieldsEnum GLOBAL_CONNECTION_BANDWIDTH_INFO =
            new FieldsEnum("global_connection_bandwidth_info");

        /**
         * Enum ASSOCIATE_INSTANCE_INFO for value: "associate_instance_info"
         */
        public static final FieldsEnum ASSOCIATE_INSTANCE_INFO = new FieldsEnum("associate_instance_info");

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
            map.put("ip_address", IP_ADDRESS);
            map.put("ipv6_address", IPV6_ADDRESS);
            map.put("freezen", FREEZEN);
            map.put("freezen_info", FREEZEN_INFO);
            map.put("polluted", POLLUTED);
            map.put("status", STATUS);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            map.put("internet_bandwidth_info", INTERNET_BANDWIDTH_INFO);
            map.put("global_connection_bandwidth_info", GLOBAL_CONNECTION_BANDWIDTH_INFO);
            map.put("associate_instance_info", ASSOCIATE_INSTANCE_INFO);
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
         * Enum IP_ADDRESS for value: "ip_address"
         */
        public static final SortKeyEnum IP_ADDRESS = new SortKeyEnum("ip_address");

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
            map.put("ip_address", IP_ADDRESS);
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
    @JsonProperty(value = "ip_address")

    private List<String> ipAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_address")

    private List<String> ipv6Address = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezen")

    private List<Boolean> freezen = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polluted")

    private List<Boolean> polluted = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth_is_null")

    private List<Boolean> internetBandwidthIsNull = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcb_bandwidth_is_null")

    private List<Boolean> gcbBandwidthIsNull = null;

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

        /**
         * Enum PENDING_CREATE for value: "pending_create"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("pending_create");

        /**
         * Enum PENDING_UPDATE for value: "pending_update"
         */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("pending_update");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("idle", IDLE);
            map.put("inuse", INUSE);
            map.put("pending_create", PENDING_CREATE);
            map.put("pending_update", PENDING_UPDATE);
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
    @JsonProperty(value = "associate_instance_info.region")

    private List<String> associateInstanceInfoRegion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.instance_type")

    private List<String> associateInstanceInfoInstanceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.public_border_group")

    private List<String> associateInstanceInfoPublicBorderGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.instance_site")

    private List<String> associateInstanceInfoInstanceSite = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.instance_id")

    private List<String> associateInstanceInfoInstanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.project_id")

    private List<String> associateInstanceInfoProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.service_id")

    private List<String> associateInstanceInfoServiceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.service_type")

    private List<String> associateInstanceInfoServiceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public ListGlobalEipsRequest withLimit(Integer limit) {
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

    public ListGlobalEipsRequest withOffset(Integer offset) {
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

    public ListGlobalEipsRequest withMarker(String marker) {
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

    public ListGlobalEipsRequest withPageReverse(Boolean pageReverse) {
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

    public ListGlobalEipsRequest withFields(List<FieldsEnum> fields) {
        this.fields = fields;
        return this;
    }

    public ListGlobalEipsRequest addFieldsItem(FieldsEnum fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListGlobalEipsRequest withFields(Consumer<List<FieldsEnum>> fieldsSetter) {
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

    public ListGlobalEipsRequest withSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListGlobalEipsRequest addSortKeyItem(SortKeyEnum sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListGlobalEipsRequest withSortKey(Consumer<List<SortKeyEnum>> sortKeySetter) {
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

    public ListGlobalEipsRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListGlobalEipsRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListGlobalEipsRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
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

    public ListGlobalEipsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListGlobalEipsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListGlobalEipsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据ID过滤
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListGlobalEipsRequest withInternetBandwidthId(List<String> internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }

    public ListGlobalEipsRequest addInternetBandwidthIdItem(String internetBandwidthIdItem) {
        if (this.internetBandwidthId == null) {
            this.internetBandwidthId = new ArrayList<>();
        }
        this.internetBandwidthId.add(internetBandwidthIdItem);
        return this;
    }

    public ListGlobalEipsRequest withInternetBandwidthId(Consumer<List<String>> internetBandwidthIdSetter) {
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

    public ListGlobalEipsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListGlobalEipsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListGlobalEipsRequest withName(Consumer<List<String>> nameSetter) {
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

    public ListGlobalEipsRequest withNameLike(String nameLike) {
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

    public ListGlobalEipsRequest withAccessSite(List<String> accessSite) {
        this.accessSite = accessSite;
        return this;
    }

    public ListGlobalEipsRequest addAccessSiteItem(String accessSiteItem) {
        if (this.accessSite == null) {
            this.accessSite = new ArrayList<>();
        }
        this.accessSite.add(accessSiteItem);
        return this;
    }

    public ListGlobalEipsRequest withAccessSite(Consumer<List<String>> accessSiteSetter) {
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

    public ListGlobalEipsRequest withGeipPoolName(List<String> geipPoolName) {
        this.geipPoolName = geipPoolName;
        return this;
    }

    public ListGlobalEipsRequest addGeipPoolNameItem(String geipPoolNameItem) {
        if (this.geipPoolName == null) {
            this.geipPoolName = new ArrayList<>();
        }
        this.geipPoolName.add(geipPoolNameItem);
        return this;
    }

    public ListGlobalEipsRequest withGeipPoolName(Consumer<List<String>> geipPoolNameSetter) {
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

    public ListGlobalEipsRequest withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    public ListGlobalEipsRequest addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public ListGlobalEipsRequest withIsp(Consumer<List<String>> ispSetter) {
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

    public ListGlobalEipsRequest withIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public ListGlobalEipsRequest addIpVersionItem(IpVersionEnum ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListGlobalEipsRequest withIpVersion(Consumer<List<IpVersionEnum>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /**
     * 根据IP版本过滤
     * @return ipVersion
     */
    public List<IpVersionEnum> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListGlobalEipsRequest withIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public ListGlobalEipsRequest addIpAddressItem(String ipAddressItem) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        this.ipAddress.add(ipAddressItem);
        return this;
    }

    public ListGlobalEipsRequest withIpAddress(Consumer<List<String>> ipAddressSetter) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        ipAddressSetter.accept(this.ipAddress);
        return this;
    }

    /**
     * 根据ip地址过滤
     * @return ipAddress
     */
    public List<String> getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ListGlobalEipsRequest withIpv6Address(List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    public ListGlobalEipsRequest addIpv6AddressItem(String ipv6AddressItem) {
        if (this.ipv6Address == null) {
            this.ipv6Address = new ArrayList<>();
        }
        this.ipv6Address.add(ipv6AddressItem);
        return this;
    }

    public ListGlobalEipsRequest withIpv6Address(Consumer<List<String>> ipv6AddressSetter) {
        if (this.ipv6Address == null) {
            this.ipv6Address = new ArrayList<>();
        }
        ipv6AddressSetter.accept(this.ipv6Address);
        return this;
    }

    /**
     * 根据ipv6地址过滤
     * @return ipv6Address
     */
    public List<String> getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public ListGlobalEipsRequest withFreezen(List<Boolean> freezen) {
        this.freezen = freezen;
        return this;
    }

    public ListGlobalEipsRequest addFreezenItem(Boolean freezenItem) {
        if (this.freezen == null) {
            this.freezen = new ArrayList<>();
        }
        this.freezen.add(freezenItem);
        return this;
    }

    public ListGlobalEipsRequest withFreezen(Consumer<List<Boolean>> freezenSetter) {
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

    public ListGlobalEipsRequest withPolluted(List<Boolean> polluted) {
        this.polluted = polluted;
        return this;
    }

    public ListGlobalEipsRequest addPollutedItem(Boolean pollutedItem) {
        if (this.polluted == null) {
            this.polluted = new ArrayList<>();
        }
        this.polluted.add(pollutedItem);
        return this;
    }

    public ListGlobalEipsRequest withPolluted(Consumer<List<Boolean>> pollutedSetter) {
        if (this.polluted == null) {
            this.polluted = new ArrayList<>();
        }
        pollutedSetter.accept(this.polluted);
        return this;
    }

    /**
     * 根据是否污染过滤
     * @return polluted
     */
    public List<Boolean> getPolluted() {
        return polluted;
    }

    public void setPolluted(List<Boolean> polluted) {
        this.polluted = polluted;
    }

    public ListGlobalEipsRequest withInternetBandwidthIsNull(List<Boolean> internetBandwidthIsNull) {
        this.internetBandwidthIsNull = internetBandwidthIsNull;
        return this;
    }

    public ListGlobalEipsRequest addInternetBandwidthIsNullItem(Boolean internetBandwidthIsNullItem) {
        if (this.internetBandwidthIsNull == null) {
            this.internetBandwidthIsNull = new ArrayList<>();
        }
        this.internetBandwidthIsNull.add(internetBandwidthIsNullItem);
        return this;
    }

    public ListGlobalEipsRequest withInternetBandwidthIsNull(Consumer<List<Boolean>> internetBandwidthIsNullSetter) {
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

    public ListGlobalEipsRequest withGcbBandwidthIsNull(List<Boolean> gcbBandwidthIsNull) {
        this.gcbBandwidthIsNull = gcbBandwidthIsNull;
        return this;
    }

    public ListGlobalEipsRequest addGcbBandwidthIsNullItem(Boolean gcbBandwidthIsNullItem) {
        if (this.gcbBandwidthIsNull == null) {
            this.gcbBandwidthIsNull = new ArrayList<>();
        }
        this.gcbBandwidthIsNull.add(gcbBandwidthIsNullItem);
        return this;
    }

    public ListGlobalEipsRequest withGcbBandwidthIsNull(Consumer<List<Boolean>> gcbBandwidthIsNullSetter) {
        if (this.gcbBandwidthIsNull == null) {
            this.gcbBandwidthIsNull = new ArrayList<>();
        }
        gcbBandwidthIsNullSetter.accept(this.gcbBandwidthIsNull);
        return this;
    }

    /**
     * 根据是否绑定骨干带宽过滤
     * @return gcbBandwidthIsNull
     */
    public List<Boolean> getGcbBandwidthIsNull() {
        return gcbBandwidthIsNull;
    }

    public void setGcbBandwidthIsNull(List<Boolean> gcbBandwidthIsNull) {
        this.gcbBandwidthIsNull = gcbBandwidthIsNull;
    }

    public ListGlobalEipsRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public ListGlobalEipsRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListGlobalEipsRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 根据资源状态过滤
     * @return status
     */
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoRegion(List<String> associateInstanceInfoRegion) {
        this.associateInstanceInfoRegion = associateInstanceInfoRegion;
        return this;
    }

    public ListGlobalEipsRequest addAssociateInstanceInfoRegionItem(String associateInstanceInfoRegionItem) {
        if (this.associateInstanceInfoRegion == null) {
            this.associateInstanceInfoRegion = new ArrayList<>();
        }
        this.associateInstanceInfoRegion.add(associateInstanceInfoRegionItem);
        return this;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoRegion(
        Consumer<List<String>> associateInstanceInfoRegionSetter) {
        if (this.associateInstanceInfoRegion == null) {
            this.associateInstanceInfoRegion = new ArrayList<>();
        }
        associateInstanceInfoRegionSetter.accept(this.associateInstanceInfoRegion);
        return this;
    }

    /**
     * 根据绑定实例所属的局点过滤
     * @return associateInstanceInfoRegion
     */
    public List<String> getAssociateInstanceInfoRegion() {
        return associateInstanceInfoRegion;
    }

    public void setAssociateInstanceInfoRegion(List<String> associateInstanceInfoRegion) {
        this.associateInstanceInfoRegion = associateInstanceInfoRegion;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoInstanceType(List<String> associateInstanceInfoInstanceType) {
        this.associateInstanceInfoInstanceType = associateInstanceInfoInstanceType;
        return this;
    }

    public ListGlobalEipsRequest addAssociateInstanceInfoInstanceTypeItem(
        String associateInstanceInfoInstanceTypeItem) {
        if (this.associateInstanceInfoInstanceType == null) {
            this.associateInstanceInfoInstanceType = new ArrayList<>();
        }
        this.associateInstanceInfoInstanceType.add(associateInstanceInfoInstanceTypeItem);
        return this;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoInstanceType(
        Consumer<List<String>> associateInstanceInfoInstanceTypeSetter) {
        if (this.associateInstanceInfoInstanceType == null) {
            this.associateInstanceInfoInstanceType = new ArrayList<>();
        }
        associateInstanceInfoInstanceTypeSetter.accept(this.associateInstanceInfoInstanceType);
        return this;
    }

    /**
     * 根据绑定实例的类型过滤
     * @return associateInstanceInfoInstanceType
     */
    public List<String> getAssociateInstanceInfoInstanceType() {
        return associateInstanceInfoInstanceType;
    }

    public void setAssociateInstanceInfoInstanceType(List<String> associateInstanceInfoInstanceType) {
        this.associateInstanceInfoInstanceType = associateInstanceInfoInstanceType;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoPublicBorderGroup(
        List<String> associateInstanceInfoPublicBorderGroup) {
        this.associateInstanceInfoPublicBorderGroup = associateInstanceInfoPublicBorderGroup;
        return this;
    }

    public ListGlobalEipsRequest addAssociateInstanceInfoPublicBorderGroupItem(
        String associateInstanceInfoPublicBorderGroupItem) {
        if (this.associateInstanceInfoPublicBorderGroup == null) {
            this.associateInstanceInfoPublicBorderGroup = new ArrayList<>();
        }
        this.associateInstanceInfoPublicBorderGroup.add(associateInstanceInfoPublicBorderGroupItem);
        return this;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoPublicBorderGroup(
        Consumer<List<String>> associateInstanceInfoPublicBorderGroupSetter) {
        if (this.associateInstanceInfoPublicBorderGroup == null) {
            this.associateInstanceInfoPublicBorderGroup = new ArrayList<>();
        }
        associateInstanceInfoPublicBorderGroupSetter.accept(this.associateInstanceInfoPublicBorderGroup);
        return this;
    }

    /**
     * 根据绑定实例所属的边缘信息过滤
     * @return associateInstanceInfoPublicBorderGroup
     */
    public List<String> getAssociateInstanceInfoPublicBorderGroup() {
        return associateInstanceInfoPublicBorderGroup;
    }

    public void setAssociateInstanceInfoPublicBorderGroup(List<String> associateInstanceInfoPublicBorderGroup) {
        this.associateInstanceInfoPublicBorderGroup = associateInstanceInfoPublicBorderGroup;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoInstanceSite(List<String> associateInstanceInfoInstanceSite) {
        this.associateInstanceInfoInstanceSite = associateInstanceInfoInstanceSite;
        return this;
    }

    public ListGlobalEipsRequest addAssociateInstanceInfoInstanceSiteItem(
        String associateInstanceInfoInstanceSiteItem) {
        if (this.associateInstanceInfoInstanceSite == null) {
            this.associateInstanceInfoInstanceSite = new ArrayList<>();
        }
        this.associateInstanceInfoInstanceSite.add(associateInstanceInfoInstanceSiteItem);
        return this;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoInstanceSite(
        Consumer<List<String>> associateInstanceInfoInstanceSiteSetter) {
        if (this.associateInstanceInfoInstanceSite == null) {
            this.associateInstanceInfoInstanceSite = new ArrayList<>();
        }
        associateInstanceInfoInstanceSiteSetter.accept(this.associateInstanceInfoInstanceSite);
        return this;
    }

    /**
     * 根据绑定实例所在的站点过滤
     * @return associateInstanceInfoInstanceSite
     */
    public List<String> getAssociateInstanceInfoInstanceSite() {
        return associateInstanceInfoInstanceSite;
    }

    public void setAssociateInstanceInfoInstanceSite(List<String> associateInstanceInfoInstanceSite) {
        this.associateInstanceInfoInstanceSite = associateInstanceInfoInstanceSite;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoInstanceId(List<String> associateInstanceInfoInstanceId) {
        this.associateInstanceInfoInstanceId = associateInstanceInfoInstanceId;
        return this;
    }

    public ListGlobalEipsRequest addAssociateInstanceInfoInstanceIdItem(String associateInstanceInfoInstanceIdItem) {
        if (this.associateInstanceInfoInstanceId == null) {
            this.associateInstanceInfoInstanceId = new ArrayList<>();
        }
        this.associateInstanceInfoInstanceId.add(associateInstanceInfoInstanceIdItem);
        return this;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoInstanceId(
        Consumer<List<String>> associateInstanceInfoInstanceIdSetter) {
        if (this.associateInstanceInfoInstanceId == null) {
            this.associateInstanceInfoInstanceId = new ArrayList<>();
        }
        associateInstanceInfoInstanceIdSetter.accept(this.associateInstanceInfoInstanceId);
        return this;
    }

    /**
     * 根据绑定实例的ID过滤
     * @return associateInstanceInfoInstanceId
     */
    public List<String> getAssociateInstanceInfoInstanceId() {
        return associateInstanceInfoInstanceId;
    }

    public void setAssociateInstanceInfoInstanceId(List<String> associateInstanceInfoInstanceId) {
        this.associateInstanceInfoInstanceId = associateInstanceInfoInstanceId;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoProjectId(List<String> associateInstanceInfoProjectId) {
        this.associateInstanceInfoProjectId = associateInstanceInfoProjectId;
        return this;
    }

    public ListGlobalEipsRequest addAssociateInstanceInfoProjectIdItem(String associateInstanceInfoProjectIdItem) {
        if (this.associateInstanceInfoProjectId == null) {
            this.associateInstanceInfoProjectId = new ArrayList<>();
        }
        this.associateInstanceInfoProjectId.add(associateInstanceInfoProjectIdItem);
        return this;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoProjectId(
        Consumer<List<String>> associateInstanceInfoProjectIdSetter) {
        if (this.associateInstanceInfoProjectId == null) {
            this.associateInstanceInfoProjectId = new ArrayList<>();
        }
        associateInstanceInfoProjectIdSetter.accept(this.associateInstanceInfoProjectId);
        return this;
    }

    /**
     * 根据绑定实例所属的项目ID过滤
     * @return associateInstanceInfoProjectId
     */
    public List<String> getAssociateInstanceInfoProjectId() {
        return associateInstanceInfoProjectId;
    }

    public void setAssociateInstanceInfoProjectId(List<String> associateInstanceInfoProjectId) {
        this.associateInstanceInfoProjectId = associateInstanceInfoProjectId;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoServiceId(List<String> associateInstanceInfoServiceId) {
        this.associateInstanceInfoServiceId = associateInstanceInfoServiceId;
        return this;
    }

    public ListGlobalEipsRequest addAssociateInstanceInfoServiceIdItem(String associateInstanceInfoServiceIdItem) {
        if (this.associateInstanceInfoServiceId == null) {
            this.associateInstanceInfoServiceId = new ArrayList<>();
        }
        this.associateInstanceInfoServiceId.add(associateInstanceInfoServiceIdItem);
        return this;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoServiceId(
        Consumer<List<String>> associateInstanceInfoServiceIdSetter) {
        if (this.associateInstanceInfoServiceId == null) {
            this.associateInstanceInfoServiceId = new ArrayList<>();
        }
        associateInstanceInfoServiceIdSetter.accept(this.associateInstanceInfoServiceId);
        return this;
    }

    /**
     * 根据绑定实例所属的服务ID过滤
     * @return associateInstanceInfoServiceId
     */
    public List<String> getAssociateInstanceInfoServiceId() {
        return associateInstanceInfoServiceId;
    }

    public void setAssociateInstanceInfoServiceId(List<String> associateInstanceInfoServiceId) {
        this.associateInstanceInfoServiceId = associateInstanceInfoServiceId;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoServiceType(List<String> associateInstanceInfoServiceType) {
        this.associateInstanceInfoServiceType = associateInstanceInfoServiceType;
        return this;
    }

    public ListGlobalEipsRequest addAssociateInstanceInfoServiceTypeItem(String associateInstanceInfoServiceTypeItem) {
        if (this.associateInstanceInfoServiceType == null) {
            this.associateInstanceInfoServiceType = new ArrayList<>();
        }
        this.associateInstanceInfoServiceType.add(associateInstanceInfoServiceTypeItem);
        return this;
    }

    public ListGlobalEipsRequest withAssociateInstanceInfoServiceType(
        Consumer<List<String>> associateInstanceInfoServiceTypeSetter) {
        if (this.associateInstanceInfoServiceType == null) {
            this.associateInstanceInfoServiceType = new ArrayList<>();
        }
        associateInstanceInfoServiceTypeSetter.accept(this.associateInstanceInfoServiceType);
        return this;
    }

    /**
     * 根据绑定实例的服务类型过滤
     * @return associateInstanceInfoServiceType
     */
    public List<String> getAssociateInstanceInfoServiceType() {
        return associateInstanceInfoServiceType;
    }

    public void setAssociateInstanceInfoServiceType(List<String> associateInstanceInfoServiceType) {
        this.associateInstanceInfoServiceType = associateInstanceInfoServiceType;
    }

    public ListGlobalEipsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListGlobalEipsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListGlobalEipsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
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

    public ListGlobalEipsRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ListGlobalEipsRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListGlobalEipsRequest withTags(Consumer<List<String>> tagsSetter) {
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
        ListGlobalEipsRequest that = (ListGlobalEipsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.id, that.id)
            && Objects.equals(this.internetBandwidthId, that.internetBandwidthId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameLike, that.nameLike)
            && Objects.equals(this.accessSite, that.accessSite) && Objects.equals(this.geipPoolName, that.geipPoolName)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.ipv6Address, that.ipv6Address)
            && Objects.equals(this.freezen, that.freezen) && Objects.equals(this.polluted, that.polluted)
            && Objects.equals(this.internetBandwidthIsNull, that.internetBandwidthIsNull)
            && Objects.equals(this.gcbBandwidthIsNull, that.gcbBandwidthIsNull)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.associateInstanceInfoRegion, that.associateInstanceInfoRegion)
            && Objects.equals(this.associateInstanceInfoInstanceType, that.associateInstanceInfoInstanceType)
            && Objects.equals(this.associateInstanceInfoPublicBorderGroup, that.associateInstanceInfoPublicBorderGroup)
            && Objects.equals(this.associateInstanceInfoInstanceSite, that.associateInstanceInfoInstanceSite)
            && Objects.equals(this.associateInstanceInfoInstanceId, that.associateInstanceInfoInstanceId)
            && Objects.equals(this.associateInstanceInfoProjectId, that.associateInstanceInfoProjectId)
            && Objects.equals(this.associateInstanceInfoServiceId, that.associateInstanceInfoServiceId)
            && Objects.equals(this.associateInstanceInfoServiceType, that.associateInstanceInfoServiceType)
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
            ipAddress,
            ipv6Address,
            freezen,
            polluted,
            internetBandwidthIsNull,
            gcbBandwidthIsNull,
            status,
            associateInstanceInfoRegion,
            associateInstanceInfoInstanceType,
            associateInstanceInfoPublicBorderGroup,
            associateInstanceInfoInstanceSite,
            associateInstanceInfoInstanceId,
            associateInstanceInfoProjectId,
            associateInstanceInfoServiceId,
            associateInstanceInfoServiceType,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalEipsRequest {\n");
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
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
        sb.append("    freezen: ").append(toIndentedString(freezen)).append("\n");
        sb.append("    polluted: ").append(toIndentedString(polluted)).append("\n");
        sb.append("    internetBandwidthIsNull: ").append(toIndentedString(internetBandwidthIsNull)).append("\n");
        sb.append("    gcbBandwidthIsNull: ").append(toIndentedString(gcbBandwidthIsNull)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    associateInstanceInfoRegion: ")
            .append(toIndentedString(associateInstanceInfoRegion))
            .append("\n");
        sb.append("    associateInstanceInfoInstanceType: ")
            .append(toIndentedString(associateInstanceInfoInstanceType))
            .append("\n");
        sb.append("    associateInstanceInfoPublicBorderGroup: ")
            .append(toIndentedString(associateInstanceInfoPublicBorderGroup))
            .append("\n");
        sb.append("    associateInstanceInfoInstanceSite: ")
            .append(toIndentedString(associateInstanceInfoInstanceSite))
            .append("\n");
        sb.append("    associateInstanceInfoInstanceId: ")
            .append(toIndentedString(associateInstanceInfoInstanceId))
            .append("\n");
        sb.append("    associateInstanceInfoProjectId: ")
            .append(toIndentedString(associateInstanceInfoProjectId))
            .append("\n");
        sb.append("    associateInstanceInfoServiceId: ")
            .append(toIndentedString(associateInstanceInfoServiceId))
            .append("\n");
        sb.append("    associateInstanceInfoServiceType: ")
            .append(toIndentedString(associateInstanceInfoServiceType))
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
