package com.huaweicloud.sdk.codehub.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteHooksRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hook_id")
    
    private Integer hookId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository_name")
    
    private String repositoryName;

    public DeleteHooksRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * Get groupName
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public DeleteHooksRequest withHookId(Integer hookId) {
        this.hookId = hookId;
        return this;
    }

    


    /**
     * Get hookId
     * @return hookId
     */
    public Integer getHookId() {
        return hookId;
    }

    public void setHookId(Integer hookId) {
        this.hookId = hookId;
    }

    public DeleteHooksRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    


    /**
     * Get repositoryName
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteHooksRequest deleteHooksRequest = (DeleteHooksRequest) o;
        return Objects.equals(this.groupName, deleteHooksRequest.groupName) &&
            Objects.equals(this.hookId, deleteHooksRequest.hookId) &&
            Objects.equals(this.repositoryName, deleteHooksRequest.repositoryName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupName, hookId, repositoryName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHooksRequest {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
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

