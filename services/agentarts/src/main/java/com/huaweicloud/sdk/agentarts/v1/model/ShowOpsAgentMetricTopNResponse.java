package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ShowOpsAgentMetricTopNResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_list")

    private List<RowList> rowList = null;

    public ShowOpsAgentMetricTopNResponse withRowList(List<RowList> rowList) {
        this.rowList = rowList;
        return this;
    }

    public ShowOpsAgentMetricTopNResponse addRowListItem(RowList rowListItem) {
        if (this.rowList == null) {
            this.rowList = new ArrayList<>();
        }
        this.rowList.add(rowListItem);
        return this;
    }

    public ShowOpsAgentMetricTopNResponse withRowList(Consumer<List<RowList>> rowListSetter) {
        if (this.rowList == null) {
            this.rowList = new ArrayList<>();
        }
        rowListSetter.accept(this.rowList);
        return this;
    }

    /**
     * 数据
     * @return rowList
     */
    public List<RowList> getRowList() {
        return rowList;
    }

    public void setRowList(List<RowList> rowList) {
        this.rowList = rowList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsAgentMetricTopNResponse that = (ShowOpsAgentMetricTopNResponse) obj;
        return Objects.equals(this.rowList, that.rowList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsAgentMetricTopNResponse {\n");
        sb.append("    rowList: ").append(toIndentedString(rowList)).append("\n");
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
