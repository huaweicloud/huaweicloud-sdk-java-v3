package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingConfiguration;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListScalingConfigsResponse extends SdkResponse {



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
    @JsonProperty(value="scaling_configurations")
    
    private List<ScalingConfiguration> scalingConfigurations = null;
    
    public ListScalingConfigsResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    


    /**
     * 总记录数。
     * minimum: 0
     * maximum: 100
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public ListScalingConfigsResponse withStartNumber(Integer startNumber) {
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

    public ListScalingConfigsResponse withLimit(Integer limit) {
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

    public ListScalingConfigsResponse withScalingConfigurations(List<ScalingConfiguration> scalingConfigurations) {
        this.scalingConfigurations = scalingConfigurations;
        return this;
    }

    
    public ListScalingConfigsResponse addScalingConfigurationsItem(ScalingConfiguration scalingConfigurationsItem) {
        if (this.scalingConfigurations == null) {
            this.scalingConfigurations = new ArrayList<>();
        }
        this.scalingConfigurations.add(scalingConfigurationsItem);
        return this;
    }

    public ListScalingConfigsResponse withScalingConfigurations(Consumer<List<ScalingConfiguration>> scalingConfigurationsSetter) {
        if(this.scalingConfigurations == null ){
            this.scalingConfigurations = new ArrayList<>();
        }
        scalingConfigurationsSetter.accept(this.scalingConfigurations);
        return this;
    }

    /**
     * 伸缩配置列表
     * @return scalingConfigurations
     */
    public List<ScalingConfiguration> getScalingConfigurations() {
        return scalingConfigurations;
    }

    public void setScalingConfigurations(List<ScalingConfiguration> scalingConfigurations) {
        this.scalingConfigurations = scalingConfigurations;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingConfigsResponse listScalingConfigsResponse = (ListScalingConfigsResponse) o;
        return Objects.equals(this.totalNumber, listScalingConfigsResponse.totalNumber) &&
            Objects.equals(this.startNumber, listScalingConfigsResponse.startNumber) &&
            Objects.equals(this.limit, listScalingConfigsResponse.limit) &&
            Objects.equals(this.scalingConfigurations, listScalingConfigsResponse.scalingConfigurations);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, startNumber, limit, scalingConfigurations);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingConfigsResponse {\n");
            sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
            sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    scalingConfigurations: ").append(toIndentedString(scalingConfigurations)).append("\n");
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

