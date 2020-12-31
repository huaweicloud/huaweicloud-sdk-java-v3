package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.UpdateTopicAccessPolicyPoliciesObject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateTopicAccessPolicyTopicsObject
 */
public class UpdateTopicAccessPolicyTopicsObject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policies")
    
    private List<UpdateTopicAccessPolicyPoliciesObject> policies = new ArrayList<>();
    
    public UpdateTopicAccessPolicyTopicsObject withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * topic名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateTopicAccessPolicyTopicsObject withPolicies(List<UpdateTopicAccessPolicyPoliciesObject> policies) {
        this.policies = policies;
        return this;
    }

    
    public UpdateTopicAccessPolicyTopicsObject addPoliciesItem(UpdateTopicAccessPolicyPoliciesObject policiesItem) {
        this.policies.add(policiesItem);
        return this;
    }

    public UpdateTopicAccessPolicyTopicsObject withPolicies(Consumer<List<UpdateTopicAccessPolicyPoliciesObject>> policiesSetter) {
        if(this.policies == null ){
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 权限列表。
     * @return policies
     */
    public List<UpdateTopicAccessPolicyPoliciesObject> getPolicies() {
        return policies;
    }

    public void setPolicies(List<UpdateTopicAccessPolicyPoliciesObject> policies) {
        this.policies = policies;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTopicAccessPolicyTopicsObject updateTopicAccessPolicyTopicsObject = (UpdateTopicAccessPolicyTopicsObject) o;
        return Objects.equals(this.name, updateTopicAccessPolicyTopicsObject.name) &&
            Objects.equals(this.policies, updateTopicAccessPolicyTopicsObject.policies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, policies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicAccessPolicyTopicsObject {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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

