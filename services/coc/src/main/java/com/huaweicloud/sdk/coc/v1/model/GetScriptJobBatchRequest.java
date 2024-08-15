package com.huaweicloud.sdk.coc.v1.model;

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
public class GetScriptJobBatchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_index")

    private Integer batchIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_uuid")

    private String executeUuid;

    /**
     * 实例执行状态 READY：待执行 PROCESSING：执行中 ABNORMAL：异常 CANCELED：已取消 FINISHED：成功
     */
    public static final class StatusEnum {

        /**
         * Enum READY for value: "READY"
         */
        public static final StatusEnum READY = new StatusEnum("READY");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final StatusEnum PROCESSING = new StatusEnum("PROCESSING");

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final StatusEnum ABNORMAL = new StatusEnum("ABNORMAL");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StatusEnum CANCELED = new StatusEnum("CANCELED");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final StatusEnum FINISHED = new StatusEnum("FINISHED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("READY", READY);
            map.put("PROCESSING", PROCESSING);
            map.put("ABNORMAL", ABNORMAL);
            map.put("CANCELED", CANCELED);
            map.put("FINISHED", FINISHED);
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
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private Long marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-project-id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-user-profile")

    private String xUserProfile;

    public GetScriptJobBatchRequest withBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
        return this;
    }

    /**
     * 批次index
     * minimum: 1
     * maximum: 20
     * @return batchIndex
     */
    public Integer getBatchIndex() {
        return batchIndex;
    }

    public void setBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
    }

    public GetScriptJobBatchRequest withExecuteUuid(String executeUuid) {
        this.executeUuid = executeUuid;
        return this;
    }

    /**
     * 脚本工单的执行Id，取自executeJobScript和ListJobScriptOrders返回体中
     * @return executeUuid
     */
    public String getExecuteUuid() {
        return executeUuid;
    }

    public void setExecuteUuid(String executeUuid) {
        this.executeUuid = executeUuid;
    }

    public GetScriptJobBatchRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 实例执行状态 READY：待执行 PROCESSING：执行中 ABNORMAL：异常 CANCELED：已取消 FINISHED：成功
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public GetScriptJobBatchRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页参数：每页返回记录个数限制
     * minimum: 1
     * maximum: 50
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public GetScriptJobBatchRequest withMarker(Long marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数：上一页最后一个记录id
     * minimum: 0
     * maximum: 2147483647
     * @return marker
     */
    public Long getMarker() {
        return marker;
    }

    public void setMarker(Long marker) {
        this.marker = marker;
    }

    public GetScriptJobBatchRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 国际化标记，zh-cn表示中文，en-us或不传表示英文
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public GetScriptJobBatchRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，一个项目对应一个region
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-project-id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public GetScriptJobBatchRequest withXUserProfile(String xUserProfile) {
        this.xUserProfile = xUserProfile;
        return this;
    }

    /**
     * IAM5.0用户信息
     * @return xUserProfile
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-user-profile")
    public String getXUserProfile() {
        return xUserProfile;
    }

    public void setXUserProfile(String xUserProfile) {
        this.xUserProfile = xUserProfile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetScriptJobBatchRequest that = (GetScriptJobBatchRequest) obj;
        return Objects.equals(this.batchIndex, that.batchIndex) && Objects.equals(this.executeUuid, that.executeUuid)
            && Objects.equals(this.status, that.status) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.xUserProfile, that.xUserProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIndex, executeUuid, status, limit, marker, xLanguage, xProjectId, xUserProfile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetScriptJobBatchRequest {\n");
        sb.append("    batchIndex: ").append(toIndentedString(batchIndex)).append("\n");
        sb.append("    executeUuid: ").append(toIndentedString(executeUuid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    xUserProfile: ").append(toIndentedString(xUserProfile)).append("\n");
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
