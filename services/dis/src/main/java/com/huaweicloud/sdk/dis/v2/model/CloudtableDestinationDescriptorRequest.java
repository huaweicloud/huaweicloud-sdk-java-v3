package com.huaweicloud.sdk.dis.v2.model;

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
 * 转储目的地为CloudTable的参数列表。
 */
public class CloudtableDestinationDescriptorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliver_time_interval")

    private Integer deliverTimeInterval;

    /**
     * 偏移量。  - LATEST：最大偏移量，即获取最新的数据。 - TRIM_HORIZON：最小偏移量，即读取最早的数据。
     */
    public static final class ConsumerStrategyEnum {

        /**
         * Enum LATEST for value: "LATEST"
         */
        public static final ConsumerStrategyEnum LATEST = new ConsumerStrategyEnum("LATEST");

        /**
         * Enum TRIM_HORIZON for value: "TRIM_HORIZON"
         */
        public static final ConsumerStrategyEnum TRIM_HORIZON = new ConsumerStrategyEnum("TRIM_HORIZON");

        private static final Map<String, ConsumerStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConsumerStrategyEnum> createStaticFields() {
            Map<String, ConsumerStrategyEnum> map = new HashMap<>();
            map.put("LATEST", LATEST);
            map.put("TRIM_HORIZON", TRIM_HORIZON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConsumerStrategyEnum(String value) {
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
        public static ConsumerStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConsumerStrategyEnum(value));
        }

        public static ConsumerStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConsumerStrategyEnum) {
                return this.value.equals(((ConsumerStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_strategy")

    private ConsumerStrategyEnum consumerStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudtable_cluster_name")

    private String cloudtableClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudtable_cluster_id")

    private String cloudtableClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudtable_table_name")

    private String cloudtableTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudtable_schema")

    private CloudtableSchema cloudtableSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opentsdb_schema")

    private List<OpenTSDBSchema> opentsdbSchema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudtable_row_key_delimiter")

    private String cloudtableRowKeyDelimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_backup_bucket_path")

    private String obsBackupBucketPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_file_prefix")

    private String backupFilePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_duration")

    private String retryDuration;

    public CloudtableDestinationDescriptorRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 转储任务的名称。  任务名称由英文字母、数字、中划线和下划线组成。长度为1～64个字符。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CloudtableDestinationDescriptorRequest withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 在统一身份认证服务(IAM)中创建委托的名称，DIS需要获取IAM委托信息去访问您指定的资源。创建委托的参数设置如下： - 委托类型：云服务 - 云服务：DIS - 持续时间：永久 - “所属区域”为“全局服务”，“项目”为“对象存储服务”对应的“策略”包含“Tenant Administrator”。 如果已经创建过委托，可以使用IAM服务提供的查询委托列表接口，获取有效可用的委托名称。 取值范围：长度不超过64位，且不可配置为空。  如果有在Console控制台使用转储任务，会提示自动创建委托，自动创建的委托名称为：dis_admin_agency
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CloudtableDestinationDescriptorRequest withDeliverTimeInterval(Integer deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
        return this;
    }

    /**
     * 根据用户配置的时间，周期性的将数据导入OBS，若某个时间段内无数据，则此时间段不会生成打包文件。  单位：秒
     * minimum: 30
     * maximum: 900
     * @return deliverTimeInterval
     */
    public Integer getDeliverTimeInterval() {
        return deliverTimeInterval;
    }

    public void setDeliverTimeInterval(Integer deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
    }

    public CloudtableDestinationDescriptorRequest withConsumerStrategy(ConsumerStrategyEnum consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
        return this;
    }

    /**
     * 偏移量。  - LATEST：最大偏移量，即获取最新的数据。 - TRIM_HORIZON：最小偏移量，即读取最早的数据。
     * @return consumerStrategy
     */
    public ConsumerStrategyEnum getConsumerStrategy() {
        return consumerStrategy;
    }

    public void setConsumerStrategy(ConsumerStrategyEnum consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
    }

    public CloudtableDestinationDescriptorRequest withCloudtableClusterName(String cloudtableClusterName) {
        this.cloudtableClusterName = cloudtableClusterName;
        return this;
    }

    /**
     * 存储该通道数据的CloudTable集群名称。  如果选择转储OpenTSDB，则集群必须开启OpenTSDB。
     * @return cloudtableClusterName
     */
    public String getCloudtableClusterName() {
        return cloudtableClusterName;
    }

    public void setCloudtableClusterName(String cloudtableClusterName) {
        this.cloudtableClusterName = cloudtableClusterName;
    }

    public CloudtableDestinationDescriptorRequest withCloudtableClusterId(String cloudtableClusterId) {
        this.cloudtableClusterId = cloudtableClusterId;
        return this;
    }

    /**
     * 存储该通道数据的CloudTable集群ID。  如果选择转储OpenTSDB，则集群必须开启OpenTSDB。
     * @return cloudtableClusterId
     */
    public String getCloudtableClusterId() {
        return cloudtableClusterId;
    }

    public void setCloudtableClusterId(String cloudtableClusterId) {
        this.cloudtableClusterId = cloudtableClusterId;
    }

    public CloudtableDestinationDescriptorRequest withCloudtableTableName(String cloudtableTableName) {
        this.cloudtableTableName = cloudtableTableName;
        return this;
    }

    /**
     * 转储HBase时必选，表示存储该通道数据的CloudTable集群HBase表名称。
     * @return cloudtableTableName
     */
    public String getCloudtableTableName() {
        return cloudtableTableName;
    }

    public void setCloudtableTableName(String cloudtableTableName) {
        this.cloudtableTableName = cloudtableTableName;
    }

    public CloudtableDestinationDescriptorRequest withCloudtableSchema(CloudtableSchema cloudtableSchema) {
        this.cloudtableSchema = cloudtableSchema;
        return this;
    }

    public CloudtableDestinationDescriptorRequest withCloudtableSchema(
        Consumer<CloudtableSchema> cloudtableSchemaSetter) {
        if (this.cloudtableSchema == null) {
            this.cloudtableSchema = new CloudtableSchema();
            cloudtableSchemaSetter.accept(this.cloudtableSchema);
        }

        return this;
    }

    /**
     * Get cloudtableSchema
     * @return cloudtableSchema
     */
    public CloudtableSchema getCloudtableSchema() {
        return cloudtableSchema;
    }

    public void setCloudtableSchema(CloudtableSchema cloudtableSchema) {
        this.cloudtableSchema = cloudtableSchema;
    }

    public CloudtableDestinationDescriptorRequest withOpentsdbSchema(List<OpenTSDBSchema> opentsdbSchema) {
        this.opentsdbSchema = opentsdbSchema;
        return this;
    }

    public CloudtableDestinationDescriptorRequest addOpentsdbSchemaItem(OpenTSDBSchema opentsdbSchemaItem) {
        if (this.opentsdbSchema == null) {
            this.opentsdbSchema = new ArrayList<>();
        }
        this.opentsdbSchema.add(opentsdbSchemaItem);
        return this;
    }

    public CloudtableDestinationDescriptorRequest withOpentsdbSchema(
        Consumer<List<OpenTSDBSchema>> opentsdbSchemaSetter) {
        if (this.opentsdbSchema == null) {
            this.opentsdbSchema = new ArrayList<>();
        }
        opentsdbSchemaSetter.accept(this.opentsdbSchema);
        return this;
    }

    /**
     * 转储OpenTSDB时必选，与“cloudtable_schema”二选一，表示CloudTable集群OpenTSDB数据的Schema配置。用于将通道内的JSON数据进行格式转换并导入Cloudtable的OpenTSDB。
     * @return opentsdbSchema
     */
    public List<OpenTSDBSchema> getOpentsdbSchema() {
        return opentsdbSchema;
    }

    public void setOpentsdbSchema(List<OpenTSDBSchema> opentsdbSchema) {
        this.opentsdbSchema = opentsdbSchema;
    }

    public CloudtableDestinationDescriptorRequest withCloudtableRowKeyDelimiter(String cloudtableRowKeyDelimiter) {
        this.cloudtableRowKeyDelimiter = cloudtableRowKeyDelimiter;
        return this;
    }

    /**
     * 转储HBase的rowkey分隔符，用于分隔生成rowKey的用户数据。取值范围：”, ”、 ”. ”、 ”|”、 ”; ”、 ”\\”、 ”-”、 ”_”、 ”~”  缺省值：”.”
     * @return cloudtableRowKeyDelimiter
     */
    public String getCloudtableRowKeyDelimiter() {
        return cloudtableRowKeyDelimiter;
    }

    public void setCloudtableRowKeyDelimiter(String cloudtableRowKeyDelimiter) {
        this.cloudtableRowKeyDelimiter = cloudtableRowKeyDelimiter;
    }

    public CloudtableDestinationDescriptorRequest withObsBackupBucketPath(String obsBackupBucketPath) {
        this.obsBackupBucketPath = obsBackupBucketPath;
        return this;
    }

    /**
     * 用户数据转储CloudTable服务失败时，可选择将转储失败的数据备份至OBS服务，此参数为OBS服务的桶名称。
     * @return obsBackupBucketPath
     */
    public String getObsBackupBucketPath() {
        return obsBackupBucketPath;
    }

    public void setObsBackupBucketPath(String obsBackupBucketPath) {
        this.obsBackupBucketPath = obsBackupBucketPath;
    }

    public CloudtableDestinationDescriptorRequest withBackupFilePrefix(String backupFilePrefix) {
        this.backupFilePrefix = backupFilePrefix;
        return this;
    }

    /**
     * 用户数据转储CloudTable服务失败时，可选择将转储失败的数据备份至OBS服务，此参数为OBS桶下的自定义目录，多级目录可用“/”进行分隔，不可以“/”开头。  取值范围：英文字母、数字和下划线。  最大长度：最大长度为50个字符。  默认配置为空。
     * @return backupFilePrefix
     */
    public String getBackupFilePrefix() {
        return backupFilePrefix;
    }

    public void setBackupFilePrefix(String backupFilePrefix) {
        this.backupFilePrefix = backupFilePrefix;
    }

    public CloudtableDestinationDescriptorRequest withRetryDuration(String retryDuration) {
        this.retryDuration = retryDuration;
        return this;
    }

    /**
     * 用户数据导入CloudTable服务失败的失效重试时间。超出此时效，转储CloudTable失败的数据将备份至“OBS桶/ backup_file_prefix /cloudtable_error”或“OBS桶/ backup_file_prefix /opentsdb_error”目录下。  取值范围： 0～7200。  单位：秒。  默认配置为1800。
     * @return retryDuration
     */
    public String getRetryDuration() {
        return retryDuration;
    }

    public void setRetryDuration(String retryDuration) {
        this.retryDuration = retryDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudtableDestinationDescriptorRequest that = (CloudtableDestinationDescriptorRequest) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.deliverTimeInterval, that.deliverTimeInterval)
            && Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.cloudtableClusterName, that.cloudtableClusterName)
            && Objects.equals(this.cloudtableClusterId, that.cloudtableClusterId)
            && Objects.equals(this.cloudtableTableName, that.cloudtableTableName)
            && Objects.equals(this.cloudtableSchema, that.cloudtableSchema)
            && Objects.equals(this.opentsdbSchema, that.opentsdbSchema)
            && Objects.equals(this.cloudtableRowKeyDelimiter, that.cloudtableRowKeyDelimiter)
            && Objects.equals(this.obsBackupBucketPath, that.obsBackupBucketPath)
            && Objects.equals(this.backupFilePrefix, that.backupFilePrefix)
            && Objects.equals(this.retryDuration, that.retryDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            agencyName,
            deliverTimeInterval,
            consumerStrategy,
            cloudtableClusterName,
            cloudtableClusterId,
            cloudtableTableName,
            cloudtableSchema,
            opentsdbSchema,
            cloudtableRowKeyDelimiter,
            obsBackupBucketPath,
            backupFilePrefix,
            retryDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudtableDestinationDescriptorRequest {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    deliverTimeInterval: ").append(toIndentedString(deliverTimeInterval)).append("\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    cloudtableClusterName: ").append(toIndentedString(cloudtableClusterName)).append("\n");
        sb.append("    cloudtableClusterId: ").append(toIndentedString(cloudtableClusterId)).append("\n");
        sb.append("    cloudtableTableName: ").append(toIndentedString(cloudtableTableName)).append("\n");
        sb.append("    cloudtableSchema: ").append(toIndentedString(cloudtableSchema)).append("\n");
        sb.append("    opentsdbSchema: ").append(toIndentedString(opentsdbSchema)).append("\n");
        sb.append("    cloudtableRowKeyDelimiter: ").append(toIndentedString(cloudtableRowKeyDelimiter)).append("\n");
        sb.append("    obsBackupBucketPath: ").append(toIndentedString(obsBackupBucketPath)).append("\n");
        sb.append("    backupFilePrefix: ").append(toIndentedString(backupFilePrefix)).append("\n");
        sb.append("    retryDuration: ").append(toIndentedString(retryDuration)).append("\n");
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
