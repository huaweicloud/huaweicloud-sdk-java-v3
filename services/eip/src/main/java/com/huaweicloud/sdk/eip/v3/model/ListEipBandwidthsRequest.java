package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEipBandwidthsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private String bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_like")

    private String nameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_size")

    private String ingressSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state")

    private String adminState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_bandwidth_rules")

    private String enableBandwidthRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_quota")

    private Integer ruleQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ListEipBandwidthsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * - 功能说明：每页返回的个数 - 取值范围：取值范围：1~[2000]，其中2000为局点差异项，具体取值由局点决定
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListEipBandwidthsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * - 功能说明：分页查询起始的资源ID，为空时为查询第一页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListEipBandwidthsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * - 功能说明：带宽唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListEipBandwidthsRequest withBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /**
     * - 功能说明：带宽类型，共享带宽默认为share。 - 取值范围：share，bgp，telcom，sbgp等。   - share：共享带宽   - bgp：动态bgp   - telcom ：联通   - sbgp：静态bgp
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    public ListEipBandwidthsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 功能说明：宽带名称，按照宽带名称过滤
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListEipBandwidthsRequest withNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    /**
     * - 功能说明：根据宽带名称模糊查询过滤
     * @return nameLike
     */
    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public ListEipBandwidthsRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * - 功能说明：根据tenant_id过滤
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ListEipBandwidthsRequest withIngressSize(String ingressSize) {
        this.ingressSize = ingressSize;
        return this;
    }

    /**
     * - 功能说明：根据入云大小过滤
     * @return ingressSize
     */
    public String getIngressSize() {
        return ingressSize;
    }

    public void setIngressSize(String ingressSize) {
        this.ingressSize = ingressSize;
    }

    public ListEipBandwidthsRequest withAdminState(String adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * - 功能说明：根据宽带状态过滤
     * @return adminState
     */
    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }

    public ListEipBandwidthsRequest withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * - 功能说明：根据计费信息过滤
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public ListEipBandwidthsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * - 功能说明：根据标签过滤
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListEipBandwidthsRequest withEnableBandwidthRules(String enableBandwidthRules) {
        this.enableBandwidthRules = enableBandwidthRules;
        return this;
    }

    /**
     * - 功能说明：根据是否带宽分组使能过滤 - 取值范围：true、false
     * @return enableBandwidthRules
     */
    public String getEnableBandwidthRules() {
        return enableBandwidthRules;
    }

    public void setEnableBandwidthRules(String enableBandwidthRules) {
        this.enableBandwidthRules = enableBandwidthRules;
    }

    public ListEipBandwidthsRequest withRuleQuota(Integer ruleQuota) {
        this.ruleQuota = ruleQuota;
        return this;
    }

    /**
     * - 功能说明：根据规则数值过滤
     * @return ruleQuota
     */
    public Integer getRuleQuota() {
        return ruleQuota;
    }

    public void setRuleQuota(Integer ruleQuota) {
        this.ruleQuota = ruleQuota;
    }

    public ListEipBandwidthsRequest withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * - 功能说明：根据站点信息过滤
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListEipBandwidthsRequest withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * - 功能说明：按流量计费,按带宽计费还是按增强型95计费 - 取值范围：bandwidth（按带宽计费），traffic（按流量计费），95peak_plus（按增强型95计费），不返回或者为空时表示是bandwidth - 约束：只有共享带宽支持95peak_plus（按增强型95计费），按增强型95计费时需要指定保底百分比，默认是20%
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ListEipBandwidthsRequest withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * - 功能说明：带宽大小。共享带宽的大小有最小值限制，默认为5M，可能因局点不同而不同。 - 取值范围：默认5Mbit/s~2000Mbit/s（具体范围以各区域配置为准，请参见控制台对应页面显示）。   调整带宽时的最小单位会根据带宽范围不同存在差异。 - 小于等于300Mbit/s：默认最小单位为1Mbit/s。 - 300Mbit/s~1000Mbit/s：默认最小单位为50Mbit/s。 - 大于1000Mbit/s：默认最小单位为500Mbit/s。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ListEipBandwidthsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * - 功能说明：带宽类型，标识是否是共享带宽 - 取值范围：WHOLE，PER。   - WHOLE表示共享带宽   - PER表示独享带宽
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEipBandwidthsRequest that = (ListEipBandwidthsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.id, that.id) && Objects.equals(this.bandwidthType, that.bandwidthType)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameLike, that.nameLike)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.ingressSize, that.ingressSize)
            && Objects.equals(this.adminState, that.adminState) && Objects.equals(this.billingInfo, that.billingInfo)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enableBandwidthRules, that.enableBandwidthRules)
            && Objects.equals(this.ruleQuota, that.ruleQuota)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.size, that.size)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            id,
            bandwidthType,
            name,
            nameLike,
            tenantId,
            ingressSize,
            adminState,
            billingInfo,
            tags,
            enableBandwidthRules,
            ruleQuota,
            publicBorderGroup,
            chargeMode,
            size,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEipBandwidthsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    ingressSize: ").append(toIndentedString(ingressSize)).append("\n");
        sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enableBandwidthRules: ").append(toIndentedString(enableBandwidthRules)).append("\n");
        sb.append("    ruleQuota: ").append(toIndentedString(ruleQuota)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
