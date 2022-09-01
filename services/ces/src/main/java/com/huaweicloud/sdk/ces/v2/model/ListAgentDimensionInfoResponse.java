package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAgentDimensionInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    @JacksonXmlProperty(localName = "dimensions")

    private List<AgentDimension> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    public ListAgentDimensionInfoResponse withDimensions(List<AgentDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ListAgentDimensionInfoResponse addDimensionsItem(AgentDimension dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ListAgentDimensionInfoResponse withDimensions(Consumer<List<AgentDimension>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 维度信息
     * @return dimensions
     */
    public List<AgentDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<AgentDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public ListAgentDimensionInfoResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 维度信息总数
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAgentDimensionInfoResponse listAgentDimensionInfoResponse = (ListAgentDimensionInfoResponse) o;
        return Objects.equals(this.dimensions, listAgentDimensionInfoResponse.dimensions)
            && Objects.equals(this.count, listAgentDimensionInfoResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentDimensionInfoResponse {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
