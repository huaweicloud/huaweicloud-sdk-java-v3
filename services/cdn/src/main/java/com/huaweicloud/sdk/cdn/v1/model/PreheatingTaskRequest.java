package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.PreheatingTaskRequestPreheatingTask;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PreheatingTaskRequest
 */
public class PreheatingTaskRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preheating_task")
    
    private PreheatingTaskRequestPreheatingTask preheatingTask;

    public PreheatingTaskRequest withPreheatingTask(PreheatingTaskRequestPreheatingTask preheatingTask) {
        this.preheatingTask = preheatingTask;
        return this;
    }

    public PreheatingTaskRequest withPreheatingTask(Consumer<PreheatingTaskRequestPreheatingTask> preheatingTaskSetter) {
        if(this.preheatingTask == null ){
            this.preheatingTask = new PreheatingTaskRequestPreheatingTask();
            preheatingTaskSetter.accept(this.preheatingTask);
        }
        
        return this;
    }


    /**
     * Get preheatingTask
     * @return preheatingTask
     */
    public PreheatingTaskRequestPreheatingTask getPreheatingTask() {
        return preheatingTask;
    }

    public void setPreheatingTask(PreheatingTaskRequestPreheatingTask preheatingTask) {
        this.preheatingTask = preheatingTask;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreheatingTaskRequest preheatingTaskRequest = (PreheatingTaskRequest) o;
        return Objects.equals(this.preheatingTask, preheatingTaskRequest.preheatingTask);
    }
    @Override
    public int hashCode() {
        return Objects.hash(preheatingTask);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreheatingTaskRequest {\n");
        sb.append("    preheatingTask: ").append(toIndentedString(preheatingTask)).append("\n");
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

