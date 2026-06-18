package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProjectWebhookResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_events")

    private Boolean pushEvents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_events_branch_regex_filter")

    private String pushEventsBranchRegexFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note_plain_text_filter")

    private List<String> notePlainTextFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_push_events")

    private Boolean tagPushEvents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_requests_events")

    private Boolean mergeRequestsEvents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note_events")

    private Boolean noteEvents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_type")

    private String tokenType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_cfgs")

    private List<WebHookEventCfgDto> eventCfgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_cfgs")

    private List<WebHookBranchCfgDto> projectCfgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_cfgs")

    private List<WebHookBranchCfgDto> branchCfgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    public ShowProjectWebhookResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** webhook地址。 **取值范围：** 字符串长度不少于0，不超过500。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowProjectWebhookResponse withPushEvents(Boolean pushEvents) {
        this.pushEvents = pushEvents;
        return this;
    }

    /**
     * **参数解释：** 是否启用推送事件。
     * @return pushEvents
     */
    public Boolean getPushEvents() {
        return pushEvents;
    }

    public void setPushEvents(Boolean pushEvents) {
        this.pushEvents = pushEvents;
    }

    public ShowProjectWebhookResponse withPushEventsBranchRegexFilter(String pushEventsBranchRegexFilter) {
        this.pushEventsBranchRegexFilter = pushEventsBranchRegexFilter;
        return this;
    }

    /**
     * **参数解释：** 推送事件分支过滤正则规则。 **取值范围：** 字符串长度不少于0，不超过500。                
     * @return pushEventsBranchRegexFilter
     */
    public String getPushEventsBranchRegexFilter() {
        return pushEventsBranchRegexFilter;
    }

    public void setPushEventsBranchRegexFilter(String pushEventsBranchRegexFilter) {
        this.pushEventsBranchRegexFilter = pushEventsBranchRegexFilter;
    }

    public ShowProjectWebhookResponse withNotePlainTextFilter(List<String> notePlainTextFilter) {
        this.notePlainTextFilter = notePlainTextFilter;
        return this;
    }

    public ShowProjectWebhookResponse addNotePlainTextFilterItem(String notePlainTextFilterItem) {
        if (this.notePlainTextFilter == null) {
            this.notePlainTextFilter = new ArrayList<>();
        }
        this.notePlainTextFilter.add(notePlainTextFilterItem);
        return this;
    }

    public ShowProjectWebhookResponse withNotePlainTextFilter(Consumer<List<String>> notePlainTextFilterSetter) {
        if (this.notePlainTextFilter == null) {
            this.notePlainTextFilter = new ArrayList<>();
        }
        notePlainTextFilterSetter.accept(this.notePlainTextFilter);
        return this;
    }

    /**
     * **参数解释：** 评论事件文本过滤规则。 **取值范围：** 字符串长度不少于0，不超过50，不能超过10个。  
     * @return notePlainTextFilter
     */
    public List<String> getNotePlainTextFilter() {
        return notePlainTextFilter;
    }

    public void setNotePlainTextFilter(List<String> notePlainTextFilter) {
        this.notePlainTextFilter = notePlainTextFilter;
    }

    public ShowProjectWebhookResponse withTagPushEvents(Boolean tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
        return this;
    }

    /**
     * **参数解释：** 是否启用Tag推送事件。
     * @return tagPushEvents
     */
    public Boolean getTagPushEvents() {
        return tagPushEvents;
    }

    public void setTagPushEvents(Boolean tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
    }

    public ShowProjectWebhookResponse withMergeRequestsEvents(Boolean mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
        return this;
    }

    /**
     * **参数解释：** 是否启用合并请求事件。
     * @return mergeRequestsEvents
     */
    public Boolean getMergeRequestsEvents() {
        return mergeRequestsEvents;
    }

    public void setMergeRequestsEvents(Boolean mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
    }

    public ShowProjectWebhookResponse withNoteEvents(Boolean noteEvents) {
        this.noteEvents = noteEvents;
        return this;
    }

    /**
     * **参数解释：** 是否启用评论事件。
     * @return noteEvents
     */
    public Boolean getNoteEvents() {
        return noteEvents;
    }

    public void setNoteEvents(Boolean noteEvents) {
        this.noteEvents = noteEvents;
    }

    public ShowProjectWebhookResponse withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * **参数解释：** token值，作为返回值时会使用掩码代替实际值。 **取值范围：** 字符串长度不少于0，不超过2000。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ShowProjectWebhookResponse withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * **参数解释：** token类型，默认为X-Repo-Token。 **取值范围：** 字符串长度不少于0，不超过200。
     * @return tokenType
     */
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public ShowProjectWebhookResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 名称。 **取值范围：** 字符串长度不少于0，不超过200。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowProjectWebhookResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述。 **取值范围：** 字符串长度不少于0，不超过200。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowProjectWebhookResponse withEventCfgs(List<WebHookEventCfgDto> eventCfgs) {
        this.eventCfgs = eventCfgs;
        return this;
    }

    public ShowProjectWebhookResponse addEventCfgsItem(WebHookEventCfgDto eventCfgsItem) {
        if (this.eventCfgs == null) {
            this.eventCfgs = new ArrayList<>();
        }
        this.eventCfgs.add(eventCfgsItem);
        return this;
    }

    public ShowProjectWebhookResponse withEventCfgs(Consumer<List<WebHookEventCfgDto>> eventCfgsSetter) {
        if (this.eventCfgs == null) {
            this.eventCfgs = new ArrayList<>();
        }
        eventCfgsSetter.accept(this.eventCfgs);
        return this;
    }

    /**
     * **参数解释：** 预留字段，事件触发设置，可为空。
     * @return eventCfgs
     */
    public List<WebHookEventCfgDto> getEventCfgs() {
        return eventCfgs;
    }

    public void setEventCfgs(List<WebHookEventCfgDto> eventCfgs) {
        this.eventCfgs = eventCfgs;
    }

    public ShowProjectWebhookResponse withProjectCfgs(List<WebHookBranchCfgDto> projectCfgs) {
        this.projectCfgs = projectCfgs;
        return this;
    }

    public ShowProjectWebhookResponse addProjectCfgsItem(WebHookBranchCfgDto projectCfgsItem) {
        if (this.projectCfgs == null) {
            this.projectCfgs = new ArrayList<>();
        }
        this.projectCfgs.add(projectCfgsItem);
        return this;
    }

    public ShowProjectWebhookResponse withProjectCfgs(Consumer<List<WebHookBranchCfgDto>> projectCfgsSetter) {
        if (this.projectCfgs == null) {
            this.projectCfgs = new ArrayList<>();
        }
        projectCfgsSetter.accept(this.projectCfgs);
        return this;
    }

    /**
     * **参数解释：** 预留字段，仓库分支规则设置，可为空。
     * @return projectCfgs
     */
    public List<WebHookBranchCfgDto> getProjectCfgs() {
        return projectCfgs;
    }

    public void setProjectCfgs(List<WebHookBranchCfgDto> projectCfgs) {
        this.projectCfgs = projectCfgs;
    }

    public ShowProjectWebhookResponse withBranchCfgs(List<WebHookBranchCfgDto> branchCfgs) {
        this.branchCfgs = branchCfgs;
        return this;
    }

    public ShowProjectWebhookResponse addBranchCfgsItem(WebHookBranchCfgDto branchCfgsItem) {
        if (this.branchCfgs == null) {
            this.branchCfgs = new ArrayList<>();
        }
        this.branchCfgs.add(branchCfgsItem);
        return this;
    }

    public ShowProjectWebhookResponse withBranchCfgs(Consumer<List<WebHookBranchCfgDto>> branchCfgsSetter) {
        if (this.branchCfgs == null) {
            this.branchCfgs = new ArrayList<>();
        }
        branchCfgsSetter.accept(this.branchCfgs);
        return this;
    }

    /**
     * Get branchCfgs
     * @return branchCfgs
     */
    public List<WebHookBranchCfgDto> getBranchCfgs() {
        return branchCfgs;
    }

    public void setBranchCfgs(List<WebHookBranchCfgDto> branchCfgs) {
        this.branchCfgs = branchCfgs;
    }

    public ShowProjectWebhookResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** Webhook id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowProjectWebhookResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **参数解释：** yyyy-MM-dd'T'HH:mm:ss.SSSXXX
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowProjectWebhookResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **参数解释：** yyyy-MM-dd'T'HH:mm:ss.SSSXXX
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowProjectWebhookResponse withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * **参数解释：** 内部服务名称。
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectWebhookResponse that = (ShowProjectWebhookResponse) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.pushEvents, that.pushEvents)
            && Objects.equals(this.pushEventsBranchRegexFilter, that.pushEventsBranchRegexFilter)
            && Objects.equals(this.notePlainTextFilter, that.notePlainTextFilter)
            && Objects.equals(this.tagPushEvents, that.tagPushEvents)
            && Objects.equals(this.mergeRequestsEvents, that.mergeRequestsEvents)
            && Objects.equals(this.noteEvents, that.noteEvents) && Objects.equals(this.token, that.token)
            && Objects.equals(this.tokenType, that.tokenType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.eventCfgs, that.eventCfgs)
            && Objects.equals(this.projectCfgs, that.projectCfgs) && Objects.equals(this.branchCfgs, that.branchCfgs)
            && Objects.equals(this.id, that.id) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.service, that.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url,
            pushEvents,
            pushEventsBranchRegexFilter,
            notePlainTextFilter,
            tagPushEvents,
            mergeRequestsEvents,
            noteEvents,
            token,
            tokenType,
            name,
            description,
            eventCfgs,
            projectCfgs,
            branchCfgs,
            id,
            createdAt,
            updatedAt,
            service);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectWebhookResponse {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    pushEvents: ").append(toIndentedString(pushEvents)).append("\n");
        sb.append("    pushEventsBranchRegexFilter: ")
            .append(toIndentedString(pushEventsBranchRegexFilter))
            .append("\n");
        sb.append("    notePlainTextFilter: ").append(toIndentedString(notePlainTextFilter)).append("\n");
        sb.append("    tagPushEvents: ").append(toIndentedString(tagPushEvents)).append("\n");
        sb.append("    mergeRequestsEvents: ").append(toIndentedString(mergeRequestsEvents)).append("\n");
        sb.append("    noteEvents: ").append(toIndentedString(noteEvents)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eventCfgs: ").append(toIndentedString(eventCfgs)).append("\n");
        sb.append("    projectCfgs: ").append(toIndentedString(projectCfgs)).append("\n");
        sb.append("    branchCfgs: ").append(toIndentedString(branchCfgs)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
