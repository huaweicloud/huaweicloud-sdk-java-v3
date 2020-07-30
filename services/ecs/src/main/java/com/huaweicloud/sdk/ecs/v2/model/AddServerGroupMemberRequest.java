package com.huaweicloud.sdk.ecs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.AddServerGroupMemberRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AddServerGroupMemberRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_group_id")
    
    private String serverGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private AddServerGroupMemberRequestBody body = null;

    public AddServerGroupMemberRequest withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    


    /**
     * Get serverGroupId
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public AddServerGroupMemberRequest withBody(AddServerGroupMemberRequestBody body) {
        this.body = body;
        return this;
    }

    public AddServerGroupMemberRequest withBody(Consumer<AddServerGroupMemberRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new AddServerGroupMemberRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AddServerGroupMemberRequestBody getBody() {
        return body;
    }

    public void setBody(AddServerGroupMemberRequestBody body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddServerGroupMemberRequest addServerGroupMemberRequest = (AddServerGroupMemberRequest) o;
        return Objects.equals(this.serverGroupId, addServerGroupMemberRequest.serverGroupId) &&
            Objects.equals(this.body, addServerGroupMemberRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddServerGroupMemberRequest {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

