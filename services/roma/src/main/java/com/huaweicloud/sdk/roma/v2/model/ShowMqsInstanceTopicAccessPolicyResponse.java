package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.ShowMqsInstanceTopicAccessPolicyRespPolicies;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowMqsInstanceTopicAccessPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policies")
    
    private List<ShowMqsInstanceTopicAccessPolicyRespPolicies> policies = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation")
    
    private String operation;

    public ShowMqsInstanceTopicAccessPolicyResponse withName(String name) {
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

    public ShowMqsInstanceTopicAccessPolicyResponse withPolicies(List<ShowMqsInstanceTopicAccessPolicyRespPolicies> policies) {
        this.policies = policies;
        return this;
    }

    
    public ShowMqsInstanceTopicAccessPolicyResponse addPoliciesItem(ShowMqsInstanceTopicAccessPolicyRespPolicies policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ShowMqsInstanceTopicAccessPolicyResponse withPolicies(Consumer<List<ShowMqsInstanceTopicAccessPolicyRespPolicies>> policiesSetter) {
        if(this.policies == null ){
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 策略列表。
     * @return policies
     */
    public List<ShowMqsInstanceTopicAccessPolicyRespPolicies> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ShowMqsInstanceTopicAccessPolicyRespPolicies> policies) {
        this.policies = policies;
    }

    public ShowMqsInstanceTopicAccessPolicyResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 权限策略的总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowMqsInstanceTopicAccessPolicyResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 查询权限策略的数量。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowMqsInstanceTopicAccessPolicyResponse withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    


    /**
     * topic名称。
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMqsInstanceTopicAccessPolicyResponse showMqsInstanceTopicAccessPolicyResponse = (ShowMqsInstanceTopicAccessPolicyResponse) o;
        return Objects.equals(this.name, showMqsInstanceTopicAccessPolicyResponse.name) &&
            Objects.equals(this.policies, showMqsInstanceTopicAccessPolicyResponse.policies) &&
            Objects.equals(this.total, showMqsInstanceTopicAccessPolicyResponse.total) &&
            Objects.equals(this.size, showMqsInstanceTopicAccessPolicyResponse.size) &&
            Objects.equals(this.operation, showMqsInstanceTopicAccessPolicyResponse.operation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, policies, total, size, operation);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMqsInstanceTopicAccessPolicyResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

