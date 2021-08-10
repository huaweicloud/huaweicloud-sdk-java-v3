package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 批量查询迁移项目返回的迁移项目信息 */
public class MigprojectsResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_public_ip")

    private Boolean usePublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isdefault")

    private Boolean isdefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_target_server")

    private Boolean startTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private Integer speedLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_server")

    private Boolean existServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /** 迁移项目默认迁移类型 */
    public static final class TypeEnum {

        /** Enum MIGRATE_BLOCK_ for value: "MIGRATE_BLOCK：块迁移" */
        public static final TypeEnum MIGRATE_BLOCK_ = new TypeEnum("MIGRATE_BLOCK：块迁移");

        /** Enum MIGRATE_FILE_ for value: "MIGRATE_FILE：文件级迁移" */
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof TypeEnum) {
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
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private String enterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncing")

    private Boolean syncing;

    public MigprojectsResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /** 迁移项目ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MigprojectsResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 迁移项目名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MigprojectsResponseBody withUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
        return this;
    }

    /** 是否使用公网IP迁移
     * 
     * @return usePublicIp */
    public Boolean getUsePublicIp() {
        return usePublicIp;
    }

    public void setUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
    }

    public MigprojectsResponseBody withIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
        return this;
    }

    /** 是否为默认模板
     * 
     * @return isdefault */
    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public MigprojectsResponseBody withStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
        return this;
    }

    /** 迁移后是否启动目的端虚拟机
     * 
     * @return startTargetServer */
    public Boolean getStartTargetServer() {
        return startTargetServer;
    }

    public void setStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
    }

    public MigprojectsResponseBody withRegion(String region) {
        this.region = region;
        return this;
    }

    /** 区域名称
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public MigprojectsResponseBody withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    /** 模板中配置的限速信息，单位：Mbps minimum: 0 maximum: 10000
     * 
     * @return speedLimit */
    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    public MigprojectsResponseBody withExistServer(Boolean existServer) {
        this.existServer = existServer;
        return this;
    }

    /** 迁移项目下是否存在服务器
     * 
     * @return existServer */
    public Boolean getExistServer() {
        return existServer;
    }

    public void setExistServer(Boolean existServer) {
        this.existServer = existServer;
    }

    public MigprojectsResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 迁移项目描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MigprojectsResponseBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 迁移项目默认迁移类型
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public MigprojectsResponseBody withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    /** 迁移项目所属的企业项目名称
     * 
     * @return enterpriseProject */
    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public MigprojectsResponseBody withSyncing(Boolean syncing) {
        this.syncing = syncing;
        return this;
    }

    /** 是否持续同步
     * 
     * @return syncing */
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
        MigprojectsResponseBody migprojectsResponseBody = (MigprojectsResponseBody) o;
        return Objects.equals(this.id, migprojectsResponseBody.id)
            && Objects.equals(this.name, migprojectsResponseBody.name)
            && Objects.equals(this.usePublicIp, migprojectsResponseBody.usePublicIp)
            && Objects.equals(this.isdefault, migprojectsResponseBody.isdefault)
            && Objects.equals(this.startTargetServer, migprojectsResponseBody.startTargetServer)
            && Objects.equals(this.region, migprojectsResponseBody.region)
            && Objects.equals(this.speedLimit, migprojectsResponseBody.speedLimit)
            && Objects.equals(this.existServer, migprojectsResponseBody.existServer)
            && Objects.equals(this.description, migprojectsResponseBody.description)
            && Objects.equals(this.type, migprojectsResponseBody.type)
            && Objects.equals(this.enterpriseProject, migprojectsResponseBody.enterpriseProject)
            && Objects.equals(this.syncing, migprojectsResponseBody.syncing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            usePublicIp,
            isdefault,
            startTargetServer,
            region,
            speedLimit,
            existServer,
            description,
            type,
            enterpriseProject,
            syncing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigprojectsResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
        sb.append("    isdefault: ").append(toIndentedString(isdefault)).append("\n");
        sb.append("    startTargetServer: ").append(toIndentedString(startTargetServer)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    existServer: ").append(toIndentedString(existServer)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    syncing: ").append(toIndentedString(syncing)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
