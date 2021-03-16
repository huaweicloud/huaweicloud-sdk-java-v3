package com.huaweicloud.sdk.rms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowBuiltInPolicyDefinitionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_definition_id")
    
    private String policyDefinitionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;

    public ShowBuiltInPolicyDefinitionRequest withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    


    /**
     * Get policyDefinitionId
     * @return policyDefinitionId
     */
    public String getPolicyDefinitionId() {
        return policyDefinitionId;
    }

    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    

    public ShowBuiltInPolicyDefinitionRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBuiltInPolicyDefinitionRequest showBuiltInPolicyDefinitionRequest = (ShowBuiltInPolicyDefinitionRequest) o;
        return Objects.equals(this.policyDefinitionId, showBuiltInPolicyDefinitionRequest.policyDefinitionId) &&
            Objects.equals(this.xLanguage, showBuiltInPolicyDefinitionRequest.xLanguage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policyDefinitionId, xLanguage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBuiltInPolicyDefinitionRequest {\n");
        sb.append("    policyDefinitionId: ").append(toIndentedString(policyDefinitionId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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

