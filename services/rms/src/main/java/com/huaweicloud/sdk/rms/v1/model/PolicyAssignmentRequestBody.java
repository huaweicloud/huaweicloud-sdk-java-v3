package com.huaweicloud.sdk.rms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rms.v1.model.PolicyFilterDefinition;
import com.huaweicloud.sdk.rms.v1.model.PolicyParameterValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 规则请求体
 */
public class PolicyAssignmentRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_filter")
    
    private PolicyFilterDefinition policyFilter = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_definition_id")
    
    private String policyDefinitionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private Map<String, PolicyParameterValue> parameters = null;
    
    public PolicyAssignmentRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 规则名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PolicyAssignmentRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicyAssignmentRequestBody withPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
        return this;
    }

    public PolicyAssignmentRequestBody withPolicyFilter(Consumer<PolicyFilterDefinition> policyFilterSetter) {
        if(this.policyFilter == null ){
            this.policyFilter = new PolicyFilterDefinition();
            policyFilterSetter.accept(this.policyFilter);
        }
        
        return this;
    }


    /**
     * Get policyFilter
     * @return policyFilter
     */
    public PolicyFilterDefinition getPolicyFilter() {
        return policyFilter;
    }

    public void setPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
    }

    public PolicyAssignmentRequestBody withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    


    /**
     * 策略定义ID
     * @return policyDefinitionId
     */
    public String getPolicyDefinitionId() {
        return policyDefinitionId;
    }

    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public PolicyAssignmentRequestBody withParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    

    public PolicyAssignmentRequestBody putParametersItem(String key, PolicyParameterValue parametersItem) {
         if (this.parameters == null) {
            this.parameters = new HashMap<>();
         }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public PolicyAssignmentRequestBody withParameters(Consumer<Map<String, PolicyParameterValue>> parametersSetter) {
        if(this.parameters == null ){
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }
    /**
     * 规则参数
     * @return parameters
     */
    public Map<String, PolicyParameterValue> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyAssignmentRequestBody policyAssignmentRequestBody = (PolicyAssignmentRequestBody) o;
        return Objects.equals(this.name, policyAssignmentRequestBody.name) &&
            Objects.equals(this.description, policyAssignmentRequestBody.description) &&
            Objects.equals(this.policyFilter, policyAssignmentRequestBody.policyFilter) &&
            Objects.equals(this.policyDefinitionId, policyAssignmentRequestBody.policyDefinitionId) &&
            Objects.equals(this.parameters, policyAssignmentRequestBody.parameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, policyFilter, policyDefinitionId, parameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyAssignmentRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyFilter: ").append(toIndentedString(policyFilter)).append("\n");
        sb.append("    policyDefinitionId: ").append(toIndentedString(policyDefinitionId)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

