package com.huaweicloud.sdk.drs.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.QueryRoleDetailResp;
import com.huaweicloud.sdk.drs.v3.model.QueryUserDetailResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListUsersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_global_password")
    
    private String isGlobalPassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_list")
    
    private List<QueryUserDetailResp> userList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roles_list")
    
    private List<QueryRoleDetailResp> rolesList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_success")
    
    private Boolean isSuccess;

    public ListUsersResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public ListUsersResponse withIsGlobalPassword(String isGlobalPassword) {
        this.isGlobalPassword = isGlobalPassword;
        return this;
    }

    


    /**
     * 是否使用全局密码
     * @return isGlobalPassword
     */
    public String getIsGlobalPassword() {
        return isGlobalPassword;
    }

    public void setIsGlobalPassword(String isGlobalPassword) {
        this.isGlobalPassword = isGlobalPassword;
    }

    

    public ListUsersResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 错误码
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

    public ListUsersResponse withUserList(List<QueryUserDetailResp> userList) {
        this.userList = userList;
        return this;
    }

    
    public ListUsersResponse addUserListItem(QueryUserDetailResp userListItem) {
        if(this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public ListUsersResponse withUserList(Consumer<List<QueryUserDetailResp>> userListSetter) {
        if(this.userList == null) {
            this.userList = new ArrayList<>();
        }
        userListSetter.accept(this.userList);
        return this;
    }

    /**
     * 用户列表数据
     * @return userList
     */
    public List<QueryUserDetailResp> getUserList() {
        return userList;
    }

    public void setUserList(List<QueryUserDetailResp> userList) {
        this.userList = userList;
    }

    

    public ListUsersResponse withRolesList(List<QueryRoleDetailResp> rolesList) {
        this.rolesList = rolesList;
        return this;
    }

    
    public ListUsersResponse addRolesListItem(QueryRoleDetailResp rolesListItem) {
        if(this.rolesList == null) {
            this.rolesList = new ArrayList<>();
        }
        this.rolesList.add(rolesListItem);
        return this;
    }

    public ListUsersResponse withRolesList(Consumer<List<QueryRoleDetailResp>> rolesListSetter) {
        if(this.rolesList == null) {
            this.rolesList = new ArrayList<>();
        }
        rolesListSetter.accept(this.rolesList);
        return this;
    }

    /**
     * 角色列表数据
     * @return rolesList
     */
    public List<QueryRoleDetailResp> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<QueryRoleDetailResp> rolesList) {
        this.rolesList = rolesList;
    }

    

    public ListUsersResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    


    /**
     * 是否成功
     * @return isSuccess
     */
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
        ListUsersResponse listUsersResponse = (ListUsersResponse) o;
        return Objects.equals(this.jobId, listUsersResponse.jobId) &&
            Objects.equals(this.isGlobalPassword, listUsersResponse.isGlobalPassword) &&
            Objects.equals(this.message, listUsersResponse.message) &&
            Objects.equals(this.userList, listUsersResponse.userList) &&
            Objects.equals(this.rolesList, listUsersResponse.rolesList) &&
            Objects.equals(this.isSuccess, listUsersResponse.isSuccess);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, isGlobalPassword, message, userList, rolesList, isSuccess);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    isGlobalPassword: ").append(toIndentedString(isGlobalPassword)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    rolesList: ").append(toIndentedString(rolesList)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
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

