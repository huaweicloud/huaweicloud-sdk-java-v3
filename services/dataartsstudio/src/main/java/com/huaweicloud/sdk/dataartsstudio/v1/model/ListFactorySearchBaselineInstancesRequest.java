package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListFactorySearchBaselineInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_name")

    private String baselineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    /**
     * 基线类型，DAY天基线，HOUR小时基线，默认查询所有基线类型。
     */
    public static final class TypeEnum {

        /**
         * Enum DAY for value: "DAY"
         */
        public static final TypeEnum DAY = new TypeEnum("DAY");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final TypeEnum HOUR = new TypeEnum("HOUR");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DAY", DAY);
            map.put("HOUR", HOUR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    /**
     * 状态： - ERROR：异常 - SAFE：安全 - DANGEROUS：预警 - OVER：破线 默认查询所有状态。
     */
    public static final class StatusEnum {

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum SAFE for value: "SAFE"
         */
        public static final StatusEnum SAFE = new StatusEnum("SAFE");

        /**
         * Enum DANGEROUS for value: "DANGEROUS"
         */
        public static final StatusEnum DANGEROUS = new StatusEnum("DANGEROUS");

        /**
         * Enum OVER for value: "OVER"
         */
        public static final StatusEnum OVER = new StatusEnum("OVER");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ERROR", ERROR);
            map.put("SAFE", SAFE);
            map.put("DANGEROUS", DANGEROUS);
            map.put("OVER", OVER);
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

    /**
     * 完成状态：UNFINISH未完成，FINISH完成，默认查询所有状态。
     */
    public static final class FinishStatusEnum {

        /**
         * Enum UNFINISH for value: "UNFINISH"
         */
        public static final FinishStatusEnum UNFINISH = new FinishStatusEnum("UNFINISH");

        /**
         * Enum FINISH for value: "FINISH"
         */
        public static final FinishStatusEnum FINISH = new FinishStatusEnum("FINISH");

        private static final Map<String, FinishStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FinishStatusEnum> createStaticFields() {
            Map<String, FinishStatusEnum> map = new HashMap<>();
            map.put("UNFINISH", UNFINISH);
            map.put("FINISH", FINISH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FinishStatusEnum(String value) {
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
        public static FinishStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FinishStatusEnum(value));
        }

        public static FinishStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FinishStatusEnum) {
                return this.value.equals(((FinishStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_status")

    private FinishStatusEnum finishStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListFactorySearchBaselineInstancesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DataArts Studio实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListFactorySearchBaselineInstancesRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见[项目ID和账号ID](projectid_accountid.xml)。  多project场景采用AK/SK认证的接口请求，则该字段必选。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ListFactorySearchBaselineInstancesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListFactorySearchBaselineInstancesRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListFactorySearchBaselineInstancesRequest withBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }

    /**
     * 基线任务名称。
     * @return baselineName
     */
    public String getBaselineName() {
        return baselineName;
    }

    public void setBaselineName(String baselineName) {
        this.baselineName = baselineName;
    }

    public ListFactorySearchBaselineInstancesRequest withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 责任人。
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ListFactorySearchBaselineInstancesRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 基线类型，DAY天基线，HOUR小时基线，默认查询所有基线类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListFactorySearchBaselineInstancesRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级，取值有1/2/3/4/5，默认查询所有优先级。当同时查询优先级为1/2/3时，样例如下：priority=1&priority=2&priority=3
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ListFactorySearchBaselineInstancesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态： - ERROR：异常 - SAFE：安全 - DANGEROUS：预警 - OVER：破线 默认查询所有状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListFactorySearchBaselineInstancesRequest withFinishStatus(FinishStatusEnum finishStatus) {
        this.finishStatus = finishStatus;
        return this;
    }

    /**
     * 完成状态：UNFINISH未完成，FINISH完成，默认查询所有状态。
     * @return finishStatus
     */
    public FinishStatusEnum getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(FinishStatusEnum finishStatus) {
        this.finishStatus = finishStatus;
    }

    public ListFactorySearchBaselineInstancesRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间戳，用于检索基线任务实例的承诺时间，单位毫秒。默认为当天0点0分0秒，当end_time有值时，该值不能为空。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListFactorySearchBaselineInstancesRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 终止时间戳，用于检索基线任务实例的承诺时间，单位毫秒。默认为当天23点59分59秒，当start_time有值时，该值不能为空，最大查询范围为180天。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListFactorySearchBaselineInstancesRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序规则，示例 start_time_ms asc，表示按照开始时间升序排序，有如下取值： - start_time_ms asc：按照开始时间升序。 - start_time_ms desc：按照开始时间降序。 - end_time_ms asc：按照结束时间升序。 - end_time_ms desc：按照结束时间降序。 默认不排序。
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListFactorySearchBaselineInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页列表的页数，默认值为1。取值范围大于等于1。
     * minimum: 1
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFactorySearchBaselineInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页返回结果，指定每页最大记录数。范围[1,100] 默认值：10
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactorySearchBaselineInstancesRequest that = (ListFactorySearchBaselineInstancesRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.workspace, that.workspace) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.baselineName, that.baselineName) && Objects.equals(this.ownerName, that.ownerName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.status, that.status) && Objects.equals(this.finishStatus, that.finishStatus)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            xProjectId,
            workspace,
            workspaceId,
            baselineName,
            ownerName,
            type,
            priority,
            status,
            finishStatus,
            startTime,
            endTime,
            orderBy,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactorySearchBaselineInstancesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    baselineName: ").append(toIndentedString(baselineName)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    finishStatus: ").append(toIndentedString(finishStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
