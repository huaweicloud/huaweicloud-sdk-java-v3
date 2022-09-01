package com.huaweicloud.sdk.dds.v3.model;

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
public class ListErrorLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_log_list")

    @JacksonXmlProperty(localName = "error_log_list")

    private List<ErrorlogResult> errorLogList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_record")

    @JacksonXmlProperty(localName = "total_record")

    private Integer totalRecord;

    public ListErrorLogsResponse withErrorLogList(List<ErrorlogResult> errorLogList) {
        this.errorLogList = errorLogList;
        return this;
    }

    public ListErrorLogsResponse addErrorLogListItem(ErrorlogResult errorLogListItem) {
        if (this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        this.errorLogList.add(errorLogListItem);
        return this;
    }

    public ListErrorLogsResponse withErrorLogList(Consumer<List<ErrorlogResult>> errorLogListSetter) {
        if (this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        errorLogListSetter.accept(this.errorLogList);
        return this;
    }

    /**
     * 具体信息。
     * @return errorLogList
     */
    public List<ErrorlogResult> getErrorLogList() {
        return errorLogList;
    }

    public void setErrorLogList(List<ErrorlogResult> errorLogList) {
        this.errorLogList = errorLogList;
    }

    public ListErrorLogsResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    /**
     * 数据库版本总记录数。
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListErrorLogsResponse listErrorLogsResponse = (ListErrorLogsResponse) o;
        return Objects.equals(this.errorLogList, listErrorLogsResponse.errorLogList)
            && Objects.equals(this.totalRecord, listErrorLogsResponse.totalRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorLogList, totalRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListErrorLogsResponse {\n");
        sb.append("    errorLogList: ").append(toIndentedString(errorLogList)).append("\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
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
