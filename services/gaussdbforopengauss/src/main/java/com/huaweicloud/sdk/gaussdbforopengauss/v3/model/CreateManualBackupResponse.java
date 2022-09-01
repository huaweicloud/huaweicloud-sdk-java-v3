package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BackupInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateManualBackupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup")
    
    @JacksonXmlProperty(localName = "backup")
    
    private BackupInfo backup;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    @JacksonXmlProperty(localName = "job_id")
    
    private String jobId;

    public CreateManualBackupResponse withBackup(BackupInfo backup) {
        this.backup = backup;
        return this;
    }

    public CreateManualBackupResponse withBackup(Consumer<BackupInfo> backupSetter) {
        if(this.backup == null ){
            this.backup = new BackupInfo();
            backupSetter.accept(this.backup);
        }
        
        return this;
    }


    /**
     * Get backup
     * @return backup
     */
    public BackupInfo getBackup() {
        return backup;
    }

    public void setBackup(BackupInfo backup) {
        this.backup = backup;
    }

    

    public CreateManualBackupResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateManualBackupResponse createManualBackupResponse = (CreateManualBackupResponse) o;
        return Objects.equals(this.backup, createManualBackupResponse.backup) &&
            Objects.equals(this.jobId, createManualBackupResponse.jobId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backup, jobId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateManualBackupResponse {\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

