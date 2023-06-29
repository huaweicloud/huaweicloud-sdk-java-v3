package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LiveSnapshotConfig
 */
public class LiveSnapshotConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_key")

    private String authKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_interval")

    private Integer timeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_write_mode")

    private Integer objectWriteMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_location")

    private ObsFileAddr obsLocation;

    /**
     * 是否启用回调通知 - on：启用。 - off：不启用。
     */
    public static final class CallBackEnableEnum {

        /**
         * Enum ON for value: "on"
         */
        public static final CallBackEnableEnum ON = new CallBackEnableEnum("on");

        /**
         * Enum OFF for value: "off"
         */
        public static final CallBackEnableEnum OFF = new CallBackEnableEnum("off");

        private static final Map<String, CallBackEnableEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CallBackEnableEnum> createStaticFields() {
            Map<String, CallBackEnableEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CallBackEnableEnum(String value) {
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
        public static CallBackEnableEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CallBackEnableEnum(value));
        }

        public static CallBackEnableEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CallBackEnableEnum) {
                return this.value.equals(((CallBackEnableEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_back_enable")

    private CallBackEnableEnum callBackEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_back_url")

    private String callBackUrl;

    public LiveSnapshotConfig withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 直播推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public LiveSnapshotConfig withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public LiveSnapshotConfig withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * 回调鉴权密钥值  长度范围：[32-128]  若需要使用回调鉴权功能，请配置鉴权密钥，否则，留空即可。
     * @return authKey
     */
    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public LiveSnapshotConfig withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * 截图频率  取值范围：[5-3600]  单位：秒
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public LiveSnapshotConfig withObjectWriteMode(Integer objectWriteMode) {
        this.objectWriteMode = objectWriteMode;
        return this;
    }

    /**
     * 在OBS桶存储截图的方式：  - 0：实时截图，以时间戳命名截图文件，保存所有截图文件到OBS桶。例：snapshot/{domain}/{app_name}/{stream_name}/{UnixTimestamp}.jpg  - 1：覆盖截图，只保存最新的截图文件，新的截图会覆盖原来的截图文件。例：snapshot/{domain}/{app_name}/{stream_name}.jpg
     * @return objectWriteMode
     */
    public Integer getObjectWriteMode() {
        return objectWriteMode;
    }

    public void setObjectWriteMode(Integer objectWriteMode) {
        this.objectWriteMode = objectWriteMode;
    }

    public LiveSnapshotConfig withObsLocation(ObsFileAddr obsLocation) {
        this.obsLocation = obsLocation;
        return this;
    }

    public LiveSnapshotConfig withObsLocation(Consumer<ObsFileAddr> obsLocationSetter) {
        if (this.obsLocation == null) {
            this.obsLocation = new ObsFileAddr();
            obsLocationSetter.accept(this.obsLocation);
        }

        return this;
    }

    /**
     * Get obsLocation
     * @return obsLocation
     */
    public ObsFileAddr getObsLocation() {
        return obsLocation;
    }

    public void setObsLocation(ObsFileAddr obsLocation) {
        this.obsLocation = obsLocation;
    }

    public LiveSnapshotConfig withCallBackEnable(CallBackEnableEnum callBackEnable) {
        this.callBackEnable = callBackEnable;
        return this;
    }

    /**
     * 是否启用回调通知 - on：启用。 - off：不启用。
     * @return callBackEnable
     */
    public CallBackEnableEnum getCallBackEnable() {
        return callBackEnable;
    }

    public void setCallBackEnable(CallBackEnableEnum callBackEnable) {
        this.callBackEnable = callBackEnable;
    }

    public LiveSnapshotConfig withCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
        return this;
    }

    /**
     * 通知服务器地址，必须是合法的URL且携带协议，协议支持http和https。截图完成后直播服务会向此地址推送截图状态信息。
     * @return callBackUrl
     */
    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveSnapshotConfig that = (LiveSnapshotConfig) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.authKey, that.authKey) && Objects.equals(this.timeInterval, that.timeInterval)
            && Objects.equals(this.objectWriteMode, that.objectWriteMode)
            && Objects.equals(this.obsLocation, that.obsLocation)
            && Objects.equals(this.callBackEnable, that.callBackEnable)
            && Objects.equals(this.callBackUrl, that.callBackUrl);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(domain, appName, authKey, timeInterval, objectWriteMode, obsLocation, callBackEnable, callBackUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveSnapshotConfig {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    objectWriteMode: ").append(toIndentedString(objectWriteMode)).append("\n");
        sb.append("    obsLocation: ").append(toIndentedString(obsLocation)).append("\n");
        sb.append("    callBackEnable: ").append(toIndentedString(callBackEnable)).append("\n");
        sb.append("    callBackUrl: ").append(toIndentedString(callBackUrl)).append("\n");
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
