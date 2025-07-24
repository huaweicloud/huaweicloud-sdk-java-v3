package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBackendTargetInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private String creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_system_path")

    private String fileSystemPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_details")

    private FailureDetailsMessage failureDetails;

    /**
     * 绑定状态
     */
    public static final class LifecycleEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final LifecycleEnum CREATING = new LifecycleEnum("CREATING");

        /**
         * Enum AVAILABLE for value: "AVAILABLE"
         */
        public static final LifecycleEnum AVAILABLE = new LifecycleEnum("AVAILABLE");

        /**
         * Enum MISCONFIGURED for value: "MISCONFIGURED"
         */
        public static final LifecycleEnum MISCONFIGURED = new LifecycleEnum("MISCONFIGURED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final LifecycleEnum DELETING = new LifecycleEnum("DELETING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final LifecycleEnum FAILED = new LifecycleEnum("FAILED");

        private static final Map<String, LifecycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LifecycleEnum> createStaticFields() {
            Map<String, LifecycleEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("AVAILABLE", AVAILABLE);
            map.put("MISCONFIGURED", MISCONFIGURED);
            map.put("DELETING", DELETING);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LifecycleEnum(String value) {
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
        public static LifecycleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LifecycleEnum(value));
        }

        public static LifecycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LifecycleEnum) {
                return this.value.equals(((LifecycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycle")

    private LifecycleEnum lifecycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private ObsDataRepository obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowBackendTargetInfoResponse withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 绑定关系ID
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public ShowBackendTargetInfoResponse withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 绑定关系创建时间
     * @return creationTime
     */
    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public ShowBackendTargetInfoResponse withFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
        return this;
    }

    /**
     * 联动目录名称
     * @return fileSystemPath
     */
    public String getFileSystemPath() {
        return fileSystemPath;
    }

    public void setFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
    }

    public ShowBackendTargetInfoResponse withFailureDetails(FailureDetailsMessage failureDetails) {
        this.failureDetails = failureDetails;
        return this;
    }

    public ShowBackendTargetInfoResponse withFailureDetails(Consumer<FailureDetailsMessage> failureDetailsSetter) {
        if (this.failureDetails == null) {
            this.failureDetails = new FailureDetailsMessage();
            failureDetailsSetter.accept(this.failureDetails);
        }

        return this;
    }

    /**
     * Get failureDetails
     * @return failureDetails
     */
    public FailureDetailsMessage getFailureDetails() {
        return failureDetails;
    }

    public void setFailureDetails(FailureDetailsMessage failureDetails) {
        this.failureDetails = failureDetails;
    }

    public ShowBackendTargetInfoResponse withLifecycle(LifecycleEnum lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * 绑定状态
     * @return lifecycle
     */
    public LifecycleEnum getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(LifecycleEnum lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ShowBackendTargetInfoResponse withObs(ObsDataRepository obs) {
        this.obs = obs;
        return this;
    }

    public ShowBackendTargetInfoResponse withObs(Consumer<ObsDataRepository> obsSetter) {
        if (this.obs == null) {
            this.obs = new ObsDataRepository();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public ObsDataRepository getObs() {
        return obs;
    }

    public void setObs(ObsDataRepository obs) {
        this.obs = obs;
    }

    public ShowBackendTargetInfoResponse withXRequestId(String xRequestId) {
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
        ShowBackendTargetInfoResponse that = (ShowBackendTargetInfoResponse) obj;
        return Objects.equals(this.targetId, that.targetId) && Objects.equals(this.creationTime, that.creationTime)
            && Objects.equals(this.fileSystemPath, that.fileSystemPath)
            && Objects.equals(this.failureDetails, that.failureDetails)
            && Objects.equals(this.lifecycle, that.lifecycle) && Objects.equals(this.obs, that.obs)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, creationTime, fileSystemPath, failureDetails, lifecycle, obs, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackendTargetInfoResponse {\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    fileSystemPath: ").append(toIndentedString(fileSystemPath)).append("\n");
        sb.append("    failureDetails: ").append(toIndentedString(failureDetails)).append("\n");
        sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
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
