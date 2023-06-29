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
 * RtcUser
 */
public class RtcUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session")

    private String session;

    /**
     * 用户状态   - FAIL： 加入失败   - ONLINE：在线   - OFFLINE：离开 
     */
    public static final class StateEnum {

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StateEnum FAIL = new StateEnum("FAIL");

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final StateEnum ONLINE = new StateEnum("ONLINE");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final StateEnum OFFLINE = new StateEnum("OFFLINE");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("FAIL", FAIL);
            map.put("ONLINE", ONLINE);
            map.put("OFFLINE", OFFLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_model")

    private String deviceModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sdk")

    private String sdk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_time")

    private String joinTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leave_time")

    private String leaveTime;

    public RtcUser withDomain(String domain) {
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

    public RtcUser withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用标识
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public RtcUser withRoomId(String roomId) {
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

    public RtcUser withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 用户id
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public RtcUser withSession(String session) {
        this.session = session;
        return this;
    }

    /**
     * 会话id
     * @return session
     */
    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public RtcUser withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 用户状态   - FAIL： 加入失败   - ONLINE：在线   - OFFLINE：离开 
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public RtcUser withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public RtcUser withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 用户接入IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public RtcUser withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 用户接入IP所在省份
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public RtcUser withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 用户接入IP所在运营商
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public RtcUser withDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }

    /**
     * 用户设备型号
     * @return deviceModel
     */
    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public RtcUser withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 用户设备平台
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public RtcUser withSdk(String sdk) {
        this.sdk = sdk;
        return this;
    }

    /**
     * 用户sdk版本
     * @return sdk
     */
    public String getSdk() {
        return sdk;
    }

    public void setSdk(String sdk) {
        this.sdk = sdk;
    }

    public RtcUser withJoinTime(String joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    /**
     * 用户加入房间时间。格式为：YYYY-MM-DDThh:mm:ssZ 
     * @return joinTime
     */
    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public RtcUser withLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
        return this;
    }

    /**
     * 用户离开房间时间。格式为：YYYY-MM-DDThh:mm:ssZ，若用户未离开，则返回 “-” 
     * @return leaveTime
     */
    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RtcUser that = (RtcUser) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.app, that.app)
            && Objects.equals(this.roomId, that.roomId) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.session, that.session) && Objects.equals(this.state, that.state)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.region, that.region) && Objects.equals(this.isp, that.isp)
            && Objects.equals(this.deviceModel, that.deviceModel) && Objects.equals(this.platform, that.platform)
            && Objects.equals(this.sdk, that.sdk) && Objects.equals(this.joinTime, that.joinTime)
            && Objects.equals(this.leaveTime, that.leaveTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain,
            app,
            roomId,
            uid,
            session,
            state,
            nickName,
            ip,
            region,
            isp,
            deviceModel,
            platform,
            sdk,
            joinTime,
            leaveTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RtcUser {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    sdk: ").append(toIndentedString(sdk)).append("\n");
        sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
        sb.append("    leaveTime: ").append(toIndentedString(leaveTime)).append("\n");
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
