package com.huaweicloud.sdk.dc.v3.model;

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
public class ListSwitchoverTestRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchover_test_records")

    private List<SwitchoverTestRecord> switchoverTestRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListSwitchoverTestRecordsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 操作请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListSwitchoverTestRecordsResponse withSwitchoverTestRecords(
        List<SwitchoverTestRecord> switchoverTestRecords) {
        this.switchoverTestRecords = switchoverTestRecords;
        return this;
    }

    public ListSwitchoverTestRecordsResponse addSwitchoverTestRecordsItem(
        SwitchoverTestRecord switchoverTestRecordsItem) {
        if (this.switchoverTestRecords == null) {
            this.switchoverTestRecords = new ArrayList<>();
        }
        this.switchoverTestRecords.add(switchoverTestRecordsItem);
        return this;
    }

    public ListSwitchoverTestRecordsResponse withSwitchoverTestRecords(
        Consumer<List<SwitchoverTestRecord>> switchoverTestRecordsSetter) {
        if (this.switchoverTestRecords == null) {
            this.switchoverTestRecords = new ArrayList<>();
        }
        switchoverTestRecordsSetter.accept(this.switchoverTestRecords);
        return this;
    }

    /**
     * 倒换测试记录信息列表
     * @return switchoverTestRecords
     */
    public List<SwitchoverTestRecord> getSwitchoverTestRecords() {
        return switchoverTestRecords;
    }

    public void setSwitchoverTestRecords(List<SwitchoverTestRecord> switchoverTestRecords) {
        this.switchoverTestRecords = switchoverTestRecords;
    }

    public ListSwitchoverTestRecordsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListSwitchoverTestRecordsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSwitchoverTestRecordsResponse that = (ListSwitchoverTestRecordsResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.switchoverTestRecords, that.switchoverTestRecords)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, switchoverTestRecords, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSwitchoverTestRecordsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    switchoverTestRecords: ").append(toIndentedString(switchoverTestRecords)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
