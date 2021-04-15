package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.ModifyPwdEndPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class BatchModifyPwdReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<ModifyPwdEndPoint> jobs = null;
    
    public BatchModifyPwdReq withJobs(List<ModifyPwdEndPoint> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public BatchModifyPwdReq addJobsItem(ModifyPwdEndPoint jobsItem) {
        if(this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchModifyPwdReq withJobs(Consumer<List<ModifyPwdEndPoint>> jobsSetter) {
        if(this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 批量修改数据库密码信息列表
     * @return jobs
     */
    public List<ModifyPwdEndPoint> getJobs() {
        return jobs;
    }

    public void setJobs(List<ModifyPwdEndPoint> jobs) {
        this.jobs = jobs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchModifyPwdReq batchModifyPwdReq = (BatchModifyPwdReq) o;
        return Objects.equals(this.jobs, batchModifyPwdReq.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchModifyPwdReq {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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

