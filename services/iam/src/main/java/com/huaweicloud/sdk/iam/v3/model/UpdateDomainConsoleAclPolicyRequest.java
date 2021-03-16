package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainConsoleAclPolicyRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateDomainConsoleAclPolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateDomainConsoleAclPolicyRequestBody body;

    public UpdateDomainConsoleAclPolicyRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * Get domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public UpdateDomainConsoleAclPolicyRequest withBody(UpdateDomainConsoleAclPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDomainConsoleAclPolicyRequest withBody(Consumer<UpdateDomainConsoleAclPolicyRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateDomainConsoleAclPolicyRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateDomainConsoleAclPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateDomainConsoleAclPolicyRequestBody body) {
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
        UpdateDomainConsoleAclPolicyRequest updateDomainConsoleAclPolicyRequest = (UpdateDomainConsoleAclPolicyRequest) o;
        return Objects.equals(this.domainId, updateDomainConsoleAclPolicyRequest.domainId) &&
            Objects.equals(this.body, updateDomainConsoleAclPolicyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainConsoleAclPolicyRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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

