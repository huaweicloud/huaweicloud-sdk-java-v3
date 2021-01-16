package com.huaweicloud.sdk.sms.v3.model;




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
 * SMS迁移项目信息
 */
public class MigProject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isdefault")
    
    private Boolean isdefault = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_target_server")
    
    private Boolean startTargetServer = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="speed_limit")
    
    private Integer speedLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="use_public_ip")
    
    private Boolean usePublicIp = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exist_server")
    
    private Boolean existServer = true;
    /**
     * 迁移项目类型
     */
    public static final class TypeEnum {

        
        /**
         * Enum MIGRATE_BLOCK_ for value: "MIGRATE_BLOCK：块迁移"
         */
        public static final TypeEnum MIGRATE_BLOCK_ = new TypeEnum("MIGRATE_BLOCK：块迁移");
        
        /**
         * Enum MIGRATE_FILE_ for value: "MIGRATE_FILE：文件级迁移"
         */
        public static final TypeEnum MIGRATE_FILE_ = new TypeEnum("MIGRATE_FILE：文件级迁移");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MIGRATE_BLOCK：块迁移", MIGRATE_BLOCK_);
            map.put("MIGRATE_FILE：文件级迁移", MIGRATE_FILE_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project")
    
    private String enterpriseProject = "default";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="syncing")
    
    private Boolean syncing = false;

    public MigProject withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 迁移项目名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MigProject withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 用户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public MigProject withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 迁移项目描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MigProject withIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
        return this;
    }

    


    /**
     * 是否为默认模板
     * @return isdefault
     */
    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public MigProject withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 区域名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public MigProject withStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
        return this;
    }

    


    /**
     * 迁移后是否启动目的端虚拟机
     * @return startTargetServer
     */
    public Boolean getStartTargetServer() {
        return startTargetServer;
    }

    public void setStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
    }

    public MigProject withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    


    /**
     * 限制迁移速率，单位：Mbps
     * minimum: 0
     * maximum: 10000
     * @return speedLimit
     */
    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    public MigProject withUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
        return this;
    }

    


    /**
     * 是否使用公网IP迁移
     * @return usePublicIp
     */
    public Boolean getUsePublicIp() {
        return usePublicIp;
    }

    public void setUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
    }

    public MigProject withExistServer(Boolean existServer) {
        this.existServer = existServer;
        return this;
    }

    


    /**
     * 是否是已经存在的服务器
     * @return existServer
     */
    public Boolean getExistServer() {
        return existServer;
    }

    public void setExistServer(Boolean existServer) {
        this.existServer = existServer;
    }

    public MigProject withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 迁移项目类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public MigProject withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    


    /**
     * 企业项目名称
     * @return enterpriseProject
     */
    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public MigProject withSyncing(Boolean syncing) {
        this.syncing = syncing;
        return this;
    }

    


    /**
     * 首次复制或者同步后 是否继续持续同步
     * @return syncing
     */
    public Boolean getSyncing() {
        return syncing;
    }

    public void setSyncing(Boolean syncing) {
        this.syncing = syncing;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigProject migProject = (MigProject) o;
        return Objects.equals(this.name, migProject.name) &&
            Objects.equals(this.domainId, migProject.domainId) &&
            Objects.equals(this.description, migProject.description) &&
            Objects.equals(this.isdefault, migProject.isdefault) &&
            Objects.equals(this.region, migProject.region) &&
            Objects.equals(this.startTargetServer, migProject.startTargetServer) &&
            Objects.equals(this.speedLimit, migProject.speedLimit) &&
            Objects.equals(this.usePublicIp, migProject.usePublicIp) &&
            Objects.equals(this.existServer, migProject.existServer) &&
            Objects.equals(this.type, migProject.type) &&
            Objects.equals(this.enterpriseProject, migProject.enterpriseProject) &&
            Objects.equals(this.syncing, migProject.syncing);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, domainId, description, isdefault, region, startTargetServer, speedLimit, usePublicIp, existServer, type, enterpriseProject, syncing);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigProject {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isdefault: ").append(toIndentedString(isdefault)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    startTargetServer: ").append(toIndentedString(startTargetServer)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
        sb.append("    existServer: ").append(toIndentedString(existServer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    syncing: ").append(toIndentedString(syncing)).append("\n");
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

