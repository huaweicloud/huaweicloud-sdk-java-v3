package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingGroups;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListScalingGroupsResponse extends SdkResponse {



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
    @JsonProperty(value="scaling_groups")
    
    private List<ScalingGroups> scalingGroups = null;
    
    public ListScalingGroupsResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    


    /**
     * 总记录数
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public ListScalingGroupsResponse withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    


    /**
     * 查询的开始记录号
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public ListScalingGroupsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListScalingGroupsResponse withScalingGroups(List<ScalingGroups> scalingGroups) {
        this.scalingGroups = scalingGroups;
        return this;
    }

    
    public ListScalingGroupsResponse addScalingGroupsItem(ScalingGroups scalingGroupsItem) {
        if (this.scalingGroups == null) {
            this.scalingGroups = new ArrayList<>();
        }
        this.scalingGroups.add(scalingGroupsItem);
        return this;
    }

    public ListScalingGroupsResponse withScalingGroups(Consumer<List<ScalingGroups>> scalingGroupsSetter) {
        if(this.scalingGroups == null ){
            this.scalingGroups = new ArrayList<>();
        }
        scalingGroupsSetter.accept(this.scalingGroups);
        return this;
    }

    /**
     * 伸缩组列表
     * @return scalingGroups
     */
    public List<ScalingGroups> getScalingGroups() {
        return scalingGroups;
    }

    public void setScalingGroups(List<ScalingGroups> scalingGroups) {
        this.scalingGroups = scalingGroups;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingGroupsResponse listScalingGroupsResponse = (ListScalingGroupsResponse) o;
        return Objects.equals(this.totalNumber, listScalingGroupsResponse.totalNumber) &&
            Objects.equals(this.startNumber, listScalingGroupsResponse.startNumber) &&
            Objects.equals(this.limit, listScalingGroupsResponse.limit) &&
            Objects.equals(this.scalingGroups, listScalingGroupsResponse.scalingGroups);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, startNumber, limit, scalingGroups);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingGroupsResponse {\n");
            sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
            sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    scalingGroups: ").append(toIndentedString(scalingGroups)).append("\n");
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

