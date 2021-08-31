package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowTaskSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private List<String> extend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<ShowTaskSetResqTasks> tasks = null;

    public ShowTaskSetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /** code
     * 
     * @return code */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowTaskSetResponse withExtend(List<String> extend) {
        this.extend = extend;
        return this;
    }

    public ShowTaskSetResponse addExtendItem(String extendItem) {
        if (this.extend == null) {
            this.extend = new ArrayList<>();
        }
        this.extend.add(extendItem);
        return this;
    }

    public ShowTaskSetResponse withExtend(Consumer<List<String>> extendSetter) {
        if (this.extend == null) {
            this.extend = new ArrayList<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }

    /** extend
     * 
     * @return extend */
    public List<String> getExtend() {
        return extend;
    }

    public void setExtend(List<String> extend) {
        this.extend = extend;
    }

    public ShowTaskSetResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /** message
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowTaskSetResponse withTasks(List<ShowTaskSetResqTasks> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ShowTaskSetResponse addTasksItem(ShowTaskSetResqTasks tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowTaskSetResponse withTasks(Consumer<List<ShowTaskSetResqTasks>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /** tasks
     * 
     * @return tasks */
    public List<ShowTaskSetResqTasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<ShowTaskSetResqTasks> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskSetResponse showTaskSetResponse = (ShowTaskSetResponse) o;
        return Objects.equals(this.code, showTaskSetResponse.code)
            && Objects.equals(this.extend, showTaskSetResponse.extend)
            && Objects.equals(this.message, showTaskSetResponse.message)
            && Objects.equals(this.tasks, showTaskSetResponse.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, extend, message, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskSetResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
