package com.huaweicloud.sdk.cts.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cts.v3.model.DataBucketQuery;
import com.huaweicloud.sdk.cts.v3.model.Lts;
import com.huaweicloud.sdk.cts.v3.model.ObsInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateTrackerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kms_id")
    
    private String kmsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_support_validate")
    
    private Boolean isSupportValidate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lts")
    
    private Lts lts;
    /**
     * 标识追踪器类型。 目前支持系统追踪器类型有管理类追踪器（system）和数据类追踪器（data）。
     */
    public static final class TrackerTypeEnum {

        
        /**
         * Enum SYSTEM for value: "system"
         */
        public static final TrackerTypeEnum SYSTEM = new TrackerTypeEnum("system");
        
        /**
         * Enum DATA for value: "data"
         */
        public static final TrackerTypeEnum DATA = new TrackerTypeEnum("data");
        

        private static final Map<String, TrackerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TrackerTypeEnum> createStaticFields() {
            Map<String, TrackerTypeEnum> map = new HashMap<>();
            map.put("system", SYSTEM);
            map.put("data", DATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TrackerTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TrackerTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TrackerTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TrackerTypeEnum(value);
            }
            return result;
        }

        public static TrackerTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TrackerTypeEnum result = STATIC_FIELDS.get(value);
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
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_name")
    
    private String trackerName;
    /**
     * 标识追踪器状态，包括正常（enabled），停止（disabled）和异常（error）三种状态，状态为异常时需通过明细（detail）字段说明错误来源。
     */
    public static final class StatusEnum {

        
        /**
         * Enum ENABLED for value: "enabled"
         */
        public static final StatusEnum ENABLED = new StatusEnum("enabled");
        
        /**
         * Enum DISABLED for value: "disabled"
         */
        public static final StatusEnum DISABLED = new StatusEnum("disabled");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("enabled", ENABLED);
            map.put("disabled", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
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
    @JsonProperty(value="is_support_trace_files_encryption")
    
    private Boolean isSupportTraceFilesEncryption;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_info")
    
    private ObsInfo obsInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_bucket")
    
    private DataBucketQuery dataBucket;

    public CreateTrackerResponse withId(String id) {
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

    

    public CreateTrackerResponse withCreateTime(Long createTime) {
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

    

    public CreateTrackerResponse withKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }

    


    /**
     * 事件文件转储加密所采用的秘钥id（从KMS获取）。 当\"tracker_type\"参数值为\"system\"和\"is_support_trace_files_encryption\"参数值为“是”时，此参数为必选项。
     * @return kmsId
     */
    public String getKmsId() {
        return kmsId;
    }

    public void setKmsId(String kmsId) {
        this.kmsId = kmsId;
    }

    

    public CreateTrackerResponse withIsSupportValidate(Boolean isSupportValidate) {
        this.isSupportValidate = isSupportValidate;
        return this;
    }

    


    /**
     * 是否打开事件文件校验。当前环境仅\"tracker_type\"参数值为\"system\"时支持该功能。
     * @return isSupportValidate
     */
    public Boolean getIsSupportValidate() {
        return isSupportValidate;
    }

    public void setIsSupportValidate(Boolean isSupportValidate) {
        this.isSupportValidate = isSupportValidate;
    }

    

    public CreateTrackerResponse withLts(Lts lts) {
        this.lts = lts;
        return this;
    }

    public CreateTrackerResponse withLts(Consumer<Lts> ltsSetter) {
        if(this.lts == null ){
            this.lts = new Lts();
            ltsSetter.accept(this.lts);
        }
        
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

    

    public CreateTrackerResponse withTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
        return this;
    }

    


    /**
     * 标识追踪器类型。 目前支持系统追踪器类型有管理类追踪器（system）和数据类追踪器（data）。
     * @return trackerType
     */
    public TrackerTypeEnum getTrackerType() {
        return trackerType;
    }

    public void setTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
    }

    

    public CreateTrackerResponse withDomainId(String domainId) {
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

    

    public CreateTrackerResponse withProjectId(String projectId) {
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

    

    public CreateTrackerResponse withTrackerName(String trackerName) {
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

    

    public CreateTrackerResponse withStatus(StatusEnum status) {
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

    

    public CreateTrackerResponse withDetail(String detail) {
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

    

    public CreateTrackerResponse withIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
        return this;
    }

    


    /**
     * 事件文件转储加密功能开关。 该参数必须与kms_id参数同时使用。 当前环境仅\"tracker_type\"参数值为\"system\"时支持该功能。
     * @return isSupportTraceFilesEncryption
     */
    public Boolean getIsSupportTraceFilesEncryption() {
        return isSupportTraceFilesEncryption;
    }

    public void setIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
    }

    

    public CreateTrackerResponse withObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public CreateTrackerResponse withObsInfo(Consumer<ObsInfo> obsInfoSetter) {
        if(this.obsInfo == null ){
            this.obsInfo = new ObsInfo();
            obsInfoSetter.accept(this.obsInfo);
        }
        
        return this;
    }


    /**
     * Get obsInfo
     * @return obsInfo
     */
    public ObsInfo getObsInfo() {
        return obsInfo;
    }

    public void setObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
    }

    

    public CreateTrackerResponse withDataBucket(DataBucketQuery dataBucket) {
        this.dataBucket = dataBucket;
        return this;
    }

    public CreateTrackerResponse withDataBucket(Consumer<DataBucketQuery> dataBucketSetter) {
        if(this.dataBucket == null ){
            this.dataBucket = new DataBucketQuery();
            dataBucketSetter.accept(this.dataBucket);
        }
        
        return this;
    }


    /**
     * Get dataBucket
     * @return dataBucket
     */
    public DataBucketQuery getDataBucket() {
        return dataBucket;
    }

    public void setDataBucket(DataBucketQuery dataBucket) {
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
        CreateTrackerResponse createTrackerResponse = (CreateTrackerResponse) o;
        return Objects.equals(this.id, createTrackerResponse.id) &&
            Objects.equals(this.createTime, createTrackerResponse.createTime) &&
            Objects.equals(this.kmsId, createTrackerResponse.kmsId) &&
            Objects.equals(this.isSupportValidate, createTrackerResponse.isSupportValidate) &&
            Objects.equals(this.lts, createTrackerResponse.lts) &&
            Objects.equals(this.trackerType, createTrackerResponse.trackerType) &&
            Objects.equals(this.domainId, createTrackerResponse.domainId) &&
            Objects.equals(this.projectId, createTrackerResponse.projectId) &&
            Objects.equals(this.trackerName, createTrackerResponse.trackerName) &&
            Objects.equals(this.status, createTrackerResponse.status) &&
            Objects.equals(this.detail, createTrackerResponse.detail) &&
            Objects.equals(this.isSupportTraceFilesEncryption, createTrackerResponse.isSupportTraceFilesEncryption) &&
            Objects.equals(this.obsInfo, createTrackerResponse.obsInfo) &&
            Objects.equals(this.dataBucket, createTrackerResponse.dataBucket);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, kmsId, isSupportValidate, lts, trackerType, domainId, projectId, trackerName, status, detail, isSupportTraceFilesEncryption, obsInfo, dataBucket);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrackerResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
        sb.append("    isSupportValidate: ").append(toIndentedString(isSupportValidate)).append("\n");
        sb.append("    lts: ").append(toIndentedString(lts)).append("\n");
        sb.append("    trackerType: ").append(toIndentedString(trackerType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    isSupportTraceFilesEncryption: ").append(toIndentedString(isSupportTraceFilesEncryption)).append("\n");
        sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
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

