package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChatMessageRsp
 */
public class ChatMessageRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private MessageRole role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private QaType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private ChatMessage message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addition")

    private ChatAddition addition;

    public ChatMessageRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 问答ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChatMessageRsp withRole(MessageRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get role
     * @return role
     */
    public MessageRole getRole() {
        return role;
    }

    public void setRole(MessageRole role) {
        this.role = role;
    }

    public ChatMessageRsp withType(QaType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public QaType getType() {
        return type;
    }

    public void setType(QaType type) {
        this.type = type;
    }

    public ChatMessageRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 问答创建时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ChatMessageRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 问答更新时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ChatMessageRsp withMessage(ChatMessage message) {
        this.message = message;
        return this;
    }

    public ChatMessageRsp withMessage(Consumer<ChatMessage> messageSetter) {
        if (this.message == null) {
            this.message = new ChatMessage();
            messageSetter.accept(this.message);
        }

        return this;
    }

    /**
     * Get message
     * @return message
     */
    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }

    public ChatMessageRsp withAddition(ChatAddition addition) {
        this.addition = addition;
        return this;
    }

    public ChatMessageRsp withAddition(Consumer<ChatAddition> additionSetter) {
        if (this.addition == null) {
            this.addition = new ChatAddition();
            additionSetter.accept(this.addition);
        }

        return this;
    }

    /**
     * Get addition
     * @return addition
     */
    public ChatAddition getAddition() {
        return addition;
    }

    public void setAddition(ChatAddition addition) {
        this.addition = addition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatMessageRsp that = (ChatMessageRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.role, that.role)
            && Objects.equals(this.type, that.type) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.message, that.message)
            && Objects.equals(this.addition, that.addition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role, type, createTime, updateTime, message, addition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatMessageRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    addition: ").append(toIndentedString(addition)).append("\n");
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
