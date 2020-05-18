package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingPolicyDetail;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListScalingPoliciesResponse extends SdkResponse {



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
    
    private List<ScalingPolicyDetail> scalingPolicies = null;
    
    public ListScalingPoliciesResponse withTotalNumber(Integer totalNumber) {
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

    public ListScalingPoliciesResponse withStartNumber(Integer startNumber) {
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

    public ListScalingPoliciesResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数。
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListScalingPoliciesResponse withScalingPolicies(List<ScalingPolicyDetail> scalingPolicies) {
        this.scalingPolicies = scalingPolicies;
        return this;
    }

    
    public ListScalingPoliciesResponse addScalingPoliciesItem(ScalingPolicyDetail scalingPoliciesItem) {
        if (this.scalingPolicies == null) {
            this.scalingPolicies = new ArrayList<>();
        }
        this.scalingPolicies.add(scalingPoliciesItem);
        return this;
    }

    public ListScalingPoliciesResponse withScalingPolicies(Consumer<List<ScalingPolicyDetail>> scalingPoliciesSetter) {
        if(this.scalingPolicies == null ){
            this.scalingPolicies = new ArrayList<>();
        }
        scalingPoliciesSetter.accept(this.scalingPolicies);
        return this;
    }

    /**
     * 伸缩策略列表
     * @return scalingPolicies
     */
    public List<ScalingPolicyDetail> getScalingPolicies() {
        return scalingPolicies;
    }

    public void setScalingPolicies(List<ScalingPolicyDetail> scalingPolicies) {
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
        ListScalingPoliciesResponse listScalingPoliciesResponse = (ListScalingPoliciesResponse) o;
        return Objects.equals(this.totalNumber, listScalingPoliciesResponse.totalNumber) &&
            Objects.equals(this.startNumber, listScalingPoliciesResponse.startNumber) &&
            Objects.equals(this.limit, listScalingPoliciesResponse.limit) &&
            Objects.equals(this.scalingPolicies, listScalingPoliciesResponse.scalingPolicies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, startNumber, limit, scalingPolicies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingPoliciesResponse {\n");
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

