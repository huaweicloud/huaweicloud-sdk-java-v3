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
 * 转储目的地为DWS的参数列表。
 */
public class DWSDestinationDescriptorRequest {

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
    @JsonProperty(value = "dws_cluster_name")

    private String dwsClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dws_cluster_id")

    private String dwsClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dws_database_name")

    private String dwsDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dws_schema")

    private String dwsSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dws_table_name")

    private String dwsTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dws_delimiter")

    private String dwsDelimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_password")

    private String userPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_user_key_name")

    private String kmsUserKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_user_key_id")

    private String kmsUserKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_path")

    private String obsBucketPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_prefix")

    private String filePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_duration")

    private String retryDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dws_table_columns")

    private String dwsTableColumns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private Options options;

    public DWSDestinationDescriptorRequest withTaskName(String taskName) {
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

    public DWSDestinationDescriptorRequest withAgencyName(String agencyName) {
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

    public DWSDestinationDescriptorRequest withDeliverTimeInterval(Integer deliverTimeInterval) {
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

    public DWSDestinationDescriptorRequest withConsumerStrategy(ConsumerStrategyEnum consumerStrategy) {
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

    public DWSDestinationDescriptorRequest withDwsClusterName(String dwsClusterName) {
        this.dwsClusterName = dwsClusterName;
        return this;
    }

    /**
     * 存储该通道数据的DWS集群名称。
     * @return dwsClusterName
     */
    public String getDwsClusterName() {
        return dwsClusterName;
    }

    public void setDwsClusterName(String dwsClusterName) {
        this.dwsClusterName = dwsClusterName;
    }

    public DWSDestinationDescriptorRequest withDwsClusterId(String dwsClusterId) {
        this.dwsClusterId = dwsClusterId;
        return this;
    }

    /**
     * 存储该通道数据的DWS集群ID。
     * @return dwsClusterId
     */
    public String getDwsClusterId() {
        return dwsClusterId;
    }

    public void setDwsClusterId(String dwsClusterId) {
        this.dwsClusterId = dwsClusterId;
    }

    public DWSDestinationDescriptorRequest withDwsDatabaseName(String dwsDatabaseName) {
        this.dwsDatabaseName = dwsDatabaseName;
        return this;
    }

    /**
     * 存储该通道数据的DWS数据库名称。
     * @return dwsDatabaseName
     */
    public String getDwsDatabaseName() {
        return dwsDatabaseName;
    }

    public void setDwsDatabaseName(String dwsDatabaseName) {
        this.dwsDatabaseName = dwsDatabaseName;
    }

    public DWSDestinationDescriptorRequest withDwsSchema(String dwsSchema) {
        this.dwsSchema = dwsSchema;
        return this;
    }

    /**
     * 存储该通道数据的DWS数据库模式。
     * @return dwsSchema
     */
    public String getDwsSchema() {
        return dwsSchema;
    }

    public void setDwsSchema(String dwsSchema) {
        this.dwsSchema = dwsSchema;
    }

    public DWSDestinationDescriptorRequest withDwsTableName(String dwsTableName) {
        this.dwsTableName = dwsTableName;
        return this;
    }

    /**
     * 存储该通道数据的DWS数据库模式下的数据表。
     * @return dwsTableName
     */
    public String getDwsTableName() {
        return dwsTableName;
    }

    public void setDwsTableName(String dwsTableName) {
        this.dwsTableName = dwsTableName;
    }

    public DWSDestinationDescriptorRequest withDwsDelimiter(String dwsDelimiter) {
        this.dwsDelimiter = dwsDelimiter;
        return this;
    }

    /**
     * 用户数据的字段分隔符，根据此分隔符分隔用户数据插入DWS数据表的相应列。  取值范围：“，”、“；”和“|”三种字符中的一个。
     * @return dwsDelimiter
     */
    public String getDwsDelimiter() {
        return dwsDelimiter;
    }

    public void setDwsDelimiter(String dwsDelimiter) {
        this.dwsDelimiter = dwsDelimiter;
    }

    public DWSDestinationDescriptorRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 存储该通道数据的DWS数据库的用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DWSDestinationDescriptorRequest withUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    /**
     * 存储该通道数据的DWS数据库的密码。
     * @return userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public DWSDestinationDescriptorRequest withKmsUserKeyName(String kmsUserKeyName) {
        this.kmsUserKeyName = kmsUserKeyName;
        return this;
    }

    /**
     * 用户在密钥管理服务（简称KMS）创建的用户主密钥名称，用于加密存储DWS数据库的密码。
     * @return kmsUserKeyName
     */
    public String getKmsUserKeyName() {
        return kmsUserKeyName;
    }

    public void setKmsUserKeyName(String kmsUserKeyName) {
        this.kmsUserKeyName = kmsUserKeyName;
    }

    public DWSDestinationDescriptorRequest withKmsUserKeyId(String kmsUserKeyId) {
        this.kmsUserKeyId = kmsUserKeyId;
        return this;
    }

    /**
     * 用户在密钥管理服务（简称KMS）创建的用户主密钥ID，用于加密存储DWS数据库的密码。
     * @return kmsUserKeyId
     */
    public String getKmsUserKeyId() {
        return kmsUserKeyId;
    }

    public void setKmsUserKeyId(String kmsUserKeyId) {
        this.kmsUserKeyId = kmsUserKeyId;
    }

    public DWSDestinationDescriptorRequest withObsBucketPath(String obsBucketPath) {
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

    public DWSDestinationDescriptorRequest withFilePrefix(String filePrefix) {
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

    public DWSDestinationDescriptorRequest withRetryDuration(String retryDuration) {
        this.retryDuration = retryDuration;
        return this;
    }

    /**
     * 用户数据导入DWS集群失败的重试失效时间。超出此配置项配置的时间，转储DWS失败的数据将备份至“OBS桶/ file_prefix/dws_error”目录下。  取值范围： 0～7200。  单位：秒。  默认配置为1800。
     * @return retryDuration
     */
    public String getRetryDuration() {
        return retryDuration;
    }

    public void setRetryDuration(String retryDuration) {
        this.retryDuration = retryDuration;
    }

    public DWSDestinationDescriptorRequest withDwsTableColumns(String dwsTableColumns) {
        this.dwsTableColumns = dwsTableColumns;
        return this;
    }

    /**
     * 指定要转储到DWS表中的列，为null或者为空则默认全列。比如“c1,c2”表示将Schema中c1和c2这两列转储到DWS。  默认为空。
     * @return dwsTableColumns
     */
    public String getDwsTableColumns() {
        return dwsTableColumns;
    }

    public void setDwsTableColumns(String dwsTableColumns) {
        this.dwsTableColumns = dwsTableColumns;
    }

    public DWSDestinationDescriptorRequest withOptions(Options options) {
        this.options = options;
        return this;
    }

    public DWSDestinationDescriptorRequest withOptions(Consumer<Options> optionsSetter) {
        if (this.options == null) {
            this.options = new Options();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DWSDestinationDescriptorRequest that = (DWSDestinationDescriptorRequest) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.deliverTimeInterval, that.deliverTimeInterval)
            && Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.dwsClusterName, that.dwsClusterName)
            && Objects.equals(this.dwsClusterId, that.dwsClusterId)
            && Objects.equals(this.dwsDatabaseName, that.dwsDatabaseName)
            && Objects.equals(this.dwsSchema, that.dwsSchema) && Objects.equals(this.dwsTableName, that.dwsTableName)
            && Objects.equals(this.dwsDelimiter, that.dwsDelimiter) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userPassword, that.userPassword)
            && Objects.equals(this.kmsUserKeyName, that.kmsUserKeyName)
            && Objects.equals(this.kmsUserKeyId, that.kmsUserKeyId)
            && Objects.equals(this.obsBucketPath, that.obsBucketPath)
            && Objects.equals(this.filePrefix, that.filePrefix)
            && Objects.equals(this.retryDuration, that.retryDuration)
            && Objects.equals(this.dwsTableColumns, that.dwsTableColumns) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            agencyName,
            deliverTimeInterval,
            consumerStrategy,
            dwsClusterName,
            dwsClusterId,
            dwsDatabaseName,
            dwsSchema,
            dwsTableName,
            dwsDelimiter,
            userName,
            userPassword,
            kmsUserKeyName,
            kmsUserKeyId,
            obsBucketPath,
            filePrefix,
            retryDuration,
            dwsTableColumns,
            options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DWSDestinationDescriptorRequest {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    deliverTimeInterval: ").append(toIndentedString(deliverTimeInterval)).append("\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    dwsClusterName: ").append(toIndentedString(dwsClusterName)).append("\n");
        sb.append("    dwsClusterId: ").append(toIndentedString(dwsClusterId)).append("\n");
        sb.append("    dwsDatabaseName: ").append(toIndentedString(dwsDatabaseName)).append("\n");
        sb.append("    dwsSchema: ").append(toIndentedString(dwsSchema)).append("\n");
        sb.append("    dwsTableName: ").append(toIndentedString(dwsTableName)).append("\n");
        sb.append("    dwsDelimiter: ").append(toIndentedString(dwsDelimiter)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
        sb.append("    kmsUserKeyName: ").append(toIndentedString(kmsUserKeyName)).append("\n");
        sb.append("    kmsUserKeyId: ").append(toIndentedString(kmsUserKeyId)).append("\n");
        sb.append("    obsBucketPath: ").append(toIndentedString(obsBucketPath)).append("\n");
        sb.append("    filePrefix: ").append(toIndentedString(filePrefix)).append("\n");
        sb.append("    retryDuration: ").append(toIndentedString(retryDuration)).append("\n");
        sb.append("    dwsTableColumns: ").append(toIndentedString(dwsTableColumns)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
