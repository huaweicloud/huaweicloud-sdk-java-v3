package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OpExtendInfoDelete
 */
public class OpExtendInfoDelete  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    
    private String backupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_name")
    
    private String backupName;

    public OpExtendInfoDelete withBackupId(String backupId) {
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

    

    public OpExtendInfoDelete withBackupName(String backupName) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpExtendInfoDelete opExtendInfoDelete = (OpExtendInfoDelete) o;
        return Objects.equals(this.backupId, opExtendInfoDelete.backupId) &&
            Objects.equals(this.backupName, opExtendInfoDelete.backupName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupId, backupName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExtendInfoDelete {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
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

