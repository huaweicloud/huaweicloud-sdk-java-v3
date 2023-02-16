package com.huaweicloud.sdk.ges.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ListGraphsRespGraphs;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListGraphs2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_count")
    
    
    private Integer graphCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graphs")
    
    
    private List<ListGraphsRespGraphs> graphs = null;
    
    public ListGraphs2Response withGraphCount(Integer graphCount) {
        this.graphCount = graphCount;
        return this;
    }

    


    /**
     * 图总个数。请求失败时为空。
     * @return graphCount
     */
    public Integer getGraphCount() {
        return graphCount;
    }

    public void setGraphCount(Integer graphCount) {
        this.graphCount = graphCount;
    }

    

    public ListGraphs2Response withGraphs(List<ListGraphsRespGraphs> graphs) {
        this.graphs = graphs;
        return this;
    }

    
    public ListGraphs2Response addGraphsItem(ListGraphsRespGraphs graphsItem) {
        if(this.graphs == null) {
            this.graphs = new ArrayList<>();
        }
        this.graphs.add(graphsItem);
        return this;
    }

    public ListGraphs2Response withGraphs(Consumer<List<ListGraphsRespGraphs>> graphsSetter) {
        if(this.graphs == null) {
            this.graphs = new ArrayList<>();
        }
        graphsSetter.accept(this.graphs);
        return this;
    }

    /**
     * 图列表。请求失败时为空。
     * @return graphs
     */
    public List<ListGraphsRespGraphs> getGraphs() {
        return graphs;
    }

    public void setGraphs(List<ListGraphsRespGraphs> graphs) {
        this.graphs = graphs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGraphs2Response listGraphs2Response = (ListGraphs2Response) o;
        return Objects.equals(this.graphCount, listGraphs2Response.graphCount) &&
            Objects.equals(this.graphs, listGraphs2Response.graphs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graphCount, graphs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGraphs2Response {\n");
        sb.append("    graphCount: ").append(toIndentedString(graphCount)).append("\n");
        sb.append("    graphs: ").append(toIndentedString(graphs)).append("\n");
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

