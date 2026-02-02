package com.huaweicloud.sdk.modelarts.v1.model;

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
public class AcceptScheduledEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * **参数解释**：事件分类。 **取值范围**：可选值如下： - hardware：硬件维修。 - software：软件维修。
     */
    public static final class CatalogEnum {

        /**
         * Enum SOFTWARE for value: "software"
         */
        public static final CatalogEnum SOFTWARE = new CatalogEnum("software");

        /**
         * Enum HARDWARE for value: "hardware"
         */
        public static final CatalogEnum HARDWARE = new CatalogEnum("hardware");

        private static final Map<String, CatalogEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CatalogEnum> createStaticFields() {
            Map<String, CatalogEnum> map = new HashMap<>();
            map.put("software", SOFTWARE);
            map.put("hardware", HARDWARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CatalogEnum(String value) {
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
        public static CatalogEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CatalogEnum(value));
        }

        public static CatalogEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CatalogEnum) {
                return this.value.equals(((CatalogEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog")

    private CatalogEnum catalog;

    /**
     * **参数解释**：事件类型。 **取值范围**：可选值如下： - system-maintenance：系统维护 - localdisk-recovery：本地盘恢复 - node_reboot：节点重启 - operation-request：运维授权 - node_maintenance：超节点维护 - node_redeploy：超节点重部署 - node_localdisk_recovery 超节点本地盘恢复。
     */
    public static final class TypeEnum {

        /**
         * Enum SYSTEM_MAINTENANCE for value: "system-maintenance"
         */
        public static final TypeEnum SYSTEM_MAINTENANCE = new TypeEnum("system-maintenance");

        /**
         * Enum LOCALDISK_RECOVERY for value: "localdisk-recovery"
         */
        public static final TypeEnum LOCALDISK_RECOVERY = new TypeEnum("localdisk-recovery");

        /**
         * Enum NODE_REBOOT for value: "node_reboot"
         */
        public static final TypeEnum NODE_REBOOT = new TypeEnum("node_reboot");

        /**
         * Enum OPERATION_REQUEST for value: "operation-request"
         */
        public static final TypeEnum OPERATION_REQUEST = new TypeEnum("operation-request");

        /**
         * Enum NODE_MAINTENANCE for value: "node_maintenance"
         */
        public static final TypeEnum NODE_MAINTENANCE = new TypeEnum("node_maintenance");

        /**
         * Enum NODE_REDEPLOY for value: "node_redeploy"
         */
        public static final TypeEnum NODE_REDEPLOY = new TypeEnum("node_redeploy");

        /**
         * Enum NODE_LOCALDISK_RECOVERY for value: "node_localdisk_recovery"
         */
        public static final TypeEnum NODE_LOCALDISK_RECOVERY = new TypeEnum("node_localdisk_recovery");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("system-maintenance", SYSTEM_MAINTENANCE);
            map.put("localdisk-recovery", LOCALDISK_RECOVERY);
            map.put("node_reboot", NODE_REBOOT);
            map.put("operation-request", OPERATION_REQUEST);
            map.put("node_maintenance", NODE_MAINTENANCE);
            map.put("node_redeploy", NODE_REDEPLOY);
            map.put("node_localdisk_recovery", NODE_LOCALDISK_RECOVERY);
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
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释**：事件状态。 **取值范围**：可选择值如下： - inquiring: 待授权, - scheduled: 待执行, - executing: 执行中, - completed: 执行成功 - failed: 执行失败 - canceled: 取消
     */
    public static final class StateEnum {

        /**
         * Enum INQUIRING for value: "inquiring"
         */
        public static final StateEnum INQUIRING = new StateEnum("inquiring");

        /**
         * Enum SCHEDULED for value: "scheduled"
         */
        public static final StateEnum SCHEDULED = new StateEnum("scheduled");

        /**
         * Enum EXECUTING for value: "executing"
         */
        public static final StateEnum EXECUTING = new StateEnum("executing");

        /**
         * Enum COMPLETED for value: "completed"
         */
        public static final StateEnum COMPLETED = new StateEnum("completed");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StateEnum FAILED = new StateEnum("failed");

        /**
         * Enum CANCELED for value: "canceled"
         */
        public static final StateEnum CANCELED = new StateEnum("canceled");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("inquiring", INQUIRING);
            map.put("scheduled", SCHEDULED);
            map.put("executing", EXECUTING);
            map.put("completed", COMPLETED);
            map.put("failed", FAILED);
            map.put("canceled", CANCELED);
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

    /**
     * **参数解释**：节点类型归属。 **取值范围**可选择值如下： - devserver：lite-server节点  - lite-cluster lite池  - standard 标准池
     */
    public static final class InstanceTypeEnum {

        /**
         * Enum DEVSERVER for value: "devserver"
         */
        public static final InstanceTypeEnum DEVSERVER = new InstanceTypeEnum("devserver");

        /**
         * Enum LITE_CLUSTER for value: "lite-cluster"
         */
        public static final InstanceTypeEnum LITE_CLUSTER = new InstanceTypeEnum("lite-cluster");

        /**
         * Enum STANDARD for value: "standard"
         */
        public static final InstanceTypeEnum STANDARD = new InstanceTypeEnum("standard");

        private static final Map<String, InstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceTypeEnum> createStaticFields() {
            Map<String, InstanceTypeEnum> map = new HashMap<>();
            map.put("devserver", DEVSERVER);
            map.put("lite-cluster", LITE_CLUSTER);
            map.put("standard", STANDARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceTypeEnum(String value) {
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
        public static InstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceTypeEnum(value));
        }

        public static InstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceTypeEnum) {
                return this.value.equals(((InstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceType")

    private InstanceTypeEnum instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceId")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeName")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poolName")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poolDisplayName")

    private String poolDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publishTime")

    private String publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finishTime")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notBefore")

    private String notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "probeMsg")

    private String probeMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redeployType")

    private List<String> redeployType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public AcceptScheduledEventResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：计划事件ID，取值查询计划事件列表接口的event_id字段。 系统自动生成，只能以小写字母开头，数字、中划线组成，不能以中划线结尾，长度小于63。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AcceptScheduledEventResponse withCatalog(CatalogEnum catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * **参数解释**：事件分类。 **取值范围**：可选值如下： - hardware：硬件维修。 - software：软件维修。
     * @return catalog
     */
    public CatalogEnum getCatalog() {
        return catalog;
    }

    public void setCatalog(CatalogEnum catalog) {
        this.catalog = catalog;
    }

    public AcceptScheduledEventResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：事件类型。 **取值范围**：可选值如下： - system-maintenance：系统维护 - localdisk-recovery：本地盘恢复 - node_reboot：节点重启 - operation-request：运维授权 - node_maintenance：超节点维护 - node_redeploy：超节点重部署 - node_localdisk_recovery 超节点本地盘恢复。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AcceptScheduledEventResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：对计划事件的描述信息。系统自动生成。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AcceptScheduledEventResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：事件状态。 **取值范围**：可选择值如下： - inquiring: 待授权, - scheduled: 待执行, - executing: 执行中, - completed: 执行成功 - failed: 执行失败 - canceled: 取消
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public AcceptScheduledEventResponse withInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * **参数解释**：节点类型归属。 **取值范围**可选择值如下： - devserver：lite-server节点  - lite-cluster lite池  - standard 标准池
     * @return instanceType
     */
    public InstanceTypeEnum getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
    }

    public AcceptScheduledEventResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：服务器ID。计算服务系统自动生成的实例ID，长度小于63。 **取值范围**：不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AcceptScheduledEventResponse withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**：节点名称，取值自节点详情的metadata.name字段。系统自动生成，只能以小写字母开头，数字、中划线组成，不能以中划线结尾，小于63个字符。 **取值范围**：不涉及。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public AcceptScheduledEventResponse withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池名称, lite-cluster、standard才具有，取值自资源池详情的metadata.name字段。系统自动生成，只能以小写字母开头，数字、中划线组成，不能以中划线结尾，小于63个字符。 **取值范围**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public AcceptScheduledEventResponse withPoolDisplayName(String poolDisplayName) {
        this.poolDisplayName = poolDisplayName;
        return this;
    }

    /**
     * **参数解释**：资源池对外显示的名称, lite-cluster、standard才具有，取值自资源池详情的metadata.name字段。只能以小写字母开头，数字、中划线组成，不能以中划线结尾，且长度为[36-63]个字符。。 **取值范围**：不涉及。
     * @return poolDisplayName
     */
    public String getPoolDisplayName() {
        return poolDisplayName;
    }

    public void setPoolDisplayName(String poolDisplayName) {
        this.poolDisplayName = poolDisplayName;
    }

    public AcceptScheduledEventResponse withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * **参数解释**：事件发布时间。 **约束限制**：格式为UTC时间字符串：2025-09-15T07:02:30Z。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public AcceptScheduledEventResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：事件开始时间。 **约束限制**：格式为UTC时间字符串：2025-09-15T07:02:30Z。。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public AcceptScheduledEventResponse withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * **参数解释**：事件完成时间。 **约束限制**：格式为UTC时间字符串：2025-09-15T07:02:30Z。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public AcceptScheduledEventResponse withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * **参数解释**：事件计划执行开始时间，格式为UTC时间字符串：2025-09-15T07:02:30Z。 **约束限制**：大于当前时间。 **取值范围**：不涉及。 **默认取值**：不填表示立即执行。
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    public AcceptScheduledEventResponse withProbeMsg(String probeMsg) {
        this.probeMsg = probeMsg;
        return this;
    }

    /**
     * **参数解释**：提示信息。 **约束限制**：系统自动生成，只能以小写字母开头，数字、中划线组成，不能以中划线结尾，长度小于63字符。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return probeMsg
     */
    public String getProbeMsg() {
        return probeMsg;
    }

    public void setProbeMsg(String probeMsg) {
        this.probeMsg = probeMsg;
    }

    public AcceptScheduledEventResponse withRedeployType(List<String> redeployType) {
        this.redeployType = redeployType;
        return this;
    }

    public AcceptScheduledEventResponse addRedeployTypeItem(String redeployTypeItem) {
        if (this.redeployType == null) {
            this.redeployType = new ArrayList<>();
        }
        this.redeployType.add(redeployTypeItem);
        return this;
    }

    public AcceptScheduledEventResponse withRedeployType(Consumer<List<String>> redeployTypeSetter) {
        if (this.redeployType == null) {
            this.redeployType = new ArrayList<>();
        }
        redeployTypeSetter.accept(this.redeployType);
        return this;
    }

    /**
     * **参数解释**：节点的重部署类型。 **约束限制**：不涉及。 **取值范围**：可选值如下：- HARD：表示支持强制重部署, - SOFT：表示支持重部署 **默认取值**：不涉及。
     * @return redeployType
     */
    public List<String> getRedeployType() {
        return redeployType;
    }

    public void setRedeployType(List<String> redeployType) {
        this.redeployType = redeployType;
    }

    public AcceptScheduledEventResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcceptScheduledEventResponse that = (AcceptScheduledEventResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.catalog, that.catalog)
            && Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.state, that.state) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.poolName, that.poolName)
            && Objects.equals(this.poolDisplayName, that.poolDisplayName)
            && Objects.equals(this.publishTime, that.publishTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.notBefore, that.notBefore)
            && Objects.equals(this.probeMsg, that.probeMsg) && Objects.equals(this.redeployType, that.redeployType)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            catalog,
            type,
            description,
            state,
            instanceType,
            instanceId,
            nodeName,
            poolName,
            poolDisplayName,
            publishTime,
            startTime,
            finishTime,
            notBefore,
            probeMsg,
            redeployType,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptScheduledEventResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    poolDisplayName: ").append(toIndentedString(poolDisplayName)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    probeMsg: ").append(toIndentedString(probeMsg)).append("\n");
        sb.append("    redeployType: ").append(toIndentedString(redeployType)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
