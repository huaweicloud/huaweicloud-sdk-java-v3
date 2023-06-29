package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * resize是一个对象
 */
public class ResizeGraphReqResize {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_size_type_index")

    private String graphSizeTypeIndex;

    public ResizeGraphReqResize withGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
        return this;
    }

    /**
     * 图规格类型，当前支持取值为\"2\",\"3\",\"4\",\"5\"分别代表扩容成千万边、一亿边、十亿边、百亿边规格的图。
     * @return graphSizeTypeIndex
     */
    public String getGraphSizeTypeIndex() {
        return graphSizeTypeIndex;
    }

    public void setGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeGraphReqResize that = (ResizeGraphReqResize) obj;
        return Objects.equals(this.graphSizeTypeIndex, that.graphSizeTypeIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graphSizeTypeIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeGraphReqResize {\n");
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
