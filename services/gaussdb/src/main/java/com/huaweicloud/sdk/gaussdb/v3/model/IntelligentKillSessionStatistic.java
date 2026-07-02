package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IntelligentKillSessionStatistic
 */
public class IntelligentKillSessionStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "example_sql_text")

    private String exampleSqlText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<Long> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time")

    private Double totalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_time")

    private Double avgTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_time")

    private Double maxTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private String strategy;

    public IntelligentKillSessionStatistic withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * **参数解释**：  预览智能Kill会话SQL模板关键字。  **取值范围**：  不涉及。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public IntelligentKillSessionStatistic withExampleSqlText(String exampleSqlText) {
        this.exampleSqlText = exampleSqlText;
        return this;
    }

    /**
     * **参数解释**：  预览智能Kill会话中的SQL模板命中的首个会话正在执行的SQL语句。  **取值范围**：  不涉及。
     * @return exampleSqlText
     */
    public String getExampleSqlText() {
        return exampleSqlText;
    }

    public void setExampleSqlText(String exampleSqlText) {
        this.exampleSqlText = exampleSqlText;
    }

    public IntelligentKillSessionStatistic withIds(List<Long> ids) {
        this.ids = ids;
        return this;
    }

    public IntelligentKillSessionStatistic addIdsItem(Long idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public IntelligentKillSessionStatistic withIds(Consumer<List<Long>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * **参数解释**：  预览智能Kill会话中的SQL模板命中的会话线程ID列表。
     * @return ids
     */
    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public IntelligentKillSessionStatistic withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：  预览智能Kill会话中的SQL模板命中的会话个数。  **取值范围**：  >=0。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public IntelligentKillSessionStatistic withTotalTime(Double totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    /**
     * **参数解释**：  预览智能Kill会话中的SQL模板命中的会话总执行时间，单位为秒。  **取值范围**：  >=0。
     * @return totalTime
     */
    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    public IntelligentKillSessionStatistic withAvgTime(Double avgTime) {
        this.avgTime = avgTime;
        return this;
    }

    /**
     * **参数解释**：  预览智能Kill会话中的SQL模板命中的会话平均执行时间，单位为秒。  **取值范围**：  >=0。
     * @return avgTime
     */
    public Double getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(Double avgTime) {
        this.avgTime = avgTime;
    }

    public IntelligentKillSessionStatistic withMaxTime(Double maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    /**
     * **参数解释**：  预览智能Kill会话中的SQL模板命中的会话中最长会话执行时间，单位为秒。  **取值范围**：  >=0。
     * @return maxTime
     */
    public Double getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Double maxTime) {
        this.maxTime = maxTime;
    }

    public IntelligentKillSessionStatistic withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * **参数解释**：  预览智能Kill会话中的SQL模板命中Kill会话策略。  **取值范围**：  - top3_time: 以每组内会话最长的执行时长排序，选择排名前三的组内会话进行Kill。 - top3_count: 以每组内会话数量排序，选择排名前三的组内会话进行Kill。 - top3_avg_time: 以每组内会话平均执行时长排序，选择排名前三的组内会话进行Kill。
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntelligentKillSessionStatistic that = (IntelligentKillSessionStatistic) obj;
        return Objects.equals(this.keyword, that.keyword) && Objects.equals(this.exampleSqlText, that.exampleSqlText)
            && Objects.equals(this.ids, that.ids) && Objects.equals(this.count, that.count)
            && Objects.equals(this.totalTime, that.totalTime) && Objects.equals(this.avgTime, that.avgTime)
            && Objects.equals(this.maxTime, that.maxTime) && Objects.equals(this.strategy, that.strategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword, exampleSqlText, ids, count, totalTime, avgTime, maxTime, strategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntelligentKillSessionStatistic {\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    exampleSqlText: ").append(toIndentedString(exampleSqlText)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    avgTime: ").append(toIndentedString(avgTime)).append("\n");
        sb.append("    maxTime: ").append(toIndentedString(maxTime)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
