package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：节点的标签信息。
 */
public class NodeLabels {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/cluster")

    private String osModelartsNodeCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/elastic.quota")

    private String osModelartsNodeElasticQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/nodepool")

    private String osModelartsNodeNodepool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/batch.uid")

    private String osModelartsNodeBatchUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/batch.name")

    private String osModelartsNodeBatchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/batch.type")

    private String osModelartsNodeBatchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/batch.count")

    private String osModelartsNodeBatchCount;

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
    @JsonProperty(value = "os.modelarts/billing.status")

    private String osModelartsBillingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/volcano.scheduler.cabinet-exclusive")

    private String osModelartsNodeVolcanoSchedulerCabinetExclusive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce.kubectl.kubernetes.io/cabinet")

    private String cceKubectlKubernetesIoCabinet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/underlying.instance.id")

    private String osModelartsNodeUnderlyingInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/ha.redundant.enabled")

    private String osModelartsNodeHaRedundantEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.node/nodepoolname")

    private String osModelartsNodeNodepoolname;

    public NodeLabels withOsModelartsNodeCluster(String osModelartsNodeCluster) {
        this.osModelartsNodeCluster = osModelartsNodeCluster;
        return this;
    }

    /**
     * **参数解释**：节点所在的集群名称。 **取值范围**：不涉及。
     * @return osModelartsNodeCluster
     */
    public String getOsModelartsNodeCluster() {
        return osModelartsNodeCluster;
    }

    public void setOsModelartsNodeCluster(String osModelartsNodeCluster) {
        this.osModelartsNodeCluster = osModelartsNodeCluster;
    }

    public NodeLabels withOsModelartsNodeElasticQuota(String osModelartsNodeElasticQuota) {
        this.osModelartsNodeElasticQuota = osModelartsNodeElasticQuota;
        return this;
    }

    /**
     * **参数解释**：节点绑定的逻辑池。 **取值范围**：不涉及。
     * @return osModelartsNodeElasticQuota
     */
    public String getOsModelartsNodeElasticQuota() {
        return osModelartsNodeElasticQuota;
    }

    public void setOsModelartsNodeElasticQuota(String osModelartsNodeElasticQuota) {
        this.osModelartsNodeElasticQuota = osModelartsNodeElasticQuota;
    }

    public NodeLabels withOsModelartsNodeNodepool(String osModelartsNodeNodepool) {
        this.osModelartsNodeNodepool = osModelartsNodeNodepool;
        return this;
    }

    /**
     * **参数解释**：节点所在的节点池id。 **取值范围**：不涉及。
     * @return osModelartsNodeNodepool
     */
    public String getOsModelartsNodeNodepool() {
        return osModelartsNodeNodepool;
    }

    public void setOsModelartsNodeNodepool(String osModelartsNodeNodepool) {
        this.osModelartsNodeNodepool = osModelartsNodeNodepool;
    }

    public NodeLabels withOsModelartsNodeBatchUid(String osModelartsNodeBatchUid) {
        this.osModelartsNodeBatchUid = osModelartsNodeBatchUid;
        return this;
    }

    /**
     * **参数解释**：批量创建批次标识。 **取值范围**：不涉及。
     * @return osModelartsNodeBatchUid
     */
    public String getOsModelartsNodeBatchUid() {
        return osModelartsNodeBatchUid;
    }

    public void setOsModelartsNodeBatchUid(String osModelartsNodeBatchUid) {
        this.osModelartsNodeBatchUid = osModelartsNodeBatchUid;
    }

    public NodeLabels withOsModelartsNodeBatchName(String osModelartsNodeBatchName) {
        this.osModelartsNodeBatchName = osModelartsNodeBatchName;
        return this;
    }

    /**
     * **参数解释**：批量创建批次名称。 **取值范围**：不涉及。
     * @return osModelartsNodeBatchName
     */
    public String getOsModelartsNodeBatchName() {
        return osModelartsNodeBatchName;
    }

    public void setOsModelartsNodeBatchName(String osModelartsNodeBatchName) {
        this.osModelartsNodeBatchName = osModelartsNodeBatchName;
    }

    public NodeLabels withOsModelartsNodeBatchType(String osModelartsNodeBatchType) {
        this.osModelartsNodeBatchType = osModelartsNodeBatchType;
        return this;
    }

