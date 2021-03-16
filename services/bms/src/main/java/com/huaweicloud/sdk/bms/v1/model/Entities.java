package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.SubJobs;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * entities字段数据结构说明
 */
public class Entities  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_jobs_total")
    
    private Integer subJobsTotal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_jobs")
    
    private List<SubJobs> subJobs = null;
    
    public Entities withSubJobsTotal(Integer subJobsTotal) {
        this.subJobsTotal = subJobsTotal;
        return this;
    }

    


    /**
     * 子任务数量。没有子任务时为0
     * @return subJobsTotal
     */
    public Integer getSubJobsTotal() {
        return subJobsTotal;
    }

    public void setSubJobsTotal(Integer subJobsTotal) {
        this.subJobsTotal = subJobsTotal;
    }

    

    public Entities withSubJobs(List<SubJobs> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    
    public Entities addSubJobsItem(SubJobs subJobsItem) {
        this.subJobs.add(subJobsItem);
        return this;
    }

    public Entities withSubJobs(Consumer<List<SubJobs>> subJobsSetter) {
        if(this.subJobs == null ){
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 每个子任务的执行信息。没有子任务时为空列表
     * @return subJobs
     */
    public List<SubJobs> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<SubJobs> subJobs) {
        this.subJobs = subJobs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Entities entities = (Entities) o;
        return Objects.equals(this.subJobsTotal, entities.subJobsTotal) &&
            Objects.equals(this.subJobs, entities.subJobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subJobsTotal, subJobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Entities {\n");
        sb.append("    subJobsTotal: ").append(toIndentedString(subJobsTotal)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
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

