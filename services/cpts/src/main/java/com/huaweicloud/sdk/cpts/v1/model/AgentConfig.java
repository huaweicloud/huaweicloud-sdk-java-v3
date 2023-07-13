package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_enable")

    private Boolean kafkaEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_shadow_topic_prefix")

    private String kafkaShadowTopicPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_log_level")

    private String appLogLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_log_path")

    private String appLogPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mock_rule_list")

    private List<MockRuleConfig> mockRuleList = null;

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

    public AgentConfig withKafkaEnable(Boolean kafkaEnable) {
        this.kafkaEnable = kafkaEnable;
        return this;
    }

    /**
     * kafka影子规则开关
     * @return kafkaEnable
     */
    public Boolean getKafkaEnable() {
        return kafkaEnable;
    }

    public void setKafkaEnable(Boolean kafkaEnable) {
        this.kafkaEnable = kafkaEnable;
    }

    public AgentConfig withKafkaShadowTopicPrefix(String kafkaShadowTopicPrefix) {
        this.kafkaShadowTopicPrefix = kafkaShadowTopicPrefix;
        return this;
    }

    /**
     * kafka影子topic前缀
     * @return kafkaShadowTopicPrefix
     */
    public String getKafkaShadowTopicPrefix() {
        return kafkaShadowTopicPrefix;
    }

    public void setKafkaShadowTopicPrefix(String kafkaShadowTopicPrefix) {
        this.kafkaShadowTopicPrefix = kafkaShadowTopicPrefix;
    }

    public AgentConfig withAppLogLevel(String appLogLevel) {
        this.appLogLevel = appLogLevel;
        return this;
    }

    /**
     * 应用日志等级（ALL/TRACE/DEBUG/INFO/WARN/ERROR/OFF）
     * @return appLogLevel
     */
    public String getAppLogLevel() {
        return appLogLevel;
    }

    public void setAppLogLevel(String appLogLevel) {
        this.appLogLevel = appLogLevel;
    }

    public AgentConfig withAppLogPath(String appLogPath) {
        this.appLogPath = appLogPath;
        return this;
    }

    /**
     * 应用日志路径
     * @return appLogPath
     */
    public String getAppLogPath() {
        return appLogPath;
    }

    public void setAppLogPath(String appLogPath) {
        this.appLogPath = appLogPath;
    }

    public AgentConfig withMockRuleList(List<MockRuleConfig> mockRuleList) {
        this.mockRuleList = mockRuleList;
        return this;
    }

    public AgentConfig addMockRuleListItem(MockRuleConfig mockRuleListItem) {
        if (this.mockRuleList == null) {
            this.mockRuleList = new ArrayList<>();
        }
        this.mockRuleList.add(mockRuleListItem);
        return this;
    }

    public AgentConfig withMockRuleList(Consumer<List<MockRuleConfig>> mockRuleListSetter) {
        if (this.mockRuleList == null) {
            this.mockRuleList = new ArrayList<>();
        }
        mockRuleListSetter.accept(this.mockRuleList);
        return this;
    }

    /**
     * mock规则列表
     * @return mockRuleList
     */
    public List<MockRuleConfig> getMockRuleList() {
        return mockRuleList;
    }

    public void setMockRuleList(List<MockRuleConfig> mockRuleList) {
        this.mockRuleList = mockRuleList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentConfig that = (AgentConfig) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.dbEnable, that.dbEnable)
            && Objects.equals(this.dbShadowRepository, that.dbShadowRepository)
            && Objects.equals(this.dbShadowType, that.dbShadowType) && Objects.equals(this.logLevel, that.logLevel)
            && Objects.equals(this.logPath, that.logPath) && Objects.equals(this.mainSwitch, that.mainSwitch)
            && Objects.equals(this.redisEnable, that.redisEnable)
            && Objects.equals(this.redisShadowKeyPrefix, that.redisShadowKeyPrefix)
            && Objects.equals(this.redisShadowRepository, that.redisShadowRepository)
            && Objects.equals(this.redisShadowType, that.redisShadowType)
            && Objects.equals(this.kafkaEnable, that.kafkaEnable)
            && Objects.equals(this.kafkaShadowTopicPrefix, that.kafkaShadowTopicPrefix)
            && Objects.equals(this.appLogLevel, that.appLogLevel) && Objects.equals(this.appLogPath, that.appLogPath)
            && Objects.equals(this.mockRuleList, that.mockRuleList);
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
            redisShadowType,
            kafkaEnable,
            kafkaShadowTopicPrefix,
            appLogLevel,
            appLogPath,
            mockRuleList);
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
        sb.append("    kafkaEnable: ").append(toIndentedString(kafkaEnable)).append("\n");
        sb.append("    kafkaShadowTopicPrefix: ").append(toIndentedString(kafkaShadowTopicPrefix)).append("\n");
        sb.append("    appLogLevel: ").append(toIndentedString(appLogLevel)).append("\n");
        sb.append("    appLogPath: ").append(toIndentedString(appLogPath)).append("\n");
        sb.append("    mockRuleList: ").append(toIndentedString(mockRuleList)).append("\n");
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
