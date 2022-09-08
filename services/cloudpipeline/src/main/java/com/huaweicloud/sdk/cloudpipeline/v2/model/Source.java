package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源码仓库参数
 */
public class Source {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_name")

    private String codehubName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branches")

    private List<String> branches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_type")

    private String scmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_flag")

    private Boolean hookFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_id")

    private String codehubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_list")

    private List<String> branchList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "init_id")

    private String initId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    public Source withCodehubName(String codehubName) {
        this.codehubName = codehubName;
        return this;
    }

    /**
     * 源码仓名字
     * @return codehubName
     */
    public String getCodehubName() {
        return codehubName;
    }

    public void setCodehubName(String codehubName) {
        this.codehubName = codehubName;
    }

    public Source withBranches(List<String> branches) {
        this.branches = branches;
        return this;
    }

    public Source addBranchesItem(String branchesItem) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        this.branches.add(branchesItem);
        return this;
    }

    public Source withBranches(Consumer<List<String>> branchesSetter) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        branchesSetter.accept(this.branches);
        return this;
    }

    /**
     * 触发分支
     * @return branches
     */
    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public Source withScmType(String scmType) {
        this.scmType = scmType;
        return this;
    }

    /**
     * 源码仓来源
     * @return scmType
     */
    public String getScmType() {
        return scmType;
    }

    public void setScmType(String scmType) {
        this.scmType = scmType;
    }

    public Source withHookFlag(Boolean hookFlag) {
        this.hookFlag = hookFlag;
        return this;
    }

    /**
     * 是否开启触发执行流水线功能
     * @return hookFlag
     */
    public Boolean getHookFlag() {
        return hookFlag;
    }

    public void setHookFlag(Boolean hookFlag) {
        this.hookFlag = hookFlag;
    }

    public Source withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 触发分支
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Source withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * 源码仓ssh地址
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public Source withCodehubId(String codehubId) {
        this.codehubId = codehubId;
        return this;
    }

    /**
     * 源码仓ID
     * @return codehubId
     */
    public String getCodehubId() {
        return codehubId;
    }

    public void setCodehubId(String codehubId) {
        this.codehubId = codehubId;
    }

    public Source withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 源码仓首页url
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public Source withBranchList(List<String> branchList) {
        this.branchList = branchList;
        return this;
    }

    public Source addBranchListItem(String branchListItem) {
        if (this.branchList == null) {
            this.branchList = new ArrayList<>();
        }
        this.branchList.add(branchListItem);
        return this;
    }

    public Source withBranchList(Consumer<List<String>> branchListSetter) {
        if (this.branchList == null) {
            this.branchList = new ArrayList<>();
        }
        branchListSetter.accept(this.branchList);
        return this;
    }

    /**
     * 分支列表
     * @return branchList
     */
    public List<String> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<String> branchList) {
        this.branchList = branchList;
    }

    public Source withInitId(String initId) {
        this.initId = initId;
        return this;
    }

    /**
     * 初始化ID
     * @return initId
     */
    public String getInitId() {
        return initId;
    }

    public void setInitId(String initId) {
        this.initId = initId;
    }

    public Source withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * 是否废弃
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Source source = (Source) o;
        return Objects.equals(this.codehubName, source.codehubName) && Objects.equals(this.branches, source.branches)
            && Objects.equals(this.scmType, source.scmType) && Objects.equals(this.hookFlag, source.hookFlag)
            && Objects.equals(this.branch, source.branch) && Objects.equals(this.gitUrl, source.gitUrl)
            && Objects.equals(this.codehubId, source.codehubId) && Objects.equals(this.webUrl, source.webUrl)
            && Objects.equals(this.branchList, source.branchList) && Objects.equals(this.initId, source.initId)
            && Objects.equals(this.disable, source.disable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codehubName,
            branches,
            scmType,
            hookFlag,
            branch,
            gitUrl,
            codehubId,
            webUrl,
            branchList,
            initId,
            disable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Source {\n");
        sb.append("    codehubName: ").append(toIndentedString(codehubName)).append("\n");
        sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
        sb.append("    scmType: ").append(toIndentedString(scmType)).append("\n");
        sb.append("    hookFlag: ").append(toIndentedString(hookFlag)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    codehubId: ").append(toIndentedString(codehubId)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    branchList: ").append(toIndentedString(branchList)).append("\n");
        sb.append("    initId: ").append(toIndentedString(initId)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
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
