package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 添加队列属性。
 */
public class CreateQueueRequestBodyProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computeEngine.spark.nativeEnabled")

    private String computeEngineSparkNativeEnabled;

    public CreateQueueRequestBodyProperties withComputeEngineSparkNativeEnabled(
        String computeEngineSparkNativeEnabled) {
        this.computeEngineSparkNativeEnabled = computeEngineSparkNativeEnabled;
        return this;
    }

    /**
     * 是否使用DLI Native。当前只涉及开启两种算子：Scan 和 Filter。修改现有队列的本属性，需要重启队列才会生效。
     * @return computeEngineSparkNativeEnabled
     */
    public String getComputeEngineSparkNativeEnabled() {
        return computeEngineSparkNativeEnabled;
    }

    public void setComputeEngineSparkNativeEnabled(String computeEngineSparkNativeEnabled) {
        this.computeEngineSparkNativeEnabled = computeEngineSparkNativeEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateQueueRequestBodyProperties that = (CreateQueueRequestBodyProperties) obj;
        return Objects.equals(this.computeEngineSparkNativeEnabled, that.computeEngineSparkNativeEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computeEngineSparkNativeEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateQueueRequestBodyProperties {\n");
        sb.append("    computeEngineSparkNativeEnabled: ")
            .append(toIndentedString(computeEngineSparkNativeEnabled))
            .append("\n");
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
