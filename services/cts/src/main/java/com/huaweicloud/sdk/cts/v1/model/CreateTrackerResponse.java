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
import com.huaweicloud.sdk.cts.v1.model.ObsInfo;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

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
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_support_trace_files_encryption")
    
    private Boolean isSupportTraceFilesEncryption;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kms_id")
    
    private String kmsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_info")
    
    private ObsInfo obsInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_name")
    
    private String trackerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_type")
    
    private String trackerType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lts")
    
    private Lts lts = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_file_validate")
    
    private LogFileValidate logFileValidate = null;

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

    public CreateTrackerResponse withIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
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

    public CreateTrackerResponse withKmsId(String kmsId) {
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

    public CreateTrackerResponse withObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public CreateTrackerResponse withObsInfo(Consumer<ObsInfo> obsInfoSetter) {
        if(this.obsInfo == null ){
            this.obsInfo = new ObsInfo();
        }
        obsInfoSetter.accept(this.obsInfo);
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

    public CreateTrackerResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 标识追踪器状态，该接口返回正常状态（enabled）。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateTrackerResponse withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    


    /**
     * 追踪器名称。
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public CreateTrackerResponse withTrackerType(String trackerType) {
        this.trackerType = trackerType;
        return this;
    }

    


    /**
     * 追踪器类型。
     * @return trackerType
     */
    public String getTrackerType() {
        return trackerType;
    }

    public void setTrackerType(String trackerType) {
        this.trackerType = trackerType;
    }

    public CreateTrackerResponse withLts(Lts lts) {
        this.lts = lts;
        return this;
    }

    public CreateTrackerResponse withLts(Consumer<Lts> ltsSetter) {
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

    public CreateTrackerResponse withLogFileValidate(LogFileValidate logFileValidate) {
        this.logFileValidate = logFileValidate;
        return this;
    }

    public CreateTrackerResponse withLogFileValidate(Consumer<LogFileValidate> logFileValidateSetter) {
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
        CreateTrackerResponse createTrackerResponse = (CreateTrackerResponse) o;
        return Objects.equals(this.id, createTrackerResponse.id) &&
            Objects.equals(this.createTime, createTrackerResponse.createTime) &&
            Objects.equals(this.domainId, createTrackerResponse.domainId) &&
            Objects.equals(this.projectId, createTrackerResponse.projectId) &&
            Objects.equals(this.isSupportTraceFilesEncryption, createTrackerResponse.isSupportTraceFilesEncryption) &&
            Objects.equals(this.kmsId, createTrackerResponse.kmsId) &&
            Objects.equals(this.obsInfo, createTrackerResponse.obsInfo) &&
            Objects.equals(this.status, createTrackerResponse.status) &&
            Objects.equals(this.trackerName, createTrackerResponse.trackerName) &&
            Objects.equals(this.trackerType, createTrackerResponse.trackerType) &&
            Objects.equals(this.lts, createTrackerResponse.lts) &&
            Objects.equals(this.logFileValidate, createTrackerResponse.logFileValidate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, domainId, projectId, isSupportTraceFilesEncryption, kmsId, obsInfo, status, trackerName, trackerType, lts, logFileValidate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrackerResponse {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
            sb.append("    isSupportTraceFilesEncryption: ").append(toIndentedString(isSupportTraceFilesEncryption)).append("\n");
            sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
            sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
            sb.append("    trackerType: ").append(toIndentedString(trackerType)).append("\n");
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

