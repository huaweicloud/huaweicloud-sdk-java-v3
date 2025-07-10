package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobPipelineInfoItems
 */
public class JobPipelineInfoItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scms")

    private List<CreateBuildJobScm> scms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<JobPipelineInfoParameters> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name_massage")

    private String jobNameMassage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name_regex")

    private String jobNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_code")

    private String sourceCode;

    public JobPipelineInfoItems withScms(List<CreateBuildJobScm> scms) {
        this.scms = scms;
        return this;
    }

    public JobPipelineInfoItems addScmsItem(CreateBuildJobScm scmsItem) {
        if (this.scms == null) {
            this.scms = new ArrayList<>();
        }
        this.scms.add(scmsItem);
        return this;
    }

    public JobPipelineInfoItems withScms(Consumer<List<CreateBuildJobScm>> scmsSetter) {
        if (this.scms == null) {
            this.scms = new ArrayList<>();
        }
        scmsSetter.accept(this.scms);
        return this;
    }

    /**
     * 构建执行SCM
     * @return scms
     */
    public List<CreateBuildJobScm> getScms() {
        return scms;
    }

    public void setScms(List<CreateBuildJobScm> scms) {
        this.scms = scms;
    }

    public JobPipelineInfoItems withParameters(List<JobPipelineInfoParameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    public JobPipelineInfoItems addParametersItem(JobPipelineInfoParameters parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public JobPipelineInfoItems withParameters(Consumer<List<JobPipelineInfoParameters>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 参数
     * @return parameters
     */
    public List<JobPipelineInfoParameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<JobPipelineInfoParameters> parameters) {
        this.parameters = parameters;
    }

    public JobPipelineInfoItems withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 任务名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobPipelineInfoItems withJobNameMassage(String jobNameMassage) {
        this.jobNameMassage = jobNameMassage;
        return this;
    }

    /**
     * 任务名称信息
     * @return jobNameMassage
     */
    public String getJobNameMassage() {
        return jobNameMassage;
    }

    public void setJobNameMassage(String jobNameMassage) {
        this.jobNameMassage = jobNameMassage;
    }

    public JobPipelineInfoItems withJobNameRegex(String jobNameRegex) {
        this.jobNameRegex = jobNameRegex;
        return this;
    }

    /**
     * 任务名称正则
     * @return jobNameRegex
     */
    public String getJobNameRegex() {
        return jobNameRegex;
    }

    public void setJobNameRegex(String jobNameRegex) {
        this.jobNameRegex = jobNameRegex;
    }

    public JobPipelineInfoItems withSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    /**
     * 任务名称正则
     * @return sourceCode
     */
    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobPipelineInfoItems that = (JobPipelineInfoItems) obj;
        return Objects.equals(this.scms, that.scms) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.jobNameMassage, that.jobNameMassage)
            && Objects.equals(this.jobNameRegex, that.jobNameRegex) && Objects.equals(this.sourceCode, that.sourceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scms, parameters, jobName, jobNameMassage, jobNameRegex, sourceCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobPipelineInfoItems {\n");
        sb.append("    scms: ").append(toIndentedString(scms)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobNameMassage: ").append(toIndentedString(jobNameMassage)).append("\n");
        sb.append("    jobNameRegex: ").append(toIndentedString(jobNameRegex)).append("\n");
        sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
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
