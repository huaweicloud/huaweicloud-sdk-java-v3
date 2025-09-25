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
public class ShowSlowLogDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_list")

    private List<ShowStarRocksSlowLogDetail> slowLogList = null;

    public ShowSlowLogDetailResponse withSlowLogList(List<ShowStarRocksSlowLogDetail> slowLogList) {
        this.slowLogList = slowLogList;
        return this;
    }

    public ShowSlowLogDetailResponse addSlowLogListItem(ShowStarRocksSlowLogDetail slowLogListItem) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        this.slowLogList.add(slowLogListItem);
        return this;
    }

    public ShowSlowLogDetailResponse withSlowLogList(Consumer<List<ShowStarRocksSlowLogDetail>> slowLogListSetter) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        slowLogListSetter.accept(this.slowLogList);
        return this;
    }

    /**
     * **参数解释**：            慢日志列表。 
     * @return slowLogList
     */
    public List<ShowStarRocksSlowLogDetail> getSlowLogList() {
        return slowLogList;
    }

    public void setSlowLogList(List<ShowStarRocksSlowLogDetail> slowLogList) {
        this.slowLogList = slowLogList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlowLogDetailResponse that = (ShowSlowLogDetailResponse) obj;
        return Objects.equals(this.slowLogList, that.slowLogList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowLogList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowLogDetailResponse {\n");
        sb.append("    slowLogList: ").append(toIndentedString(slowLogList)).append("\n");
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
