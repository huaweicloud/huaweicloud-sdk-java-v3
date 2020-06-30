package com.huaweicloud.sdk.cts.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cts.v3.model.DataBucket;
import com.huaweicloud.sdk.cts.v3.model.TrackerObsInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateTrackerRequestBody
 */
public class CreateTrackerRequestBody  {

    /**
     * 标识追踪器类型。 目前支持系统追踪器类型有管理类追踪器(system)和数据类追踪器(data)。 数据类追踪器和管理类追踪器共同参数有：is_lts_enabled, obs_info; 管理类追踪器参数：is_support_trace_files_encryption, kms_id, is_support_validate, is_support_validate; 数据类追踪器参数：tracker_name, data_bucket。
     */
    public static class TrackerTypeEnum {

        
        /**
         * Enum SYSTEM for value: "system"
         */
        public static final TrackerTypeEnum SYSTEM = new TrackerTypeEnum("system");
        
        /**
         * Enum DATA for value: "data"
         */
        public static final TrackerTypeEnum DATA = new TrackerTypeEnum("data");
        

        public static final Map<String, TrackerTypeEnum> staticFields = new HashMap<String, TrackerTypeEnum>() {
            { 
                put("system", SYSTEM);
                put("data", DATA);
            }
        };

        private String value;

        TrackerTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TrackerTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TrackerTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TrackerTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TrackerTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TrackerTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TrackerTypeEnum) {
                return this.value.equals(((TrackerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_type")
    
    private TrackerTypeEnum trackerType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_name")
    
    private String trackerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_lts_enabled")
    
    private Boolean isLtsEnabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_info")
    
    private TrackerObsInfo obsInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_support_trace_files_encryption")
    
    private Boolean isSupportTraceFilesEncryption;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kms_id")
    
    private String kmsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_support_validate")
    
    private Boolean isSupportValidate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_bucket")
    
    private DataBucket dataBucket = null;

    public CreateTrackerRequestBody withTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
        return this;
    }

    


    /**
     * 标识追踪器类型。 目前支持系统追踪器类型有管理类追踪器(system)和数据类追踪器(data)。 数据类追踪器和管理类追踪器共同参数有：is_lts_enabled, obs_info; 管理类追踪器参数：is_support_trace_files_encryption, kms_id, is_support_validate, is_support_validate; 数据类追踪器参数：tracker_name, data_bucket。
     * @return trackerType
     */
    public TrackerTypeEnum getTrackerType() {
        return trackerType;
    }

    public void setTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
    }

    public CreateTrackerRequestBody withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    


    /**
     * 标识追踪器名称。 当\"tracker_type\"参数值为\"system\"时该参数为默认值\"system\"。 当\"tracker_type\"参数值为\"data\"时该参数需要指定追踪器名称\"。
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public CreateTrackerRequestBody withIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
        return this;
    }

    


    /**
     * 是否打开事件分析。
     * @return isLtsEnabled
     */
    public Boolean getIsLtsEnabled() {
        return isLtsEnabled;
    }

    public void setIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
    }

    public CreateTrackerRequestBody withObsInfo(TrackerObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public CreateTrackerRequestBody withObsInfo(Consumer<TrackerObsInfo> obsInfoSetter) {
        if(this.obsInfo == null ){
            this.obsInfo = new TrackerObsInfo();
            obsInfoSetter.accept(this.obsInfo);
        }
        
        return this;
    }


    /**
     * Get obsInfo
     * @return obsInfo
     */
    public TrackerObsInfo getObsInfo() {
        return obsInfo;
    }

    public void setObsInfo(TrackerObsInfo obsInfo) {
        this.obsInfo = obsInfo;
    }

    public CreateTrackerRequestBody withIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
        return this;
    }

    


    /**
     * 事件文件转储加密功能开关。 当\"tracker_type\"参数值为\"system\"时该参数值有效。 该参数必须与kms_id参数同时使用。
     * @return isSupportTraceFilesEncryption
     */
    public Boolean getIsSupportTraceFilesEncryption() {
        return isSupportTraceFilesEncryption;
    }

    public void setIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
    }

    public CreateTrackerRequestBody withKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }

    


    /**
     * 事件文件转储加密所采用的秘钥id（从KMS获取）。 当\"tracker_type\"参数值为\"system\"时该参数值有效。 当\"is_support_trace_files_encryption\"参数值为“是”时，此参数为必选项。
     * @return kmsId
     */
    public String getKmsId() {
        return kmsId;
    }

    public void setKmsId(String kmsId) {
        this.kmsId = kmsId;
    }

    public CreateTrackerRequestBody withIsSupportValidate(Boolean isSupportValidate) {
        this.isSupportValidate = isSupportValidate;
        return this;
    }

    


    /**
     * 事件文件转储时是否打开事件文件校验。 当\"tracker_type\"参数值为\"system\"时该参数值有效。
     * @return isSupportValidate
     */
    public Boolean getIsSupportValidate() {
        return isSupportValidate;
    }

    public void setIsSupportValidate(Boolean isSupportValidate) {
        this.isSupportValidate = isSupportValidate;
    }

    public CreateTrackerRequestBody withDataBucket(DataBucket dataBucket) {
        this.dataBucket = dataBucket;
        return this;
    }

    public CreateTrackerRequestBody withDataBucket(Consumer<DataBucket> dataBucketSetter) {
        if(this.dataBucket == null ){
            this.dataBucket = new DataBucket();
            dataBucketSetter.accept(this.dataBucket);
        }
        
        return this;
    }


    /**
     * Get dataBucket
     * @return dataBucket
     */
    public DataBucket getDataBucket() {
        return dataBucket;
    }

    public void setDataBucket(DataBucket dataBucket) {
        this.dataBucket = dataBucket;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTrackerRequestBody createTrackerRequestBody = (CreateTrackerRequestBody) o;
        return Objects.equals(this.trackerType, createTrackerRequestBody.trackerType) &&
            Objects.equals(this.trackerName, createTrackerRequestBody.trackerName) &&
            Objects.equals(this.isLtsEnabled, createTrackerRequestBody.isLtsEnabled) &&
            Objects.equals(this.obsInfo, createTrackerRequestBody.obsInfo) &&
            Objects.equals(this.isSupportTraceFilesEncryption, createTrackerRequestBody.isSupportTraceFilesEncryption) &&
            Objects.equals(this.kmsId, createTrackerRequestBody.kmsId) &&
            Objects.equals(this.isSupportValidate, createTrackerRequestBody.isSupportValidate) &&
            Objects.equals(this.dataBucket, createTrackerRequestBody.dataBucket);
    }
    @Override
    public int hashCode() {
        return Objects.hash(trackerType, trackerName, isLtsEnabled, obsInfo, isSupportTraceFilesEncryption, kmsId, isSupportValidate, dataBucket);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrackerRequestBody {\n");
        sb.append("    trackerType: ").append(toIndentedString(trackerType)).append("\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
        sb.append("    isLtsEnabled: ").append(toIndentedString(isLtsEnabled)).append("\n");
        sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
        sb.append("    isSupportTraceFilesEncryption: ").append(toIndentedString(isSupportTraceFilesEncryption)).append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
        sb.append("    isSupportValidate: ").append(toIndentedString(isSupportValidate)).append("\n");
        sb.append("    dataBucket: ").append(toIndentedString(dataBucket)).append("\n");
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

