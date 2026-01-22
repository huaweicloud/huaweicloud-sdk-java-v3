package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 消费组信息。
 */
public class DescribeGroupsRespGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdAt")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinator_id")

    private Integer coordinatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignment_strategy")

    private String assignmentStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_desc")

    private String groupDesc;

    public DescribeGroupsRespGroup withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**： 消费组状态。 **取值范围**： - Dead：消费组内没有任何成员，且没有任何元数据。 - Empty：消费组内没有任何成员，存在元数据。 - PreparingRebalance：准备开启rebalance。 - CompletingRebalance：所有成员加入group。 - Stable：消费组内成员可正常消费。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public DescribeGroupsRespGroup withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public DescribeGroupsRespGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 消费组名称。 **取值范围**： 不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DescribeGroupsRespGroup withCoordinatorId(Integer coordinatorId) {
        this.coordinatorId = coordinatorId;
        return this;
    }

    /**
     * **参数解释**： 协调器编号。 **取值范围**： 不涉及。
     * @return coordinatorId
     */
    public Integer getCoordinatorId() {
        return coordinatorId;
    }

    public void setCoordinatorId(Integer coordinatorId) {
        this.coordinatorId = coordinatorId;
    }

    public DescribeGroupsRespGroup withAssignmentStrategy(String assignmentStrategy) {
        this.assignmentStrategy = assignmentStrategy;
        return this;
    }

    /**
     * **参数解释**： 分区分配策略。 **取值范围**： 不涉及。
     * @return assignmentStrategy
     */
    public String getAssignmentStrategy() {
        return assignmentStrategy;
    }

    public void setAssignmentStrategy(String assignmentStrategy) {
        this.assignmentStrategy = assignmentStrategy;
    }

    public DescribeGroupsRespGroup withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * **参数解释**： 消费组描述。 **取值范围**： 不涉及。
     * @return groupDesc
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeGroupsRespGroup that = (DescribeGroupsRespGroup) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.coordinatorId, that.coordinatorId)
            && Objects.equals(this.assignmentStrategy, that.assignmentStrategy)
            && Objects.equals(this.groupDesc, that.groupDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, createdAt, groupId, coordinatorId, assignmentStrategy, groupDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeGroupsRespGroup {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    coordinatorId: ").append(toIndentedString(coordinatorId)).append("\n");
        sb.append("    assignmentStrategy: ").append(toIndentedString(assignmentStrategy)).append("\n");
        sb.append("    groupDesc: ").append(toIndentedString(groupDesc)).append("\n");
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
