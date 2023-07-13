package com.huaweicloud.sdk.osm.v2.model;

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
public class ListHistorySessionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_list")

    private List<OperateHistorySession> sessionList = null;

    public ListHistorySessionsResponse withTotalCount(Integer totalCount) {
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

    public ListHistorySessionsResponse withSessionList(List<OperateHistorySession> sessionList) {
        this.sessionList = sessionList;
        return this;
    }

    public ListHistorySessionsResponse addSessionListItem(OperateHistorySession sessionListItem) {
        if (this.sessionList == null) {
            this.sessionList = new ArrayList<>();
        }
        this.sessionList.add(sessionListItem);
        return this;
    }

    public ListHistorySessionsResponse withSessionList(Consumer<List<OperateHistorySession>> sessionListSetter) {
        if (this.sessionList == null) {
            this.sessionList = new ArrayList<>();
        }
        sessionListSetter.accept(this.sessionList);
        return this;
    }

    /**
     * 会话列表
     * @return sessionList
     */
    public List<OperateHistorySession> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<OperateHistorySession> sessionList) {
        this.sessionList = sessionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHistorySessionsResponse that = (ListHistorySessionsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.sessionList, that.sessionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, sessionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistorySessionsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    sessionList: ").append(toIndentedString(sessionList)).append("\n");
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
