package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.QueryMessageInfoV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListMoreInstantMessagesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_list")
    
    private List<QueryMessageInfoV2> messageList = null;
    
    public ListMoreInstantMessagesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 总数
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ListMoreInstantMessagesResponse withMessageList(List<QueryMessageInfoV2> messageList) {
        this.messageList = messageList;
        return this;
    }

    
    public ListMoreInstantMessagesResponse addMessageListItem(QueryMessageInfoV2 messageListItem) {
        this.messageList.add(messageListItem);
        return this;
    }

    public ListMoreInstantMessagesResponse withMessageList(Consumer<List<QueryMessageInfoV2>> messageListSetter) {
        if(this.messageList == null ){
            this.messageList = new ArrayList<>();
        }
        messageListSetter.accept(this.messageList);
        return this;
    }

    /**
     * 留言列表
     * @return messageList
     */
    public List<QueryMessageInfoV2> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<QueryMessageInfoV2> messageList) {
        this.messageList = messageList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMoreInstantMessagesResponse listMoreInstantMessagesResponse = (ListMoreInstantMessagesResponse) o;
        return Objects.equals(this.count, listMoreInstantMessagesResponse.count) &&
            Objects.equals(this.messageList, listMoreInstantMessagesResponse.messageList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, messageList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMoreInstantMessagesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
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

