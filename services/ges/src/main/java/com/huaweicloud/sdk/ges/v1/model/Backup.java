package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 图备份
 */
public class Backup  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    @JacksonXmlProperty(localName = "id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backupMethod")
    
    @JacksonXmlProperty(localName = "backupMethod")
    
    private String backupMethod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graphId")
    
    @JacksonXmlProperty(localName = "graphId")
    
    private String graphId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graphName")
    
    @JacksonXmlProperty(localName = "graphName")
    
    private String graphName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graphStatus")
    
    @JacksonXmlProperty(localName = "graphStatus")
    
    private String graphStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graphSizeTypeIndex")
    
    @JacksonXmlProperty(localName = "graphSizeTypeIndex")
    
    private String graphSizeTypeIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dataStoreVersion")
    
    @JacksonXmlProperty(localName = "dataStoreVersion")
    
    private String dataStoreVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    @JacksonXmlProperty(localName = "arch")
    
    private String arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    @JacksonXmlProperty(localName = "status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTimestamp")
    
    @JacksonXmlProperty(localName = "startTimestamp")
    
    private Long startTimestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    @JacksonXmlProperty(localName = "startTime")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTimestamp")
    
    @JacksonXmlProperty(localName = "endTimestamp")
    
    private Long endTimestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    @JacksonXmlProperty(localName = "endTime")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    @JacksonXmlProperty(localName = "size")
    
    private Long size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    @JacksonXmlProperty(localName = "duration")
    
    private Long duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypted")
    
    @JacksonXmlProperty(localName = "encrypted")
    
    private Boolean encrypted;

    public Backup withId(String id) {
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

    

    public Backup withName(String name) {
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

    

    public Backup withBackupMethod(String backupMethod) {
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

    

    public Backup withGraphId(String graphId) {
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

    

    public Backup withGraphName(String graphName) {
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

    

    public Backup withGraphStatus(String graphStatus) {
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

    

    public Backup withGraphSizeTypeIndex(String graphSizeTypeIndex) {
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

    

    public Backup withDataStoreVersion(String dataStoreVersion) {
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

    

    public Backup withArch(String arch) {
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

    

    public Backup withStatus(String status) {
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

    

    public Backup withStartTimestamp(Long startTimestamp) {
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

    

    public Backup withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 备份时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public Backup withEndTimestamp(Long endTimestamp) {
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

    

    public Backup withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 备份时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public Backup withSize(Long size) {
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

    

    public Backup withDuration(Long duration) {
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

    

    public Backup withEncrypted(Boolean encrypted) {
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
        Backup backup = (Backup) o;
        return Objects.equals(this.id, backup.id) &&
            Objects.equals(this.name, backup.name) &&
            Objects.equals(this.backupMethod, backup.backupMethod) &&
            Objects.equals(this.graphId, backup.graphId) &&
            Objects.equals(this.graphName, backup.graphName) &&
            Objects.equals(this.graphStatus, backup.graphStatus) &&
            Objects.equals(this.graphSizeTypeIndex, backup.graphSizeTypeIndex) &&
            Objects.equals(this.dataStoreVersion, backup.dataStoreVersion) &&
            Objects.equals(this.arch, backup.arch) &&
            Objects.equals(this.status, backup.status) &&
            Objects.equals(this.startTimestamp, backup.startTimestamp) &&
            Objects.equals(this.startTime, backup.startTime) &&
            Objects.equals(this.endTimestamp, backup.endTimestamp) &&
            Objects.equals(this.endTime, backup.endTime) &&
            Objects.equals(this.size, backup.size) &&
            Objects.equals(this.duration, backup.duration) &&
            Objects.equals(this.encrypted, backup.encrypted);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, backupMethod, graphId, graphName, graphStatus, graphSizeTypeIndex, dataStoreVersion, arch, status, startTimestamp, startTime, endTimestamp, endTime, size, duration, encrypted);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Backup {\n");
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

