package com.huaweicloud.sdk.cloudpipeline.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v2.model.PipelineExecuteStates;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchShowPipelinesStatusResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private List<PipelineExecuteStates> body = null;
    
    public BatchShowPipelinesStatusResponse withBody(List<PipelineExecuteStates> body) {
        this.body = body;
        return this;
    }

    
    public BatchShowPipelinesStatusResponse addBodyItem(PipelineExecuteStates bodyItem) {
        this.body.add(bodyItem);
        return this;
    }

    public BatchShowPipelinesStatusResponse withBody(Consumer<List<PipelineExecuteStates>> bodySetter) {
        if(this.body == null ){
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<PipelineExecuteStates> getBody() {
        return body;
    }

    public void setBody(List<PipelineExecuteStates> body) {
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
        BatchShowPipelinesStatusResponse batchShowPipelinesStatusResponse = (BatchShowPipelinesStatusResponse) o;
        return Objects.equals(this.body, batchShowPipelinesStatusResponse.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowPipelinesStatusResponse {\n");
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

