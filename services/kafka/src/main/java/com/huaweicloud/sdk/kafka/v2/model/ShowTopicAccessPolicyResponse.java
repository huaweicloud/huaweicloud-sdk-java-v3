package com.huaweicloud.sdk.kafka.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ShowTopicAccessPolicyRespPolicies;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTopicAccessPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic_type")
    
    private Integer topicType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policies")
    
    private List<ShowTopicAccessPolicyRespPolicies> policies = null;
    
    public ShowTopicAccessPolicyResponse withName(String name) {
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

    

    public ShowTopicAccessPolicyResponse withTopicType(Integer topicType) {
        this.topicType = topicType;
        return this;
    }

    


    /**
     * topic类型。
     * @return topicType
     */
    public Integer getTopicType() {
        return topicType;
    }

    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    

    public ShowTopicAccessPolicyResponse withPolicies(List<ShowTopicAccessPolicyRespPolicies> policies) {
        this.policies = policies;
        return this;
    }

    
    public ShowTopicAccessPolicyResponse addPoliciesItem(ShowTopicAccessPolicyRespPolicies policiesItem) {
        if(this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ShowTopicAccessPolicyResponse withPolicies(Consumer<List<ShowTopicAccessPolicyRespPolicies>> policiesSetter) {
        if(this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 权限列表。
     * @return policies
     */
    public List<ShowTopicAccessPolicyRespPolicies> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ShowTopicAccessPolicyRespPolicies> policies) {
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
        ShowTopicAccessPolicyResponse showTopicAccessPolicyResponse = (ShowTopicAccessPolicyResponse) o;
        return Objects.equals(this.name, showTopicAccessPolicyResponse.name) &&
            Objects.equals(this.topicType, showTopicAccessPolicyResponse.topicType) &&
            Objects.equals(this.policies, showTopicAccessPolicyResponse.policies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, topicType, policies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopicAccessPolicyResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    topicType: ").append(toIndentedString(topicType)).append("\n");
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

