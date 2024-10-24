package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建权限集的请求体
 */
public class CreatePermissionSetReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relay_state")

    private String relayState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_duration")

    private String sessionDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagDto> tags = null;

    public CreatePermissionSetReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 权限集描述.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePermissionSetReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 权限集名称.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePermissionSetReqBody withRelayState(String relayState) {
        this.relayState = relayState;
        return this;
    }

    /**
     * 用于在联合身份验证过程中重定向应用程序中的用户
     * @return relayState
     */
    public String getRelayState() {
        return relayState;
    }

    public void setRelayState(String relayState) {
        this.relayState = relayState;
    }

    public CreatePermissionSetReqBody withSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }

    /**
     * 应用程序用户会话在ISO-8601标准中有效的时间长度
     * @return sessionDuration
     */
    public String getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public CreatePermissionSetReqBody withTags(List<TagDto> tags) {
        this.tags = tags;
        return this;
    }

    public CreatePermissionSetReqBody addTagsItem(TagDto tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreatePermissionSetReqBody withTags(Consumer<List<TagDto>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 要附加到新权限集的标签
     * @return tags
     */
    public List<TagDto> getTags() {
        return tags;
    }

    public void setTags(List<TagDto> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePermissionSetReqBody that = (CreatePermissionSetReqBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.relayState, that.relayState)
            && Objects.equals(this.sessionDuration, that.sessionDuration) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, relayState, sessionDuration, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePermissionSetReqBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    relayState: ").append(toIndentedString(relayState)).append("\n");
        sb.append("    sessionDuration: ").append(toIndentedString(sessionDuration)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
