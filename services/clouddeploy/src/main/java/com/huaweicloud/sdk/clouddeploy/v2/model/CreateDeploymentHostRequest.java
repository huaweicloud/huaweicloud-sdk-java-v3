package com.huaweicloud.sdk.clouddeploy.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.clouddeploy.v2.model.DeploymentHost;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateDeploymentHostRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private DeploymentHost body;

    public CreateDeploymentHostRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 主机组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public CreateDeploymentHostRequest withBody(DeploymentHost body) {
        this.body = body;
        return this;
    }

    public CreateDeploymentHostRequest withBody(Consumer<DeploymentHost> bodySetter) {
        if(this.body == null ){
            this.body = new DeploymentHost();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public DeploymentHost getBody() {
        return body;
    }

    public void setBody(DeploymentHost body) {
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
        CreateDeploymentHostRequest createDeploymentHostRequest = (CreateDeploymentHostRequest) o;
        return Objects.equals(this.groupId, createDeploymentHostRequest.groupId) &&
            Objects.equals(this.body, createDeploymentHostRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentHostRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

