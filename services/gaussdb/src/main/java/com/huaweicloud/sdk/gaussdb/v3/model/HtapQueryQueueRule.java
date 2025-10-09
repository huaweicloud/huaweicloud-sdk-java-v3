package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  HTAP标准版查询队列规则。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认值**：  不涉及。
 */
public class HtapQueryQueueRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_queue_max_queued_queries")

    private Integer queryQueueMaxQueuedQueries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_queue_pending_timeout_second")

    private Integer queryQueuePendingTimeoutSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_queue_concurrency_limit")

    private Integer queryQueueConcurrencyLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_queue_mem_used_pct_limit")

    private Integer queryQueueMemUsedPctLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_queue_cpu_used_pct_limit")

    private Integer queryQueueCpuUsedPctLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_query_queue_select")

    private String enableQueryQueueSelect;

    public HtapQueryQueueRule withQueryQueueMaxQueuedQueries(Integer queryQueueMaxQueuedQueries) {
        this.queryQueueMaxQueuedQueries = queryQueueMaxQueuedQueries;
        return this;
    }

    /**
     * **参数解释**：  查询队列中的查询数量上限。  **约束限制**：  不涉及。  **取值范围**：  非负整数。  **默认值**：  1024。
     * @return queryQueueMaxQueuedQueries
     */
    public Integer getQueryQueueMaxQueuedQueries() {
        return queryQueueMaxQueuedQueries;
    }

    public void setQueryQueueMaxQueuedQueries(Integer queryQueueMaxQueuedQueries) {
        this.queryQueueMaxQueuedQueries = queryQueueMaxQueuedQueries;
    }

    public HtapQueryQueueRule withQueryQueuePendingTimeoutSecond(Integer queryQueuePendingTimeoutSecond) {
        this.queryQueuePendingTimeoutSecond = queryQueuePendingTimeoutSecond;
        return this;
    }

    /**
     * **参数解释**：  查询阻塞时间上限。  **约束限制**：  不涉及。  **取值范围**：  非负整数。  **默认值**：  300。
     * @return queryQueuePendingTimeoutSecond
     */
    public Integer getQueryQueuePendingTimeoutSecond() {
        return queryQueuePendingTimeoutSecond;
    }

    public void setQueryQueuePendingTimeoutSecond(Integer queryQueuePendingTimeoutSecond) {
        this.queryQueuePendingTimeoutSecond = queryQueuePendingTimeoutSecond;
    }

    public HtapQueryQueueRule withQueryQueueConcurrencyLimit(Integer queryQueueConcurrencyLimit) {
        this.queryQueueConcurrencyLimit = queryQueueConcurrencyLimit;
        return this;
    }

    /**
     * **参数解释**：  查询队列并发值。  **约束限制**：  不涉及。  **取值范围**：  0~100的整数，0表示没有限制。  **默认值**：  0。
     * @return queryQueueConcurrencyLimit
     */
    public Integer getQueryQueueConcurrencyLimit() {
        return queryQueueConcurrencyLimit;
    }

    public void setQueryQueueConcurrencyLimit(Integer queryQueueConcurrencyLimit) {
        this.queryQueueConcurrencyLimit = queryQueueConcurrencyLimit;
    }

    public HtapQueryQueueRule withQueryQueueMemUsedPctLimit(Integer queryQueueMemUsedPctLimit) {
        this.queryQueueMemUsedPctLimit = queryQueueMemUsedPctLimit;
        return this;
    }

    /**
     * **参数解释**：  内存使用百分比。  **约束限制**：  不涉及。  **取值范围**：  0~100的整数，0表示没有限制。  **默认值**：  0。
     * @return queryQueueMemUsedPctLimit
     */
    public Integer getQueryQueueMemUsedPctLimit() {
        return queryQueueMemUsedPctLimit;
    }

    public void setQueryQueueMemUsedPctLimit(Integer queryQueueMemUsedPctLimit) {
        this.queryQueueMemUsedPctLimit = queryQueueMemUsedPctLimit;
    }

    public HtapQueryQueueRule withQueryQueueCpuUsedPctLimit(Integer queryQueueCpuUsedPctLimit) {
        this.queryQueueCpuUsedPctLimit = queryQueueCpuUsedPctLimit;
        return this;
    }

    /**
     * **参数解释**：  CPU使用百分比。  **约束限制**：  不涉及。  **取值范围**：  0~100的整数，0表示没有限制。  **默认值**：  0。
     * @return queryQueueCpuUsedPctLimit
     */
    public Integer getQueryQueueCpuUsedPctLimit() {
        return queryQueueCpuUsedPctLimit;
    }

    public void setQueryQueueCpuUsedPctLimit(Integer queryQueueCpuUsedPctLimit) {
        this.queryQueueCpuUsedPctLimit = queryQueueCpuUsedPctLimit;
    }

    public HtapQueryQueueRule withEnableQueryQueueSelect(String enableQueryQueueSelect) {
        this.enableQueryQueueSelect = enableQueryQueueSelect;
        return this;
    }

    /**
     * **参数解释**：  查询队列开关状态。  **约束限制**：  不涉及。  **取值范围**：  - true：表示开启。 - false：表示关闭。  **默认值**：  false。
     * @return enableQueryQueueSelect
     */
    public String getEnableQueryQueueSelect() {
        return enableQueryQueueSelect;
    }

    public void setEnableQueryQueueSelect(String enableQueryQueueSelect) {
        this.enableQueryQueueSelect = enableQueryQueueSelect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HtapQueryQueueRule that = (HtapQueryQueueRule) obj;
        return Objects.equals(this.queryQueueMaxQueuedQueries, that.queryQueueMaxQueuedQueries)
            && Objects.equals(this.queryQueuePendingTimeoutSecond, that.queryQueuePendingTimeoutSecond)
            && Objects.equals(this.queryQueueConcurrencyLimit, that.queryQueueConcurrencyLimit)
            && Objects.equals(this.queryQueueMemUsedPctLimit, that.queryQueueMemUsedPctLimit)
            && Objects.equals(this.queryQueueCpuUsedPctLimit, that.queryQueueCpuUsedPctLimit)
            && Objects.equals(this.enableQueryQueueSelect, that.enableQueryQueueSelect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryQueueMaxQueuedQueries,
            queryQueuePendingTimeoutSecond,
            queryQueueConcurrencyLimit,
            queryQueueMemUsedPctLimit,
            queryQueueCpuUsedPctLimit,
            enableQueryQueueSelect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HtapQueryQueueRule {\n");
        sb.append("    queryQueueMaxQueuedQueries: ").append(toIndentedString(queryQueueMaxQueuedQueries)).append("\n");
        sb.append("    queryQueuePendingTimeoutSecond: ")
            .append(toIndentedString(queryQueuePendingTimeoutSecond))
            .append("\n");
        sb.append("    queryQueueConcurrencyLimit: ").append(toIndentedString(queryQueueConcurrencyLimit)).append("\n");
        sb.append("    queryQueueMemUsedPctLimit: ").append(toIndentedString(queryQueueMemUsedPctLimit)).append("\n");
        sb.append("    queryQueueCpuUsedPctLimit: ").append(toIndentedString(queryQueueCpuUsedPctLimit)).append("\n");
        sb.append("    enableQueryQueueSelect: ").append(toIndentedString(enableQueryQueueSelect)).append("\n");
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
