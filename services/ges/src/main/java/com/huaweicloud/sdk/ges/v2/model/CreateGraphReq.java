package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.CreateGraphReqGraph;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建图请求体
 */
public class CreateGraphReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph")
    

    private CreateGraphReqGraph graph;

    public CreateGraphReq withGraph(CreateGraphReqGraph graph) {
        this.graph = graph;
        return this;
    }

    public CreateGraphReq withGraph(Consumer<CreateGraphReqGraph> graphSetter) {
        if(this.graph == null ){
            this.graph = new CreateGraphReqGraph();
            graphSetter.accept(this.graph);
        }
        
        return this;
    }


    /**
     * Get graph
     * @return graph
     */
    public CreateGraphReqGraph getGraph() {
        return graph;
    }

    public void setGraph(CreateGraphReqGraph graph) {
        this.graph = graph;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGraphReq createGraphReq = (CreateGraphReq) o;
        return Objects.equals(this.graph, createGraphReq.graph);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graph);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGraphReq {\n");
        sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
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

