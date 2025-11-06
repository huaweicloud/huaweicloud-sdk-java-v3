package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddProtectResponse
 */
public class AddProtectResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private CommitRepoV2 commit;

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
    @JsonProperty(value = "master_can_push")

    private Boolean masterCanPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_can_merge")

    private Boolean masterCanMerge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_one_can_push")

    private Boolean noOneCanPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_one_can_merge")

    private Boolean noOneCanMerge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_an_opened_merge_request")

    private Boolean inAnOpenedMergeRequest;

    public AddProtectResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分支名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddProtectResponse withCommit(CommitRepoV2 commit) {
        this.commit = commit;
        return this;
    }

    public AddProtectResponse withCommit(Consumer<CommitRepoV2> commitSetter) {
        if (this.commit == null) {
            this.commit = new CommitRepoV2();
            commitSetter.accept(this.commit);
        }

        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    public CommitRepoV2 getCommit() {
        return commit;
    }

    public void setCommit(CommitRepoV2 commit) {
        this.commit = commit;
    }

    public AddProtectResponse withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    /**
     * 是否保护
     * @return _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public AddProtectResponse withDevelopersCanPush(Boolean developersCanPush) {
        this.developersCanPush = developersCanPush;
        return this;
    }

    /**
     * 是否允许开发者提交
     * @return developersCanPush
     */
    public Boolean getDevelopersCanPush() {
        return developersCanPush;
    }

    public void setDevelopersCanPush(Boolean developersCanPush) {
        this.developersCanPush = developersCanPush;
    }

    public AddProtectResponse withDevelopersCanMerge(Boolean developersCanMerge) {
        this.developersCanMerge = developersCanMerge;
        return this;
    }

    /**
     * 是否允许开发者合并
     * @return developersCanMerge
     */
    public Boolean getDevelopersCanMerge() {
        return developersCanMerge;
    }

    public void setDevelopersCanMerge(Boolean developersCanMerge) {
        this.developersCanMerge = developersCanMerge;
    }

    public AddProtectResponse withMasterCanPush(Boolean masterCanPush) {
        this.masterCanPush = masterCanPush;
        return this;
    }

    /**
     * 是否允许管理员提交
     * @return masterCanPush
     */
    public Boolean getMasterCanPush() {
        return masterCanPush;
    }

    public void setMasterCanPush(Boolean masterCanPush) {
        this.masterCanPush = masterCanPush;
    }

    public AddProtectResponse withMasterCanMerge(Boolean masterCanMerge) {
        this.masterCanMerge = masterCanMerge;
        return this;
    }

    /**
     * 是否允许管理员合并
     * @return masterCanMerge
     */
    public Boolean getMasterCanMerge() {
        return masterCanMerge;
    }

    public void setMasterCanMerge(Boolean masterCanMerge) {
        this.masterCanMerge = masterCanMerge;
    }

    public AddProtectResponse withNoOneCanPush(Boolean noOneCanPush) {
        this.noOneCanPush = noOneCanPush;
        return this;
    }

    /**
     * 没有人允许提交
     * @return noOneCanPush
     */
    public Boolean getNoOneCanPush() {
        return noOneCanPush;
    }

    public void setNoOneCanPush(Boolean noOneCanPush) {
        this.noOneCanPush = noOneCanPush;
    }

    public AddProtectResponse withNoOneCanMerge(Boolean noOneCanMerge) {
        this.noOneCanMerge = noOneCanMerge;
        return this;
    }

    /**
     * 没有人允许合并
     * @return noOneCanMerge
     */
    public Boolean getNoOneCanMerge() {
        return noOneCanMerge;
    }

    public void setNoOneCanMerge(Boolean noOneCanMerge) {
        this.noOneCanMerge = noOneCanMerge;
    }

    public AddProtectResponse withInAnOpenedMergeRequest(Boolean inAnOpenedMergeRequest) {
        this.inAnOpenedMergeRequest = inAnOpenedMergeRequest;
        return this;
    }

    /**
     * 是否在一个打开的合并请求
     * @return inAnOpenedMergeRequest
     */
    public Boolean getInAnOpenedMergeRequest() {
        return inAnOpenedMergeRequest;
    }

    public void setInAnOpenedMergeRequest(Boolean inAnOpenedMergeRequest) {
        this.inAnOpenedMergeRequest = inAnOpenedMergeRequest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddProtectResponse that = (AddProtectResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.commit, that.commit)
            && Objects.equals(this._protected, that._protected)
            && Objects.equals(this.developersCanPush, that.developersCanPush)
            && Objects.equals(this.developersCanMerge, that.developersCanMerge)
            && Objects.equals(this.masterCanPush, that.masterCanPush)
            && Objects.equals(this.masterCanMerge, that.masterCanMerge)
            && Objects.equals(this.noOneCanPush, that.noOneCanPush)
            && Objects.equals(this.noOneCanMerge, that.noOneCanMerge)
            && Objects.equals(this.inAnOpenedMergeRequest, that.inAnOpenedMergeRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            commit,
            _protected,
            developersCanPush,
            developersCanMerge,
            masterCanPush,
            masterCanMerge,
            noOneCanPush,
            noOneCanMerge,
            inAnOpenedMergeRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddProtectResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    developersCanPush: ").append(toIndentedString(developersCanPush)).append("\n");
        sb.append("    developersCanMerge: ").append(toIndentedString(developersCanMerge)).append("\n");
        sb.append("    masterCanPush: ").append(toIndentedString(masterCanPush)).append("\n");
        sb.append("    masterCanMerge: ").append(toIndentedString(masterCanMerge)).append("\n");
        sb.append("    noOneCanPush: ").append(toIndentedString(noOneCanPush)).append("\n");
        sb.append("    noOneCanMerge: ").append(toIndentedString(noOneCanMerge)).append("\n");
        sb.append("    inAnOpenedMergeRequest: ").append(toIndentedString(inAnOpenedMergeRequest)).append("\n");
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
