package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.CheckResultItemsBody;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CheckResultResultBody  {



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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private List<CheckResultItemsBody> items = null;
    
    public CheckResultResultBody withJobId(String jobId) {
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

    public CheckResultResultBody withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态。  created：已创建  running：正在处理  finish：已完成  failed：处理失败 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CheckResultResultBody withCreateTime(String createTime) {
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

    public CheckResultResultBody withUpdateTime(String updateTime) {
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

    public CheckResultResultBody withItems(List<CheckResultItemsBody> items) {
        this.items = items;
        return this;
    }

    
    public CheckResultResultBody addItemsItem(CheckResultItemsBody itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public CheckResultResultBody withItems(Consumer<List<CheckResultItemsBody>> itemsSetter) {
        if(this.items == null ){
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 图片内容检测的结果列表。
     * @return items
     */
    public List<CheckResultItemsBody> getItems() {
        return items;
    }

    public void setItems(List<CheckResultItemsBody> items) {
        this.items = items;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckResultResultBody checkResultResultBody = (CheckResultResultBody) o;
        return Objects.equals(this.jobId, checkResultResultBody.jobId) &&
            Objects.equals(this.status, checkResultResultBody.status) &&
            Objects.equals(this.createTime, checkResultResultBody.createTime) &&
            Objects.equals(this.updateTime, checkResultResultBody.updateTime) &&
            Objects.equals(this.items, checkResultResultBody.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, createTime, updateTime, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckResultResultBody {\n");
            sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

