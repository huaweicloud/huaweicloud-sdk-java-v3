package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTranscodeDetailRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private List<String> taskId = null;
    
    public ListTranscodeDetailRequest withTaskId(List<String> taskId) {
        this.taskId = taskId;
        return this;
    }

    
    public ListTranscodeDetailRequest addTaskIdItem(String taskIdItem) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        this.taskId.add(taskIdItem);
        return this;
    }

    public ListTranscodeDetailRequest withTaskId(Consumer<List<String>> taskIdSetter) {
        if(this.taskId == null ){
            this.taskId = new ArrayList<>();
        }
        taskIdSetter.accept(this.taskId);
        return this;
    }

    /**
     * Get taskId
     * @return taskId
     */
    public List<String> getTaskId() {
        return taskId;
    }

    public void setTaskId(List<String> taskId) {
        this.taskId = taskId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTranscodeDetailRequest listTranscodeDetailRequest = (ListTranscodeDetailRequest) o;
        return Objects.equals(this.taskId, listTranscodeDetailRequest.taskId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodeDetailRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

