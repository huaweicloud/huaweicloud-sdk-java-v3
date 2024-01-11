package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源队列用户。
 */
public class WorkloadQueueUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private List<WorkloadQueueUserReqUserList> userList = null;

    public WorkloadQueueUserReq withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 工作队列名称。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public WorkloadQueueUserReq withUserList(List<WorkloadQueueUserReqUserList> userList) {
        this.userList = userList;
        return this;
    }

    public WorkloadQueueUserReq addUserListItem(WorkloadQueueUserReqUserList userListItem) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public WorkloadQueueUserReq withUserList(Consumer<List<WorkloadQueueUserReqUserList>> userListSetter) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        userListSetter.accept(this.userList);
        return this;
    }

    /**
     * 资源队列用户列表
     * @return userList
     */
    public List<WorkloadQueueUserReqUserList> getUserList() {
        return userList;
    }

    public void setUserList(List<WorkloadQueueUserReqUserList> userList) {
        this.userList = userList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadQueueUserReq that = (WorkloadQueueUserReq) obj;
        return Objects.equals(this.queueName, that.queueName) && Objects.equals(this.userList, that.userList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, userList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadQueueUserReq {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
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
