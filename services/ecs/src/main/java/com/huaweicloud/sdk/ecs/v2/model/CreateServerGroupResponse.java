package com.huaweicloud.sdk.ecs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.CreateServerGroupResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateServerGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_group")
    
    private CreateServerGroupResult serverGroup;

    public CreateServerGroupResponse withServerGroup(CreateServerGroupResult serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }

    public CreateServerGroupResponse withServerGroup(Consumer<CreateServerGroupResult> serverGroupSetter) {
        if(this.serverGroup == null ){
            this.serverGroup = new CreateServerGroupResult();
            serverGroupSetter.accept(this.serverGroup);
        }
        
        return this;
    }


    /**
     * Get serverGroup
     * @return serverGroup
     */
    public CreateServerGroupResult getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(CreateServerGroupResult serverGroup) {
        this.serverGroup = serverGroup;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateServerGroupResponse createServerGroupResponse = (CreateServerGroupResponse) o;
        return Objects.equals(this.serverGroup, createServerGroupResponse.serverGroup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverGroup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerGroupResponse {\n");
        sb.append("    serverGroup: ").append(toIndentedString(serverGroup)).append("\n");
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

