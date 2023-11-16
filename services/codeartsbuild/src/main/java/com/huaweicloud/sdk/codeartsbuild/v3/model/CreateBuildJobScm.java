package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 构建执行SCM
 */
public class CreateBuildJobScm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private String repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_type")

    private String scmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_build")

    private Boolean isAutoBuild;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_type")

    private String buildType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depth")

    private String depth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_point_id")

    private String endPointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    public CreateBuildJobScm withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 代码分支
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public CreateBuildJobScm withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 代码仓地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CreateBuildJobScm withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * repo的id
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public CreateBuildJobScm withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 代码仓http地址
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public CreateBuildJobScm withScmType(String scmType) {
        this.scmType = scmType;
        return this;
    }

    /**
     * 仓库类别，codehub还是github等等
     * @return scmType
     */
    public String getScmType() {
        return scmType;
    }

    public void setScmType(String scmType) {
        this.scmType = scmType;
    }

    public CreateBuildJobScm withIsAutoBuild(Boolean isAutoBuild) {
        this.isAutoBuild = isAutoBuild;
        return this;
    }

    /**
     * 是否自动构建
     * @return isAutoBuild
     */
    public Boolean getIsAutoBuild() {
        return isAutoBuild;
    }

    public void setIsAutoBuild(Boolean isAutoBuild) {
        this.isAutoBuild = isAutoBuild;
    }

    public CreateBuildJobScm withBuildType(String buildType) {
        this.buildType = buildType;
        return this;
    }

    /**
     * 构建类别
     * @return buildType
     */
    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public CreateBuildJobScm withDepth(String depth) {
        this.depth = depth;
        return this;
    }

    /**
     * 克隆深度
     * @return depth
     */
    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public CreateBuildJobScm withEndPointId(String endPointId) {
        this.endPointId = endPointId;
        return this;
    }

    /**
     * endpointId
     * @return endPointId
     */
    public String getEndPointId() {
        return endPointId;
    }

    public void setEndPointId(String endPointId) {
        this.endPointId = endPointId;
    }

    public CreateBuildJobScm withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * source
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBuildJobScm that = (CreateBuildJobScm) obj;
        return Objects.equals(this.branch, that.branch) && Objects.equals(this.url, that.url)
            && Objects.equals(this.repoId, that.repoId) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.scmType, that.scmType) && Objects.equals(this.isAutoBuild, that.isAutoBuild)
            && Objects.equals(this.buildType, that.buildType) && Objects.equals(this.depth, that.depth)
            && Objects.equals(this.endPointId, that.endPointId) && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, url, repoId, webUrl, scmType, isAutoBuild, buildType, depth, endPointId, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBuildJobScm {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    scmType: ").append(toIndentedString(scmType)).append("\n");
        sb.append("    isAutoBuild: ").append(toIndentedString(isAutoBuild)).append("\n");
        sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
        sb.append("    endPointId: ").append(toIndentedString(endPointId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
