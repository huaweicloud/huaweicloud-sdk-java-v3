package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 启动任务请求体。
 */
public class StartInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_only_init_task")

    private Boolean isOnlyInitTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_create_compare")

    private Boolean isAutoCreateCompare;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    public StartInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  迁移任务ID，用于唯一标识一个数据复制任务，在查询、修改、删除等操作中作为任务的识别凭证。  **约束限制**：  不涉及。  **取值范围**：  UUID格式字符串。  **默认取值**：  不涉及
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StartInfo withIsOnlyInitTask(Boolean isOnlyInitTask) {
        this.isOnlyInitTask = isOnlyInitTask;
        return this;
    }

    /**
     * **参数解释**：  是否只初始化任务，指定启动任务时是否仅执行初始化而不启动数据迁移。  **约束限制**：  - 仅支持白名单用户使用，需要提交工单申请才能使用。  **取值范围**：  - true：只初始化任务 - false：正常启动任务  **默认取值**：  false
     * @return isOnlyInitTask
     */
    public Boolean getIsOnlyInitTask() {
        return isOnlyInitTask;
    }

    public void setIsOnlyInitTask(Boolean isOnlyInitTask) {
        this.isOnlyInitTask = isOnlyInitTask;
    }

    public StartInfo withIsAutoCreateCompare(Boolean isAutoCreateCompare) {
        this.isAutoCreateCompare = isAutoCreateCompare;
        return this;
    }

    /**
     * **参数解释**：  是否在任务结束时自动创建对比任务，指定任务完成后是否自动触发数据对比以验证迁移一致性。  **约束限制**：  不涉及。  **取值范围**：  - true：自动创建对比任务 - false：不自动创建对比任务  **默认取值**：  true
     * @return isAutoCreateCompare
     */
    public Boolean getIsAutoCreateCompare() {
        return isAutoCreateCompare;
    }

    public void setIsAutoCreateCompare(Boolean isAutoCreateCompare) {
        this.isAutoCreateCompare = isAutoCreateCompare;
    }

    public StartInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：  任务启动时间，指定任务开始执行的时间，时间戳格式精确到毫秒。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及，取值为空代表立即启动
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartInfo that = (StartInfo) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.isOnlyInitTask, that.isOnlyInitTask)
            && Objects.equals(this.isAutoCreateCompare, that.isAutoCreateCompare)
            && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, isOnlyInitTask, isAutoCreateCompare, startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    isOnlyInitTask: ").append(toIndentedString(isOnlyInitTask)).append("\n");
        sb.append("    isAutoCreateCompare: ").append(toIndentedString(isAutoCreateCompare)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
