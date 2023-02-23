package com.huaweicloud.sdk.dbss.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.SecurityGroupRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateAuditSecurityGroupRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private SecurityGroupRequest body;

    public UpdateAuditSecurityGroupRequest withBody(SecurityGroupRequest body) {
        this.body = body;
        return this;
    }

    public UpdateAuditSecurityGroupRequest withBody(Consumer<SecurityGroupRequest> bodySetter) {
        if(this.body == null ){
            this.body = new SecurityGroupRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SecurityGroupRequest getBody() {
        return body;
    }

    public void setBody(SecurityGroupRequest body) {
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
        UpdateAuditSecurityGroupRequest updateAuditSecurityGroupRequest = (UpdateAuditSecurityGroupRequest) o;
        return Objects.equals(this.body, updateAuditSecurityGroupRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuditSecurityGroupRequest {\n");
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

