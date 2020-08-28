package com.huaweicloud.sdk.cloudpipeline.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 分页查询对象Query
 */
public class SlaveRegister  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slave_name")
    
    private String slaveName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="work_dir")
    
    private String workDir;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retry")
    
    private Boolean retry = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner_type")
    
    private String ownerType = "customer";

    public SlaveRegister withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * cluster ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public SlaveRegister withSlaveName(String slaveName) {
        this.slaveName = slaveName;
        return this;
    }

    


    /**
     * Slave名称
     * @return slaveName
     */
    public String getSlaveName() {
        return slaveName;
    }

    public void setSlaveName(String slaveName) {
        this.slaveName = slaveName;
    }

    public SlaveRegister withWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }

    


    /**
     * Slave工作空间
     * @return workDir
     */
    public String getWorkDir() {
        return workDir;
    }

    public void setWorkDir(String workDir) {
        this.workDir = workDir;
    }

    public SlaveRegister withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * Slave label
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public SlaveRegister withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * agent版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SlaveRegister withRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    


    /**
     * 是否重试
     * @return retry
     */
    public Boolean getRetry() {
        return retry;
    }

    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    public SlaveRegister withOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    


    /**
     * Slave ownerType
     * @return ownerType
     */
    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlaveRegister slaveRegister = (SlaveRegister) o;
        return Objects.equals(this.clusterId, slaveRegister.clusterId) &&
            Objects.equals(this.slaveName, slaveRegister.slaveName) &&
            Objects.equals(this.workDir, slaveRegister.workDir) &&
            Objects.equals(this.label, slaveRegister.label) &&
            Objects.equals(this.version, slaveRegister.version) &&
            Objects.equals(this.retry, slaveRegister.retry) &&
            Objects.equals(this.ownerType, slaveRegister.ownerType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, slaveName, workDir, label, version, retry, ownerType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlaveRegister {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    slaveName: ").append(toIndentedString(slaveName)).append("\n");
        sb.append("    workDir: ").append(toIndentedString(workDir)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
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

