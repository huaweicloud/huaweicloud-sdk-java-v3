package com.huaweicloud.sdk.cts.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cts.v1.model.LogFileValidate;
import com.huaweicloud.sdk.cts.v1.model.Lts;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListTrackerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_name")
    
    private String trackerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket_name")
    
    private String bucketName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_prefix_name")
    
    private String filePrefixName;
    /**
     * 标识追踪器状态，包括正常（enabled），停止（disabled）和异常（error）三种状态，状态为异常时需通过明细（detail）字段说明错误来源。
     */
    public static class StatusEnum {

        
        /**
         * Enum ENABLED for value: "enabled"
         */
        public static final StatusEnum ENABLED = new StatusEnum("enabled");

        
        /**
         * Enum DISABLED for value: "disabled"
         */
        public static final StatusEnum DISABLED = new StatusEnum("disabled");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("enabled", ENABLED);
                        put("disabled", DISABLED);
                    }
                };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private String detail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_obs_created")
    
    private Boolean isObsCreated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_support_trace_files_encryption")
    
    private Boolean isSupportTraceFilesEncryption;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kms_id")
    
    private String kmsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lts")
    
    private Lts lts = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_file_validate")
    
    private LogFileValidate logFileValidate = null;

    public ListTrackerResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 追踪器唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListTrackerResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 追踪器创建时间戳。
     * minimum: 946656000000
     * maximum: 4102416000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListTrackerResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 账号ID，参见《云审计服务API参考》“获取账号ID和项目ID”章节。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListTrackerResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListTrackerResponse withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    


    /**
     * 标识追踪器名称，当前版本默认为“system”。
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public ListTrackerResponse withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    


    /**
     * 标识OBS桶名称。由数字或字母开头，支持小写字母、数字、“-”、“.”，长度为3～63个字符。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ListTrackerResponse withFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
        return this;
    }

    


    /**
     * 标识需要存储于OBS的日志文件前缀。
     * @return filePrefixName
     */
    public String getFilePrefixName() {
        return filePrefixName;
    }

    public void setFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
    }

    public ListTrackerResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 标识追踪器状态，包括正常（enabled），停止（disabled）和异常（error）三种状态，状态为异常时需通过明细（detail）字段说明错误来源。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListTrackerResponse withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * 该参数仅在追踪器状态异常时返回，用于标识追踪器异常的原因，包括桶策略异常（bucketPolicyError），桶不存在（noBucket）和欠费或冻结（arrears）三种原因。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ListTrackerResponse withIsObsCreated(Boolean isObsCreated) {
        this.isObsCreated = isObsCreated;
        return this;
    }

    


    /**
     * 是否支持新建OBS桶。   值为“true”时，表示新创建OBS桶存储事件文件；   值为“false”时，选择已存在的OBS桶存储事件文件。 桶名称包含数字、字母、'-'和'.'（非数字、字母类字符最多存在1个），长度为3～64字符。
     * @return isObsCreated
     */
    public Boolean getIsObsCreated() {
        return isObsCreated;
    }

    public void setIsObsCreated(Boolean isObsCreated) {
        this.isObsCreated = isObsCreated;
    }

    public ListTrackerResponse withIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
        return this;
    }

    


    /**
     * 事件文件转储加密功能开关。 该参数必须与kms_id参数同时使用。
     * @return isSupportTraceFilesEncryption
     */
    public Boolean getIsSupportTraceFilesEncryption() {
        return isSupportTraceFilesEncryption;
    }

    public void setIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
    }

    public ListTrackerResponse withKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }

    


    /**
     * 事件文件转储加密所采用的秘钥id（从KMS获取）。 当\"is_support_trace_files_encryption\"参数值为“是”时，此参数为必选项。
     * @return kmsId
     */
    public String getKmsId() {
        return kmsId;
    }

    public void setKmsId(String kmsId) {
        this.kmsId = kmsId;
    }

    public ListTrackerResponse withLts(Lts lts) {
        this.lts = lts;
        return this;
    }

    public ListTrackerResponse withLts(Consumer<Lts> ltsSetter) {
        if(this.lts == null ){
            this.lts = new Lts();
        }
        ltsSetter.accept(this.lts);
        return this;
    }


    /**
     * Get lts
     * @return lts
     */
    public Lts getLts() {
        return lts;
    }

    public void setLts(Lts lts) {
        this.lts = lts;
    }

    public ListTrackerResponse withLogFileValidate(LogFileValidate logFileValidate) {
        this.logFileValidate = logFileValidate;
        return this;
    }

    public ListTrackerResponse withLogFileValidate(Consumer<LogFileValidate> logFileValidateSetter) {
        if(this.logFileValidate == null ){
            this.logFileValidate = new LogFileValidate();
        }
        logFileValidateSetter.accept(this.logFileValidate);
        return this;
    }


    /**
     * Get logFileValidate
     * @return logFileValidate
     */
    public LogFileValidate getLogFileValidate() {
        return logFileValidate;
    }

    public void setLogFileValidate(LogFileValidate logFileValidate) {
        this.logFileValidate = logFileValidate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTrackerResponse listTrackerResponse = (ListTrackerResponse) o;
        return Objects.equals(this.id, listTrackerResponse.id) &&
            Objects.equals(this.createTime, listTrackerResponse.createTime) &&
            Objects.equals(this.domainId, listTrackerResponse.domainId) &&
            Objects.equals(this.projectId, listTrackerResponse.projectId) &&
            Objects.equals(this.trackerName, listTrackerResponse.trackerName) &&
            Objects.equals(this.bucketName, listTrackerResponse.bucketName) &&
            Objects.equals(this.filePrefixName, listTrackerResponse.filePrefixName) &&
            Objects.equals(this.status, listTrackerResponse.status) &&
            Objects.equals(this.detail, listTrackerResponse.detail) &&
            Objects.equals(this.isObsCreated, listTrackerResponse.isObsCreated) &&
            Objects.equals(this.isSupportTraceFilesEncryption, listTrackerResponse.isSupportTraceFilesEncryption) &&
            Objects.equals(this.kmsId, listTrackerResponse.kmsId) &&
            Objects.equals(this.lts, listTrackerResponse.lts) &&
            Objects.equals(this.logFileValidate, listTrackerResponse.logFileValidate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, domainId, projectId, trackerName, bucketName, filePrefixName, status, detail, isObsCreated, isSupportTraceFilesEncryption, kmsId, lts, logFileValidate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrackerResponse {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
            sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
            sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
            sb.append("    filePrefixName: ").append(toIndentedString(filePrefixName)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
            sb.append("    isObsCreated: ").append(toIndentedString(isObsCreated)).append("\n");
            sb.append("    isSupportTraceFilesEncryption: ").append(toIndentedString(isSupportTraceFilesEncryption)).append("\n");
            sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
            sb.append("    lts: ").append(toIndentedString(lts)).append("\n");
            sb.append("    logFileValidate: ").append(toIndentedString(logFileValidate)).append("\n");
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

