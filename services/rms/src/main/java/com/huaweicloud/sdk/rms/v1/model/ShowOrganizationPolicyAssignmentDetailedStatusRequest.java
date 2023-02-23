package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowOrganizationPolicyAssignmentDetailedStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignment_name")

    private String organizationPolicyAssignmentName;

    /**
     * 成员帐号规则部署状态，区分大小写。
     */
    public static final class StatusEnum {

        /**
         * Enum CREATE_SUCCESSFUL for value: "CREATE_SUCCESSFUL"
         */
        public static final StatusEnum CREATE_SUCCESSFUL = new StatusEnum("CREATE_SUCCESSFUL");

        /**
         * Enum CREATE_IN_PROGRESS for value: "CREATE_IN_PROGRESS"
         */
        public static final StatusEnum CREATE_IN_PROGRESS = new StatusEnum("CREATE_IN_PROGRESS");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum DELETE_SUCCESSFUL for value: "DELETE_SUCCESSFUL"
         */
        public static final StatusEnum DELETE_SUCCESSFUL = new StatusEnum("DELETE_SUCCESSFUL");

        /**
         * Enum DELETE_IN_PROGRESS for value: "DELETE_IN_PROGRESS"
         */
        public static final StatusEnum DELETE_IN_PROGRESS = new StatusEnum("DELETE_IN_PROGRESS");

        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final StatusEnum DELETE_FAILED = new StatusEnum("DELETE_FAILED");

        /**
         * Enum UPDATE_SUCCESSFUL for value: "UPDATE_SUCCESSFUL"
         */
        public static final StatusEnum UPDATE_SUCCESSFUL = new StatusEnum("UPDATE_SUCCESSFUL");

        /**
         * Enum UPDATE_IN_PROGRESS for value: "UPDATE_IN_PROGRESS"
         */
        public static final StatusEnum UPDATE_IN_PROGRESS = new StatusEnum("UPDATE_IN_PROGRESS");

        /**
         * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
         */
        public static final StatusEnum UPDATE_FAILED = new StatusEnum("UPDATE_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATE_SUCCESSFUL", CREATE_SUCCESSFUL);
            map.put("CREATE_IN_PROGRESS", CREATE_IN_PROGRESS);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("DELETE_SUCCESSFUL", DELETE_SUCCESSFUL);
            map.put("DELETE_IN_PROGRESS", DELETE_IN_PROGRESS);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("UPDATE_SUCCESSFUL", UPDATE_SUCCESSFUL);
            map.put("UPDATE_IN_PROGRESS", UPDATE_IN_PROGRESS);
            map.put("UPDATE_FAILED", UPDATE_FAILED);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ShowOrganizationPolicyAssignmentDetailedStatusRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织ID。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public ShowOrganizationPolicyAssignmentDetailedStatusRequest withOrganizationPolicyAssignmentName(
        String organizationPolicyAssignmentName) {
        this.organizationPolicyAssignmentName = organizationPolicyAssignmentName;
        return this;
    }

    /**
     * 组织合规规则名称。
     * @return organizationPolicyAssignmentName
     */
    public String getOrganizationPolicyAssignmentName() {
        return organizationPolicyAssignmentName;
    }

    public void setOrganizationPolicyAssignmentName(String organizationPolicyAssignmentName) {
        this.organizationPolicyAssignmentName = organizationPolicyAssignmentName;
    }

    public ShowOrganizationPolicyAssignmentDetailedStatusRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 成员帐号规则部署状态，区分大小写。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowOrganizationPolicyAssignmentDetailedStatusRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的返回数量
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowOrganizationPolicyAssignmentDetailedStatusRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOrganizationPolicyAssignmentDetailedStatusRequest showOrganizationPolicyAssignmentDetailedStatusRequest =
            (ShowOrganizationPolicyAssignmentDetailedStatusRequest) o;
        return Objects.equals(this.organizationId, showOrganizationPolicyAssignmentDetailedStatusRequest.organizationId)
            && Objects.equals(this.organizationPolicyAssignmentName,
                showOrganizationPolicyAssignmentDetailedStatusRequest.organizationPolicyAssignmentName)
            && Objects.equals(this.status, showOrganizationPolicyAssignmentDetailedStatusRequest.status)
            && Objects.equals(this.limit, showOrganizationPolicyAssignmentDetailedStatusRequest.limit)
            && Objects.equals(this.marker, showOrganizationPolicyAssignmentDetailedStatusRequest.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, organizationPolicyAssignmentName, status, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrganizationPolicyAssignmentDetailedStatusRequest {\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    organizationPolicyAssignmentName: ")
            .append(toIndentedString(organizationPolicyAssignmentName))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
