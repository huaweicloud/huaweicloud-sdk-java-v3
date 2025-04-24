package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddTestCaseResultInfo
 */
public class AddTestCaseResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preparation")

    private String preparation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<TestCaseStepResultInfo> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_result_uri")

    private String taskResultUri;

    public AddTestCaseResultInfo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 主键
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public AddTestCaseResultInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 结果名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddTestCaseResultInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddTestCaseResultInfo withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 用例结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public AddTestCaseResultInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AddTestCaseResultInfo withPreparation(String preparation) {
        this.preparation = preparation;
        return this;
    }

    /**
     * 前置条件
     * @return preparation
     */
    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public AddTestCaseResultInfo withSteps(List<TestCaseStepResultInfo> steps) {
        this.steps = steps;
        return this;
    }

    public AddTestCaseResultInfo addStepsItem(TestCaseStepResultInfo stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public AddTestCaseResultInfo withSteps(Consumer<List<TestCaseStepResultInfo>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 用例步骤结果信息
     * @return steps
     */
    public List<TestCaseStepResultInfo> getSteps() {
        return steps;
    }

    public void setSteps(List<TestCaseStepResultInfo> steps) {
        this.steps = steps;
    }

    public AddTestCaseResultInfo withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 版本号
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public AddTestCaseResultInfo withTaskUri(String taskUri) {
        this.taskUri = taskUri;
        return this;
    }

    /**
     * 任务URI
     * @return taskUri
     */
    public String getTaskUri() {
        return taskUri;
    }

    public void setTaskUri(String taskUri) {
        this.taskUri = taskUri;
    }

    public AddTestCaseResultInfo withTaskResultUri(String taskResultUri) {
        this.taskResultUri = taskResultUri;
        return this;
    }

    /**
     * 测试套结果URI
     * @return taskResultUri
     */
    public String getTaskResultUri() {
        return taskResultUri;
    }

    public void setTaskResultUri(String taskResultUri) {
        this.taskResultUri = taskResultUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddTestCaseResultInfo that = (AddTestCaseResultInfo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.result, that.result)
            && Objects.equals(this.status, that.status) && Objects.equals(this.preparation, that.preparation)
            && Objects.equals(this.steps, that.steps) && Objects.equals(this.releaseDev, that.releaseDev)
            && Objects.equals(this.taskUri, that.taskUri) && Objects.equals(this.taskResultUri, that.taskResultUri);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(uri, name, description, result, status, preparation, steps, releaseDev, taskUri, taskResultUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTestCaseResultInfo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    preparation: ").append(toIndentedString(preparation)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    taskResultUri: ").append(toIndentedString(taskResultUri)).append("\n");
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
