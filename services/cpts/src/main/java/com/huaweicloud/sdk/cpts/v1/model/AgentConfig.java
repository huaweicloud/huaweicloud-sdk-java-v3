package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 探针配置
 */
public class AgentConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private Integer agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_enable")

    private Boolean dbEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_shadow_repository")

    private String dbShadowRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_shadow_type")

    private String dbShadowType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_level")

    private String logLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_path")

    private String logPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_switch")

    private Boolean mainSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_enable")

    private Boolean redisEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_shadow_key_prefix")

    private String redisShadowKeyPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_shadow_repository")

    private String redisShadowRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_shadow_type")

    private String redisShadowType;

    public AgentConfig withAgentId(Integer agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 探针id
     * minimum: 0
     * maximum: 2147483647
     * @return agentId
     */
    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public AgentConfig withDbEnable(Boolean dbEnable) {
        this.dbEnable = dbEnable;
        return this;
    }

    /**
     * 是否开启数据库影子规则
     * @return dbEnable
     */
    public Boolean getDbEnable() {
        return dbEnable;
    }

    public void setDbEnable(Boolean dbEnable) {
        this.dbEnable = dbEnable;
    }

    public AgentConfig withDbShadowRepository(String dbShadowRepository) {
        this.dbShadowRepository = dbShadowRepository;
        return this;
    }

    /**
     * 数据库影子库名称
     * @return dbShadowRepository
     */
    public String getDbShadowRepository() {
        return dbShadowRepository;
    }

    public void setDbShadowRepository(String dbShadowRepository) {
        this.dbShadowRepository = dbShadowRepository;
    }

    public AgentConfig withDbShadowType(String dbShadowType) {
        this.dbShadowType = dbShadowType;
        return this;
    }

    /**
     * 数据库影子库类型
     * @return dbShadowType
     */
    public String getDbShadowType() {
        return dbShadowType;
    }

    public void setDbShadowType(String dbShadowType) {
        this.dbShadowType = dbShadowType;
    }

    public AgentConfig withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * 日志级别，枚举值：INFO，DEBUG，WARN，ERROR
     * @return logLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public AgentConfig withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * 日志路径
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public AgentConfig withMainSwitch(Boolean mainSwitch) {
        this.mainSwitch = mainSwitch;
        return this;
    }

    /**
     * 影子规则开关
     * @return mainSwitch
     */
    public Boolean getMainSwitch() {
        return mainSwitch;
    }

    public void setMainSwitch(Boolean mainSwitch) {
        this.mainSwitch = mainSwitch;
    }

    public AgentConfig withRedisEnable(Boolean redisEnable) {
        this.redisEnable = redisEnable;
        return this;
    }

    /**
     * 是否开启redis影子库规则
     * @return redisEnable
     */
    public Boolean getRedisEnable() {
        return redisEnable;
    }

    public void setRedisEnable(Boolean redisEnable) {
        this.redisEnable = redisEnable;
    }

    public AgentConfig withRedisShadowKeyPrefix(String redisShadowKeyPrefix) {
        this.redisShadowKeyPrefix = redisShadowKeyPrefix;
        return this;
    }

    /**
     * redis影子库key前缀
     * @return redisShadowKeyPrefix
     */
    public String getRedisShadowKeyPrefix() {
        return redisShadowKeyPrefix;
    }

    public void setRedisShadowKeyPrefix(String redisShadowKeyPrefix) {
        this.redisShadowKeyPrefix = redisShadowKeyPrefix;
    }

    public AgentConfig withRedisShadowRepository(String redisShadowRepository) {
        this.redisShadowRepository = redisShadowRepository;
        return this;
    }

    /**
     * redis影子库名称
     * @return redisShadowRepository
     */
    public String getRedisShadowRepository() {
        return redisShadowRepository;
    }

    public void setRedisShadowRepository(String redisShadowRepository) {
        this.redisShadowRepository = redisShadowRepository;
    }

    public AgentConfig withRedisShadowType(String redisShadowType) {
        this.redisShadowType = redisShadowType;
        return this;
    }

    /**
     * redis影子库类型
     * @return redisShadowType
     */
    public String getRedisShadowType() {
        return redisShadowType;
    }

    public void setRedisShadowType(String redisShadowType) {
        this.redisShadowType = redisShadowType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentConfig agentConfig = (AgentConfig) o;
        return Objects.equals(this.agentId, agentConfig.agentId) && Objects.equals(this.dbEnable, agentConfig.dbEnable)
            && Objects.equals(this.dbShadowRepository, agentConfig.dbShadowRepository)
            && Objects.equals(this.dbShadowType, agentConfig.dbShadowType)
            && Objects.equals(this.logLevel, agentConfig.logLevel) && Objects.equals(this.logPath, agentConfig.logPath)
            && Objects.equals(this.mainSwitch, agentConfig.mainSwitch)
            && Objects.equals(this.redisEnable, agentConfig.redisEnable)
            && Objects.equals(this.redisShadowKeyPrefix, agentConfig.redisShadowKeyPrefix)
            && Objects.equals(this.redisShadowRepository, agentConfig.redisShadowRepository)
            && Objects.equals(this.redisShadowType, agentConfig.redisShadowType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            dbEnable,
            dbShadowRepository,
            dbShadowType,
            logLevel,
            logPath,
            mainSwitch,
            redisEnable,
            redisShadowKeyPrefix,
            redisShadowRepository,
            redisShadowType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentConfig {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    dbEnable: ").append(toIndentedString(dbEnable)).append("\n");
        sb.append("    dbShadowRepository: ").append(toIndentedString(dbShadowRepository)).append("\n");
        sb.append("    dbShadowType: ").append(toIndentedString(dbShadowType)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    mainSwitch: ").append(toIndentedString(mainSwitch)).append("\n");
        sb.append("    redisEnable: ").append(toIndentedString(redisEnable)).append("\n");
        sb.append("    redisShadowKeyPrefix: ").append(toIndentedString(redisShadowKeyPrefix)).append("\n");
        sb.append("    redisShadowRepository: ").append(toIndentedString(redisShadowRepository)).append("\n");
        sb.append("    redisShadowType: ").append(toIndentedString(redisShadowType)).append("\n");
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
