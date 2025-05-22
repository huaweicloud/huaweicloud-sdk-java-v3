package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWorkloadQueueUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_code")

    private Integer workloadResCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_str")

    private String workloadResStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private List<WorkloadQueueUser> userList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListWorkloadQueueUsersResponse withWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
        return this;
    }

    /**
     * **参数解释**： 结果状态码。 **取值范围**： 不涉及。
     * @return workloadResCode
     */
    public Integer getWorkloadResCode() {
        return workloadResCode;
    }

    public void setWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
    }

    public ListWorkloadQueueUsersResponse withWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
        return this;
    }

    /**
     * **参数解释**： 结果描述。 **取值范围**： 不涉及。
     * @return workloadResStr
     */
    public String getWorkloadResStr() {
        return workloadResStr;
    }

    public void setWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
    }

    public ListWorkloadQueueUsersResponse withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * **参数解释**： 队列名称。 **取值范围**： 不涉及。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ListWorkloadQueueUsersResponse withUserList(List<WorkloadQueueUser> userList) {
        this.userList = userList;
        return this;
    }

    public ListWorkloadQueueUsersResponse addUserListItem(WorkloadQueueUser userListItem) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public ListWorkloadQueueUsersResponse withUserList(Consumer<List<WorkloadQueueUser>> userListSetter) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        userListSetter.accept(this.userList);
        return this;
    }

    /**
     * **参数解释**： 队列用户列表。 **取值范围**： 不涉及。
     * @return userList
     */
    public List<WorkloadQueueUser> getUserList() {
        return userList;
    }

    public void setUserList(List<WorkloadQueueUser> userList) {
        this.userList = userList;
    }

    public ListWorkloadQueueUsersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 总数量。 **取值范围**： 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkloadQueueUsersResponse that = (ListWorkloadQueueUsersResponse) obj;
        return Objects.equals(this.workloadResCode, that.workloadResCode)
            && Objects.equals(this.workloadResStr, that.workloadResStr)
            && Objects.equals(this.queueName, that.queueName) && Objects.equals(this.userList, that.userList)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadResCode, workloadResStr, queueName, userList, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkloadQueueUsersResponse {\n");
        sb.append("    workloadResCode: ").append(toIndentedString(workloadResCode)).append("\n");
        sb.append("    workloadResStr: ").append(toIndentedString(workloadResStr)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
