package com.huaweicloud.sdk.dis.v2.model;

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
 * 转储目的地为OBS的参数列表。
 */
public class OBSDestinationDescriptorRequest {

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
    @JsonProperty(value = "file_prefix")

    private String filePrefix;

    /**
     * 将转储文件的生成时间使用“yyyy/MM/dd/HH/mm”格式生成分区字符串，用来定义写到OBS的Object文件所在的目录层次结构。  - N/A：置空，不使用日期时间目录。 - yyyy：年 - yyyy/MM：年/ - yyyy/MM/dd：年/月/日 - yyyy/MM/dd/HH：年/月/日/时 - yyyy/MM/dd/HH/mm：年/月/日/时/分  例如：2017/11/10/14/49，目录结构就是“2017 > 11 > 10 > 14 > 49”，“2017”表示最外层文件夹。  默认值：空  说明：  数据转储成功后，存储的目录结构为“obs_bucket_path/file_prefix/partition_format”。
     */
    public static final class PartitionFormatEnum {

        /**
         * Enum YYYY for value: "yyyy"
         */
        public static final PartitionFormatEnum YYYY = new PartitionFormatEnum("yyyy");

        /**
         * Enum YYYY_MM for value: "yyyy/MM"
         */
        public static final PartitionFormatEnum YYYY_MM = new PartitionFormatEnum("yyyy/MM");

        /**
         * Enum YYYY_MM_DD for value: "yyyy/MM/dd"
         */
        public static final PartitionFormatEnum YYYY_MM_DD = new PartitionFormatEnum("yyyy/MM/dd");

        /**
         * Enum YYYY_MM_DD_HH for value: "yyyy/MM/dd/HH"
         */
        public static final PartitionFormatEnum YYYY_MM_DD_HH = new PartitionFormatEnum("yyyy/MM/dd/HH");

        /**
         * Enum YYYY_MM_DD_HH_MM for value: "yyyy/MM/dd/HH/mm"
         */
        public static final PartitionFormatEnum YYYY_MM_DD_HH_MM = new PartitionFormatEnum("yyyy/MM/dd/HH/mm");

