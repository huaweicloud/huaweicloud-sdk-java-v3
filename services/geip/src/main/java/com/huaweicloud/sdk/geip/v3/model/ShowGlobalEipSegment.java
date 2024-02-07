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
 * ShowGlobalEipSegment
 */
public class ShowGlobalEipSegment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

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
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_v6")

    private String cidrV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezen")

    private Boolean freezen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezen_info")

    private String freezenInfo;

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
    @JsonProperty(value = "internet_bandwidth")

    private InternetBandwidthInfo internetBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance")

    private InstanceInfo associateInstance;

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

    public ShowGlobalEipSegment withId(String id) {
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

    public ShowGlobalEipSegment withName(String name) {
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

    public ShowGlobalEipSegment withDescription(String description) {
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

    public ShowGlobalEipSegment withDomainId(String domainId) {
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

    public ShowGlobalEipSegment withAccessSite(String accessSite) {
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

    public ShowGlobalEipSegment withGeipPoolName(String geipPoolName) {
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

    public ShowGlobalEipSegment withIsp(String isp) {
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

    public ShowGlobalEipSegment withIpVersion(Integer ipVersion) {
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

    public ShowGlobalEipSegment withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 全域公网IP段的cidr
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public ShowGlobalEipSegment withCidrV6(String cidrV6) {
        this.cidrV6 = cidrV6;
        return this;
    }

    /**
     * 指定cidr-v6创建
     * @return cidrV6
     */
    public String getCidrV6() {
        return cidrV6;
    }

    public void setCidrV6(String cidrV6) {
        this.cidrV6 = cidrV6;
    }

    public ShowGlobalEipSegment withFreezen(Boolean freezen) {
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

    public ShowGlobalEipSegment withFreezenInfo(String freezenInfo) {
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

    public ShowGlobalEipSegment withStatus(StatusEnum status) {
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

    public ShowGlobalEipSegment withCreatedAt(OffsetDateTime createdAt) {
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

    public ShowGlobalEipSegment withUpdatedAt(OffsetDateTime updatedAt) {
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

    public ShowGlobalEipSegment withInternetBandwidth(InternetBandwidthInfo internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
        return this;
    }

    public ShowGlobalEipSegment withInternetBandwidth(Consumer<InternetBandwidthInfo> internetBandwidthSetter) {
        if (this.internetBandwidth == null) {
            this.internetBandwidth = new InternetBandwidthInfo();
            internetBandwidthSetter.accept(this.internetBandwidth);
        }

        return this;
    }

    /**
     * Get internetBandwidth
     * @return internetBandwidth
     */
    public InternetBandwidthInfo getInternetBandwidth() {
        return internetBandwidth;
    }

    public void setInternetBandwidth(InternetBandwidthInfo internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
    }

    public ShowGlobalEipSegment withAssociateInstance(InstanceInfo associateInstance) {
        this.associateInstance = associateInstance;
        return this;
    }

    public ShowGlobalEipSegment withAssociateInstance(Consumer<InstanceInfo> associateInstanceSetter) {
        if (this.associateInstance == null) {
            this.associateInstance = new InstanceInfo();
            associateInstanceSetter.accept(this.associateInstance);
        }

        return this;
    }

    /**
     * Get associateInstance
     * @return associateInstance
     */
    public InstanceInfo getAssociateInstance() {
        return associateInstance;
    }

    public void setAssociateInstance(InstanceInfo associateInstance) {
        this.associateInstance = associateInstance;
    }

    public ShowGlobalEipSegment withIsPrePaid(Boolean isPrePaid) {
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

    public ShowGlobalEipSegment withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowGlobalEipSegment addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowGlobalEipSegment withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 全域弹性公网IP段标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ShowGlobalEipSegment withSysTags(List<Tag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ShowGlobalEipSegment addSysTagsItem(Tag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ShowGlobalEipSegment withSysTags(Consumer<List<Tag>> sysTagsSetter) {
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

    public ShowGlobalEipSegment withEnterpriseProjectId(String enterpriseProjectId) {
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
        ShowGlobalEipSegment that = (ShowGlobalEipSegment) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.accessSite, that.accessSite) && Objects.equals(this.geipPoolName, that.geipPoolName)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.cidr, that.cidr) && Objects.equals(this.cidrV6, that.cidrV6)
            && Objects.equals(this.freezen, that.freezen) && Objects.equals(this.freezenInfo, that.freezenInfo)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.internetBandwidth, that.internetBandwidth)
            && Objects.equals(this.associateInstance, that.associateInstance)
            && Objects.equals(this.isPrePaid, that.isPrePaid) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            domainId,
            accessSite,
            geipPoolName,
            isp,
            ipVersion,
            cidr,
            cidrV6,
            freezen,
            freezenInfo,
            status,
            createdAt,
            updatedAt,
            internetBandwidth,
            associateInstance,
            isPrePaid,
            tags,
            sysTags,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGlobalEipSegment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    geipPoolName: ").append(toIndentedString(geipPoolName)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    cidrV6: ").append(toIndentedString(cidrV6)).append("\n");
        sb.append("    freezen: ").append(toIndentedString(freezen)).append("\n");
        sb.append("    freezenInfo: ").append(toIndentedString(freezenInfo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    internetBandwidth: ").append(toIndentedString(internetBandwidth)).append("\n");
        sb.append("    associateInstance: ").append(toIndentedString(associateInstance)).append("\n");
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
