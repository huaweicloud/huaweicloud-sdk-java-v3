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
public class ListChatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chats")

    private List<ChatRsp> chats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListChatResponse withChats(List<ChatRsp> chats) {
        this.chats = chats;
        return this;
    }

    public ListChatResponse addChatsItem(ChatRsp chatsItem) {
        if (this.chats == null) {
            this.chats = new ArrayList<>();
        }
        this.chats.add(chatsItem);
        return this;
    }

    public ListChatResponse withChats(Consumer<List<ChatRsp>> chatsSetter) {
        if (this.chats == null) {
            this.chats = new ArrayList<>();
        }
        chatsSetter.accept(this.chats);
        return this;
    }

    /**
     * **参数解释**： 对话列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return chats
     */
    public List<ChatRsp> getChats() {
        return chats;
    }

    public void setChats(List<ChatRsp> chats) {
        this.chats = chats;
    }

    public ListChatResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 对话个数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListChatResponse that = (ListChatResponse) obj;
        return Objects.equals(this.chats, that.chats) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chats, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListChatResponse {\n");
        sb.append("    chats: ").append(toIndentedString(chats)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
