package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 联盟成员中的邀请方
 */
public class MemberInvitor  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_bcs_id")
    
    private String invitorBcsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_bcs_name")
    
    private String invitorBcsName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_project_id")
    
    private String invitorProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_user_id")
    
    private String invitorUserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_username")
    
    private String invitorUsername;

    public MemberInvitor withInvitorBcsId(String invitorBcsId) {
        this.invitorBcsId = invitorBcsId;
        return this;
    }

    


    /**
     * 邀请方实例id
     * @return invitorBcsId
     */
    public String getInvitorBcsId() {
        return invitorBcsId;
    }

    public void setInvitorBcsId(String invitorBcsId) {
        this.invitorBcsId = invitorBcsId;
    }

    public MemberInvitor withInvitorBcsName(String invitorBcsName) {
        this.invitorBcsName = invitorBcsName;
        return this;
    }

    


    /**
     * 邀请方实例名称
     * @return invitorBcsName
     */
    public String getInvitorBcsName() {
        return invitorBcsName;
    }

    public void setInvitorBcsName(String invitorBcsName) {
        this.invitorBcsName = invitorBcsName;
    }

    public MemberInvitor withInvitorProjectId(String invitorProjectId) {
        this.invitorProjectId = invitorProjectId;
        return this;
    }

    


    /**
     * 邀请方project id
     * @return invitorProjectId
     */
    public String getInvitorProjectId() {
        return invitorProjectId;
    }

    public void setInvitorProjectId(String invitorProjectId) {
        this.invitorProjectId = invitorProjectId;
    }

    public MemberInvitor withInvitorUserId(String invitorUserId) {
        this.invitorUserId = invitorUserId;
        return this;
    }

    


    /**
     * 邀请方租户id
     * @return invitorUserId
     */
    public String getInvitorUserId() {
        return invitorUserId;
    }

    public void setInvitorUserId(String invitorUserId) {
        this.invitorUserId = invitorUserId;
    }

    public MemberInvitor withInvitorUsername(String invitorUsername) {
        this.invitorUsername = invitorUsername;
        return this;
    }

    


    /**
     * 邀请方租户名
     * @return invitorUsername
     */
    public String getInvitorUsername() {
        return invitorUsername;
    }

    public void setInvitorUsername(String invitorUsername) {
        this.invitorUsername = invitorUsername;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberInvitor memberInvitor = (MemberInvitor) o;
        return Objects.equals(this.invitorBcsId, memberInvitor.invitorBcsId) &&
            Objects.equals(this.invitorBcsName, memberInvitor.invitorBcsName) &&
            Objects.equals(this.invitorProjectId, memberInvitor.invitorProjectId) &&
            Objects.equals(this.invitorUserId, memberInvitor.invitorUserId) &&
            Objects.equals(this.invitorUsername, memberInvitor.invitorUsername);
    }
    @Override
    public int hashCode() {
        return Objects.hash(invitorBcsId, invitorBcsName, invitorProjectId, invitorUserId, invitorUsername);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberInvitor {\n");
        sb.append("    invitorBcsId: ").append(toIndentedString(invitorBcsId)).append("\n");
        sb.append("    invitorBcsName: ").append(toIndentedString(invitorBcsName)).append("\n");
        sb.append("    invitorProjectId: ").append(toIndentedString(invitorProjectId)).append("\n");
        sb.append("    invitorUserId: ").append(toIndentedString(invitorUserId)).append("\n");
        sb.append("    invitorUsername: ").append(toIndentedString(invitorUsername)).append("\n");
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

