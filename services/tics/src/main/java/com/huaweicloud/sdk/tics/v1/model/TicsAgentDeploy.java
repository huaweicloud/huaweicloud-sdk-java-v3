package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 可信节点部署情况
 */
public class TicsAgentDeploy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_flag")

    private byte[] aomFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_flag")

    private byte[] bcsFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_version")

    private String cceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_domain_id")

    private String creatorDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_project_id")

    private String creatorProjectId;

    /**
     * 可信节点部署状态，ABNORMAL.正常,RESTARTING.重启中,RESTART_FAILED.重启失败，ROLLBACKING.回滚中，STARTING.启动中，DEPLOYING.创建中,DEPLOY_FAILED.创建失败,DEPLOY_SUCCESS.创建成功,RUNNING.运行中,DELETING.删除中,DELETE_FAILED.删除失败,DELETE_SUCCESS.删除成功,UPGRADING.升级中,UPGRADE_FAILED.升级失败,ROLLBACK.回退中,ROLLBACK_FAILED.回退失败,SUCCESS.成功,FAILED.失败,TO_START.待开始,IN_PROGRESS.进行中
     */
    public static final class DeployStatusEnum {

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final DeployStatusEnum ABNORMAL = new DeployStatusEnum("ABNORMAL");

        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final DeployStatusEnum DELETE_FAILED = new DeployStatusEnum("DELETE_FAILED");

        /**
         * Enum DELETE_SUCCESS for value: "DELETE_SUCCESS"
         */
        public static final DeployStatusEnum DELETE_SUCCESS = new DeployStatusEnum("DELETE_SUCCESS");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final DeployStatusEnum DELETING = new DeployStatusEnum("DELETING");

        /**
         * Enum DEPLOYING for value: "DEPLOYING"
         */
        public static final DeployStatusEnum DEPLOYING = new DeployStatusEnum("DEPLOYING");

        /**
         * Enum DEPLOY_FAILED for value: "DEPLOY_FAILED"
         */
        public static final DeployStatusEnum DEPLOY_FAILED = new DeployStatusEnum("DEPLOY_FAILED");

        /**
         * Enum DEPLOY_SUCCESS for value: "DEPLOY_SUCCESS"
         */
        public static final DeployStatusEnum DEPLOY_SUCCESS = new DeployStatusEnum("DEPLOY_SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final DeployStatusEnum FAILED = new DeployStatusEnum("FAILED");

        /**
         * Enum IN_PROGRESS for value: "IN_PROGRESS"
         */
        public static final DeployStatusEnum IN_PROGRESS = new DeployStatusEnum("IN_PROGRESS");

        /**
         * Enum RESTARTING for value: "RESTARTING"
         */
        public static final DeployStatusEnum RESTARTING = new DeployStatusEnum("RESTARTING");

        /**
         * Enum RESTART_FAILED for value: "RESTART_FAILED"
         */
        public static final DeployStatusEnum RESTART_FAILED = new DeployStatusEnum("RESTART_FAILED");

        /**
         * Enum ROLLBACK for value: "ROLLBACK"
         */
        public static final DeployStatusEnum ROLLBACK = new DeployStatusEnum("ROLLBACK");

        /**
         * Enum ROLLBACKING for value: "ROLLBACKING"
         */
        public static final DeployStatusEnum ROLLBACKING = new DeployStatusEnum("ROLLBACKING");

        /**
         * Enum ROLLBACK_FAILED for value: "ROLLBACK_FAILED"
         */
        public static final DeployStatusEnum ROLLBACK_FAILED = new DeployStatusEnum("ROLLBACK_FAILED");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final DeployStatusEnum RUNNING = new DeployStatusEnum("RUNNING");

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final DeployStatusEnum STARTING = new DeployStatusEnum("STARTING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final DeployStatusEnum SUCCESS = new DeployStatusEnum("SUCCESS");

        /**
         * Enum TO_START for value: "TO_START"
         */
        public static final DeployStatusEnum TO_START = new DeployStatusEnum("TO_START");

        /**
         * Enum UPGRADE_FAILED for value: "UPGRADE_FAILED"
         */
        public static final DeployStatusEnum UPGRADE_FAILED = new DeployStatusEnum("UPGRADE_FAILED");

        /**
         * Enum UPGRADING for value: "UPGRADING"
         */
        public static final DeployStatusEnum UPGRADING = new DeployStatusEnum("UPGRADING");

        private static final Map<String, DeployStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeployStatusEnum> createStaticFields() {
            Map<String, DeployStatusEnum> map = new HashMap<>();
            map.put("ABNORMAL", ABNORMAL);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("DELETE_SUCCESS", DELETE_SUCCESS);
            map.put("DELETING", DELETING);
            map.put("DEPLOYING", DEPLOYING);
            map.put("DEPLOY_FAILED", DEPLOY_FAILED);
            map.put("DEPLOY_SUCCESS", DEPLOY_SUCCESS);
            map.put("FAILED", FAILED);
            map.put("IN_PROGRESS", IN_PROGRESS);
            map.put("RESTARTING", RESTARTING);
            map.put("RESTART_FAILED", RESTART_FAILED);
            map.put("ROLLBACK", ROLLBACK);
            map.put("ROLLBACKING", ROLLBACKING);
            map.put("ROLLBACK_FAILED", ROLLBACK_FAILED);
            map.put("RUNNING", RUNNING);
            map.put("STARTING", STARTING);
            map.put("SUCCESS", SUCCESS);
            map.put("TO_START", TO_START);
            map.put("UPGRADE_FAILED", UPGRADE_FAILED);
            map.put("UPGRADING", UPGRADING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeployStatusEnum(String value) {
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
        public static DeployStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeployStatusEnum(value));
        }

        public static DeployStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeployStatusEnum) {
                return this.value.equals(((DeployStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_status")

    private DeployStatusEnum deployStatus;

    /**
     * 可信节点部署类型，CCE.云容器集群，IEF.边缘容器
     */
    public static final class DeployTypeEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final DeployTypeEnum CCE = new DeployTypeEnum("CCE");

        /**
         * Enum IEF for value: "IEF"
         */
        public static final DeployTypeEnum IEF = new DeployTypeEnum("IEF");

        private static final Map<String, DeployTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeployTypeEnum> createStaticFields() {
            Map<String, DeployTypeEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            map.put("IEF", IEF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeployTypeEnum(String value) {
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
        public static DeployTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeployTypeEnum(value));
        }

        public static DeployTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeployTypeEnum) {
                return this.value.equals(((DeployTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private DeployTypeEnum deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_event_information")

    private String deploymentEventInformation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_avail")

    private byte[] highAvail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_id")

    private String leagueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_name")

    private String leagueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_region_name")

    private String leagueRegionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_version")

    private String leagueVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_id")

    private String natId;

    /**
     * 可信节点使用的存储方式，HOST_PATH.本地存储，OBS.对象云存储，SFS_TURBO.极速文件存储
     */
    public static final class StorageMountTypeEnum {

        /**
         * Enum HOST_PATH for value: "HOST_PATH"
         */
        public static final StorageMountTypeEnum HOST_PATH = new StorageMountTypeEnum("HOST_PATH");

        /**
         * Enum OBS for value: "OBS"
         */
        public static final StorageMountTypeEnum OBS = new StorageMountTypeEnum("OBS");

        /**
         * Enum SFS_TURBO for value: "SFS_TURBO"
         */
        public static final StorageMountTypeEnum SFS_TURBO = new StorageMountTypeEnum("SFS_TURBO");

        private static final Map<String, StorageMountTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageMountTypeEnum> createStaticFields() {
            Map<String, StorageMountTypeEnum> map = new HashMap<>();
            map.put("HOST_PATH", HOST_PATH);
            map.put("OBS", OBS);
            map.put("SFS_TURBO", SFS_TURBO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageMountTypeEnum(String value) {
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
        public static StorageMountTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageMountTypeEnum(value));
        }

        public static StorageMountTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageMountTypeEnum) {
                return this.value.equals(((StorageMountTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mount_type")

    private StorageMountTypeEnum storageMountType;

    public TicsAgentDeploy withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 可信节点Id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public TicsAgentDeploy withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * 可信节点名称
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public TicsAgentDeploy withAomFlag(byte[] aomFlag) {
        this.aomFlag = aomFlag;
        return this;
    }

    /**
     * 是否开启aom监控
     * @return aomFlag
     */
    public byte[] getAomFlag() {
        return aomFlag;
    }

    public void setAomFlag(byte[] aomFlag) {
        this.aomFlag = aomFlag;
    }

    public TicsAgentDeploy withBcsFlag(byte[] bcsFlag) {
        this.bcsFlag = bcsFlag;
        return this;
    }

    /**
     * 是否使用区块链存证
     * @return bcsFlag
     */
    public byte[] getBcsFlag() {
        return bcsFlag;
    }

    public void setBcsFlag(byte[] bcsFlag) {
        this.bcsFlag = bcsFlag;
    }

    public TicsAgentDeploy withCceVersion(String cceVersion) {
        this.cceVersion = cceVersion;
        return this;
    }

    /**
     * 可信节点使用cce集群的版本
     * @return cceVersion
     */
    public String getCceVersion() {
        return cceVersion;
    }

    public void setCceVersion(String cceVersion) {
        this.cceVersion = cceVersion;
    }

    public TicsAgentDeploy withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 可信节点创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public TicsAgentDeploy withCreatorDomainId(String creatorDomainId) {
        this.creatorDomainId = creatorDomainId;
        return this;
    }

    /**
     * 可信节点创建者的租户Id
     * @return creatorDomainId
     */
    public String getCreatorDomainId() {
        return creatorDomainId;
    }

    public void setCreatorDomainId(String creatorDomainId) {
        this.creatorDomainId = creatorDomainId;
    }

    public TicsAgentDeploy withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 可信节点创建者的Id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public TicsAgentDeploy withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 可信节点创建者的名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TicsAgentDeploy withCreatorProjectId(String creatorProjectId) {
        this.creatorProjectId = creatorProjectId;
        return this;
    }

    /**
     * 创建可信节点所在项目Id
     * @return creatorProjectId
     */
    public String getCreatorProjectId() {
        return creatorProjectId;
    }

    public void setCreatorProjectId(String creatorProjectId) {
        this.creatorProjectId = creatorProjectId;
    }

    public TicsAgentDeploy withDeployStatus(DeployStatusEnum deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }

    /**
     * 可信节点部署状态，ABNORMAL.正常,RESTARTING.重启中,RESTART_FAILED.重启失败，ROLLBACKING.回滚中，STARTING.启动中，DEPLOYING.创建中,DEPLOY_FAILED.创建失败,DEPLOY_SUCCESS.创建成功,RUNNING.运行中,DELETING.删除中,DELETE_FAILED.删除失败,DELETE_SUCCESS.删除成功,UPGRADING.升级中,UPGRADE_FAILED.升级失败,ROLLBACK.回退中,ROLLBACK_FAILED.回退失败,SUCCESS.成功,FAILED.失败,TO_START.待开始,IN_PROGRESS.进行中
     * @return deployStatus
     */
    public DeployStatusEnum getDeployStatus() {
        return deployStatus;
    }

    public void setDeployStatus(DeployStatusEnum deployStatus) {
        this.deployStatus = deployStatus;
    }

    public TicsAgentDeploy withDeployType(DeployTypeEnum deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * 可信节点部署类型，CCE.云容器集群，IEF.边缘容器
     * @return deployType
     */
    public DeployTypeEnum getDeployType() {
        return deployType;
    }

    public void setDeployType(DeployTypeEnum deployType) {
        this.deployType = deployType;
    }

    public TicsAgentDeploy withDeploymentEventInformation(String deploymentEventInformation) {
        this.deploymentEventInformation = deploymentEventInformation;
        return this;
    }

    /**
     * 可信节点部署类型
     * @return deploymentEventInformation
     */
    public String getDeploymentEventInformation() {
        return deploymentEventInformation;
    }

    public void setDeploymentEventInformation(String deploymentEventInformation) {
        this.deploymentEventInformation = deploymentEventInformation;
    }

    public TicsAgentDeploy withHighAvail(byte[] highAvail) {
        this.highAvail = highAvail;
        return this;
    }

    /**
     * 可信节点是否高可用部署
     * @return highAvail
     */
    public byte[] getHighAvail() {
        return highAvail;
    }

    public void setHighAvail(byte[] highAvail) {
        this.highAvail = highAvail;
    }

    public TicsAgentDeploy withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 可信节点部署使用的镜像Id
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public TicsAgentDeploy withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * 可信节点部署使用的镜像版本
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public TicsAgentDeploy withLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }

    /**
     * 可信节点所在联盟的Id
     * @return leagueId
     */
    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public TicsAgentDeploy withLeagueName(String leagueName) {
        this.leagueName = leagueName;
        return this;
    }

    /**
     * 可信节点所在联盟的名称
     * @return leagueName
     */
    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public TicsAgentDeploy withLeagueRegionName(String leagueRegionName) {
        this.leagueRegionName = leagueRegionName;
        return this;
    }

    /**
     * 可信节点所在联盟的区域
     * @return leagueRegionName
     */
    public String getLeagueRegionName() {
        return leagueRegionName;
    }

    public void setLeagueRegionName(String leagueRegionName) {
        this.leagueRegionName = leagueRegionName;
    }

    public TicsAgentDeploy withLeagueVersion(String leagueVersion) {
        this.leagueVersion = leagueVersion;
        return this;
    }

    /**
     * 可信节点所在联盟的版本
     * @return leagueVersion
     */
    public String getLeagueVersion() {
        return leagueVersion;
    }

    public void setLeagueVersion(String leagueVersion) {
        this.leagueVersion = leagueVersion;
    }

    public TicsAgentDeploy withNatId(String natId) {
        this.natId = natId;
        return this;
    }

    /**
     * 可信节点使用的网关的Id
     * @return natId
     */
    public String getNatId() {
        return natId;
    }

    public void setNatId(String natId) {
        this.natId = natId;
    }

    public TicsAgentDeploy withStorageMountType(StorageMountTypeEnum storageMountType) {
        this.storageMountType = storageMountType;
        return this;
    }

    /**
     * 可信节点使用的存储方式，HOST_PATH.本地存储，OBS.对象云存储，SFS_TURBO.极速文件存储
     * @return storageMountType
     */
    public StorageMountTypeEnum getStorageMountType() {
        return storageMountType;
    }

    public void setStorageMountType(StorageMountTypeEnum storageMountType) {
        this.storageMountType = storageMountType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicsAgentDeploy that = (TicsAgentDeploy) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentName, that.agentName)
            && java.util.Arrays.equals(this.aomFlag, that.aomFlag)
            && java.util.Arrays.equals(this.bcsFlag, that.bcsFlag) && Objects.equals(this.cceVersion, that.cceVersion)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creatorDomainId, that.creatorDomainId)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.creatorProjectId, that.creatorProjectId)
            && Objects.equals(this.deployStatus, that.deployStatus) && Objects.equals(this.deployType, that.deployType)
            && Objects.equals(this.deploymentEventInformation, that.deploymentEventInformation)
            && java.util.Arrays.equals(this.highAvail, that.highAvail) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.leagueId, that.leagueId)
            && Objects.equals(this.leagueName, that.leagueName)
            && Objects.equals(this.leagueRegionName, that.leagueRegionName)
            && Objects.equals(this.leagueVersion, that.leagueVersion) && Objects.equals(this.natId, that.natId)
            && Objects.equals(this.storageMountType, that.storageMountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            agentName,
            java.util.Arrays.hashCode(aomFlag),
            java.util.Arrays.hashCode(bcsFlag),
            cceVersion,
            createTime,
            creatorDomainId,
            creatorId,
            creatorName,
            creatorProjectId,
            deployStatus,
            deployType,
            deploymentEventInformation,
            java.util.Arrays.hashCode(highAvail),
            imageId,
            imageVersion,
            leagueId,
            leagueName,
            leagueRegionName,
            leagueVersion,
            natId,
            storageMountType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsAgentDeploy {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    aomFlag: ").append(toIndentedString(aomFlag)).append("\n");
        sb.append("    bcsFlag: ").append(toIndentedString(bcsFlag)).append("\n");
        sb.append("    cceVersion: ").append(toIndentedString(cceVersion)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorDomainId: ").append(toIndentedString(creatorDomainId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    creatorProjectId: ").append(toIndentedString(creatorProjectId)).append("\n");
        sb.append("    deployStatus: ").append(toIndentedString(deployStatus)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    deploymentEventInformation: ").append(toIndentedString(deploymentEventInformation)).append("\n");
        sb.append("    highAvail: ").append(toIndentedString(highAvail)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    leagueId: ").append(toIndentedString(leagueId)).append("\n");
        sb.append("    leagueName: ").append(toIndentedString(leagueName)).append("\n");
        sb.append("    leagueRegionName: ").append(toIndentedString(leagueRegionName)).append("\n");
        sb.append("    leagueVersion: ").append(toIndentedString(leagueVersion)).append("\n");
        sb.append("    natId: ").append(toIndentedString(natId)).append("\n");
        sb.append("    storageMountType: ").append(toIndentedString(storageMountType)).append("\n");
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
