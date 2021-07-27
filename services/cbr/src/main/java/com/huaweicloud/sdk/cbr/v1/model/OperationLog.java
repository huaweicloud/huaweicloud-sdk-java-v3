package com.huaweicloud.sdk.cbr.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.OpErrorInfo;
import com.huaweicloud.sdk.cbr.v1.model.OpExtraInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OperationLog
 */
public class OperationLog  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checkpoint_id")
    
    private String checkpointId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ended_at")
    
    private String endedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_info")
    
    private OpErrorInfo errorInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_info")
    
    private OpExtraInfo extraInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * 任务类型
     */
    public static final class OperationTypeEnum {

        
        /**
         * Enum BACKUP for value: "backup"
         */
        public static final OperationTypeEnum BACKUP = new OperationTypeEnum("backup");
        
        /**
         * Enum COPY for value: "copy"
         */
        public static final OperationTypeEnum COPY = new OperationTypeEnum("copy");
        
        /**
         * Enum REPLICATION for value: "replication"
         */
        public static final OperationTypeEnum REPLICATION = new OperationTypeEnum("replication");
        
        /**
         * Enum RESTORE for value: "restore"
         */
        public static final OperationTypeEnum RESTORE = new OperationTypeEnum("restore");
        
        /**
         * Enum DELETE for value: "delete"
         */
        public static final OperationTypeEnum DELETE = new OperationTypeEnum("delete");
        
        /**
         * Enum SYNC for value: "sync"
         */
        public static final OperationTypeEnum SYNC = new OperationTypeEnum("sync");
        
        /**
         * Enum VAULT_DELETE for value: "vault_delete"
         */
        public static final OperationTypeEnum VAULT_DELETE = new OperationTypeEnum("vault_delete");
        
        /**
         * Enum REMOVE_RESOURCE for value: "remove_resource"
         */
        public static final OperationTypeEnum REMOVE_RESOURCE = new OperationTypeEnum("remove_resource");
        

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("copy", COPY);
            map.put("replication", REPLICATION);
            map.put("restore", RESTORE);
            map.put("delete", DELETE);
            map.put("sync", SYNC);
            map.put("vault_delete", VAULT_DELETE);
            map.put("remove_resource", REMOVE_RESOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OperationTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationTypeEnum(value);
            }
            return result;
        }

        public static OperationTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_type")
    
    private OperationTypeEnum operationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_id")
    
    private String policyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider_id")
    
    private String providerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="started_at")
    
    private String startedAt;
    /**
     * 任务状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");
        
        /**
         * Enum SKIPPED for value: "skipped"
         */
        public static final StatusEnum SKIPPED = new StatusEnum("skipped");
        
        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");
        
        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");
        
        /**
         * Enum TIMEOUT for value: "timeout"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("timeout");
        
        /**
         * Enum WAITING for value: "waiting"
         */
        public static final StatusEnum WAITING = new StatusEnum("waiting");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("skipped", SKIPPED);
            map.put("failed", FAILED);
            map.put("running", RUNNING);
            map.put("timeout", TIMEOUT);
            map.put("waiting", WAITING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
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
            if (obj instanceof StatusEnum) {
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
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault_id")
    
    private String vaultId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault_name")
    
    private String vaultName;

    public OperationLog withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    


    /**
     * 备份记录id
     * @return checkpointId
     */
    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    

    public OperationLog withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 创建时间,例如: \"2020-02-23T01:00:32Z\"
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public OperationLog withEndedAt(String endedAt) {
        this.endedAt = endedAt;
        return this;
    }

    


    /**
     * 任务结束时间,例如: \"2020-02-23T01:00:32Z\"
     * @return endedAt
     */
    public String getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(String endedAt) {
        this.endedAt = endedAt;
    }

    

    public OperationLog withErrorInfo(OpErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public OperationLog withErrorInfo(Consumer<OpErrorInfo> errorInfoSetter) {
        if(this.errorInfo == null ){
            this.errorInfo = new OpErrorInfo();
            errorInfoSetter.accept(this.errorInfo);
        }
        
        return this;
    }


    /**
     * Get errorInfo
     * @return errorInfo
     */
    public OpErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(OpErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    

    public OperationLog withExtraInfo(OpExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public OperationLog withExtraInfo(Consumer<OpExtraInfo> extraInfoSetter) {
        if(this.extraInfo == null ){
            this.extraInfo = new OpExtraInfo();
            extraInfoSetter.accept(this.extraInfo);
        }
        
        return this;
    }


    /**
     * Get extraInfo
     * @return extraInfo
     */
    public OpExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(OpExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    

    public OperationLog withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public OperationLog withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    


    /**
     * 任务类型
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    

    public OperationLog withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    


    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    

    public OperationLog withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public OperationLog withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    


    /**
     * 备份提供商ID。用于区分备份对象。
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    

    public OperationLog withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    


    /**
     * 任务开始时间,例如: \"2020-02-23T01:00:32Z\"
     * @return startedAt
     */
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    

    public OperationLog withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public OperationLog withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 修改时间,例如: \"2020-02-23T01:00:32Z\"
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    public OperationLog withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    


    /**
     * 任务操作资源所属存储库ID
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    

    public OperationLog withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    


    /**
     * 任务操作资源所属存储库名称
     * @return vaultName
     */
    public String getVaultName() {
        return vaultName;
    }

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperationLog operationLog = (OperationLog) o;
        return Objects.equals(this.checkpointId, operationLog.checkpointId) &&
            Objects.equals(this.createdAt, operationLog.createdAt) &&
            Objects.equals(this.endedAt, operationLog.endedAt) &&
            Objects.equals(this.errorInfo, operationLog.errorInfo) &&
            Objects.equals(this.extraInfo, operationLog.extraInfo) &&
            Objects.equals(this.id, operationLog.id) &&
            Objects.equals(this.operationType, operationLog.operationType) &&
            Objects.equals(this.policyId, operationLog.policyId) &&
            Objects.equals(this.projectId, operationLog.projectId) &&
            Objects.equals(this.providerId, operationLog.providerId) &&
            Objects.equals(this.startedAt, operationLog.startedAt) &&
            Objects.equals(this.status, operationLog.status) &&
            Objects.equals(this.updatedAt, operationLog.updatedAt) &&
            Objects.equals(this.vaultId, operationLog.vaultId) &&
            Objects.equals(this.vaultName, operationLog.vaultName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checkpointId, createdAt, endedAt, errorInfo, extraInfo, id, operationType, policyId, projectId, providerId, startedAt, status, updatedAt, vaultId, vaultName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationLog {\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    vaultName: ").append(toIndentedString(vaultName)).append("\n");
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

