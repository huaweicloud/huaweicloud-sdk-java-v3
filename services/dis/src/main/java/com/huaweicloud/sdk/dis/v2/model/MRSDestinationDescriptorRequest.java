package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 转储目的地为MRS的参数列表。
 */
public class MRSDestinationDescriptorRequest {

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
    @JsonProperty(value = "mrs_cluster_name")

    private String mrsClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mrs_cluster_id")

    private String mrsClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mrs_hdfs_path")

    private String mrsHdfsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_prefix")

    private String filePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hdfs_prefix_folder")

    private String hdfsPrefixFolder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_path")

    private String obsBucketPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_duration")

    private String retryDuration;

    public MRSDestinationDescriptorRequest withTaskName(String taskName) {
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

    public MRSDestinationDescriptorRequest withAgencyName(String agencyName) {
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

    public MRSDestinationDescriptorRequest withDeliverTimeInterval(Integer deliverTimeInterval) {
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

    public MRSDestinationDescriptorRequest withConsumerStrategy(ConsumerStrategyEnum consumerStrategy) {
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

    public MRSDestinationDescriptorRequest withMrsClusterName(String mrsClusterName) {
        this.mrsClusterName = mrsClusterName;
        return this;
    }

    /**
     * 存储该通道数据的MRS集群名称。  说明：  仅支持非Kerberos认证的MRS集群。
     * @return mrsClusterName
     */
    public String getMrsClusterName() {
        return mrsClusterName;
    }

    public void setMrsClusterName(String mrsClusterName) {
        this.mrsClusterName = mrsClusterName;
    }

    public MRSDestinationDescriptorRequest withMrsClusterId(String mrsClusterId) {
        this.mrsClusterId = mrsClusterId;
        return this;
    }

    /**
     * 存储该通道数据的MRS集群ID。
     * @return mrsClusterId
     */
    public String getMrsClusterId() {
        return mrsClusterId;
    }

    public void setMrsClusterId(String mrsClusterId) {
        this.mrsClusterId = mrsClusterId;
    }

    public MRSDestinationDescriptorRequest withMrsHdfsPath(String mrsHdfsPath) {
        this.mrsHdfsPath = mrsHdfsPath;
        return this;
    }

    /**
     * 存储该通道数据的MRS集群的HDFS路径。
     * @return mrsHdfsPath
     */
    public String getMrsHdfsPath() {
        return mrsHdfsPath;
    }

    public void setMrsHdfsPath(String mrsHdfsPath) {
        this.mrsHdfsPath = mrsHdfsPath;
    }

    public MRSDestinationDescriptorRequest withFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
        return this;
    }

    /**
     * 临时存储该通道数据的OBS桶下的自定义目录，多级目录可用“/”进行分隔，不可以“/”开头。  取值范围：英文字母、数字、下划线和斜杠，最大长度为50个字符。  默认配置为空。
     * @return filePrefix
     */
    public String getFilePrefix() {
        return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    public MRSDestinationDescriptorRequest withHdfsPrefixFolder(String hdfsPrefixFolder) {
        this.hdfsPrefixFolder = hdfsPrefixFolder;
        return this;
    }

    /**
     * 在MRS集群HDFS中存储通道文件的自定义目录，多级目录可用\"/\"进行分隔。  取值范围：0~50个字符。  默认配置为空。
     * @return hdfsPrefixFolder
     */
    public String getHdfsPrefixFolder() {
        return hdfsPrefixFolder;
    }

    public void setHdfsPrefixFolder(String hdfsPrefixFolder) {
        this.hdfsPrefixFolder = hdfsPrefixFolder;
    }

    public MRSDestinationDescriptorRequest withObsBucketPath(String obsBucketPath) {
        this.obsBucketPath = obsBucketPath;
        return this;
    }

    /**
     * 临时存储该通道数据的OBS桶名称。
     * @return obsBucketPath
     */
    public String getObsBucketPath() {
        return obsBucketPath;
    }

    public void setObsBucketPath(String obsBucketPath) {
        this.obsBucketPath = obsBucketPath;
    }

    public MRSDestinationDescriptorRequest withRetryDuration(String retryDuration) {
        this.retryDuration = retryDuration;
        return this;
    }

    /**
     * 用户数据转储失败的失效重试时间。重试时间超过该配置项配置的值，则将转储失败的数据备份至“OBS桶/ file_prefix/mrs_error”目录下。  取值范围：0~7200。  单位：秒。  默认配置为1800。  配置为“0”表示DIS服务不会在转储失败时进行重试。
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
        MRSDestinationDescriptorRequest that = (MRSDestinationDescriptorRequest) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.deliverTimeInterval, that.deliverTimeInterval)
            && Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.mrsClusterName, that.mrsClusterName)
            && Objects.equals(this.mrsClusterId, that.mrsClusterId)
            && Objects.equals(this.mrsHdfsPath, that.mrsHdfsPath) && Objects.equals(this.filePrefix, that.filePrefix)
            && Objects.equals(this.hdfsPrefixFolder, that.hdfsPrefixFolder)
            && Objects.equals(this.obsBucketPath, that.obsBucketPath)
            && Objects.equals(this.retryDuration, that.retryDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            agencyName,
            deliverTimeInterval,
            consumerStrategy,
            mrsClusterName,
            mrsClusterId,
            mrsHdfsPath,
            filePrefix,
            hdfsPrefixFolder,
            obsBucketPath,
            retryDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MRSDestinationDescriptorRequest {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    deliverTimeInterval: ").append(toIndentedString(deliverTimeInterval)).append("\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    mrsClusterName: ").append(toIndentedString(mrsClusterName)).append("\n");
        sb.append("    mrsClusterId: ").append(toIndentedString(mrsClusterId)).append("\n");
        sb.append("    mrsHdfsPath: ").append(toIndentedString(mrsHdfsPath)).append("\n");
        sb.append("    filePrefix: ").append(toIndentedString(filePrefix)).append("\n");
        sb.append("    hdfsPrefixFolder: ").append(toIndentedString(hdfsPrefixFolder)).append("\n");
        sb.append("    obsBucketPath: ").append(toIndentedString(obsBucketPath)).append("\n");
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
