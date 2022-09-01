package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFunctionVersionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    @JacksonXmlProperty(localName = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    @JacksonXmlProperty(localName = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxitems")

    @JacksonXmlProperty(localName = "maxitems")

    private String maxitems;

    public ListFunctionVersionsRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数的URN，详细解释见FunctionGraph函数模型的描述。
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public ListFunctionVersionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一次查询到的最后的记录位置。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListFunctionVersionsRequest withMaxitems(String maxitems) {
        this.maxitems = maxitems;
        return this;
    }

    /**
     * 每次查询获取的最大函数记录数量。
     * @return maxitems
     */
    public String getMaxitems() {
        return maxitems;
    }

    public void setMaxitems(String maxitems) {
        this.maxitems = maxitems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionVersionsRequest listFunctionVersionsRequest = (ListFunctionVersionsRequest) o;
        return Objects.equals(this.functionUrn, listFunctionVersionsRequest.functionUrn)
            && Objects.equals(this.marker, listFunctionVersionsRequest.marker)
            && Objects.equals(this.maxitems, listFunctionVersionsRequest.maxitems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, marker, maxitems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionVersionsRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    maxitems: ").append(toIndentedString(maxitems)).append("\n");
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
