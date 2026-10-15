package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：变更后的资源配置。 **取值范围**：不涉及。
 */
public class AutoscalingHistoryNewResourceSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallelism")

    private Map<String, Integer> parallelism = null;

    public AutoscalingHistoryNewResourceSetting withParallelism(Map<String, Integer> parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public AutoscalingHistoryNewResourceSetting putParallelismItem(String key, Integer parallelismItem) {
        if (this.parallelism == null) {
            this.parallelism = new HashMap<>();
        }
        this.parallelism.put(key, parallelismItem);
        return this;
    }

    public AutoscalingHistoryNewResourceSetting withParallelism(Consumer<Map<String, Integer>> parallelismSetter) {
        if (this.parallelism == null) {
            this.parallelism = new HashMap<>();
        }
        parallelismSetter.accept(this.parallelism);
        return this;
    }

    /**
     * **参数解释**：变更后各算子的并行度，key为算子ID，value为并行度。 **取值范围**：不涉及。
     * @return parallelism
     */
    public Map<String, Integer> getParallelism() {
        return parallelism;
    }

    public void setParallelism(Map<String, Integer> parallelism) {
        this.parallelism = parallelism;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoscalingHistoryNewResourceSetting that = (AutoscalingHistoryNewResourceSetting) obj;
        return Objects.equals(this.parallelism, that.parallelism);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parallelism);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoscalingHistoryNewResourceSetting {\n");
        sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
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
