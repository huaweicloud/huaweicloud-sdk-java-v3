package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApiParaForAuthToInstance
 */
public class ApiParaForAuthToInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    /**
     * 申请类型
     */
    public static final class ApplyTypeEnum {

        /**
         * Enum APPLY_TYPE_AUTHORIZE for value: "APPLY_TYPE_AUTHORIZE"
         */
        public static final ApplyTypeEnum APPLY_TYPE_AUTHORIZE = new ApplyTypeEnum("APPLY_TYPE_AUTHORIZE");

        /**
         * Enum APPLY_TYPE_API_CANCEL_AUTHORIZE for value: "APPLY_TYPE_API_CANCEL_AUTHORIZE"
         */
        public static final ApplyTypeEnum APPLY_TYPE_API_CANCEL_AUTHORIZE =
            new ApplyTypeEnum("APPLY_TYPE_API_CANCEL_AUTHORIZE");

        /**
         * Enum APPLY_TYPE_APP_CANCEL_AUTHORIZE for value: "APPLY_TYPE_APP_CANCEL_AUTHORIZE"
         */
        public static final ApplyTypeEnum APPLY_TYPE_APP_CANCEL_AUTHORIZE =
            new ApplyTypeEnum("APPLY_TYPE_APP_CANCEL_AUTHORIZE");

        /**
         * Enum APPLY_TYPE_APPLY for value: "APPLY_TYPE_APPLY"
         */
        public static final ApplyTypeEnum APPLY_TYPE_APPLY = new ApplyTypeEnum("APPLY_TYPE_APPLY");

        /**
         * Enum APPLY_TYPE_RENEW for value: "APPLY_TYPE_RENEW"
         */
        public static final ApplyTypeEnum APPLY_TYPE_RENEW = new ApplyTypeEnum("APPLY_TYPE_RENEW");

        private static final Map<String, ApplyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApplyTypeEnum> createStaticFields() {
            Map<String, ApplyTypeEnum> map = new HashMap<>();
            map.put("APPLY_TYPE_AUTHORIZE", APPLY_TYPE_AUTHORIZE);
            map.put("APPLY_TYPE_API_CANCEL_AUTHORIZE", APPLY_TYPE_API_CANCEL_AUTHORIZE);
            map.put("APPLY_TYPE_APP_CANCEL_AUTHORIZE", APPLY_TYPE_APP_CANCEL_AUTHORIZE);
            map.put("APPLY_TYPE_APPLY", APPLY_TYPE_APPLY);
            map.put("APPLY_TYPE_RENEW", APPLY_TYPE_RENEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApplyTypeEnum(String value) {
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
        public static ApplyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApplyTypeEnum(value));
        }

        public static ApplyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApplyTypeEnum) {
                return this.value.equals(((ApplyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_type")

    private ApplyTypeEnum applyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public ApiParaForAuthToInstance withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * api编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ApiParaForAuthToInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 集群编号
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ApiParaForAuthToInstance withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * app编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ApiParaForAuthToInstance withApplyType(ApplyTypeEnum applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * 申请类型
     * @return applyType
     */
    public ApplyTypeEnum getApplyType() {
        return applyType;
    }

    public void setApplyType(ApplyTypeEnum applyType) {
        this.applyType = applyType;
    }

    public ApiParaForAuthToInstance withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 截止时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiParaForAuthToInstance that = (ApiParaForAuthToInstance) obj;
        return Objects.equals(this.apiId, that.apiId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.applyType, that.applyType)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, instanceId, appId, applyType, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiParaForAuthToInstance {\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    applyType: ").append(toIndentedString(applyType)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
