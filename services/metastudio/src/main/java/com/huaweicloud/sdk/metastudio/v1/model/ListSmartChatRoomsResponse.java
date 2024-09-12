package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListSmartChatRoomsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_concurrency")

    private Integer countConcurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smart_chat_rooms")

    private List<SmartChatRoomBaseInfo> smartChatRooms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListSmartChatRoomsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 智能交互对话总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSmartChatRoomsResponse withCountConcurrency(Integer countConcurrency) {
        this.countConcurrency = countConcurrency;
        return this;
    }

    /**
     * **参数解释**： 智能交互对话总并发路数。
     * minimum: 0
     * maximum: 1024000
     * @return countConcurrency
     */
    public Integer getCountConcurrency() {
        return countConcurrency;
    }

    public void setCountConcurrency(Integer countConcurrency) {
        this.countConcurrency = countConcurrency;
    }

    public ListSmartChatRoomsResponse withSmartChatRooms(List<SmartChatRoomBaseInfo> smartChatRooms) {
        this.smartChatRooms = smartChatRooms;
        return this;
    }

    public ListSmartChatRoomsResponse addSmartChatRoomsItem(SmartChatRoomBaseInfo smartChatRoomsItem) {
        if (this.smartChatRooms == null) {
            this.smartChatRooms = new ArrayList<>();
        }
        this.smartChatRooms.add(smartChatRoomsItem);
        return this;
    }

    public ListSmartChatRoomsResponse withSmartChatRooms(Consumer<List<SmartChatRoomBaseInfo>> smartChatRoomsSetter) {
        if (this.smartChatRooms == null) {
            this.smartChatRooms = new ArrayList<>();
        }
        smartChatRoomsSetter.accept(this.smartChatRooms);
        return this;
    }

    /**
     * 智能交互对话列表。
     * @return smartChatRooms
     */
    public List<SmartChatRoomBaseInfo> getSmartChatRooms() {
        return smartChatRooms;
    }

    public void setSmartChatRooms(List<SmartChatRoomBaseInfo> smartChatRooms) {
        this.smartChatRooms = smartChatRooms;
    }

    public ListSmartChatRoomsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSmartChatRoomsResponse that = (ListSmartChatRoomsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.countConcurrency, that.countConcurrency)
            && Objects.equals(this.smartChatRooms, that.smartChatRooms)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, countConcurrency, smartChatRooms, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSmartChatRoomsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    countConcurrency: ").append(toIndentedString(countConcurrency)).append("\n");
        sb.append("    smartChatRooms: ").append(toIndentedString(smartChatRooms)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
