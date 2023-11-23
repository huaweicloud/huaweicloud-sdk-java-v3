package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * KillOpRule
 */
public class KillOpRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_types")

    private String operationTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private String namespaces;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ips")

    private String clientIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_summary")

    private String planSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrency")

    private Integer maxConcurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secs_running")

    private Integer secsRunning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    public KillOpRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * killOp规则ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KillOpRule withOperationTypes(String operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }

    /**
     * Sql语句操作类型。 最多支持同时选择6种语句类型。同时选择多种类型时，匹配任意一种类型时规则生效。 - insert，表示插入语句。  - update，表示更新语句。  - query，表示查询语句。  - command，表示命令语句。  - remove，表示删除语句。  - getmore，表示获取更多数据语句。
     * @return operationTypes
     */
    public String getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(String operationTypes) {
        this.operationTypes = operationTypes;
    }

    public KillOpRule withStatus(String status) {
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

    public KillOpRule withNamespaces(String namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    /**
     * 表命名空间。取值格式：库名.表名。同时配置多组信息时，匹配任意一组信息时规则生效 - 目前仅支持配置一组信息 - 可为空，表示不做限制。 - 单独库名，表示对某个库下的所有集合生效。 - 库名.表名，表示对具体库下的具体的集合生效。
     * @return namespaces
     */
    public String getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(String namespaces) {
        this.namespaces = namespaces;
    }

    public KillOpRule withClientIps(String clientIps) {
        this.clientIps = clientIps;
        return this;
    }

    /**
     * 客户端连接IP。只支持IPV4。可为空，表示不做限制。最多支持配置5个IP。同时配置多个IP时，匹配任意一个IP时规则生效。
     * @return clientIps
     */
    public String getClientIps() {
        return clientIps;
    }

    public void setClientIps(String clientIps) {
        this.clientIps = clientIps;
    }

    public KillOpRule withPlanSummary(String planSummary) {
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

    public KillOpRule withMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * 最大并发数。 取值： 不能为负数，可为空，默认为0，表示不做限制， 最小值为1， 最大值为100000。secs_running和max_concurrency不可同时为0。
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    public KillOpRule withSecsRunning(Integer secsRunning) {
        this.secsRunning = secsRunning;
        return this;
    }

    /**
     * 单条操作最大运行时长。取值： 不能为负数，可为空，默认为0，表示不做限制。单位：s。最小值为2， 最大值为86400。secs_running和max_concurrency不可同时为0。
     * @return secsRunning
     */
    public Integer getSecsRunning() {
        return secsRunning;
    }

    public void setSecsRunning(Integer secsRunning) {
        this.secsRunning = secsRunning;
    }

    public KillOpRule withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型。  - mongos_shard，表示同时在mongos和shard节点生效。 - mongos，表示只在集群mongos节点生效。 - shard，表示只在集群shard节点生效。 - replica，表示只在副本集节点生效。
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KillOpRule that = (KillOpRule) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.operationTypes, that.operationTypes)
            && Objects.equals(this.status, that.status) && Objects.equals(this.namespaces, that.namespaces)
            && Objects.equals(this.clientIps, that.clientIps) && Objects.equals(this.planSummary, that.planSummary)
            && Objects.equals(this.maxConcurrency, that.maxConcurrency)
            && Objects.equals(this.secsRunning, that.secsRunning) && Objects.equals(this.nodeType, that.nodeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            operationTypes,
            status,
            namespaces,
            clientIps,
            planSummary,
            maxConcurrency,
            secsRunning,
            nodeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillOpRule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operationTypes: ").append(toIndentedString(operationTypes)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
        sb.append("    clientIps: ").append(toIndentedString(clientIps)).append("\n");
        sb.append("    planSummary: ").append(toIndentedString(planSummary)).append("\n");
        sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
        sb.append("    secsRunning: ").append(toIndentedString(secsRunning)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
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
