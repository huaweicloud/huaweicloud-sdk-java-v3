package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListLtsErrorLogDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_log_list")

    private List<LtsLogErrorDetail> errorLogList = null;

    public ListLtsErrorLogDetailsResponse withErrorLogList(List<LtsLogErrorDetail> errorLogList) {
        this.errorLogList = errorLogList;
        return this;
    }

    public ListLtsErrorLogDetailsResponse addErrorLogListItem(LtsLogErrorDetail errorLogListItem) {
        if (this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        this.errorLogList.add(errorLogListItem);
        return this;
    }

    public ListLtsErrorLogDetailsResponse withErrorLogList(Consumer<List<LtsLogErrorDetail>> errorLogListSetter) {
        if (this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        errorLogListSetter.accept(this.errorLogList);
        return this;
    }

    /**
     * 错误日志列表。
     * @return errorLogList
     */
    public List<LtsLogErrorDetail> getErrorLogList() {
        return errorLogList;
    }

    public void setErrorLogList(List<LtsLogErrorDetail> errorLogList) {
        this.errorLogList = errorLogList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLtsErrorLogDetailsResponse that = (ListLtsErrorLogDetailsResponse) obj;
        return Objects.equals(this.errorLogList, that.errorLogList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorLogList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLtsErrorLogDetailsResponse {\n");
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
