package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AddMemberRequestV4
 */
public class AddMemberRequestV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role_id")
    
    private Integer roleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;

    public AddMemberRequestV4 withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AddMemberRequestV4 withRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    


    /**
     * 用户在项目中的角色ID 3, 4, 5, 6, 7 , 8
     * @return roleId
     */
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public AddMemberRequestV4 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户32位uuid
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddMemberRequestV4 addMemberRequestV4 = (AddMemberRequestV4) o;
        return Objects.equals(this.domainId, addMemberRequestV4.domainId) &&
            Objects.equals(this.roleId, addMemberRequestV4.roleId) &&
            Objects.equals(this.userId, addMemberRequestV4.userId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, roleId, userId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddMemberRequestV4 {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

