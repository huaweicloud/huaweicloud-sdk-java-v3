package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTaskTestCasesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_case_uris")

    private List<String> relatedCaseUris = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_related_case_uris")

    private List<String> notRelatedCaseUris = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_task_info")

    private List<RelateTaskTestCasesVo> caseTaskInfo = null;

    public ListTaskTestCasesResponse withRelatedCaseUris(List<String> relatedCaseUris) {
        this.relatedCaseUris = relatedCaseUris;
        return this;
    }

    public ListTaskTestCasesResponse addRelatedCaseUrisItem(String relatedCaseUrisItem) {
        if (this.relatedCaseUris == null) {
            this.relatedCaseUris = new ArrayList<>();
        }
        this.relatedCaseUris.add(relatedCaseUrisItem);
        return this;
    }

    public ListTaskTestCasesResponse withRelatedCaseUris(Consumer<List<String>> relatedCaseUrisSetter) {
        if (this.relatedCaseUris == null) {
            this.relatedCaseUris = new ArrayList<>();
        }
        relatedCaseUrisSetter.accept(this.relatedCaseUris);
        return this;
    }

    /**
     * 关联的用例uris
     * @return relatedCaseUris
     */
    public List<String> getRelatedCaseUris() {
        return relatedCaseUris;
    }

    public void setRelatedCaseUris(List<String> relatedCaseUris) {
        this.relatedCaseUris = relatedCaseUris;
    }

    public ListTaskTestCasesResponse withNotRelatedCaseUris(List<String> notRelatedCaseUris) {
        this.notRelatedCaseUris = notRelatedCaseUris;
        return this;
    }

    public ListTaskTestCasesResponse addNotRelatedCaseUrisItem(String notRelatedCaseUrisItem) {
        if (this.notRelatedCaseUris == null) {
            this.notRelatedCaseUris = new ArrayList<>();
        }
        this.notRelatedCaseUris.add(notRelatedCaseUrisItem);
        return this;
    }

    public ListTaskTestCasesResponse withNotRelatedCaseUris(Consumer<List<String>> notRelatedCaseUrisSetter) {
        if (this.notRelatedCaseUris == null) {
            this.notRelatedCaseUris = new ArrayList<>();
        }
        notRelatedCaseUrisSetter.accept(this.notRelatedCaseUris);
        return this;
    }

    /**
     * 未关联的用例uris
     * @return notRelatedCaseUris
     */
    public List<String> getNotRelatedCaseUris() {
        return notRelatedCaseUris;
    }

    public void setNotRelatedCaseUris(List<String> notRelatedCaseUris) {
        this.notRelatedCaseUris = notRelatedCaseUris;
    }

    public ListTaskTestCasesResponse withCaseTaskInfo(List<RelateTaskTestCasesVo> caseTaskInfo) {
        this.caseTaskInfo = caseTaskInfo;
        return this;
    }

    public ListTaskTestCasesResponse addCaseTaskInfoItem(RelateTaskTestCasesVo caseTaskInfoItem) {
        if (this.caseTaskInfo == null) {
            this.caseTaskInfo = new ArrayList<>();
        }
        this.caseTaskInfo.add(caseTaskInfoItem);
        return this;
    }

    public ListTaskTestCasesResponse withCaseTaskInfo(Consumer<List<RelateTaskTestCasesVo>> caseTaskInfoSetter) {
        if (this.caseTaskInfo == null) {
            this.caseTaskInfo = new ArrayList<>();
        }
        caseTaskInfoSetter.accept(this.caseTaskInfo);
        return this;
    }

    /**
     * 用例及任务信息
     * @return caseTaskInfo
     */
    public List<RelateTaskTestCasesVo> getCaseTaskInfo() {
        return caseTaskInfo;
    }

    public void setCaseTaskInfo(List<RelateTaskTestCasesVo> caseTaskInfo) {
        this.caseTaskInfo = caseTaskInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskTestCasesResponse that = (ListTaskTestCasesResponse) obj;
        return Objects.equals(this.relatedCaseUris, that.relatedCaseUris)
            && Objects.equals(this.notRelatedCaseUris, that.notRelatedCaseUris)
            && Objects.equals(this.caseTaskInfo, that.caseTaskInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relatedCaseUris, notRelatedCaseUris, caseTaskInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskTestCasesResponse {\n");
        sb.append("    relatedCaseUris: ").append(toIndentedString(relatedCaseUris)).append("\n");
        sb.append("    notRelatedCaseUris: ").append(toIndentedString(notRelatedCaseUris)).append("\n");
        sb.append("    caseTaskInfo: ").append(toIndentedString(caseTaskInfo)).append("\n");
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
