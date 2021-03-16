package com.huaweicloud.sdk.cbr.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.CheckpointExtraInfoResp;
import com.huaweicloud.sdk.cbr.v1.model.CheckpointPlanCreate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CheckpointCreate
 */
public class CheckpointCreate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;
    /**
     * 状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("available");
        
        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");
        
        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");
        
        /**
         * Enum RESTORING for value: "restoring"
         */
        public static final StatusEnum RESTORING = new StatusEnum("restoring");
        
        /**
         * Enum ERROR for value: "error"
         */
        public static final StatusEnum ERROR = new StatusEnum("error");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("deleting", DELETING);
            map.put("creating", CREATING);
            map.put("restoring", RESTORING);
            map.put("error", ERROR);
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
    @JsonProperty(value="vault")
    
    private CheckpointPlanCreate vault;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_info")
    
    private CheckpointExtraInfoResp extraInfo;

    public CheckpointCreate withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 创建时间，例如:\"2020-02-05T10:38:34.209782\"
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public CheckpointCreate withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 还原点ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public CheckpointCreate withProjectId(String projectId) {
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

    

    public CheckpointCreate withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public CheckpointCreate withVault(CheckpointPlanCreate vault) {
        this.vault = vault;
        return this;
    }

    public CheckpointCreate withVault(Consumer<CheckpointPlanCreate> vaultSetter) {
        if(this.vault == null ){
            this.vault = new CheckpointPlanCreate();
            vaultSetter.accept(this.vault);
        }
        
        return this;
    }


    /**
     * Get vault
     * @return vault
     */
    public CheckpointPlanCreate getVault() {
        return vault;
    }

    public void setVault(CheckpointPlanCreate vault) {
        this.vault = vault;
    }

    

    public CheckpointCreate withExtraInfo(CheckpointExtraInfoResp extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public CheckpointCreate withExtraInfo(Consumer<CheckpointExtraInfoResp> extraInfoSetter) {
        if(this.extraInfo == null ){
            this.extraInfo = new CheckpointExtraInfoResp();
            extraInfoSetter.accept(this.extraInfo);
        }
        
        return this;
    }


    /**
     * Get extraInfo
     * @return extraInfo
     */
    public CheckpointExtraInfoResp getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(CheckpointExtraInfoResp extraInfo) {
        this.extraInfo = extraInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointCreate checkpointCreate = (CheckpointCreate) o;
        return Objects.equals(this.createdAt, checkpointCreate.createdAt) &&
            Objects.equals(this.id, checkpointCreate.id) &&
            Objects.equals(this.projectId, checkpointCreate.projectId) &&
            Objects.equals(this.status, checkpointCreate.status) &&
            Objects.equals(this.vault, checkpointCreate.vault) &&
            Objects.equals(this.extraInfo, checkpointCreate.extraInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createdAt, id, projectId, status, vault, extraInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointCreate {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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

