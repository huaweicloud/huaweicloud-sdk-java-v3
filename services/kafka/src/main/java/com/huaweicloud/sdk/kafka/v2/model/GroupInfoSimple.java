package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupInfoSimple
 */
public class GroupInfoSimple {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinator_id")

    private Integer coordinatorId;

    public GroupInfoSimple withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 消费组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public GroupInfoSimple withState(String state) {
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

    public GroupInfoSimple withCoordinatorId(Integer coordinatorId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GroupInfoSimple groupInfoSimple = (GroupInfoSimple) o;
        return Objects.equals(this.groupId, groupInfoSimple.groupId)
            && Objects.equals(this.state, groupInfoSimple.state)
            && Objects.equals(this.coordinatorId, groupInfoSimple.coordinatorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, state, coordinatorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupInfoSimple {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    coordinatorId: ").append(toIndentedString(coordinatorId)).append("\n");
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
