package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：取消Flink作业的请求体。 **约束限制**：不涉及。 
 */
public class CancelFlinkJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_strategy")

    private FlinkJobCancelStrategy cancelStrategy;

    public CancelFlinkJobRequestBody withCancelStrategy(FlinkJobCancelStrategy cancelStrategy) {
        this.cancelStrategy = cancelStrategy;
        return this;
    }

    /**
     * Get cancelStrategy
     * @return cancelStrategy
     */
    public FlinkJobCancelStrategy getCancelStrategy() {
        return cancelStrategy;
    }

    public void setCancelStrategy(FlinkJobCancelStrategy cancelStrategy) {
        this.cancelStrategy = cancelStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CancelFlinkJobRequestBody that = (CancelFlinkJobRequestBody) obj;
        return Objects.equals(this.cancelStrategy, that.cancelStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cancelStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelFlinkJobRequestBody {\n");
        sb.append("    cancelStrategy: ").append(toIndentedString(cancelStrategy)).append("\n");
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