        private static final Map<String, PartitionFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PartitionFormatEnum> createStaticFields() {
            Map<String, PartitionFormatEnum> map = new HashMap<>();
            map.put("yyyy", YYYY);
            map.put("yyyy/MM", YYYY_MM);
            map.put("yyyy/MM/dd", YYYY_MM_DD);
            map.put("yyyy/MM/dd/HH", YYYY_MM_DD_HH);
            map.put("yyyy/MM/dd/HH/mm", YYYY_MM_DD_HH_MM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PartitionFormatEnum(String value) {
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
        public static PartitionFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PartitionFormatEnum(value));
        }

        public static PartitionFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PartitionFormatEnum) {
                return this.value.equals(((PartitionFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_format")

    private PartitionFormatEnum partitionFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_path")

    private String obsBucketPath;

    /**
     * 转储文件格式。  - text：转储目标格式为TEXT，缺省值 - parquet：转储目标格式为Parquet - carbon：转储目标格式为Carbon  说明：  “源数据类型”为“JSON”，“转储服务类型”为“OBS”时才可选择“parquet”或“carbon”格式。
     */
    public static final class DestinationFileTypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final DestinationFileTypeEnum TEXT = new DestinationFileTypeEnum("text");

        /**
         * Enum PARQUET for value: "parquet"
         */
        public static final DestinationFileTypeEnum PARQUET = new DestinationFileTypeEnum("parquet");

        /**
         * Enum CARBON for value: "carbon"
         */
        public static final DestinationFileTypeEnum CARBON = new DestinationFileTypeEnum("carbon");

        private static final Map<String, DestinationFileTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DestinationFileTypeEnum> createStaticFields() {
            Map<String, DestinationFileTypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("parquet", PARQUET);
            map.put("carbon", CARBON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DestinationFileTypeEnum(String value) {
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
        public static DestinationFileTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DestinationFileTypeEnum(value));
        }

        public static DestinationFileTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DestinationFileTypeEnum) {
                return this.value.equals(((DestinationFileTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_file_type")

    private DestinationFileTypeEnum destinationFileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processing_schema")

    private ProcessingSchema processingSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_delimiter")

    private String recordDelimiter;

    public OBSDestinationDescriptorRequest withTaskName(String taskName) {
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

    public OBSDestinationDescriptorRequest withAgencyName(String agencyName) {
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

    public OBSDestinationDescriptorRequest withDeliverTimeInterval(Integer deliverTimeInterval) {
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

    public OBSDestinationDescriptorRequest withConsumerStrategy(ConsumerStrategyEnum consumerStrategy) {
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

    public OBSDestinationDescriptorRequest withFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
        return this;
    }

    /**
     * 在OBS中存储通道文件的自定义目录，多级目录可用“/”进行分隔，不可以“/”开头。  取值范围：英文字母、数字、下划线和斜杠，最大长度为50个字符。  默认配置为空。
     * @return filePrefix
     */
    public String getFilePrefix() {
        return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    public OBSDestinationDescriptorRequest withPartitionFormat(PartitionFormatEnum partitionFormat) {
        this.partitionFormat = partitionFormat;
        return this;
    }

    /**
     * 将转储文件的生成时间使用“yyyy/MM/dd/HH/mm”格式生成分区字符串，用来定义写到OBS的Object文件所在的目录层次结构。  - N/A：置空，不使用日期时间目录。 - yyyy：年 - yyyy/MM：年/ - yyyy/MM/dd：年/月/日 - yyyy/MM/dd/HH：年/月/日/时 - yyyy/MM/dd/HH/mm：年/月/日/时/分  例如：2017/11/10/14/49，目录结构就是“2017 > 11 > 10 > 14 > 49”，“2017”表示最外层文件夹。  默认值：空  说明：  数据转储成功后，存储的目录结构为“obs_bucket_path/file_prefix/partition_format”。
     * @return partitionFormat
     */
    public PartitionFormatEnum getPartitionFormat() {
        return partitionFormat;
    }

    public void setPartitionFormat(PartitionFormatEnum partitionFormat) {
        this.partitionFormat = partitionFormat;
    }

    public OBSDestinationDescriptorRequest withObsBucketPath(String obsBucketPath) {
        this.obsBucketPath = obsBucketPath;
        return this;
    }

    /**
     * 存储该通道数据的OBS桶名称。
     * @return obsBucketPath
     */
    public String getObsBucketPath() {
        return obsBucketPath;
    }

    public void setObsBucketPath(String obsBucketPath) {
        this.obsBucketPath = obsBucketPath;
    }

    public OBSDestinationDescriptorRequest withDestinationFileType(DestinationFileTypeEnum destinationFileType) {
        this.destinationFileType = destinationFileType;
        return this;
    }

    /**
     * 转储文件格式。  - text：转储目标格式为TEXT，缺省值 - parquet：转储目标格式为Parquet - carbon：转储目标格式为Carbon  说明：  “源数据类型”为“JSON”，“转储服务类型”为“OBS”时才可选择“parquet”或“carbon”格式。
     * @return destinationFileType
     */
    public DestinationFileTypeEnum getDestinationFileType() {
        return destinationFileType;
    }

    public void setDestinationFileType(DestinationFileTypeEnum destinationFileType) {
        this.destinationFileType = destinationFileType;
    }

    public OBSDestinationDescriptorRequest withProcessingSchema(ProcessingSchema processingSchema) {
        this.processingSchema = processingSchema;
        return this;
    }

    public OBSDestinationDescriptorRequest withProcessingSchema(Consumer<ProcessingSchema> processingSchemaSetter) {
        if (this.processingSchema == null) {
            this.processingSchema = new ProcessingSchema();
            processingSchemaSetter.accept(this.processingSchema);
        }

        return this;
    }

    /**
     * Get processingSchema
     * @return processingSchema
     */
    public ProcessingSchema getProcessingSchema() {
        return processingSchema;
    }

    public void setProcessingSchema(ProcessingSchema processingSchema) {
        this.processingSchema = processingSchema;
    }

    public OBSDestinationDescriptorRequest withRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
        return this;
    }

    /**
     * 转储文件的记录分隔符，用于分隔写入转储文件的用户数据。  取值范围：  - 逗号 \",\"，默认值 - 分号 \";\" - 竖线 \"|\" - 换行符 \"\\n\"
     * @return recordDelimiter
     */
    public String getRecordDelimiter() {
        return recordDelimiter;
    }

    public void setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OBSDestinationDescriptorRequest that = (OBSDestinationDescriptorRequest) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.deliverTimeInterval, that.deliverTimeInterval)
            && Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.filePrefix, that.filePrefix)
            && Objects.equals(this.partitionFormat, that.partitionFormat)
            && Objects.equals(this.obsBucketPath, that.obsBucketPath)
            && Objects.equals(this.destinationFileType, that.destinationFileType)
            && Objects.equals(this.processingSchema, that.processingSchema)
            && Objects.equals(this.recordDelimiter, that.recordDelimiter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            agencyName,
            deliverTimeInterval,
            consumerStrategy,
            filePrefix,
            partitionFormat,
            obsBucketPath,
            destinationFileType,
            processingSchema,
            recordDelimiter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBSDestinationDescriptorRequest {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    deliverTimeInterval: ").append(toIndentedString(deliverTimeInterval)).append("\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    filePrefix: ").append(toIndentedString(filePrefix)).append("\n");
        sb.append("    partitionFormat: ").append(toIndentedString(partitionFormat)).append("\n");
        sb.append("    obsBucketPath: ").append(toIndentedString(obsBucketPath)).append("\n");
        sb.append("    destinationFileType: ").append(toIndentedString(destinationFileType)).append("\n");
        sb.append("    processingSchema: ").append(toIndentedString(processingSchema)).append("\n");
        sb.append("    recordDelimiter: ").append(toIndentedString(recordDelimiter)).append("\n");
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
