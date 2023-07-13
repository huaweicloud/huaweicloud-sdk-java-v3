package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMigrateStatusResponse extends SdkResponse {

    /**
     * 租户迁移状态
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /**
         * Enum MIGRATING for value: "migrating"
         */
        public static final StatusEnum MIGRATING = new StatusEnum("migrating");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            map.put("migrating", MIGRATING);
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
    @JsonProperty(value = "project_status")

    private List<DomainMigrateProjectStatus> projectStatus = null;

    public ShowMigrateStatusResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 租户迁移状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowMigrateStatusResponse withProjectStatus(List<DomainMigrateProjectStatus> projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }

    public ShowMigrateStatusResponse addProjectStatusItem(DomainMigrateProjectStatus projectStatusItem) {
        if (this.projectStatus == null) {
            this.projectStatus = new ArrayList<>();
        }
        this.projectStatus.add(projectStatusItem);
        return this;
    }

    public ShowMigrateStatusResponse withProjectStatus(Consumer<List<DomainMigrateProjectStatus>> projectStatusSetter) {
        if (this.projectStatus == null) {
            this.projectStatus = new ArrayList<>();
        }
        projectStatusSetter.accept(this.projectStatus);
        return this;
    }

    /**
     * 项目迁移状态
     * @return projectStatus
     */
    public List<DomainMigrateProjectStatus> getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(List<DomainMigrateProjectStatus> projectStatus) {
        this.projectStatus = projectStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMigrateStatusResponse that = (ShowMigrateStatusResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.projectStatus, that.projectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, projectStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigrateStatusResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectStatus: ").append(toIndentedString(projectStatus)).append("\n");
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
