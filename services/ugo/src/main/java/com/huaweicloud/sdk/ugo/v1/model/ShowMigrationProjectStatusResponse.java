package com.huaweicloud.sdk.ugo.v1.model;

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
public class ShowMigrationProjectStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_project_id")

    private Integer migrationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_project_name")

    private String migrationProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_id")

    private Integer evaluationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_name")

    private String evaluationProjectName;

    /**
     * 迁移项目状态。
     */
    public static final class MigrationProjectStatusEnum {

        /**
         * Enum READY for value: "READY"
         */
        public static final MigrationProjectStatusEnum READY = new MigrationProjectStatusEnum("READY");

        /**
         * Enum NOT_READY for value: "NOT_READY"
         */
        public static final MigrationProjectStatusEnum NOT_READY = new MigrationProjectStatusEnum("NOT_READY");

        private static final Map<String, MigrationProjectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrationProjectStatusEnum> createStaticFields() {
            Map<String, MigrationProjectStatusEnum> map = new HashMap<>();
            map.put("READY", READY);
            map.put("NOT_READY", NOT_READY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrationProjectStatusEnum(String value) {
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
        public static MigrationProjectStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MigrationProjectStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MigrationProjectStatusEnum(value);
            }
            return result;
        }

        public static MigrationProjectStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MigrationProjectStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrationProjectStatusEnum) {
                return this.value.equals(((MigrationProjectStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_project_status")

    private MigrationProjectStatusEnum migrationProjectStatus;

    /**
     * 目标库权限检查状态。
     */
    public static final class PermissionCheckStatusEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final PermissionCheckStatusEnum SUCCESS = new PermissionCheckStatusEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final PermissionCheckStatusEnum FAILED = new PermissionCheckStatusEnum("FAILED");

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final PermissionCheckStatusEnum WAITING = new PermissionCheckStatusEnum("WAITING");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final PermissionCheckStatusEnum PENDING = new PermissionCheckStatusEnum("PENDING");

        /**
         * Enum IGNORE for value: "IGNORE"
         */
        public static final PermissionCheckStatusEnum IGNORE = new PermissionCheckStatusEnum("IGNORE");

        private static final Map<String, PermissionCheckStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionCheckStatusEnum> createStaticFields() {
            Map<String, PermissionCheckStatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            map.put("WAITING", WAITING);
            map.put("PENDING", PENDING);
            map.put("IGNORE", IGNORE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionCheckStatusEnum(String value) {
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
        public static PermissionCheckStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PermissionCheckStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PermissionCheckStatusEnum(value);
            }
            return result;
        }

        public static PermissionCheckStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PermissionCheckStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionCheckStatusEnum) {
                return this.value.equals(((PermissionCheckStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_check_status")

    private PermissionCheckStatusEnum permissionCheckStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    public ShowMigrationProjectStatusResponse withMigrationProjectId(Integer migrationProjectId) {
        this.migrationProjectId = migrationProjectId;
        return this;
    }

    /**
     * 迁移项目ID。
     * @return migrationProjectId
     */
    public Integer getMigrationProjectId() {
        return migrationProjectId;
    }

    public void setMigrationProjectId(Integer migrationProjectId) {
        this.migrationProjectId = migrationProjectId;
    }

    public ShowMigrationProjectStatusResponse withMigrationProjectName(String migrationProjectName) {
        this.migrationProjectName = migrationProjectName;
        return this;
    }

    /**
     * 迁移项目名称。
     * @return migrationProjectName
     */
    public String getMigrationProjectName() {
        return migrationProjectName;
    }

    public void setMigrationProjectName(String migrationProjectName) {
        this.migrationProjectName = migrationProjectName;
    }

    public ShowMigrationProjectStatusResponse withEvaluationProjectId(Integer evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
        return this;
    }

    /**
     * 评估项目ID。
     * @return evaluationProjectId
     */
    public Integer getEvaluationProjectId() {
        return evaluationProjectId;
    }

    public void setEvaluationProjectId(Integer evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
    }

    public ShowMigrationProjectStatusResponse withEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
        return this;
    }

    /**
     * 评估项目名称。
     * @return evaluationProjectName
     */
    public String getEvaluationProjectName() {
        return evaluationProjectName;
    }

    public void setEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
    }

    public ShowMigrationProjectStatusResponse withMigrationProjectStatus(
        MigrationProjectStatusEnum migrationProjectStatus) {
        this.migrationProjectStatus = migrationProjectStatus;
        return this;
    }

    /**
     * 迁移项目状态。
     * @return migrationProjectStatus
     */
    public MigrationProjectStatusEnum getMigrationProjectStatus() {
        return migrationProjectStatus;
    }

    public void setMigrationProjectStatus(MigrationProjectStatusEnum migrationProjectStatus) {
        this.migrationProjectStatus = migrationProjectStatus;
    }

    public ShowMigrationProjectStatusResponse withPermissionCheckStatus(
        PermissionCheckStatusEnum permissionCheckStatus) {
        this.permissionCheckStatus = permissionCheckStatus;
        return this;
    }

    /**
     * 目标库权限检查状态。
     * @return permissionCheckStatus
     */
    public PermissionCheckStatusEnum getPermissionCheckStatus() {
        return permissionCheckStatus;
    }

    public void setPermissionCheckStatus(PermissionCheckStatusEnum permissionCheckStatus) {
        this.permissionCheckStatus = permissionCheckStatus;
    }

    public ShowMigrationProjectStatusResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowMigrationProjectStatusResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowMigrationProjectStatusResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMigrationProjectStatusResponse showMigrationProjectStatusResponse = (ShowMigrationProjectStatusResponse) o;
        return Objects.equals(this.migrationProjectId, showMigrationProjectStatusResponse.migrationProjectId)
            && Objects.equals(this.migrationProjectName, showMigrationProjectStatusResponse.migrationProjectName)
            && Objects.equals(this.evaluationProjectId, showMigrationProjectStatusResponse.evaluationProjectId)
            && Objects.equals(this.evaluationProjectName, showMigrationProjectStatusResponse.evaluationProjectName)
            && Objects.equals(this.migrationProjectStatus, showMigrationProjectStatusResponse.migrationProjectStatus)
            && Objects.equals(this.permissionCheckStatus, showMigrationProjectStatusResponse.permissionCheckStatus)
            && Objects.equals(this.resourceId, showMigrationProjectStatusResponse.resourceId)
            && Objects.equals(this.createdTime, showMigrationProjectStatusResponse.createdTime)
            && Objects.equals(this.updatedTime, showMigrationProjectStatusResponse.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationProjectId,
            migrationProjectName,
            evaluationProjectId,
            evaluationProjectName,
            migrationProjectStatus,
            permissionCheckStatus,
            resourceId,
            createdTime,
            updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigrationProjectStatusResponse {\n");
        sb.append("    migrationProjectId: ").append(toIndentedString(migrationProjectId)).append("\n");
        sb.append("    migrationProjectName: ").append(toIndentedString(migrationProjectName)).append("\n");
        sb.append("    evaluationProjectId: ").append(toIndentedString(evaluationProjectId)).append("\n");
        sb.append("    evaluationProjectName: ").append(toIndentedString(evaluationProjectName)).append("\n");
        sb.append("    migrationProjectStatus: ").append(toIndentedString(migrationProjectStatus)).append("\n");
        sb.append("    permissionCheckStatus: ").append(toIndentedString(permissionCheckStatus)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
