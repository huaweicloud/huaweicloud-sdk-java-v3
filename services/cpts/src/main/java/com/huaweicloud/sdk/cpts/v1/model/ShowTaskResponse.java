package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    @JacksonXmlProperty(localName = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskinfo")

    @JacksonXmlProperty(localName = "taskinfo")

    private TaskInfo taskinfo;

    public ShowTaskResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowTaskResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowTaskResponse withTaskinfo(TaskInfo taskinfo) {
        this.taskinfo = taskinfo;
        return this;
    }

    public ShowTaskResponse withTaskinfo(Consumer<TaskInfo> taskinfoSetter) {
        if (this.taskinfo == null) {
            this.taskinfo = new TaskInfo();
            taskinfoSetter.accept(this.taskinfo);
        }

        return this;
    }

    /**
     * Get taskinfo
     * @return taskinfo
     */
    public TaskInfo getTaskinfo() {
        return taskinfo;
    }

    public void setTaskinfo(TaskInfo taskinfo) {
        this.taskinfo = taskinfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskResponse showTaskResponse = (ShowTaskResponse) o;
        return Objects.equals(this.code, showTaskResponse.code)
            && Objects.equals(this.message, showTaskResponse.message)
            && Objects.equals(this.taskinfo, showTaskResponse.taskinfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, taskinfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    taskinfo: ").append(toIndentedString(taskinfo)).append("\n");
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
