package com.huaweicloud.sdk.cdn.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.RefreshTask;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateRefreshTasksResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="refresh_task")
    
    private RefreshTask refreshTask;

    public CreateRefreshTasksResponse withRefreshTask(RefreshTask refreshTask) {
        this.refreshTask = refreshTask;
        return this;
    }

    public CreateRefreshTasksResponse withRefreshTask(Consumer<RefreshTask> refreshTaskSetter) {
        if(this.refreshTask == null ){
            this.refreshTask = new RefreshTask();
            refreshTaskSetter.accept(this.refreshTask);
        }
        
        return this;
    }


    /**
     * Get refreshTask
     * @return refreshTask
     */
    public RefreshTask getRefreshTask() {
        return refreshTask;
    }

    public void setRefreshTask(RefreshTask refreshTask) {
        this.refreshTask = refreshTask;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRefreshTasksResponse createRefreshTasksResponse = (CreateRefreshTasksResponse) o;
        return Objects.equals(this.refreshTask, createRefreshTasksResponse.refreshTask);
    }
    @Override
    public int hashCode() {
        return Objects.hash(refreshTask);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRefreshTasksResponse {\n");
        sb.append("    refreshTask: ").append(toIndentedString(refreshTask)).append("\n");
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

