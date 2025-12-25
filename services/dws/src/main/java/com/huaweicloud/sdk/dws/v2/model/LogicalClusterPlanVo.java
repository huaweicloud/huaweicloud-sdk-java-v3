package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 逻辑集群增删计划对象。 **取值范围**： 不涉及。
 */
public class LogicalClusterPlanVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_type")

    private String planType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<LogicalClusterPlanActions> actions = null;

    public LogicalClusterPlanVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 增删逻辑集群计划ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LogicalClusterPlanVo withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群名字。 **取值范围**： 不涉及。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public LogicalClusterPlanVo withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群节点个数。 **取值范围**： 不涉及。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public LogicalClusterPlanVo withPlanType(String planType) {
        this.planType = planType;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群增删计划类型，取值范围为 (once|periodicity)，表示单次或周期性。 **取值范围**： 不涉及。
     * @return planType
     */
    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public LogicalClusterPlanVo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群增删计划状态。 **取值范围**： - running：运行中。 - waiting：等待中。 - deleted：已删除。 - finished：已完成。 - disabled：已禁用。 - failed：失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LogicalClusterPlanVo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群增删计划开始时间。 **取值范围**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public LogicalClusterPlanVo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群增删计划结束时间。 **取值范围**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public LogicalClusterPlanVo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群增删计划更新时间。 **取值范围**： 不涉及。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public LogicalClusterPlanVo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群增删计划绑定的用户。 **取值范围**： 不涉及。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LogicalClusterPlanVo withActions(List<LogicalClusterPlanActions> actions) {
        this.actions = actions;
        return this;
    }

    public LogicalClusterPlanVo addActionsItem(LogicalClusterPlanActions actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public LogicalClusterPlanVo withActions(Consumer<List<LogicalClusterPlanActions>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释**： 任务信息。 **取值范围**： 不涉及。
     * @return actions
     */
    public List<LogicalClusterPlanActions> getActions() {
        return actions;
    }

    public void setActions(List<LogicalClusterPlanActions> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogicalClusterPlanVo that = (LogicalClusterPlanVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.planType, that.planType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.user, that.user) && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, logicalClusterName, nodeNum, planType, status, startTime, endTime, updateTime, user, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalClusterPlanVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
