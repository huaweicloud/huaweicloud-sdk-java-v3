package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.L7policyResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListL7policiesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7policies")
    
    private List<L7policyResp> l7policies = null;
    
    public ListL7policiesResponse withL7policies(List<L7policyResp> l7policies) {
        this.l7policies = l7policies;
        return this;
    }

    
    public ListL7policiesResponse addL7policiesItem(L7policyResp l7policiesItem) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        this.l7policies.add(l7policiesItem);
        return this;
    }

    public ListL7policiesResponse withL7policies(Consumer<List<L7policyResp>> l7policiesSetter) {
        if(this.l7policies == null ){
            this.l7policies = new ArrayList<>();
        }
        l7policiesSetter.accept(this.l7policies);
        return this;
    }

    /**
     * 转发策略对象的列表
     * @return l7policies
     */
    public List<L7policyResp> getL7policies() {
        return l7policies;
    }

    public void setL7policies(List<L7policyResp> l7policies) {
        this.l7policies = l7policies;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListL7policiesResponse listL7policiesResponse = (ListL7policiesResponse) o;
        return Objects.equals(this.l7policies, listL7policiesResponse.l7policies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(l7policies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListL7policiesResponse {\n");
        sb.append("    l7policies: ").append(toIndentedString(l7policies)).append("\n");
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

