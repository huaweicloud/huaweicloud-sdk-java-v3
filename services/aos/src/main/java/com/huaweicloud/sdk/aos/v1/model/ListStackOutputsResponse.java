package com.huaweicloud.sdk.aos.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.StackOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListStackOutputsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="outputs")
    
    
    private List<StackOutput> outputs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="next_marker")
    
    
    private String nextMarker;

    public ListStackOutputsResponse withOutputs(List<StackOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    
    public ListStackOutputsResponse addOutputsItem(StackOutput outputsItem) {
        if(this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public ListStackOutputsResponse withOutputs(Consumer<List<StackOutput>> outputsSetter) {
        if(this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 堆栈输出
     * @return outputs
     */
    public List<StackOutput> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<StackOutput> outputs) {
        this.outputs = outputs;
    }

    

    public ListStackOutputsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    


    /**
     * 下一页的标记信息
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStackOutputsResponse listStackOutputsResponse = (ListStackOutputsResponse) o;
        return Objects.equals(this.outputs, listStackOutputsResponse.outputs) &&
            Objects.equals(this.nextMarker, listStackOutputsResponse.nextMarker);
    }
    @Override
    public int hashCode() {
        return Objects.hash(outputs, nextMarker);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStackOutputsResponse {\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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

