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
public class ShowConfigurationAggregatorSourcesStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_id")

    private String aggregatorId;

    /**
     * 聚合帐号的状态。
     */
    public static final class UpdateStatusEnum {

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final UpdateStatusEnum SUCCEEDED = new UpdateStatusEnum("SUCCEEDED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final UpdateStatusEnum FAILED = new UpdateStatusEnum("FAILED");

        /**
         * Enum OUTDATED for value: "OUTDATED"
         */
        public static final UpdateStatusEnum OUTDATED = new UpdateStatusEnum("OUTDATED");

        private static final Map<String, UpdateStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpdateStatusEnum> createStaticFields() {
            Map<String, UpdateStatusEnum> map = new HashMap<>();
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("FAILED", FAILED);
            map.put("OUTDATED", OUTDATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UpdateStatusEnum(String value) {
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
        public static UpdateStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpdateStatusEnum(value));
        }

        public static UpdateStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpdateStatusEnum) {
                return this.value.equals(((UpdateStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_status")

    private UpdateStatusEnum updateStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ShowConfigurationAggregatorSourcesStatusRequest withAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }

    /**
     * 资源聚合器ID。
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return aggregatorId;
    }

    public void setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
    }

    public ShowConfigurationAggregatorSourcesStatusRequest withUpdateStatus(UpdateStatusEnum updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }

    /**
     * 聚合帐号的状态。
     * @return updateStatus
     */
    public UpdateStatusEnum getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(UpdateStatusEnum updateStatus) {
        this.updateStatus = updateStatus;
    }

    public ShowConfigurationAggregatorSourcesStatusRequest withLimit(Integer limit) {
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

    public ShowConfigurationAggregatorSourcesStatusRequest withMarker(String marker) {
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
        ShowConfigurationAggregatorSourcesStatusRequest that = (ShowConfigurationAggregatorSourcesStatusRequest) obj;
        return Objects.equals(this.aggregatorId, that.aggregatorId)
            && Objects.equals(this.updateStatus, that.updateStatus) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatorId, updateStatus, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConfigurationAggregatorSourcesStatusRequest {\n");
        sb.append("    aggregatorId: ").append(toIndentedString(aggregatorId)).append("\n");
        sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
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
