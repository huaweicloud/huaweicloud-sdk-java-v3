package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** taskInfo */
public class ShowTaskResqTaskinfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bench_concurrent")

    private Integer benchConcurrent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_list")

    private List<ShowTaskResqTaskinfoCaseList> caseList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_mode")

    private Integer operateMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_temp_running_data")

    private List<String> relatedTempRunningData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private Integer runStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ShowTaskResqTaskinfo withBenchConcurrent(Integer benchConcurrent) {
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

    public ShowTaskResqTaskinfo withCaseList(List<ShowTaskResqTaskinfoCaseList> caseList) {
        this.caseList = caseList;
        return this;
    }

    public ShowTaskResqTaskinfo addCaseListItem(ShowTaskResqTaskinfoCaseList caseListItem) {
        if (this.caseList == null) {
            this.caseList = new ArrayList<>();
        }
        this.caseList.add(caseListItem);
        return this;
    }

    public ShowTaskResqTaskinfo withCaseList(Consumer<List<ShowTaskResqTaskinfoCaseList>> caseListSetter) {
        if (this.caseList == null) {
            this.caseList = new ArrayList<>();
        }
        caseListSetter.accept(this.caseList);
        return this;
    }

    /** case_list
     * 
     * @return caseList */
    public List<ShowTaskResqTaskinfoCaseList> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<ShowTaskResqTaskinfoCaseList> caseList) {
        this.caseList = caseList;
    }

    public ShowTaskResqTaskinfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** create_time
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowTaskResqTaskinfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /** description
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowTaskResqTaskinfo withName(String name) {
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

    public ShowTaskResqTaskinfo withOperateMode(Integer operateMode) {
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

    public ShowTaskResqTaskinfo withProjectId(Integer projectId) {
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

    public ShowTaskResqTaskinfo withRelatedTempRunningData(List<String> relatedTempRunningData) {
        this.relatedTempRunningData = relatedTempRunningData;
        return this;
    }

    public ShowTaskResqTaskinfo addRelatedTempRunningDataItem(String relatedTempRunningDataItem) {
        if (this.relatedTempRunningData == null) {
            this.relatedTempRunningData = new ArrayList<>();
        }
        this.relatedTempRunningData.add(relatedTempRunningDataItem);
        return this;
    }

    public ShowTaskResqTaskinfo withRelatedTempRunningData(Consumer<List<String>> relatedTempRunningDataSetter) {
        if (this.relatedTempRunningData == null) {
            this.relatedTempRunningData = new ArrayList<>();
        }
        relatedTempRunningDataSetter.accept(this.relatedTempRunningData);
        return this;
    }

    /** related_temp_running_data
     * 
     * @return relatedTempRunningData */
    public List<String> getRelatedTempRunningData() {
        return relatedTempRunningData;
    }

    public void setRelatedTempRunningData(List<String> relatedTempRunningData) {
        this.relatedTempRunningData = relatedTempRunningData;
    }

    public ShowTaskResqTaskinfo withRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /** run_status minimum: 0 maximum: 2147483647
     * 
     * @return runStatus */
    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public ShowTaskResqTaskinfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** update_time
     * 
     * @return updateTime */
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
        ShowTaskResqTaskinfo showTaskResqTaskinfo = (ShowTaskResqTaskinfo) o;
        return Objects.equals(this.benchConcurrent, showTaskResqTaskinfo.benchConcurrent)
            && Objects.equals(this.caseList, showTaskResqTaskinfo.caseList)
            && Objects.equals(this.createTime, showTaskResqTaskinfo.createTime)
            && Objects.equals(this.description, showTaskResqTaskinfo.description)
            && Objects.equals(this.name, showTaskResqTaskinfo.name)
            && Objects.equals(this.operateMode, showTaskResqTaskinfo.operateMode)
            && Objects.equals(this.projectId, showTaskResqTaskinfo.projectId)
            && Objects.equals(this.relatedTempRunningData, showTaskResqTaskinfo.relatedTempRunningData)
            && Objects.equals(this.runStatus, showTaskResqTaskinfo.runStatus)
            && Objects.equals(this.updateTime, showTaskResqTaskinfo.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(benchConcurrent,
            caseList,
            createTime,
            description,
            name,
            operateMode,
            projectId,
            relatedTempRunningData,
            runStatus,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResqTaskinfo {\n");
        sb.append("    benchConcurrent: ").append(toIndentedString(benchConcurrent)).append("\n");
        sb.append("    caseList: ").append(toIndentedString(caseList)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operateMode: ").append(toIndentedString(operateMode)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    relatedTempRunningData: ").append(toIndentedString(relatedTempRunningData)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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