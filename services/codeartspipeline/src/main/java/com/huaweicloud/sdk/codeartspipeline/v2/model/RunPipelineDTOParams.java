package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 流水线源相关参数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
 */
public class RunPipelineDTOParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_type")

    private String gitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_id")

    private String codehubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_branch")

    private String defaultBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_params")

    private RunPipelineDTOParamsBuildParams buildParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_request_ids")

    private List<String> changeRequestIds = null;

    public RunPipelineDTOParams withGitType(String gitType) {
        this.gitType = gitType;
        return this;
    }

    /**
     * **参数解释**： 代码仓类型。 **约束限制**： 不涉及。 **取值范围**： - codehub。 - gitee。 - github。 - gitcode。 - gitlab。 **默认取值**： 不涉及。 
     * @return gitType
     */
    public String getGitType() {
        return gitType;
    }

    public void setGitType(String gitType) {
        this.gitType = gitType;
    }

    public RunPipelineDTOParams withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * **参数解释**： 代码仓别名，用户自定义，用于多仓时帮助区分系统参数。例如：A_REPO_COMMIT_ID，B_REPO_COMMIT_ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public RunPipelineDTOParams withCodehubId(String codehubId) {
        this.codehubId = codehubId;
        return this;
    }

    /**
     * **参数解释**： CodeArts Repo代码仓ID。可以通过代码仓查询接口获取，代码仓的唯一标识。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return codehubId
     */
    public String getCodehubId() {
        return codehubId;
    }

    public void setCodehubId(String codehubId) {
        this.codehubId = codehubId;
    }

    public RunPipelineDTOParams withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * **参数解释**： 流水线执行时代码仓默认分支。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public RunPipelineDTOParams withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释**： Git仓库https地址，例如https://example.com/CloudPipelinezycs00001/2000.git。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public RunPipelineDTOParams withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**： 代码源扩展点ID。可以通过[查询扩展点列表接口](ListEndpointsDetails.xml)获取，其中endpoints.uuid即为扩展点的唯一标识。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public RunPipelineDTOParams withBuildParams(RunPipelineDTOParamsBuildParams buildParams) {
        this.buildParams = buildParams;
        return this;
    }

    public RunPipelineDTOParams withBuildParams(Consumer<RunPipelineDTOParamsBuildParams> buildParamsSetter) {
        if (this.buildParams == null) {
            this.buildParams = new RunPipelineDTOParamsBuildParams();
            buildParamsSetter.accept(this.buildParams);
        }

        return this;
    }

    /**
     * Get buildParams
     * @return buildParams
     */
    public RunPipelineDTOParamsBuildParams getBuildParams() {
        return buildParams;
    }

    public void setBuildParams(RunPipelineDTOParamsBuildParams buildParams) {
        this.buildParams = buildParams;
    }

    public RunPipelineDTOParams withChangeRequestIds(List<String> changeRequestIds) {
        this.changeRequestIds = changeRequestIds;
        return this;
    }

    public RunPipelineDTOParams addChangeRequestIdsItem(String changeRequestIdsItem) {
        if (this.changeRequestIds == null) {
            this.changeRequestIds = new ArrayList<>();
        }
        this.changeRequestIds.add(changeRequestIdsItem);
        return this;
    }

    public RunPipelineDTOParams withChangeRequestIds(Consumer<List<String>> changeRequestIdsSetter) {
        if (this.changeRequestIds == null) {
            this.changeRequestIds = new ArrayList<>();
        }
        changeRequestIdsSetter.accept(this.changeRequestIds);
        return this;
    }

    /**
     * **参数解释**： 执行变更流水线变更ID列表。可以通过[查询变更列表](ListChangeRequests.xml)接口，其中data.id即为变更ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return changeRequestIds
     */
    public List<String> getChangeRequestIds() {
        return changeRequestIds;
    }

    public void setChangeRequestIds(List<String> changeRequestIds) {
        this.changeRequestIds = changeRequestIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunPipelineDTOParams that = (RunPipelineDTOParams) obj;
        return Objects.equals(this.gitType, that.gitType) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.codehubId, that.codehubId) && Objects.equals(this.defaultBranch, that.defaultBranch)
            && Objects.equals(this.gitUrl, that.gitUrl) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.buildParams, that.buildParams)
            && Objects.equals(this.changeRequestIds, that.changeRequestIds);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(gitType, alias, codehubId, defaultBranch, gitUrl, endpointId, buildParams, changeRequestIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunPipelineDTOParams {\n");
        sb.append("    gitType: ").append(toIndentedString(gitType)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    codehubId: ").append(toIndentedString(codehubId)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    buildParams: ").append(toIndentedString(buildParams)).append("\n");
        sb.append("    changeRequestIds: ").append(toIndentedString(changeRequestIds)).append("\n");
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
