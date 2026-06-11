package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAutoSearchParamsAnalysisResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private List<String> header = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<List<String>> data = null;

    public ShowAutoSearchParamsAnalysisResponse withHeader(List<String> header) {
        this.header = header;
        return this;
    }

    public ShowAutoSearchParamsAnalysisResponse addHeaderItem(String headerItem) {
        if (this.header == null) {
            this.header = new ArrayList<>();
        }
        this.header.add(headerItem);
        return this;
    }

    public ShowAutoSearchParamsAnalysisResponse withHeader(Consumer<List<String>> headerSetter) {
        if (this.header == null) {
            this.header = new ArrayList<>();
        }
        headerSetter.accept(this.header);
        return this;
    }

    /**
     * 超参搜索某个trial结果的字段信息。
     * @return header
     */
    public List<String> getHeader() {
        return header;
    }

    public void setHeader(List<String> header) {
        this.header = header;
    }

    public ShowAutoSearchParamsAnalysisResponse withData(List<List<String>> data) {
        this.data = data;
        return this;
    }

    public ShowAutoSearchParamsAnalysisResponse addDataItem(List<String> dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ShowAutoSearchParamsAnalysisResponse withData(Consumer<List<List<String>>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 超参搜索某个trial结果的每条数据列表。
     * @return data
     */
    public List<List<String>> getData() {
        return data;
    }

    public void setData(List<List<String>> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoSearchParamsAnalysisResponse that = (ShowAutoSearchParamsAnalysisResponse) obj;
        return Objects.equals(this.header, that.header) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoSearchParamsAnalysisResponse {\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
