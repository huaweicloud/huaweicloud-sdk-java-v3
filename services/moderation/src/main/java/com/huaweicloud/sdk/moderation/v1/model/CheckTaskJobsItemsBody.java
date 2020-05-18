package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * CheckTaskJobsItemsBody
 */
public class CheckTaskJobsItemsBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private String updateTime;

    public CheckTaskJobsItemsBody withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务标识。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CheckTaskJobsItemsBody withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态如下：  - created 已创建  - running 正在处理  - finish 已完成  - failed 处理失败 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CheckTaskJobsItemsBody withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 任务创建的时间。例如：2018-01-02T15:03:04Z
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CheckTaskJobsItemsBody withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 任务最近更新的时间。例如：2018-01-02T15:03:04Z
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckTaskJobsItemsBody checkTaskJobsItemsBody = (CheckTaskJobsItemsBody) o;
        return Objects.equals(this.jobId, checkTaskJobsItemsBody.jobId) &&
            Objects.equals(this.status, checkTaskJobsItemsBody.status) &&
            Objects.equals(this.createTime, checkTaskJobsItemsBody.createTime) &&
            Objects.equals(this.updateTime, checkTaskJobsItemsBody.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTaskJobsItemsBody {\n");
            sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

