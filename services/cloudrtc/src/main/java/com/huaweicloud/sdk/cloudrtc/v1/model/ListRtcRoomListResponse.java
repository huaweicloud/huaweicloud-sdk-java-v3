package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRtcRoomListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_info_list")

    @JacksonXmlProperty(localName = "room_info_list")

    private List<RtcServerRoomInfo> roomInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    @JacksonXmlProperty(localName = "X-request-id")

    private String xRequestId;

    public ListRtcRoomListResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 1844674407
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRtcRoomListResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询结果限制
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRtcRoomListResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移量
     * minimum: 0
     * maximum: 1844674407
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRtcRoomListResponse withRoomInfoList(List<RtcServerRoomInfo> roomInfoList) {
        this.roomInfoList = roomInfoList;
        return this;
    }

    public ListRtcRoomListResponse addRoomInfoListItem(RtcServerRoomInfo roomInfoListItem) {
        if (this.roomInfoList == null) {
            this.roomInfoList = new ArrayList<>();
        }
        this.roomInfoList.add(roomInfoListItem);
        return this;
    }

    public ListRtcRoomListResponse withRoomInfoList(Consumer<List<RtcServerRoomInfo>> roomInfoListSetter) {
        if (this.roomInfoList == null) {
            this.roomInfoList = new ArrayList<>();
        }
        roomInfoListSetter.accept(this.roomInfoList);
        return this;
    }

    /**
     * 房间列表信息
     * @return roomInfoList
     */
    public List<RtcServerRoomInfo> getRoomInfoList() {
        return roomInfoList;
    }

    public void setRoomInfoList(List<RtcServerRoomInfo> roomInfoList) {
        this.roomInfoList = roomInfoList;
    }

    public ListRtcRoomListResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRtcRoomListResponse listRtcRoomListResponse = (ListRtcRoomListResponse) o;
        return Objects.equals(this.total, listRtcRoomListResponse.total)
            && Objects.equals(this.limit, listRtcRoomListResponse.limit)
            && Objects.equals(this.offset, listRtcRoomListResponse.offset)
            && Objects.equals(this.roomInfoList, listRtcRoomListResponse.roomInfoList)
            && Objects.equals(this.xRequestId, listRtcRoomListResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, limit, offset, roomInfoList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcRoomListResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    roomInfoList: ").append(toIndentedString(roomInfoList)).append("\n");
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
