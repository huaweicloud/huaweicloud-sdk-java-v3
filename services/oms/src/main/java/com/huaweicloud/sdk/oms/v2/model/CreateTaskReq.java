package com.huaweicloud.sdk.oms.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.oms.v2.model.BandwidthPolicyDto;
import com.huaweicloud.sdk.oms.v2.model.DstNodeReq;
import com.huaweicloud.sdk.oms.v2.model.SmnConfig;
import com.huaweicloud.sdk.oms.v2.model.SourceCdnReq;
import com.huaweicloud.sdk.oms.v2.model.SrcNodeReq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateTaskReq  {

    /**
     * 任务类型，默认为object。  list：对象列表迁移 url_list：URL列表迁移 object：文件/文件夹迁移，默认 prefix：对象前缀迁移
     */
    public static final class TaskTypeEnum {

        
        /**
         * Enum LIST for value: "list"
         */
        public static final TaskTypeEnum LIST = new TaskTypeEnum("list");
        
        /**
         * Enum URL_LIST for value: "url_list"
         */
        public static final TaskTypeEnum URL_LIST = new TaskTypeEnum("url_list");
        
        /**
         * Enum OBJECT for value: "object"
         */
        public static final TaskTypeEnum OBJECT = new TaskTypeEnum("object");
        
        /**
         * Enum PREFIX for value: "prefix"
         */
        public static final TaskTypeEnum PREFIX = new TaskTypeEnum("prefix");
        

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("list", LIST);
            map.put("url_list", URL_LIST);
            map.put("object", OBJECT);
            map.put("prefix", PREFIX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TaskTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskTypeEnum(value);
            }
            return result;
        }

        public static TaskTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_type")
    
    private TaskTypeEnum taskType = TaskTypeEnum.OBJECT;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="src_node")
    
    private SrcNodeReq srcNode = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dst_node")
    
    private DstNodeReq dstNode = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_kms")
    
    private Boolean enableKms = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migrate_since")
    
    private Long migrateSince = 0l;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_policy")
    
    private List<BandwidthPolicyDto> bandwidthPolicy = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_cdn")
    
    private SourceCdnReq sourceCdn = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_config")
    
    private SmnConfig smnConfig = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_restore")
    
    private Boolean enableRestore = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_failed_object_recording")
    
    private Boolean enableFailedObjectRecording = true;

    public CreateTaskReq withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    


    /**
     * 任务类型，默认为object。  list：对象列表迁移 url_list：URL列表迁移 object：文件/文件夹迁移，默认 prefix：对象前缀迁移
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public CreateTaskReq withSrcNode(SrcNodeReq srcNode) {
        this.srcNode = srcNode;
        return this;
    }

    public CreateTaskReq withSrcNode(Consumer<SrcNodeReq> srcNodeSetter) {
        if(this.srcNode == null ){
            this.srcNode = new SrcNodeReq();
            srcNodeSetter.accept(this.srcNode);
        }
        
        return this;
    }


    /**
     * Get srcNode
     * @return srcNode
     */
    public SrcNodeReq getSrcNode() {
        return srcNode;
    }

    public void setSrcNode(SrcNodeReq srcNode) {
        this.srcNode = srcNode;
    }

    public CreateTaskReq withDstNode(DstNodeReq dstNode) {
        this.dstNode = dstNode;
        return this;
    }

    public CreateTaskReq withDstNode(Consumer<DstNodeReq> dstNodeSetter) {
        if(this.dstNode == null ){
            this.dstNode = new DstNodeReq();
            dstNodeSetter.accept(this.dstNode);
        }
        
        return this;
    }


    /**
     * Get dstNode
     * @return dstNode
     */
    public DstNodeReq getDstNode() {
        return dstNode;
    }

    public void setDstNode(DstNodeReq dstNode) {
        this.dstNode = dstNode;
    }

    public CreateTaskReq withEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
        return this;
    }

    


    /**
     * 是否开启KMS加密，默认不开启。
     * @return enableKms
     */
    public Boolean getEnableKms() {
        return enableKms;
    }

    public void setEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
    }

    public CreateTaskReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 任务描述，不能超过255个字符，且不能包含^<>&\"'等特殊字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTaskReq withMigrateSince(Long migrateSince) {
        this.migrateSince = migrateSince;
        return this;
    }

    


    /**
     * 以时间戳方式表示的迁移指定时间（单位：秒），表示仅迁移在指定时间之后修改的源端待迁移对象。默认不设置迁移指定时间。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return migrateSince
     */
    public Long getMigrateSince() {
        return migrateSince;
    }

    public void setMigrateSince(Long migrateSince) {
        this.migrateSince = migrateSince;
    }

    public CreateTaskReq withBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
        return this;
    }

    
    public CreateTaskReq addBandwidthPolicyItem(BandwidthPolicyDto bandwidthPolicyItem) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        this.bandwidthPolicy.add(bandwidthPolicyItem);
        return this;
    }

    public CreateTaskReq withBandwidthPolicy(Consumer<List<BandwidthPolicyDto>> bandwidthPolicySetter) {
        if(this.bandwidthPolicy == null ){
            this.bandwidthPolicy = new ArrayList<>();
        }
        bandwidthPolicySetter.accept(this.bandwidthPolicy);
        return this;
    }

    /**
     * 配置流量控制策略。数组中一个元素对应一个时段的最大带宽，最多允许5个时段，且时段不能重叠。
     * @return bandwidthPolicy
     */
    public List<BandwidthPolicyDto> getBandwidthPolicy() {
        return bandwidthPolicy;
    }

    public void setBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
    }

    public CreateTaskReq withSourceCdn(SourceCdnReq sourceCdn) {
        this.sourceCdn = sourceCdn;
        return this;
    }

    public CreateTaskReq withSourceCdn(Consumer<SourceCdnReq> sourceCdnSetter) {
        if(this.sourceCdn == null ){
            this.sourceCdn = new SourceCdnReq();
            sourceCdnSetter.accept(this.sourceCdn);
        }
        
        return this;
    }


    /**
     * Get sourceCdn
     * @return sourceCdn
     */
    public SourceCdnReq getSourceCdn() {
        return sourceCdn;
    }

    public void setSourceCdn(SourceCdnReq sourceCdn) {
        this.sourceCdn = sourceCdn;
    }

    public CreateTaskReq withSmnConfig(SmnConfig smnConfig) {
        this.smnConfig = smnConfig;
        return this;
    }

    public CreateTaskReq withSmnConfig(Consumer<SmnConfig> smnConfigSetter) {
        if(this.smnConfig == null ){
            this.smnConfig = new SmnConfig();
            smnConfigSetter.accept(this.smnConfig);
        }
        
        return this;
    }


    /**
     * Get smnConfig
     * @return smnConfig
     */
    public SmnConfig getSmnConfig() {
        return smnConfig;
    }

    public void setSmnConfig(SmnConfig smnConfig) {
        this.smnConfig = smnConfig;
    }

    public CreateTaskReq withEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
        return this;
    }

    


    /**
     * 是否自动解冻归档数据，默认否。  开启后，如果遇到归档类型数据，会自动解冻再进行迁移。
     * @return enableRestore
     */
    public Boolean getEnableRestore() {
        return enableRestore;
    }

    public void setEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
    }

    public CreateTaskReq withEnableFailedObjectRecording(Boolean enableFailedObjectRecording) {
        this.enableFailedObjectRecording = enableFailedObjectRecording;
        return this;
    }

    


    /**
     * 是否记录失败对象，默认开启。  开启后，如果有迁移失败对象，会在目的端存储失败对象信息。
     * @return enableFailedObjectRecording
     */
    public Boolean getEnableFailedObjectRecording() {
        return enableFailedObjectRecording;
    }

    public void setEnableFailedObjectRecording(Boolean enableFailedObjectRecording) {
        this.enableFailedObjectRecording = enableFailedObjectRecording;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTaskReq createTaskReq = (CreateTaskReq) o;
        return Objects.equals(this.taskType, createTaskReq.taskType) &&
            Objects.equals(this.srcNode, createTaskReq.srcNode) &&
            Objects.equals(this.dstNode, createTaskReq.dstNode) &&
            Objects.equals(this.enableKms, createTaskReq.enableKms) &&
            Objects.equals(this.description, createTaskReq.description) &&
            Objects.equals(this.migrateSince, createTaskReq.migrateSince) &&
            Objects.equals(this.bandwidthPolicy, createTaskReq.bandwidthPolicy) &&
            Objects.equals(this.sourceCdn, createTaskReq.sourceCdn) &&
            Objects.equals(this.smnConfig, createTaskReq.smnConfig) &&
            Objects.equals(this.enableRestore, createTaskReq.enableRestore) &&
            Objects.equals(this.enableFailedObjectRecording, createTaskReq.enableFailedObjectRecording);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskType, srcNode, dstNode, enableKms, description, migrateSince, bandwidthPolicy, sourceCdn, smnConfig, enableRestore, enableFailedObjectRecording);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTaskReq {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    srcNode: ").append(toIndentedString(srcNode)).append("\n");
        sb.append("    dstNode: ").append(toIndentedString(dstNode)).append("\n");
        sb.append("    enableKms: ").append(toIndentedString(enableKms)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    migrateSince: ").append(toIndentedString(migrateSince)).append("\n");
        sb.append("    bandwidthPolicy: ").append(toIndentedString(bandwidthPolicy)).append("\n");
        sb.append("    sourceCdn: ").append(toIndentedString(sourceCdn)).append("\n");
        sb.append("    smnConfig: ").append(toIndentedString(smnConfig)).append("\n");
        sb.append("    enableRestore: ").append(toIndentedString(enableRestore)).append("\n");
        sb.append("    enableFailedObjectRecording: ").append(toIndentedString(enableFailedObjectRecording)).append("\n");
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

