package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 提交逻辑集群定时增删计划请求。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class LogicalClusterPlanBo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_logical_cluster")

    private String mainLogicalCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_type")

    private String planType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<LogicalClusterPlanActionsParam> actions = null;

    public LogicalClusterPlanBo withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群名字。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public LogicalClusterPlanBo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群绑定的用户，若绑定了主逻辑集群，不能绑定用户。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LogicalClusterPlanBo withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群节点的个数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public LogicalClusterPlanBo withMainLogicalCluster(String mainLogicalCluster) {
        this.mainLogicalCluster = mainLogicalCluster;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群的绑定的主逻辑集群，若绑定了用户，不能绑定主逻辑集群。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return mainLogicalCluster
     */
    public String getMainLogicalCluster() {
        return mainLogicalCluster;
    }

    public void setMainLogicalCluster(String mainLogicalCluster) {
        this.mainLogicalCluster = mainLogicalCluster;
    }

    public LogicalClusterPlanBo withPlanType(String planType) {
        this.planType = planType;
        return this;
    }

    /**
     * **参数解释**： 计划类型，取值范围为(once|periodicity)。 **约束限制**： 不涉及。 **取值范围**： once：一次性计划 periodicity：周期性计划 **默认取值**： 不涉及。
     * @return planType
     */
    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public LogicalClusterPlanBo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群定时增删计划起始时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public LogicalClusterPlanBo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群定时增删计划终止时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public LogicalClusterPlanBo withActions(List<LogicalClusterPlanActionsParam> actions) {
        this.actions = actions;
        return this;
    }

    public LogicalClusterPlanBo addActionsItem(LogicalClusterPlanActionsParam actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public LogicalClusterPlanBo withActions(Consumer<List<LogicalClusterPlanActionsParam>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释**： 逻辑集群定时增删计划细节。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return actions
     */
    public List<LogicalClusterPlanActionsParam> getActions() {
        return actions;
    }

    public void setActions(List<LogicalClusterPlanActionsParam> actions) {
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
        LogicalClusterPlanBo that = (LogicalClusterPlanBo) obj;
        return Objects.equals(this.logicalClusterName, that.logicalClusterName) && Objects.equals(this.user, that.user)
            && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.mainLogicalCluster, that.mainLogicalCluster)
            && Objects.equals(this.planType, that.planType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(logicalClusterName, user, nodeNum, mainLogicalCluster, planType, startTime, endTime, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalClusterPlanBo {\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    mainLogicalCluster: ").append(toIndentedString(mainLogicalCluster)).append("\n");
        sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
