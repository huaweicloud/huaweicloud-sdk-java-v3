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
public class ListOpsSessionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_list")

    private List<OpsSessionDetail> sessionList = null;

    public ListOpsSessionResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 1000000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsSessionResponse withSessionList(List<OpsSessionDetail> sessionList) {
        this.sessionList = sessionList;
        return this;
    }

    public ListOpsSessionResponse addSessionListItem(OpsSessionDetail sessionListItem) {
        if (this.sessionList == null) {
            this.sessionList = new ArrayList<>();
        }
        this.sessionList.add(sessionListItem);
        return this;
    }

    public ListOpsSessionResponse withSessionList(Consumer<List<OpsSessionDetail>> sessionListSetter) {
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
    public List<OpsSessionDetail> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<OpsSessionDetail> sessionList) {
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
        ListOpsSessionResponse that = (ListOpsSessionResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.sessionList, that.sessionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, sessionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsSessionResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
