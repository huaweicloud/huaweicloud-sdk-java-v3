package com.huaweicloud.sdk.geip.v3.model;

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
 * DetachInternetBandwidthGlobalEips
 */
public class DetachInternetBandwidthGlobalEips {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_site")

    private String accessSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geip_pool_name")

    private String geipPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_address")

    private String ipv6Address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezen")

    private Boolean freezen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezen_info")

    private String freezenInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polluted")

    private Boolean polluted;

    /**
     * 状态
     */
    public static final class StatusEnum {

        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");

        /**
         * Enum IDLE for value: "IDLE"
         */
        public static final StatusEnum IDLE = new StatusEnum("IDLE");

        /**
         * Enum INUSE for value: "INUSE"
         */
        public static final StatusEnum INUSE = new StatusEnum("INUSE");

        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("PENDING_UPDATE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("IDLE", IDLE);
            map.put("INUSE", INUSE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
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

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth_info")

    private InternetBandwidthInfo internetBandwidthInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_connection_bandwidth_info")

    private GlobalConnectionBandwidthInfo globalConnectionBandwidthInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info")

    private InstanceInfo associateInstanceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_pre_paid")

    private Boolean isPrePaid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<Tag> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public DetachInternetBandwidthGlobalEips withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DetachInternetBandwidthGlobalEips withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DetachInternetBandwidthGlobalEips withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DetachInternetBandwidthGlobalEips withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户自定义的资源描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DetachInternetBandwidthGlobalEips withAccessSite(String accessSite) {
        this.accessSite = accessSite;
        return this;
    }

    /**
     * 接入点信息
     * @return accessSite
     */
    public String getAccessSite() {
        return accessSite;
    }

    public void setAccessSite(String accessSite) {
        this.accessSite = accessSite;
    }

    public DetachInternetBandwidthGlobalEips withGeipPoolName(String geipPoolName) {
        this.geipPoolName = geipPoolName;
        return this;
    }

    /**
     * 全域弹性公网IP池子名称
     * @return geipPoolName
     */
    public String getGeipPoolName() {
        return geipPoolName;
    }

    public void setGeipPoolName(String geipPoolName) {
        this.geipPoolName = geipPoolName;
    }

    public DetachInternetBandwidthGlobalEips withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 线路
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public DetachInternetBandwidthGlobalEips withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * IPv4或IPv6
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public DetachInternetBandwidthGlobalEips withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IPv4地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public DetachInternetBandwidthGlobalEips withIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    /**
     * IPv6地址
     * @return ipv6Address
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public DetachInternetBandwidthGlobalEips withFreezen(Boolean freezen) {
        this.freezen = freezen;
        return this;
    }

    /**
     * 是否冻结
     * @return freezen
     */
    public Boolean getFreezen() {
        return freezen;
    }

    public void setFreezen(Boolean freezen) {
        this.freezen = freezen;
    }

    public DetachInternetBandwidthGlobalEips withFreezenInfo(String freezenInfo) {
        this.freezenInfo = freezenInfo;
        return this;
    }

    /**
     * 冻结原因
     * @return freezenInfo
     */
    public String getFreezenInfo() {
        return freezenInfo;
    }

    public void setFreezenInfo(String freezenInfo) {
        this.freezenInfo = freezenInfo;
    }

    public DetachInternetBandwidthGlobalEips withPolluted(Boolean polluted) {
        this.polluted = polluted;
        return this;
    }

    /**
     * 是否污染
     * @return polluted
     */
    public Boolean getPolluted() {
        return polluted;
    }

    public void setPolluted(Boolean polluted) {
        this.polluted = polluted;
    }

    public DetachInternetBandwidthGlobalEips withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DetachInternetBandwidthGlobalEips withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DetachInternetBandwidthGlobalEips withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DetachInternetBandwidthGlobalEips withInternetBandwidthInfo(InternetBandwidthInfo internetBandwidthInfo) {
        this.internetBandwidthInfo = internetBandwidthInfo;
        return this;
    }

    public DetachInternetBandwidthGlobalEips withInternetBandwidthInfo(
        Consumer<InternetBandwidthInfo> internetBandwidthInfoSetter) {
        if (this.internetBandwidthInfo == null) {
            this.internetBandwidthInfo = new InternetBandwidthInfo();
            internetBandwidthInfoSetter.accept(this.internetBandwidthInfo);
        }

        return this;
    }

    /**
     * Get internetBandwidthInfo
     * @return internetBandwidthInfo
     */
    public InternetBandwidthInfo getInternetBandwidthInfo() {
        return internetBandwidthInfo;
    }

    public void setInternetBandwidthInfo(InternetBandwidthInfo internetBandwidthInfo) {
        this.internetBandwidthInfo = internetBandwidthInfo;
    }

    public DetachInternetBandwidthGlobalEips withGlobalConnectionBandwidthInfo(
        GlobalConnectionBandwidthInfo globalConnectionBandwidthInfo) {
        this.globalConnectionBandwidthInfo = globalConnectionBandwidthInfo;
        return this;
    }

    public DetachInternetBandwidthGlobalEips withGlobalConnectionBandwidthInfo(
        Consumer<GlobalConnectionBandwidthInfo> globalConnectionBandwidthInfoSetter) {
        if (this.globalConnectionBandwidthInfo == null) {
            this.globalConnectionBandwidthInfo = new GlobalConnectionBandwidthInfo();
            globalConnectionBandwidthInfoSetter.accept(this.globalConnectionBandwidthInfo);
        }

        return this;
    }

    /**
     * Get globalConnectionBandwidthInfo
     * @return globalConnectionBandwidthInfo
     */
    public GlobalConnectionBandwidthInfo getGlobalConnectionBandwidthInfo() {
        return globalConnectionBandwidthInfo;
    }

    public void setGlobalConnectionBandwidthInfo(GlobalConnectionBandwidthInfo globalConnectionBandwidthInfo) {
        this.globalConnectionBandwidthInfo = globalConnectionBandwidthInfo;
    }

    public DetachInternetBandwidthGlobalEips withAssociateInstanceInfo(InstanceInfo associateInstanceInfo) {
        this.associateInstanceInfo = associateInstanceInfo;
        return this;
    }

    public DetachInternetBandwidthGlobalEips withAssociateInstanceInfo(
        Consumer<InstanceInfo> associateInstanceInfoSetter) {
        if (this.associateInstanceInfo == null) {
            this.associateInstanceInfo = new InstanceInfo();
            associateInstanceInfoSetter.accept(this.associateInstanceInfo);
        }

        return this;
    }

    /**
     * Get associateInstanceInfo
     * @return associateInstanceInfo
     */
    public InstanceInfo getAssociateInstanceInfo() {
        return associateInstanceInfo;
    }

    public void setAssociateInstanceInfo(InstanceInfo associateInstanceInfo) {
        this.associateInstanceInfo = associateInstanceInfo;
    }

    public DetachInternetBandwidthGlobalEips withIsPrePaid(Boolean isPrePaid) {
        this.isPrePaid = isPrePaid;
        return this;
    }

    /**
     * 是否包周期
     * @return isPrePaid
     */
    public Boolean getIsPrePaid() {
        return isPrePaid;
    }

    public void setIsPrePaid(Boolean isPrePaid) {
        this.isPrePaid = isPrePaid;
    }

    public DetachInternetBandwidthGlobalEips withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public DetachInternetBandwidthGlobalEips addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public DetachInternetBandwidthGlobalEips withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 全域弹性公网IP标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DetachInternetBandwidthGlobalEips withSysTags(List<Tag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public DetachInternetBandwidthGlobalEips addSysTagsItem(Tag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public DetachInternetBandwidthGlobalEips withSysTags(Consumer<List<Tag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签
     * @return sysTags
     */
    public List<Tag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<Tag> sysTags) {
        this.sysTags = sysTags;
    }

    public DetachInternetBandwidthGlobalEips withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 资源的企业项目id
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
        DetachInternetBandwidthGlobalEips that = (DetachInternetBandwidthGlobalEips) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.accessSite, that.accessSite) && Objects.equals(this.geipPoolName, that.geipPoolName)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.ipv6Address, that.ipv6Address)
            && Objects.equals(this.freezen, that.freezen) && Objects.equals(this.freezenInfo, that.freezenInfo)
            && Objects.equals(this.polluted, that.polluted) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.internetBandwidthInfo, that.internetBandwidthInfo)
            && Objects.equals(this.globalConnectionBandwidthInfo, that.globalConnectionBandwidthInfo)
            && Objects.equals(this.associateInstanceInfo, that.associateInstanceInfo)
            && Objects.equals(this.isPrePaid, that.isPrePaid) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            domainId,
            description,
            accessSite,
            geipPoolName,
            isp,
            ipVersion,
            ipAddress,
            ipv6Address,
            freezen,
            freezenInfo,
            polluted,
            status,
            createdAt,
            updatedAt,
            internetBandwidthInfo,
            globalConnectionBandwidthInfo,
            associateInstanceInfo,
            isPrePaid,
            tags,
            sysTags,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachInternetBandwidthGlobalEips {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    geipPoolName: ").append(toIndentedString(geipPoolName)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
        sb.append("    freezen: ").append(toIndentedString(freezen)).append("\n");
        sb.append("    freezenInfo: ").append(toIndentedString(freezenInfo)).append("\n");
        sb.append("    polluted: ").append(toIndentedString(polluted)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    internetBandwidthInfo: ").append(toIndentedString(internetBandwidthInfo)).append("\n");
        sb.append("    globalConnectionBandwidthInfo: ")
            .append(toIndentedString(globalConnectionBandwidthInfo))
            .append("\n");
        sb.append("    associateInstanceInfo: ").append(toIndentedString(associateInstanceInfo)).append("\n");
        sb.append("    isPrePaid: ").append(toIndentedString(isPrePaid)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
