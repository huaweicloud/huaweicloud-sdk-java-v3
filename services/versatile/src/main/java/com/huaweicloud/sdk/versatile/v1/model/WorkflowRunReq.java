package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkflowRunReq
 */
public class WorkflowRunReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private Map<String, Object> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_inputs")

    private Map<String, Object> memoryInputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "globals")

    private Map<String, Object> globals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<Message> messages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_profile")

    private UserProfile userProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_configs")

    private List<PluginConfig> pluginConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Long version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userId")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conversation")

    private Conversation conversation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_history")

    private Boolean enableHistory;

    public WorkflowRunReq withInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
        return this;
    }

    public WorkflowRunReq putInputsItem(String key, Object inputsItem) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        this.inputs.put(key, inputsItem);
        return this;
    }

    public WorkflowRunReq withInputs(Consumer<Map<String, Object>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * Get inputs
     * @return inputs
     */
    public Map<String, Object> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }

    public WorkflowRunReq withMemoryInputs(Map<String, Object> memoryInputs) {
        this.memoryInputs = memoryInputs;
        return this;
    }

    public WorkflowRunReq putMemoryInputsItem(String key, Object memoryInputsItem) {
        if (this.memoryInputs == null) {
            this.memoryInputs = new HashMap<>();
        }
        this.memoryInputs.put(key, memoryInputsItem);
        return this;
    }

    public WorkflowRunReq withMemoryInputs(Consumer<Map<String, Object>> memoryInputsSetter) {
        if (this.memoryInputs == null) {
            this.memoryInputs = new HashMap<>();
        }
        memoryInputsSetter.accept(this.memoryInputs);
        return this;
    }

    /**
     * Get memoryInputs
     * @return memoryInputs
     */
    public Map<String, Object> getMemoryInputs() {
        return memoryInputs;
    }

    public void setMemoryInputs(Map<String, Object> memoryInputs) {
        this.memoryInputs = memoryInputs;
    }

    public WorkflowRunReq withGlobals(Map<String, Object> globals) {
        this.globals = globals;
        return this;
    }

    public WorkflowRunReq putGlobalsItem(String key, Object globalsItem) {
        if (this.globals == null) {
            this.globals = new HashMap<>();
        }
        this.globals.put(key, globalsItem);
        return this;
    }

    public WorkflowRunReq withGlobals(Consumer<Map<String, Object>> globalsSetter) {
        if (this.globals == null) {
            this.globals = new HashMap<>();
        }
        globalsSetter.accept(this.globals);
        return this;
    }

    /**
     * Get globals
     * @return globals
     */
    public Map<String, Object> getGlobals() {
        return globals;
    }

    public void setGlobals(Map<String, Object> globals) {
        this.globals = globals;
    }

    public WorkflowRunReq withMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public WorkflowRunReq addMessagesItem(Message messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public WorkflowRunReq withMessages(Consumer<List<Message>> messagesSetter) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        messagesSetter.accept(this.messages);
        return this;
    }

    /**
     * user消息
     * @return messages
     */
    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public WorkflowRunReq withUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }

    public WorkflowRunReq withUserProfile(Consumer<UserProfile> userProfileSetter) {
        if (this.userProfile == null) {
            this.userProfile = new UserProfile();
            userProfileSetter.accept(this.userProfile);
        }

        return this;
    }

    /**
     * Get userProfile
     * @return userProfile
     */
    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public WorkflowRunReq withPluginConfigs(List<PluginConfig> pluginConfigs) {
        this.pluginConfigs = pluginConfigs;
        return this;
    }

    public WorkflowRunReq addPluginConfigsItem(PluginConfig pluginConfigsItem) {
        if (this.pluginConfigs == null) {
            this.pluginConfigs = new ArrayList<>();
        }
        this.pluginConfigs.add(pluginConfigsItem);
        return this;
    }

    public WorkflowRunReq withPluginConfigs(Consumer<List<PluginConfig>> pluginConfigsSetter) {
        if (this.pluginConfigs == null) {
            this.pluginConfigs = new ArrayList<>();
        }
        pluginConfigsSetter.accept(this.pluginConfigs);
        return this;
    }

    /**
     * 插件参数数组
     * @return pluginConfigs
     */
    public List<PluginConfig> getPluginConfigs() {
        return pluginConfigs;
    }

    public void setPluginConfigs(List<PluginConfig> pluginConfigs) {
        this.pluginConfigs = pluginConfigs;
    }

    public WorkflowRunReq withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public WorkflowRunReq withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public WorkflowRunReq withConversation(Conversation conversation) {
        this.conversation = conversation;
        return this;
    }

    public WorkflowRunReq withConversation(Consumer<Conversation> conversationSetter) {
        if (this.conversation == null) {
            this.conversation = new Conversation();
            conversationSetter.accept(this.conversation);
        }

        return this;
    }

    /**
     * Get conversation
     * @return conversation
     */
    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public WorkflowRunReq withEnableHistory(Boolean enableHistory) {
        this.enableHistory = enableHistory;
        return this;
    }

    /**
     * 会话历史写入
     * @return enableHistory
     */
    public Boolean getEnableHistory() {
        return enableHistory;
    }

    public void setEnableHistory(Boolean enableHistory) {
        this.enableHistory = enableHistory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowRunReq that = (WorkflowRunReq) obj;
        return Objects.equals(this.inputs, that.inputs) && Objects.equals(this.memoryInputs, that.memoryInputs)
            && Objects.equals(this.globals, that.globals) && Objects.equals(this.messages, that.messages)
            && Objects.equals(this.userProfile, that.userProfile)
            && Objects.equals(this.pluginConfigs, that.pluginConfigs) && Objects.equals(this.version, that.version)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.conversation, that.conversation)
            && Objects.equals(this.enableHistory, that.enableHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs,
            memoryInputs,
            globals,
            messages,
            userProfile,
            pluginConfigs,
            version,
            userId,
            conversation,
            enableHistory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRunReq {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    memoryInputs: ").append(toIndentedString(memoryInputs)).append("\n");
        sb.append("    globals: ").append(toIndentedString(globals)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
        sb.append("    pluginConfigs: ").append(toIndentedString(pluginConfigs)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
        sb.append("    enableHistory: ").append(toIndentedString(enableHistory)).append("\n");
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
