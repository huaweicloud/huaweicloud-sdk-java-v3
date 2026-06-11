package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可视化作业或训练作业调试模式的可视化日志输入，训练作业高级功能开启\&quot;tensorboard/enable\&quot;: \&quot;true\&quot;或\&quot;mindstudio-insight/enable\&quot;: \&quot;true\&quot;时必填。
 */
public class DataSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private JobSummary job;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nfs")

    private NFSSummary nfs;

    public DataSource withJob(JobSummary job) {
        this.job = job;
        return this;
    }

    public DataSource withJob(Consumer<JobSummary> jobSetter) {
        if (this.job == null) {
            this.job = new JobSummary();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public JobSummary getJob() {
        return job;
    }

    public void setJob(JobSummary job) {
        this.job = job;
    }

    public DataSource withNfs(NFSSummary nfs) {
        this.nfs = nfs;
        return this;
    }

    public DataSource withNfs(Consumer<NFSSummary> nfsSetter) {
        if (this.nfs == null) {
            this.nfs = new NFSSummary();
            nfsSetter.accept(this.nfs);
        }

        return this;
    }

    /**
     * Get nfs
     * @return nfs
     */
    public NFSSummary getNfs() {
        return nfs;
    }

    public void setNfs(NFSSummary nfs) {
        this.nfs = nfs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataSource that = (DataSource) obj;
        return Objects.equals(this.job, that.job) && Objects.equals(this.nfs, that.nfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job, nfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSource {\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
        sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
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
