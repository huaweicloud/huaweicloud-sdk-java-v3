package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 已拦截IP详情
 */
public class BlockedIpResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_type")

    private String loginType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intercept_num")

    private Integer interceptNum;

    /**
     * 拦截状态，包含如下:   - \"intercepted\" # 已拦截   - \"canceled\" # 已解除拦截   - \"cancelling\" # 待解除拦截
     */
    public static final class InterceptStatusEnum {

        /**
         * Enum INTERCEPTED for value: "intercepted"
         */
        public static final InterceptStatusEnum INTERCEPTED = new InterceptStatusEnum("intercepted");

        /**
         * Enum CANCELED for value: "canceled"
         */
        public static final InterceptStatusEnum CANCELED = new InterceptStatusEnum("canceled");

        /**
         * Enum CANCELLING for value: "cancelling"
         */
        public static final InterceptStatusEnum CANCELLING = new InterceptStatusEnum("cancelling");

        private static final Map<String, InterceptStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InterceptStatusEnum> createStaticFields() {
            Map<String, InterceptStatusEnum> map = new HashMap<>();
            map.put("intercepted", INTERCEPTED);
            map.put("canceled", CANCELED);
            map.put("cancelling", CANCELLING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InterceptStatusEnum(String value) {
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
        public static InterceptStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InterceptStatusEnum(value));
        }

        public static InterceptStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InterceptStatusEnum) {
                return this.value.equals(((InterceptStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intercept_status")

    private InterceptStatusEnum interceptStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_time")

    private Long blockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_time")

    private Long latestTime;

    public BlockedIpResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public BlockedIpResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public BlockedIpResponseInfo withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 攻击源IP
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public BlockedIpResponseInfo withLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }

    /**
     * 登录类型，包含如下: - \"mysql\" # mysql服务 - \"rdp\" # rdp服务服务 - \"ssh\" # ssh服务 - \"vsftp\" # vsftp服务
     * @return loginType
     */
    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public BlockedIpResponseInfo withInterceptNum(Integer interceptNum) {
        this.interceptNum = interceptNum;
        return this;
    }

    /**
     * 拦截次数
     * minimum: 0
     * maximum: 2147483647
     * @return interceptNum
     */
    public Integer getInterceptNum() {
        return interceptNum;
    }

    public void setInterceptNum(Integer interceptNum) {
        this.interceptNum = interceptNum;
    }

    public BlockedIpResponseInfo withInterceptStatus(InterceptStatusEnum interceptStatus) {
        this.interceptStatus = interceptStatus;
        return this;
    }

    /**
     * 拦截状态，包含如下:   - \"intercepted\" # 已拦截   - \"canceled\" # 已解除拦截   - \"cancelling\" # 待解除拦截
     * @return interceptStatus
     */
    public InterceptStatusEnum getInterceptStatus() {
        return interceptStatus;
    }

    public void setInterceptStatus(InterceptStatusEnum interceptStatus) {
        this.interceptStatus = interceptStatus;
    }

    public BlockedIpResponseInfo withBlockTime(Long blockTime) {
        this.blockTime = blockTime;
        return this;
    }

    /**
     * 开始拦截时间，毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return blockTime
     */
    public Long getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Long blockTime) {
        this.blockTime = blockTime;
    }

    public BlockedIpResponseInfo withLatestTime(Long latestTime) {
        this.latestTime = latestTime;
        return this;
    }

    /**
     * 最近拦截时间，毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestTime
     */
    public Long getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(Long latestTime) {
        this.latestTime = latestTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlockedIpResponseInfo that = (BlockedIpResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.srcIp, that.srcIp) && Objects.equals(this.loginType, that.loginType)
            && Objects.equals(this.interceptNum, that.interceptNum)
            && Objects.equals(this.interceptStatus, that.interceptStatus)
            && Objects.equals(this.blockTime, that.blockTime) && Objects.equals(this.latestTime, that.latestTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, srcIp, loginType, interceptNum, interceptStatus, blockTime, latestTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlockedIpResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    loginType: ").append(toIndentedString(loginType)).append("\n");
        sb.append("    interceptNum: ").append(toIndentedString(interceptNum)).append("\n");
        sb.append("    interceptStatus: ").append(toIndentedString(interceptStatus)).append("\n");
        sb.append("    blockTime: ").append(toIndentedString(blockTime)).append("\n");
        sb.append("    latestTime: ").append(toIndentedString(latestTime)).append("\n");
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
