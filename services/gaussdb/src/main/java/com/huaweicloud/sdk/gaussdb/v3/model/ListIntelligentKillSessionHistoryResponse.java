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
public class ListIntelligentKillSessionHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intelligent_kill_session_histories")

    private List<IntelligentKillSessionHistory> intelligentKillSessionHistories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListIntelligentKillSessionHistoryResponse withIntelligentKillSessionHistories(
        List<IntelligentKillSessionHistory> intelligentKillSessionHistories) {
        this.intelligentKillSessionHistories = intelligentKillSessionHistories;
        return this;
    }

    public ListIntelligentKillSessionHistoryResponse addIntelligentKillSessionHistoriesItem(
        IntelligentKillSessionHistory intelligentKillSessionHistoriesItem) {
        if (this.intelligentKillSessionHistories == null) {
            this.intelligentKillSessionHistories = new ArrayList<>();
        }
        this.intelligentKillSessionHistories.add(intelligentKillSessionHistoriesItem);
        return this;
    }

    public ListIntelligentKillSessionHistoryResponse withIntelligentKillSessionHistories(
        Consumer<List<IntelligentKillSessionHistory>> intelligentKillSessionHistoriesSetter) {
        if (this.intelligentKillSessionHistories == null) {
            this.intelligentKillSessionHistories = new ArrayList<>();
        }
        intelligentKillSessionHistoriesSetter.accept(this.intelligentKillSessionHistories);
        return this;
    }

    /**
     * **参数解释**：  智能Kill会话历史记录列表。
     * @return intelligentKillSessionHistories
     */
    public List<IntelligentKillSessionHistory> getIntelligentKillSessionHistories() {
        return intelligentKillSessionHistories;
    }

    public void setIntelligentKillSessionHistories(
        List<IntelligentKillSessionHistory> intelligentKillSessionHistories) {
        this.intelligentKillSessionHistories = intelligentKillSessionHistories;
    }

    public ListIntelligentKillSessionHistoryResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  数据总数。  **取值范围**：  不涉及。
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
        ListIntelligentKillSessionHistoryResponse that = (ListIntelligentKillSessionHistoryResponse) obj;
        return Objects.equals(this.intelligentKillSessionHistories, that.intelligentKillSessionHistories)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intelligentKillSessionHistories, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIntelligentKillSessionHistoryResponse {\n");
        sb.append("    intelligentKillSessionHistories: ")
            .append(toIndentedString(intelligentKillSessionHistories))
            .append("\n");
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
