package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 逻辑集群对象。 **取值范围**： 不涉及。
 */
public class LogicalClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_id")

    private String logicalClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_rings")

    private List<ClusterRing> clusterRings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_logical_cluster")

    private Boolean firstLogicalCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_info")

    private ActionInfo actionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_enable")

    private Boolean editEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_enable")

    private Boolean restartEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_enable")

    private Boolean deleteEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_to_elastic")

    private Boolean addToElastic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_for_killing")

    private Integer waitingForKilling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    public LogicalClusterInfo withLogicalClusterId(String logicalClusterId) {
        this.logicalClusterId = logicalClusterId;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群ID。 **取值范围**： 不涉及。
     * @return logicalClusterId
     */
    public String getLogicalClusterId() {
        return logicalClusterId;
    }

    public void setLogicalClusterId(String logicalClusterId) {
        this.logicalClusterId = logicalClusterId;
    }

    public LogicalClusterInfo withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群名称。 **取值范围**： 不涉及。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public LogicalClusterInfo withClusterRings(List<ClusterRing> clusterRings) {
        this.clusterRings = clusterRings;
        return this;
    }

    public LogicalClusterInfo addClusterRingsItem(ClusterRing clusterRingsItem) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        this.clusterRings.add(clusterRingsItem);
        return this;
    }

    public LogicalClusterInfo withClusterRings(Consumer<List<ClusterRing>> clusterRingsSetter) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        clusterRingsSetter.accept(this.clusterRings);
        return this;
    }

    /**
     * **参数解释**： 逻辑集群主机信息。 **取值范围**： 不涉及。
     * @return clusterRings
     */
    public List<ClusterRing> getClusterRings() {
        return clusterRings;
    }

    public void setClusterRings(List<ClusterRing> clusterRings) {
        this.clusterRings = clusterRings;
    }

    public LogicalClusterInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LogicalClusterInfo withFirstLogicalCluster(Boolean firstLogicalCluster) {
        this.firstLogicalCluster = firstLogicalCluster;
        return this;
    }

    /**
     * **参数解释**： 是否为第一个逻辑集群。历史版本中第1个创建或者转换的逻辑集群不能删除，因为其中包含了一些系统视图。 **取值范围**： 不涉及。
     * @return firstLogicalCluster
     */
    public Boolean getFirstLogicalCluster() {
        return firstLogicalCluster;
    }

    public void setFirstLogicalCluster(Boolean firstLogicalCluster) {
        this.firstLogicalCluster = firstLogicalCluster;
    }

    public LogicalClusterInfo withActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    public LogicalClusterInfo withActionInfo(Consumer<ActionInfo> actionInfoSetter) {
        if (this.actionInfo == null) {
            this.actionInfo = new ActionInfo();
            actionInfoSetter.accept(this.actionInfo);
        }

        return this;
    }

    /**
     * Get actionInfo
     * @return actionInfo
     */
    public ActionInfo getActionInfo() {
        return actionInfo;
    }

    public void setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
    }

    public LogicalClusterInfo withEditEnable(Boolean editEnable) {
        this.editEnable = editEnable;
        return this;
    }

    /**
     * **参数解释**： 是否允许编辑。 **取值范围**： 不涉及。
     * @return editEnable
     */
    public Boolean getEditEnable() {
        return editEnable;
    }

    public void setEditEnable(Boolean editEnable) {
        this.editEnable = editEnable;
    }

    public LogicalClusterInfo withRestartEnable(Boolean restartEnable) {
        this.restartEnable = restartEnable;
        return this;
    }

    /**
     * **参数解释**： 是否允许重启。 **取值范围**： 不涉及。
     * @return restartEnable
     */
    public Boolean getRestartEnable() {
        return restartEnable;
    }

    public void setRestartEnable(Boolean restartEnable) {
        this.restartEnable = restartEnable;
    }

    public LogicalClusterInfo withDeleteEnable(Boolean deleteEnable) {
        this.deleteEnable = deleteEnable;
        return this;
    }

    /**
     * **参数解释**： 是否允许删除。 **取值范围**： 不涉及。
     * @return deleteEnable
     */
    public Boolean getDeleteEnable() {
        return deleteEnable;
    }

    public void setDeleteEnable(Boolean deleteEnable) {
        this.deleteEnable = deleteEnable;
    }

    public LogicalClusterInfo withAddToElastic(Boolean addToElastic) {
        this.addToElastic = addToElastic;
        return this;
    }

    /**
     * **参数解释**： 是否允许弹性伸缩。 **取值范围**： 不涉及。
     * @return addToElastic
     */
    public Boolean getAddToElastic() {
        return addToElastic;
    }

    public void setAddToElastic(Boolean addToElastic) {
        this.addToElastic = addToElastic;
    }

    public LogicalClusterInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群模式。 **取值范围**： 不涉及。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public LogicalClusterInfo withWaitingForKilling(Integer waitingForKilling) {
        this.waitingForKilling = waitingForKilling;
        return this;
    }

    /**
     * **参数解释**： 作业等待时间。 **取值范围**： 不涉及。
     * @return waitingForKilling
     */
    public Integer getWaitingForKilling() {
        return waitingForKilling;
    }

    public void setWaitingForKilling(Integer waitingForKilling) {
        this.waitingForKilling = waitingForKilling;
    }

    public LogicalClusterInfo withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * **参数解释**： 集群类型。 **取值范围**： 不涉及。
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogicalClusterInfo that = (LogicalClusterInfo) obj;
        return Objects.equals(this.logicalClusterId, that.logicalClusterId)
            && Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.clusterRings, that.clusterRings) && Objects.equals(this.status, that.status)
            && Objects.equals(this.firstLogicalCluster, that.firstLogicalCluster)
            && Objects.equals(this.actionInfo, that.actionInfo) && Objects.equals(this.editEnable, that.editEnable)
            && Objects.equals(this.restartEnable, that.restartEnable)
            && Objects.equals(this.deleteEnable, that.deleteEnable)
            && Objects.equals(this.addToElastic, that.addToElastic) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.waitingForKilling, that.waitingForKilling)
            && Objects.equals(this.clusterType, that.clusterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalClusterId,
            logicalClusterName,
            clusterRings,
            status,
            firstLogicalCluster,
            actionInfo,
            editEnable,
            restartEnable,
            deleteEnable,
            addToElastic,
            mode,
            waitingForKilling,
            clusterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalClusterInfo {\n");
        sb.append("    logicalClusterId: ").append(toIndentedString(logicalClusterId)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    clusterRings: ").append(toIndentedString(clusterRings)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    firstLogicalCluster: ").append(toIndentedString(firstLogicalCluster)).append("\n");
        sb.append("    actionInfo: ").append(toIndentedString(actionInfo)).append("\n");
        sb.append("    editEnable: ").append(toIndentedString(editEnable)).append("\n");
        sb.append("    restartEnable: ").append(toIndentedString(restartEnable)).append("\n");
        sb.append("    deleteEnable: ").append(toIndentedString(deleteEnable)).append("\n");
        sb.append("    addToElastic: ").append(toIndentedString(addToElastic)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    waitingForKilling: ").append(toIndentedString(waitingForKilling)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
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
