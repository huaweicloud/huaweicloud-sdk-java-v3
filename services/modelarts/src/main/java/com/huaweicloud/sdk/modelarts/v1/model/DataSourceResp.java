package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可视化作业或训练作业调试模式的可视化日志输入，训练作业高级功能开启\&quot;tensorboard/enable\&quot;: \&quot;true\&quot;或\&quot;mindstudio-insight/enable\&quot;: \&quot;true\&quot;时必填。
 */
public class DataSourceResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private JobSummaryResp job;

    public DataSourceResp withJob(JobSummaryResp job) {
        this.job = job;
        return this;
    }

    public DataSourceResp withJob(Consumer<JobSummaryResp> jobSetter) {
        if (this.job == null) {
            this.job = new JobSummaryResp();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public JobSummaryResp getJob() {
        return job;
    }

    public void setJob(JobSummaryResp job) {
        this.job = job;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataSourceResp that = (DataSourceResp) obj;
        return Objects.equals(this.job, that.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSourceResp {\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
