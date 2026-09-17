package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpsThirdPartyAgentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释：** 调试对象类型，区分三方托管智能体和智能体运行时。 **取值范围：** - third_party_agent：三方托管智能体 - agent_runtime：智能体运行时
     */
    public static final class TypeEnum {

        /**
         * Enum THIRD_PARTY_AGENT for value: "third_party_agent"
         */
        public static final TypeEnum THIRD_PARTY_AGENT = new TypeEnum("third_party_agent");

        /**
         * Enum AGENT_RUNTIME for value: "agent_runtime"
         */
        public static final TypeEnum AGENT_RUNTIME = new TypeEnum("agent_runtime");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("third_party_agent", THIRD_PARTY_AGENT);
            map.put("agent_runtime", AGENT_RUNTIME);
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

    /**
     * **参数解释：** 智能体类型。 **取值范围：** - workflow：工作流 - agent：智能体 - multiagents：多智能体
     */
    public static final class AgentTypeEnum {

        /**
         * Enum WORKFLOW for value: "workflow"
         */
        public static final AgentTypeEnum WORKFLOW = new AgentTypeEnum("workflow");

        /**
         * Enum AGENT for value: "agent"
         */
        public static final AgentTypeEnum AGENT = new AgentTypeEnum("agent");

        /**
         * Enum MULTIAGENTS for value: "multiagents"
         */
        public static final AgentTypeEnum MULTIAGENTS = new AgentTypeEnum("multiagents");

        private static final Map<String, AgentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentTypeEnum> createStaticFields() {
            Map<String, AgentTypeEnum> map = new HashMap<>();
            map.put("workflow", WORKFLOW);
            map.put("agent", AGENT);
            map.put("multiagents", MULTIAGENTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgentTypeEnum(String value) {
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
        public static AgentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentTypeEnum(value));
        }

        public static AgentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgentTypeEnum) {
                return this.value.equals(((AgentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private AgentTypeEnum agentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_config")

    private OpsThirdPartyAgentApiConfig apiConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config")

    private OpsThirdPartyAgentAuthConfig authConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_config")

    private OpsThirdPartyAgentResponseConfig responseConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    /**
     * **参数解释：** 调试状态。 **取值范围：** - NOT_DEBUGGED：未配置 - SUCCESS：调试成功 - FAILED：调试失败
     */
    public static final class DebugStatusEnum {

        /**
         * Enum NOT_DEBUGGED for value: "NOT_DEBUGGED"
         */
        public static final DebugStatusEnum NOT_DEBUGGED = new DebugStatusEnum("NOT_DEBUGGED");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final DebugStatusEnum SUCCESS = new DebugStatusEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final DebugStatusEnum FAILED = new DebugStatusEnum("FAILED");

        private static final Map<String, DebugStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DebugStatusEnum> createStaticFields() {
            Map<String, DebugStatusEnum> map = new HashMap<>();
            map.put("NOT_DEBUGGED", NOT_DEBUGGED);
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DebugStatusEnum(String value) {
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
        public static DebugStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DebugStatusEnum(value));
        }

        public static DebugStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DebugStatusEnum) {
                return this.value.equals(((DebugStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debug_status")

    private DebugStatusEnum debugStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_debug_time")

    private String lastDebugTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_debug_error")

    private String lastDebugError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_token")

    private Long totalToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_request_count")

    private Double avgRequestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_duration_time")

    private Double avgDurationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_fail_count")

    private Double avgFailCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apm_app_id")

    private String apmAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_prom_id")

    private String aomPromId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_stream_id")

    private String ltsStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_label_name")

    private String ltsLabelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apm_exporter_endpoint")

    private String apmExporterEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_exporter_endpoint")

    private String aomExporterEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_exporter_endpoint")

    private String ltsExporterEndpoint;

    public ShowOpsThirdPartyAgentResponse withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释：** 三方智能体ID（来自可观测服务）。 **取值范围：** 不涉及。
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ShowOpsThirdPartyAgentResponse withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * **参数解释：** 三方智能体名称（来自可观测服务）。 **取值范围：** 不涉及。
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public ShowOpsThirdPartyAgentResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 三方智能体配置描述，用于说明配置用途。 **约束限制：** 最大长度500字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowOpsThirdPartyAgentResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 调试对象类型，区分三方托管智能体和智能体运行时。 **取值范围：** - third_party_agent：三方托管智能体 - agent_runtime：智能体运行时
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowOpsThirdPartyAgentResponse withAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * **参数解释：** 智能体类型。 **取值范围：** - workflow：工作流 - agent：智能体 - multiagents：多智能体
     * @return agentType
     */
    public AgentTypeEnum getAgentType() {
        return agentType;
    }

    public void setAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
    }

    public ShowOpsThirdPartyAgentResponse withApiConfig(OpsThirdPartyAgentApiConfig apiConfig) {
        this.apiConfig = apiConfig;
        return this;
    }

    public ShowOpsThirdPartyAgentResponse withApiConfig(Consumer<OpsThirdPartyAgentApiConfig> apiConfigSetter) {
        if (this.apiConfig == null) {
            this.apiConfig = new OpsThirdPartyAgentApiConfig();
            apiConfigSetter.accept(this.apiConfig);
        }

        return this;
    }

    /**
     * Get apiConfig
     * @return apiConfig
     */
    public OpsThirdPartyAgentApiConfig getApiConfig() {
        return apiConfig;
    }

    public void setApiConfig(OpsThirdPartyAgentApiConfig apiConfig) {
        this.apiConfig = apiConfig;
    }

    public ShowOpsThirdPartyAgentResponse withAuthConfig(OpsThirdPartyAgentAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    public ShowOpsThirdPartyAgentResponse withAuthConfig(Consumer<OpsThirdPartyAgentAuthConfig> authConfigSetter) {
        if (this.authConfig == null) {
            this.authConfig = new OpsThirdPartyAgentAuthConfig();
            authConfigSetter.accept(this.authConfig);
        }

        return this;
    }

    /**
     * **参数解释：** 鉴权配置，API Key脱敏返回（仅显示前4位和后4位，中间用*号替代）。
     * @return authConfig
     */
    public OpsThirdPartyAgentAuthConfig getAuthConfig() {
        return authConfig;
    }

    public void setAuthConfig(OpsThirdPartyAgentAuthConfig authConfig) {
        this.authConfig = authConfig;
    }

    public ShowOpsThirdPartyAgentResponse withResponseConfig(OpsThirdPartyAgentResponseConfig responseConfig) {
        this.responseConfig = responseConfig;
        return this;
    }

    public ShowOpsThirdPartyAgentResponse withResponseConfig(
        Consumer<OpsThirdPartyAgentResponseConfig> responseConfigSetter) {
        if (this.responseConfig == null) {
            this.responseConfig = new OpsThirdPartyAgentResponseConfig();
            responseConfigSetter.accept(this.responseConfig);
        }

        return this;
    }

    /**
     * Get responseConfig
     * @return responseConfig
     */
    public OpsThirdPartyAgentResponseConfig getResponseConfig() {
        return responseConfig;
    }

    public void setResponseConfig(OpsThirdPartyAgentResponseConfig responseConfig) {
        this.responseConfig = responseConfig;
    }

    public ShowOpsThirdPartyAgentResponse withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * **参数解释：** 单次调用超时时间（秒）。 **取值范围：** 不涉及。
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ShowOpsThirdPartyAgentResponse withDebugStatus(DebugStatusEnum debugStatus) {
        this.debugStatus = debugStatus;
        return this;
    }

    /**
     * **参数解释：** 调试状态。 **取值范围：** - NOT_DEBUGGED：未配置 - SUCCESS：调试成功 - FAILED：调试失败
     * @return debugStatus
     */
    public DebugStatusEnum getDebugStatus() {
        return debugStatus;
    }

    public void setDebugStatus(DebugStatusEnum debugStatus) {
        this.debugStatus = debugStatus;
    }

    public ShowOpsThirdPartyAgentResponse withLastDebugTime(String lastDebugTime) {
        this.lastDebugTime = lastDebugTime;
        return this;
    }

    /**
     * **参数解释：** 最近一次调试时间。时间格式为yyyy-MM-ddTHH:mm:ssZ，示例：2024-01-01T12:00:00Z。
     * @return lastDebugTime
     */
    public String getLastDebugTime() {
        return lastDebugTime;
    }

    public void setLastDebugTime(String lastDebugTime) {
        this.lastDebugTime = lastDebugTime;
    }

    public ShowOpsThirdPartyAgentResponse withLastDebugError(String lastDebugError) {
        this.lastDebugError = lastDebugError;
        return this;
    }

    /**
     * **参数解释：** 最近一次调试失败原因，仅debug_status为FAILED时有值。 **取值范围：** 不涉及。
     * @return lastDebugError
     */
    public String getLastDebugError() {
        return lastDebugError;
    }

    public void setLastDebugError(String lastDebugError) {
        this.lastDebugError = lastDebugError;
    }

    public ShowOpsThirdPartyAgentResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 配置创建时间。时间格式为yyyy-MM-ddTHH:mm:ssZ，示例：2024-01-01T12:00:00Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowOpsThirdPartyAgentResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释：** 智能体来源。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ShowOpsThirdPartyAgentResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 智能体名称（可观测服务返回）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowOpsThirdPartyAgentResponse withTotalToken(Long totalToken) {
        this.totalToken = totalToken;
        return this;
    }

    /**
     * **参数解释：** 累计Token消耗。
     * @return totalToken
     */
    public Long getTotalToken() {
        return totalToken;
    }

    public void setTotalToken(Long totalToken) {
        this.totalToken = totalToken;
    }

    public ShowOpsThirdPartyAgentResponse withAvgRequestCount(Double avgRequestCount) {
        this.avgRequestCount = avgRequestCount;
        return this;
    }

    /**
     * **参数解释：** 平均请求次数。
     * @return avgRequestCount
     */
    public Double getAvgRequestCount() {
        return avgRequestCount;
    }

    public void setAvgRequestCount(Double avgRequestCount) {
        this.avgRequestCount = avgRequestCount;
    }

    public ShowOpsThirdPartyAgentResponse withAvgDurationTime(Double avgDurationTime) {
        this.avgDurationTime = avgDurationTime;
        return this;
    }

    /**
     * **参数解释：** 平均响应耗时。
     * @return avgDurationTime
     */
    public Double getAvgDurationTime() {
        return avgDurationTime;
    }

    public void setAvgDurationTime(Double avgDurationTime) {
        this.avgDurationTime = avgDurationTime;
    }

    public ShowOpsThirdPartyAgentResponse withAvgFailCount(Double avgFailCount) {
        this.avgFailCount = avgFailCount;
        return this;
    }

    /**
     * **参数解释：** 平均失败次数。
     * @return avgFailCount
     */
    public Double getAvgFailCount() {
        return avgFailCount;
    }

    public void setAvgFailCount(Double avgFailCount) {
        this.avgFailCount = avgFailCount;
    }

    public ShowOpsThirdPartyAgentResponse withApmAppId(String apmAppId) {
        this.apmAppId = apmAppId;
        return this;
    }

    /**
     * **参数解释：** APM 应用ID。
     * @return apmAppId
     */
    public String getApmAppId() {
        return apmAppId;
    }

    public void setApmAppId(String apmAppId) {
        this.apmAppId = apmAppId;
    }

    public ShowOpsThirdPartyAgentResponse withAomPromId(String aomPromId) {
        this.aomPromId = aomPromId;
        return this;
    }

    /**
     * **参数解释：** AOM Prometheus ID。
     * @return aomPromId
     */
    public String getAomPromId() {
        return aomPromId;
    }

    public void setAomPromId(String aomPromId) {
        this.aomPromId = aomPromId;
    }

    public ShowOpsThirdPartyAgentResponse withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * **参数解释：** LTS 日志组ID。
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public ShowOpsThirdPartyAgentResponse withLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
        return this;
    }

    /**
     * **参数解释：** LTS 日志流ID。
     * @return ltsStreamId
     */
    public String getLtsStreamId() {
        return ltsStreamId;
    }

    public void setLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
    }

    public ShowOpsThirdPartyAgentResponse withLtsLabelName(String ltsLabelName) {
        this.ltsLabelName = ltsLabelName;
        return this;
    }

    /**
     * **参数解释：** LTS 标签名称。
     * @return ltsLabelName
     */
    public String getLtsLabelName() {
        return ltsLabelName;
    }

    public void setLtsLabelName(String ltsLabelName) {
        this.ltsLabelName = ltsLabelName;
    }

    public ShowOpsThirdPartyAgentResponse withApmExporterEndpoint(String apmExporterEndpoint) {
        this.apmExporterEndpoint = apmExporterEndpoint;
        return this;
    }

    /**
     * **参数解释：** APM Exporter 端点。
     * @return apmExporterEndpoint
     */
    public String getApmExporterEndpoint() {
        return apmExporterEndpoint;
    }

    public void setApmExporterEndpoint(String apmExporterEndpoint) {
        this.apmExporterEndpoint = apmExporterEndpoint;
    }

    public ShowOpsThirdPartyAgentResponse withAomExporterEndpoint(String aomExporterEndpoint) {
        this.aomExporterEndpoint = aomExporterEndpoint;
        return this;
    }

    /**
     * **参数解释：** AOM Exporter 端点。
     * @return aomExporterEndpoint
     */
    public String getAomExporterEndpoint() {
        return aomExporterEndpoint;
    }

    public void setAomExporterEndpoint(String aomExporterEndpoint) {
        this.aomExporterEndpoint = aomExporterEndpoint;
    }

    public ShowOpsThirdPartyAgentResponse withLtsExporterEndpoint(String ltsExporterEndpoint) {
        this.ltsExporterEndpoint = ltsExporterEndpoint;
        return this;
    }

    /**
     * **参数解释：** LTS Exporter 端点。
     * @return ltsExporterEndpoint
     */
    public String getLtsExporterEndpoint() {
        return ltsExporterEndpoint;
    }

    public void setLtsExporterEndpoint(String ltsExporterEndpoint) {
        this.ltsExporterEndpoint = ltsExporterEndpoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsThirdPartyAgentResponse that = (ShowOpsThirdPartyAgentResponse) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentName, that.agentName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.type, that.type)
            && Objects.equals(this.agentType, that.agentType) && Objects.equals(this.apiConfig, that.apiConfig)
            && Objects.equals(this.authConfig, that.authConfig)
            && Objects.equals(this.responseConfig, that.responseConfig) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.debugStatus, that.debugStatus)
            && Objects.equals(this.lastDebugTime, that.lastDebugTime)
            && Objects.equals(this.lastDebugError, that.lastDebugError)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.source, that.source)
            && Objects.equals(this.name, that.name) && Objects.equals(this.totalToken, that.totalToken)
            && Objects.equals(this.avgRequestCount, that.avgRequestCount)
            && Objects.equals(this.avgDurationTime, that.avgDurationTime)
            && Objects.equals(this.avgFailCount, that.avgFailCount) && Objects.equals(this.apmAppId, that.apmAppId)
            && Objects.equals(this.aomPromId, that.aomPromId) && Objects.equals(this.ltsGroupId, that.ltsGroupId)
            && Objects.equals(this.ltsStreamId, that.ltsStreamId)
            && Objects.equals(this.ltsLabelName, that.ltsLabelName)
            && Objects.equals(this.apmExporterEndpoint, that.apmExporterEndpoint)
            && Objects.equals(this.aomExporterEndpoint, that.aomExporterEndpoint)
            && Objects.equals(this.ltsExporterEndpoint, that.ltsExporterEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            agentName,
            description,
            type,
            agentType,
            apiConfig,
            authConfig,
            responseConfig,
            timeout,
            debugStatus,
            lastDebugTime,
            lastDebugError,
            createTime,
            source,
            name,
            totalToken,
            avgRequestCount,
            avgDurationTime,
            avgFailCount,
            apmAppId,
            aomPromId,
            ltsGroupId,
            ltsStreamId,
            ltsLabelName,
            apmExporterEndpoint,
            aomExporterEndpoint,
            ltsExporterEndpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsThirdPartyAgentResponse {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    apiConfig: ").append(toIndentedString(apiConfig)).append("\n");
        sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
        sb.append("    responseConfig: ").append(toIndentedString(responseConfig)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    debugStatus: ").append(toIndentedString(debugStatus)).append("\n");
        sb.append("    lastDebugTime: ").append(toIndentedString(lastDebugTime)).append("\n");
        sb.append("    lastDebugError: ").append(toIndentedString(lastDebugError)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    totalToken: ").append(toIndentedString(totalToken)).append("\n");
        sb.append("    avgRequestCount: ").append(toIndentedString(avgRequestCount)).append("\n");
        sb.append("    avgDurationTime: ").append(toIndentedString(avgDurationTime)).append("\n");
        sb.append("    avgFailCount: ").append(toIndentedString(avgFailCount)).append("\n");
        sb.append("    apmAppId: ").append(toIndentedString(apmAppId)).append("\n");
        sb.append("    aomPromId: ").append(toIndentedString(aomPromId)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsStreamId: ").append(toIndentedString(ltsStreamId)).append("\n");
        sb.append("    ltsLabelName: ").append(toIndentedString(ltsLabelName)).append("\n");
        sb.append("    apmExporterEndpoint: ").append(toIndentedString(apmExporterEndpoint)).append("\n");
        sb.append("    aomExporterEndpoint: ").append(toIndentedString(aomExporterEndpoint)).append("\n");
        sb.append("    ltsExporterEndpoint: ").append(toIndentedString(ltsExporterEndpoint)).append("\n");
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
