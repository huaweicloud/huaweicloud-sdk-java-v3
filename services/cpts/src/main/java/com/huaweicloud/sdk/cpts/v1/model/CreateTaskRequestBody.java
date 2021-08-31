package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** CreateTaskRequestBody */
public class CreateTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temps")

    private List<String> temps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_mode")

    private Integer operateMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bench_concurrent")

    private Integer benchConcurrent;

    public CreateTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** name
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateTaskRequestBody withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /** project_id minimum: 0 maximum: 2147483647
     * 
     * @return projectId */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public CreateTaskRequestBody withTemps(List<String> temps) {
        this.temps = temps;
        return this;
    }

    public CreateTaskRequestBody addTempsItem(String tempsItem) {
        if (this.temps == null) {
            this.temps = new ArrayList<>();
        }
        this.temps.add(tempsItem);
        return this;
    }

    public CreateTaskRequestBody withTemps(Consumer<List<String>> tempsSetter) {
        if (this.temps == null) {
            this.temps = new ArrayList<>();
        }
        tempsSetter.accept(this.temps);
        return this;
    }

    /** temps
     * 
     * @return temps */
    public List<String> getTemps() {
        return temps;
    }

    public void setTemps(List<String> temps) {
        this.temps = temps;
    }

    public CreateTaskRequestBody withOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
        return this;
    }

    /** operate_mode minimum: 0 maximum: 2147483647
     * 
     * @return operateMode */
    public Integer getOperateMode() {
        return operateMode;
    }

    public void setOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
    }

    public CreateTaskRequestBody withBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
        return this;
    }

    /** bench_concurrent minimum: 0 maximum: 2147483647
     * 
     * @return benchConcurrent */
    public Integer getBenchConcurrent() {
        return benchConcurrent;
    }

    public void setBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTaskRequestBody createTaskRequestBody = (CreateTaskRequestBody) o;
        return Objects.equals(this.name, createTaskRequestBody.name)
            && Objects.equals(this.projectId, createTaskRequestBody.projectId)
            && Objects.equals(this.temps, createTaskRequestBody.temps)
            && Objects.equals(this.operateMode, createTaskRequestBody.operateMode)
            && Objects.equals(this.benchConcurrent, createTaskRequestBody.benchConcurrent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, projectId, temps, operateMode, benchConcurrent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTaskRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    temps: ").append(toIndentedString(temps)).append("\n");
        sb.append("    operateMode: ").append(toIndentedString(operateMode)).append("\n");
        sb.append("    benchConcurrent: ").append(toIndentedString(benchConcurrent)).append("\n");
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
