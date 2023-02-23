package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.ClusterScalingParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ClusterScalingReq
 */
public class ClusterScalingReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plan_id")
    

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    

    private ClusterScalingParams parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="previous_values")
    
    private Map<String, String> previousValues = null;
    
    public ClusterScalingReq withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * 服务ID，为扩展接口，预留此参数。用户不需要配置。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    

    public ClusterScalingReq withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    


    /**
     * 套餐ID，为扩展接口，预留此参数。用户不需要配置。
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    

    public ClusterScalingReq withParameters(ClusterScalingParams parameters) {
        this.parameters = parameters;
        return this;
    }

    public ClusterScalingReq withParameters(Consumer<ClusterScalingParams> parametersSetter) {
        if(this.parameters == null ){
            this.parameters = new ClusterScalingParams();
            parametersSetter.accept(this.parameters);
        }
        
        return this;
    }


    /**
     * Get parameters
     * @return parameters
     */
    public ClusterScalingParams getParameters() {
        return parameters;
    }

    public void setParameters(ClusterScalingParams parameters) {
        this.parameters = parameters;
    }

    

    public ClusterScalingReq withPreviousValues(Map<String, String> previousValues) {
        this.previousValues = previousValues;
        return this;
    }

    

    public ClusterScalingReq putPreviousValuesItem(String key, String previousValuesItem) {
        if(this.previousValues == null) {
            this.previousValues = new HashMap<>();
        }
        this.previousValues.put(key, previousValuesItem);
        return this;
    }

    public ClusterScalingReq withPreviousValues(Consumer<Map<String, String>> previousValuesSetter) {
        if(this.previousValues == null) {
            this.previousValues = new HashMap<>();
        }
        previousValuesSetter.accept(this.previousValues);
        return this;
    }
    /**
     * 扩展接口，预留此参数。用户不需要配置。
     * @return previousValues
     */
    public Map<String, String> getPreviousValues() {
        return previousValues;
    }

    public void setPreviousValues(Map<String, String> previousValues) {
        this.previousValues = previousValues;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterScalingReq clusterScalingReq = (ClusterScalingReq) o;
        return Objects.equals(this.serviceId, clusterScalingReq.serviceId) &&
            Objects.equals(this.planId, clusterScalingReq.planId) &&
            Objects.equals(this.parameters, clusterScalingReq.parameters) &&
            Objects.equals(this.previousValues, clusterScalingReq.previousValues);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, planId, parameters, previousValues);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterScalingReq {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    previousValues: ").append(toIndentedString(previousValues)).append("\n");
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

