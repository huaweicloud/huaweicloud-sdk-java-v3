package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaseRemoveInfo
 */
public class CaseRemoveInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_uri")

    private String iteratorUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_associate_issue")

    private Boolean removeAssociateIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_list")

    private List<CaseIdAndTypeInfo> caseList = null;

    public CaseRemoveInfo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public CaseRemoveInfo withIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
        return this;
    }

    /**
     * 迭代Uri
     * @return iteratorUri
     */
    public String getIteratorUri() {
        return iteratorUri;
    }

    public void setIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
    }

    public CaseRemoveInfo withRemoveAssociateIssue(Boolean removeAssociateIssue) {
        this.removeAssociateIssue = removeAssociateIssue;
        return this;
    }

    /**
     * 是否移除关联的issue
     * @return removeAssociateIssue
     */
    public Boolean getRemoveAssociateIssue() {
        return removeAssociateIssue;
    }

    public void setRemoveAssociateIssue(Boolean removeAssociateIssue) {
        this.removeAssociateIssue = removeAssociateIssue;
    }

    public CaseRemoveInfo withCaseList(List<CaseIdAndTypeInfo> caseList) {
        this.caseList = caseList;
        return this;
    }

    public CaseRemoveInfo addCaseListItem(CaseIdAndTypeInfo caseListItem) {
        if (this.caseList == null) {
            this.caseList = new ArrayList<>();
        }
        this.caseList.add(caseListItem);
        return this;
    }

    public CaseRemoveInfo withCaseList(Consumer<List<CaseIdAndTypeInfo>> caseListSetter) {
        if (this.caseList == null) {
            this.caseList = new ArrayList<>();
        }
        caseListSetter.accept(this.caseList);
        return this;
    }

    /**
     * 用例列表信息
     * @return caseList
     */
    public List<CaseIdAndTypeInfo> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<CaseIdAndTypeInfo> caseList) {
        this.caseList = caseList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseRemoveInfo that = (CaseRemoveInfo) obj;
        return Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.iteratorUri, that.iteratorUri)
            && Objects.equals(this.removeAssociateIssue, that.removeAssociateIssue)
            && Objects.equals(this.caseList, that.caseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUuid, iteratorUri, removeAssociateIssue, caseList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseRemoveInfo {\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    iteratorUri: ").append(toIndentedString(iteratorUri)).append("\n");
        sb.append("    removeAssociateIssue: ").append(toIndentedString(removeAssociateIssue)).append("\n");
        sb.append("    caseList: ").append(toIndentedString(caseList)).append("\n");
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
