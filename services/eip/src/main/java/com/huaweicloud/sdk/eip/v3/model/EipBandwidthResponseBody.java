package com.huaweicloud.sdk.eip.v3.model;

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
import java.util.UUID;
import java.util.function.Consumer;

/**
 * 带宽对象
 */
public class EipBandwidthResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state")

    private String adminState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_size")

    private Integer ingressSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_quota")

    private Integer ruleQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio_95peak_plus")

    private Integer ratio95peakPlus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_bandwidth_rules")

    private Boolean enableBandwidthRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_rules")

    private List<BandWidthRules> bandwidthRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private String bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billinginfo")

    private String billinginfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_info")

    private List<PublicipInfoResponseBody> publicipInfo = null;

    /**
     * - 功能说明：带宽类型，标识是否是共享带宽 - 取值范围：WHOLE，PER。  WHOLE表示共享带宽；PER表示独享带宽
     */
    public static final class TypeEnum {

        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final TypeEnum WHOLE = new TypeEnum("WHOLE");

        /**
         * Enum PER for value: "PER"
         */
        public static final TypeEnum PER = new TypeEnum("PER");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("WHOLE", WHOLE);
            map.put("PER", PER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private UUID tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public EipBandwidthResponseBody withAdminState(String adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * - 功能说明：带宽状态 - 取值范围：normal，freezed
     * @return adminState
     */
    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }

    public EipBandwidthResponseBody withIngressSize(Integer ingressSize) {
        this.ingressSize = ingressSize;
        return this;
    }

    /**
     * - 功能说明：入网大小，单位Mbit/s
     * @return ingressSize
     */
    public Integer getIngressSize() {
        return ingressSize;
    }

    public void setIngressSize(Integer ingressSize) {
        this.ingressSize = ingressSize;
    }

    public EipBandwidthResponseBody withRuleQuota(Integer ruleQuota) {
        this.ruleQuota = ruleQuota;
        return this;
    }

    /**
     * - 功能说明：规则数值，最低阈值可调节
     * @return ruleQuota
     */
    public Integer getRuleQuota() {
        return ruleQuota;
    }

    public void setRuleQuota(Integer ruleQuota) {
        this.ruleQuota = ruleQuota;
    }

    public EipBandwidthResponseBody withRatio95peakPlus(Integer ratio95peakPlus) {
        this.ratio95peakPlus = ratio95peakPlus;
        return this;
    }

    /**
     * - 功能说明：增强型95带宽保底率，最低保底率为20
     * @return ratio95peakPlus
     */
    public Integer getRatio95peakPlus() {
        return ratio95peakPlus;
    }

    public void setRatio95peakPlus(Integer ratio95peakPlus) {
        this.ratio95peakPlus = ratio95peakPlus;
    }

    public EipBandwidthResponseBody withEnableBandwidthRules(Boolean enableBandwidthRules) {
        this.enableBandwidthRules = enableBandwidthRules;
        return this;
    }

    /**
     * - 功能说明：带宽分组使能，表明开启带宽分组限速功能。
     * @return enableBandwidthRules
     */
    public Boolean getEnableBandwidthRules() {
        return enableBandwidthRules;
    }

    public void setEnableBandwidthRules(Boolean enableBandwidthRules) {
        this.enableBandwidthRules = enableBandwidthRules;
    }

    public EipBandwidthResponseBody withBandwidthRules(List<BandWidthRules> bandwidthRules) {
        this.bandwidthRules = bandwidthRules;
        return this;
    }

    public EipBandwidthResponseBody addBandwidthRulesItem(BandWidthRules bandwidthRulesItem) {
        if (this.bandwidthRules == null) {
            this.bandwidthRules = new ArrayList<>();
        }
        this.bandwidthRules.add(bandwidthRulesItem);
        return this;
    }

    public EipBandwidthResponseBody withBandwidthRules(Consumer<List<BandWidthRules>> bandwidthRulesSetter) {
        if (this.bandwidthRules == null) {
            this.bandwidthRules = new ArrayList<>();
        }
        bandwidthRulesSetter.accept(this.bandwidthRules);
        return this;
    }

    /**
     * - 功能说明：带宽规则对象（该字段仅在上海1局点返回）
     * @return bandwidthRules
     */
    public List<BandWidthRules> getBandwidthRules() {
        return bandwidthRules;
    }

    public void setBandwidthRules(List<BandWidthRules> bandwidthRules) {
        this.bandwidthRules = bandwidthRules;
    }

    public EipBandwidthResponseBody withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * - 功能说明：带宽AZ属性，表征中心和边缘。中心带宽默认为center
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public EipBandwidthResponseBody withBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /**
     * - 功能说明：带宽类型，共享带宽默认为share。 - 取值范围：share，bgp，telcom，sbgp等。  share：共享带宽；  bgp：动态bgp；  telcom ：联通；  sbgp：静态bgp。
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    public EipBandwidthResponseBody withBillinginfo(String billinginfo) {
        this.billinginfo = billinginfo;
        return this;
    }

    /**
     * - 功能说明：账单信息，
     * @return billinginfo
     */
    public String getBillinginfo() {
        return billinginfo;
    }

    public void setBillinginfo(String billinginfo) {
        this.billinginfo = billinginfo;
    }

    public EipBandwidthResponseBody withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * - 功能说明：带宽唯一标识
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public EipBandwidthResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 功能说明：带宽名称 - 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EipBandwidthResponseBody withPublicipInfo(List<PublicipInfoResponseBody> publicipInfo) {
        this.publicipInfo = publicipInfo;
        return this;
    }

    public EipBandwidthResponseBody addPublicipInfoItem(PublicipInfoResponseBody publicipInfoItem) {
        if (this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        this.publicipInfo.add(publicipInfoItem);
        return this;
    }

    public EipBandwidthResponseBody withPublicipInfo(Consumer<List<PublicipInfoResponseBody>> publicipInfoSetter) {
        if (this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        publicipInfoSetter.accept(this.publicipInfo);
        return this;
    }

    /**
     * - 功能说明：带宽对应的弹性公网IP信息 - 约束：WHOLE类型的带宽支持多个弹性公网IP，PER类型的带宽只能对应一个弹性公网IP
     * @return publicipInfo
     */
    public List<PublicipInfoResponseBody> getPublicipInfo() {
        return publicipInfo;
    }

    public void setPublicipInfo(List<PublicipInfoResponseBody> publicipInfo) {
        this.publicipInfo = publicipInfo;
    }

    public EipBandwidthResponseBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * - 功能说明：带宽类型，标识是否是共享带宽 - 取值范围：WHOLE，PER。  WHOLE表示共享带宽；PER表示独享带宽
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public EipBandwidthResponseBody withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * - 功能说明：带宽大小 - 取值范围：默认5Mbit/s~2000Mbit/s（具体范围以各区域配置为准，请参见控制台对应页面显示）。
     * minimum: 5
     * maximum: 2000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public EipBandwidthResponseBody withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * - 功能说明：用户所属项目ID
     * @return tenantId
     */
    public UUID getTenantId() {
        return tenantId;
    }

    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }

    public EipBandwidthResponseBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public EipBandwidthResponseBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public EipBandwidthResponseBody withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * - 功能说明：\"公网EIP标签\"
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public EipBandwidthResponseBody withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * - 功能说明：资源创建时间，采用UTC时间，格式：YYYY-MM-DDTHH:MM:SS
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public EipBandwidthResponseBody withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * - 功能说明：资源更新时间，采用UTC时间，格式：YYYY-MM-DDTHH:MM:SS
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EipBandwidthResponseBody that = (EipBandwidthResponseBody) obj;
        return Objects.equals(this.adminState, that.adminState) && Objects.equals(this.ingressSize, that.ingressSize)
            && Objects.equals(this.ruleQuota, that.ruleQuota)
            && Objects.equals(this.ratio95peakPlus, that.ratio95peakPlus)
            && Objects.equals(this.enableBandwidthRules, that.enableBandwidthRules)
            && Objects.equals(this.bandwidthRules, that.bandwidthRules)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.bandwidthType, that.bandwidthType)
            && Objects.equals(this.billinginfo, that.billinginfo) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.publicipInfo, that.publicipInfo)
            && Objects.equals(this.type, that.type) && Objects.equals(this.size, that.size)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminState,
            ingressSize,
            ruleQuota,
            ratio95peakPlus,
            enableBandwidthRules,
            bandwidthRules,
            publicBorderGroup,
            bandwidthType,
            billinginfo,
            id,
            name,
            publicipInfo,
            type,
            size,
            tenantId,
            tags,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipBandwidthResponseBody {\n");
        sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
        sb.append("    ingressSize: ").append(toIndentedString(ingressSize)).append("\n");
        sb.append("    ruleQuota: ").append(toIndentedString(ruleQuota)).append("\n");
        sb.append("    ratio95peakPlus: ").append(toIndentedString(ratio95peakPlus)).append("\n");
        sb.append("    enableBandwidthRules: ").append(toIndentedString(enableBandwidthRules)).append("\n");
        sb.append("    bandwidthRules: ").append(toIndentedString(bandwidthRules)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    billinginfo: ").append(toIndentedString(billinginfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicipInfo: ").append(toIndentedString(publicipInfo)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
