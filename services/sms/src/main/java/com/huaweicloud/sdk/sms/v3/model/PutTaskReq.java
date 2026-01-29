package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新指定迁移任务
 */
public class PutTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务类型，创建时必选，更新时可选 MIGRATE_FILE:文件级迁移 MIGRATE_BLOCK:块级迁移
     */
    public static final class TypeEnum {

        /**
         * Enum MIGRATE_FILE for value: "MIGRATE_FILE"
         */
        public static final TypeEnum MIGRATE_FILE = new TypeEnum("MIGRATE_FILE");

        /**
         * Enum MIGRATE_BLOCK for value: "MIGRATE_BLOCK"
         */
        public static final TypeEnum MIGRATE_BLOCK = new TypeEnum("MIGRATE_BLOCK");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MIGRATE_FILE", MIGRATE_FILE);
            map.put("MIGRATE_BLOCK", MIGRATE_BLOCK);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_server")

    private Boolean existServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_ip")

    private String migrationIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_ipv6")

    private Boolean useIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_public_ip")

    private Boolean usePublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private Integer speedLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private String enterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_disk_id")

    private String imageDiskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_template_id")

    private String vmTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_disk_ids")

    private String targetDiskIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_ids")

    private String snapshotIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cutovered_snapshot_ids")

    private String cutoveredSnapshotIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_server")

    private TargetServer targetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clone_server")

    private CloneServer cloneServer;

    public PutTaskReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称（用户自定义） 仅由中文字符、下划线、短横线、数字、英文大小写字母组成
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PutTaskReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型，创建时必选，更新时可选 MIGRATE_FILE:文件级迁移 MIGRATE_BLOCK:块级迁移
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PutTaskReq withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 目的端服务器的区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public PutTaskReq withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 目的端服务器的区域名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public PutTaskReq withExistServer(Boolean existServer) {
        this.existServer = existServer;
        return this;
    }

    /**
     * 目的端服务器是否存在。true代表已有目的端服务器，false代表需要新建目的端服务器
     * @return existServer
     */
    public Boolean getExistServer() {
        return existServer;
    }

    public void setExistServer(Boolean existServer) {
        this.existServer = existServer;
    }

    public PutTaskReq withMigrationIp(String migrationIp) {
        this.migrationIp = migrationIp;
        return this;
    }

    /**
     * 目的端服务器的IP地址。 公网迁移时请填写弹性IP地址 专线迁移时请填写私有IP地址 如果use_ipv6是true，则需要满足ipv6的格式，如果use_ipv6是false，则需要满足ipv4的格式
     * @return migrationIp
     */
    public String getMigrationIp() {
        return migrationIp;
    }

    public void setMigrationIp(String migrationIp) {
        this.migrationIp = migrationIp;
    }

    public PutTaskReq withUseIpv6(Boolean useIpv6) {
        this.useIpv6 = useIpv6;
        return this;
    }

    /**
     * 目的端服务器的IP地址是否使用ipv6
     * @return useIpv6
     */
    public Boolean getUseIpv6() {
        return useIpv6;
    }

    public void setUseIpv6(Boolean useIpv6) {
        this.useIpv6 = useIpv6;
    }

    public PutTaskReq withUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
        return this;
    }

    /**
     * 是否为公网
     * @return usePublicIp
     */
    public Boolean getUsePublicIp() {
        return usePublicIp;
    }

    public void setUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
    }

    public PutTaskReq withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    /**
     * 限制迁移速率，单位：Mbps
     * minimum: 0
     * maximum: 1000
     * @return speedLimit
     */
    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    public PutTaskReq withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 目的端服务器所在项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public PutTaskReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 目的端服务器所在项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PutTaskReq withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProject
     */
    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public PutTaskReq withImageDiskId(String imageDiskId) {
        this.imageDiskId = imageDiskId;
        return this;
    }

    /**
     * 目的端服务器镜像代理磁盘ID
     * @return imageDiskId
     */
    public String getImageDiskId() {
        return imageDiskId;
    }

    public void setImageDiskId(String imageDiskId) {
        this.imageDiskId = imageDiskId;
    }

    public PutTaskReq withVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
        return this;
    }

    /**
     * 模板ID
     * @return vmTemplateId
     */
    public String getVmTemplateId() {
        return vmTemplateId;
    }

    public void setVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
    }

    public PutTaskReq withTargetDiskIds(String targetDiskIds) {
        this.targetDiskIds = targetDiskIds;
        return this;
    }

    /**
     * 目的端服务器磁盘ID数组，用空格分隔，单个id长度不超过255
     * @return targetDiskIds
     */
    public String getTargetDiskIds() {
        return targetDiskIds;
    }

    public void setTargetDiskIds(String targetDiskIds) {
        this.targetDiskIds = targetDiskIds;
    }

    public PutTaskReq withSnapshotIds(String snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }

    /**
     * 目的端的快照ID，id之间\";\"分隔
     * @return snapshotIds
     */
    public String getSnapshotIds() {
        return snapshotIds;
    }

    public void setSnapshotIds(String snapshotIds) {
        this.snapshotIds = snapshotIds;
    }

    public PutTaskReq withCutoveredSnapshotIds(String cutoveredSnapshotIds) {
        this.cutoveredSnapshotIds = cutoveredSnapshotIds;
        return this;
    }

    /**
     * 割接的快照ID
     * @return cutoveredSnapshotIds
     */
    public String getCutoveredSnapshotIds() {
        return cutoveredSnapshotIds;
    }

    public void setCutoveredSnapshotIds(String cutoveredSnapshotIds) {
        this.cutoveredSnapshotIds = cutoveredSnapshotIds;
    }

    public PutTaskReq withTargetServer(TargetServer targetServer) {
        this.targetServer = targetServer;
        return this;
    }

    public PutTaskReq withTargetServer(Consumer<TargetServer> targetServerSetter) {
        if (this.targetServer == null) {
            this.targetServer = new TargetServer();
            targetServerSetter.accept(this.targetServer);
        }

        return this;
    }

    /**
     * Get targetServer
     * @return targetServer
     */
    public TargetServer getTargetServer() {
        return targetServer;
    }

    public void setTargetServer(TargetServer targetServer) {
        this.targetServer = targetServer;
    }

    public PutTaskReq withCloneServer(CloneServer cloneServer) {
        this.cloneServer = cloneServer;
        return this;
    }

    public PutTaskReq withCloneServer(Consumer<CloneServer> cloneServerSetter) {
        if (this.cloneServer == null) {
            this.cloneServer = new CloneServer();
            cloneServerSetter.accept(this.cloneServer);
        }

        return this;
    }

    /**
     * Get cloneServer
     * @return cloneServer
     */
    public CloneServer getCloneServer() {
        return cloneServer;
    }

    public void setCloneServer(CloneServer cloneServer) {
        this.cloneServer = cloneServer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutTaskReq that = (PutTaskReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.existServer, that.existServer) && Objects.equals(this.migrationIp, that.migrationIp)
            && Objects.equals(this.useIpv6, that.useIpv6) && Objects.equals(this.usePublicIp, that.usePublicIp)
            && Objects.equals(this.speedLimit, that.speedLimit) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.enterpriseProject, that.enterpriseProject)
            && Objects.equals(this.imageDiskId, that.imageDiskId)
            && Objects.equals(this.vmTemplateId, that.vmTemplateId)
            && Objects.equals(this.targetDiskIds, that.targetDiskIds)
            && Objects.equals(this.snapshotIds, that.snapshotIds)
            && Objects.equals(this.cutoveredSnapshotIds, that.cutoveredSnapshotIds)
            && Objects.equals(this.targetServer, that.targetServer)
            && Objects.equals(this.cloneServer, that.cloneServer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            regionId,
            regionName,
            existServer,
            migrationIp,
            useIpv6,
            usePublicIp,
            speedLimit,
            projectName,
            projectId,
            enterpriseProject,
            imageDiskId,
            vmTemplateId,
            targetDiskIds,
            snapshotIds,
            cutoveredSnapshotIds,
            targetServer,
            cloneServer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutTaskReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    existServer: ").append(toIndentedString(existServer)).append("\n");
        sb.append("    migrationIp: ").append(toIndentedString(migrationIp)).append("\n");
        sb.append("    useIpv6: ").append(toIndentedString(useIpv6)).append("\n");
        sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    imageDiskId: ").append(toIndentedString(imageDiskId)).append("\n");
        sb.append("    vmTemplateId: ").append(toIndentedString(vmTemplateId)).append("\n");
        sb.append("    targetDiskIds: ").append(toIndentedString(targetDiskIds)).append("\n");
        sb.append("    snapshotIds: ").append(toIndentedString(snapshotIds)).append("\n");
        sb.append("    cutoveredSnapshotIds: ").append(toIndentedString(cutoveredSnapshotIds)).append("\n");
        sb.append("    targetServer: ").append(toIndentedString(targetServer)).append("\n");
        sb.append("    cloneServer: ").append(toIndentedString(cloneServer)).append("\n");
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
