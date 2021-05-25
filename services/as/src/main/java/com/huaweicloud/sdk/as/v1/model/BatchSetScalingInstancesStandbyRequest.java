package com.huaweicloud.sdk.as.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.BatchEnterStandbyInstancesOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchSetScalingInstancesStandbyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_id")
    
    private String scalingGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchEnterStandbyInstancesOption body;

    public BatchSetScalingInstancesStandbyRequest withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    

    public BatchSetScalingInstancesStandbyRequest withBody(BatchEnterStandbyInstancesOption body) {
        this.body = body;
        return this;
    }

    public BatchSetScalingInstancesStandbyRequest withBody(Consumer<BatchEnterStandbyInstancesOption> bodySetter) {
        if(this.body == null ){
            this.body = new BatchEnterStandbyInstancesOption();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchEnterStandbyInstancesOption getBody() {
        return body;
    }

    public void setBody(BatchEnterStandbyInstancesOption body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchSetScalingInstancesStandbyRequest batchSetScalingInstancesStandbyRequest = (BatchSetScalingInstancesStandbyRequest) o;
        return Objects.equals(this.scalingGroupId, batchSetScalingInstancesStandbyRequest.scalingGroupId) &&
            Objects.equals(this.body, batchSetScalingInstancesStandbyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetScalingInstancesStandbyRequest {\n");
        sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

