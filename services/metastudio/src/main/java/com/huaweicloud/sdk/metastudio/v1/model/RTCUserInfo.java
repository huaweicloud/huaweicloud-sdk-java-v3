package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 接入RTC的用户信息。
 */
public class RTCUserInfo {

    /**
     * 接入RTC的用户类型。 * CAPTURE: 直播助手，将摄像头获取视频流推送到RTC房间 * ANIMATION: VDS服务，从RTC房间拉视频流生成动作数据 * RENDER: 渲染服务，将动作数据渲染成数字人动画 * PLAYER: 普通观看方，可选择原始视频流或者数字人动画视频流观看
     */
    public static final class UserTypeEnum {

        /**
         * Enum CAPTURE for value: "CAPTURE"
         */
        public static final UserTypeEnum CAPTURE = new UserTypeEnum("CAPTURE");

        /**
         * Enum ANIMATION for value: "ANIMATION"
         */
        public static final UserTypeEnum ANIMATION = new UserTypeEnum("ANIMATION");

        /**
         * Enum RENDER for value: "RENDER"
         */
        public static final UserTypeEnum RENDER = new UserTypeEnum("RENDER");

        /**
         * Enum PLAYER for value: "PLAYER"
         */
        public static final UserTypeEnum PLAYER = new UserTypeEnum("PLAYER");

        private static final Map<String, UserTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UserTypeEnum> createStaticFields() {
            Map<String, UserTypeEnum> map = new HashMap<>();
            map.put("CAPTURE", CAPTURE);
            map.put("ANIMATION", ANIMATION);
            map.put("RENDER", RENDER);
            map.put("PLAYER", PLAYER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UserTypeEnum(String value) {
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
        public static UserTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UserTypeEnum(value));
        }

        public static UserTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UserTypeEnum) {
                return this.value.equals(((UserTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private UserTypeEnum userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ctime")

    private Long ctime;

    public RTCUserInfo withUserType(UserTypeEnum userType) {
        this.userType = userType;
        return this;
    }

    /**
     * 接入RTC的用户类型。 * CAPTURE: 直播助手，将摄像头获取视频流推送到RTC房间 * ANIMATION: VDS服务，从RTC房间拉视频流生成动作数据 * RENDER: 渲染服务，将动作数据渲染成数字人动画 * PLAYER: 普通观看方，可选择原始视频流或者数字人动画视频流观看
     * @return userType
     */
    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    public RTCUserInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * RTC用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RTCUserInfo withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * RTC鉴权token。
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public RTCUserInfo withCtime(Long ctime) {
        this.ctime = ctime;
        return this;
    }

    /**
     * 有效期。时间戳，单位：秒。
     * minimum: 0
     * maximum: 4294967295
     * @return ctime
     */
    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RTCUserInfo that = (RTCUserInfo) obj;
        return Objects.equals(this.userType, that.userType) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.signature, that.signature) && Objects.equals(this.ctime, that.ctime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userType, userId, signature, ctime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RTCUserInfo {\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
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
