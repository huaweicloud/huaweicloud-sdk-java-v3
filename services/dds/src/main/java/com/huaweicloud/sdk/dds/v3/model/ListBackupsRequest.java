package com.huaweicloud.sdk.dds.v3.model;

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
public class ListBackupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    /**
     * **参数解释：** 备份类型。 **约束限制：** 当该字段取值为“Incremental”时，实例ID必传。 **取值范围：** - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。 - 取值为“Incremental”，表示自动增量备份。 - 当该字段未传入值时，默认只查询所有的全量备份，包括自动全备备份和手动全量备份。当该字段取值为“Incremental”时，实例ID必传。  **默认取值：** 不涉及。
     */
    public static final class BackupTypeEnum {

        /**
         * Enum AUTO for value: "Auto"
         */
        public static final BackupTypeEnum AUTO = new BackupTypeEnum("Auto");

        /**
         * Enum MANUAL for value: "Manual"
         */
        public static final BackupTypeEnum MANUAL = new BackupTypeEnum("Manual");

        /**
         * Enum INCREMENTAL for value: "Incremental"
         */
        public static final BackupTypeEnum INCREMENTAL = new BackupTypeEnum("Incremental");

        private static final Map<String, BackupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupTypeEnum> createStaticFields() {
            Map<String, BackupTypeEnum> map = new HashMap<>();
            map.put("Auto", AUTO);
            map.put("Manual", MANUAL);
            map.put("Incremental", INCREMENTAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackupTypeEnum(String value) {
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
        public static BackupTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BackupTypeEnum(value));
        }

        public static BackupTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackupTypeEnum) {
                return this.value.equals(((BackupTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_type")

    private BackupTypeEnum backupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /**
     * **参数解释：** 实例模式。 **约束限制：** 不涉及。 **取值范围：** - Sharding - ReplicaSet - Single  **默认取值：** 不涉及。
     */
    public static final class ModeEnum {

        /**
         * Enum SHARDING for value: "Sharding"
         */
        public static final ModeEnum SHARDING = new ModeEnum("Sharding");

        /**
         * Enum REPLICASET for value: "ReplicaSet"
         */
        public static final ModeEnum REPLICASET = new ModeEnum("ReplicaSet");

        /**
         * Enum SINGLE for value: "Single"
         */
        public static final ModeEnum SINGLE = new ModeEnum("Single");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Sharding", SHARDING);
            map.put("ReplicaSet", REPLICASET);
            map.put("Single", SINGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_field")

    private String orderField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_rule")

    private String orderRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_status")

    private String backupStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_name")

    private String backupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_description")

    private String backupDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    public ListBackupsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释：** 实例ID，可以调用“查询实例列表和详情”接口获取。如果未申请实例，可以调用“创建实例”接口创建。如果instance_id以“”起始，表示按照“”后面的值模糊匹配，否则，按照实际填写的instance_id精确匹配查询。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListBackupsRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * **参数解释：** 备份ID。如果backup_id以“”起始，表示按照“”后面的值模糊匹配，否则，按照实际填写的backup_id精确匹配查询。 **约束限制：** 当该字段传入的备份ID归属为自动增量备份时，实例ID必传，且实例ID必须为精确匹配。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public ListBackupsRequest withBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * **参数解释：** 备份类型。 **约束限制：** 当该字段取值为“Incremental”时，实例ID必传。 **取值范围：** - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。 - 取值为“Incremental”，表示自动增量备份。 - 当该字段未传入值时，默认只查询所有的全量备份，包括自动全备备份和手动全量备份。当该字段取值为“Incremental”时，实例ID必传。  **默认取值：** 不涉及。
     * @return backupType
     */
    public BackupTypeEnum getBackupType() {
        return backupType;
    }

    public void setBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
    }

    public ListBackupsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 索引位置偏移量，表示从指定project ID下最新的备份创建时间开始，按时间的先后顺序偏移offset条数据后查询对应的备份信息。 **约束限制：** 不涉及。 **取值范围：** 大于或等于0。 **默认取值：** 0，表示从最新的备份创建时间对应的备份开始查询。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListBackupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 查询备份个数上限值。 **约束限制：** 不涉及。 **取值范围：** 1~100。 **默认取值：** 100。不传该参数时，默认查询前100条备份信息。
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

    public ListBackupsRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释：** 查询备份开始的时间，格式为“yyyy-mm-dd hh:mm:ss”。该时间为UTC时间。 **约束限制：** “end_time”有值时，“begin_time”必选。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListBackupsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 查询备份开始的结束时间，格式为“yyyy-mm-dd hh:mm:ss”。该时间为UTC时间。 **约束限制：** “begin_time”有值时，“end_time”必选。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListBackupsRequest withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释：** 实例模式。 **约束限制：** 不涉及。 **取值范围：** - Sharding - ReplicaSet - Single  **默认取值：** 不涉及。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public ListBackupsRequest withOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }

    /**
     * **参数解释：** 排序字段。 **约束限制：** “order_rule”有值时，“order_field”必选。 **取值范围：** - name，备份名称。 - instanceName，实例名称。 - type，备份类型。 - datastoreType，引擎类型。 - beginTime，开始时间。 - status，备份状态。  **默认取值：** 如果不传值，则默认根据备份开始时间，即响应参数的begin_time，倒序排序。
     * @return orderField
     */
    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public ListBackupsRequest withOrderRule(String orderRule) {
        this.orderRule = orderRule;
        return this;
    }

    /**
     * **参数解释：** 排序规则。 **约束限制：** “order_field”有值时，“order_rule”必选。 **取值范围：** - asc: 升序排序。 - desc: 降序排序。  **默认取值：** 如果不传值，则默认根据备份开始时间，即响应参数的begin_time，倒序排序。
     * @return orderRule
     */
    public String getOrderRule() {
        return orderRule;
    }

    public void setOrderRule(String orderRule) {
        this.orderRule = orderRule;
    }

    public ListBackupsRequest withBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }

    /**
     * **参数解释：** 备份状态。 **约束限制：** 不涉及。 **取值范围：** - COMPLETED - BUILDING - FAILED  **默认取值：** 不涉及。
     * @return backupStatus
     */
    public String getBackupStatus() {
        return backupStatus;
    }

    public void setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
    }

    public ListBackupsRequest withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * **参数解释：** 备份名称，支持模糊匹配。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return backupName
     */
    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    public ListBackupsRequest withBackupDescription(String backupDescription) {
        this.backupDescription = backupDescription;
        return this;
    }

    /**
     * **参数解释：** 备份描述，支持模糊匹配。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return backupDescription
     */
    public String getBackupDescription() {
        return backupDescription;
    }

    public void setBackupDescription(String backupDescription) {
        this.backupDescription = backupDescription;
    }

    public ListBackupsRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释：** 实例名称，支持模糊匹配。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBackupsRequest that = (ListBackupsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.backupId, that.backupId)
            && Objects.equals(this.backupType, that.backupType) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.orderField, that.orderField) && Objects.equals(this.orderRule, that.orderRule)
            && Objects.equals(this.backupStatus, that.backupStatus) && Objects.equals(this.backupName, that.backupName)
            && Objects.equals(this.backupDescription, that.backupDescription)
            && Objects.equals(this.instanceName, that.instanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            backupId,
            backupType,
            offset,
            limit,
            beginTime,
            endTime,
            mode,
            orderField,
            orderRule,
            backupStatus,
            backupName,
            backupDescription,
            instanceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
        sb.append("    orderRule: ").append(toIndentedString(orderRule)).append("\n");
        sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
        sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
        sb.append("    backupDescription: ").append(toIndentedString(backupDescription)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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
