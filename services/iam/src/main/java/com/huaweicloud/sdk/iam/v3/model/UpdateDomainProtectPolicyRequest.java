package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainProtectPolicyRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateDomainProtectPolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateDomainProtectPolicyRequestBody body;

    public UpdateDomainProtectPolicyRequest withDomainId(String domainId) {
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

    

    public UpdateDomainProtectPolicyRequest withBody(UpdateDomainProtectPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDomainProtectPolicyRequest withBody(Consumer<UpdateDomainProtectPolicyRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateDomainProtectPolicyRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateDomainProtectPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateDomainProtectPolicyRequestBody body) {
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
        UpdateDomainProtectPolicyRequest updateDomainProtectPolicyRequest = (UpdateDomainProtectPolicyRequest) o;
        return Objects.equals(this.domainId, updateDomainProtectPolicyRequest.domainId) &&
            Objects.equals(this.body, updateDomainProtectPolicyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainProtectPolicyRequest {\n");
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

