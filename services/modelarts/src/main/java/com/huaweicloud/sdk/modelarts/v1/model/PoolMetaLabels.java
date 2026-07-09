package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源池metadata的标签信息。
 */
public class PoolMetaLabels {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/name")

    private String osModelartsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/workspace.id")

    private String osModelartsWorkspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/node.prefix")

    private String osModelartsNodePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/resource.id")

    private String osModelartsResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/tenant.domain.id")

    private String osModelartsTenantDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/tenant.project.id")

    private String osModelartsTenantProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/enterprise.project.id")

    private String osModelartsEnterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.pool/biz")

    private String osModelartsPoolBiz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/create-from")

    private String osModelartsCreateFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/nobilling")

    private String osModelartsNobilling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/order.name")

    private String osModelartsOrderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/region")

    private String osModelartsRegion;

    public PoolMetaLabels withOsModelartsName(String osModelartsName) {
        this.osModelartsName = osModelartsName;
        return this;
    }

    /**
     * **参数解释**：资源池的显示名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsName
     */
    public String getOsModelartsName() {
        return osModelartsName;
    }

    public void setOsModelartsName(String osModelartsName) {
        this.osModelartsName = osModelartsName;
    }

    public PoolMetaLabels withOsModelartsWorkspaceId(String osModelartsWorkspaceId) {
        this.osModelartsWorkspaceId = osModelartsWorkspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。[获取方法请参见[查询工作空间列表](ListWorkspace.xml)。](tag:hc) **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：0。
     * @return osModelartsWorkspaceId
     */
    public String getOsModelartsWorkspaceId() {
        return osModelartsWorkspaceId;
    }

    public void setOsModelartsWorkspaceId(String osModelartsWorkspaceId) {
        this.osModelartsWorkspaceId = osModelartsWorkspaceId;
    }

    public PoolMetaLabels withOsModelartsNodePrefix(String osModelartsNodePrefix) {
        this.osModelartsNodePrefix = osModelartsNodePrefix;
        return this;
    }

    /**
     * **参数解释**：自定义节点前缀，可选值。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsNodePrefix
     */
    public String getOsModelartsNodePrefix() {
        return osModelartsNodePrefix;
    }

    public void setOsModelartsNodePrefix(String osModelartsNodePrefix) {
        this.osModelartsNodePrefix = osModelartsNodePrefix;
    }

    public PoolMetaLabels withOsModelartsResourceId(String osModelartsResourceId) {
        this.osModelartsResourceId = osModelartsResourceId;
        return this;
    }

    /**
     * **参数解释**：资源池计费使用的资源ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsResourceId
     */
    public String getOsModelartsResourceId() {
        return osModelartsResourceId;
    }

    public void setOsModelartsResourceId(String osModelartsResourceId) {
        this.osModelartsResourceId = osModelartsResourceId;
    }

    public PoolMetaLabels withOsModelartsTenantDomainId(String osModelartsTenantDomainId) {
        this.osModelartsTenantDomainId = osModelartsTenantDomainId;
        return this;
    }

    /**
     * **参数解释**：资源池所属的租户ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsTenantDomainId
     */
    public String getOsModelartsTenantDomainId() {
        return osModelartsTenantDomainId;
    }

    public void setOsModelartsTenantDomainId(String osModelartsTenantDomainId) {
        this.osModelartsTenantDomainId = osModelartsTenantDomainId;
    }

    public PoolMetaLabels withOsModelartsTenantProjectId(String osModelartsTenantProjectId) {
        this.osModelartsTenantProjectId = osModelartsTenantProjectId;
        return this;
    }

    /**
     * **参数解释**：资源池所属的租户项目ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsTenantProjectId
     */
    public String getOsModelartsTenantProjectId() {
        return osModelartsTenantProjectId;
    }

    public void setOsModelartsTenantProjectId(String osModelartsTenantProjectId) {
        this.osModelartsTenantProjectId = osModelartsTenantProjectId;
    }

    public PoolMetaLabels withOsModelartsEnterpriseProjectId(String osModelartsEnterpriseProjectId) {
        this.osModelartsEnterpriseProjectId = osModelartsEnterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**：资源池所属的企业项目ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsEnterpriseProjectId
     */
    public String getOsModelartsEnterpriseProjectId() {
        return osModelartsEnterpriseProjectId;
    }

    public void setOsModelartsEnterpriseProjectId(String osModelartsEnterpriseProjectId) {
        this.osModelartsEnterpriseProjectId = osModelartsEnterpriseProjectId;
    }

    public PoolMetaLabels withOsModelartsPoolBiz(String osModelartsPoolBiz) {
        this.osModelartsPoolBiz = osModelartsPoolBiz;
        return this;
    }

    /**
     * **参数解释**：资源池商业类型，public是公共池，private个人专属池。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsPoolBiz
     */
    public String getOsModelartsPoolBiz() {
        return osModelartsPoolBiz;
    }

    public void setOsModelartsPoolBiz(String osModelartsPoolBiz) {
        this.osModelartsPoolBiz = osModelartsPoolBiz;
    }

    public PoolMetaLabels withOsModelartsCreateFrom(String osModelartsCreateFrom) {
        this.osModelartsCreateFrom = osModelartsCreateFrom;
        return this;
    }

    /**
     * **参数解释**：资源池创建来源，比如admin-console，标记来自admin创建，console标记来自ma console。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsCreateFrom
     */
    public String getOsModelartsCreateFrom() {
        return osModelartsCreateFrom;
    }

    public void setOsModelartsCreateFrom(String osModelartsCreateFrom) {
        this.osModelartsCreateFrom = osModelartsCreateFrom;
    }

    public PoolMetaLabels withOsModelartsNobilling(String osModelartsNobilling) {
        this.osModelartsNobilling = osModelartsNobilling;
        return this;
    }

    /**
     * **参数解释**：资源池是否计费。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsNobilling
     */
    public String getOsModelartsNobilling() {
        return osModelartsNobilling;
    }

    public void setOsModelartsNobilling(String osModelartsNobilling) {
        this.osModelartsNobilling = osModelartsNobilling;
    }

    public PoolMetaLabels withOsModelartsOrderName(String osModelartsOrderName) {
        this.osModelartsOrderName = osModelartsOrderName;
        return this;
    }

    /**
     * **参数解释**：资源池关联的上一次订单作业记录。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsOrderName
     */
    public String getOsModelartsOrderName() {
        return osModelartsOrderName;
    }

    public void setOsModelartsOrderName(String osModelartsOrderName) {
        this.osModelartsOrderName = osModelartsOrderName;
    }

    public PoolMetaLabels withOsModelartsRegion(String osModelartsRegion) {
        this.osModelartsRegion = osModelartsRegion;
        return this;
    }

    /**
     * **参数解释**：资源池所属区域。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsRegion
     */
    public String getOsModelartsRegion() {
        return osModelartsRegion;
    }

    public void setOsModelartsRegion(String osModelartsRegion) {
        this.osModelartsRegion = osModelartsRegion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolMetaLabels that = (PoolMetaLabels) obj;
        return Objects.equals(this.osModelartsName, that.osModelartsName)
            && Objects.equals(this.osModelartsWorkspaceId, that.osModelartsWorkspaceId)
            && Objects.equals(this.osModelartsNodePrefix, that.osModelartsNodePrefix)
            && Objects.equals(this.osModelartsResourceId, that.osModelartsResourceId)
            && Objects.equals(this.osModelartsTenantDomainId, that.osModelartsTenantDomainId)
            && Objects.equals(this.osModelartsTenantProjectId, that.osModelartsTenantProjectId)
            && Objects.equals(this.osModelartsEnterpriseProjectId, that.osModelartsEnterpriseProjectId)
            && Objects.equals(this.osModelartsPoolBiz, that.osModelartsPoolBiz)
            && Objects.equals(this.osModelartsCreateFrom, that.osModelartsCreateFrom)
            && Objects.equals(this.osModelartsNobilling, that.osModelartsNobilling)
            && Objects.equals(this.osModelartsOrderName, that.osModelartsOrderName)
            && Objects.equals(this.osModelartsRegion, that.osModelartsRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsName,
            osModelartsWorkspaceId,
            osModelartsNodePrefix,
            osModelartsResourceId,
            osModelartsTenantDomainId,
            osModelartsTenantProjectId,
            osModelartsEnterpriseProjectId,
            osModelartsPoolBiz,
            osModelartsCreateFrom,
            osModelartsNobilling,
            osModelartsOrderName,
            osModelartsRegion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMetaLabels {\n");
        sb.append("    osModelartsName: ").append(toIndentedString(osModelartsName)).append("\n");
        sb.append("    osModelartsWorkspaceId: ").append(toIndentedString(osModelartsWorkspaceId)).append("\n");
        sb.append("    osModelartsNodePrefix: ").append(toIndentedString(osModelartsNodePrefix)).append("\n");
        sb.append("    osModelartsResourceId: ").append(toIndentedString(osModelartsResourceId)).append("\n");
        sb.append("    osModelartsTenantDomainId: ").append(toIndentedString(osModelartsTenantDomainId)).append("\n");
        sb.append("    osModelartsTenantProjectId: ").append(toIndentedString(osModelartsTenantProjectId)).append("\n");
        sb.append("    osModelartsEnterpriseProjectId: ")
            .append(toIndentedString(osModelartsEnterpriseProjectId))
            .append("\n");
        sb.append("    osModelartsPoolBiz: ").append(toIndentedString(osModelartsPoolBiz)).append("\n");
        sb.append("    osModelartsCreateFrom: ").append(toIndentedString(osModelartsCreateFrom)).append("\n");
        sb.append("    osModelartsNobilling: ").append(toIndentedString(osModelartsNobilling)).append("\n");
        sb.append("    osModelartsOrderName: ").append(toIndentedString(osModelartsOrderName)).append("\n");
        sb.append("    osModelartsRegion: ").append(toIndentedString(osModelartsRegion)).append("\n");
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
