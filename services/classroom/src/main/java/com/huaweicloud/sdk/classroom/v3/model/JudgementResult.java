package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务执行结果
 */
public class JudgementResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_count")

    private Integer caseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executed_count")

    private Integer executedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcases")

    private List<JudgementCaseResult> testcases = null;

    public JudgementResult withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * 标准类型输出结果
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public JudgementResult withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 文件形式输出的文件id，可根据文件id下载详情
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public JudgementResult withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 图片形式输出的图片id，可根据图片id下载详情
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public JudgementResult withCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
        return this;
    }

    /**
     * 用例形式输出的用例总个数
     * @return caseCount
     */
    public Integer getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
    }

    public JudgementResult withExecutedCount(Integer executedCount) {
        this.executedCount = executedCount;
        return this;
    }

    /**
     * 用例形式输出的已执行用例的个数
     * @return executedCount
     */
    public Integer getExecutedCount() {
        return executedCount;
    }

    public void setExecutedCount(Integer executedCount) {
        this.executedCount = executedCount;
    }

    public JudgementResult withTestcases(List<JudgementCaseResult> testcases) {
        this.testcases = testcases;
        return this;
    }

    public JudgementResult addTestcasesItem(JudgementCaseResult testcasesItem) {
        if (this.testcases == null) {
            this.testcases = new ArrayList<>();
        }
        this.testcases.add(testcasesItem);
        return this;
    }

    public JudgementResult withTestcases(Consumer<List<JudgementCaseResult>> testcasesSetter) {
        if (this.testcases == null) {
            this.testcases = new ArrayList<>();
        }
        testcasesSetter.accept(this.testcases);
        return this;
    }

    /**
     * 用例形式输出的已执行用例的结果
     * @return testcases
     */
    public List<JudgementCaseResult> getTestcases() {
        return testcases;
    }

    public void setTestcases(List<JudgementCaseResult> testcases) {
        this.testcases = testcases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JudgementResult that = (JudgementResult) obj;
        return Objects.equals(this.output, that.output) && Objects.equals(this.fileId, that.fileId)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.caseCount, that.caseCount)
            && Objects.equals(this.executedCount, that.executedCount) && Objects.equals(this.testcases, that.testcases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(output, fileId, imageId, caseCount, executedCount, testcases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JudgementResult {\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    caseCount: ").append(toIndentedString(caseCount)).append("\n");
        sb.append("    executedCount: ").append(toIndentedString(executedCount)).append("\n");
        sb.append("    testcases: ").append(toIndentedString(testcases)).append("\n");
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
