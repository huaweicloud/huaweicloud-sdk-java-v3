package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListIpsRulesRequest {

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

    public ListIpsRulesRequest withAffectedApplicationLike(Integer affectedApplicationLike) {
        this.affectedApplicationLike = affectedApplicationLike;
        return this;
    }

    /**
     * 受影响对象查询关键字，可包含如下：Others、Sun、Apache、IBM、VMware、WordPress、Adobe、Oracle、Google Chrome等
     * @return affectedApplicationLike
     */
    public Integer getAffectedApplicationLike() {
        return affectedApplicationLike;
    }

    public void setAffectedApplicationLike(Integer affectedApplicationLike) {
        this.affectedApplicationLike = affectedApplicationLike;
    }

    public ListIpsRulesRequest withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * IPS规则创建的年份
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public ListIpsRulesRequest withFwInstanceId(String fwInstanceId) {
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

    public ListIpsRulesRequest withIpsCveLike(Integer ipsCveLike) {
        this.ipsCveLike = ipsCveLike;
        return this;
    }

    /**
     * cve id查询关键字，cve id为cve漏洞库中存储的漏洞id
     * @return ipsCveLike
     */
    public Integer getIpsCveLike() {
        return ipsCveLike;
    }

    public void setIpsCveLike(Integer ipsCveLike) {
        this.ipsCveLike = ipsCveLike;
    }

    public ListIpsRulesRequest withIpsGroup(Integer ipsGroup) {
        this.ipsGroup = ipsGroup;
        return this;
    }

    /**
     * IPS组，使用IPS规则拦截模式区分，包含，0：观察模式，1：严格模式，2：中等模式，3：宽松模式
     * @return ipsGroup
     */
    public Integer getIpsGroup() {
        return ipsGroup;
    }

    public void setIpsGroup(Integer ipsGroup) {
        this.ipsGroup = ipsGroup;
    }

    public ListIpsRulesRequest withIpsId(String ipsId) {
        this.ipsId = ipsId;
        return this;
    }

    /**
     * IPS规则id
     * @return ipsId
     */
    public String getIpsId() {
        return ipsId;
    }

    public void setIpsId(String ipsId) {
        this.ipsId = ipsId;
    }

    public ListIpsRulesRequest withIpsLevel(Integer ipsLevel) {
        this.ipsLevel = ipsLevel;
        return this;
    }

    /**
     * IPS严重等级，包含CRITICAL、HIGH、MEDIUM、LOW
     * @return ipsLevel
     */
    public Integer getIpsLevel() {
        return ipsLevel;
    }

    public void setIpsLevel(Integer ipsLevel) {
        this.ipsLevel = ipsLevel;
    }

    public ListIpsRulesRequest withIpsNameLike(String ipsNameLike) {
        this.ipsNameLike = ipsNameLike;
        return this;
    }

    /**
     * IPS规则名称查询关键字
     * @return ipsNameLike
     */
    public String getIpsNameLike() {
        return ipsNameLike;
    }

    public void setIpsNameLike(String ipsNameLike) {
        this.ipsNameLike = ipsNameLike;
    }

    public ListIpsRulesRequest withIpsRulesTypeLike(Integer ipsRulesTypeLike) {
        this.ipsRulesTypeLike = ipsRulesTypeLike;
        return this;
    }

    /**
     * IPS规则类型，包括漏洞扫描、黑客工具、特洛伊木马等
     * @return ipsRulesTypeLike
     */
    public Integer getIpsRulesTypeLike() {
        return ipsRulesTypeLike;
    }

    public void setIpsRulesTypeLike(Integer ipsRulesTypeLike) {
        this.ipsRulesTypeLike = ipsRulesTypeLike;
    }

    public ListIpsRulesRequest withIpsStatus(String ipsStatus) {
        this.ipsStatus = ipsStatus;
        return this;
    }

    /**
     * IPS规则状态，包含观察：OBSERVE、拦截：ENABLE、禁用：CLOSE、恢复默认：DEFAULT、全局恢复默认：ALL_DEFAULT
     * @return ipsStatus
     */
    public String getIpsStatus() {
        return ipsStatus;
    }

    public void setIpsStatus(String ipsStatus) {
        this.ipsStatus = ipsStatus;
    }

    public ListIpsRulesRequest withIsUpdatedIpsRuleQueried(Boolean isUpdatedIpsRuleQueried) {
        this.isUpdatedIpsRuleQueried = isUpdatedIpsRuleQueried;
        return this;
    }

    /**
     * 是否查询虚拟补丁相对基础防御更新规则，是表示true,否表示false
     * @return isUpdatedIpsRuleQueried
     */
    public Boolean getIsUpdatedIpsRuleQueried() {
        return isUpdatedIpsRuleQueried;
    }

    public void setIsUpdatedIpsRuleQueried(Boolean isUpdatedIpsRuleQueried) {
        this.isUpdatedIpsRuleQueried = isUpdatedIpsRuleQueried;
    }

    public ListIpsRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数，范围为1-1024
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

    public ListIpsRulesRequest withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象ID，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，type为0时，object_id为互联网边界防护对象ID，type为1时，object_id为VPC边界防护对象ID。此处仅取type为0的防护对象id，可通过data.records.protect_objects.type（.表示各对象之间层级的区分）获得。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ListIpsRulesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListIpsRulesRequest withEnterpriseProjectId(String enterpriseProjectId) {
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
        ListIpsRulesRequest that = (ListIpsRulesRequest) obj;
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
        sb.append("class ListIpsRulesRequest {\n");
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
