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
public class CountGlobalEipsRequest {

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
    @JsonProperty(value = "associate_instance_info.public_border_group")

    private List<String> associateInstanceInfoPublicBorderGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.instance_site")

    private List<String> associateInstanceInfoInstanceSite = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.instance_type")

    private List<String> associateInstanceInfoInstanceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.instance_id")

    private List<String> associateInstanceInfoInstanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info.project_id")

    private List<String> associateInstanceInfoProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public CountGlobalEipsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public CountGlobalEipsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public CountGlobalEipsRequest withId(Consumer<List<String>> idSetter) {
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

    public CountGlobalEipsRequest withInternetBandwidthId(List<String> internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }

    public CountGlobalEipsRequest addInternetBandwidthIdItem(String internetBandwidthIdItem) {
        if (this.internetBandwidthId == null) {
            this.internetBandwidthId = new ArrayList<>();
        }
        this.internetBandwidthId.add(internetBandwidthIdItem);
        return this;
    }

    public CountGlobalEipsRequest withInternetBandwidthId(Consumer<List<String>> internetBandwidthIdSetter) {
        if (this.internetBandwidthId == null) {
            this.internetBandwidthId = new ArrayList<>();
        }
        internetBandwidthIdSetter.accept(this.internetBandwidthId);
        return this;
    }

    /**
     * Get internetBandwidthId
     * @return internetBandwidthId
     */
    public List<String> getInternetBandwidthId() {
        return internetBandwidthId;
    }

    public void setInternetBandwidthId(List<String> internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
    }

    public CountGlobalEipsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public CountGlobalEipsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public CountGlobalEipsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public CountGlobalEipsRequest withNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    /**
     * Get nameLike
     * @return nameLike
     */
    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public CountGlobalEipsRequest withAccessSite(List<String> accessSite) {
        this.accessSite = accessSite;
        return this;
    }

    public CountGlobalEipsRequest addAccessSiteItem(String accessSiteItem) {
        if (this.accessSite == null) {
            this.accessSite = new ArrayList<>();
        }
        this.accessSite.add(accessSiteItem);
        return this;
    }

    public CountGlobalEipsRequest withAccessSite(Consumer<List<String>> accessSiteSetter) {
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

    public CountGlobalEipsRequest withGeipPoolName(List<String> geipPoolName) {
        this.geipPoolName = geipPoolName;
        return this;
    }

    public CountGlobalEipsRequest addGeipPoolNameItem(String geipPoolNameItem) {
        if (this.geipPoolName == null) {
            this.geipPoolName = new ArrayList<>();
        }
        this.geipPoolName.add(geipPoolNameItem);
        return this;
    }

    public CountGlobalEipsRequest withGeipPoolName(Consumer<List<String>> geipPoolNameSetter) {
        if (this.geipPoolName == null) {
            this.geipPoolName = new ArrayList<>();
        }
        geipPoolNameSetter.accept(this.geipPoolName);
        return this;
    }

    /**
     * Get geipPoolName
     * @return geipPoolName
     */
    public List<String> getGeipPoolName() {
        return geipPoolName;
    }

    public void setGeipPoolName(List<String> geipPoolName) {
        this.geipPoolName = geipPoolName;
    }

    public CountGlobalEipsRequest withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    public CountGlobalEipsRequest addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public CountGlobalEipsRequest withIsp(Consumer<List<String>> ispSetter) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        ispSetter.accept(this.isp);
        return this;
    }

    /**
     * Get isp
     * @return isp
     */
    public List<String> getIsp() {
        return isp;
    }

    public void setIsp(List<String> isp) {
        this.isp = isp;
    }

    public CountGlobalEipsRequest withIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public CountGlobalEipsRequest addIpVersionItem(IpVersionEnum ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public CountGlobalEipsRequest withIpVersion(Consumer<List<IpVersionEnum>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /**
     * Get ipVersion
     * @return ipVersion
     */
    public List<IpVersionEnum> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CountGlobalEipsRequest withIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public CountGlobalEipsRequest addIpAddressItem(String ipAddressItem) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        this.ipAddress.add(ipAddressItem);
        return this;
    }

    public CountGlobalEipsRequest withIpAddress(Consumer<List<String>> ipAddressSetter) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        ipAddressSetter.accept(this.ipAddress);
        return this;
    }

    /**
     * Get ipAddress
     * @return ipAddress
     */
    public List<String> getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
    }

