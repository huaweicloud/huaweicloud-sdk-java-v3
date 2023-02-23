package com.huaweicloud.sdk.ges.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.Graph1;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGraphResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph")
    

    private Graph1 graph;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorMessage")
    

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorCode")
    

    private String errorCode;

    public ShowGraphResponse withGraph(Graph1 graph) {
        this.graph = graph;
        return this;
    }

    public ShowGraphResponse withGraph(Consumer<Graph1> graphSetter) {
        if(this.graph == null ){
            this.graph = new Graph1();
            graphSetter.accept(this.graph);
        }
        
        return this;
    }


    /**
     * Get graph
     * @return graph
     */
    public Graph1 getGraph() {
        return graph;
    }

    public void setGraph(Graph1 graph) {
        this.graph = graph;
    }

    

    public ShowGraphResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    public ShowGraphResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGraphResponse showGraphResponse = (ShowGraphResponse) o;
        return Objects.equals(this.graph, showGraphResponse.graph) &&
            Objects.equals(this.errorMessage, showGraphResponse.errorMessage) &&
            Objects.equals(this.errorCode, showGraphResponse.errorCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graph, errorMessage, errorCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGraphResponse {\n");
        sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

