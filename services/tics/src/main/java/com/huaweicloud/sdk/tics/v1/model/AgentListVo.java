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
 * AgentListVo
 */
public class AgentListVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_domain_id")

    private String creatorDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_user_name")

    private String creatorUserName;

    /**
     * 部署状态 ABNORMAL.正常,RESTARTING.重启中,RESTART_FAILED.重启失败，ROLLBACKING.回滚中，STARTING.启动中，DEPLOYING.创建中,DEPLOY_FAILED.创建失败,DEPLOY_SUCCESS.创建成功,RUNNING.运行中,DELETING.删除中,DELETE_FAILED.删除失败,DELETE_SUCCESS.删除成功,UPGRADING.升级中,UPGRADE_FAILED.升级失败,ROLLBACK.回退中,ROLLBACK_FAILED.回退失败,SUCCESS.成功,FAILED.失败,TO_START.待开始,IN_PROGRESS.进行中
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
            DeployStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeployStatusEnum(value);
            }
            return result;
        }

        public static DeployStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeployStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 部署类型 CCE,IEF,EXTERNAL
     */
    public static final class DeployTypeEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final DeployTypeEnum CCE = new DeployTypeEnum("CCE");

        /**
         * Enum EXTERNAL for value: "EXTERNAL"
         */
        public static final DeployTypeEnum EXTERNAL = new DeployTypeEnum("EXTERNAL");

        /**
         * Enum IEF for value: "IEF"
         */
        public static final DeployTypeEnum IEF = new DeployTypeEnum("IEF");

        private static final Map<String, DeployTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeployTypeEnum> createStaticFields() {
            Map<String, DeployTypeEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            map.put("EXTERNAL", EXTERNAL);
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
            DeployTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeployTypeEnum(value);
            }
            return result;
        }

        public static DeployTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeployTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "enable_delete")

    private Boolean enableDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_upgrade")

    private Boolean enableUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_high_avail")

    private Boolean isHighAvail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_id")

    private String leagueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_name")

    private String leagueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_version")

    private String leagueVersion;

    public AgentListVo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 可信节点id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AgentListVo withAgentName(String agentName) {
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

    public AgentListVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public AgentListVo withCreatorDomainId(String creatorDomainId) {
        this.creatorDomainId = creatorDomainId;
        return this;
    }

    /**
     * 创建者租户id
     * @return creatorDomainId
     */
    public String getCreatorDomainId() {
        return creatorDomainId;
    }

    public void setCreatorDomainId(String creatorDomainId) {
        this.creatorDomainId = creatorDomainId;
    }

    public AgentListVo withCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
        return this;
    }

    /**
     * 创建者名称
     * @return creatorUserName
     */
    public String getCreatorUserName() {
        return creatorUserName;
    }

    public void setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
    }

    public AgentListVo withDeployStatus(DeployStatusEnum deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }

    /**
     * 部署状态 ABNORMAL.正常,RESTARTING.重启中,RESTART_FAILED.重启失败，ROLLBACKING.回滚中，STARTING.启动中，DEPLOYING.创建中,DEPLOY_FAILED.创建失败,DEPLOY_SUCCESS.创建成功,RUNNING.运行中,DELETING.删除中,DELETE_FAILED.删除失败,DELETE_SUCCESS.删除成功,UPGRADING.升级中,UPGRADE_FAILED.升级失败,ROLLBACK.回退中,ROLLBACK_FAILED.回退失败,SUCCESS.成功,FAILED.失败,TO_START.待开始,IN_PROGRESS.进行中
     * @return deployStatus
     */
    public DeployStatusEnum getDeployStatus() {
        return deployStatus;
    }

    public void setDeployStatus(DeployStatusEnum deployStatus) {
        this.deployStatus = deployStatus;
    }

    public AgentListVo withDeployType(DeployTypeEnum deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * 部署类型 CCE,IEF,EXTERNAL
     * @return deployType
     */
    public DeployTypeEnum getDeployType() {
        return deployType;
    }

    public void setDeployType(DeployTypeEnum deployType) {
        this.deployType = deployType;
    }

    public AgentListVo withDeploymentEventInformation(String deploymentEventInformation) {
        this.deploymentEventInformation = deploymentEventInformation;
        return this;
    }

    /**
     * 部署事件状态
     * @return deploymentEventInformation
     */
    public String getDeploymentEventInformation() {
        return deploymentEventInformation;
    }

    public void setDeploymentEventInformation(String deploymentEventInformation) {
        this.deploymentEventInformation = deploymentEventInformation;
    }

    public AgentListVo withEnableDelete(Boolean enableDelete) {
        this.enableDelete = enableDelete;
        return this;
    }

    /**
     * 是否可删除
     * @return enableDelete
     */
    public Boolean getEnableDelete() {
        return enableDelete;
    }

    public void setEnableDelete(Boolean enableDelete) {
        this.enableDelete = enableDelete;
    }

    public AgentListVo withEnableUpgrade(Boolean enableUpgrade) {
        this.enableUpgrade = enableUpgrade;
        return this;
    }

    /**
     * 是否可升级
     * @return enableUpgrade
     */
    public Boolean getEnableUpgrade() {
        return enableUpgrade;
    }

    public void setEnableUpgrade(Boolean enableUpgrade) {
        this.enableUpgrade = enableUpgrade;
    }

    public AgentListVo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * 节点镜像版本
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public AgentListVo withIsHighAvail(Boolean isHighAvail) {
        this.isHighAvail = isHighAvail;
        return this;
    }

    /**
     * 节点是否高可用
     * @return isHighAvail
     */
    public Boolean getIsHighAvail() {
        return isHighAvail;
    }

    public void setIsHighAvail(Boolean isHighAvail) {
        this.isHighAvail = isHighAvail;
    }

    public AgentListVo withLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }

    /**
     * 联盟ID
     * @return leagueId
     */
    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public AgentListVo withLeagueName(String leagueName) {
        this.leagueName = leagueName;
        return this;
    }

    /**
     * 联盟名称
     * @return leagueName
     */
    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public AgentListVo withLeagueVersion(String leagueVersion) {
        this.leagueVersion = leagueVersion;
        return this;
    }

    /**
     * 联盟版本
     * @return leagueVersion
     */
    public String getLeagueVersion() {
        return leagueVersion;
    }

    public void setLeagueVersion(String leagueVersion) {
        this.leagueVersion = leagueVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentListVo agentListVo = (AgentListVo) o;
        return Objects.equals(this.agentId, agentListVo.agentId)
            && Objects.equals(this.agentName, agentListVo.agentName)
            && Objects.equals(this.createTime, agentListVo.createTime)
            && Objects.equals(this.creatorDomainId, agentListVo.creatorDomainId)
            && Objects.equals(this.creatorUserName, agentListVo.creatorUserName)
            && Objects.equals(this.deployStatus, agentListVo.deployStatus)
            && Objects.equals(this.deployType, agentListVo.deployType)
            && Objects.equals(this.deploymentEventInformation, agentListVo.deploymentEventInformation)
            && Objects.equals(this.enableDelete, agentListVo.enableDelete)
            && Objects.equals(this.enableUpgrade, agentListVo.enableUpgrade)
            && Objects.equals(this.imageVersion, agentListVo.imageVersion)
            && Objects.equals(this.isHighAvail, agentListVo.isHighAvail)
            && Objects.equals(this.leagueId, agentListVo.leagueId)
            && Objects.equals(this.leagueName, agentListVo.leagueName)
            && Objects.equals(this.leagueVersion, agentListVo.leagueVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            agentName,
            createTime,
            creatorDomainId,
            creatorUserName,
            deployStatus,
            deployType,
            deploymentEventInformation,
            enableDelete,
            enableUpgrade,
            imageVersion,
            isHighAvail,
            leagueId,
            leagueName,
            leagueVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentListVo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorDomainId: ").append(toIndentedString(creatorDomainId)).append("\n");
        sb.append("    creatorUserName: ").append(toIndentedString(creatorUserName)).append("\n");
        sb.append("    deployStatus: ").append(toIndentedString(deployStatus)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    deploymentEventInformation: ").append(toIndentedString(deploymentEventInformation)).append("\n");
        sb.append("    enableDelete: ").append(toIndentedString(enableDelete)).append("\n");
        sb.append("    enableUpgrade: ").append(toIndentedString(enableUpgrade)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    isHighAvail: ").append(toIndentedString(isHighAvail)).append("\n");
        sb.append("    leagueId: ").append(toIndentedString(leagueId)).append("\n");
        sb.append("    leagueName: ").append(toIndentedString(leagueName)).append("\n");
        sb.append("    leagueVersion: ").append(toIndentedString(leagueVersion)).append("\n");
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
