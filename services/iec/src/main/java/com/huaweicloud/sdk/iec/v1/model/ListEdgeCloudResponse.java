package com.huaweicloud.sdk.iec.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.EdgeCloud;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEdgeCloudResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgeclouds")
    
    private List<EdgeCloud> edgeclouds = null;
    
    public ListEdgeCloudResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 边缘业务数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ListEdgeCloudResponse withEdgeclouds(List<EdgeCloud> edgeclouds) {
        this.edgeclouds = edgeclouds;
        return this;
    }

    
    public ListEdgeCloudResponse addEdgecloudsItem(EdgeCloud edgecloudsItem) {
        if(this.edgeclouds == null) {
            this.edgeclouds = new ArrayList<>();
        }
        this.edgeclouds.add(edgecloudsItem);
        return this;
    }

    public ListEdgeCloudResponse withEdgeclouds(Consumer<List<EdgeCloud>> edgecloudsSetter) {
        if(this.edgeclouds == null) {
            this.edgeclouds = new ArrayList<>();
        }
        edgecloudsSetter.accept(this.edgeclouds);
        return this;
    }

    /**
     * 边缘业务列表。
     * @return edgeclouds
     */
    public List<EdgeCloud> getEdgeclouds() {
        return edgeclouds;
    }

    public void setEdgeclouds(List<EdgeCloud> edgeclouds) {
        this.edgeclouds = edgeclouds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEdgeCloudResponse listEdgeCloudResponse = (ListEdgeCloudResponse) o;
        return Objects.equals(this.count, listEdgeCloudResponse.count) &&
            Objects.equals(this.edgeclouds, listEdgeCloudResponse.edgeclouds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, edgeclouds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeCloudResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    edgeclouds: ").append(toIndentedString(edgeclouds)).append("\n");
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

