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
public class ShowIntelligentKillSessionHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history")

    private List<IntelligentKillSessionHistory> history = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowIntelligentKillSessionHistoryResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowIntelligentKillSessionHistoryResponse withHistory(List<IntelligentKillSessionHistory> history) {
        this.history = history;
        return this;
    }

    public ShowIntelligentKillSessionHistoryResponse addHistoryItem(IntelligentKillSessionHistory historyItem) {
        if (this.history == null) {
            this.history = new ArrayList<>();
        }
        this.history.add(historyItem);
        return this;
    }

    public ShowIntelligentKillSessionHistoryResponse withHistory(
        Consumer<List<IntelligentKillSessionHistory>> historySetter) {
        if (this.history == null) {
            this.history = new ArrayList<>();
        }
        historySetter.accept(this.history);
        return this;
    }

    /**
     * 限流信息列表
     * @return history
     */
    public List<IntelligentKillSessionHistory> getHistory() {
        return history;
    }

    public void setHistory(List<IntelligentKillSessionHistory> history) {
        this.history = history;
    }

    public ShowIntelligentKillSessionHistoryResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 历史记录数量
     * minimum: 0
     * maximum: 512
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
        ShowIntelligentKillSessionHistoryResponse that = (ShowIntelligentKillSessionHistoryResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.history, that.history)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, history, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIntelligentKillSessionHistoryResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
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
