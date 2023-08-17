package com.huaweicloud.sdk.cloudrtc.v1.model;

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
public class ListRtcAbnormalEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exp_id")

    private String expId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_list")

    private List<RTCCause> abnormalList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListRtcAbnormalEventResponse withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 房间ID 
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public ListRtcAbnormalEventResponse withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 用户ID 
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ListRtcAbnormalEventResponse withExpId(String expId) {
        this.expId = expId;
        return this;
    }

    /**
     * 体验ID 
     * @return expId
     */
    public String getExpId() {
        return expId;
    }

    public void setExpId(String expId) {
        this.expId = expId;
    }

    public ListRtcAbnormalEventResponse withAbnormalList(List<RTCCause> abnormalList) {
        this.abnormalList = abnormalList;
        return this;
    }

    public ListRtcAbnormalEventResponse addAbnormalListItem(RTCCause abnormalListItem) {
        if (this.abnormalList == null) {
            this.abnormalList = new ArrayList<>();
        }
        this.abnormalList.add(abnormalListItem);
        return this;
    }

    public ListRtcAbnormalEventResponse withAbnormalList(Consumer<List<RTCCause>> abnormalListSetter) {
        if (this.abnormalList == null) {
            this.abnormalList = new ArrayList<>();
        }
        abnormalListSetter.accept(this.abnormalList);
        return this;
    }

    /**
     * 异常信息列表。注意：此字段可能返回null，表示取不到有效值。 
     * @return abnormalList
     */
    public List<RTCCause> getAbnormalList() {
        return abnormalList;
    }

    public void setAbnormalList(List<RTCCause> abnormalList) {
        this.abnormalList = abnormalList;
    }

    public ListRtcAbnormalEventResponse withXRequestId(String xRequestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRtcAbnormalEventResponse that = (ListRtcAbnormalEventResponse) obj;
        return Objects.equals(this.roomId, that.roomId) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.expId, that.expId) && Objects.equals(this.abnormalList, that.abnormalList)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, uid, expId, abnormalList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcAbnormalEventResponse {\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    expId: ").append(toIndentedString(expId)).append("\n");
        sb.append("    abnormalList: ").append(toIndentedString(abnormalList)).append("\n");
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
