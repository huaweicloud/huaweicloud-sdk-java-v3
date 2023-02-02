package com.huaweicloud.sdk.aos.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.AgenciesPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.Agency;
import com.huaweicloud.sdk.aos.v1.model.EnableAutoRollbackPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.EnableDeletionProtectionPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackDescriptionPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackIdPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackNamePrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackStatusMessagePrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackStatusPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.VarsBodyPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.VarsStructure;
import com.huaweicloud.sdk.aos.v1.model.VarsStructurePrimitiveTypeHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class GetStackMetadataResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    
    private String stackId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    
    
    private String stackName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_structure")
    
    
    private List<VarsStructure> varsStructure = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_body")
    
    
    private String varsBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_deletion_protection")
    
    
    private Boolean enableDeletionProtection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_auto_rollback")
    
    
    private Boolean enableAutoRollback;
    /**
     * 资源栈的状态     * `CREATION_COMPLETE` - 生成空资源栈完成，并没有任何部署     * `DEPLOYMENT_IN_PROGRESS` - 正在部署，请等待     * `DEPLOYMENT_FAILED` - 部署失败。请于status_message见错误信息汇总，或者调用ListStackEvents获得事件详情     * `DEPLOYMENT_COMPLETE` - 部署完成     * `ROLLBACK_IN_PROGRESS` - 部署失败，正在回滚，请等待     * `ROLLBACK_FAILED` - 回滚失败。请于status_message见错误信息汇总，或者调用ListStackEvents获得事件详情     * `ROLLBACK_COMPLETE` - 回滚完成     * `DELETION_IN_PROGRESS` - 正在删除，请等待     * `DELETION_FAILED` - 删除失败。请于status_message见错误信息汇总，或者调用ListStackEvents获得事件详情
     */
    public static final class StatusEnum {

        
        /**
         * Enum CREATION_COMPLETE for value: "CREATION_COMPLETE"
         */
        public static final StatusEnum CREATION_COMPLETE = new StatusEnum("CREATION_COMPLETE");
        
        /**
         * Enum DEPLOYMENT_IN_PROGRESS for value: "DEPLOYMENT_IN_PROGRESS"
         */
        public static final StatusEnum DEPLOYMENT_IN_PROGRESS = new StatusEnum("DEPLOYMENT_IN_PROGRESS");
        
        /**
         * Enum DEPLOYMENT_FAILED for value: "DEPLOYMENT_FAILED"
         */
        public static final StatusEnum DEPLOYMENT_FAILED = new StatusEnum("DEPLOYMENT_FAILED");
        
        /**
         * Enum DEPLOYMENT_COMPLETE for value: "DEPLOYMENT_COMPLETE"
         */
        public static final StatusEnum DEPLOYMENT_COMPLETE = new StatusEnum("DEPLOYMENT_COMPLETE");
        
        /**
         * Enum ROLLBACK_IN_PROGRESS for value: "ROLLBACK_IN_PROGRESS"
         */
        public static final StatusEnum ROLLBACK_IN_PROGRESS = new StatusEnum("ROLLBACK_IN_PROGRESS");
        
        /**
         * Enum ROLLBACK_FAILED for value: "ROLLBACK_FAILED"
         */
        public static final StatusEnum ROLLBACK_FAILED = new StatusEnum("ROLLBACK_FAILED");
        
        /**
         * Enum ROLLBACK_COMPLETE for value: "ROLLBACK_COMPLETE"
         */
        public static final StatusEnum ROLLBACK_COMPLETE = new StatusEnum("ROLLBACK_COMPLETE");
        
        /**
         * Enum DELETION_IN_PROGRESS for value: "DELETION_IN_PROGRESS"
         */
        public static final StatusEnum DELETION_IN_PROGRESS = new StatusEnum("DELETION_IN_PROGRESS");
        
        /**
         * Enum DELETION_FAILED for value: "DELETION_FAILED"
         */
        public static final StatusEnum DELETION_FAILED = new StatusEnum("DELETION_FAILED");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATION_COMPLETE", CREATION_COMPLETE);
            map.put("DEPLOYMENT_IN_PROGRESS", DEPLOYMENT_IN_PROGRESS);
            map.put("DEPLOYMENT_FAILED", DEPLOYMENT_FAILED);
            map.put("DEPLOYMENT_COMPLETE", DEPLOYMENT_COMPLETE);
            map.put("ROLLBACK_IN_PROGRESS", ROLLBACK_IN_PROGRESS);
            map.put("ROLLBACK_FAILED", ROLLBACK_FAILED);
            map.put("ROLLBACK_COMPLETE", ROLLBACK_COMPLETE);
            map.put("DELETION_IN_PROGRESS", DELETION_IN_PROGRESS);
            map.put("DELETION_FAILED", DELETION_FAILED);
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
    @JsonProperty(value="agencies")
    
    
    private List<Agency> agencies = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_message")
    
    
    private String statusMessage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_uri_content")
    
    
    private String varsUriContent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
    private String updateTime;

    public GetStackMetadataResponse withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 资源栈（stack）的唯一Id。  此Id由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈，删除，再重新创建一个同名资源栈。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈就是我认为的那个，而不是其他队友删除后创建的同名资源栈。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈所对应的ID都不相同，更新不会影响ID。如果给与的stack_id和当前资源栈的ID不一致，则返回400 
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public GetStackMetadataResponse withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    


    /**
     * 用户希望生成的资源栈的名字。此名字在domain_id+区域+project_id下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    

    public GetStackMetadataResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 资源栈的描述。可用于客户识别自己的资源栈。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public GetStackMetadataResponse withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    
    public GetStackMetadataResponse addVarsStructureItem(VarsStructure varsStructureItem) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public GetStackMetadataResponse withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * HCL支持参数，即，同一个模板可以给予不同的参数而达到不同的效果。  * var_structure可以允许客户提交最简单的字符串类型的参数  * 资源编排服务支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * vars_structure中的值只支持简单的字符串类型，如果需要使用其他类型，需要用户自己在HCL引用时转换， 或者用户可以使用vars_uri、vars_body，vars_uri和vars_body中支持HCL支持的各种类型以及复杂结构  * 如果vars_structure过大，可以使用vars_uri  * 注意：vars_structure中默认不应该含有任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的vars。如为敏感信息，建议设置encryption字段开启加密 
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    

    public GetStackMetadataResponse withVarsBody(String varsBody) {
        this.varsBody = varsBody;
        return this;
    }

    


    /**
     * HCL支持参数，即，同一个模板可以给予不同的参数而达到不同的效果  * vars_body使用HCL的tfvars格式，用户可以将“.tfvars”中的内容提交到vars_body中。具体tfvars格式见：https://www.terraform.io/language/values/variables#variable-definitions-tfvars-files  * 资源编排服务支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * 如果vars_body过大，可以使用vars_uri  * 如果vars中都是简单的字符串格式，可以使用var_structure  * 注意：vars_body中不应该含有任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的vars。如为敏感信息，建议通过vars_structure并设置encryption字段传递 
     * @return varsBody
     */
    public String getVarsBody() {
        return varsBody;
    }

    public void setVarsBody(String varsBody) {
        this.varsBody = varsBody;
    }

    

    public GetStackMetadataResponse withEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
        return this;
    }

    


    /**
     * 删除保护的标识位，如果不传默认为false，即默认不开启资源栈删除保护（删除保护开启后资源栈不允许被删除）
     * @return enableDeletionProtection
     */
    public Boolean getEnableDeletionProtection() {
        return enableDeletionProtection;
    }

    public void setEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
    }

    

    public GetStackMetadataResponse withEnableAutoRollback(Boolean enableAutoRollback) {
        this.enableAutoRollback = enableAutoRollback;
        return this;
    }

    


    /**
     * 自动回滚的标识位，如果不传默认为false，即默认不开启资源栈自动回滚（自动回滚开启后，如果部署失败，则会自动回滚，并返回上一个稳定状态）
     * @return enableAutoRollback
     */
    public Boolean getEnableAutoRollback() {
        return enableAutoRollback;
    }

    public void setEnableAutoRollback(Boolean enableAutoRollback) {
        this.enableAutoRollback = enableAutoRollback;
    }

    

    public GetStackMetadataResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 资源栈的状态     * `CREATION_COMPLETE` - 生成空资源栈完成，并没有任何部署     * `DEPLOYMENT_IN_PROGRESS` - 正在部署，请等待     * `DEPLOYMENT_FAILED` - 部署失败。请于status_message见错误信息汇总，或者调用ListStackEvents获得事件详情     * `DEPLOYMENT_COMPLETE` - 部署完成     * `ROLLBACK_IN_PROGRESS` - 部署失败，正在回滚，请等待     * `ROLLBACK_FAILED` - 回滚失败。请于status_message见错误信息汇总，或者调用ListStackEvents获得事件详情     * `ROLLBACK_COMPLETE` - 回滚完成     * `DELETION_IN_PROGRESS` - 正在删除，请等待     * `DELETION_FAILED` - 删除失败。请于status_message见错误信息汇总，或者调用ListStackEvents获得事件详情
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public GetStackMetadataResponse withAgencies(List<Agency> agencies) {
        this.agencies = agencies;
        return this;
    }

    
    public GetStackMetadataResponse addAgenciesItem(Agency agenciesItem) {
        if(this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        this.agencies.add(agenciesItem);
        return this;
    }

    public GetStackMetadataResponse withAgencies(Consumer<List<Agency>> agenciesSetter) {
        if(this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        agenciesSetter.accept(this.agencies);
        return this;
    }

    /**
     * 委托授权的信息。
     * @return agencies
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    

    public GetStackMetadataResponse withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    


    /**
     * 当资源栈的状态为任意失败状态（即以 `FAILED` 结尾时），将会展示简要的错误信息总结以供debug
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    

    public GetStackMetadataResponse withVarsUriContent(String varsUriContent) {
        this.varsUriContent = varsUriContent;
        return this;
    }

    


    /**
     * vars_uri对应的文件内容
     * @return varsUriContent
     */
    public String getVarsUriContent() {
        return varsUriContent;
    }

    public void setVarsUriContent(String varsUriContent) {
        this.varsUriContent = varsUriContent;
    }

    

    public GetStackMetadataResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 资源栈的生成时间 格式遵循RFC3339，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public GetStackMetadataResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 资源栈的更新时间（更新场景包括元数据更新场景和部署场景） 格式遵循RFC3339，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetStackMetadataResponse getStackMetadataResponse = (GetStackMetadataResponse) o;
        return Objects.equals(this.stackId, getStackMetadataResponse.stackId) &&
            Objects.equals(this.stackName, getStackMetadataResponse.stackName) &&
            Objects.equals(this.description, getStackMetadataResponse.description) &&
            Objects.equals(this.varsStructure, getStackMetadataResponse.varsStructure) &&
            Objects.equals(this.varsBody, getStackMetadataResponse.varsBody) &&
            Objects.equals(this.enableDeletionProtection, getStackMetadataResponse.enableDeletionProtection) &&
            Objects.equals(this.enableAutoRollback, getStackMetadataResponse.enableAutoRollback) &&
            Objects.equals(this.status, getStackMetadataResponse.status) &&
            Objects.equals(this.agencies, getStackMetadataResponse.agencies) &&
            Objects.equals(this.statusMessage, getStackMetadataResponse.statusMessage) &&
            Objects.equals(this.varsUriContent, getStackMetadataResponse.varsUriContent) &&
            Objects.equals(this.createTime, getStackMetadataResponse.createTime) &&
            Objects.equals(this.updateTime, getStackMetadataResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackId, stackName, description, varsStructure, varsBody, enableDeletionProtection, enableAutoRollback, status, agencies, statusMessage, varsUriContent, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetStackMetadataResponse {\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
        sb.append("    enableDeletionProtection: ").append(toIndentedString(enableDeletionProtection)).append("\n");
        sb.append("    enableAutoRollback: ").append(toIndentedString(enableAutoRollback)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    agencies: ").append(toIndentedString(agencies)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    varsUriContent: ").append(toIndentedString(varsUriContent)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

