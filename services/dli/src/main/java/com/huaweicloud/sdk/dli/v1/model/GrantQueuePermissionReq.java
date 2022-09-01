package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 队列赋权的请求参数。
 */
public class GrantQueuePermissionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    @JacksonXmlProperty(localName = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    @JacksonXmlProperty(localName = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    @JacksonXmlProperty(localName = "privileges")

    private List<String> privileges = null;

    public GrantQueuePermissionReq withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public GrantQueuePermissionReq withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 被赋权用户名称。给该用户赋使用队列的权限，回收其使用权限，或者更新其使用权限。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public GrantQueuePermissionReq withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 指定赋权或回收。值为：grant，revoke或update。当用户同时拥有grant和revoke权限的时候才有权限使用update操作。 grant：赋权。 revoke：回收权限。 update：清空原来的所有权限，赋予本次提供的权限数组中的权限。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public GrantQueuePermissionReq withPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public GrantQueuePermissionReq addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public GrantQueuePermissionReq withPrivileges(Consumer<List<String>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 待赋权、回收或更新的权限列表。可操作的权限可以是以下三种权限中的一种或多种。 SUBMIT_JOB：提交作业 CANCEL_JOB ：取消作业 DROP_QUEUE ：删除队列 说明： 若需更新的权限列表为空，则表示回收用户在该队列的所有权限。
     * @return privileges
     */
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GrantQueuePermissionReq grantQueuePermissionReq = (GrantQueuePermissionReq) o;
        return Objects.equals(this.queueName, grantQueuePermissionReq.queueName)
            && Objects.equals(this.userName, grantQueuePermissionReq.userName)
            && Objects.equals(this.action, grantQueuePermissionReq.action)
            && Objects.equals(this.privileges, grantQueuePermissionReq.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, userName, action, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrantQueuePermissionReq {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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
