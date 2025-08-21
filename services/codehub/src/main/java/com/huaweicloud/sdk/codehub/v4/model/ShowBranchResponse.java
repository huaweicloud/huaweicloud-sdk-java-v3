package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBranchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private CommitDto commit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged")

    private Boolean merged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected")

    private Boolean _protected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developers_can_push")

    private Boolean developersCanPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developers_can_merge")

    private Boolean developersCanMerge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_push")

    private Boolean canPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ShowBranchResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分支名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowBranchResponse withCommit(CommitDto commit) {
        this.commit = commit;
        return this;
    }

    public ShowBranchResponse withCommit(Consumer<CommitDto> commitSetter) {
        if (this.commit == null) {
            this.commit = new CommitDto();
            commitSetter.accept(this.commit);
        }

        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    public CommitDto getCommit() {
        return commit;
    }

    public void setCommit(CommitDto commit) {
        this.commit = commit;
    }

    public ShowBranchResponse withMerged(Boolean merged) {
        this.merged = merged;
        return this;
    }

    /**
     * 用户id
     * @return merged
     */
    public Boolean getMerged() {
        return merged;
    }

    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public ShowBranchResponse withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    /**
     * 是否为保护分支
     * @return _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public ShowBranchResponse withDevelopersCanPush(Boolean developersCanPush) {
        this.developersCanPush = developersCanPush;
        return this;
    }

    /**
     * 开发者是否可以推送
     * @return developersCanPush
     */
    public Boolean getDevelopersCanPush() {
        return developersCanPush;
    }

    public void setDevelopersCanPush(Boolean developersCanPush) {
        this.developersCanPush = developersCanPush;
    }

    public ShowBranchResponse withDevelopersCanMerge(Boolean developersCanMerge) {
        this.developersCanMerge = developersCanMerge;
        return this;
    }

    /**
     * 开发者是否可以合并
     * @return developersCanMerge
     */
    public Boolean getDevelopersCanMerge() {
        return developersCanMerge;
    }

    public void setDevelopersCanMerge(Boolean developersCanMerge) {
        this.developersCanMerge = developersCanMerge;
    }

    public ShowBranchResponse withCanPush(Boolean canPush) {
        this.canPush = canPush;
        return this;
    }

    /**
     * 是否可以推送
     * @return canPush
     */
    public Boolean getCanPush() {
        return canPush;
    }

    public void setCanPush(Boolean canPush) {
        this.canPush = canPush;
    }

    public ShowBranchResponse withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 是否为默认分支
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public ShowBranchResponse withXTotal(String xTotal) {
        this.xTotal = xTotal;
        return this;
    }

    /**
     * Get xTotal
     * @return xTotal
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")
    public String getXTotal() {
        return xTotal;
    }

    public void setXTotal(String xTotal) {
        this.xTotal = xTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBranchResponse that = (ShowBranchResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.commit, that.commit)
            && Objects.equals(this.merged, that.merged) && Objects.equals(this._protected, that._protected)
            && Objects.equals(this.developersCanPush, that.developersCanPush)
            && Objects.equals(this.developersCanMerge, that.developersCanMerge)
            && Objects.equals(this.canPush, that.canPush) && Objects.equals(this._default, that._default)
            && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, commit, merged, _protected, developersCanPush, developersCanMerge, canPush, _default, xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBranchResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    merged: ").append(toIndentedString(merged)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    developersCanPush: ").append(toIndentedString(developersCanPush)).append("\n");
        sb.append("    developersCanMerge: ").append(toIndentedString(developersCanMerge)).append("\n");
        sb.append("    canPush: ").append(toIndentedString(canPush)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    xTotal: ").append(toIndentedString(xTotal)).append("\n");
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
