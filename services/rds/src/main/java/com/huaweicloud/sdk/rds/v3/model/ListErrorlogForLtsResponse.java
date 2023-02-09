package com.huaweicloud.sdk.rds.v3.model;

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
public class ListErrorlogForLtsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_log_list")

    private List<ErrorLogItem> errorLogList = null;

    public ListErrorlogForLtsResponse withErrorLogList(List<ErrorLogItem> errorLogList) {
        this.errorLogList = errorLogList;
        return this;
    }

    public ListErrorlogForLtsResponse addErrorLogListItem(ErrorLogItem errorLogListItem) {
        if (this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        this.errorLogList.add(errorLogListItem);
        return this;
    }

    public ListErrorlogForLtsResponse withErrorLogList(Consumer<List<ErrorLogItem>> errorLogListSetter) {
        if (this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        errorLogListSetter.accept(this.errorLogList);
        return this;
    }

    /**
     * 日志数据集合。
     * @return errorLogList
     */
    public List<ErrorLogItem> getErrorLogList() {
        return errorLogList;
    }

    public void setErrorLogList(List<ErrorLogItem> errorLogList) {
        this.errorLogList = errorLogList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListErrorlogForLtsResponse listErrorlogForLtsResponse = (ListErrorlogForLtsResponse) o;
        return Objects.equals(this.errorLogList, listErrorlogForLtsResponse.errorLogList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorLogList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListErrorlogForLtsResponse {\n");
        sb.append("    errorLogList: ").append(toIndentedString(errorLogList)).append("\n");
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
