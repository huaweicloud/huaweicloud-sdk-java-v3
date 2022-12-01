package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新单个任务请求体。
 */
public class SingleUpdateJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private UpdateJobReq job;

    public SingleUpdateJobReq withJob(UpdateJobReq job) {
        this.job = job;
        return this;
    }

    public SingleUpdateJobReq withJob(Consumer<UpdateJobReq> jobSetter) {
        if (this.job == null) {
            this.job = new UpdateJobReq();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public UpdateJobReq getJob() {
        return job;
    }

    public void setJob(UpdateJobReq job) {
        this.job = job;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SingleUpdateJobReq singleUpdateJobReq = (SingleUpdateJobReq) o;
        return Objects.equals(this.job, singleUpdateJobReq.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SingleUpdateJobReq {\n");
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
