package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateKillOpRuleRequestBody
 */
public class CreateKillOpRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_types")

    private List<String> operationTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private List<String> namespaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ips")

    private List<String> clientIps = null;

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

    public CreateKillOpRuleRequestBody withOperationTypes(List<String> operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }

    public CreateKillOpRuleRequestBody addOperationTypesItem(String operationTypesItem) {
        if (this.operationTypes == null) {
            this.operationTypes = new ArrayList<>();
        }
        this.operationTypes.add(operationTypesItem);
        return this;
    }

    public CreateKillOpRuleRequestBody withOperationTypes(Consumer<List<String>> operationTypesSetter) {
        if (this.operationTypes == null) {
            this.operationTypes = new ArrayList<>();
        }
        operationTypesSetter.accept(this.operationTypes);
        return this;
    }

    /**
     * Sql语句操作类型。 最多支持同时选择6种语句类型。同时选择多种类型时，匹配任意一种类型时规则生效。 - insert，表示插入语句。  - update，表示更新语句。  - query，表示查询语句。  - command，表示命令语句。  - remove，表示删除语句。  - getmore，表示获取更多数据语句。
     * @return operationTypes
     */
    public List<String> getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(List<String> operationTypes) {
        this.operationTypes = operationTypes;
    }

    public CreateKillOpRuleRequestBody withNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public CreateKillOpRuleRequestBody addNamespacesItem(String namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public CreateKillOpRuleRequestBody withNamespaces(Consumer<List<String>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 表命名空间。取值格式：库名.表名。同时配置多组信息时，匹配任意一组信息时规则生效。 - 目前仅支持配置一组信息 - 可为空，表示不做限制。 - 单独库名，表示对某个库下的所有集合生效。 - 库名.表名，表示对具体库下的具体的集合生效。
     * @return namespaces
     */
    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public CreateKillOpRuleRequestBody withClientIps(List<String> clientIps) {
        this.clientIps = clientIps;
        return this;
    }

    public CreateKillOpRuleRequestBody addClientIpsItem(String clientIpsItem) {
        if (this.clientIps == null) {
            this.clientIps = new ArrayList<>();
        }
        this.clientIps.add(clientIpsItem);
        return this;
    }

    public CreateKillOpRuleRequestBody withClientIps(Consumer<List<String>> clientIpsSetter) {
        if (this.clientIps == null) {
            this.clientIps = new ArrayList<>();
        }
        clientIpsSetter.accept(this.clientIps);
        return this;
    }

    /**
     * 客户端连接IP。只支持IPV4。可为空，表示不做限制。最多支持配置5个IP。同时配置多个IP时，匹配任意一个IP时规则生效。
     * @return clientIps
     */
    public List<String> getClientIps() {
        return clientIps;
    }

    public void setClientIps(List<String> clientIps) {
        this.clientIps = clientIps;
    }

    public CreateKillOpRuleRequestBody withPlanSummary(String planSummary) {
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

    public CreateKillOpRuleRequestBody withMaxConcurrency(Integer maxConcurrency) {
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

    public CreateKillOpRuleRequestBody withSecsRunning(Integer secsRunning) {
        this.secsRunning = secsRunning;
        return this;
    }

    /**
     * 单条操作最大运行时长。可为空，默认为0，表示不做限制。单位：s。最小值为2， 最大值为86400。secs_running和max_concurrency不可同时为0。
     * @return secsRunning
     */
    public Integer getSecsRunning() {
        return secsRunning;
    }

    public void setSecsRunning(Integer secsRunning) {
        this.secsRunning = secsRunning;
    }

    public CreateKillOpRuleRequestBody withNodeType(String nodeType) {
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
        CreateKillOpRuleRequestBody that = (CreateKillOpRuleRequestBody) obj;
        return Objects.equals(this.operationTypes, that.operationTypes)
            && Objects.equals(this.namespaces, that.namespaces) && Objects.equals(this.clientIps, that.clientIps)
            && Objects.equals(this.planSummary, that.planSummary)
            && Objects.equals(this.maxConcurrency, that.maxConcurrency)
            && Objects.equals(this.secsRunning, that.secsRunning) && Objects.equals(this.nodeType, that.nodeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationTypes, namespaces, clientIps, planSummary, maxConcurrency, secsRunning, nodeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKillOpRuleRequestBody {\n");
        sb.append("    operationTypes: ").append(toIndentedString(operationTypes)).append("\n");
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
