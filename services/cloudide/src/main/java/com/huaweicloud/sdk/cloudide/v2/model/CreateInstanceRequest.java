package com.huaweicloud.sdk.cloudide.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.InstanceParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateInstanceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="org_id")
    
    private String orgId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private InstanceParam body = null;

    public CreateInstanceRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    


    /**
     * Get orgId
     * @return orgId
     */
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public CreateInstanceRequest withBody(InstanceParam body) {
        this.body = body;
        return this;
    }

    public CreateInstanceRequest withBody(Consumer<InstanceParam> bodySetter) {
        if(this.body == null ){
            this.body = new InstanceParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public InstanceParam getBody() {
        return body;
    }

    public void setBody(InstanceParam body) {
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
        CreateInstanceRequest createInstanceRequest = (CreateInstanceRequest) o;
        return Objects.equals(this.orgId, createInstanceRequest.orgId) &&
            Objects.equals(this.body, createInstanceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orgId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceRequest {\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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

