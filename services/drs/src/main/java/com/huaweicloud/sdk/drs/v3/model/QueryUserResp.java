package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 迁移用户响应体 */
public class QueryUserResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_global_password")

    private String isGlobalPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private List<QueryUserDetailResp> userList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles_list")

    private List<QueryRoleDetailResp> rolesList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    public QueryUserResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务id
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryUserResp withIsGlobalPassword(String isGlobalPassword) {
        this.isGlobalPassword = isGlobalPassword;
        return this;
    }

    /** 是否使用全局密码
     * 
     * @return isGlobalPassword */
    public String getIsGlobalPassword() {
        return isGlobalPassword;
    }

    public void setIsGlobalPassword(String isGlobalPassword) {
        this.isGlobalPassword = isGlobalPassword;
    }

    public QueryUserResp withMessage(String message) {
        this.message = message;
        return this;
    }

    /** 错误码
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public QueryUserResp withUserList(List<QueryUserDetailResp> userList) {
        this.userList = userList;
        return this;
    }

    public QueryUserResp addUserListItem(QueryUserDetailResp userListItem) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public QueryUserResp withUserList(Consumer<List<QueryUserDetailResp>> userListSetter) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        userListSetter.accept(this.userList);
        return this;
    }

    /** 用户列表数据
     * 
     * @return userList */
    public List<QueryUserDetailResp> getUserList() {
        return userList;
    }

    public void setUserList(List<QueryUserDetailResp> userList) {
        this.userList = userList;
    }

    public QueryUserResp withRolesList(List<QueryRoleDetailResp> rolesList) {
        this.rolesList = rolesList;
        return this;
    }

    public QueryUserResp addRolesListItem(QueryRoleDetailResp rolesListItem) {
        if (this.rolesList == null) {
            this.rolesList = new ArrayList<>();
        }
        this.rolesList.add(rolesListItem);
        return this;
    }

    public QueryUserResp withRolesList(Consumer<List<QueryRoleDetailResp>> rolesListSetter) {
        if (this.rolesList == null) {
            this.rolesList = new ArrayList<>();
        }
        rolesListSetter.accept(this.rolesList);
        return this;
    }

    /** 角色列表数据
     * 
     * @return rolesList */
    public List<QueryRoleDetailResp> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<QueryRoleDetailResp> rolesList) {
        this.rolesList = rolesList;
    }

    public QueryUserResp withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /** 是否成功
     * 
     * @return isSuccess */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryUserResp queryUserResp = (QueryUserResp) o;
        return Objects.equals(this.jobId, queryUserResp.jobId)
            && Objects.equals(this.isGlobalPassword, queryUserResp.isGlobalPassword)
            && Objects.equals(this.message, queryUserResp.message)
            && Objects.equals(this.userList, queryUserResp.userList)
            && Objects.equals(this.rolesList, queryUserResp.rolesList)
            && Objects.equals(this.isSuccess, queryUserResp.isSuccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, isGlobalPassword, message, userList, rolesList, isSuccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryUserResp {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    isGlobalPassword: ").append(toIndentedString(isGlobalPassword)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    rolesList: ").append(toIndentedString(rolesList)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
