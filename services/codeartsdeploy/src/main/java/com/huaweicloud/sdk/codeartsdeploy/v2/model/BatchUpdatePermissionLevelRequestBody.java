package com.huaweicloud.sdk.codeartsdeploy.v2.model;

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
 * 批量配置应用下鉴权级别请求体
 */
public class BatchUpdatePermissionLevelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * 应用鉴权级别，instance：实例级；project：项目级
     */
    public static final class PermissionLevelEnum {

        /**
         * Enum PROJECT for value: "project"
         */
        public static final PermissionLevelEnum PROJECT = new PermissionLevelEnum("project");

        /**
         * Enum INSTANCE for value: "instance"
         */
        public static final PermissionLevelEnum INSTANCE = new PermissionLevelEnum("instance");

        private static final Map<String, PermissionLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionLevelEnum> createStaticFields() {
            Map<String, PermissionLevelEnum> map = new HashMap<>();
            map.put("project", PROJECT);
            map.put("instance", INSTANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionLevelEnum(String value) {
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
        public static PermissionLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionLevelEnum(value));
        }

        public static PermissionLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionLevelEnum) {
                return this.value.equals(((PermissionLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_level")

    private PermissionLevelEnum permissionLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_ids")

    private List<String> applicationIds = null;

    public BatchUpdatePermissionLevelRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BatchUpdatePermissionLevelRequestBody withPermissionLevel(PermissionLevelEnum permissionLevel) {
        this.permissionLevel = permissionLevel;
        return this;
    }

    /**
     * 应用鉴权级别，instance：实例级；project：项目级
     * @return permissionLevel
     */
    public PermissionLevelEnum getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(PermissionLevelEnum permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public BatchUpdatePermissionLevelRequestBody withApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }

    public BatchUpdatePermissionLevelRequestBody addApplicationIdsItem(String applicationIdsItem) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        this.applicationIds.add(applicationIdsItem);
        return this;
    }

    public BatchUpdatePermissionLevelRequestBody withApplicationIds(Consumer<List<String>> applicationIdsSetter) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        applicationIdsSetter.accept(this.applicationIds);
        return this;
    }

    /**
     * 应用id列表
     * @return applicationIds
     */
    public List<String> getApplicationIds() {
        return applicationIds;
    }

    public void setApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdatePermissionLevelRequestBody that = (BatchUpdatePermissionLevelRequestBody) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.permissionLevel, that.permissionLevel)
            && Objects.equals(this.applicationIds, that.applicationIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, permissionLevel, applicationIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePermissionLevelRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    permissionLevel: ").append(toIndentedString(permissionLevel)).append("\n");
        sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
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
