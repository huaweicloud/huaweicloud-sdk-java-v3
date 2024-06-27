package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteTestCaseInfo
 */
public class DeleteTestCaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_ids")

    private List<String> caseIds = null;

    public DeleteTestCaseInfo withProjectUuid(String projectUuid) {
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

    public DeleteTestCaseInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 分支uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public DeleteTestCaseInfo withCaseIds(List<String> caseIds) {
        this.caseIds = caseIds;
        return this;
    }

    public DeleteTestCaseInfo addCaseIdsItem(String caseIdsItem) {
        if (this.caseIds == null) {
            this.caseIds = new ArrayList<>();
        }
        this.caseIds.add(caseIdsItem);
        return this;
    }

    public DeleteTestCaseInfo withCaseIds(Consumer<List<String>> caseIdsSetter) {
        if (this.caseIds == null) {
            this.caseIds = new ArrayList<>();
        }
        caseIdsSetter.accept(this.caseIds);
        return this;
    }

    /**
     * 用例id列表
     * @return caseIds
     */
    public List<String> getCaseIds() {
        return caseIds;
    }

    public void setCaseIds(List<String> caseIds) {
        this.caseIds = caseIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTestCaseInfo that = (DeleteTestCaseInfo) obj;
        return Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.versionUri, that.versionUri)
            && Objects.equals(this.caseIds, that.caseIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUuid, versionUri, caseIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTestCaseInfo {\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    caseIds: ").append(toIndentedString(caseIds)).append("\n");
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
