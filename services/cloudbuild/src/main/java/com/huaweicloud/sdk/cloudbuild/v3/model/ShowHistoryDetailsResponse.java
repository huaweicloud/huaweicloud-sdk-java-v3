package com.huaweicloud.sdk.cloudbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHistoryDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_number")

    private Integer buildNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, String> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_steps")

    private List<BuildStep> buildSteps = null;

    public ShowHistoryDetailsResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 构建任务名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowHistoryDetailsResponse withBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
        return this;
    }

    /**
     * 构建编号
     * @return buildNumber
     */
    public Integer getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
    }

    public ShowHistoryDetailsResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 构建任务所在项目的ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowHistoryDetailsResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 构建任务所在项目的名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ShowHistoryDetailsResponse withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ShowHistoryDetailsResponse putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public ShowHistoryDetailsResponse withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 本次构建的参数，Map类型，敏感参数值返回*号
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public ShowHistoryDetailsResponse withBuildSteps(List<BuildStep> buildSteps) {
        this.buildSteps = buildSteps;
        return this;
    }

    public ShowHistoryDetailsResponse addBuildStepsItem(BuildStep buildStepsItem) {
        if (this.buildSteps == null) {
            this.buildSteps = new ArrayList<>();
        }
        this.buildSteps.add(buildStepsItem);
        return this;
    }

    public ShowHistoryDetailsResponse withBuildSteps(Consumer<List<BuildStep>> buildStepsSetter) {
        if (this.buildSteps == null) {
            this.buildSteps = new ArrayList<>();
        }
        buildStepsSetter.accept(this.buildSteps);
        return this;
    }

    /**
     * 本次任务的构建步骤详情，返回的步骤为页面可见步骤
     * @return buildSteps
     */
    public List<BuildStep> getBuildSteps() {
        return buildSteps;
    }

    public void setBuildSteps(List<BuildStep> buildSteps) {
        this.buildSteps = buildSteps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHistoryDetailsResponse showHistoryDetailsResponse = (ShowHistoryDetailsResponse) o;
        return Objects.equals(this.jobName, showHistoryDetailsResponse.jobName)
            && Objects.equals(this.buildNumber, showHistoryDetailsResponse.buildNumber)
            && Objects.equals(this.projectId, showHistoryDetailsResponse.projectId)
            && Objects.equals(this.projectName, showHistoryDetailsResponse.projectName)
            && Objects.equals(this.parameters, showHistoryDetailsResponse.parameters)
            && Objects.equals(this.buildSteps, showHistoryDetailsResponse.buildSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName, buildNumber, projectId, projectName, parameters, buildSteps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistoryDetailsResponse {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    buildSteps: ").append(toIndentedString(buildSteps)).append("\n");
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
