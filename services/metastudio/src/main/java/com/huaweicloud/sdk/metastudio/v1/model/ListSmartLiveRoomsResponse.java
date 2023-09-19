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
public class ListSmartLiveRoomsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smart_live_rooms")

    private List<SmartLiveRoomBaseInfo> smartLiveRooms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListSmartLiveRoomsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 直播间总数。
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

    public ListSmartLiveRoomsResponse withSmartLiveRooms(List<SmartLiveRoomBaseInfo> smartLiveRooms) {
        this.smartLiveRooms = smartLiveRooms;
        return this;
    }

    public ListSmartLiveRoomsResponse addSmartLiveRoomsItem(SmartLiveRoomBaseInfo smartLiveRoomsItem) {
        if (this.smartLiveRooms == null) {
            this.smartLiveRooms = new ArrayList<>();
        }
        this.smartLiveRooms.add(smartLiveRoomsItem);
        return this;
    }

    public ListSmartLiveRoomsResponse withSmartLiveRooms(Consumer<List<SmartLiveRoomBaseInfo>> smartLiveRoomsSetter) {
        if (this.smartLiveRooms == null) {
            this.smartLiveRooms = new ArrayList<>();
        }
        smartLiveRoomsSetter.accept(this.smartLiveRooms);
        return this;
    }

    /**
     * 直播间列表。
     * @return smartLiveRooms
     */
    public List<SmartLiveRoomBaseInfo> getSmartLiveRooms() {
        return smartLiveRooms;
    }

    public void setSmartLiveRooms(List<SmartLiveRoomBaseInfo> smartLiveRooms) {
        this.smartLiveRooms = smartLiveRooms;
    }

    public ListSmartLiveRoomsResponse withXRequestId(String xRequestId) {
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
        ListSmartLiveRoomsResponse that = (ListSmartLiveRoomsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.smartLiveRooms, that.smartLiveRooms)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, smartLiveRooms, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSmartLiveRoomsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    smartLiveRooms: ").append(toIndentedString(smartLiveRooms)).append("\n");
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
