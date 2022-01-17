package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** FailoverStrategyRequest */
public class FailoverStrategyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repairStrategy")

    private String repairStrategy;

    public FailoverStrategyRequest withRepairStrategy(String repairStrategy) {
        this.repairStrategy = repairStrategy;
        return this;
    }

    /** 可用性策略，可选择如下方式： - reliability：可靠性优先，数据库应该尽可能保障数据的可靠性，即数据丢失量最少。对于数据一致性要求较高的业务，建议选择该策略。 -
     * availability：可用性优先，数据库应该可快恢复服务，即可用时间最长。对于数据库在线时间要求较高的业务，建议选择该策略。
     * 
     * @return repairStrategy */
    public String getRepairStrategy() {
        return repairStrategy;
    }

    public void setRepairStrategy(String repairStrategy) {
        this.repairStrategy = repairStrategy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailoverStrategyRequest failoverStrategyRequest = (FailoverStrategyRequest) o;
        return Objects.equals(this.repairStrategy, failoverStrategyRequest.repairStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repairStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailoverStrategyRequest {\n");
        sb.append("    repairStrategy: ").append(toIndentedString(repairStrategy)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
