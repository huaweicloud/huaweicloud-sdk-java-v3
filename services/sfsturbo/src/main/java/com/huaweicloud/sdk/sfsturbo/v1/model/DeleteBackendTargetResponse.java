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

/**
 * Response Object
 */
public class DeleteBackendTargetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_data_in_file_system")

    private Boolean deleteDataInFileSystem;

    /**
     * 绑定状态。只支持DELETING和FAILED
     */
    public static final class LifecycleEnum {

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final LifecycleEnum DELETING = new LifecycleEnum("DELETING");

        /**
         * Enum AVAILABLE for value: "AVAILABLE"
         */
        public static final LifecycleEnum AVAILABLE = new LifecycleEnum("AVAILABLE");

        /**
         * Enum MISCONFIGURED for value: "MISCONFIGURED"
         */
        public static final LifecycleEnum MISCONFIGURED = new LifecycleEnum("MISCONFIGURED");

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final LifecycleEnum CREATING = new LifecycleEnum("CREATING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final LifecycleEnum FAILED = new LifecycleEnum("FAILED");

        private static final Map<String, LifecycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LifecycleEnum> createStaticFields() {
            Map<String, LifecycleEnum> map = new HashMap<>();
            map.put("DELETING", DELETING);
            map.put("AVAILABLE", AVAILABLE);
            map.put("MISCONFIGURED", MISCONFIGURED);
            map.put("CREATING", CREATING);
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
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public DeleteBackendTargetResponse withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 绑定关系id
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public DeleteBackendTargetResponse withDeleteDataInFileSystem(Boolean deleteDataInFileSystem) {
        this.deleteDataInFileSystem = deleteDataInFileSystem;
        return this;
    }

    /**
     * 删除后端存储时是否同时删除文件系统内的联动目录及其数据文件
     * @return deleteDataInFileSystem
     */
    public Boolean getDeleteDataInFileSystem() {
        return deleteDataInFileSystem;
    }

    public void setDeleteDataInFileSystem(Boolean deleteDataInFileSystem) {
        this.deleteDataInFileSystem = deleteDataInFileSystem;
    }

    public DeleteBackendTargetResponse withLifecycle(LifecycleEnum lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * 绑定状态。只支持DELETING和FAILED
     * @return lifecycle
     */
    public LifecycleEnum getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(LifecycleEnum lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DeleteBackendTargetResponse withXRequestId(String xRequestId) {
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
        DeleteBackendTargetResponse that = (DeleteBackendTargetResponse) obj;
        return Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.deleteDataInFileSystem, that.deleteDataInFileSystem)
            && Objects.equals(this.lifecycle, that.lifecycle) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, deleteDataInFileSystem, lifecycle, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBackendTargetResponse {\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    deleteDataInFileSystem: ").append(toIndentedString(deleteDataInFileSystem)).append("\n");
        sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
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
