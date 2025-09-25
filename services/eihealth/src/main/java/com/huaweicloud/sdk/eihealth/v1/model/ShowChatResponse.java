package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowChatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_ids")

    private List<String> repoIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private AgentType agentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_role")

    private AgentRole agentRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_messages")

    private List<ChatMessageRsp> chatMessages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Chat-Route-Id")

    private String xChatRouteId;

    public ShowChatResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 对话ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowChatResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**： 对话名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowChatResponse withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * **参数解释**： 对话别名。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ShowChatResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 对话创建时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowChatResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 对话更新时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowChatResponse withRepoIds(List<String> repoIds) {
        this.repoIds = repoIds;
        return this;
    }

    public ShowChatResponse addRepoIdsItem(String repoIdsItem) {
        if (this.repoIds == null) {
            this.repoIds = new ArrayList<>();
        }
        this.repoIds.add(repoIdsItem);
        return this;
    }

    public ShowChatResponse withRepoIds(Consumer<List<String>> repoIdsSetter) {
        if (this.repoIds == null) {
            this.repoIds = new ArrayList<>();
        }
        repoIdsSetter.accept(this.repoIds);
        return this;
    }

    /**
     * **参数解释**： 绑定的知识库ID列表。 **约束限制**： 绑定的知识库数量范围为[0-5]。 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return repoIds
     */
    public List<String> getRepoIds() {
        return repoIds;
    }

    public void setRepoIds(List<String> repoIds) {
        this.repoIds = repoIds;
    }

    public ShowChatResponse withAgentType(AgentType agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * Get agentType
     * @return agentType
     */
    public AgentType getAgentType() {
        return agentType;
    }

    public void setAgentType(AgentType agentType) {
        this.agentType = agentType;
    }

    public ShowChatResponse withAgentRole(AgentRole agentRole) {
        this.agentRole = agentRole;
        return this;
    }

    /**
     * Get agentRole
     * @return agentRole
     */
    public AgentRole getAgentRole() {
        return agentRole;
    }

    public void setAgentRole(AgentRole agentRole) {
        this.agentRole = agentRole;
    }

    public ShowChatResponse withChatMessages(List<ChatMessageRsp> chatMessages) {
        this.chatMessages = chatMessages;
        return this;
    }

    public ShowChatResponse addChatMessagesItem(ChatMessageRsp chatMessagesItem) {
        if (this.chatMessages == null) {
            this.chatMessages = new ArrayList<>();
        }
        this.chatMessages.add(chatMessagesItem);
        return this;
    }

    public ShowChatResponse withChatMessages(Consumer<List<ChatMessageRsp>> chatMessagesSetter) {
        if (this.chatMessages == null) {
            this.chatMessages = new ArrayList<>();
        }
        chatMessagesSetter.accept(this.chatMessages);
        return this;
    }

    /**
     * **参数解释**： 对话问答列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return chatMessages
     */
    public List<ChatMessageRsp> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<ChatMessageRsp> chatMessages) {
        this.chatMessages = chatMessages;
    }

    public ShowChatResponse withXChatRouteId(String xChatRouteId) {
        this.xChatRouteId = xChatRouteId;
        return this;
    }

    /**
     * Get xChatRouteId
     * @return xChatRouteId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Chat-Route-Id")
    public String getXChatRouteId() {
        return xChatRouteId;
    }

    public void setXChatRouteId(String xChatRouteId) {
        this.xChatRouteId = xChatRouteId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowChatResponse that = (ShowChatResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.title, that.title)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.repoIds, that.repoIds)
            && Objects.equals(this.agentType, that.agentType) && Objects.equals(this.agentRole, that.agentRole)
            && Objects.equals(this.chatMessages, that.chatMessages)
            && Objects.equals(this.xChatRouteId, that.xChatRouteId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, title, alias, createTime, updateTime, repoIds, agentType, agentRole, chatMessages, xChatRouteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowChatResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    repoIds: ").append(toIndentedString(repoIds)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    agentRole: ").append(toIndentedString(agentRole)).append("\n");
        sb.append("    chatMessages: ").append(toIndentedString(chatMessages)).append("\n");
        sb.append("    xChatRouteId: ").append(toIndentedString(xChatRouteId)).append("\n");
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
