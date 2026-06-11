package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练实验的统计数据。
 */
public class TrainingExperimentStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_count")

    private Integer jobCount;

    public TrainingExperimentStatistic withJobCount(Integer jobCount) {
        this.jobCount = jobCount;
        return this;
    }

    /**
     * **参数解释**：当前实验下的训练作业总个数。 **取值范围**：不涉及。
     * @return jobCount
     */
    public Integer getJobCount() {
        return jobCount;
    }

    public void setJobCount(Integer jobCount) {
        this.jobCount = jobCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrainingExperimentStatistic that = (TrainingExperimentStatistic) obj;
        return Objects.equals(this.jobCount, that.jobCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrainingExperimentStatistic {\n");
        sb.append("    jobCount: ").append(toIndentedString(jobCount)).append("\n");
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
