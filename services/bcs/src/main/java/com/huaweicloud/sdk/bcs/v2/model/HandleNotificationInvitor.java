package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * HandleNotificationInvitor
 */
public class HandleNotificationInvitor  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_bcs_id")
    
    private String invitorBcsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_project_id")
    
    private String invitorProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_username")
    
    private String invitorUsername;

    public HandleNotificationInvitor withInvitorBcsId(String invitorBcsId) {
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

    public HandleNotificationInvitor withInvitorProjectId(String invitorProjectId) {
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

    public HandleNotificationInvitor withInvitorUsername(String invitorUsername) {
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
        HandleNotificationInvitor handleNotificationInvitor = (HandleNotificationInvitor) o;
        return Objects.equals(this.invitorBcsId, handleNotificationInvitor.invitorBcsId) &&
            Objects.equals(this.invitorProjectId, handleNotificationInvitor.invitorProjectId) &&
            Objects.equals(this.invitorUsername, handleNotificationInvitor.invitorUsername);
    }
    @Override
    public int hashCode() {
        return Objects.hash(invitorBcsId, invitorProjectId, invitorUsername);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandleNotificationInvitor {\n");
        sb.append("    invitorBcsId: ").append(toIndentedString(invitorBcsId)).append("\n");
        sb.append("    invitorProjectId: ").append(toIndentedString(invitorProjectId)).append("\n");
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

