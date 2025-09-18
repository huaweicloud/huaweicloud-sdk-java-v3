package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PipelineTrigger
 */
public class PipelineTrigger {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_type")

    private String gitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_commit")

    private Boolean isAutoCommit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<CodeEvent> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    private String hookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private String repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_token")

    private String securityToken;

    public PipelineTrigger withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * **参数解释**： 流水线ID，可以通过[查询流水线列表](ListPipelines.xml)接口，其中pipelines.pipelineId即为流水线ID。 **约束限制**： 不涉及。 **取值范围**： 32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public PipelineTrigger withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释**： 代码仓git链接。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public PipelineTrigger withGitType(String gitType) {
        this.gitType = gitType;
        return this;
    }

    /**
     * **参数解释**： git代码仓类型。 **约束限制**： 不涉及。 **取值范围**： - codehub。 - gitee。 - github。 - gitcode。 - gitlab。 **默认取值**： 不涉及。 
     * @return gitType
     */
    public String getGitType() {
        return gitType;
    }

    public void setGitType(String gitType) {
        this.gitType = gitType;
    }

    public PipelineTrigger withIsAutoCommit(Boolean isAutoCommit) {
        this.isAutoCommit = isAutoCommit;
        return this;
    }

    /**
     * **参数解释**： 是否自动提交。gitee仓库特有，webhook触发流水线后，自动添加评论。 **约束限制**： 不涉及。 **取值范围**： - true：是自动提交。 - false：不是自动提交。 **默认取值**： 不涉及。 
     * @return isAutoCommit
     */
    public Boolean getIsAutoCommit() {
        return isAutoCommit;
    }

    public void setIsAutoCommit(Boolean isAutoCommit) {
        this.isAutoCommit = isAutoCommit;
    }

    public PipelineTrigger withEvents(List<CodeEvent> events) {
        this.events = events;
        return this;
    }

    public PipelineTrigger addEventsItem(CodeEvent eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public PipelineTrigger withEvents(Consumer<List<CodeEvent>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * **参数解释**： 触发事件列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return events
     */
    public List<CodeEvent> getEvents() {
        return events;
    }

    public void setEvents(List<CodeEvent> events) {
        this.events = events;
    }

    public PipelineTrigger withHookId(String hookId) {
        this.hookId = hookId;
        return this;
    }

    /**
     * **参数解释**： 系统生成的回调ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return hookId
     */
    public String getHookId() {
        return hookId;
    }

    public void setHookId(String hookId) {
        this.hookId = hookId;
    }

    public PipelineTrigger withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * **参数解释**： Repo仓库ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public PipelineTrigger withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**： 代码源扩展点ID。 **约束限制**： 不涉及。 **取值范围**： 32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public PipelineTrigger withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * **参数解释**： 回调链接，注册Webhook时生成。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public PipelineTrigger withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * **参数解释**： 用户token，注册Webhook时生成。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return securityToken
     */
    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineTrigger that = (PipelineTrigger) obj;
        return Objects.equals(this.pipelineId, that.pipelineId) && Objects.equals(this.gitUrl, that.gitUrl)
            && Objects.equals(this.gitType, that.gitType) && Objects.equals(this.isAutoCommit, that.isAutoCommit)
            && Objects.equals(this.events, that.events) && Objects.equals(this.hookId, that.hookId)
            && Objects.equals(this.repoId, that.repoId) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.callbackUrl, that.callbackUrl)
            && Objects.equals(this.securityToken, that.securityToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId,
            gitUrl,
            gitType,
            isAutoCommit,
            events,
            hookId,
            repoId,
            endpointId,
            callbackUrl,
            securityToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineTrigger {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    gitType: ").append(toIndentedString(gitType)).append("\n");
        sb.append("    isAutoCommit: ").append(toIndentedString(isAutoCommit)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
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
