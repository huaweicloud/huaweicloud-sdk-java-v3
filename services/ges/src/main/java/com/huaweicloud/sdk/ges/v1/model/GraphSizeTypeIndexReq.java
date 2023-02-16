package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GraphSizeTypeIndexReq
 */
public class GraphSizeTypeIndexReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graphSizeTypeIndex")
    
    
    private String graphSizeTypeIndex;

    public GraphSizeTypeIndexReq withGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
        return this;
    }

    


    /**
     * 图规格类型，当前支持取值为\"2\",\"3\",\"4\",\"5\"分别代表扩容成千万边、一亿边、十亿边、百亿边规格的图
     * @return graphSizeTypeIndex
     */
    public String getGraphSizeTypeIndex() {
        return graphSizeTypeIndex;
    }

    public void setGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GraphSizeTypeIndexReq graphSizeTypeIndexReq = (GraphSizeTypeIndexReq) o;
        return Objects.equals(this.graphSizeTypeIndex, graphSizeTypeIndexReq.graphSizeTypeIndex);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graphSizeTypeIndex);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GraphSizeTypeIndexReq {\n");
        sb.append("    graphSizeTypeIndex: ").append(toIndentedString(graphSizeTypeIndex)).append("\n");
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

