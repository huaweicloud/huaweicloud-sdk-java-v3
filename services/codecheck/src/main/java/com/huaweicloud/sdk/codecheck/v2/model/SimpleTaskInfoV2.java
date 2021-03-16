package com.huaweicloud.sdk.codecheck.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SimpleTaskInfoV2
 */
public class SimpleTaskInfoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    private String taskName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator_id")
    
    private String creatorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="git_url")
    
    private String gitUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="git_branch")
    
    private String gitBranch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_check_time")
    
    private String lastCheckTime;

    public SimpleTaskInfoV2 withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public SimpleTaskInfoV2 withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    


    /**
     * 任务名字
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    

    public SimpleTaskInfoV2 withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    


    /**
     * 创建者id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    

    public SimpleTaskInfoV2 withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    


    /**
     * 代码仓地址
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    

    public SimpleTaskInfoV2 withGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
        return this;
    }

    


    /**
     * 代码仓分支
     * @return gitBranch
     */
    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    

    public SimpleTaskInfoV2 withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public SimpleTaskInfoV2 withLastCheckTime(String lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
        return this;
    }

    


    /**
     * 上一次检查时间
     * @return lastCheckTime
     */
    public String getLastCheckTime() {
        return lastCheckTime;
    }

    public void setLastCheckTime(String lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleTaskInfoV2 simpleTaskInfoV2 = (SimpleTaskInfoV2) o;
        return Objects.equals(this.taskId, simpleTaskInfoV2.taskId) &&
            Objects.equals(this.taskName, simpleTaskInfoV2.taskName) &&
            Objects.equals(this.creatorId, simpleTaskInfoV2.creatorId) &&
            Objects.equals(this.gitUrl, simpleTaskInfoV2.gitUrl) &&
            Objects.equals(this.gitBranch, simpleTaskInfoV2.gitBranch) &&
            Objects.equals(this.createdAt, simpleTaskInfoV2.createdAt) &&
            Objects.equals(this.lastCheckTime, simpleTaskInfoV2.lastCheckTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, creatorId, gitUrl, gitBranch, createdAt, lastCheckTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleTaskInfoV2 {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    lastCheckTime: ").append(toIndentedString(lastCheckTime)).append("\n");
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

