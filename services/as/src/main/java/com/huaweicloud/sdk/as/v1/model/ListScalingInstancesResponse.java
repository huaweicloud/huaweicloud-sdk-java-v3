package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingGroupInstance;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListScalingInstancesResponse extends SdkResponse {



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
    @JsonProperty(value="scaling_group_instances")
    
    private List<ScalingGroupInstance> scalingGroupInstances = null;
    
    public ListScalingInstancesResponse withTotalNumber(Integer totalNumber) {
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

    public ListScalingInstancesResponse withStartNumber(Integer startNumber) {
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

    public ListScalingInstancesResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 伸缩组实例详情。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListScalingInstancesResponse withScalingGroupInstances(List<ScalingGroupInstance> scalingGroupInstances) {
        this.scalingGroupInstances = scalingGroupInstances;
        return this;
    }

    
    public ListScalingInstancesResponse addScalingGroupInstancesItem(ScalingGroupInstance scalingGroupInstancesItem) {
        if (this.scalingGroupInstances == null) {
            this.scalingGroupInstances = new ArrayList<>();
        }
        this.scalingGroupInstances.add(scalingGroupInstancesItem);
        return this;
    }

    public ListScalingInstancesResponse withScalingGroupInstances(Consumer<List<ScalingGroupInstance>> scalingGroupInstancesSetter) {
        if(this.scalingGroupInstances == null ){
            this.scalingGroupInstances = new ArrayList<>();
        }
        scalingGroupInstancesSetter.accept(this.scalingGroupInstances);
        return this;
    }

    /**
     * 伸缩组实例详情。
     * @return scalingGroupInstances
     */
    public List<ScalingGroupInstance> getScalingGroupInstances() {
        return scalingGroupInstances;
    }

    public void setScalingGroupInstances(List<ScalingGroupInstance> scalingGroupInstances) {
        this.scalingGroupInstances = scalingGroupInstances;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingInstancesResponse listScalingInstancesResponse = (ListScalingInstancesResponse) o;
        return Objects.equals(this.totalNumber, listScalingInstancesResponse.totalNumber) &&
            Objects.equals(this.startNumber, listScalingInstancesResponse.startNumber) &&
            Objects.equals(this.limit, listScalingInstancesResponse.limit) &&
            Objects.equals(this.scalingGroupInstances, listScalingInstancesResponse.scalingGroupInstances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, startNumber, limit, scalingGroupInstances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingInstancesResponse {\n");
            sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
            sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    scalingGroupInstances: ").append(toIndentedString(scalingGroupInstances)).append("\n");
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

