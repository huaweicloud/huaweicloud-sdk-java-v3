package com.huaweicloud.sdk.ges.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ShowGraphRespGraph;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGraph2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph")
    
    
    private ShowGraphRespGraph graph;

    public ShowGraph2Response withGraph(ShowGraphRespGraph graph) {
        this.graph = graph;
        return this;
    }

    public ShowGraph2Response withGraph(Consumer<ShowGraphRespGraph> graphSetter) {
        if(this.graph == null ){
            this.graph = new ShowGraphRespGraph();
            graphSetter.accept(this.graph);
        }
        
        return this;
    }


    /**
     * Get graph
     * @return graph
     */
    public ShowGraphRespGraph getGraph() {
        return graph;
    }

    public void setGraph(ShowGraphRespGraph graph) {
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
        ShowGraph2Response showGraph2Response = (ShowGraph2Response) o;
        return Objects.equals(this.graph, showGraph2Response.graph);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graph);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGraph2Response {\n");
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

