package com.huaweicloud.sdk.osm.v2.model;

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
public class ListHistoryOperateLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ops_list")

    @JacksonXmlProperty(localName = "ops_list")

    private List<OperateLog> opsList = null;

    public ListHistoryOperateLogsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListHistoryOperateLogsResponse withOpsList(List<OperateLog> opsList) {
        this.opsList = opsList;
        return this;
    }

    public ListHistoryOperateLogsResponse addOpsListItem(OperateLog opsListItem) {
        if (this.opsList == null) {
            this.opsList = new ArrayList<>();
        }
        this.opsList.add(opsListItem);
        return this;
    }

    public ListHistoryOperateLogsResponse withOpsList(Consumer<List<OperateLog>> opsListSetter) {
        if (this.opsList == null) {
            this.opsList = new ArrayList<>();
        }
        opsListSetter.accept(this.opsList);
        return this;
    }

    /**
     * 操作列表
     * @return opsList
     */
    public List<OperateLog> getOpsList() {
        return opsList;
    }

    public void setOpsList(List<OperateLog> opsList) {
        this.opsList = opsList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHistoryOperateLogsResponse listHistoryOperateLogsResponse = (ListHistoryOperateLogsResponse) o;
        return Objects.equals(this.totalCount, listHistoryOperateLogsResponse.totalCount)
            && Objects.equals(this.opsList, listHistoryOperateLogsResponse.opsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, opsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryOperateLogsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    opsList: ").append(toIndentedString(opsList)).append("\n");
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
