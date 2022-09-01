package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 输出为hosting时，hosting结果文件的相关信息
 */
public class TaskHostingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting_result")

    @JacksonXmlProperty(localName = "hosting_result")

    private TaskHostingResultHostingResult hostingResult;

    public TaskHostingResult withHostingResult(TaskHostingResultHostingResult hostingResult) {
        this.hostingResult = hostingResult;
        return this;
    }

    public TaskHostingResult withHostingResult(Consumer<TaskHostingResultHostingResult> hostingResultSetter) {
        if (this.hostingResult == null) {
            this.hostingResult = new TaskHostingResultHostingResult();
            hostingResultSetter.accept(this.hostingResult);
        }

        return this;
    }

    /**
     * Get hostingResult
     * @return hostingResult
     */
    public TaskHostingResultHostingResult getHostingResult() {
        return hostingResult;
    }

    public void setHostingResult(TaskHostingResultHostingResult hostingResult) {
        this.hostingResult = hostingResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskHostingResult taskHostingResult = (TaskHostingResult) o;
        return Objects.equals(this.hostingResult, taskHostingResult.hostingResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostingResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskHostingResult {\n");
        sb.append("    hostingResult: ").append(toIndentedString(hostingResult)).append("\n");
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
