package com.huaweicloud.sdk.as.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingAllPolicyDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAllScalingV2PoliciesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_number")
    
    private Integer totalNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_number")
    
    private Integer startNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policies")
    
    private List<ScalingAllPolicyDetail> scalingPolicies = null;
    
    public ListAllScalingV2PoliciesResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    

    public ListAllScalingV2PoliciesResponse withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    


    /**
     * 查询的起始行号。
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    

    public ListAllScalingV2PoliciesResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListAllScalingV2PoliciesResponse withScalingPolicies(List<ScalingAllPolicyDetail> scalingPolicies) {
        this.scalingPolicies = scalingPolicies;
        return this;
    }

    
    public ListAllScalingV2PoliciesResponse addScalingPoliciesItem(ScalingAllPolicyDetail scalingPoliciesItem) {
        if(this.scalingPolicies == null) {
            this.scalingPolicies = new ArrayList<>();
        }
        this.scalingPolicies.add(scalingPoliciesItem);
        return this;
    }

    public ListAllScalingV2PoliciesResponse withScalingPolicies(Consumer<List<ScalingAllPolicyDetail>> scalingPoliciesSetter) {
        if(this.scalingPolicies == null) {
            this.scalingPolicies = new ArrayList<>();
        }
        scalingPoliciesSetter.accept(this.scalingPolicies);
        return this;
    }

    /**
     * 伸缩策略列表
     * @return scalingPolicies
     */
    public List<ScalingAllPolicyDetail> getScalingPolicies() {
        return scalingPolicies;
    }

    public void setScalingPolicies(List<ScalingAllPolicyDetail> scalingPolicies) {
        this.scalingPolicies = scalingPolicies;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAllScalingV2PoliciesResponse listAllScalingV2PoliciesResponse = (ListAllScalingV2PoliciesResponse) o;
        return Objects.equals(this.totalNumber, listAllScalingV2PoliciesResponse.totalNumber) &&
            Objects.equals(this.startNumber, listAllScalingV2PoliciesResponse.startNumber) &&
            Objects.equals(this.limit, listAllScalingV2PoliciesResponse.limit) &&
            Objects.equals(this.scalingPolicies, listAllScalingV2PoliciesResponse.scalingPolicies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, startNumber, limit, scalingPolicies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllScalingV2PoliciesResponse {\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
        sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    scalingPolicies: ").append(toIndentedString(scalingPolicies)).append("\n");
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

