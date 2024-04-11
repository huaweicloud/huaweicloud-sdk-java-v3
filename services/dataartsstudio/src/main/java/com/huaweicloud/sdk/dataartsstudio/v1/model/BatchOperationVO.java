package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * BatchOperationVO
 */
public class BatchOperationVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Long groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_name")

    private String bizName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private Long bizId;

    /**
     * 操作结果类型枚举。RUNNING(运行中)、SUCCESS(操作成功)、FAILED(操作失败)。
     */
    public static final class OperationStatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final OperationStatusEnum RUNNING = new OperationStatusEnum("RUNNING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final OperationStatusEnum SUCCESS = new OperationStatusEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final OperationStatusEnum FAILED = new OperationStatusEnum("FAILED");

        private static final Map<String, OperationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationStatusEnum> createStaticFields() {
            Map<String, OperationStatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationStatusEnum(String value) {
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
        public static OperationStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationStatusEnum(value));
        }

        public static OperationStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationStatusEnum) {
                return this.value.equals(((OperationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_status")

    private OperationStatusEnum operationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_info")

    private String bizInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private Integer failed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate")

    private String rate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private String logs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<BatchOperationVO> groups = null;

    public BatchOperationVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 批量审批ID。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BatchOperationVO withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public BatchOperationVO withGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组ID。
     * @return groupId
     */
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public BatchOperationVO withBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }

    /**
     * 业务名。
     * @return bizName
     */
    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public BatchOperationVO withBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 业务ID。
     * @return bizId
     */
    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public BatchOperationVO withOperationStatus(OperationStatusEnum operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     * 操作结果类型枚举。RUNNING(运行中)、SUCCESS(操作成功)、FAILED(操作失败)。
     * @return operationStatus
     */
    public OperationStatusEnum getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatusEnum operationStatus) {
        this.operationStatus = operationStatus;
    }

    public BatchOperationVO withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 类型。
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public BatchOperationVO withBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }

    /**
     * 业务详情。
     * @return bizInfo
     */
    public String getBizInfo() {
        return bizInfo;
    }

    public void setBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
    }

    public BatchOperationVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public BatchOperationVO withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * remark信息。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BatchOperationVO withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public BatchOperationVO withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * 成功个数。
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public BatchOperationVO withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * 失败个数。
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public BatchOperationVO withRate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * 当前进度。
     * @return rate
     */
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public BatchOperationVO withLogs(String logs) {
        this.logs = logs;
        return this;
    }

    /**
     * 日志。
     * @return logs
     */
    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    public BatchOperationVO withGroups(List<BatchOperationVO> groups) {
        this.groups = groups;
        return this;
    }

    public BatchOperationVO addGroupsItem(BatchOperationVO groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public BatchOperationVO withGroups(Consumer<List<BatchOperationVO>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 分组信息。
     * @return groups
     */
    public List<BatchOperationVO> getGroups() {
        return groups;
    }

    public void setGroups(List<BatchOperationVO> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchOperationVO that = (BatchOperationVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.bizName, that.bizName)
            && Objects.equals(this.bizId, that.bizId) && Objects.equals(this.operationStatus, that.operationStatus)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.bizInfo, that.bizInfo)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.total, that.total) && Objects.equals(this.success, that.success)
            && Objects.equals(this.failed, that.failed) && Objects.equals(this.rate, that.rate)
            && Objects.equals(this.logs, that.logs) && Objects.equals(this.groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            groupId,
            bizName,
            bizId,
            operationStatus,
            operationType,
            bizInfo,
            createBy,
            remark,
            total,
            success,
            failed,
            rate,
            logs,
            groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchOperationVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    bizName: ").append(toIndentedString(bizName)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    bizInfo: ").append(toIndentedString(bizInfo)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
