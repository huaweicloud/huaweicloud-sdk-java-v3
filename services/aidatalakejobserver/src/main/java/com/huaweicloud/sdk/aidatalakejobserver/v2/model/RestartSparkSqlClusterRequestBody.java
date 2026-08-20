package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：重启SparkSql集群的请求参数。 
 */
public class RestartSparkSqlClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_strategy")

    private SparkSqlRestartStrategy restartStrategy;

    public RestartSparkSqlClusterRequestBody withRestartStrategy(SparkSqlRestartStrategy restartStrategy) {
        this.restartStrategy = restartStrategy;
        return this;
    }

    /**
     * Get restartStrategy
     * @return restartStrategy
     */
    public SparkSqlRestartStrategy getRestartStrategy() {
        return restartStrategy;
    }

    public void setRestartStrategy(SparkSqlRestartStrategy restartStrategy) {
        this.restartStrategy = restartStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestartSparkSqlClusterRequestBody that = (RestartSparkSqlClusterRequestBody) obj;
        return Objects.equals(this.restartStrategy, that.restartStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restartStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartSparkSqlClusterRequestBody {\n");
        sb.append("    restartStrategy: ").append(toIndentedString(restartStrategy)).append("\n");
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
