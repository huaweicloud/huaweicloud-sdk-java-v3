package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class ListBriefRecordResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brief_build_record_dtos")

    private List<BriefRecordItems> briefBuildRecordDtos = null;

    public ListBriefRecordResponseBodyResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 需要查询的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListBriefRecordResponseBodyResult withBriefBuildRecordDtos(List<BriefRecordItems> briefBuildRecordDtos) {
        this.briefBuildRecordDtos = briefBuildRecordDtos;
        return this;
    }

    public ListBriefRecordResponseBodyResult addBriefBuildRecordDtosItem(BriefRecordItems briefBuildRecordDtosItem) {
        if (this.briefBuildRecordDtos == null) {
            this.briefBuildRecordDtos = new ArrayList<>();
        }
        this.briefBuildRecordDtos.add(briefBuildRecordDtosItem);
        return this;
    }

    public ListBriefRecordResponseBodyResult withBriefBuildRecordDtos(
        Consumer<List<BriefRecordItems>> briefBuildRecordDtosSetter) {
        if (this.briefBuildRecordDtos == null) {
            this.briefBuildRecordDtos = new ArrayList<>();
        }
        briefBuildRecordDtosSetter.accept(this.briefBuildRecordDtos);
        return this;
    }

    /**
     * 简要构建信息列表
     * @return briefBuildRecordDtos
     */
    public List<BriefRecordItems> getBriefBuildRecordDtos() {
        return briefBuildRecordDtos;
    }

    public void setBriefBuildRecordDtos(List<BriefRecordItems> briefBuildRecordDtos) {
        this.briefBuildRecordDtos = briefBuildRecordDtos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBriefRecordResponseBodyResult that = (ListBriefRecordResponseBodyResult) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.briefBuildRecordDtos, that.briefBuildRecordDtos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, briefBuildRecordDtos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBriefRecordResponseBodyResult {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    briefBuildRecordDtos: ").append(toIndentedString(briefBuildRecordDtos)).append("\n");
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
