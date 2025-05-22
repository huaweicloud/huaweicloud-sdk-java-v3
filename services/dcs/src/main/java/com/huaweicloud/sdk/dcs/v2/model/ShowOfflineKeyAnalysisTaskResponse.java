package com.huaweicloud.sdk.dcs.v2.model;

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
public class ShowOfflineKeyAnalysisTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ip")

    private String nodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ipv6")

    private String nodeIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    /**
     * **参数解释**： 分析类型。 **取值范围**： new_backup：新建备份并分析。 old_backup：历史备份文件分析。 
     */
    public static final class AnalysisTypeEnum {

        /**
         * Enum NEW_BACKUP for value: "new_backup"
         */
        public static final AnalysisTypeEnum NEW_BACKUP = new AnalysisTypeEnum("new_backup");

        /**
         * Enum OLD_BACKUP for value: "old_backup"
         */
        public static final AnalysisTypeEnum OLD_BACKUP = new AnalysisTypeEnum("old_backup");

        private static final Map<String, AnalysisTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AnalysisTypeEnum> createStaticFields() {
            Map<String, AnalysisTypeEnum> map = new HashMap<>();
            map.put("new_backup", NEW_BACKUP);
            map.put("old_backup", OLD_BACKUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AnalysisTypeEnum(String value) {
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
        public static AnalysisTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AnalysisTypeEnum(value));
        }

        public static AnalysisTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AnalysisTypeEnum) {
                return this.value.equals(((AnalysisTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_type")

    private AnalysisTypeEnum analysisType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started_at")

    private String startedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_at")

    private String finishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "largest_key_prefixes")

    private List<LargestKeyPrefix> largestKeyPrefixes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "largest_keys")

    private List<LargestKey> largestKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_bytes")

    private Integer totalBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_bytes")

    private List<KeyTypeByte> typeBytes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_num")

    private List<KeyTypeNum> typeNum = null;

    public ShowOfflineKeyAnalysisTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 任务执行记录ID（此ID对应“查询离线全量key分析详情”参数中的任务ID）。 **取值范围**： 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowOfflineKeyAnalysisTaskResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。 **取值范围**： 不涉及。 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowOfflineKeyAnalysisTaskResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**： 节点ID。 **取值范围**： 不涉及。 
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ShowOfflineKeyAnalysisTaskResponse withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * **参数解释**： 备份ID。 **取值范围**： 不涉及。 
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public ShowOfflineKeyAnalysisTaskResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 分片名称。 **取值范围**： 不涉及。 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowOfflineKeyAnalysisTaskResponse withNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * **参数解释**： 节点ipv4地址。 **取值范围**： 不涉及。 
     * @return nodeIp
     */
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public ShowOfflineKeyAnalysisTaskResponse withNodeIpv6(String nodeIpv6) {
        this.nodeIpv6 = nodeIpv6;
        return this;
    }

    /**
     * **参数解释**： 节点ipv6地址。 **取值范围**： 不涉及。 
     * @return nodeIpv6
     */
    public String getNodeIpv6() {
        return nodeIpv6;
    }

    public void setNodeIpv6(String nodeIpv6) {
        this.nodeIpv6 = nodeIpv6;
    }

    public ShowOfflineKeyAnalysisTaskResponse withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * **参数解释**： 节点类型。 **取值范围**： master：主节点 slave：从节点 
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ShowOfflineKeyAnalysisTaskResponse withAnalysisType(AnalysisTypeEnum analysisType) {
        this.analysisType = analysisType;
        return this;
    }

    /**
     * **参数解释**： 分析类型。 **取值范围**： new_backup：新建备份并分析。 old_backup：历史备份文件分析。 
     * @return analysisType
     */
    public AnalysisTypeEnum getAnalysisType() {
        return analysisType;
    }

    public void setAnalysisType(AnalysisTypeEnum analysisType) {
        this.analysisType = analysisType;
    }

    public ShowOfflineKeyAnalysisTaskResponse withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * **参数解释**： 分析任务开始时间。 **取值范围**： 不涉及。 
     * @return startedAt
     */
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public ShowOfflineKeyAnalysisTaskResponse withFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * **参数解释**： 分析任务结束时间。 **取值范围**： 不涉及。 
     * @return finishedAt
     */
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public ShowOfflineKeyAnalysisTaskResponse withLargestKeyPrefixes(List<LargestKeyPrefix> largestKeyPrefixes) {
        this.largestKeyPrefixes = largestKeyPrefixes;
        return this;
    }

    public ShowOfflineKeyAnalysisTaskResponse addLargestKeyPrefixesItem(LargestKeyPrefix largestKeyPrefixesItem) {
        if (this.largestKeyPrefixes == null) {
            this.largestKeyPrefixes = new ArrayList<>();
        }
        this.largestKeyPrefixes.add(largestKeyPrefixesItem);
        return this;
    }

    public ShowOfflineKeyAnalysisTaskResponse withLargestKeyPrefixes(
        Consumer<List<LargestKeyPrefix>> largestKeyPrefixesSetter) {
        if (this.largestKeyPrefixes == null) {
            this.largestKeyPrefixes = new ArrayList<>();
        }
        largestKeyPrefixesSetter.accept(this.largestKeyPrefixes);
        return this;
    }

    /**
     * **参数解释**： 前缀Key列表。 
     * @return largestKeyPrefixes
     */
    public List<LargestKeyPrefix> getLargestKeyPrefixes() {
        return largestKeyPrefixes;
    }

    public void setLargestKeyPrefixes(List<LargestKeyPrefix> largestKeyPrefixes) {
        this.largestKeyPrefixes = largestKeyPrefixes;
    }

    public ShowOfflineKeyAnalysisTaskResponse withLargestKeys(List<LargestKey> largestKeys) {
        this.largestKeys = largestKeys;
        return this;
    }

    public ShowOfflineKeyAnalysisTaskResponse addLargestKeysItem(LargestKey largestKeysItem) {
        if (this.largestKeys == null) {
            this.largestKeys = new ArrayList<>();
        }
        this.largestKeys.add(largestKeysItem);
        return this;
    }

    public ShowOfflineKeyAnalysisTaskResponse withLargestKeys(Consumer<List<LargestKey>> largestKeysSetter) {
        if (this.largestKeys == null) {
            this.largestKeys = new ArrayList<>();
        }
        largestKeysSetter.accept(this.largestKeys);
        return this;
    }

    /**
     * **参数解释**： 大key列表。 
     * @return largestKeys
     */
    public List<LargestKey> getLargestKeys() {
        return largestKeys;
    }

    public void setLargestKeys(List<LargestKey> largestKeys) {
        this.largestKeys = largestKeys;
    }

    public ShowOfflineKeyAnalysisTaskResponse withTotalBytes(Integer totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }

    /**
     * **参数解释**： Key的总大小，单位：Bytes。 **取值范围**： 不涉及。 
     * @return totalBytes
     */
    public Integer getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(Integer totalBytes) {
        this.totalBytes = totalBytes;
    }

    public ShowOfflineKeyAnalysisTaskResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**： Key的总数。 **取值范围**： 不涉及。 
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ShowOfflineKeyAnalysisTaskResponse withTypeBytes(List<KeyTypeByte> typeBytes) {
        this.typeBytes = typeBytes;
        return this;
    }

    public ShowOfflineKeyAnalysisTaskResponse addTypeBytesItem(KeyTypeByte typeBytesItem) {
        if (this.typeBytes == null) {
            this.typeBytes = new ArrayList<>();
        }
        this.typeBytes.add(typeBytesItem);
        return this;
    }

    public ShowOfflineKeyAnalysisTaskResponse withTypeBytes(Consumer<List<KeyTypeByte>> typeBytesSetter) {
        if (this.typeBytes == null) {
            this.typeBytes = new ArrayList<>();
        }
        typeBytesSetter.accept(this.typeBytes);
        return this;
    }

    /**
     * **参数解释**： 每种类型key的总大小，单位：Bytes。 **取值范围**： 不涉及。 
     * @return typeBytes
     */
    public List<KeyTypeByte> getTypeBytes() {
        return typeBytes;
    }

    public void setTypeBytes(List<KeyTypeByte> typeBytes) {
        this.typeBytes = typeBytes;
    }

    public ShowOfflineKeyAnalysisTaskResponse withTypeNum(List<KeyTypeNum> typeNum) {
        this.typeNum = typeNum;
        return this;
    }

    public ShowOfflineKeyAnalysisTaskResponse addTypeNumItem(KeyTypeNum typeNumItem) {
        if (this.typeNum == null) {
            this.typeNum = new ArrayList<>();
        }
        this.typeNum.add(typeNumItem);
        return this;
    }

    public ShowOfflineKeyAnalysisTaskResponse withTypeNum(Consumer<List<KeyTypeNum>> typeNumSetter) {
        if (this.typeNum == null) {
            this.typeNum = new ArrayList<>();
        }
        typeNumSetter.accept(this.typeNum);
        return this;
    }

    /**
     * **参数解释**： 每种类型key总数。 **取值范围**： 不涉及。 
     * @return typeNum
     */
    public List<KeyTypeNum> getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(List<KeyTypeNum> typeNum) {
        this.typeNum = typeNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOfflineKeyAnalysisTaskResponse that = (ShowOfflineKeyAnalysisTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.backupId, that.backupId)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.nodeIp, that.nodeIp)
            && Objects.equals(this.nodeIpv6, that.nodeIpv6) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.analysisType, that.analysisType) && Objects.equals(this.startedAt, that.startedAt)
            && Objects.equals(this.finishedAt, that.finishedAt)
            && Objects.equals(this.largestKeyPrefixes, that.largestKeyPrefixes)
            && Objects.equals(this.largestKeys, that.largestKeys) && Objects.equals(this.totalBytes, that.totalBytes)
            && Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.typeBytes, that.typeBytes)
            && Objects.equals(this.typeNum, that.typeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instanceId,
            nodeId,
            backupId,
            groupName,
            nodeIp,
            nodeIpv6,
            nodeType,
            analysisType,
            startedAt,
            finishedAt,
            largestKeyPrefixes,
            largestKeys,
            totalBytes,
            totalNum,
            typeBytes,
            typeNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOfflineKeyAnalysisTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
        sb.append("    nodeIpv6: ").append(toIndentedString(nodeIpv6)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    analysisType: ").append(toIndentedString(analysisType)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    largestKeyPrefixes: ").append(toIndentedString(largestKeyPrefixes)).append("\n");
        sb.append("    largestKeys: ").append(toIndentedString(largestKeys)).append("\n");
        sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    typeBytes: ").append(toIndentedString(typeBytes)).append("\n");
        sb.append("    typeNum: ").append(toIndentedString(typeNum)).append("\n");
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
