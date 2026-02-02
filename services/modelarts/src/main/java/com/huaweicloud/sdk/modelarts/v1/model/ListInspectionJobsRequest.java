package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListInspectionJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释**：巡检类型。 **约束限制**：不涉及。 **取值范围**：   - STANDARD：标准巡检   - DEEP：深度巡检 **默认取值**：不涉及。 
     */
    public static final class InspectionTypeEnum {

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final InspectionTypeEnum STANDARD = new InspectionTypeEnum("STANDARD");

        /**
         * Enum DEEP for value: "DEEP"
         */
        public static final InspectionTypeEnum DEEP = new InspectionTypeEnum("DEEP");

        private static final Map<String, InspectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InspectionTypeEnum> createStaticFields() {
            Map<String, InspectionTypeEnum> map = new HashMap<>();
            map.put("STANDARD", STANDARD);
            map.put("DEEP", DEEP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InspectionTypeEnum(String value) {
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
        public static InspectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InspectionTypeEnum(value));
        }

        public static InspectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InspectionTypeEnum) {
                return this.value.equals(((InspectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_type")

    private InspectionTypeEnum inspectionType;

    /**
     * **参数解释**：作业状态。 **约束限制**：不涉及。 **取值范围**：   - CREATING：创建中   - CREATE_FAILED: 创建失败   - PENDING：排队中   - RUNNING：运行中   - FAILED：作业失败   - SUCCEEDED：作业成功   - TIMEOUT：作业超时   - TERMINATING：终止中   - TERMINATED：作业终止 **默认取值**：不涉及。 
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final StatusEnum PENDING = new StatusEnum("PENDING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");

        /**
         * Enum TIMEOUT for value: "TIMEOUT"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("TIMEOUT");

        /**
         * Enum TERMINATING for value: "TERMINATING"
         */
        public static final StatusEnum TERMINATING = new StatusEnum("TERMINATING");

        /**
         * Enum TERMINATED for value: "TERMINATED"
         */
        public static final StatusEnum TERMINATED = new StatusEnum("TERMINATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("PENDING", PENDING);
            map.put("RUNNING", RUNNING);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("TIMEOUT", TIMEOUT);
            map.put("TERMINATING", TERMINATING);
            map.put("TERMINATED", TERMINATED);
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
     * **参数解释**：结果。 **约束限制**：不涉及。 **取值范围**：   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     */
    public static final class ResultStatusEnum {

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final ResultStatusEnum ABNORMAL = new ResultStatusEnum("ABNORMAL");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final ResultStatusEnum NORMAL = new ResultStatusEnum("NORMAL");

        private static final Map<String, ResultStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultStatusEnum> createStaticFields() {
            Map<String, ResultStatusEnum> map = new HashMap<>();
            map.put("ABNORMAL", ABNORMAL);
            map.put("NORMAL", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultStatusEnum(String value) {
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
        public static ResultStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultStatusEnum(value));
        }

        public static ResultStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultStatusEnum) {
                return this.value.equals(((ResultStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_status")

    private ResultStatusEnum resultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_start_time")

    private String createStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_end_time")

    private String createEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_start_time")

    private String updateStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_end_time")

    private String updateEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    /**
     * **参数解释**：ModelArts产品形态。 **约束限制**：不涉及。 **取值范围**：   - LITE-CLUSTER：ModelArts Lite-Cluster   - LITE-SERVER：ModelArts Lite-Server **默认取值**：不涉及。 
     */
    public static final class ModelartsOfferingTypeEnum {

        /**
         * Enum LITE_CLUSTER for value: "LITE-CLUSTER"
         */
        public static final ModelartsOfferingTypeEnum LITE_CLUSTER = new ModelartsOfferingTypeEnum("LITE-CLUSTER");

        /**
         * Enum LITE_SERVER for value: "LITE-SERVER"
         */
        public static final ModelartsOfferingTypeEnum LITE_SERVER = new ModelartsOfferingTypeEnum("LITE-SERVER");

        private static final Map<String, ModelartsOfferingTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelartsOfferingTypeEnum> createStaticFields() {
            Map<String, ModelartsOfferingTypeEnum> map = new HashMap<>();
            map.put("LITE-CLUSTER", LITE_CLUSTER);
            map.put("LITE-SERVER", LITE_SERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelartsOfferingTypeEnum(String value) {
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
        public static ModelartsOfferingTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelartsOfferingTypeEnum(value));
        }

        public static ModelartsOfferingTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelartsOfferingTypeEnum) {
                return this.value.equals(((ModelartsOfferingTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modelarts_offering_type")

    private ModelartsOfferingTypeEnum modelartsOfferingType;

    /**
     * **参数解释**：诊断对象。 **约束限制**：不涉及。 **取值范围**：   - TENANT_POOL：资源池   - LITE_SERVER_SINGLE：轻量算力节点——单节点   - LITE_SERVER_SUPER：轻量算力节点——超节点 **默认取值**：不涉及。 
     */
    public static final class DiagnosisObjectEnum {

        /**
         * Enum TENANT_POOL for value: "TENANT_POOL"
         */
        public static final DiagnosisObjectEnum TENANT_POOL = new DiagnosisObjectEnum("TENANT_POOL");

        /**
         * Enum LITE_SERVER_SINGLE for value: "LITE_SERVER_SINGLE"
         */
        public static final DiagnosisObjectEnum LITE_SERVER_SINGLE = new DiagnosisObjectEnum("LITE_SERVER_SINGLE");

        /**
         * Enum LITE_SERVER_SUPER for value: "LITE_SERVER_SUPER"
         */
        public static final DiagnosisObjectEnum LITE_SERVER_SUPER = new DiagnosisObjectEnum("LITE_SERVER_SUPER");

        private static final Map<String, DiagnosisObjectEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DiagnosisObjectEnum> createStaticFields() {
            Map<String, DiagnosisObjectEnum> map = new HashMap<>();
            map.put("TENANT_POOL", TENANT_POOL);
            map.put("LITE_SERVER_SINGLE", LITE_SERVER_SINGLE);
            map.put("LITE_SERVER_SUPER", LITE_SERVER_SUPER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DiagnosisObjectEnum(String value) {
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
        public static DiagnosisObjectEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DiagnosisObjectEnum(value));
        }

        public static DiagnosisObjectEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DiagnosisObjectEnum) {
                return this.value.equals(((DiagnosisObjectEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_object")

    private DiagnosisObjectEnum diagnosisObject;

    public ListInspectionJobsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：作业ID，支持模糊查询。 **约束限制**：不涉及。  **取值范围**：只允许输入长度为1到36位由数字、英文、下划线（_）或中划线（-）组成的字符，且开头和结尾不能有空格。  **默认取值**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListInspectionJobsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：巡检作业名称，支持模糊查询。 **约束限制**：不涉及。 **取值范围**：只允许输入长度为 1 到 64 位由数字、中文、英文、下划线（_）或中划线（-）组成的字符。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInspectionJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：偏移量，表示从此偏移量开始查询。 **约束限制**：不涉及。 **取值范围**：[0,1000000000]。 **默认取值**：0。 
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListInspectionJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：指定每一页返回的最大条目数。 **约束限制**：不涉及。 **取值范围**：[1,100]。 **默认取值**：10。 
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

    public ListInspectionJobsRequest withInspectionType(InspectionTypeEnum inspectionType) {
        this.inspectionType = inspectionType;
        return this;
    }

    /**
     * **参数解释**：巡检类型。 **约束限制**：不涉及。 **取值范围**：   - STANDARD：标准巡检   - DEEP：深度巡检 **默认取值**：不涉及。 
     * @return inspectionType
     */
    public InspectionTypeEnum getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(InspectionTypeEnum inspectionType) {
        this.inspectionType = inspectionType;
    }

    public ListInspectionJobsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：作业状态。 **约束限制**：不涉及。 **取值范围**：   - CREATING：创建中   - CREATE_FAILED: 创建失败   - PENDING：排队中   - RUNNING：运行中   - FAILED：作业失败   - SUCCEEDED：作业成功   - TIMEOUT：作业超时   - TERMINATING：终止中   - TERMINATED：作业终止 **默认取值**：不涉及。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListInspectionJobsRequest withResultStatus(ResultStatusEnum resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * **参数解释**：结果。 **约束限制**：不涉及。 **取值范围**：   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     * @return resultStatus
     */
    public ResultStatusEnum getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(ResultStatusEnum resultStatus) {
        this.resultStatus = resultStatus;
    }

    public ListInspectionJobsRequest withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**：创建者。 **约束限制**：不涉及。 **取值范围**：长度为[0,50]的字符串。 **默认取值**：不涉及。 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListInspectionJobsRequest withCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }

    /**
     * **参数解释**：创建开始时间。 **约束限制**：可以与QueryCreateEndTime配合使用从而限定一个具体的时间范围。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
    }

    public ListInspectionJobsRequest withCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }

    /**
     * **参数解释**：创建结束时间。 **约束限制**：可以与QueryCreateStartTime配合使用从而限定一个具体的时间范围。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
    }

    public ListInspectionJobsRequest withUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }

    /**
     * **参数解释**：更新开始时间。 **约束限制**：可以与QueryUpdateEndTime配合使用从而限定一个具体的时间范围。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return updateStartTime
     */
    public String getUpdateStartTime() {
        return updateStartTime;
    }

    public void setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    public ListInspectionJobsRequest withUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }

    /**
     * **参数解释**：更新结束时间。 **约束限制**：可以与QueryUpdateStartTime配合使用从而限定一个具体的时间范围。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return updateEndTime
     */
    public String getUpdateEndTime() {
        return updateEndTime;
    }

    public void setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
    }

    public ListInspectionJobsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。 **约束限制**：不涉及。 **取值范围**：0或长度为32的字符串。 **默认取值**：0。 
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListInspectionJobsRequest withModelartsOfferingType(ModelartsOfferingTypeEnum modelartsOfferingType) {
        this.modelartsOfferingType = modelartsOfferingType;
        return this;
    }

    /**
     * **参数解释**：ModelArts产品形态。 **约束限制**：不涉及。 **取值范围**：   - LITE-CLUSTER：ModelArts Lite-Cluster   - LITE-SERVER：ModelArts Lite-Server **默认取值**：不涉及。 
     * @return modelartsOfferingType
     */
    public ModelartsOfferingTypeEnum getModelartsOfferingType() {
        return modelartsOfferingType;
    }

    public void setModelartsOfferingType(ModelartsOfferingTypeEnum modelartsOfferingType) {
        this.modelartsOfferingType = modelartsOfferingType;
    }

    public ListInspectionJobsRequest withDiagnosisObject(DiagnosisObjectEnum diagnosisObject) {
        this.diagnosisObject = diagnosisObject;
        return this;
    }

    /**
     * **参数解释**：诊断对象。 **约束限制**：不涉及。 **取值范围**：   - TENANT_POOL：资源池   - LITE_SERVER_SINGLE：轻量算力节点——单节点   - LITE_SERVER_SUPER：轻量算力节点——超节点 **默认取值**：不涉及。 
     * @return diagnosisObject
     */
    public DiagnosisObjectEnum getDiagnosisObject() {
        return diagnosisObject;
    }

    public void setDiagnosisObject(DiagnosisObjectEnum diagnosisObject) {
        this.diagnosisObject = diagnosisObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInspectionJobsRequest that = (ListInspectionJobsRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.inspectionType, that.inspectionType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.resultStatus, that.resultStatus) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.createStartTime, that.createStartTime)
            && Objects.equals(this.createEndTime, that.createEndTime)
            && Objects.equals(this.updateStartTime, that.updateStartTime)
            && Objects.equals(this.updateEndTime, that.updateEndTime)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.modelartsOfferingType, that.modelartsOfferingType)
            && Objects.equals(this.diagnosisObject, that.diagnosisObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            offset,
            limit,
            inspectionType,
            status,
            resultStatus,
            creator,
            createStartTime,
            createEndTime,
            updateStartTime,
            updateEndTime,
            workspaceId,
            modelartsOfferingType,
            diagnosisObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInspectionJobsRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    inspectionType: ").append(toIndentedString(inspectionType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
        sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
        sb.append("    updateStartTime: ").append(toIndentedString(updateStartTime)).append("\n");
        sb.append("    updateEndTime: ").append(toIndentedString(updateEndTime)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    modelartsOfferingType: ").append(toIndentedString(modelartsOfferingType)).append("\n");
        sb.append("    diagnosisObject: ").append(toIndentedString(diagnosisObject)).append("\n");
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
