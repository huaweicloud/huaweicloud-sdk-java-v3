package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListIpsRules1Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_application_like")

    private Integer affectedApplicationLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_cve_like")

    private Integer ipsCveLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_group")

    private Integer ipsGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_id")

    private String ipsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_level")

    private Integer ipsLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_name_like")

    private String ipsNameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_rules_type_like")

    private Integer ipsRulesTypeLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_status")

    private String ipsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_updated_ips_rule_queried")

    private Boolean isUpdatedIpsRuleQueried;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListIpsRules1Request withAffectedApplicationLike(Integer affectedApplicationLike) {
        this.affectedApplicationLike = affectedApplicationLike;
        return this;
    }

    /**
     * 攻击对象
     * @return affectedApplicationLike
     */
    public Integer getAffectedApplicationLike() {
        return affectedApplicationLike;
    }

    public void setAffectedApplicationLike(Integer affectedApplicationLike) {
        this.affectedApplicationLike = affectedApplicationLike;
    }

    public ListIpsRules1Request withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public ListIpsRules1Request withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙ID，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public ListIpsRules1Request withIpsCveLike(Integer ipsCveLike) {
        this.ipsCveLike = ipsCveLike;
        return this;
    }

    /**
     * cve
     * @return ipsCveLike
     */
    public Integer getIpsCveLike() {
        return ipsCveLike;
    }

    public void setIpsCveLike(Integer ipsCveLike) {
        this.ipsCveLike = ipsCveLike;
    }

    public ListIpsRules1Request withIpsGroup(Integer ipsGroup) {
        this.ipsGroup = ipsGroup;
        return this;
    }

    /**
     * ips组
     * @return ipsGroup
     */
    public Integer getIpsGroup() {
        return ipsGroup;
    }

    public void setIpsGroup(Integer ipsGroup) {
        this.ipsGroup = ipsGroup;
    }

    public ListIpsRules1Request withIpsId(String ipsId) {
        this.ipsId = ipsId;
        return this;
    }

    /**
     * ips规则id
     * @return ipsId
     */
    public String getIpsId() {
        return ipsId;
    }

    public void setIpsId(String ipsId) {
        this.ipsId = ipsId;
    }

    public ListIpsRules1Request withIpsLevel(Integer ipsLevel) {
        this.ipsLevel = ipsLevel;
        return this;
    }

    /**
     * ips等级
     * @return ipsLevel
     */
    public Integer getIpsLevel() {
        return ipsLevel;
    }

    public void setIpsLevel(Integer ipsLevel) {
        this.ipsLevel = ipsLevel;
    }

    public ListIpsRules1Request withIpsNameLike(String ipsNameLike) {
        this.ipsNameLike = ipsNameLike;
        return this;
    }

    /**
     * ips规则名称
     * @return ipsNameLike
     */
    public String getIpsNameLike() {
        return ipsNameLike;
    }

    public void setIpsNameLike(String ipsNameLike) {
        this.ipsNameLike = ipsNameLike;
    }

    public ListIpsRules1Request withIpsRulesTypeLike(Integer ipsRulesTypeLike) {
        this.ipsRulesTypeLike = ipsRulesTypeLike;
        return this;
    }

    /**
     * ips规则类型
     * @return ipsRulesTypeLike
     */
    public Integer getIpsRulesTypeLike() {
        return ipsRulesTypeLike;
    }

    public void setIpsRulesTypeLike(Integer ipsRulesTypeLike) {
        this.ipsRulesTypeLike = ipsRulesTypeLike;
    }

    public ListIpsRules1Request withIpsStatus(String ipsStatus) {
        this.ipsStatus = ipsStatus;
        return this;
    }

    /**
     * ips规则状态
     * @return ipsStatus
     */
    public String getIpsStatus() {
        return ipsStatus;
    }

    public void setIpsStatus(String ipsStatus) {
        this.ipsStatus = ipsStatus;
    }

    public ListIpsRules1Request withIsUpdatedIpsRuleQueried(Boolean isUpdatedIpsRuleQueried) {
        this.isUpdatedIpsRuleQueried = isUpdatedIpsRuleQueried;
        return this;
    }

    /**
     * 是否查新更新规则
     * @return isUpdatedIpsRuleQueried
     */
    public Boolean getIsUpdatedIpsRuleQueried() {
        return isUpdatedIpsRuleQueried;
    }

    public void setIsUpdatedIpsRuleQueried(Boolean isUpdatedIpsRuleQueried) {
        this.isUpdatedIpsRuleQueried = isUpdatedIpsRuleQueried;
    }

    public ListIpsRules1Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询数据量限制
     * minimum: 1
     * maximum: 1024
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListIpsRules1Request withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象ID，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。此处仅取type为1的防护对象id，可通过data.records.protect_objects.type（.表示各对象之间层级的区分）获得。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ListIpsRules1Request withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移量
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListIpsRules1Request withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，用户根据组织规划企业项目，对应的ID为企业项目ID，可通过[如何获取企业项目ID](cfw_02_0027.xml)获取，用户未开启企业项目时为0
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
        ListIpsRules1Request that = (ListIpsRules1Request) obj;
        return Objects.equals(this.affectedApplicationLike, that.affectedApplicationLike)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.fwInstanceId, that.fwInstanceId)
            && Objects.equals(this.ipsCveLike, that.ipsCveLike) && Objects.equals(this.ipsGroup, that.ipsGroup)
            && Objects.equals(this.ipsId, that.ipsId) && Objects.equals(this.ipsLevel, that.ipsLevel)
            && Objects.equals(this.ipsNameLike, that.ipsNameLike)
            && Objects.equals(this.ipsRulesTypeLike, that.ipsRulesTypeLike)
            && Objects.equals(this.ipsStatus, that.ipsStatus)
            && Objects.equals(this.isUpdatedIpsRuleQueried, that.isUpdatedIpsRuleQueried)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affectedApplicationLike,
            createTime,
            fwInstanceId,
            ipsCveLike,
            ipsGroup,
            ipsId,
            ipsLevel,
            ipsNameLike,
            ipsRulesTypeLike,
            ipsStatus,
            isUpdatedIpsRuleQueried,
            limit,
            objectId,
            offset,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIpsRules1Request {\n");
        sb.append("    affectedApplicationLike: ").append(toIndentedString(affectedApplicationLike)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    ipsCveLike: ").append(toIndentedString(ipsCveLike)).append("\n");
        sb.append("    ipsGroup: ").append(toIndentedString(ipsGroup)).append("\n");
        sb.append("    ipsId: ").append(toIndentedString(ipsId)).append("\n");
        sb.append("    ipsLevel: ").append(toIndentedString(ipsLevel)).append("\n");
        sb.append("    ipsNameLike: ").append(toIndentedString(ipsNameLike)).append("\n");
        sb.append("    ipsRulesTypeLike: ").append(toIndentedString(ipsRulesTypeLike)).append("\n");
        sb.append("    ipsStatus: ").append(toIndentedString(ipsStatus)).append("\n");
        sb.append("    isUpdatedIpsRuleQueried: ").append(toIndentedString(isUpdatedIpsRuleQueried)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
