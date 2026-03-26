package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 运行作业的输入请求
 */
public class RunJobInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private JobRef job;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    public RunJobInput withJob(JobRef job) {
        this.job = job;
        return this;
    }

    public RunJobInput withJob(Consumer<JobRef> jobSetter) {
        if (this.job == null) {
            this.job = new JobRef();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public JobRef getJob() {
        return job;
    }

    public void setJob(JobRef job) {
        this.job = job;
    }

    public RunJobInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业运行的名称，只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunJobInput withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * endpoint空间id
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunJobInput that = (RunJobInput) obj;
        return Objects.equals(this.job, that.job) && Objects.equals(this.name, that.name)
            && Objects.equals(this.endpointId, that.endpointId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job, name, endpointId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunJobInput {\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
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
