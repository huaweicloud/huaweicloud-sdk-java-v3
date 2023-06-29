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
 * InstanceForApiActionDTO
 */
public class InstanceForApiActionDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 集群类型
     */
    public static final class InstanceTypeEnum {

        /**
         * Enum DLM for value: "DLM"
         */
        public static final InstanceTypeEnum DLM = new InstanceTypeEnum("DLM");

        /**
         * Enum APIG for value: "APIG"
         */
        public static final InstanceTypeEnum APIG = new InstanceTypeEnum("APIG");

        /**
         * Enum APIGW for value: "APIGW"
         */
        public static final InstanceTypeEnum APIGW = new InstanceTypeEnum("APIGW");

        /**
         * Enum ROMA_APIC for value: "ROMA_APIC"
         */
        public static final InstanceTypeEnum ROMA_APIC = new InstanceTypeEnum("ROMA_APIC");

        private static final Map<String, InstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceTypeEnum> createStaticFields() {
            Map<String, InstanceTypeEnum> map = new HashMap<>();
            map.put("DLM", DLM);
            map.put("APIG", APIG);
            map.put("APIGW", APIGW);
            map.put("ROMA_APIC", ROMA_APIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceTypeEnum(String value) {
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
        public static InstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceTypeEnum(value));
        }

        public static InstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceTypeEnum) {
                return this.value.equals(((InstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private InstanceTypeEnum instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * api操作
     */
    public static final class ActionEnum {

        /**
         * Enum PUBLISH for value: "PUBLISH"
         */
        public static final ActionEnum PUBLISH = new ActionEnum("PUBLISH");

        /**
         * Enum UNPUBLISH for value: "UNPUBLISH"
         */
        public static final ActionEnum UNPUBLISH = new ActionEnum("UNPUBLISH");

        /**
         * Enum STOP for value: "STOP"
         */
        public static final ActionEnum STOP = new ActionEnum("STOP");

        /**
         * Enum RECOVER for value: "RECOVER"
         */
        public static final ActionEnum RECOVER = new ActionEnum("RECOVER");

        /**
         * Enum WHITELIST for value: "WHITELIST"
         */
        public static final ActionEnum WHITELIST = new ActionEnum("WHITELIST");

        /**
         * Enum AUTHORIZE for value: "AUTHORIZE"
         */
        public static final ActionEnum AUTHORIZE = new ActionEnum("AUTHORIZE");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("PUBLISH", PUBLISH);
            map.put("UNPUBLISH", UNPUBLISH);
            map.put("STOP", STOP);
            map.put("RECOVER", RECOVER);
            map.put("WHITELIST", WHITELIST);
            map.put("AUTHORIZE", AUTHORIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Boolean result;

    /**
     * 校验失败的原因
     */
    public static final class CauseEnum {

        /**
         * Enum API_STATUS_ERROR for value: "API_STATUS_ERROR"
         */
        public static final CauseEnum API_STATUS_ERROR = new CauseEnum("API_STATUS_ERROR");

        /**
         * Enum API_DEBUG_ERROR for value: "API_DEBUG_ERROR"
         */
        public static final CauseEnum API_DEBUG_ERROR = new CauseEnum("API_DEBUG_ERROR");

        /**
         * Enum TYPE_MISMATCH for value: "TYPE_MISMATCH"
         */
        public static final CauseEnum TYPE_MISMATCH = new CauseEnum("TYPE_MISMATCH");

        private static final Map<String, CauseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CauseEnum> createStaticFields() {
            Map<String, CauseEnum> map = new HashMap<>();
            map.put("API_STATUS_ERROR", API_STATUS_ERROR);
            map.put("API_DEBUG_ERROR", API_DEBUG_ERROR);
            map.put("TYPE_MISMATCH", TYPE_MISMATCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CauseEnum(String value) {
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
        public static CauseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CauseEnum(value));
        }

        public static CauseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CauseEnum) {
                return this.value.equals(((CauseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cause")

    private CauseEnum cause;

    /**
     * api状态
     */
    public static final class ApiStatusEnum {

        /**
         * Enum API_STATUS_CREATED for value: "API_STATUS_CREATED"
         */
        public static final ApiStatusEnum API_STATUS_CREATED = new ApiStatusEnum("API_STATUS_CREATED");

        /**
         * Enum API_STATUS_PUBLISH_WAIT_REVIEW for value: "API_STATUS_PUBLISH_WAIT_REVIEW"
         */
        public static final ApiStatusEnum API_STATUS_PUBLISH_WAIT_REVIEW =
            new ApiStatusEnum("API_STATUS_PUBLISH_WAIT_REVIEW");

        /**
         * Enum API_STATUS_PUBLISH_REJECT for value: "API_STATUS_PUBLISH_REJECT"
         */
        public static final ApiStatusEnum API_STATUS_PUBLISH_REJECT = new ApiStatusEnum("API_STATUS_PUBLISH_REJECT");

        /**
         * Enum API_STATUS_PUBLISHED for value: "API_STATUS_PUBLISHED"
         */
        public static final ApiStatusEnum API_STATUS_PUBLISHED = new ApiStatusEnum("API_STATUS_PUBLISHED");

        /**
         * Enum API_STATUS_WAITING_STOP for value: "API_STATUS_WAITING_STOP"
         */
        public static final ApiStatusEnum API_STATUS_WAITING_STOP = new ApiStatusEnum("API_STATUS_WAITING_STOP");

        /**
         * Enum API_STATUS_STOPPED for value: "API_STATUS_STOPPED"
         */
        public static final ApiStatusEnum API_STATUS_STOPPED = new ApiStatusEnum("API_STATUS_STOPPED");

        /**
         * Enum API_STATUS_RECOVER_WAIT_REVIEW for value: "API_STATUS_RECOVER_WAIT_REVIEW"
         */
        public static final ApiStatusEnum API_STATUS_RECOVER_WAIT_REVIEW =
            new ApiStatusEnum("API_STATUS_RECOVER_WAIT_REVIEW");

        /**
         * Enum API_STATUS_WAITING_OFFLINE for value: "API_STATUS_WAITING_OFFLINE"
         */
        public static final ApiStatusEnum API_STATUS_WAITING_OFFLINE = new ApiStatusEnum("API_STATUS_WAITING_OFFLINE");

        /**
         * Enum API_STATUS_OFFLINE for value: "API_STATUS_OFFLINE"
         */
        public static final ApiStatusEnum API_STATUS_OFFLINE = new ApiStatusEnum("API_STATUS_OFFLINE");

        private static final Map<String, ApiStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiStatusEnum> createStaticFields() {
            Map<String, ApiStatusEnum> map = new HashMap<>();
            map.put("API_STATUS_CREATED", API_STATUS_CREATED);
            map.put("API_STATUS_PUBLISH_WAIT_REVIEW", API_STATUS_PUBLISH_WAIT_REVIEW);
            map.put("API_STATUS_PUBLISH_REJECT", API_STATUS_PUBLISH_REJECT);
            map.put("API_STATUS_PUBLISHED", API_STATUS_PUBLISHED);
            map.put("API_STATUS_WAITING_STOP", API_STATUS_WAITING_STOP);
            map.put("API_STATUS_STOPPED", API_STATUS_STOPPED);
            map.put("API_STATUS_RECOVER_WAIT_REVIEW", API_STATUS_RECOVER_WAIT_REVIEW);
            map.put("API_STATUS_WAITING_OFFLINE", API_STATUS_WAITING_OFFLINE);
            map.put("API_STATUS_OFFLINE", API_STATUS_OFFLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiStatusEnum(String value) {
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
        public static ApiStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApiStatusEnum(value));
        }

        public static ApiStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiStatusEnum) {
                return this.value.equals(((ApiStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_status")

    private ApiStatusEnum apiStatus;

    /**
     * api调试状态
     */
    public static final class ApiDebugEnum {

        /**
         * Enum API_DEBUG_WAITING for value: "API_DEBUG_WAITING"
         */
        public static final ApiDebugEnum API_DEBUG_WAITING = new ApiDebugEnum("API_DEBUG_WAITING");

        /**
         * Enum API_DEBUG_FAILED for value: "API_DEBUG_FAILED"
         */
        public static final ApiDebugEnum API_DEBUG_FAILED = new ApiDebugEnum("API_DEBUG_FAILED");

        /**
         * Enum API_DEBUG_SUCCESS for value: "API_DEBUG_SUCCESS"
         */
        public static final ApiDebugEnum API_DEBUG_SUCCESS = new ApiDebugEnum("API_DEBUG_SUCCESS");

        private static final Map<String, ApiDebugEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiDebugEnum> createStaticFields() {
            Map<String, ApiDebugEnum> map = new HashMap<>();
            map.put("API_DEBUG_WAITING", API_DEBUG_WAITING);
            map.put("API_DEBUG_FAILED", API_DEBUG_FAILED);
            map.put("API_DEBUG_SUCCESS", API_DEBUG_SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiDebugEnum(String value) {
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
        public static ApiDebugEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApiDebugEnum(value));
        }

        public static ApiDebugEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiDebugEnum) {
                return this.value.equals(((ApiDebugEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_debug")

    private ApiDebugEnum apiDebug;

    public InstanceForApiActionDTO withInstanceId(String instanceId) {
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

    public InstanceForApiActionDTO withInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 集群类型
     * @return instanceType
     */
    public InstanceTypeEnum getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
    }

    public InstanceForApiActionDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceForApiActionDTO withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * api操作
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public InstanceForApiActionDTO withResult(Boolean result) {
        this.result = result;
        return this;
    }

    /**
     * 校验结果
     * @return result
     */
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public InstanceForApiActionDTO withCause(CauseEnum cause) {
        this.cause = cause;
        return this;
    }

    /**
     * 校验失败的原因
     * @return cause
     */
    public CauseEnum getCause() {
        return cause;
    }

    public void setCause(CauseEnum cause) {
        this.cause = cause;
    }

    public InstanceForApiActionDTO withApiStatus(ApiStatusEnum apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }

    /**
     * api状态
     * @return apiStatus
     */
    public ApiStatusEnum getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(ApiStatusEnum apiStatus) {
        this.apiStatus = apiStatus;
    }

    public InstanceForApiActionDTO withApiDebug(ApiDebugEnum apiDebug) {
        this.apiDebug = apiDebug;
        return this;
    }

    /**
     * api调试状态
     * @return apiDebug
     */
    public ApiDebugEnum getApiDebug() {
        return apiDebug;
    }

    public void setApiDebug(ApiDebugEnum apiDebug) {
        this.apiDebug = apiDebug;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceForApiActionDTO that = (InstanceForApiActionDTO) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.name, that.name) && Objects.equals(this.action, that.action)
            && Objects.equals(this.result, that.result) && Objects.equals(this.cause, that.cause)
            && Objects.equals(this.apiStatus, that.apiStatus) && Objects.equals(this.apiDebug, that.apiDebug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceType, name, action, result, cause, apiStatus, apiDebug);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceForApiActionDTO {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
        sb.append("    apiStatus: ").append(toIndentedString(apiStatus)).append("\n");
        sb.append("    apiDebug: ").append(toIndentedString(apiDebug)).append("\n");
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
