package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改任务进度
 */
public class SubTask  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="progress")
    
    private String progress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_date")
    
    private LocalDate startDate = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_date")
    
    private LocalDate endDate = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migrate_speed")
    
    private Double migrateSpeed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_op")
    
    private String userOp;

    public SubTask withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 子任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubTask withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    


    /**
     * 子任务的进度，取值为0-100之间的整数
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public SubTask withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    


    /**
     * 子任务开始时间
     * @return startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public SubTask withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    


    /**
     * 子任务结束时间（如果子任务还没有结束，则为空）
     * @return endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public SubTask withMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    


    /**
     * 迁移速率，Mbit/s
     * @return migrateSpeed
     */
    public Double getMigrateSpeed() {
        return migrateSpeed;
    }

    public void setMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
    }

    public SubTask withUserOp(String userOp) {
        this.userOp = userOp;
        return this;
    }

    


    /**
     * 触发子任务的用户操作名称
     * @return userOp
     */
    public String getUserOp() {
        return userOp;
    }

    public void setUserOp(String userOp) {
        this.userOp = userOp;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubTask subTask = (SubTask) o;
        return Objects.equals(this.name, subTask.name) &&
            Objects.equals(this.progress, subTask.progress) &&
            Objects.equals(this.startDate, subTask.startDate) &&
            Objects.equals(this.endDate, subTask.endDate) &&
            Objects.equals(this.migrateSpeed, subTask.migrateSpeed) &&
            Objects.equals(this.userOp, subTask.userOp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, progress, startDate, endDate, migrateSpeed, userOp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTask {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("    userOp: ").append(toIndentedString(userOp)).append("\n");
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