    /**
     * **参数解释**：批量创建批次类型。 **取值范围**：可选值如下：   - hyperinstance：超节点。
     * @return osModelartsNodeBatchType
     */
    public String getOsModelartsNodeBatchType() {
        return osModelartsNodeBatchType;
    }

    public void setOsModelartsNodeBatchType(String osModelartsNodeBatchType) {
        this.osModelartsNodeBatchType = osModelartsNodeBatchType;
    }

    public NodeLabels withOsModelartsNodeBatchCount(String osModelartsNodeBatchCount) {
        this.osModelartsNodeBatchCount = osModelartsNodeBatchCount;
        return this;
    }

    /**
     * **参数解释**：批量创建的节点个数。 **取值范围**：不涉及。
     * @return osModelartsNodeBatchCount
     */
    public String getOsModelartsNodeBatchCount() {
        return osModelartsNodeBatchCount;
    }

    public void setOsModelartsNodeBatchCount(String osModelartsNodeBatchCount) {
        this.osModelartsNodeBatchCount = osModelartsNodeBatchCount;
    }

    public NodeLabels withOsModelartsResourceId(String osModelartsResourceId) {
        this.osModelartsResourceId = osModelartsResourceId;
        return this;
    }

    /**
     * **参数解释**：节点的资源id。 **取值范围**：不涉及。
     * @return osModelartsResourceId
     */
    public String getOsModelartsResourceId() {
        return osModelartsResourceId;
    }

    public void setOsModelartsResourceId(String osModelartsResourceId) {
        this.osModelartsResourceId = osModelartsResourceId;
    }

    public NodeLabels withOsModelartsTenantDomainId(String osModelartsTenantDomainId) {
        this.osModelartsTenantDomainId = osModelartsTenantDomainId;
        return this;
    }

    /**
     * **参数解释**：节点的租户id，记录节点创建在哪个租户账号下。 **取值范围**：不涉及。
     * @return osModelartsTenantDomainId
     */
    public String getOsModelartsTenantDomainId() {
        return osModelartsTenantDomainId;
    }

    public void setOsModelartsTenantDomainId(String osModelartsTenantDomainId) {
        this.osModelartsTenantDomainId = osModelartsTenantDomainId;
    }

    public NodeLabels withOsModelartsTenantProjectId(String osModelartsTenantProjectId) {
        this.osModelartsTenantProjectId = osModelartsTenantProjectId;
        return this;
    }

    /**
     * **参数解释**：节点的项目id，记录节点创建在租户账号下哪个项目中。 **取值范围**：不涉及。
     * @return osModelartsTenantProjectId
     */
    public String getOsModelartsTenantProjectId() {
        return osModelartsTenantProjectId;
    }

    public void setOsModelartsTenantProjectId(String osModelartsTenantProjectId) {
        this.osModelartsTenantProjectId = osModelartsTenantProjectId;
    }

    public NodeLabels withOsModelartsBillingStatus(String osModelartsBillingStatus) {
        this.osModelartsBillingStatus = osModelartsBillingStatus;
        return this;
    }

    /**
     * **参数解释**：节点计费状态。 **取值范围**：可选值如下： - 0：正常状态。 - 1：冻结状态。 - 2：删除状态或者终止状态。
     * @return osModelartsBillingStatus
     */
    public String getOsModelartsBillingStatus() {
        return osModelartsBillingStatus;
    }

    public void setOsModelartsBillingStatus(String osModelartsBillingStatus) {
        this.osModelartsBillingStatus = osModelartsBillingStatus;
    }

    public NodeLabels withOsModelartsNodeVolcanoSchedulerCabinetExclusive(
        String osModelartsNodeVolcanoSchedulerCabinetExclusive) {
        this.osModelartsNodeVolcanoSchedulerCabinetExclusive = osModelartsNodeVolcanoSchedulerCabinetExclusive;
        return this;
    }

    /**
     * **参数解释**：标识该节点是否被整柜作业独占。当被某个整柜作业独占时，该标签存在，标签的值为独占的训练作业ID。 **取值范围**：不涉及。
     * @return osModelartsNodeVolcanoSchedulerCabinetExclusive
     */
    public String getOsModelartsNodeVolcanoSchedulerCabinetExclusive() {
        return osModelartsNodeVolcanoSchedulerCabinetExclusive;
    }

