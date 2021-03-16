package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OpExtendInfoRestore
 */
public class OpExtendInfoRestore  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    
    private String backupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_name")
    
    private String backupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_resource_id")
    
    private String targetResourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_resource_name")
    
    private String targetResourceName;

    public OpExtendInfoRestore withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    


    /**
     * 备份副本ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    

    public OpExtendInfoRestore withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    


    /**
     * 备份名称
     * @return backupName
     */
    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    

    public OpExtendInfoRestore withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    


    /**
     * 恢复目标资源ID
     * @return targetResourceId
     */
    public String getTargetResourceId() {
        return targetResourceId;
    }

    public void setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
    }

    

    public OpExtendInfoRestore withTargetResourceName(String targetResourceName) {
        this.targetResourceName = targetResourceName;
        return this;
    }

    


    /**
     * 恢复目标资源名称
     * @return targetResourceName
     */
    public String getTargetResourceName() {
        return targetResourceName;
    }

    public void setTargetResourceName(String targetResourceName) {
        this.targetResourceName = targetResourceName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpExtendInfoRestore opExtendInfoRestore = (OpExtendInfoRestore) o;
        return Objects.equals(this.backupId, opExtendInfoRestore.backupId) &&
            Objects.equals(this.backupName, opExtendInfoRestore.backupName) &&
            Objects.equals(this.targetResourceId, opExtendInfoRestore.targetResourceId) &&
            Objects.equals(this.targetResourceName, opExtendInfoRestore.targetResourceName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupId, backupName, targetResourceId, targetResourceName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExtendInfoRestore {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
        sb.append("    targetResourceId: ").append(toIndentedString(targetResourceId)).append("\n");
        sb.append("    targetResourceName: ").append(toIndentedString(targetResourceName)).append("\n");
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

