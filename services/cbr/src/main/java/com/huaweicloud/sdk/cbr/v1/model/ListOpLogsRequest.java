package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListOpLogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    /**
     * 任务类型
     */
    public static final class OperationTypeEnum {

        /**
         * Enum BACKUP for value: "backup"
         */
        public static final OperationTypeEnum BACKUP = new OperationTypeEnum("backup");

        /**
         * Enum COPY for value: "copy"
         */
        public static final OperationTypeEnum COPY = new OperationTypeEnum("copy");

        /**
         * Enum REPLICATION for value: "replication"
         */
        public static final OperationTypeEnum REPLICATION = new OperationTypeEnum("replication");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final OperationTypeEnum DELETE = new OperationTypeEnum("delete");

        /**
         * Enum RESTORE for value: "restore"
         */
        public static final OperationTypeEnum RESTORE = new OperationTypeEnum("restore");

        /**
         * Enum VAULT_DELETE for value: "vault_delete"
         */
        public static final OperationTypeEnum VAULT_DELETE = new OperationTypeEnum("vault_delete");

        /**
         * Enum REMOVE_RESOURCE for value: "remove_resource"
         */
        public static final OperationTypeEnum REMOVE_RESOURCE = new OperationTypeEnum("remove_resource");

        /**
         * Enum SYNC for value: "sync"
         */
        public static final OperationTypeEnum SYNC = new OperationTypeEnum("sync");

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("copy", COPY);
            map.put("replication", REPLICATION);
            map.put("delete", DELETE);
            map.put("restore", RESTORE);
            map.put("vault_delete", VAULT_DELETE);
            map.put("remove_resource", REMOVE_RESOURCE);
            map.put("sync", SYNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationTypeEnum(value);
            }
            return result;
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    @JacksonXmlProperty(localName = "operation_type")

    private OperationTypeEnum operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    @JacksonXmlProperty(localName = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    @JacksonXmlProperty(localName = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    @JacksonXmlProperty(localName = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    /**
     * 任务状态
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum SKIPPED for value: "skipped"
         */
        public static final StatusEnum SKIPPED = new StatusEnum("skipped");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum TIMEOUT for value: "timeout"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("timeout");

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final StatusEnum WAITING = new StatusEnum("waiting");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("skipped", SKIPPED);
            map.put("failed", FAILED);
            map.put("running", RUNNING);
            map.put("timeout", TIMEOUT);
            map.put("waiting", WAITING);
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

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    @JacksonXmlProperty(localName = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_name")

    @JacksonXmlProperty(localName = "vault_name")

    private String vaultName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListOpLogsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间，格式为%YYYY-%mm-%ddT%HH:%MM:%SSZ，例如2018-02-01T12:00:00Z
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListOpLogsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，正整数
     * minimum: 1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListOpLogsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移值，正整数
     * minimum: 1
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListOpLogsRequest withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 任务类型
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public ListOpLogsRequest withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 备份提供商ID
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public ListOpLogsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 该任务操作的资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListOpLogsRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 该任务操作的资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListOpLogsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始时间，格式为%YYYY-%mm-%ddT%HH:%MM:%SSZ，例如2018-01-01T12:00:00Z
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListOpLogsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListOpLogsRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 存储库ID,该任务操作的资源所属绑定的存储库。
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public ListOpLogsRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * 存储库名称，该任务操作资源所绑定的存储库名称。
     * @return vaultName
     */
    public String getVaultName() {
        return vaultName;
    }

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    public ListOpLogsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id或all_granted_eps，all_granted_eps表示查询用户有权限的所有企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOpLogsRequest listOpLogsRequest = (ListOpLogsRequest) o;
        return Objects.equals(this.endTime, listOpLogsRequest.endTime)
            && Objects.equals(this.limit, listOpLogsRequest.limit)
            && Objects.equals(this.offset, listOpLogsRequest.offset)
            && Objects.equals(this.operationType, listOpLogsRequest.operationType)
            && Objects.equals(this.providerId, listOpLogsRequest.providerId)
            && Objects.equals(this.resourceId, listOpLogsRequest.resourceId)
            && Objects.equals(this.resourceName, listOpLogsRequest.resourceName)
            && Objects.equals(this.startTime, listOpLogsRequest.startTime)
            && Objects.equals(this.status, listOpLogsRequest.status)
            && Objects.equals(this.vaultId, listOpLogsRequest.vaultId)
            && Objects.equals(this.vaultName, listOpLogsRequest.vaultName)
            && Objects.equals(this.enterpriseProjectId, listOpLogsRequest.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime,
            limit,
            offset,
            operationType,
            providerId,
            resourceId,
            resourceName,
            startTime,
            status,
            vaultId,
            vaultName,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpLogsRequest {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    vaultName: ").append(toIndentedString(vaultName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