    public void setOsModelartsNodeVolcanoSchedulerCabinetExclusive(
        String osModelartsNodeVolcanoSchedulerCabinetExclusive) {
        this.osModelartsNodeVolcanoSchedulerCabinetExclusive = osModelartsNodeVolcanoSchedulerCabinetExclusive;
    }

    public NodeLabels withCceKubectlKubernetesIoCabinet(String cceKubectlKubernetesIoCabinet) {
        this.cceKubectlKubernetesIoCabinet = cceKubectlKubernetesIoCabinet;
        return this;
    }

    /**
     * **参数解释**：节点所在tor交换机ip。多个tor交换机ip之间以中划线-分隔。 **取值范围**：不涉及。
     * @return cceKubectlKubernetesIoCabinet
     */
    public String getCceKubectlKubernetesIoCabinet() {
        return cceKubectlKubernetesIoCabinet;
    }

    public void setCceKubectlKubernetesIoCabinet(String cceKubectlKubernetesIoCabinet) {
        this.cceKubectlKubernetesIoCabinet = cceKubectlKubernetesIoCabinet;
    }

    public NodeLabels withOsModelartsNodeUnderlyingInstanceId(String osModelartsNodeUnderlyingInstanceId) {
        this.osModelartsNodeUnderlyingInstanceId = osModelartsNodeUnderlyingInstanceId;
        return this;
    }

    /**
     * **参数解释**：节点底层资源的实例ID，如超节点的ECS实例ID。 **取值范围**：不涉及。
     * @return osModelartsNodeUnderlyingInstanceId
     */
    public String getOsModelartsNodeUnderlyingInstanceId() {
        return osModelartsNodeUnderlyingInstanceId;
    }

    public void setOsModelartsNodeUnderlyingInstanceId(String osModelartsNodeUnderlyingInstanceId) {
        this.osModelartsNodeUnderlyingInstanceId = osModelartsNodeUnderlyingInstanceId;
    }

    public NodeLabels withOsModelartsNodeHaRedundantEnabled(String osModelartsNodeHaRedundantEnabled) {
        this.osModelartsNodeHaRedundantEnabled = osModelartsNodeHaRedundantEnabled;
        return this;
    }

    /**
     * **参数解释**：节点是否启用高可用冗余。 **取值范围**：   - true：开启   - false：未开启
     * @return osModelartsNodeHaRedundantEnabled
     */
    public String getOsModelartsNodeHaRedundantEnabled() {
        return osModelartsNodeHaRedundantEnabled;
    }

    public void setOsModelartsNodeHaRedundantEnabled(String osModelartsNodeHaRedundantEnabled) {
        this.osModelartsNodeHaRedundantEnabled = osModelartsNodeHaRedundantEnabled;
    }

    public NodeLabels withOsModelartsNodeNodepoolname(String osModelartsNodeNodepoolname) {
        this.osModelartsNodeNodepoolname = osModelartsNodeNodepoolname;
        return this;
    }

    /**
     * **参数解释**：节点所在的节点池名称,最小长度为2，最大长度为50的小写字母、中划线-、数字组成，由小写字母开头，不能 以-，-default结尾。 **取值范围**：不涉及。
     * @return osModelartsNodeNodepoolname
     */
    public String getOsModelartsNodeNodepoolname() {
        return osModelartsNodeNodepoolname;
    }

