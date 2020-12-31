package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.UserAccountVO;
import com.huaweicloud.sdk.drs.v3.model.UserRoleVO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新迁移用户请求体
 */
public class UpdateUserReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="list")
    
    private List<UserAccountVO> list = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_roles")
    
    private List<UserRoleVO> userRoles = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_set_password")
    
    private Boolean isSetPassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_migrate_user")
    
    private Boolean isMigrateUser;

    public UpdateUserReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public UpdateUserReq withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 全局密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UpdateUserReq withList(List<UserAccountVO> list) {
        this.list = list;
        return this;
    }

    
    public UpdateUserReq addListItem(UserAccountVO listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public UpdateUserReq withList(Consumer<List<UserAccountVO>> listSetter) {
        if(this.list == null ){
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 用户迁移信息，迁移用户时必填
     * @return list
     */
    public List<UserAccountVO> getList() {
        return list;
    }

    public void setList(List<UserAccountVO> list) {
        this.list = list;
    }

    public UpdateUserReq withUserRoles(List<UserRoleVO> userRoles) {
        this.userRoles = userRoles;
        return this;
    }

    
    public UpdateUserReq addUserRolesItem(UserRoleVO userRolesItem) {
        if (this.userRoles == null) {
            this.userRoles = new ArrayList<>();
        }
        this.userRoles.add(userRolesItem);
        return this;
    }

    public UpdateUserReq withUserRoles(Consumer<List<UserRoleVO>> userRolesSetter) {
        if(this.userRoles == null ){
            this.userRoles = new ArrayList<>();
        }
        userRolesSetter.accept(this.userRoles);
        return this;
    }

    /**
     * 角色迁移信息，迁移用户时必填
     * @return userRoles
     */
    public List<UserRoleVO> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRoleVO> userRoles) {
        this.userRoles = userRoles;
    }

    public UpdateUserReq withIsSetPassword(Boolean isSetPassword) {
        this.isSetPassword = isSetPassword;
        return this;
    }

    


    /**
     * 是否设置密码
     * @return isSetPassword
     */
    public Boolean getIsSetPassword() {
        return isSetPassword;
    }

    public void setIsSetPassword(Boolean isSetPassword) {
        this.isSetPassword = isSetPassword;
    }

    public UpdateUserReq withIsMigrateUser(Boolean isMigrateUser) {
        this.isMigrateUser = isMigrateUser;
        return this;
    }

    


    /**
     * 是否迁移用户
     * @return isMigrateUser
     */
    public Boolean getIsMigrateUser() {
        return isMigrateUser;
    }

    public void setIsMigrateUser(Boolean isMigrateUser) {
        this.isMigrateUser = isMigrateUser;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateUserReq updateUserReq = (UpdateUserReq) o;
        return Objects.equals(this.jobId, updateUserReq.jobId) &&
            Objects.equals(this.password, updateUserReq.password) &&
            Objects.equals(this.list, updateUserReq.list) &&
            Objects.equals(this.userRoles, updateUserReq.userRoles) &&
            Objects.equals(this.isSetPassword, updateUserReq.isSetPassword) &&
            Objects.equals(this.isMigrateUser, updateUserReq.isMigrateUser);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, password, list, userRoles, isSetPassword, isMigrateUser);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    userRoles: ").append(toIndentedString(userRoles)).append("\n");
        sb.append("    isSetPassword: ").append(toIndentedString(isSetPassword)).append("\n");
        sb.append("    isMigrateUser: ").append(toIndentedString(isMigrateUser)).append("\n");
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

