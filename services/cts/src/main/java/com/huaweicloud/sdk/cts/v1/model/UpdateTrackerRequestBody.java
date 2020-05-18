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
 * UpdateTrackerRequestBody
 */
public class UpdateTrackerRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket_name")
    
    private String bucketName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_prefix_name")
    
    private String filePrefixName;
    /**
     * 标识追踪器状态，该接口中可修改的状态包括正常（enabled）和停止（disabled）。如果选择修改状态为停止，则修改成功后追踪器停止记录事件。'.'，'_'长度为0～64字符。
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

    public UpdateTrackerRequestBody withBucketName(String bucketName) {
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

    public UpdateTrackerRequestBody withFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
        return this;
    }

    


    /**
     * 标识需要存储于OBS的日志文件前缀，0-9，a-z，A-Z，'-'，'.'，'_'长度为0～64字符。
     * @return filePrefixName
     */
    public String getFilePrefixName() {
        return filePrefixName;
    }

    public void setFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
    }

    public UpdateTrackerRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 标识追踪器状态，该接口中可修改的状态包括正常（enabled）和停止（disabled）。如果选择修改状态为停止，则修改成功后追踪器停止记录事件。'.'，'_'长度为0～64字符。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateTrackerRequestBody withIsObsCreated(Boolean isObsCreated) {
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

    public UpdateTrackerRequestBody withIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
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

    public UpdateTrackerRequestBody withKmsId(String kmsId) {
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

    public UpdateTrackerRequestBody withLts(Lts lts) {
        this.lts = lts;
        return this;
    }

    public UpdateTrackerRequestBody withLts(Consumer<Lts> ltsSetter) {
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

    public UpdateTrackerRequestBody withLogFileValidate(LogFileValidate logFileValidate) {
        this.logFileValidate = logFileValidate;
        return this;
    }

    public UpdateTrackerRequestBody withLogFileValidate(Consumer<LogFileValidate> logFileValidateSetter) {
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
        UpdateTrackerRequestBody updateTrackerRequestBody = (UpdateTrackerRequestBody) o;
        return Objects.equals(this.bucketName, updateTrackerRequestBody.bucketName) &&
            Objects.equals(this.filePrefixName, updateTrackerRequestBody.filePrefixName) &&
            Objects.equals(this.status, updateTrackerRequestBody.status) &&
            Objects.equals(this.isObsCreated, updateTrackerRequestBody.isObsCreated) &&
            Objects.equals(this.isSupportTraceFilesEncryption, updateTrackerRequestBody.isSupportTraceFilesEncryption) &&
            Objects.equals(this.kmsId, updateTrackerRequestBody.kmsId) &&
            Objects.equals(this.lts, updateTrackerRequestBody.lts) &&
            Objects.equals(this.logFileValidate, updateTrackerRequestBody.logFileValidate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucketName, filePrefixName, status, isObsCreated, isSupportTraceFilesEncryption, kmsId, lts, logFileValidate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrackerRequestBody {\n");
            sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
            sb.append("    filePrefixName: ").append(toIndentedString(filePrefixName)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

