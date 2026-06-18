package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** Webhook设置参数。
 */
public class WebhookParamsRequestDto {

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

    public WebhookParamsRequestDto withUrl(String url) {
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

    public WebhookParamsRequestDto withPushEvents(Boolean pushEvents) {
        this.pushEvents = pushEvents;
        return this;
    }

    /**
     * **参数解释：** 是否启用推送事件。 **约束限制：** push_events，tag_push_events，merge_requests_events，note_events至少传一个为true
     * @return pushEvents
     */
    public Boolean getPushEvents() {
        return pushEvents;
    }

    public void setPushEvents(Boolean pushEvents) {
        this.pushEvents = pushEvents;
    }

    public WebhookParamsRequestDto withPushEventsBranchRegexFilter(String pushEventsBranchRegexFilter) {
        this.pushEventsBranchRegexFilter = pushEventsBranchRegexFilter;
        return this;
    }

    /**
     * **参数解释：** 推送事件分支过滤正则规则。 **取值范围：** 字符串长度不少于0，不超过500。    **约束限制：** push_events_branch_regex_filter与push_events联动，当push_events为true时push_events_branch_regex_filter需传值正则
     * @return pushEventsBranchRegexFilter
     */
    public String getPushEventsBranchRegexFilter() {
        return pushEventsBranchRegexFilter;
    }

    public void setPushEventsBranchRegexFilter(String pushEventsBranchRegexFilter) {
        this.pushEventsBranchRegexFilter = pushEventsBranchRegexFilter;
    }

    public WebhookParamsRequestDto withNotePlainTextFilter(List<String> notePlainTextFilter) {
        this.notePlainTextFilter = notePlainTextFilter;
        return this;
    }

    public WebhookParamsRequestDto addNotePlainTextFilterItem(String notePlainTextFilterItem) {
        if (this.notePlainTextFilter == null) {
            this.notePlainTextFilter = new ArrayList<>();
        }
        this.notePlainTextFilter.add(notePlainTextFilterItem);
        return this;
    }

    public WebhookParamsRequestDto withNotePlainTextFilter(Consumer<List<String>> notePlainTextFilterSetter) {
        if (this.notePlainTextFilter == null) {
            this.notePlainTextFilter = new ArrayList<>();
        }
        notePlainTextFilterSetter.accept(this.notePlainTextFilter);
        return this;
    }

    /**
     * **参数解释：** 评论事件文本过滤规则。 **取值范围：** 字符串长度不少于0，不超过50，不能超过10个。  **约束限制：** note_plain_text_filter与note_events联动，当note_events为true时note_plain_text_filter需传值正则
     * @return notePlainTextFilter
     */
    public List<String> getNotePlainTextFilter() {
        return notePlainTextFilter;
    }

    public void setNotePlainTextFilter(List<String> notePlainTextFilter) {
        this.notePlainTextFilter = notePlainTextFilter;
    }

    public WebhookParamsRequestDto withTagPushEvents(Boolean tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
        return this;
    }

    /**
     * **参数解释：** 是否启用Tag推送事件。 **约束限制：** push_events，tag_push_events，merge_requests_events，note_events至少传一个为true
     * @return tagPushEvents
     */
    public Boolean getTagPushEvents() {
        return tagPushEvents;
    }

    public void setTagPushEvents(Boolean tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
    }

    public WebhookParamsRequestDto withMergeRequestsEvents(Boolean mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
        return this;
    }

    /**
     * **参数解释：** 是否启用合并请求事件。 **约束限制：** push_events，tag_push_events，merge_requests_events，note_events至少传一个为true
     * @return mergeRequestsEvents
     */
    public Boolean getMergeRequestsEvents() {
        return mergeRequestsEvents;
    }

    public void setMergeRequestsEvents(Boolean mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
    }

    public WebhookParamsRequestDto withNoteEvents(Boolean noteEvents) {
        this.noteEvents = noteEvents;
        return this;
    }

    /**
     * **参数解释：** 是否启用评论事件。 **约束限制：** push_events，tag_push_events，merge_requests_events，note_events至少传一个为true
     * @return noteEvents
     */
    public Boolean getNoteEvents() {
        return noteEvents;
    }

    public void setNoteEvents(Boolean noteEvents) {
        this.noteEvents = noteEvents;
    }

    public WebhookParamsRequestDto withToken(String token) {
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

    public WebhookParamsRequestDto withTokenType(String tokenType) {
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

    public WebhookParamsRequestDto withName(String name) {
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

    public WebhookParamsRequestDto withDescription(String description) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebhookParamsRequestDto that = (WebhookParamsRequestDto) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.pushEvents, that.pushEvents)
            && Objects.equals(this.pushEventsBranchRegexFilter, that.pushEventsBranchRegexFilter)
            && Objects.equals(this.notePlainTextFilter, that.notePlainTextFilter)
            && Objects.equals(this.tagPushEvents, that.tagPushEvents)
            && Objects.equals(this.mergeRequestsEvents, that.mergeRequestsEvents)
            && Objects.equals(this.noteEvents, that.noteEvents) && Objects.equals(this.token, that.token)
            && Objects.equals(this.tokenType, that.tokenType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description);
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
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookParamsRequestDto {\n");
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
