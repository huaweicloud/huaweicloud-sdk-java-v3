package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 推送动态负载。
 */
public class PushEventPayloadDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_count")

    private Integer commitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_type")

    private String refType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_from")

    private String commitFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_to")

    private String commitTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_title")

    private String commitTitle;

    public PushEventPayloadDto withCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    /**
     * **参数解释：** 提交数量。
     * minimum: 1
     * maximum: 2147483647
     * @return commitCount
     */
    public Integer getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    public PushEventPayloadDto withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 操作类型。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public PushEventPayloadDto withRefType(String refType) {
        this.refType = refType;
        return this;
    }

    /**
     * **参数解释：** ref类型。
     * @return refType
     */
    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public PushEventPayloadDto withCommitFrom(String commitFrom) {
        this.commitFrom = commitFrom;
        return this;
    }

    /**
     * **参数解释：** 源Commit。
     * @return commitFrom
     */
    public String getCommitFrom() {
        return commitFrom;
    }

    public void setCommitFrom(String commitFrom) {
        this.commitFrom = commitFrom;
    }

    public PushEventPayloadDto withCommitTo(String commitTo) {
        this.commitTo = commitTo;
        return this;
    }

    /**
     * **参数解释：** 目标Commit。
     * @return commitTo
     */
    public String getCommitTo() {
        return commitTo;
    }

    public void setCommitTo(String commitTo) {
        this.commitTo = commitTo;
    }

    public PushEventPayloadDto withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * **参数解释：** 分支。
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public PushEventPayloadDto withCommitTitle(String commitTitle) {
        this.commitTitle = commitTitle;
        return this;
    }

    /**
     * **参数解释：** 提交标题。
     * @return commitTitle
     */
    public String getCommitTitle() {
        return commitTitle;
    }

    public void setCommitTitle(String commitTitle) {
        this.commitTitle = commitTitle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PushEventPayloadDto that = (PushEventPayloadDto) obj;
        return Objects.equals(this.commitCount, that.commitCount) && Objects.equals(this.action, that.action)
            && Objects.equals(this.refType, that.refType) && Objects.equals(this.commitFrom, that.commitFrom)
            && Objects.equals(this.commitTo, that.commitTo) && Objects.equals(this.ref, that.ref)
            && Objects.equals(this.commitTitle, that.commitTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitCount, action, refType, commitFrom, commitTo, ref, commitTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushEventPayloadDto {\n");
        sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
        sb.append("    commitFrom: ").append(toIndentedString(commitFrom)).append("\n");
        sb.append("    commitTo: ").append(toIndentedString(commitTo)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    commitTitle: ").append(toIndentedString(commitTitle)).append("\n");
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
