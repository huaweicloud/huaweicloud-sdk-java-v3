package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.DatabaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新对象选择信息体
 */
public class UpdateDatabaseObjectReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="selected")
    
    private Boolean selected;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscription_type")
    
    private List<String> subscriptionType = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_database")
    
    private Boolean syncDatabase;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query_num")
    
    private Integer queryNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job")
    
    private List<DatabaseInfo> job = new ArrayList<>();
    
    public UpdateDatabaseObjectReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public UpdateDatabaseObjectReq withSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    


    /**
     * 是否选择
     * @return selected
     */
    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public UpdateDatabaseObjectReq withSubscriptionType(List<String> subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    
    public UpdateDatabaseObjectReq addSubscriptionTypeItem(String subscriptionTypeItem) {
        if (this.subscriptionType == null) {
            this.subscriptionType = new ArrayList<>();
        }
        this.subscriptionType.add(subscriptionTypeItem);
        return this;
    }

    public UpdateDatabaseObjectReq withSubscriptionType(Consumer<List<String>> subscriptionTypeSetter) {
        if(this.subscriptionType == null ){
            this.subscriptionType = new ArrayList<>();
        }
        subscriptionTypeSetter.accept(this.subscriptionType);
        return this;
    }

    /**
     * 订阅数据类型
     * @return subscriptionType
     */
    public List<String> getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(List<String> subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public UpdateDatabaseObjectReq withSyncDatabase(Boolean syncDatabase) {
        this.syncDatabase = syncDatabase;
        return this;
    }

    


    /**
     * 是否库级同步
     * @return syncDatabase
     */
    public Boolean getSyncDatabase() {
        return syncDatabase;
    }

    public void setSyncDatabase(Boolean syncDatabase) {
        this.syncDatabase = syncDatabase;
    }

    public UpdateDatabaseObjectReq withQueryNum(Integer queryNum) {
        this.queryNum = queryNum;
        return this;
    }

    


    /**
     * 同一页面接口调用次数，根据queryNum回放上次用户操作数据。
     * @return queryNum
     */
    public Integer getQueryNum() {
        return queryNum;
    }

    public void setQueryNum(Integer queryNum) {
        this.queryNum = queryNum;
    }

    public UpdateDatabaseObjectReq withJob(List<DatabaseInfo> job) {
        this.job = job;
        return this;
    }

    
    public UpdateDatabaseObjectReq addJobItem(DatabaseInfo jobItem) {
        this.job.add(jobItem);
        return this;
    }

    public UpdateDatabaseObjectReq withJob(Consumer<List<DatabaseInfo>> jobSetter) {
        if(this.job == null ){
            this.job = new ArrayList<>();
        }
        jobSetter.accept(this.job);
        return this;
    }

    /**
     * 数据对象选择结果
     * @return job
     */
    public List<DatabaseInfo> getJob() {
        return job;
    }

    public void setJob(List<DatabaseInfo> job) {
        this.job = job;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDatabaseObjectReq updateDatabaseObjectReq = (UpdateDatabaseObjectReq) o;
        return Objects.equals(this.jobId, updateDatabaseObjectReq.jobId) &&
            Objects.equals(this.selected, updateDatabaseObjectReq.selected) &&
            Objects.equals(this.subscriptionType, updateDatabaseObjectReq.subscriptionType) &&
            Objects.equals(this.syncDatabase, updateDatabaseObjectReq.syncDatabase) &&
            Objects.equals(this.queryNum, updateDatabaseObjectReq.queryNum) &&
            Objects.equals(this.job, updateDatabaseObjectReq.job);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, selected, subscriptionType, syncDatabase, queryNum, job);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseObjectReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("    syncDatabase: ").append(toIndentedString(syncDatabase)).append("\n");
        sb.append("    queryNum: ").append(toIndentedString(queryNum)).append("\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
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

