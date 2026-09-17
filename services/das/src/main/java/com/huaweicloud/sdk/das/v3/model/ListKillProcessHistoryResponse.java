package com.huaweicloud.sdk.das.v3.model;

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
public class ListKillProcessHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "killed_sessions")

    private List<KillProcessHistoryInfo> killedSessions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListKillProcessHistoryResponse withKilledSessions(List<KillProcessHistoryInfo> killedSessions) {
        this.killedSessions = killedSessions;
        return this;
    }

    public ListKillProcessHistoryResponse addKilledSessionsItem(KillProcessHistoryInfo killedSessionsItem) {
        if (this.killedSessions == null) {
            this.killedSessions = new ArrayList<>();
        }
        this.killedSessions.add(killedSessionsItem);
        return this;
    }

    public ListKillProcessHistoryResponse withKilledSessions(
        Consumer<List<KillProcessHistoryInfo>> killedSessionsSetter) {
        if (this.killedSessions == null) {
            this.killedSessions = new ArrayList<>();
        }
        killedSessionsSetter.accept(this.killedSessions);
        return this;
    }

    /**
     * kill会话历史记录列表
     * @return killedSessions
     */
    public List<KillProcessHistoryInfo> getKilledSessions() {
        return killedSessions;
    }

    public void setKilledSessions(List<KillProcessHistoryInfo> killedSessions) {
        this.killedSessions = killedSessions;
    }

    public ListKillProcessHistoryResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 历史记录总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKillProcessHistoryResponse that = (ListKillProcessHistoryResponse) obj;
        return Objects.equals(this.killedSessions, that.killedSessions)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(killedSessions, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKillProcessHistoryResponse {\n");
        sb.append("    killedSessions: ").append(toIndentedString(killedSessions)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
