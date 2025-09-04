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
public class ShowHtapErrorLogDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_log_list")

    private List<HtapErrorLogDetailResponseErrorLogList> errorLogList = null;

    public ShowHtapErrorLogDetailResponse withErrorLogList(List<HtapErrorLogDetailResponseErrorLogList> errorLogList) {
        this.errorLogList = errorLogList;
        return this;
    }

    public ShowHtapErrorLogDetailResponse addErrorLogListItem(HtapErrorLogDetailResponseErrorLogList errorLogListItem) {
        if (this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        this.errorLogList.add(errorLogListItem);
        return this;
    }

    public ShowHtapErrorLogDetailResponse withErrorLogList(
        Consumer<List<HtapErrorLogDetailResponseErrorLogList>> errorLogListSetter) {
        if (this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        errorLogListSetter.accept(this.errorLogList);
        return this;
    }

    /**
     * **参数解释**： 错误日志列表。  **约束限制**： 不涉及。
     * @return errorLogList
     */
    public List<HtapErrorLogDetailResponseErrorLogList> getErrorLogList() {
        return errorLogList;
    }

    public void setErrorLogList(List<HtapErrorLogDetailResponseErrorLogList> errorLogList) {
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
        ShowHtapErrorLogDetailResponse that = (ShowHtapErrorLogDetailResponse) obj;
        return Objects.equals(this.errorLogList, that.errorLogList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorLogList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHtapErrorLogDetailResponse {\n");
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
