package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 转存目标的描述。
 */
public class ShowSinkTaskDetailRespObsDestinationDescriptor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_strategy")

    private String consumerStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_file_type")

    private String destinationFileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_format")

    private String partitionFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_delimiter")

    private String recordDelimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliver_time_interval")

    private Integer deliverTimeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_part_size")

    private Long obsPartSize;

    public ShowSinkTaskDetailRespObsDestinationDescriptor withConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
        return this;
    }

    /**
     * 消费启动策略：  - latest：从Topic最后端开始消费。  - earliest: 从Topic最前端消息开始消费。  默认是latest。 
     * @return consumerStrategy
     */
    public String getConsumerStrategy() {
        return consumerStrategy;
    }

    public void setConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
    }

    public ShowSinkTaskDetailRespObsDestinationDescriptor withDestinationFileType(String destinationFileType) {
        this.destinationFileType = destinationFileType;
        return this;
    }

    /**
     * 转储文件格式。目前只支持text格式。 
     * @return destinationFileType
     */
    public String getDestinationFileType() {
        return destinationFileType;
    }

    public void setDestinationFileType(String destinationFileType) {
        this.destinationFileType = destinationFileType;
    }

    public ShowSinkTaskDetailRespObsDestinationDescriptor withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * 存储该通道数据的OBS桶名称。 
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public ShowSinkTaskDetailRespObsDestinationDescriptor withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * 存储在obs的路径。 
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public ShowSinkTaskDetailRespObsDestinationDescriptor withPartitionFormat(String partitionFormat) {
        this.partitionFormat = partitionFormat;
        return this;
    }

    /**
     * 将转储文件的生成时间使用“yyyy/MM/dd/HH/mm”格式生成分区字符串，用来定义写到OBS的Object文件所在的目录层次结构。   - N/A：置空，不使用日期时间目录。   - yyyy：年   - yyyy/MM：年/月   - yyyy/MM/dd：年/月/日   - yyyy/MM/dd/HH：年/月/日/时   - yyyy/MM/dd/HH/mm：年/月/日/时/分，例如：2017/11/10/14/49，目录结构就是“2017 > 11 > 10 > 14 > 49”，“2017”表示最外层文件夹。  默认值：空 > 数据转储成功后，存储的目录结构为“obs_bucket_path/file_prefix/partition_format”。默认时间是GMT+8 时间 
     * @return partitionFormat
     */
    public String getPartitionFormat() {
        return partitionFormat;
    }

    public void setPartitionFormat(String partitionFormat) {
        this.partitionFormat = partitionFormat;
    }

    public ShowSinkTaskDetailRespObsDestinationDescriptor withRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
        return this;
    }

    /**
     * 转储文件的记录分隔符，用于分隔写入转储文件的用户数据。 取值范围：   - 逗号“,”   - 分号“;”   - 竖线“|”   - 换行符“\\n”   - NULL  默认值：换行符“\\n”。 
     * @return recordDelimiter
     */
    public String getRecordDelimiter() {
        return recordDelimiter;
    }

    public void setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
    }

    public ShowSinkTaskDetailRespObsDestinationDescriptor withDeliverTimeInterval(Integer deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
        return this;
    }

    /**
     * 根据用户配置的时间，周期性的将数据导入OBS，若某个时间段内无数据，则此时间段不会生成打包文件。 取值范围：30～900 缺省值：300 单位：秒。 > 使用OBS通道转储流式数据时该参数为必选配置。 
     * @return deliverTimeInterval
     */
    public Integer getDeliverTimeInterval() {
        return deliverTimeInterval;
    }

    public void setDeliverTimeInterval(Integer deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
    }

    public ShowSinkTaskDetailRespObsDestinationDescriptor withObsPartSize(Long obsPartSize) {
        this.obsPartSize = obsPartSize;
        return this;
    }

    /**
     * 每个传输文件多大后就开始上传，单位为byte。 默认值5242880。 
     * @return obsPartSize
     */
    public Long getObsPartSize() {
        return obsPartSize;
    }

    public void setObsPartSize(Long obsPartSize) {
        this.obsPartSize = obsPartSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSinkTaskDetailRespObsDestinationDescriptor showSinkTaskDetailRespObsDestinationDescriptor =
            (ShowSinkTaskDetailRespObsDestinationDescriptor) o;
        return Objects.equals(this.consumerStrategy, showSinkTaskDetailRespObsDestinationDescriptor.consumerStrategy)
            && Objects.equals(this.destinationFileType,
                showSinkTaskDetailRespObsDestinationDescriptor.destinationFileType)
            && Objects.equals(this.obsBucketName, showSinkTaskDetailRespObsDestinationDescriptor.obsBucketName)
            && Objects.equals(this.obsPath, showSinkTaskDetailRespObsDestinationDescriptor.obsPath)
            && Objects.equals(this.partitionFormat, showSinkTaskDetailRespObsDestinationDescriptor.partitionFormat)
            && Objects.equals(this.recordDelimiter, showSinkTaskDetailRespObsDestinationDescriptor.recordDelimiter)
            && Objects.equals(this.deliverTimeInterval,
                showSinkTaskDetailRespObsDestinationDescriptor.deliverTimeInterval)
            && Objects.equals(this.obsPartSize, showSinkTaskDetailRespObsDestinationDescriptor.obsPartSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumerStrategy,
            destinationFileType,
            obsBucketName,
            obsPath,
            partitionFormat,
            recordDelimiter,
            deliverTimeInterval,
            obsPartSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSinkTaskDetailRespObsDestinationDescriptor {\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    destinationFileType: ").append(toIndentedString(destinationFileType)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    partitionFormat: ").append(toIndentedString(partitionFormat)).append("\n");
        sb.append("    recordDelimiter: ").append(toIndentedString(recordDelimiter)).append("\n");
        sb.append("    deliverTimeInterval: ").append(toIndentedString(deliverTimeInterval)).append("\n");
        sb.append("    obsPartSize: ").append(toIndentedString(obsPartSize)).append("\n");
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
