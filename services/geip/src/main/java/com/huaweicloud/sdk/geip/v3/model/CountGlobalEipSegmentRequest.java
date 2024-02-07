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
public class CountGlobalEipSegmentRequest {

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
         * Enum COUNT for value: "count"
         */
        public static final FieldsEnum COUNT = new FieldsEnum("count");

        private static final Map<String, FieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldsEnum> createStaticFields() {
            Map<String, FieldsEnum> map = new HashMap<>();
            map.put("count", COUNT);
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
    @JsonProperty(value = "associate_instance.region")

    private List<String> associateInstanceRegion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.public_border_group")

    private List<String> associateInstancePublicBorderGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.instance_site")

    private List<String> associateInstanceInstanceSite = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.instance_type")

    private List<String> associateInstanceInstanceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.instance_id")

    private List<String> associateInstanceInstanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance.project_id")

    private List<String> associateInstanceProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public CountGlobalEipSegmentRequest withLimit(Integer limit) {
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

    public CountGlobalEipSegmentRequest withOffset(Integer offset) {
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

    public CountGlobalEipSegmentRequest withMarker(String marker) {
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

    public CountGlobalEipSegmentRequest withPageReverse(Boolean pageReverse) {
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

    public CountGlobalEipSegmentRequest withFields(List<FieldsEnum> fields) {
        this.fields = fields;
        return this;
    }

    public CountGlobalEipSegmentRequest addFieldsItem(FieldsEnum fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withFields(Consumer<List<FieldsEnum>> fieldsSetter) {
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

    public CountGlobalEipSegmentRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public CountGlobalEipSegmentRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withId(Consumer<List<String>> idSetter) {
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

    public CountGlobalEipSegmentRequest withInternetBandwidthId(List<String> internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }

    public CountGlobalEipSegmentRequest addInternetBandwidthIdItem(String internetBandwidthIdItem) {
        if (this.internetBandwidthId == null) {
            this.internetBandwidthId = new ArrayList<>();
        }
        this.internetBandwidthId.add(internetBandwidthIdItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withInternetBandwidthId(Consumer<List<String>> internetBandwidthIdSetter) {
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

    public CountGlobalEipSegmentRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public CountGlobalEipSegmentRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withName(Consumer<List<String>> nameSetter) {
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

    public CountGlobalEipSegmentRequest withNameLike(String nameLike) {
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

    public CountGlobalEipSegmentRequest withAccessSite(List<String> accessSite) {
        this.accessSite = accessSite;
        return this;
    }

    public CountGlobalEipSegmentRequest addAccessSiteItem(String accessSiteItem) {
        if (this.accessSite == null) {
            this.accessSite = new ArrayList<>();
        }
        this.accessSite.add(accessSiteItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withAccessSite(Consumer<List<String>> accessSiteSetter) {
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

    public CountGlobalEipSegmentRequest withGeipPoolName(List<String> geipPoolName) {
        this.geipPoolName = geipPoolName;
        return this;
    }

    public CountGlobalEipSegmentRequest addGeipPoolNameItem(String geipPoolNameItem) {
        if (this.geipPoolName == null) {
            this.geipPoolName = new ArrayList<>();
        }
        this.geipPoolName.add(geipPoolNameItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withGeipPoolName(Consumer<List<String>> geipPoolNameSetter) {
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

    public CountGlobalEipSegmentRequest withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    public CountGlobalEipSegmentRequest addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withIsp(Consumer<List<String>> ispSetter) {
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

    public CountGlobalEipSegmentRequest withIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public CountGlobalEipSegmentRequest addIpVersionItem(IpVersionEnum ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withIpVersion(Consumer<List<IpVersionEnum>> ipVersionSetter) {
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

    public CountGlobalEipSegmentRequest withCidr(List<String> cidr) {
        this.cidr = cidr;
        return this;
    }

    public CountGlobalEipSegmentRequest addCidrItem(String cidrItem) {
        if (this.cidr == null) {
            this.cidr = new ArrayList<>();
        }
        this.cidr.add(cidrItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withCidr(Consumer<List<String>> cidrSetter) {
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

    public CountGlobalEipSegmentRequest withCidrV6(List<String> cidrV6) {
        this.cidrV6 = cidrV6;
        return this;
    }

    public CountGlobalEipSegmentRequest addCidrV6Item(String cidrV6Item) {
        if (this.cidrV6 == null) {
            this.cidrV6 = new ArrayList<>();
        }
        this.cidrV6.add(cidrV6Item);
        return this;
    }

    public CountGlobalEipSegmentRequest withCidrV6(Consumer<List<String>> cidrV6Setter) {
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

    public CountGlobalEipSegmentRequest withFreezen(List<Boolean> freezen) {
        this.freezen = freezen;
        return this;
    }

    public CountGlobalEipSegmentRequest addFreezenItem(Boolean freezenItem) {
        if (this.freezen == null) {
            this.freezen = new ArrayList<>();
        }
        this.freezen.add(freezenItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withFreezen(Consumer<List<Boolean>> freezenSetter) {
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

    public CountGlobalEipSegmentRequest withInternetBandwidthIsNull(List<Boolean> internetBandwidthIsNull) {
        this.internetBandwidthIsNull = internetBandwidthIsNull;
        return this;
    }

    public CountGlobalEipSegmentRequest addInternetBandwidthIsNullItem(Boolean internetBandwidthIsNullItem) {
        if (this.internetBandwidthIsNull == null) {
            this.internetBandwidthIsNull = new ArrayList<>();
        }
        this.internetBandwidthIsNull.add(internetBandwidthIsNullItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withInternetBandwidthIsNull(
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

    public CountGlobalEipSegmentRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public CountGlobalEipSegmentRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
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

    public CountGlobalEipSegmentRequest withAssociateInstanceRegion(List<String> associateInstanceRegion) {
        this.associateInstanceRegion = associateInstanceRegion;
        return this;
    }

    public CountGlobalEipSegmentRequest addAssociateInstanceRegionItem(String associateInstanceRegionItem) {
        if (this.associateInstanceRegion == null) {
            this.associateInstanceRegion = new ArrayList<>();
        }
        this.associateInstanceRegion.add(associateInstanceRegionItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withAssociateInstanceRegion(
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

    public CountGlobalEipSegmentRequest withAssociateInstancePublicBorderGroup(
        List<String> associateInstancePublicBorderGroup) {
        this.associateInstancePublicBorderGroup = associateInstancePublicBorderGroup;
        return this;
    }

    public CountGlobalEipSegmentRequest addAssociateInstancePublicBorderGroupItem(
        String associateInstancePublicBorderGroupItem) {
        if (this.associateInstancePublicBorderGroup == null) {
            this.associateInstancePublicBorderGroup = new ArrayList<>();
        }
        this.associateInstancePublicBorderGroup.add(associateInstancePublicBorderGroupItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withAssociateInstancePublicBorderGroup(
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

    public CountGlobalEipSegmentRequest withAssociateInstanceInstanceSite(List<String> associateInstanceInstanceSite) {
        this.associateInstanceInstanceSite = associateInstanceInstanceSite;
        return this;
    }

    public CountGlobalEipSegmentRequest addAssociateInstanceInstanceSiteItem(String associateInstanceInstanceSiteItem) {
        if (this.associateInstanceInstanceSite == null) {
            this.associateInstanceInstanceSite = new ArrayList<>();
        }
        this.associateInstanceInstanceSite.add(associateInstanceInstanceSiteItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withAssociateInstanceInstanceSite(
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

    public CountGlobalEipSegmentRequest withAssociateInstanceInstanceType(List<String> associateInstanceInstanceType) {
        this.associateInstanceInstanceType = associateInstanceInstanceType;
        return this;
    }

    public CountGlobalEipSegmentRequest addAssociateInstanceInstanceTypeItem(String associateInstanceInstanceTypeItem) {
        if (this.associateInstanceInstanceType == null) {
            this.associateInstanceInstanceType = new ArrayList<>();
        }
        this.associateInstanceInstanceType.add(associateInstanceInstanceTypeItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withAssociateInstanceInstanceType(
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

    public CountGlobalEipSegmentRequest withAssociateInstanceInstanceId(List<String> associateInstanceInstanceId) {
        this.associateInstanceInstanceId = associateInstanceInstanceId;
        return this;
    }

    public CountGlobalEipSegmentRequest addAssociateInstanceInstanceIdItem(String associateInstanceInstanceIdItem) {
        if (this.associateInstanceInstanceId == null) {
            this.associateInstanceInstanceId = new ArrayList<>();
        }
        this.associateInstanceInstanceId.add(associateInstanceInstanceIdItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withAssociateInstanceInstanceId(
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

    public CountGlobalEipSegmentRequest withAssociateInstanceProjectId(List<String> associateInstanceProjectId) {
        this.associateInstanceProjectId = associateInstanceProjectId;
        return this;
    }

    public CountGlobalEipSegmentRequest addAssociateInstanceProjectIdItem(String associateInstanceProjectIdItem) {
        if (this.associateInstanceProjectId == null) {
            this.associateInstanceProjectId = new ArrayList<>();
        }
        this.associateInstanceProjectId.add(associateInstanceProjectIdItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withAssociateInstanceProjectId(
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

    public CountGlobalEipSegmentRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public CountGlobalEipSegmentRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
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

    public CountGlobalEipSegmentRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CountGlobalEipSegmentRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CountGlobalEipSegmentRequest withTags(Consumer<List<String>> tagsSetter) {
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
        CountGlobalEipSegmentRequest that = (CountGlobalEipSegmentRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.id, that.id)
            && Objects.equals(this.internetBandwidthId, that.internetBandwidthId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameLike, that.nameLike)
            && Objects.equals(this.accessSite, that.accessSite) && Objects.equals(this.geipPoolName, that.geipPoolName)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.cidr, that.cidr) && Objects.equals(this.cidrV6, that.cidrV6)
            && Objects.equals(this.freezen, that.freezen)
            && Objects.equals(this.internetBandwidthIsNull, that.internetBandwidthIsNull)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.associateInstanceRegion, that.associateInstanceRegion)
            && Objects.equals(this.associateInstancePublicBorderGroup, that.associateInstancePublicBorderGroup)
            && Objects.equals(this.associateInstanceInstanceSite, that.associateInstanceInstanceSite)
            && Objects.equals(this.associateInstanceInstanceType, that.associateInstanceInstanceType)
            && Objects.equals(this.associateInstanceInstanceId, that.associateInstanceInstanceId)
            && Objects.equals(this.associateInstanceProjectId, that.associateInstanceProjectId)
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
            associateInstancePublicBorderGroup,
            associateInstanceInstanceSite,
            associateInstanceInstanceType,
            associateInstanceInstanceId,
            associateInstanceProjectId,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountGlobalEipSegmentRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
        sb.append("    associateInstancePublicBorderGroup: ")
            .append(toIndentedString(associateInstancePublicBorderGroup))
            .append("\n");
        sb.append("    associateInstanceInstanceSite: ")
            .append(toIndentedString(associateInstanceInstanceSite))
            .append("\n");
        sb.append("    associateInstanceInstanceType: ")
            .append(toIndentedString(associateInstanceInstanceType))
            .append("\n");
        sb.append("    associateInstanceInstanceId: ")
            .append(toIndentedString(associateInstanceInstanceId))
            .append("\n");
        sb.append("    associateInstanceProjectId: ").append(toIndentedString(associateInstanceProjectId)).append("\n");
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
