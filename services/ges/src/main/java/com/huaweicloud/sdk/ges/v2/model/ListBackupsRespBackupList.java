package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListBackupsRespBackupList
 */
public class ListBackupsRespBackupList  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_method")
    

    private String backupMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_id")
    

    private String graphId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_name")
    

    private String graphName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_status")
    

    private String graphStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_size_type_index")
    

    private String graphSizeTypeIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_store_version")
    

    private String dataStoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_timestamp")
    

    private Long startTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_timestamp")
    

    private Long endTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypted")
    

    private Boolean encrypted;

    public ListBackupsRespBackupList withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 备份ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListBackupsRespBackupList withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 备份名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListBackupsRespBackupList withBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }

    


    /**
     * 备份方法，取值为auto或manual。
     * @return backupMethod
     */
    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }

    

    public ListBackupsRespBackupList withGraphId(String graphId) {
        this.graphId = graphId;
        return this;
    }

    


    /**
     * 备份关联的图ID。
     * @return graphId
     */
    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    

    public ListBackupsRespBackupList withGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }

    


    /**
     * 备份关联的图Name。
     * @return graphName
     */
    public String getGraphName() {
        return graphName;
    }

    public void setGraphName(String graphName) {
        this.graphName = graphName;
    }

    

    public ListBackupsRespBackupList withGraphStatus(String graphStatus) {
        this.graphStatus = graphStatus;
        return this;
    }

    


    /**
     * 备份关联的图状态。
     * @return graphStatus
     */
    public String getGraphStatus() {
        return graphStatus;
    }

    public void setGraphStatus(String graphStatus) {
        this.graphStatus = graphStatus;
    }

    

    public ListBackupsRespBackupList withGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
        return this;
    }

    


    /**
     * 备份关联的图规格。
     * @return graphSizeTypeIndex
     */
    public String getGraphSizeTypeIndex() {
        return graphSizeTypeIndex;
    }

    public void setGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
    }

    

    public ListBackupsRespBackupList withDataStoreVersion(String dataStoreVersion) {
        this.dataStoreVersion = dataStoreVersion;
        return this;
    }

    


    /**
     * 备份关联的图版本。
     * @return dataStoreVersion
     */
    public String getDataStoreVersion() {
        return dataStoreVersion;
    }

    public void setDataStoreVersion(String dataStoreVersion) {
        this.dataStoreVersion = dataStoreVersion;
    }

    

    public ListBackupsRespBackupList withArch(String arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * 备份关联的图CPU架构。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    

    public ListBackupsRespBackupList withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 备份状态。  - backing_up：备份中 - success：备份成功 - failed：备份失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListBackupsRespBackupList withStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    


    /**
     * 备份开始时间戳。
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    

    public ListBackupsRespBackupList withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 备份开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ListBackupsRespBackupList withEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    


    /**
     * 备份结束时间戳。
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    

    public ListBackupsRespBackupList withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 备份结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ListBackupsRespBackupList withSize(Long size) {
        this.size = size;
        return this;
    }

    


    /**
     * 备份文件大小，单位为MB。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    

    public ListBackupsRespBackupList withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 备份时间，单位为秒。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    

    public ListBackupsRespBackupList withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    


    /**
     * 是否加密。true表示加密，默认值为\"false\"，不加密。
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupsRespBackupList listBackupsRespBackupList = (ListBackupsRespBackupList) o;
        return Objects.equals(this.id, listBackupsRespBackupList.id) &&
            Objects.equals(this.name, listBackupsRespBackupList.name) &&
            Objects.equals(this.backupMethod, listBackupsRespBackupList.backupMethod) &&
            Objects.equals(this.graphId, listBackupsRespBackupList.graphId) &&
            Objects.equals(this.graphName, listBackupsRespBackupList.graphName) &&
            Objects.equals(this.graphStatus, listBackupsRespBackupList.graphStatus) &&
            Objects.equals(this.graphSizeTypeIndex, listBackupsRespBackupList.graphSizeTypeIndex) &&
            Objects.equals(this.dataStoreVersion, listBackupsRespBackupList.dataStoreVersion) &&
            Objects.equals(this.arch, listBackupsRespBackupList.arch) &&
            Objects.equals(this.status, listBackupsRespBackupList.status) &&
            Objects.equals(this.startTimestamp, listBackupsRespBackupList.startTimestamp) &&
            Objects.equals(this.startTime, listBackupsRespBackupList.startTime) &&
            Objects.equals(this.endTimestamp, listBackupsRespBackupList.endTimestamp) &&
            Objects.equals(this.endTime, listBackupsRespBackupList.endTime) &&
            Objects.equals(this.size, listBackupsRespBackupList.size) &&
            Objects.equals(this.duration, listBackupsRespBackupList.duration) &&
            Objects.equals(this.encrypted, listBackupsRespBackupList.encrypted);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, backupMethod, graphId, graphName, graphStatus, graphSizeTypeIndex, dataStoreVersion, arch, status, startTimestamp, startTime, endTimestamp, endTime, size, duration, encrypted);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsRespBackupList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
        sb.append("    graphId: ").append(toIndentedString(graphId)).append("\n");
        sb.append("    graphName: ").append(toIndentedString(graphName)).append("\n");
        sb.append("    graphStatus: ").append(toIndentedString(graphStatus)).append("\n");
        sb.append("    graphSizeTypeIndex: ").append(toIndentedString(graphSizeTypeIndex)).append("\n");
        sb.append("    dataStoreVersion: ").append(toIndentedString(dataStoreVersion)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
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

