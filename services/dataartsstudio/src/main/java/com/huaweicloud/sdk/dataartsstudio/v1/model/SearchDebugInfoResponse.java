package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class SearchDebugInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_messages")

    private List<ApiPublishDTO> publishMessages = null;

    public SearchDebugInfoResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public SearchDebugInfoResponse withPublishMessages(List<ApiPublishDTO> publishMessages) {
        this.publishMessages = publishMessages;
        return this;
    }

    public SearchDebugInfoResponse addPublishMessagesItem(ApiPublishDTO publishMessagesItem) {
        if (this.publishMessages == null) {
            this.publishMessages = new ArrayList<>();
        }
        this.publishMessages.add(publishMessagesItem);
        return this;
    }

    public SearchDebugInfoResponse withPublishMessages(Consumer<List<ApiPublishDTO>> publishMessagesSetter) {
        if (this.publishMessages == null) {
            this.publishMessages = new ArrayList<>();
        }
        publishMessagesSetter.accept(this.publishMessages);
        return this;
    }

    /**
     * 发布信息列表
     * @return publishMessages
     */
    public List<ApiPublishDTO> getPublishMessages() {
        return publishMessages;
    }

    public void setPublishMessages(List<ApiPublishDTO> publishMessages) {
        this.publishMessages = publishMessages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchDebugInfoResponse that = (SearchDebugInfoResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.publishMessages, that.publishMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, publishMessages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchDebugInfoResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    publishMessages: ").append(toIndentedString(publishMessages)).append("\n");
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