    public void setOsModelartsNodeNodepoolname(String osModelartsNodeNodepoolname) {
        this.osModelartsNodeNodepoolname = osModelartsNodeNodepoolname;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeLabels that = (NodeLabels) obj;
        return Objects.equals(this.osModelartsNodeCluster, that.osModelartsNodeCluster)
            && Objects.equals(this.osModelartsNodeElasticQuota, that.osModelartsNodeElasticQuota)
            && Objects.equals(this.osModelartsNodeNodepool, that.osModelartsNodeNodepool)
            && Objects.equals(this.osModelartsNodeBatchUid, that.osModelartsNodeBatchUid)
            && Objects.equals(this.osModelartsNodeBatchName, that.osModelartsNodeBatchName)
            && Objects.equals(this.osModelartsNodeBatchType, that.osModelartsNodeBatchType)
            && Objects.equals(this.osModelartsNodeBatchCount, that.osModelartsNodeBatchCount)
            && Objects.equals(this.osModelartsResourceId, that.osModelartsResourceId)
            && Objects.equals(this.osModelartsTenantDomainId, that.osModelartsTenantDomainId)
            && Objects.equals(this.osModelartsTenantProjectId, that.osModelartsTenantProjectId)
            && Objects.equals(this.osModelartsBillingStatus, that.osModelartsBillingStatus)
            && Objects.equals(this.osModelartsNodeVolcanoSchedulerCabinetExclusive,
                that.osModelartsNodeVolcanoSchedulerCabinetExclusive)
            && Objects.equals(this.cceKubectlKubernetesIoCabinet, that.cceKubectlKubernetesIoCabinet)
            && Objects.equals(this.osModelartsNodeUnderlyingInstanceId, that.osModelartsNodeUnderlyingInstanceId)
            && Objects.equals(this.osModelartsNodeHaRedundantEnabled, that.osModelartsNodeHaRedundantEnabled)
            && Objects.equals(this.osModelartsNodeNodepoolname, that.osModelartsNodeNodepoolname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsNodeCluster,
            osModelartsNodeElasticQuota,
            osModelartsNodeNodepool,
            osModelartsNodeBatchUid,
            osModelartsNodeBatchName,
            osModelartsNodeBatchType,
            osModelartsNodeBatchCount,
            osModelartsResourceId,
            osModelartsTenantDomainId,
            osModelartsTenantProjectId,
            osModelartsBillingStatus,
            osModelartsNodeVolcanoSchedulerCabinetExclusive,
            cceKubectlKubernetesIoCabinet,
            osModelartsNodeUnderlyingInstanceId,
            osModelartsNodeHaRedundantEnabled,
            osModelartsNodeNodepoolname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeLabels {\n");
        sb.append("    osModelartsNodeCluster: ").append(toIndentedString(osModelartsNodeCluster)).append("\n");
        sb.append("    osModelartsNodeElasticQuota: ")
            .append(toIndentedString(osModelartsNodeElasticQuota))
            .append("\n");
        sb.append("    osModelartsNodeNodepool: ").append(toIndentedString(osModelartsNodeNodepool)).append("\n");
        sb.append("    osModelartsNodeBatchUid: ").append(toIndentedString(osModelartsNodeBatchUid)).append("\n");
        sb.append("    osModelartsNodeBatchName: ").append(toIndentedString(osModelartsNodeBatchName)).append("\n");
        sb.append("    osModelartsNodeBatchType: ").append(toIndentedString(osModelartsNodeBatchType)).append("\n");
        sb.append("    osModelartsNodeBatchCount: ").append(toIndentedString(osModelartsNodeBatchCount)).append("\n");
        sb.append("    osModelartsResourceId: ").append(toIndentedString(osModelartsResourceId)).append("\n");
        sb.append("    osModelartsTenantDomainId: ").append(toIndentedString(osModelartsTenantDomainId)).append("\n");
        sb.append("    osModelartsTenantProjectId: ").append(toIndentedString(osModelartsTenantProjectId)).append("\n");
        sb.append("    osModelartsBillingStatus: ").append(toIndentedString(osModelartsBillingStatus)).append("\n");
        sb.append("    osModelartsNodeVolcanoSchedulerCabinetExclusive: ")
            .append(toIndentedString(osModelartsNodeVolcanoSchedulerCabinetExclusive))
            .append("\n");
        sb.append("    cceKubectlKubernetesIoCabinet: ")
            .append(toIndentedString(cceKubectlKubernetesIoCabinet))
            .append("\n");
        sb.append("    osModelartsNodeUnderlyingInstanceId: ")
            .append(toIndentedString(osModelartsNodeUnderlyingInstanceId))
            .append("\n");
        sb.append("    osModelartsNodeHaRedundantEnabled: ")
            .append(toIndentedString(osModelartsNodeHaRedundantEnabled))
            .append("\n");
        sb.append("    osModelartsNodeNodepoolname: ")
            .append(toIndentedString(osModelartsNodeNodepoolname))
            .append("\n");
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
