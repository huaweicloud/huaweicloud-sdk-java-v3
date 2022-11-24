package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新版(任务用例分离版本)更新任务请求体
 */
public class UpdateNewTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Boolean parallel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_mode")

    private Integer operateMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id_list")

    private List<Integer> caseIdList = null;

    public UpdateNewTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateNewTaskRequestBody withParallel(Boolean parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * 并行状态(表示任务执行时用例是否并行执行;true:并行执行,false:串行执行)
     * @return parallel
     */
    public Boolean getParallel() {
        return parallel;
    }

    public void setParallel(Boolean parallel) {
        this.parallel = parallel;
    }

    public UpdateNewTaskRequestBody withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工程id
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public UpdateNewTaskRequestBody withOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
        return this;
    }

    /**
     * 任务模式(兼容旧版接口保留字段,0:时长模式,1:次数模式,2:混合模式;此处请传固定值:2)
     * @return operateMode
     */
    public Integer getOperateMode() {
        return operateMode;
    }

    public void setOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
    }

    public UpdateNewTaskRequestBody withCaseIdList(List<Integer> caseIdList) {
        this.caseIdList = caseIdList;
        return this;
    }

    public UpdateNewTaskRequestBody addCaseIdListItem(Integer caseIdListItem) {
        if (this.caseIdList == null) {
            this.caseIdList = new ArrayList<>();
        }
        this.caseIdList.add(caseIdListItem);
        return this;
    }

    public UpdateNewTaskRequestBody withCaseIdList(Consumer<List<Integer>> caseIdListSetter) {
        if (this.caseIdList == null) {
            this.caseIdList = new ArrayList<>();
        }
        caseIdListSetter.accept(this.caseIdList);
        return this;
    }

    /**
     * 关联的用例id集合
     * @return caseIdList
     */
    public List<Integer> getCaseIdList() {
        return caseIdList;
    }

    public void setCaseIdList(List<Integer> caseIdList) {
        this.caseIdList = caseIdList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNewTaskRequestBody updateNewTaskRequestBody = (UpdateNewTaskRequestBody) o;
        return Objects.equals(this.name, updateNewTaskRequestBody.name)
            && Objects.equals(this.parallel, updateNewTaskRequestBody.parallel)
            && Objects.equals(this.projectId, updateNewTaskRequestBody.projectId)
            && Objects.equals(this.operateMode, updateNewTaskRequestBody.operateMode)
            && Objects.equals(this.caseIdList, updateNewTaskRequestBody.caseIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parallel, projectId, operateMode, caseIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNewTaskRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
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
