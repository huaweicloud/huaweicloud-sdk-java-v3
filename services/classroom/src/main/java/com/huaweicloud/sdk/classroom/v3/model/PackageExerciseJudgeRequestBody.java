package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 习题库里习题判题调用参数
 */
public class PackageExerciseJudgeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_url")

    private String notifyUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_type")

    private String outputType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_answer")

    private String codeAnswer;

    public PackageExerciseJudgeRequestBody withNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * 判题结束后的回调url
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public PackageExerciseJudgeRequestBody withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 代码超时时间
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public PackageExerciseJudgeRequestBody withOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }

    /**
     * 结果返回类型
     * @return outputType
     */
    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    public PackageExerciseJudgeRequestBody withCodeAnswer(String codeAnswer) {
        this.codeAnswer = codeAnswer;
        return this;
    }

    /**
     * 习题作答（需Base64编码）
     * @return codeAnswer
     */
    public String getCodeAnswer() {
        return codeAnswer;
    }

    public void setCodeAnswer(String codeAnswer) {
        this.codeAnswer = codeAnswer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackageExerciseJudgeRequestBody that = (PackageExerciseJudgeRequestBody) obj;
        return Objects.equals(this.notifyUrl, that.notifyUrl) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.outputType, that.outputType) && Objects.equals(this.codeAnswer, that.codeAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifyUrl, timeout, outputType, codeAnswer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageExerciseJudgeRequestBody {\n");
        sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
        sb.append("    codeAnswer: ").append(toIndentedString(codeAnswer)).append("\n");
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
