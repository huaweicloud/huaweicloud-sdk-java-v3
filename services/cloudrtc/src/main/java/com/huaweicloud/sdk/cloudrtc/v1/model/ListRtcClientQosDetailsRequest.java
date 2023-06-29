package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListRtcClientQosDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_id")

    private String peerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    /**
     * 需查询的指标，填all则返回所有指标。多个指标使用','分割 - appcpu：端侧APP CPU使用率（appCpu） - syscpu：端侧系统 CPU使用率（deviceCpu） - abit：端侧音频码率kpbs（bitrate） - vbit：端侧视频码率kbps（bitRate） - dbit：端侧辅流码率kbps（bitRate） - vfps：端侧视频帧率fps（actFrameRate） - dfps：端侧辅流帧率fps（actFrameRate） - vblock：端侧视频卡顿率（统计大于等于600ms视频卡顿） - dblock：端侧辅流卡顿率（统计大于等于600ms辅流卡顿） - aloss：端侧音频丢包率（pktLoss） - vloss：端侧视频丢包率（pktLoss） - dloss：端侧辅流丢包率（pktLoss） - vwidth：端侧视频分辨率宽（actPicW） - vheight：端侧视频分辨率高（actPicH） - dwidth：端侧辅流分辨率宽（actPicW） - dheight：端侧辅流分辨率高（actPicH） - ajitter：端侧音频抖动率（jitter） - artt：端侧音频时延（rtt） - vjitter：端侧视频抖动率（jitter） - vrtt：端侧视频时延（rtt） - djitter：端侧辅流抖动率（jitter） - drtt：端侧辅流时延（rtt） 
     */
    public static final class MidEnum {

        /**
         * Enum APPCPU for value: "appcpu"
         */
        public static final MidEnum APPCPU = new MidEnum("appcpu");

        /**
         * Enum SYSCPU for value: "syscpu"
         */
        public static final MidEnum SYSCPU = new MidEnum("syscpu");

        /**
         * Enum ABIT for value: "abit"
         */
        public static final MidEnum ABIT = new MidEnum("abit");

        /**
         * Enum ABLOCK for value: "ablock"
         */
        public static final MidEnum ABLOCK = new MidEnum("ablock");

        /**
         * Enum VBIT for value: "vbit"
         */
        public static final MidEnum VBIT = new MidEnum("vbit");

        /**
         * Enum DBIT for value: "dbit"
         */
        public static final MidEnum DBIT = new MidEnum("dbit");

        /**
         * Enum VFPS for value: "vfps"
         */
        public static final MidEnum VFPS = new MidEnum("vfps");

        /**
         * Enum DFPS for value: "dfps"
         */
        public static final MidEnum DFPS = new MidEnum("dfps");

        /**
         * Enum VBLOCK for value: "vblock"
         */
        public static final MidEnum VBLOCK = new MidEnum("vblock");

        /**
         * Enum DBLOCK for value: "dblock"
         */
        public static final MidEnum DBLOCK = new MidEnum("dblock");

        /**
         * Enum ALOSS for value: "aloss"
         */
        public static final MidEnum ALOSS = new MidEnum("aloss");

        /**
         * Enum VLOSS for value: "vloss"
         */
        public static final MidEnum VLOSS = new MidEnum("vloss");

        /**
         * Enum DLOSS for value: "dloss"
         */
        public static final MidEnum DLOSS = new MidEnum("dloss");

        /**
         * Enum VWIDTH for value: "vwidth"
         */
        public static final MidEnum VWIDTH = new MidEnum("vwidth");

        /**
         * Enum VHEIGHT for value: "vheight"
         */
        public static final MidEnum VHEIGHT = new MidEnum("vheight");

        /**
         * Enum DWIDTH for value: "dwidth"
         */
        public static final MidEnum DWIDTH = new MidEnum("dwidth");

        /**
         * Enum DHEIGHT for value: "dheight"
         */
        public static final MidEnum DHEIGHT = new MidEnum("dheight");

        /**
         * Enum AJITTER for value: "ajitter"
         */
        public static final MidEnum AJITTER = new MidEnum("ajitter");

        /**
         * Enum ARTT for value: "artt"
         */
        public static final MidEnum ARTT = new MidEnum("artt");

        /**
         * Enum VJITTER for value: "vjitter"
         */
        public static final MidEnum VJITTER = new MidEnum("vjitter");

        /**
         * Enum VRTT for value: "vrtt"
         */
        public static final MidEnum VRTT = new MidEnum("vrtt");

        /**
         * Enum DJITTER for value: "djitter"
         */
        public static final MidEnum DJITTER = new MidEnum("djitter");

        /**
         * Enum DRTT for value: "drtt"
         */
        public static final MidEnum DRTT = new MidEnum("drtt");

        private static final Map<String, MidEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MidEnum> createStaticFields() {
            Map<String, MidEnum> map = new HashMap<>();
            map.put("appcpu", APPCPU);
            map.put("syscpu", SYSCPU);
            map.put("abit", ABIT);
            map.put("ablock", ABLOCK);
            map.put("vbit", VBIT);
            map.put("dbit", DBIT);
            map.put("vfps", VFPS);
            map.put("dfps", DFPS);
            map.put("vblock", VBLOCK);
            map.put("dblock", DBLOCK);
            map.put("aloss", ALOSS);
            map.put("vloss", VLOSS);
            map.put("dloss", DLOSS);
            map.put("vwidth", VWIDTH);
            map.put("vheight", VHEIGHT);
            map.put("dwidth", DWIDTH);
            map.put("dheight", DHEIGHT);
            map.put("ajitter", AJITTER);
            map.put("artt", ARTT);
            map.put("vjitter", VJITTER);
            map.put("vrtt", VRTT);
            map.put("djitter", DJITTER);
            map.put("drtt", DRTT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MidEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MidEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MidEnum(value));
        }

        public static MidEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MidEnum) {
                return this.value.equals(((MidEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mid")

    private MidEnum mid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_type")

    private String timeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListRtcClientQosDetailsRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。 
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ListRtcClientQosDetailsRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。 
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ListRtcClientQosDetailsRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带项目ID信息，与路径参数中的项目ID相同。 
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ListRtcClientQosDetailsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名 
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListRtcClientQosDetailsRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id 
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListRtcClientQosDetailsRequest withRoomId(String roomId) {
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

    public ListRtcClientQosDetailsRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 发送端用户 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListRtcClientQosDetailsRequest withPeerId(String peerId) {
        this.peerId = peerId;
        return this;
    }

    /**
     * 需查询接收端用户id 
     * @return peerId
     */
    public String getPeerId() {
        return peerId;
    }

    public void setPeerId(String peerId) {
        this.peerId = peerId;
    }

    public ListRtcClientQosDetailsRequest withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * 流号 
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public ListRtcClientQosDetailsRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 判断上下行数据 
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ListRtcClientQosDetailsRequest withMid(MidEnum mid) {
        this.mid = mid;
        return this;
    }

    /**
     * 需查询的指标，填all则返回所有指标。多个指标使用','分割 - appcpu：端侧APP CPU使用率（appCpu） - syscpu：端侧系统 CPU使用率（deviceCpu） - abit：端侧音频码率kpbs（bitrate） - vbit：端侧视频码率kbps（bitRate） - dbit：端侧辅流码率kbps（bitRate） - vfps：端侧视频帧率fps（actFrameRate） - dfps：端侧辅流帧率fps（actFrameRate） - vblock：端侧视频卡顿率（统计大于等于600ms视频卡顿） - dblock：端侧辅流卡顿率（统计大于等于600ms辅流卡顿） - aloss：端侧音频丢包率（pktLoss） - vloss：端侧视频丢包率（pktLoss） - dloss：端侧辅流丢包率（pktLoss） - vwidth：端侧视频分辨率宽（actPicW） - vheight：端侧视频分辨率高（actPicH） - dwidth：端侧辅流分辨率宽（actPicW） - dheight：端侧辅流分辨率高（actPicH） - ajitter：端侧音频抖动率（jitter） - artt：端侧音频时延（rtt） - vjitter：端侧视频抖动率（jitter） - vrtt：端侧视频时延（rtt） - djitter：端侧辅流抖动率（jitter） - drtt：端侧辅流时延（rtt） 
     * @return mid
     */
    public MidEnum getMid() {
        return mid;
    }

    public void setMid(MidEnum mid) {
        this.mid = mid;
    }

    public ListRtcClientQosDetailsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询起始时间。UTC时间，格式：yyyy-mm-ddThh:mm:ssZ，如2020-04-23T06:00:00Z 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListRtcClientQosDetailsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间。UTC时间，格式：yyyy-mm-ddThh:mm:ssZ，如2020-04-23T07:00:00Z 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListRtcClientQosDetailsRequest withTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }

    /**
     * 查询的时间类型取值：stime 数据库打点时间，不填默认ctime查询
     * @return timeType
     */
    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public ListRtcClientQosDetailsRequest withLimit(Integer limit) {
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

    public ListRtcClientQosDetailsRequest withOffset(Integer offset) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRtcClientQosDetailsRequest that = (ListRtcClientQosDetailsRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xSdkDate, that.xSdkDate)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.roomId, that.roomId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.peerId, that.peerId)
            && Objects.equals(this.streamId, that.streamId) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.mid, that.mid) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.timeType, that.timeType)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization,
            xSdkDate,
            xProjectId,
            domain,
            appId,
            roomId,
            userId,
            peerId,
            streamId,
            direction,
            mid,
            startTime,
            endTime,
            timeType,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcClientQosDetailsRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    timeType: ").append(toIndentedString(timeType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
