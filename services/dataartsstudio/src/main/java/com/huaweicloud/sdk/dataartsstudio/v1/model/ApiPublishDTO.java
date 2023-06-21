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
 * ApiPublishDTO
 */
public class ApiPublishDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

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
            ApiStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiStatusEnum(value);
            }
            return result;
        }

        public static ApiStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
            ApiDebugEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiDebugEnum(value);
            }
            return result;
        }

        public static ApiDebugEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiDebugEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public ApiPublishDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 发布编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiPublishDTO withApiId(String apiId) {
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

    public ApiPublishDTO withInstanceId(String instanceId) {
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

    public ApiPublishDTO withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 集群名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ApiPublishDTO withApiStatus(ApiStatusEnum apiStatus) {
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

    public ApiPublishDTO withApiDebug(ApiDebugEnum apiDebug) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiPublishDTO apiPublishDTO = (ApiPublishDTO) o;
        return Objects.equals(this.id, apiPublishDTO.id) && Objects.equals(this.apiId, apiPublishDTO.apiId)
            && Objects.equals(this.instanceId, apiPublishDTO.instanceId)
            && Objects.equals(this.instanceName, apiPublishDTO.instanceName)
            && Objects.equals(this.apiStatus, apiPublishDTO.apiStatus)
            && Objects.equals(this.apiDebug, apiPublishDTO.apiDebug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apiId, instanceId, instanceName, apiStatus, apiDebug);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiPublishDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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
