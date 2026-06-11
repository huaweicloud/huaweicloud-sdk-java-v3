package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkflowsOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat")

    private Map<String, Integer> stat = null;

    public ShowWorkflowsOverviewResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowWorkflowsOverviewResponse withStat(Map<String, Integer> stat) {
        this.stat = stat;
        return this;
    }

    public ShowWorkflowsOverviewResponse putStatItem(String key, Integer statItem) {
        if (this.stat == null) {
            this.stat = new HashMap<>();
        }
        this.stat.put(key, statItem);
        return this;
    }

    public ShowWorkflowsOverviewResponse withStat(Consumer<Map<String, Integer>> statSetter) {
        if (this.stat == null) {
            this.stat = new HashMap<>();
        }
        statSetter.accept(this.stat);
        return this;
    }

    /**
     * 状态。
     * @return stat
     */
    public Map<String, Integer> getStat() {
        return stat;
    }

    public void setStat(Map<String, Integer> stat) {
        this.stat = stat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkflowsOverviewResponse that = (ShowWorkflowsOverviewResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.stat, that.stat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, stat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowsOverviewResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
