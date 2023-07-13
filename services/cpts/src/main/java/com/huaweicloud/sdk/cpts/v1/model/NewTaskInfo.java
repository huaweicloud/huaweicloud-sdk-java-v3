package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NewTaskInfo
 */
public class NewTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Boolean parallel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_full_link")

    private Boolean enableFullLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_mode")

    private Integer operateMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id_list")

    private List<Integer> caseIdList = null;

    public NewTaskInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NewTaskInfo withParallel(Boolean parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * 是否并行
     * @return parallel
     */
    public Boolean getParallel() {
        return parallel;
    }

    public void setParallel(Boolean parallel) {
        this.parallel = parallel;
    }

    public NewTaskInfo withEnableFullLink(Boolean enableFullLink) {
        this.enableFullLink = enableFullLink;
        return this;
    }

    /**
     * 是否支持全链路压测
     * @return enableFullLink
     */
    public Boolean getEnableFullLink() {
        return enableFullLink;
    }

    public void setEnableFullLink(Boolean enableFullLink) {
        this.enableFullLink = enableFullLink;
    }

    public NewTaskInfo withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工程id
     * minimum: 1
     * maximum: 2147483647
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public NewTaskInfo withOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
        return this;
    }

    /**
     * 任务压测模式，0-时长模式；1-次数模式；2-混合模式；此处是兼容老版本遗留字段，填固定值2
     * @return operateMode
     */
    public Integer getOperateMode() {
        return operateMode;
    }

    public void setOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
    }

    public NewTaskInfo withCaseIdList(List<Integer> caseIdList) {
        this.caseIdList = caseIdList;
        return this;
    }

    public NewTaskInfo addCaseIdListItem(Integer caseIdListItem) {
        if (this.caseIdList == null) {
            this.caseIdList = new ArrayList<>();
        }
        this.caseIdList.add(caseIdListItem);
        return this;
    }

    public NewTaskInfo withCaseIdList(Consumer<List<Integer>> caseIdListSetter) {
        if (this.caseIdList == null) {
            this.caseIdList = new ArrayList<>();
        }
        caseIdListSetter.accept(this.caseIdList);
        return this;
    }

    /**
     * 关联用例id列表
     * @return caseIdList
     */
    public List<Integer> getCaseIdList() {
        return caseIdList;
    }

    public void setCaseIdList(List<Integer> caseIdList) {
        this.caseIdList = caseIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NewTaskInfo that = (NewTaskInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.parallel, that.parallel)
            && Objects.equals(this.enableFullLink, that.enableFullLink)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.operateMode, that.operateMode)
            && Objects.equals(this.caseIdList, that.caseIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parallel, enableFullLink, projectId, operateMode, caseIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewTaskInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
        sb.append("    enableFullLink: ").append(toIndentedString(enableFullLink)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    operateMode: ").append(toIndentedString(operateMode)).append("\n");
        sb.append("    caseIdList: ").append(toIndentedString(caseIdList)).append("\n");
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
