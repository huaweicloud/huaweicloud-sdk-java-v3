package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** TaskRunInfo */
public class TaskRunInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_type")

    private Integer runType;

    public TaskRunInfo withId(Integer id) {
        this.id = id;
        return this;
    }

    /** id minimum: 0 maximum: 2147483647
     * 
     * @return id */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TaskRunInfo withRunType(Integer runType) {
        this.runType = runType;
        return this;
    }

    /** run_type minimum: 0 maximum: 2147483647
     * 
     * @return runType */
    public Integer getRunType() {
        return runType;
    }

    public void setRunType(Integer runType) {
        this.runType = runType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskRunInfo taskRunInfo = (TaskRunInfo) o;
        return Objects.equals(this.id, taskRunInfo.id) && Objects.equals(this.runType, taskRunInfo.runType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, runType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskRunInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
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
