package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowKillOpRuleRuleListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_types")

    private String operationTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private String namespaces;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_summary")

    private String planSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ShowKillOpRuleRuleListRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，可以调用“[查询实例列表和详情](x-wc://file=zh-cn_topic_0000001369935045.xml)”接口获取。如果未申请实例，可以调用“[创建实例](x-wc://file=zh-cn_topic_0000001369734929.xml)”接口创建。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowKillOpRuleRuleListRequest withOperationTypes(String operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }

    /**
     * Sql语句操作类型。  - insert，表示插入语句。  - update，表示更新语句。  - query，表示查询语句。  - command，表示命令语句。  - remove，表示删除语句。  - getmore，表示获取更多数据语句。
     * @return operationTypes
     */
    public String getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(String operationTypes) {
        this.operationTypes = operationTypes;
    }

    public ShowKillOpRuleRuleListRequest withNamespaces(String namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    /**
     * 表命名空间。取值格式：库名.表名。 - 可为空，表示不做限制。 - 单独库名，表示对某个库下的所有集合生效。 - 库名.表名，表示对具体库下的具体的集合生效。
     * @return namespaces
     */
    public String getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(String namespaces) {
        this.namespaces = namespaces;
    }

    public ShowKillOpRuleRuleListRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * killOp规则状态。  - ENABLED，规则生效中。 - DISABLED，规则禁用中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowKillOpRuleRuleListRequest withPlanSummary(String planSummary) {
        this.planSummary = planSummary;
        return this;
    }

    /**
     * 执行计划。 默认值空，表示不做限制。  - COLLSCAN。 - SORT_KEY_GENERATOR。 - SKIP。 - LIMIT。 - GEO_NEAR_2DSPHERE。 - GEO_NEAR_2D。 - AGGREGATE。 - OR。
     * @return planSummary
     */
    public String getPlanSummary() {
        return planSummary;
    }

    public void setPlanSummary(String planSummary) {
        this.planSummary = planSummary;
    }

    public ShowKillOpRuleRuleListRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。  从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询）。 取值必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowKillOpRuleRuleListRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询个数上限值。 - 取值范围: 1~100。 - 不传该参数时，默认查询前100条信息。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKillOpRuleRuleListRequest that = (ShowKillOpRuleRuleListRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.operationTypes, that.operationTypes)
            && Objects.equals(this.namespaces, that.namespaces) && Objects.equals(this.status, that.status)
            && Objects.equals(this.planSummary, that.planSummary) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, operationTypes, namespaces, status, planSummary, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKillOpRuleRuleListRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    operationTypes: ").append(toIndentedString(operationTypes)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    planSummary: ").append(toIndentedString(planSummary)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
