package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WorkloadResourceQueue
 */
public class WorkloadResourceQueue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_query_optimize")

    private String shortQueryOptimize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_query_concurrency_num")

    private String shortQueryConcurrencyNum;

    public WorkloadResourceQueue withShortQueryOptimize(String shortQueryOptimize) {
        this.shortQueryOptimize = shortQueryOptimize;
        return this;
    }

    /**
     * **参数解释**： 工作负载队列短查询加速开关。 **约束限制**： 不涉及。 **取值范围**： - on：开启 - off：关闭 **默认取值**： on
     * @return shortQueryOptimize
     */
    public String getShortQueryOptimize() {
        return shortQueryOptimize;
    }

    public void setShortQueryOptimize(String shortQueryOptimize) {
        this.shortQueryOptimize = shortQueryOptimize;
    }

    public WorkloadResourceQueue withShortQueryConcurrencyNum(String shortQueryConcurrencyNum) {
        this.shortQueryConcurrencyNum = shortQueryConcurrencyNum;
        return this;
    }

    /**
     * **参数解释**： 工作负载队列短查询并发数。 **约束限制**： 不涉及。 **取值范围**： -1以上，-1表示不限制。 **默认取值**： -1
     * @return shortQueryConcurrencyNum
     */
    public String getShortQueryConcurrencyNum() {
        return shortQueryConcurrencyNum;
    }

    public void setShortQueryConcurrencyNum(String shortQueryConcurrencyNum) {
        this.shortQueryConcurrencyNum = shortQueryConcurrencyNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadResourceQueue that = (WorkloadResourceQueue) obj;
        return Objects.equals(this.shortQueryOptimize, that.shortQueryOptimize)
            && Objects.equals(this.shortQueryConcurrencyNum, that.shortQueryConcurrencyNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortQueryOptimize, shortQueryConcurrencyNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadResourceQueue {\n");
        sb.append("    shortQueryOptimize: ").append(toIndentedString(shortQueryOptimize)).append("\n");
        sb.append("    shortQueryConcurrencyNum: ").append(toIndentedString(shortQueryConcurrencyNum)).append("\n");
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
