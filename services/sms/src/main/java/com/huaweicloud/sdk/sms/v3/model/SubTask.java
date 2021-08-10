package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 修改任务进度 */
public class SubTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private Long startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private Long endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_speed")

    private Double migrateSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_op")

    private String userOp;

    public SubTask withName(String name) {
        this.name = name;
        return this;
    }

    /** 子任务名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubTask withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /** 子任务的进度，取值为0-100之间的整数 minimum: 0 maximum: 100
     * 
     * @return progress */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public SubTask withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /** 子任务开始时间 minimum: 0 maximum: 9223372036854775807
     * 
     * @return startDate */
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public SubTask withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /** 子任务结束时间（如果子任务还没有结束，则为空） minimum: 0 maximum: 9223372036854775807
     * 
     * @return endDate */
    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public SubTask withMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    /** 迁移速率，Mbit/s minimum: 0 maximum: 1E+4
     * 
     * @return migrateSpeed */
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

    /** 触发子任务的用户操作名称
     * 
     * @return userOp */
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
        return Objects.equals(this.name, subTask.name) && Objects.equals(this.progress, subTask.progress)
            && Objects.equals(this.startDate, subTask.startDate) && Objects.equals(this.endDate, subTask.endDate)
            && Objects.equals(this.migrateSpeed, subTask.migrateSpeed) && Objects.equals(this.userOp, subTask.userOp);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
