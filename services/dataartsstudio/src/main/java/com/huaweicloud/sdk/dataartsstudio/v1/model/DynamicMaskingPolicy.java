package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DynamicMaskingPolicy
 */
public class DynamicMaskingPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_set_id")

    private String policySetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private String algorithmType;

    /**
     * 同步状态： - UNKNOWN 未知状态 - NOT_SYNC 未同步 - SYNCING 同步中 - SYNC_SUCCESS 同步成功 - SYNC_FAIL 同步失败 - SYNC_PARTIAL_FAIL 存在失败 - DELETE_FAIL 删除失败 - DELETING 删除中 - UPDATING 更新中 - DATA_UPDATED 数据存在更新
     */
    public static final class SyncStatusEnum {

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final SyncStatusEnum UNKNOWN = new SyncStatusEnum("UNKNOWN");

        /**
         * Enum NOT_SYNC for value: "NOT_SYNC"
         */
        public static final SyncStatusEnum NOT_SYNC = new SyncStatusEnum("NOT_SYNC");

        /**
         * Enum SYNCING for value: "SYNCING"
         */
        public static final SyncStatusEnum SYNCING = new SyncStatusEnum("SYNCING");

        /**
         * Enum SYNC_SUCCESS for value: "SYNC_SUCCESS"
         */
        public static final SyncStatusEnum SYNC_SUCCESS = new SyncStatusEnum("SYNC_SUCCESS");

        /**
         * Enum SYNC_FAIL for value: "SYNC_FAIL"
         */
        public static final SyncStatusEnum SYNC_FAIL = new SyncStatusEnum("SYNC_FAIL");

        /**
         * Enum SYNC_PARTIAL_FAIL for value: "SYNC_PARTIAL_FAIL"
         */
        public static final SyncStatusEnum SYNC_PARTIAL_FAIL = new SyncStatusEnum("SYNC_PARTIAL_FAIL");

        /**
         * Enum DELETE_FAIL for value: "DELETE_FAIL"
         */
        public static final SyncStatusEnum DELETE_FAIL = new SyncStatusEnum("DELETE_FAIL");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final SyncStatusEnum DELETING = new SyncStatusEnum("DELETING");

        /**
         * Enum UPDATING for value: "UPDATING"
         */
        public static final SyncStatusEnum UPDATING = new SyncStatusEnum("UPDATING");

        /**
         * Enum DATA_UPDATED for value: "DATA_UPDATED"
         */
        public static final SyncStatusEnum DATA_UPDATED = new SyncStatusEnum("DATA_UPDATED");

        private static final Map<String, SyncStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncStatusEnum> createStaticFields() {
            Map<String, SyncStatusEnum> map = new HashMap<>();
            map.put("UNKNOWN", UNKNOWN);
            map.put("NOT_SYNC", NOT_SYNC);
            map.put("SYNCING", SYNCING);
            map.put("SYNC_SUCCESS", SYNC_SUCCESS);
            map.put("SYNC_FAIL", SYNC_FAIL);
            map.put("SYNC_PARTIAL_FAIL", SYNC_PARTIAL_FAIL);
            map.put("DELETE_FAIL", DELETE_FAIL);
            map.put("DELETING", DELETING);
            map.put("UPDATING", UPDATING);
            map.put("DATA_UPDATED", DATA_UPDATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SyncStatusEnum(String value) {
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
        public static SyncStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SyncStatusEnum(value));
        }

        public static SyncStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SyncStatusEnum) {
                return this.value.equals(((SyncStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_status")

    private SyncStatusEnum syncStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_detail")

    private String algorithmDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_detail_dto")

    private AlgorithmDetailDTO algorithmDetailDto;

    public DynamicMaskingPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 字段脱敏策略id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DynamicMaskingPolicy withPolicySetId(String policySetId) {
        this.policySetId = policySetId;
        return this;
    }

    /**
     * 动态脱敏策略id。
     * @return policySetId
     */
    public String getPolicySetId() {
        return policySetId;
    }

    public void setPolicySetId(String policySetId) {
        this.policySetId = policySetId;
    }

    public DynamicMaskingPolicy withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 数据表中的字段名称。
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public DynamicMaskingPolicy withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 数据表中字段的数据类型。
     * @return columnType
     */
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public DynamicMaskingPolicy withAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 具体动态脱敏规则参数介绍请参见[动态脱敏规则介绍](dataartsstudio_01_1036.html)。 HIVE数据源动态脱敏算法 - MASK 掩盖英文字符和数字 - MASK_SHOW_LAST_4 保留后四位 - MASK_SHOW_FIRST_4 保留前四位 - MASK_HASH 哈希掩盖 - MASK_DATE_SHOW_YEAR 掩盖月份和日期 - MASK_NULL NULL掩盖  DWS数据源动态脱敏算法 - DWS_ALL_MASK 全掩码 - DWS_BACK_KEEP 保留后4位，其余脱敏为* - DWS_FRONT_KEEP 保留前2位，其余脱敏为* - DWS_SELF_CONFIG 需要输入开始位置、结束位置、脱敏字符传入detail结构体中，例如{\"start\": 1, \"end\": 2, \"string_target\": \"*\"}  [DLI数据源动态脱敏算法](tag:nohcs) - [MASK 掩盖英文字符和数字](tag:nohcs) - [MASK_SHOW_LAST_4 保留后四位](tag:nohcs) - [MASK_SHOW_FIRST_4 保留前四位](tag:nohcs) - [MASK_HASH 哈希掩盖](tag:nohcs) - [MASK_DATE_SHOW_YEAR 掩盖月份和日期](tag:nohcs) - [MASK_NULL NULL掩盖](tag:nohcs)
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
    }

    public DynamicMaskingPolicy withSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * 同步状态： - UNKNOWN 未知状态 - NOT_SYNC 未同步 - SYNCING 同步中 - SYNC_SUCCESS 同步成功 - SYNC_FAIL 同步失败 - SYNC_PARTIAL_FAIL 存在失败 - DELETE_FAIL 删除失败 - DELETING 删除中 - UPDATING 更新中 - DATA_UPDATED 数据存在更新
     * @return syncStatus
     */
    public SyncStatusEnum getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
    }

    public DynamicMaskingPolicy withAlgorithmDetail(String algorithmDetail) {
        this.algorithmDetail = algorithmDetail;
        return this;
    }

    /**
     * 动态脱敏策略算法详情。
     * @return algorithmDetail
     */
    public String getAlgorithmDetail() {
        return algorithmDetail;
    }

    public void setAlgorithmDetail(String algorithmDetail) {
        this.algorithmDetail = algorithmDetail;
    }

    public DynamicMaskingPolicy withAlgorithmDetailDto(AlgorithmDetailDTO algorithmDetailDto) {
        this.algorithmDetailDto = algorithmDetailDto;
        return this;
    }

    public DynamicMaskingPolicy withAlgorithmDetailDto(Consumer<AlgorithmDetailDTO> algorithmDetailDtoSetter) {
        if (this.algorithmDetailDto == null) {
            this.algorithmDetailDto = new AlgorithmDetailDTO();
            algorithmDetailDtoSetter.accept(this.algorithmDetailDto);
        }

        return this;
    }

    /**
     * Get algorithmDetailDto
     * @return algorithmDetailDto
     */
    public AlgorithmDetailDTO getAlgorithmDetailDto() {
        return algorithmDetailDto;
    }

    public void setAlgorithmDetailDto(AlgorithmDetailDTO algorithmDetailDto) {
        this.algorithmDetailDto = algorithmDetailDto;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DynamicMaskingPolicy that = (DynamicMaskingPolicy) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.policySetId, that.policySetId)
            && Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnType, that.columnType)
            && Objects.equals(this.algorithmType, that.algorithmType)
            && Objects.equals(this.syncStatus, that.syncStatus)
            && Objects.equals(this.algorithmDetail, that.algorithmDetail)
            && Objects.equals(this.algorithmDetailDto, that.algorithmDetailDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            policySetId,
            columnName,
            columnType,
            algorithmType,
            syncStatus,
            algorithmDetail,
            algorithmDetailDto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicMaskingPolicy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policySetId: ").append(toIndentedString(policySetId)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    algorithmDetail: ").append(toIndentedString(algorithmDetail)).append("\n");
        sb.append("    algorithmDetailDto: ").append(toIndentedString(algorithmDetailDto)).append("\n");
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
