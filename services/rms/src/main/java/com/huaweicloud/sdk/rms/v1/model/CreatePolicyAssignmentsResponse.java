package com.huaweicloud.sdk.rms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


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
 * Response Object
 */
public class CreatePolicyAssignmentsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


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
    @JsonProperty(value="state")
    
    private String state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_definition_id")
    
    private String policyDefinitionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private Map<String, PolicyParameterValue> parameters = null;
    
    public CreatePolicyAssignmentsResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreatePolicyAssignmentsResponse withName(String name) {
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

    public CreatePolicyAssignmentsResponse withDescription(String description) {
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

    public CreatePolicyAssignmentsResponse withPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
        return this;
    }

    public CreatePolicyAssignmentsResponse withPolicyFilter(Consumer<PolicyFilterDefinition> policyFilterSetter) {
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

    public CreatePolicyAssignmentsResponse withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * 规则状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CreatePolicyAssignmentsResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 规则创建时间
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CreatePolicyAssignmentsResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 规则更新时间
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public CreatePolicyAssignmentsResponse withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    


    /**
     * 规则的策略ID
     * @return policyDefinitionId
     */
    public String getPolicyDefinitionId() {
        return policyDefinitionId;
    }

    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public CreatePolicyAssignmentsResponse withParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    

    public CreatePolicyAssignmentsResponse putParametersItem(String key, PolicyParameterValue parametersItem) {
         if (this.parameters == null) {
            this.parameters = new HashMap<>();
         }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public CreatePolicyAssignmentsResponse withParameters(Consumer<Map<String, PolicyParameterValue>> parametersSetter) {
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
        CreatePolicyAssignmentsResponse createPolicyAssignmentsResponse = (CreatePolicyAssignmentsResponse) o;
        return Objects.equals(this.id, createPolicyAssignmentsResponse.id) &&
            Objects.equals(this.name, createPolicyAssignmentsResponse.name) &&
            Objects.equals(this.description, createPolicyAssignmentsResponse.description) &&
            Objects.equals(this.policyFilter, createPolicyAssignmentsResponse.policyFilter) &&
            Objects.equals(this.state, createPolicyAssignmentsResponse.state) &&
            Objects.equals(this.created, createPolicyAssignmentsResponse.created) &&
            Objects.equals(this.updated, createPolicyAssignmentsResponse.updated) &&
            Objects.equals(this.policyDefinitionId, createPolicyAssignmentsResponse.policyDefinitionId) &&
            Objects.equals(this.parameters, createPolicyAssignmentsResponse.parameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, policyFilter, state, created, updated, policyDefinitionId, parameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePolicyAssignmentsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyFilter: ").append(toIndentedString(policyFilter)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

