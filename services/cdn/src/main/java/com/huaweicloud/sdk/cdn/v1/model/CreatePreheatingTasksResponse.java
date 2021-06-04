package com.huaweicloud.sdk.cdn.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.RefreshPreheatingBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreatePreheatingTasksResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preheatingTask")
    
    private RefreshPreheatingBody preheatingTask;

    public CreatePreheatingTasksResponse withPreheatingTask(RefreshPreheatingBody preheatingTask) {
        this.preheatingTask = preheatingTask;
        return this;
    }

    public CreatePreheatingTasksResponse withPreheatingTask(Consumer<RefreshPreheatingBody> preheatingTaskSetter) {
        if(this.preheatingTask == null ){
            this.preheatingTask = new RefreshPreheatingBody();
            preheatingTaskSetter.accept(this.preheatingTask);
        }
        
        return this;
    }


    /**
     * Get preheatingTask
     * @return preheatingTask
     */
    public RefreshPreheatingBody getPreheatingTask() {
        return preheatingTask;
    }

    public void setPreheatingTask(RefreshPreheatingBody preheatingTask) {
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
        CreatePreheatingTasksResponse createPreheatingTasksResponse = (CreatePreheatingTasksResponse) o;
        return Objects.equals(this.preheatingTask, createPreheatingTasksResponse.preheatingTask);
    }
    @Override
    public int hashCode() {
        return Objects.hash(preheatingTask);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePreheatingTasksResponse {\n");
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

