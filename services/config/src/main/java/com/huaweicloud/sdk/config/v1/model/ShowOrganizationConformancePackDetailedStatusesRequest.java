package com.huaweicloud.sdk.config.v1.model;

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
public class ShowOrganizationConformancePackDetailedStatusesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conformance_pack_name")

    private String conformancePackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_conformance_pack_id")

    private String organizationConformancePackId;

    /**
     * 部署状态，区分大小写
     */
    public static final class StateEnum {

        /**
         * Enum CREATE_SUCCESSFUL for value: "CREATE_SUCCESSFUL"
         */
        public static final StateEnum CREATE_SUCCESSFUL = new StateEnum("CREATE_SUCCESSFUL");

        /**
         * Enum CREATE_IN_PROGRESS for value: "CREATE_IN_PROGRESS"
         */
        public static final StateEnum CREATE_IN_PROGRESS = new StateEnum("CREATE_IN_PROGRESS");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StateEnum CREATE_FAILED = new StateEnum("CREATE_FAILED");

        /**
         * Enum DELETE_IN_PROGRESS for value: "DELETE_IN_PROGRESS"
         */
        public static final StateEnum DELETE_IN_PROGRESS = new StateEnum("DELETE_IN_PROGRESS");

        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final StateEnum DELETE_FAILED = new StateEnum("DELETE_FAILED");

        /**
         * Enum UPDATE_SUCCESSFUL for value: "UPDATE_SUCCESSFUL"
         */
        public static final StateEnum UPDATE_SUCCESSFUL = new StateEnum("UPDATE_SUCCESSFUL");

        /**
         * Enum UPDATE_IN_PROGRESS for value: "UPDATE_IN_PROGRESS"
         */
        public static final StateEnum UPDATE_IN_PROGRESS = new StateEnum("UPDATE_IN_PROGRESS");

        /**
         * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
         */
        public static final StateEnum UPDATE_FAILED = new StateEnum("UPDATE_FAILED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("CREATE_SUCCESSFUL", CREATE_SUCCESSFUL);
            map.put("CREATE_IN_PROGRESS", CREATE_IN_PROGRESS);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("DELETE_IN_PROGRESS", DELETE_IN_PROGRESS);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("UPDATE_SUCCESSFUL", UPDATE_SUCCESSFUL);
            map.put("UPDATE_IN_PROGRESS", UPDATE_IN_PROGRESS);
            map.put("UPDATE_FAILED", UPDATE_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ShowOrganizationConformancePackDetailedStatusesRequest withOrganizationId(String organizationId) {
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

    public ShowOrganizationConformancePackDetailedStatusesRequest withConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
        return this;
    }

    /**
     * 合规规则包名称。
     * @return conformancePackName
     */
    public String getConformancePackName() {
        return conformancePackName;
    }

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    public ShowOrganizationConformancePackDetailedStatusesRequest withOrganizationConformancePackId(
        String organizationConformancePackId) {
        this.organizationConformancePackId = organizationConformancePackId;
        return this;
    }

    /**
     * 组织合规规则包ID。
     * @return organizationConformancePackId
     */
    public String getOrganizationConformancePackId() {
        return organizationConformancePackId;
    }

    public void setOrganizationConformancePackId(String organizationConformancePackId) {
        this.organizationConformancePackId = organizationConformancePackId;
    }

    public ShowOrganizationConformancePackDetailedStatusesRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 部署状态，区分大小写
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowOrganizationConformancePackDetailedStatusesRequest withLimit(Integer limit) {
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

    public ShowOrganizationConformancePackDetailedStatusesRequest withMarker(String marker) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOrganizationConformancePackDetailedStatusesRequest that =
            (ShowOrganizationConformancePackDetailedStatusesRequest) obj;
        return Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.conformancePackName, that.conformancePackName)
            && Objects.equals(this.organizationConformancePackId, that.organizationConformancePackId)
            && Objects.equals(this.state, that.state) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, conformancePackName, organizationConformancePackId, state, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrganizationConformancePackDetailedStatusesRequest {\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    conformancePackName: ").append(toIndentedString(conformancePackName)).append("\n");
        sb.append("    organizationConformancePackId: ")
            .append(toIndentedString(organizationConformancePackId))
            .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
