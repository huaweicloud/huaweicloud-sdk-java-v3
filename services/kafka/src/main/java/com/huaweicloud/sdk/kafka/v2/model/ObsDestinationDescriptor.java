package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转存目标的描述。
 */
public class ObsDestinationDescriptor  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topics")
    
    private String topics;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topics_regex")
    
    private String topicsRegex;
    /**
     * 转储启动偏移量：   - latest: 从Topic最后端开始消费。   - earliest: 从Topic最前端消息开始消费。  默认是latest。 
     */
    public static class ConsumerStrategyEnum {

        
        /**
         * Enum LATEST for value: "latest"
         */
        public static final ConsumerStrategyEnum LATEST = new ConsumerStrategyEnum("latest");
        
        /**
         * Enum EARLIEST for value: "earliest"
         */
        public static final ConsumerStrategyEnum EARLIEST = new ConsumerStrategyEnum("earliest");
        

        public static final Map<String, ConsumerStrategyEnum> staticFields = new HashMap<String, ConsumerStrategyEnum>() {
            { 
                put("latest", LATEST);
                put("earliest", EARLIEST);
            }
        };

        private String value;

        ConsumerStrategyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConsumerStrategyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ConsumerStrategyEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ConsumerStrategyEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ConsumerStrategyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ConsumerStrategyEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ConsumerStrategyEnum) {
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
    @JsonProperty(value="consumer_strategy")
    
    private ConsumerStrategyEnum consumerStrategy;
    /**
     * 转储文件格式。当前只支持text。 
     */
    public static class DestinationFileTypeEnum {

        
        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final DestinationFileTypeEnum TEXT = new DestinationFileTypeEnum("TEXT");
        

        public static final Map<String, DestinationFileTypeEnum> staticFields = new HashMap<String, DestinationFileTypeEnum>() {
            { 
                put("TEXT", TEXT);
            }
        };

        private String value;

        DestinationFileTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DestinationFileTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DestinationFileTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DestinationFileTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DestinationFileTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DestinationFileTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DestinationFileTypeEnum) {
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
    @JsonProperty(value="destination_file_type")
    
    private DestinationFileTypeEnum destinationFileType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_key")
    
    private String accessKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret_key")
    
    private String secretKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_bucket_name")
    
    private String obsBucketName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_path")
    
    private String obsPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partition_format")
    
    private String partitionFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_delimiter")
    
    private String recordDelimiter;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deliver_time_interval")
    
    private String deliverTimeInterval;

    public ObsDestinationDescriptor withTopics(String topics) {
        this.topics = topics;
        return this;
    }

    


    /**
     * 转存的topic列表名称，支持多个topic同时放置，以逗号“,”分隔。同时支持正则表达式。 例如topic1,topic2。 
     * @return topics
     */
    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public ObsDestinationDescriptor withTopicsRegex(String topicsRegex) {
        this.topicsRegex = topicsRegex;
        return this;
    }

    


    /**
     * 转存topic的正则表达式，与topics必须二选一，不能同时都设置或者“.*”。 
     * @return topicsRegex
     */
    public String getTopicsRegex() {
        return topicsRegex;
    }

    public void setTopicsRegex(String topicsRegex) {
        this.topicsRegex = topicsRegex;
    }

    public ObsDestinationDescriptor withConsumerStrategy(ConsumerStrategyEnum consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
        return this;
    }

    


    /**
     * 转储启动偏移量：   - latest: 从Topic最后端开始消费。   - earliest: 从Topic最前端消息开始消费。  默认是latest。 
     * @return consumerStrategy
     */
    public ConsumerStrategyEnum getConsumerStrategy() {
        return consumerStrategy;
    }

    public void setConsumerStrategy(ConsumerStrategyEnum consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
    }

    public ObsDestinationDescriptor withDestinationFileType(DestinationFileTypeEnum destinationFileType) {
        this.destinationFileType = destinationFileType;
        return this;
    }

    


    /**
     * 转储文件格式。当前只支持text。 
     * @return destinationFileType
     */
    public DestinationFileTypeEnum getDestinationFileType() {
        return destinationFileType;
    }

    public void setDestinationFileType(DestinationFileTypeEnum destinationFileType) {
        this.destinationFileType = destinationFileType;
    }

    public ObsDestinationDescriptor withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    


    /**
     * 访问密钥AK。 
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public ObsDestinationDescriptor withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    


    /**
     * 访问密钥SK。 
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public ObsDestinationDescriptor withObsBucketName(String obsBucketName) {
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

    public ObsDestinationDescriptor withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    


    /**
     * 存储在obs的路径，默认可以不填。 取值范围：英文字母、数字、下划线和斜杠，最大长度为50个字符。 默认配置为空。 
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public ObsDestinationDescriptor withPartitionFormat(String partitionFormat) {
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

    public ObsDestinationDescriptor withRecordDelimiter(String recordDelimiter) {
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

    public ObsDestinationDescriptor withDeliverTimeInterval(String deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
        return this;
    }

    


    /**
     * 根据用户配置的时间，周期性的将数据导入OBS，若某个时间段内无数据，则此时间段不会生成打包文件。 取值范围：30～900 单位：秒。 > 使用OBS通道转储流式数据时该参数为必选配置。 
     * @return deliverTimeInterval
     */
    public String getDeliverTimeInterval() {
        return deliverTimeInterval;
    }

    public void setDeliverTimeInterval(String deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObsDestinationDescriptor obsDestinationDescriptor = (ObsDestinationDescriptor) o;
        return Objects.equals(this.topics, obsDestinationDescriptor.topics) &&
            Objects.equals(this.topicsRegex, obsDestinationDescriptor.topicsRegex) &&
            Objects.equals(this.consumerStrategy, obsDestinationDescriptor.consumerStrategy) &&
            Objects.equals(this.destinationFileType, obsDestinationDescriptor.destinationFileType) &&
            Objects.equals(this.accessKey, obsDestinationDescriptor.accessKey) &&
            Objects.equals(this.secretKey, obsDestinationDescriptor.secretKey) &&
            Objects.equals(this.obsBucketName, obsDestinationDescriptor.obsBucketName) &&
            Objects.equals(this.obsPath, obsDestinationDescriptor.obsPath) &&
            Objects.equals(this.partitionFormat, obsDestinationDescriptor.partitionFormat) &&
            Objects.equals(this.recordDelimiter, obsDestinationDescriptor.recordDelimiter) &&
            Objects.equals(this.deliverTimeInterval, obsDestinationDescriptor.deliverTimeInterval);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topics, topicsRegex, consumerStrategy, destinationFileType, accessKey, secretKey, obsBucketName, obsPath, partitionFormat, recordDelimiter, deliverTimeInterval);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsDestinationDescriptor {\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    topicsRegex: ").append(toIndentedString(topicsRegex)).append("\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    destinationFileType: ").append(toIndentedString(destinationFileType)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    partitionFormat: ").append(toIndentedString(partitionFormat)).append("\n");
        sb.append("    recordDelimiter: ").append(toIndentedString(recordDelimiter)).append("\n");
        sb.append("    deliverTimeInterval: ").append(toIndentedString(deliverTimeInterval)).append("\n");
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

