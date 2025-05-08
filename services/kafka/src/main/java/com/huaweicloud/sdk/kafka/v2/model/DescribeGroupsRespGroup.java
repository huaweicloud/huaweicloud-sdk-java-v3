package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 消费组信息。
 */
public class DescribeGroupsRespGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinator_id")

    private Integer coordinatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<DescribeGroupsRespGroupMembers> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_message_offsets")

    private List<ShowGroupsRespGroupGroupMessageOffsets> groupMessageOffsets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignment_strategy")

    private String assignmentStrategy;

    public DescribeGroupsRespGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 消费组名称。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DescribeGroupsRespGroup withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 消费组状态。包含以下状态： - Dead：消费组内没有任何成员，且没有任何元数据。 - Empty：消费组内没有任何成员，存在元数据。 - PreparingRebalance：准备开启rebalance。 - CompletingRebalance：所有成员加入group。 - Stable：消费组内成员可正常消费。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public DescribeGroupsRespGroup withCoordinatorId(Integer coordinatorId) {
        this.coordinatorId = coordinatorId;
        return this;
    }

    /**
     * 协调器编号。
     * @return coordinatorId
     */
    public Integer getCoordinatorId() {
        return coordinatorId;
    }

    public void setCoordinatorId(Integer coordinatorId) {
        this.coordinatorId = coordinatorId;
    }

    public DescribeGroupsRespGroup withMembers(List<DescribeGroupsRespGroupMembers> members) {
        this.members = members;
        return this;
    }

    public DescribeGroupsRespGroup addMembersItem(DescribeGroupsRespGroupMembers membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public DescribeGroupsRespGroup withMembers(Consumer<List<DescribeGroupsRespGroupMembers>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 消费者列表。
     * @return members
     */
    public List<DescribeGroupsRespGroupMembers> getMembers() {
        return members;
    }

    public void setMembers(List<DescribeGroupsRespGroupMembers> members) {
        this.members = members;
    }

    public DescribeGroupsRespGroup withGroupMessageOffsets(
        List<ShowGroupsRespGroupGroupMessageOffsets> groupMessageOffsets) {
        this.groupMessageOffsets = groupMessageOffsets;
        return this;
    }

    public DescribeGroupsRespGroup addGroupMessageOffsetsItem(
        ShowGroupsRespGroupGroupMessageOffsets groupMessageOffsetsItem) {
        if (this.groupMessageOffsets == null) {
            this.groupMessageOffsets = new ArrayList<>();
        }
        this.groupMessageOffsets.add(groupMessageOffsetsItem);
        return this;
    }

    public DescribeGroupsRespGroup withGroupMessageOffsets(
        Consumer<List<ShowGroupsRespGroupGroupMessageOffsets>> groupMessageOffsetsSetter) {
        if (this.groupMessageOffsets == null) {
            this.groupMessageOffsets = new ArrayList<>();
        }
        groupMessageOffsetsSetter.accept(this.groupMessageOffsets);
        return this;
    }

    /**
     * 消费进度。
     * @return groupMessageOffsets
     */
    public List<ShowGroupsRespGroupGroupMessageOffsets> getGroupMessageOffsets() {
        return groupMessageOffsets;
    }

    public void setGroupMessageOffsets(List<ShowGroupsRespGroupGroupMessageOffsets> groupMessageOffsets) {
        this.groupMessageOffsets = groupMessageOffsets;
    }

    public DescribeGroupsRespGroup withAssignmentStrategy(String assignmentStrategy) {
        this.assignmentStrategy = assignmentStrategy;
        return this;
    }

    /**
     * 分区分配策略。
     * @return assignmentStrategy
     */
    public String getAssignmentStrategy() {
        return assignmentStrategy;
    }

    public void setAssignmentStrategy(String assignmentStrategy) {
        this.assignmentStrategy = assignmentStrategy;
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
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.coordinatorId, that.coordinatorId) && Objects.equals(this.members, that.members)
            && Objects.equals(this.groupMessageOffsets, that.groupMessageOffsets)
            && Objects.equals(this.assignmentStrategy, that.assignmentStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, state, coordinatorId, members, groupMessageOffsets, assignmentStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeGroupsRespGroup {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    coordinatorId: ").append(toIndentedString(coordinatorId)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    groupMessageOffsets: ").append(toIndentedString(groupMessageOffsets)).append("\n");
        sb.append("    assignmentStrategy: ").append(toIndentedString(assignmentStrategy)).append("\n");
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
