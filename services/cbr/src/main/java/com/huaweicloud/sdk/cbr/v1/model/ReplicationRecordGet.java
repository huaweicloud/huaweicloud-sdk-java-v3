package com.huaweicloud.sdk.cbr.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ReplicationRecordGet  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_backup_id")
    
    private String destinationBackupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_checkpoint_id")
    
    private String destinationCheckpointId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_project_id")
    
    private String destinationProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_region")
    
    private String destinationRegion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_vault_id")
    
    private String destinationVaultId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_info")
    
    private String extraInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_backup_id")
    
    private String sourceBackupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_checkpoint_id")
    
    private String sourceCheckpointId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_project_id")
    
    private String sourceProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_region")
    
    private String sourceRegion;
    /**
     * 复制的状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum REPLICATING for value: "replicating"
         */
        public static final StatusEnum REPLICATING = new StatusEnum("replicating");
        
        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");
        
        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");
        
        /**
         * Enum SKIP for value: "skip"
         */
        public static final StatusEnum SKIP = new StatusEnum("skip");
        
        /**
         * Enum WAITING_REPLICATE for value: "waiting_replicate"
         */
        public static final StatusEnum WAITING_REPLICATE = new StatusEnum("waiting_replicate");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("replicating", REPLICATING);
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            map.put("skip", SKIP);
            map.put("waiting_replicate", WAITING_REPLICATE);
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
    @JsonProperty(value="vault_id")
    
    private String vaultId;

    public ReplicationRecordGet withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 复制的开始时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public ReplicationRecordGet withDestinationBackupId(String destinationBackupId) {
        this.destinationBackupId = destinationBackupId;
        return this;
    }

    


    /**
     * 复制的目的备份ID
     * @return destinationBackupId
     */
    public String getDestinationBackupId() {
        return destinationBackupId;
    }

    public void setDestinationBackupId(String destinationBackupId) {
        this.destinationBackupId = destinationBackupId;
    }

    

    public ReplicationRecordGet withDestinationCheckpointId(String destinationCheckpointId) {
        this.destinationCheckpointId = destinationCheckpointId;
        return this;
    }

    


    /**
     * 复制的目的备份记录ID
     * @return destinationCheckpointId
     */
    public String getDestinationCheckpointId() {
        return destinationCheckpointId;
    }

    public void setDestinationCheckpointId(String destinationCheckpointId) {
        this.destinationCheckpointId = destinationCheckpointId;
    }

    

    public ReplicationRecordGet withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    


    /**
     * 复制的目标项目ID
     * @return destinationProjectId
     */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    

    public ReplicationRecordGet withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    


    /**
     * 复制的目标区域
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    

    public ReplicationRecordGet withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    


    /**
     * 目标存储库ID
     * @return destinationVaultId
     */
    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    

    public ReplicationRecordGet withExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    


    /**
     * 复制附加信息
     * @return extraInfo
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    

    public ReplicationRecordGet withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 复制记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ReplicationRecordGet withSourceBackupId(String sourceBackupId) {
        this.sourceBackupId = sourceBackupId;
        return this;
    }

    


    /**
     * 复制的源备份ID
     * @return sourceBackupId
     */
    public String getSourceBackupId() {
        return sourceBackupId;
    }

    public void setSourceBackupId(String sourceBackupId) {
        this.sourceBackupId = sourceBackupId;
    }

    

    public ReplicationRecordGet withSourceCheckpointId(String sourceCheckpointId) {
        this.sourceCheckpointId = sourceCheckpointId;
        return this;
    }

    


    /**
     * 复制的源备份记录ID
     * @return sourceCheckpointId
     */
    public String getSourceCheckpointId() {
        return sourceCheckpointId;
    }

    public void setSourceCheckpointId(String sourceCheckpointId) {
        this.sourceCheckpointId = sourceCheckpointId;
    }

    

    public ReplicationRecordGet withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    


    /**
     * 复制的源项目ID
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    

    public ReplicationRecordGet withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    


    /**
     * 复制的源区域
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    

    public ReplicationRecordGet withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 复制的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public ReplicationRecordGet withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    


    /**
     * 备份所在的存储库ID
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationRecordGet replicationRecordGet = (ReplicationRecordGet) o;
        return Objects.equals(this.createdAt, replicationRecordGet.createdAt) &&
            Objects.equals(this.destinationBackupId, replicationRecordGet.destinationBackupId) &&
            Objects.equals(this.destinationCheckpointId, replicationRecordGet.destinationCheckpointId) &&
            Objects.equals(this.destinationProjectId, replicationRecordGet.destinationProjectId) &&
            Objects.equals(this.destinationRegion, replicationRecordGet.destinationRegion) &&
            Objects.equals(this.destinationVaultId, replicationRecordGet.destinationVaultId) &&
            Objects.equals(this.extraInfo, replicationRecordGet.extraInfo) &&
            Objects.equals(this.id, replicationRecordGet.id) &&
            Objects.equals(this.sourceBackupId, replicationRecordGet.sourceBackupId) &&
            Objects.equals(this.sourceCheckpointId, replicationRecordGet.sourceCheckpointId) &&
            Objects.equals(this.sourceProjectId, replicationRecordGet.sourceProjectId) &&
            Objects.equals(this.sourceRegion, replicationRecordGet.sourceRegion) &&
            Objects.equals(this.status, replicationRecordGet.status) &&
            Objects.equals(this.vaultId, replicationRecordGet.vaultId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createdAt, destinationBackupId, destinationCheckpointId, destinationProjectId, destinationRegion, destinationVaultId, extraInfo, id, sourceBackupId, sourceCheckpointId, sourceProjectId, sourceRegion, status, vaultId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationRecordGet {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    destinationBackupId: ").append(toIndentedString(destinationBackupId)).append("\n");
        sb.append("    destinationCheckpointId: ").append(toIndentedString(destinationCheckpointId)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceBackupId: ").append(toIndentedString(sourceBackupId)).append("\n");
        sb.append("    sourceCheckpointId: ").append(toIndentedString(sourceCheckpointId)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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

