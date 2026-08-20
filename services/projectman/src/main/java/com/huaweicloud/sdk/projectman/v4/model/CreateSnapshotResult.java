package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建快照的结果
 */
public class CreateSnapshotResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Boolean deletable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errormsg")

    private String errormsg;

    public CreateSnapshotResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 快照ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateSnapshotResult withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 快照名称。创建时自动生成，工作项快照名称生成规则为：“工作项类型”+“ v” + “年”+“.”+“月”+“.”+“日”+“.”+“当日生成版本次数”。例如工作项类型为IR的工作项在2026年3月25日第一次打快照系统生成的快照名称为：IR v26.03.25.1。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateSnapshotResult withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 快照类型。工作项快照固定为：issue_snap_item。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CreateSnapshotResult withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 快照的工作项ID。
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public CreateSnapshotResult withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 快照的创建人ID。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public CreateSnapshotResult withDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * 快照是否可被删除。
     * @return deletable
     */
    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public CreateSnapshotResult withErrormsg(String errormsg) {
        this.errormsg = errormsg;
        return this;
    }

    /**
     * 创建快照失败的原因。
     * @return errormsg
     */
    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSnapshotResult that = (CreateSnapshotResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.title, that.title)
            && Objects.equals(this.category, that.category) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.deletable, that.deletable)
            && Objects.equals(this.errormsg, that.errormsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, category, issueId, createdBy, deletable, errormsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
        sb.append("    errormsg: ").append(toIndentedString(errormsg)).append("\n");
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
