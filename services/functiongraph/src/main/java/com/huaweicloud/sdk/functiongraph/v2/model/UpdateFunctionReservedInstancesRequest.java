package com.huaweicloud.sdk.functiongraph.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionReservedInstancesRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateFunctionReservedInstancesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="function_urn")
    
    private String functionUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateFunctionReservedInstancesRequestBody body;

    public UpdateFunctionReservedInstancesRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    


    /**
     * Get functionUrn
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    

    public UpdateFunctionReservedInstancesRequest withBody(UpdateFunctionReservedInstancesRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFunctionReservedInstancesRequest withBody(Consumer<UpdateFunctionReservedInstancesRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateFunctionReservedInstancesRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateFunctionReservedInstancesRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFunctionReservedInstancesRequestBody body) {
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
        UpdateFunctionReservedInstancesRequest updateFunctionReservedInstancesRequest = (UpdateFunctionReservedInstancesRequest) o;
        return Objects.equals(this.functionUrn, updateFunctionReservedInstancesRequest.functionUrn) &&
            Objects.equals(this.body, updateFunctionReservedInstancesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionReservedInstancesRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
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

