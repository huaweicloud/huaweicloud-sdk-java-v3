package com.huaweicloud.sdk.cloudide.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.InstancesResponseInstancesVOResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateInstanceBy3rdResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private InstancesResponseInstancesVOResult result = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public CreateInstanceBy3rdResponse withResult(InstancesResponseInstancesVOResult result) {
        this.result = result;
        return this;
    }

    public CreateInstanceBy3rdResponse withResult(Consumer<InstancesResponseInstancesVOResult> resultSetter) {
        if(this.result == null ){
            this.result = new InstancesResponseInstancesVOResult();
            resultSetter.accept(this.result);
        }
        
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public InstancesResponseInstancesVOResult getResult() {
        return result;
    }

    public void setResult(InstancesResponseInstancesVOResult result) {
        this.result = result;
    }

    public CreateInstanceBy3rdResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceBy3rdResponse createInstanceBy3rdResponse = (CreateInstanceBy3rdResponse) o;
        return Objects.equals(this.result, createInstanceBy3rdResponse.result) &&
            Objects.equals(this.status, createInstanceBy3rdResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceBy3rdResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

