package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 重分布可设置的配置信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class RedistributionConf {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_jobs")

    private Integer parallelJobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_policy")

    private String priorityPolicy;

    public RedistributionConf withParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
        return this;
    }

    /**
     * **参数解释**： 并发数，默认并发数为4。 **约束限制**： 不涉及。 **取值范围**： 1~200 **默认取值**： 不涉及。
     * minimum: 1
     * maximum: 200
     * @return parallelJobs
     */
    public Integer getParallelJobs() {
        return parallelJobs;
    }

    public void setParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
    }

    public RedistributionConf withPriorityPolicy(String priorityPolicy) {
        this.priorityPolicy = priorityPolicy;
        return this;
    }

    /**
     * **参数解释**： 重分布优先级策略。 **约束限制**： 不涉及。 **取值范围**： - default：默认策略 - small：小表优先 - large：大表优先  **默认取值**： 不涉及。
     * @return priorityPolicy
     */
    public String getPriorityPolicy() {
        return priorityPolicy;
    }

    public void setPriorityPolicy(String priorityPolicy) {
        this.priorityPolicy = priorityPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedistributionConf that = (RedistributionConf) obj;
        return Objects.equals(this.parallelJobs, that.parallelJobs)
            && Objects.equals(this.priorityPolicy, that.priorityPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parallelJobs, priorityPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedistributionConf {\n");
        sb.append("    parallelJobs: ").append(toIndentedString(parallelJobs)).append("\n");
        sb.append("    priorityPolicy: ").append(toIndentedString(priorityPolicy)).append("\n");
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
