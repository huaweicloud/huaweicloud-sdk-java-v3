package com.huaweicloud.sdk.aos.v1.model;




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
 * stack resource api model
 */
public class StackResource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="physical_resource_id")
    
    
    private String physicalResourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="physical_resource_name")
    
    
    private String physicalResourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logical_resource_name")
    
    
    private String logicalResourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logical_resource_type")
    
    
    private String logicalResourceType;
    /**
     * 此次事件的类型 * `CREATION_IN_PROGRESS` - 正在生成 * `CREATION_FAILED`      - 生成失败 * `CREATION_COMPLETE`    - 生成完成 * `DELETION_IN_PROGRESS` - 正在删除 * `DELETION_FAILED`      - 删除失败 * `DELETION_COMPLETE`    - 已经删除 * `DELETION_SKIPPED`     - 跳过删除。未来我们将支持，用户可以从资源编排服务中删除，但是不真的删除资源本身 * `UPDATE_IN_PROGRESS`   - 正在更新。此处的更新特指非替换式更新，如果是替换式更新，则使用CREATION后DELETION * `UPDATE_FAILED`        - 更新失败。此处的更新特指非替换式更新，如果是替换式更新，则使用CREATION后DELETION * `UPDATE_COMPLETE`      - 更新完成。此处的更新特指非替换式更新，如果是替换式更新，则使用CREATION后DELETION
     */
    public static final class ResourceStatusEnum {

        
        /**
         * Enum CREATION_IN_PROGRESS for value: "CREATION_IN_PROGRESS"
         */
        public static final ResourceStatusEnum CREATION_IN_PROGRESS = new ResourceStatusEnum("CREATION_IN_PROGRESS");
        
        /**
         * Enum CREATION_FAILED for value: "CREATION_FAILED"
         */
        public static final ResourceStatusEnum CREATION_FAILED = new ResourceStatusEnum("CREATION_FAILED");
        
        /**
         * Enum CREATION_COMPLETE for value: "CREATION_COMPLETE"
         */
        public static final ResourceStatusEnum CREATION_COMPLETE = new ResourceStatusEnum("CREATION_COMPLETE");
        
        /**
         * Enum DELETION_IN_PROGRESS for value: "DELETION_IN_PROGRESS"
         */
        public static final ResourceStatusEnum DELETION_IN_PROGRESS = new ResourceStatusEnum("DELETION_IN_PROGRESS");
        
        /**
         * Enum DELETION_FAILED for value: "DELETION_FAILED"
         */
        public static final ResourceStatusEnum DELETION_FAILED = new ResourceStatusEnum("DELETION_FAILED");
        
        /**
         * Enum DELETION_COMPLETE for value: "DELETION_COMPLETE"
         */
        public static final ResourceStatusEnum DELETION_COMPLETE = new ResourceStatusEnum("DELETION_COMPLETE");
        
        /**
         * Enum DELETION_SKIPPED for value: "DELETION_SKIPPED"
         */
        public static final ResourceStatusEnum DELETION_SKIPPED = new ResourceStatusEnum("DELETION_SKIPPED");
        
        /**
         * Enum UPDATE_IN_PROGRESS for value: "UPDATE_IN_PROGRESS"
         */
        public static final ResourceStatusEnum UPDATE_IN_PROGRESS = new ResourceStatusEnum("UPDATE_IN_PROGRESS");
        
        /**
         * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
         */
        public static final ResourceStatusEnum UPDATE_FAILED = new ResourceStatusEnum("UPDATE_FAILED");
        
        /**
         * Enum UPDATE_COMPLETE for value: "UPDATE_COMPLETE"
         */
        public static final ResourceStatusEnum UPDATE_COMPLETE = new ResourceStatusEnum("UPDATE_COMPLETE");
        

        private static final Map<String, ResourceStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceStatusEnum> createStaticFields() {
            Map<String, ResourceStatusEnum> map = new HashMap<>();
            map.put("CREATION_IN_PROGRESS", CREATION_IN_PROGRESS);
            map.put("CREATION_FAILED", CREATION_FAILED);
            map.put("CREATION_COMPLETE", CREATION_COMPLETE);
            map.put("DELETION_IN_PROGRESS", DELETION_IN_PROGRESS);
            map.put("DELETION_FAILED", DELETION_FAILED);
            map.put("DELETION_COMPLETE", DELETION_COMPLETE);
            map.put("DELETION_SKIPPED", DELETION_SKIPPED);
            map.put("UPDATE_IN_PROGRESS", UPDATE_IN_PROGRESS);
            map.put("UPDATE_FAILED", UPDATE_FAILED);
            map.put("UPDATE_COMPLETE", UPDATE_COMPLETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceStatusEnum(String value) {
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
        public static ResourceStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ResourceStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceStatusEnum(value);
            }
            return result;
        }

        public static ResourceStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ResourceStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceStatusEnum) {
                return this.value.equals(((ResourceStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_status")
    
    
    private ResourceStatusEnum resourceStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_message")
    
    
    private String statusMessage;

    public StackResource withPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }

    


    /**
     * 资源的物理id，由资源提供服务的provider在资源部署的时候生成
     * @return physicalResourceId
     */
    public String getPhysicalResourceId() {
        return physicalResourceId;
    }

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    

    public StackResource withPhysicalResourceName(String physicalResourceName) {
        this.physicalResourceName = physicalResourceName;
        return this;
    }

    


    /**
     * 资源的物理名称，资源提供服务在资源部署的时候给予
     * @return physicalResourceName
     */
    public String getPhysicalResourceName() {
        return physicalResourceName;
    }

    public void setPhysicalResourceName(String physicalResourceName) {
        this.physicalResourceName = physicalResourceName;
    }

    

    public StackResource withLogicalResourceName(String logicalResourceName) {
        this.logicalResourceName = logicalResourceName;
        return this;
    }

    


    /**
     * 资源名，是用户在模板中定义的
     * @return logicalResourceName
     */
    public String getLogicalResourceName() {
        return logicalResourceName;
    }

    public void setLogicalResourceName(String logicalResourceName) {
        this.logicalResourceName = logicalResourceName;
    }

    

    public StackResource withLogicalResourceType(String logicalResourceType) {
        this.logicalResourceType = logicalResourceType;
        return this;
    }

    


    /**
     * 资源的类型，是用户在模板中定义的
     * @return logicalResourceType
     */
    public String getLogicalResourceType() {
        return logicalResourceType;
    }

    public void setLogicalResourceType(String logicalResourceType) {
        this.logicalResourceType = logicalResourceType;
    }

    

    public StackResource withResourceStatus(ResourceStatusEnum resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }

    


    /**
     * 此次事件的类型 * `CREATION_IN_PROGRESS` - 正在生成 * `CREATION_FAILED`      - 生成失败 * `CREATION_COMPLETE`    - 生成完成 * `DELETION_IN_PROGRESS` - 正在删除 * `DELETION_FAILED`      - 删除失败 * `DELETION_COMPLETE`    - 已经删除 * `DELETION_SKIPPED`     - 跳过删除。未来我们将支持，用户可以从资源编排服务中删除，但是不真的删除资源本身 * `UPDATE_IN_PROGRESS`   - 正在更新。此处的更新特指非替换式更新，如果是替换式更新，则使用CREATION后DELETION * `UPDATE_FAILED`        - 更新失败。此处的更新特指非替换式更新，如果是替换式更新，则使用CREATION后DELETION * `UPDATE_COMPLETE`      - 更新完成。此处的更新特指非替换式更新，如果是替换式更新，则使用CREATION后DELETION
     * @return resourceStatus
     */
    public ResourceStatusEnum getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(ResourceStatusEnum resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    

    public StackResource withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    


    /**
     * 如果是成功状态或执行中状态，则没有信息
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StackResource stackResource = (StackResource) o;
        return Objects.equals(this.physicalResourceId, stackResource.physicalResourceId) &&
            Objects.equals(this.physicalResourceName, stackResource.physicalResourceName) &&
            Objects.equals(this.logicalResourceName, stackResource.logicalResourceName) &&
            Objects.equals(this.logicalResourceType, stackResource.logicalResourceType) &&
            Objects.equals(this.resourceStatus, stackResource.resourceStatus) &&
            Objects.equals(this.statusMessage, stackResource.statusMessage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(physicalResourceId, physicalResourceName, logicalResourceName, logicalResourceType, resourceStatus, statusMessage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackResource {\n");
        sb.append("    physicalResourceId: ").append(toIndentedString(physicalResourceId)).append("\n");
        sb.append("    physicalResourceName: ").append(toIndentedString(physicalResourceName)).append("\n");
        sb.append("    logicalResourceName: ").append(toIndentedString(logicalResourceName)).append("\n");
        sb.append("    logicalResourceType: ").append(toIndentedString(logicalResourceType)).append("\n");
        sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

