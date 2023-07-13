package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件状态信息
 */
public class AddonInstanceStatus {

    /**
     * 插件实例状态
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum ABNORMAL for value: "abnormal"
         */
        public static final StatusEnum ABNORMAL = new StatusEnum("abnormal");

        /**
         * Enum INSTALLING for value: "installing"
         */
        public static final StatusEnum INSTALLING = new StatusEnum("installing");

        /**
         * Enum INSTALLFAILED for value: "installFailed"
         */
        public static final StatusEnum INSTALLFAILED = new StatusEnum("installFailed");

        /**
         * Enum UPGRADING for value: "upgrading"
         */
        public static final StatusEnum UPGRADING = new StatusEnum("upgrading");

        /**
         * Enum UPGRADEFAILED for value: "upgradeFailed"
         */
        public static final StatusEnum UPGRADEFAILED = new StatusEnum("upgradeFailed");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        /**
         * Enum DELETESUCCESS for value: "deleteSuccess"
         */
        public static final StatusEnum DELETESUCCESS = new StatusEnum("deleteSuccess");

        /**
         * Enum DELETEFAILED for value: "deleteFailed"
         */
        public static final StatusEnum DELETEFAILED = new StatusEnum("deleteFailed");

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("available");

        /**
         * Enum ROLLBACKING for value: "rollbacking"
         */
        public static final StatusEnum ROLLBACKING = new StatusEnum("rollbacking");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("running", RUNNING);
            map.put("abnormal", ABNORMAL);
            map.put("installing", INSTALLING);
            map.put("installFailed", INSTALLFAILED);
            map.put("upgrading", UPGRADING);
            map.put("upgradeFailed", UPGRADEFAILED);
            map.put("deleting", DELETING);
            map.put("deleteSuccess", DELETESUCCESS);
            map.put("deleteFailed", DELETEFAILED);
            map.put("available", AVAILABLE);
            map.put("rollbacking", ROLLBACKING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersions")

    private List<String> targetVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentVersion")

    private Versions currentVersion;

    public AddonInstanceStatus withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 插件实例状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AddonInstanceStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 插件安装失败原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public AddonInstanceStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 安装错误详情
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AddonInstanceStatus withTargetVersions(List<String> targetVersions) {
        this.targetVersions = targetVersions;
        return this;
    }

    public AddonInstanceStatus addTargetVersionsItem(String targetVersionsItem) {
        if (this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        this.targetVersions.add(targetVersionsItem);
        return this;
    }

    public AddonInstanceStatus withTargetVersions(Consumer<List<String>> targetVersionsSetter) {
        if (this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        targetVersionsSetter.accept(this.targetVersions);
        return this;
    }

    /**
     * 此插件版本，支持升级的集群版本
     * @return targetVersions
     */
    public List<String> getTargetVersions() {
        return targetVersions;
    }

    public void setTargetVersions(List<String> targetVersions) {
        this.targetVersions = targetVersions;
    }

    public AddonInstanceStatus withCurrentVersion(Versions currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public AddonInstanceStatus withCurrentVersion(Consumer<Versions> currentVersionSetter) {
        if (this.currentVersion == null) {
            this.currentVersion = new Versions();
            currentVersionSetter.accept(this.currentVersion);
        }

        return this;
    }

    /**
     * Get currentVersion
     * @return currentVersion
     */
    public Versions getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(Versions currentVersion) {
        this.currentVersion = currentVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddonInstanceStatus that = (AddonInstanceStatus) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.message, that.message) && Objects.equals(this.targetVersions, that.targetVersions)
            && Objects.equals(this.currentVersion, that.currentVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason, message, targetVersions, currentVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonInstanceStatus {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    targetVersions: ").append(toIndentedString(targetVersions)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
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
