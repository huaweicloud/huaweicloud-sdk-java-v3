package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实时统计信息
 */
public class IntelligentKillSessionStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_sql")

    private String rawSql;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advice_concurrency")

    private Integer adviceConcurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public IntelligentKillSessionStatistic withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * **参数解释**：  该类统计维度下提取到的限流关键字。  **约束限制**：  不涉及。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public IntelligentKillSessionStatistic withRawSql(String rawSql) {
        this.rawSql = rawSql;
        return this;
    }

    /**
     * **参数解释**：  随机选取符合sql限流关键字的用户某条sql样例。  **约束限制**：  不涉及。
     * @return rawSql
     */
    public String getRawSql() {
        return rawSql;
    }

    public void setRawSql(String rawSql) {
        this.rawSql = rawSql;
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
     * **参数解释**：  符合该统计维度的线程id。  **约束限制**：  不涉及。
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
     * **参数解释**：  符合该统计维度的线程id总数量。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 1000
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
     * **参数解释**：  符合该统计维度的线程总执行时间。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 1E+13
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
     * **参数解释**：  符合该统计维度的线程平均执行时间。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 1E+13
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
     * **参数解释**：  符合该统计维度的线程最大执行时间。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 1E+13
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
     * **参数解释**：  统计维度。  **约束限制**：  不涉及。
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public IntelligentKillSessionStatistic withAdviceConcurrency(Integer adviceConcurrency) {
        this.adviceConcurrency = adviceConcurrency;
        return this;
    }

    /**
     * **参数解释**：  推荐最大并发数。type为\"kill\"时该参数没有返回值。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 1000000000
     * @return adviceConcurrency
     */
    public Integer getAdviceConcurrency() {
        return adviceConcurrency;
    }

    public void setAdviceConcurrency(Integer adviceConcurrency) {
        this.adviceConcurrency = adviceConcurrency;
    }

    public IntelligentKillSessionStatistic withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  该条维度数据的类型。\"kill\"表示当前统计时刻下一键kill会话下发后会kill该类会话；\"limit\"表示当前统计时刻下勾选\"同步开启sql限流和添加规则\"时会添加的规则。  **约束限制**：  不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return Objects.equals(this.keyword, that.keyword) && Objects.equals(this.rawSql, that.rawSql)
            && Objects.equals(this.ids, that.ids) && Objects.equals(this.count, that.count)
            && Objects.equals(this.totalTime, that.totalTime) && Objects.equals(this.avgTime, that.avgTime)
            && Objects.equals(this.maxTime, that.maxTime) && Objects.equals(this.strategy, that.strategy)
            && Objects.equals(this.adviceConcurrency, that.adviceConcurrency) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(keyword, rawSql, ids, count, totalTime, avgTime, maxTime, strategy, adviceConcurrency, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntelligentKillSessionStatistic {\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    rawSql: ").append(toIndentedString(rawSql)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    avgTime: ").append(toIndentedString(avgTime)).append("\n");
        sb.append("    maxTime: ").append(toIndentedString(maxTime)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    adviceConcurrency: ").append(toIndentedString(adviceConcurrency)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
