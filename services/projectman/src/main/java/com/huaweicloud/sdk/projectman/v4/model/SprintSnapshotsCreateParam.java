package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建迭代快照请求对象
 */
public class SprintSnapshotsCreateParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public SprintSnapshotsCreateParam withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 快照标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SprintSnapshotsCreateParam withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 计划唯一ID。可以通过IPD项目计划管理章节中发布/迭代计划列表查询接口获取，响应消息体中的id字段的值就是计划ID。
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public SprintSnapshotsCreateParam withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 计划类别。可以通过IPD项目计划管理章节中发布/迭代计划列表查询接口获取，响应消息体中的category字段的值就是计划类别。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SprintSnapshotsCreateParam that = (SprintSnapshotsCreateParam) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, issueId, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SprintSnapshotsCreateParam {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