    public CountGlobalEipsRequest withIpv6Address(List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    public CountGlobalEipsRequest addIpv6AddressItem(String ipv6AddressItem) {
        if (this.ipv6Address == null) {
            this.ipv6Address = new ArrayList<>();
        }
        this.ipv6Address.add(ipv6AddressItem);
        return this;
    }

    public CountGlobalEipsRequest withIpv6Address(Consumer<List<String>> ipv6AddressSetter) {
        if (this.ipv6Address == null) {
            this.ipv6Address = new ArrayList<>();
        }
        ipv6AddressSetter.accept(this.ipv6Address);
        return this;
    }

    /**
     * Get ipv6Address
     * @return ipv6Address
     */
    public List<String> getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public CountGlobalEipsRequest withFreezen(List<Boolean> freezen) {
        this.freezen = freezen;
        return this;
    }

    public CountGlobalEipsRequest addFreezenItem(Boolean freezenItem) {
        if (this.freezen == null) {
            this.freezen = new ArrayList<>();
        }
        this.freezen.add(freezenItem);
        return this;
    }

    public CountGlobalEipsRequest withFreezen(Consumer<List<Boolean>> freezenSetter) {
        if (this.freezen == null) {
            this.freezen = new ArrayList<>();
        }
        freezenSetter.accept(this.freezen);
        return this;
    }

    /**
     * Get freezen
     * @return freezen
     */
    public List<Boolean> getFreezen() {
        return freezen;
    }

    public void setFreezen(List<Boolean> freezen) {
        this.freezen = freezen;
    }

    public CountGlobalEipsRequest withPolluted(List<Boolean> polluted) {
        this.polluted = polluted;
        return this;
    }

    public CountGlobalEipsRequest addPollutedItem(Boolean pollutedItem) {
        if (this.polluted == null) {
            this.polluted = new ArrayList<>();
        }
        this.polluted.add(pollutedItem);
        return this;
    }

    public CountGlobalEipsRequest withPolluted(Consumer<List<Boolean>> pollutedSetter) {
        if (this.polluted == null) {
            this.polluted = new ArrayList<>();
        }
        pollutedSetter.accept(this.polluted);
        return this;
    }

    /**
     * Get polluted
     * @return polluted
     */
    public List<Boolean> getPolluted() {
        return polluted;
    }

    public void setPolluted(List<Boolean> polluted) {
        this.polluted = polluted;
    }

    public CountGlobalEipsRequest withInternetBandwidthIsNull(List<Boolean> internetBandwidthIsNull) {
        this.internetBandwidthIsNull = internetBandwidthIsNull;
        return this;
    }

    public CountGlobalEipsRequest addInternetBandwidthIsNullItem(Boolean internetBandwidthIsNullItem) {
        if (this.internetBandwidthIsNull == null) {
            this.internetBandwidthIsNull = new ArrayList<>();
        }
        this.internetBandwidthIsNull.add(internetBandwidthIsNullItem);
        return this;
    }

    public CountGlobalEipsRequest withInternetBandwidthIsNull(Consumer<List<Boolean>> internetBandwidthIsNullSetter) {
        if (this.internetBandwidthIsNull == null) {
            this.internetBandwidthIsNull = new ArrayList<>();
        }
        internetBandwidthIsNullSetter.accept(this.internetBandwidthIsNull);
        return this;
    }

    /**
     * Get internetBandwidthIsNull
     * @return internetBandwidthIsNull
     */
    public List<Boolean> getInternetBandwidthIsNull() {
        return internetBandwidthIsNull;
    }

    public void setInternetBandwidthIsNull(List<Boolean> internetBandwidthIsNull) {
        this.internetBandwidthIsNull = internetBandwidthIsNull;
    }

    public CountGlobalEipsRequest withGcbBandwidthIsNull(List<Boolean> gcbBandwidthIsNull) {
        this.gcbBandwidthIsNull = gcbBandwidthIsNull;
        return this;
    }

    public CountGlobalEipsRequest addGcbBandwidthIsNullItem(Boolean gcbBandwidthIsNullItem) {
        if (this.gcbBandwidthIsNull == null) {
            this.gcbBandwidthIsNull = new ArrayList<>();
        }
        this.gcbBandwidthIsNull.add(gcbBandwidthIsNullItem);
        return this;
    }

    public CountGlobalEipsRequest withGcbBandwidthIsNull(Consumer<List<Boolean>> gcbBandwidthIsNullSetter) {
        if (this.gcbBandwidthIsNull == null) {
            this.gcbBandwidthIsNull = new ArrayList<>();
        }
        gcbBandwidthIsNullSetter.accept(this.gcbBandwidthIsNull);
        return this;
    }

    /**
     * Get gcbBandwidthIsNull
     * @return gcbBandwidthIsNull
     */
    public List<Boolean> getGcbBandwidthIsNull() {
        return gcbBandwidthIsNull;
    }

    public void setGcbBandwidthIsNull(List<Boolean> gcbBandwidthIsNull) {
        this.gcbBandwidthIsNull = gcbBandwidthIsNull;
    }

    public CountGlobalEipsRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public CountGlobalEipsRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public CountGlobalEipsRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
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
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoRegion(List<String> associateInstanceInfoRegion) {
        this.associateInstanceInfoRegion = associateInstanceInfoRegion;
        return this;
    }

    public CountGlobalEipsRequest addAssociateInstanceInfoRegionItem(String associateInstanceInfoRegionItem) {
        if (this.associateInstanceInfoRegion == null) {
            this.associateInstanceInfoRegion = new ArrayList<>();
        }
        this.associateInstanceInfoRegion.add(associateInstanceInfoRegionItem);
        return this;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoRegion(
        Consumer<List<String>> associateInstanceInfoRegionSetter) {
        if (this.associateInstanceInfoRegion == null) {
            this.associateInstanceInfoRegion = new ArrayList<>();
        }
        associateInstanceInfoRegionSetter.accept(this.associateInstanceInfoRegion);
        return this;
    }

    /**
     * Get associateInstanceInfoRegion
     * @return associateInstanceInfoRegion
     */
    public List<String> getAssociateInstanceInfoRegion() {
        return associateInstanceInfoRegion;
    }

    public void setAssociateInstanceInfoRegion(List<String> associateInstanceInfoRegion) {
        this.associateInstanceInfoRegion = associateInstanceInfoRegion;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoPublicBorderGroup(
        List<String> associateInstanceInfoPublicBorderGroup) {
        this.associateInstanceInfoPublicBorderGroup = associateInstanceInfoPublicBorderGroup;
        return this;
    }

    public CountGlobalEipsRequest addAssociateInstanceInfoPublicBorderGroupItem(
        String associateInstanceInfoPublicBorderGroupItem) {
        if (this.associateInstanceInfoPublicBorderGroup == null) {
            this.associateInstanceInfoPublicBorderGroup = new ArrayList<>();
        }
        this.associateInstanceInfoPublicBorderGroup.add(associateInstanceInfoPublicBorderGroupItem);
        return this;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoPublicBorderGroup(
        Consumer<List<String>> associateInstanceInfoPublicBorderGroupSetter) {
        if (this.associateInstanceInfoPublicBorderGroup == null) {
            this.associateInstanceInfoPublicBorderGroup = new ArrayList<>();
        }
        associateInstanceInfoPublicBorderGroupSetter.accept(this.associateInstanceInfoPublicBorderGroup);
        return this;
    }

    /**
     * Get associateInstanceInfoPublicBorderGroup
     * @return associateInstanceInfoPublicBorderGroup
     */
    public List<String> getAssociateInstanceInfoPublicBorderGroup() {
        return associateInstanceInfoPublicBorderGroup;
    }

    public void setAssociateInstanceInfoPublicBorderGroup(List<String> associateInstanceInfoPublicBorderGroup) {
        this.associateInstanceInfoPublicBorderGroup = associateInstanceInfoPublicBorderGroup;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoInstanceSite(
        List<String> associateInstanceInfoInstanceSite) {
        this.associateInstanceInfoInstanceSite = associateInstanceInfoInstanceSite;
        return this;
    }

    public CountGlobalEipsRequest addAssociateInstanceInfoInstanceSiteItem(
        String associateInstanceInfoInstanceSiteItem) {
        if (this.associateInstanceInfoInstanceSite == null) {
            this.associateInstanceInfoInstanceSite = new ArrayList<>();
        }
        this.associateInstanceInfoInstanceSite.add(associateInstanceInfoInstanceSiteItem);
        return this;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoInstanceSite(
        Consumer<List<String>> associateInstanceInfoInstanceSiteSetter) {
        if (this.associateInstanceInfoInstanceSite == null) {
            this.associateInstanceInfoInstanceSite = new ArrayList<>();
        }
        associateInstanceInfoInstanceSiteSetter.accept(this.associateInstanceInfoInstanceSite);
        return this;
    }

    /**
     * Get associateInstanceInfoInstanceSite
     * @return associateInstanceInfoInstanceSite
     */
    public List<String> getAssociateInstanceInfoInstanceSite() {
        return associateInstanceInfoInstanceSite;
    }

    public void setAssociateInstanceInfoInstanceSite(List<String> associateInstanceInfoInstanceSite) {
        this.associateInstanceInfoInstanceSite = associateInstanceInfoInstanceSite;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoInstanceType(
        List<String> associateInstanceInfoInstanceType) {
        this.associateInstanceInfoInstanceType = associateInstanceInfoInstanceType;
        return this;
    }

    public CountGlobalEipsRequest addAssociateInstanceInfoInstanceTypeItem(
        String associateInstanceInfoInstanceTypeItem) {
        if (this.associateInstanceInfoInstanceType == null) {
            this.associateInstanceInfoInstanceType = new ArrayList<>();
        }
        this.associateInstanceInfoInstanceType.add(associateInstanceInfoInstanceTypeItem);
        return this;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoInstanceType(
        Consumer<List<String>> associateInstanceInfoInstanceTypeSetter) {
        if (this.associateInstanceInfoInstanceType == null) {
            this.associateInstanceInfoInstanceType = new ArrayList<>();
        }
        associateInstanceInfoInstanceTypeSetter.accept(this.associateInstanceInfoInstanceType);
        return this;
    }

    /**
     * Get associateInstanceInfoInstanceType
     * @return associateInstanceInfoInstanceType
     */
    public List<String> getAssociateInstanceInfoInstanceType() {
        return associateInstanceInfoInstanceType;
    }

    public void setAssociateInstanceInfoInstanceType(List<String> associateInstanceInfoInstanceType) {
        this.associateInstanceInfoInstanceType = associateInstanceInfoInstanceType;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoInstanceId(List<String> associateInstanceInfoInstanceId) {
        this.associateInstanceInfoInstanceId = associateInstanceInfoInstanceId;
        return this;
    }

    public CountGlobalEipsRequest addAssociateInstanceInfoInstanceIdItem(String associateInstanceInfoInstanceIdItem) {
        if (this.associateInstanceInfoInstanceId == null) {
            this.associateInstanceInfoInstanceId = new ArrayList<>();
        }
        this.associateInstanceInfoInstanceId.add(associateInstanceInfoInstanceIdItem);
        return this;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoInstanceId(
        Consumer<List<String>> associateInstanceInfoInstanceIdSetter) {
        if (this.associateInstanceInfoInstanceId == null) {
            this.associateInstanceInfoInstanceId = new ArrayList<>();
        }
        associateInstanceInfoInstanceIdSetter.accept(this.associateInstanceInfoInstanceId);
        return this;
    }

    /**
     * Get associateInstanceInfoInstanceId
     * @return associateInstanceInfoInstanceId
     */
    public List<String> getAssociateInstanceInfoInstanceId() {
        return associateInstanceInfoInstanceId;
    }

    public void setAssociateInstanceInfoInstanceId(List<String> associateInstanceInfoInstanceId) {
        this.associateInstanceInfoInstanceId = associateInstanceInfoInstanceId;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoProjectId(List<String> associateInstanceInfoProjectId) {
        this.associateInstanceInfoProjectId = associateInstanceInfoProjectId;
        return this;
    }

    public CountGlobalEipsRequest addAssociateInstanceInfoProjectIdItem(String associateInstanceInfoProjectIdItem) {
        if (this.associateInstanceInfoProjectId == null) {
            this.associateInstanceInfoProjectId = new ArrayList<>();
        }
        this.associateInstanceInfoProjectId.add(associateInstanceInfoProjectIdItem);
        return this;
    }

    public CountGlobalEipsRequest withAssociateInstanceInfoProjectId(
        Consumer<List<String>> associateInstanceInfoProjectIdSetter) {
        if (this.associateInstanceInfoProjectId == null) {
            this.associateInstanceInfoProjectId = new ArrayList<>();
        }
        associateInstanceInfoProjectIdSetter.accept(this.associateInstanceInfoProjectId);
        return this;
    }

    /**
     * Get associateInstanceInfoProjectId
     * @return associateInstanceInfoProjectId
     */
    public List<String> getAssociateInstanceInfoProjectId() {
        return associateInstanceInfoProjectId;
    }

    public void setAssociateInstanceInfoProjectId(List<String> associateInstanceInfoProjectId) {
        this.associateInstanceInfoProjectId = associateInstanceInfoProjectId;
    }

    public CountGlobalEipsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public CountGlobalEipsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public CountGlobalEipsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CountGlobalEipsRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CountGlobalEipsRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CountGlobalEipsRequest withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * Get tags
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
        CountGlobalEipsRequest that = (CountGlobalEipsRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.internetBandwidthId, that.internetBandwidthId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameLike, that.nameLike)
            && Objects.equals(this.accessSite, that.accessSite) && Objects.equals(this.geipPoolName, that.geipPoolName)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.ipv6Address, that.ipv6Address)
            && Objects.equals(this.freezen, that.freezen) && Objects.equals(this.polluted, that.polluted)
            && Objects.equals(this.internetBandwidthIsNull, that.internetBandwidthIsNull)
            && Objects.equals(this.gcbBandwidthIsNull, that.gcbBandwidthIsNull)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.associateInstanceInfoRegion, that.associateInstanceInfoRegion)
            && Objects.equals(this.associateInstanceInfoPublicBorderGroup, that.associateInstanceInfoPublicBorderGroup)
            && Objects.equals(this.associateInstanceInfoInstanceSite, that.associateInstanceInfoInstanceSite)
            && Objects.equals(this.associateInstanceInfoInstanceType, that.associateInstanceInfoInstanceType)
            && Objects.equals(this.associateInstanceInfoInstanceId, that.associateInstanceInfoInstanceId)
            && Objects.equals(this.associateInstanceInfoProjectId, that.associateInstanceInfoProjectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
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
            associateInstanceInfoPublicBorderGroup,
            associateInstanceInfoInstanceSite,
            associateInstanceInfoInstanceType,
            associateInstanceInfoInstanceId,
            associateInstanceInfoProjectId,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountGlobalEipsRequest {\n");
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
        sb.append("    associateInstanceInfoPublicBorderGroup: ")
            .append(toIndentedString(associateInstanceInfoPublicBorderGroup))
            .append("\n");
        sb.append("    associateInstanceInfoInstanceSite: ")
            .append(toIndentedString(associateInstanceInfoInstanceSite))
            .append("\n");
        sb.append("    associateInstanceInfoInstanceType: ")
            .append(toIndentedString(associateInstanceInfoInstanceType))
            .append("\n");
        sb.append("    associateInstanceInfoInstanceId: ")
            .append(toIndentedString(associateInstanceInfoInstanceId))
            .append("\n");
        sb.append("    associateInstanceInfoProjectId: ")
            .append(toIndentedString(associateInstanceInfoProjectId))
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
