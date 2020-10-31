package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Chart
 */
public class Chart  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="date")
    
    private String date;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="finished_num")
    
    private Integer finishedNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iteration_id")
    
    private Integer iterationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_num_id")
    
    private Integer projectNumId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remaining_num")
    
    private Integer remainingNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public Chart withDate(String date) {
        this.date = date;
        return this;
    }

    


    /**
     * 统计时间
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Chart withFinishedNum(Integer finishedNum) {
        this.finishedNum = finishedNum;
        return this;
    }

    


    /**
     * 完成story工单
     * @return finishedNum
     */
    public Integer getFinishedNum() {
        return finishedNum;
    }

    public void setFinishedNum(Integer finishedNum) {
        this.finishedNum = finishedNum;
    }

    public Chart withIterationId(Integer iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    


    /**
     * 迭代id
     * @return iterationId
     */
    public Integer getIterationId() {
        return iterationId;
    }

    public void setIterationId(Integer iterationId) {
        this.iterationId = iterationId;
    }

    public Chart withProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
        return this;
    }

    


    /**
     * 项目id
     * @return projectNumId
     */
    public Integer getProjectNumId() {
        return projectNumId;
    }

    public void setProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
    }

    public Chart withRemainingNum(Integer remainingNum) {
        this.remainingNum = remainingNum;
        return this;
    }

    


    /**
     * 未完成story数
     * @return remainingNum
     */
    public Integer getRemainingNum() {
        return remainingNum;
    }

    public void setRemainingNum(Integer remainingNum) {
        this.remainingNum = remainingNum;
    }

    public Chart withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总story数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Chart chart = (Chart) o;
        return Objects.equals(this.date, chart.date) &&
            Objects.equals(this.finishedNum, chart.finishedNum) &&
            Objects.equals(this.iterationId, chart.iterationId) &&
            Objects.equals(this.projectNumId, chart.projectNumId) &&
            Objects.equals(this.remainingNum, chart.remainingNum) &&
            Objects.equals(this.total, chart.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(date, finishedNum, iterationId, projectNumId, remainingNum, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Chart {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    finishedNum: ").append(toIndentedString(finishedNum)).append("\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
        sb.append("    projectNumId: ").append(toIndentedString(projectNumId)).append("\n");
        sb.append("    remainingNum: ").append(toIndentedString(remainingNum)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

