package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListAiInstancesRequestBody
 */
public class ListAiInstancesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_time")

    private Long detectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_risk_num")

    private Integer securityRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_health_check_total_host_num")

    private Integer freeHealthCheckTotalHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id_list")

    private List<String> agentIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_name")

    private String runtimeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_id")

    private String runtimeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sdk_status")

    private String sdkStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_risk_trace")

    private Boolean existRiskTrace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_risk_runtime")

    private Boolean existRiskRuntime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    /**
     * **参数解释**： 智能体类型 **约束限制**： 不涉及 **取值范围**： - agent：单智能体。 - chat：工作流。 - controller：多智能体。 - teamAgent：团队智能体。  **默认取值**： 不涉及 
     */
    public static final class AgentTypeEnum {

        /**
         * Enum AGENT for value: "agent"
         */
        public static final AgentTypeEnum AGENT = new AgentTypeEnum("agent");

        /**
         * Enum CHAT for value: "chat"
         */
        public static final AgentTypeEnum CHAT = new AgentTypeEnum("chat");

        /**
         * Enum CONTROLLER for value: "controller"
         */
        public static final AgentTypeEnum CONTROLLER = new AgentTypeEnum("controller");

        /**
         * Enum TEAMAGENT for value: "teamAgent"
         */
        public static final AgentTypeEnum TEAMAGENT = new AgentTypeEnum("teamAgent");

        private static final Map<String, AgentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentTypeEnum> createStaticFields() {
            Map<String, AgentTypeEnum> map = new HashMap<>();
            map.put("agent", AGENT);
            map.put("chat", CHAT);
            map.put("controller", CONTROLLER);
            map.put("teamAgent", TEAMAGENT);
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

    public ListAiInstancesRequestBody withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * 
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public ListAiInstancesRequestBody withDetectTime(Long detectTime) {
        this.detectTime = detectTime;
        return this;
    }

    /**
     * **参数解释**： 最近检测时间 **取值范围**： 不涉及 
     * @return detectTime
     */
    public Long getDetectTime() {
        return detectTime;
    }

    public void setDetectTime(Long detectTime) {
        this.detectTime = detectTime;
    }

    public ListAiInstancesRequestBody withSecurityRiskNum(Integer securityRiskNum) {
        this.securityRiskNum = securityRiskNum;
        return this;
    }

    /**
     * **参数解释**： 风险总数 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return securityRiskNum
     */
    public Integer getSecurityRiskNum() {
        return securityRiskNum;
    }

    public void setSecurityRiskNum(Integer securityRiskNum) {
        this.securityRiskNum = securityRiskNum;
    }

    public ListAiInstancesRequestBody withFreeHealthCheckTotalHostNum(Integer freeHealthCheckTotalHostNum) {
        this.freeHealthCheckTotalHostNum = freeHealthCheckTotalHostNum;
        return this;
    }

    /**
     * **参数解释**： 免费体检的服务器总数 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return freeHealthCheckTotalHostNum
     */
    public Integer getFreeHealthCheckTotalHostNum() {
        return freeHealthCheckTotalHostNum;
    }

    public void setFreeHealthCheckTotalHostNum(Integer freeHealthCheckTotalHostNum) {
        this.freeHealthCheckTotalHostNum = freeHealthCheckTotalHostNum;
    }

    public ListAiInstancesRequestBody withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**： 智能体ID **约束限制**： 不涉及 **取值范围**： 字符长度为1-128位 **默认取值**： 不涉及 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ListAiInstancesRequestBody withAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }

    public ListAiInstancesRequestBody addAgentIdListItem(String agentIdListItem) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        this.agentIdList.add(agentIdListItem);
        return this;
    }

    public ListAiInstancesRequestBody withAgentIdList(Consumer<List<String>> agentIdListSetter) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        agentIdListSetter.accept(this.agentIdList);
        return this;
    }

    /**
     * **参数解释**： 智能体ID列表，支持批量查询 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return agentIdList
     */
    public List<String> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
    }

    public ListAiInstancesRequestBody withRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
        return this;
    }

    /**
     * **参数解释**： 智能体运行时名字 **约束限制**： 不涉及 **取值范围**： 字符长度为1-128位 **默认取值**： 不涉及 
     * @return runtimeName
     */
    public String getRuntimeName() {
        return runtimeName;
    }

    public void setRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
    }

    public ListAiInstancesRequestBody withRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * **参数解释**： 智能体运行时ID **约束限制**： 不涉及 **取值范围**： 字符长度为1-128位 **默认取值**： 不涉及 
     * @return runtimeId
     */
    public String getRuntimeId() {
        return runtimeId;
    }

    public void setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
    }

    public ListAiInstancesRequestBody withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * **参数解释**： 运行镜像地址 **约束限制**： 不涉及 **取值范围**： 字符长度为1-128位 **默认取值**： 不涉及 
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ListAiInstancesRequestBody withSdkStatus(String sdkStatus) {
        this.sdkStatus = sdkStatus;
        return this;
    }

    /**
     * **参数解释**： SDK检测状态 **约束限制**： 不涉及 **取值范围**： - open：开启 - close：关闭  **默认取值**： 不涉及 
     * @return sdkStatus
     */
    public String getSdkStatus() {
        return sdkStatus;
    }

    public void setSdkStatus(String sdkStatus) {
        this.sdkStatus = sdkStatus;
    }

    public ListAiInstancesRequestBody withExistRiskTrace(Boolean existRiskTrace) {
        this.existRiskTrace = existRiskTrace;
        return this;
    }

    /**
     * **参数解释**： 是否存在行为轨迹检测 **约束限制**： 不涉及 **取值范围**： - true：存在 - false：不存在  **默认取值**： 不涉及 
     * @return existRiskTrace
     */
    public Boolean getExistRiskTrace() {
        return existRiskTrace;
    }

    public void setExistRiskTrace(Boolean existRiskTrace) {
        this.existRiskTrace = existRiskTrace;
    }

    public ListAiInstancesRequestBody withExistRiskRuntime(Boolean existRiskRuntime) {
        this.existRiskRuntime = existRiskRuntime;
        return this;
    }

    /**
     * **参数解释**： 是否存在运行时检测 **约束限制**： 不涉及 **取值范围**： - true：存在 - false：不存在  **默认取值**： 不涉及 
     * @return existRiskRuntime
     */
    public Boolean getExistRiskRuntime() {
        return existRiskRuntime;
    }

    public void setExistRiskRuntime(Boolean existRiskRuntime) {
        this.existRiskRuntime = existRiskRuntime;
    }

    public ListAiInstancesRequestBody withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**： 智能体的来源 **约束限制**： 不涉及 **取值范围**： - AgentArts：AgentArts系统。 - OfficeClaw：OfficeClaw系统。 - OpenClaw：OpenClaw系统。  **默认取值**： 不涉及 
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ListAiInstancesRequestBody withAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * **参数解释**： 智能体类型 **约束限制**： 不涉及 **取值范围**： - agent：单智能体。 - chat：工作流。 - controller：多智能体。 - teamAgent：团队智能体。  **默认取值**： 不涉及 
     * @return agentType
     */
    public AgentTypeEnum getAgentType() {
        return agentType;
    }

    public void setAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiInstancesRequestBody that = (ListAiInstancesRequestBody) obj;
        return Objects.equals(this.agentName, that.agentName) && Objects.equals(this.detectTime, that.detectTime)
            && Objects.equals(this.securityRiskNum, that.securityRiskNum)
            && Objects.equals(this.freeHealthCheckTotalHostNum, that.freeHealthCheckTotalHostNum)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentIdList, that.agentIdList)
            && Objects.equals(this.runtimeName, that.runtimeName) && Objects.equals(this.runtimeId, that.runtimeId)
            && Objects.equals(this.imageUrl, that.imageUrl) && Objects.equals(this.sdkStatus, that.sdkStatus)
            && Objects.equals(this.existRiskTrace, that.existRiskTrace)
            && Objects.equals(this.existRiskRuntime, that.existRiskRuntime) && Objects.equals(this.source, that.source)
            && Objects.equals(this.agentType, that.agentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentName,
            detectTime,
            securityRiskNum,
            freeHealthCheckTotalHostNum,
            agentId,
            agentIdList,
            runtimeName,
            runtimeId,
            imageUrl,
            sdkStatus,
            existRiskTrace,
            existRiskRuntime,
            source,
            agentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiInstancesRequestBody {\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    detectTime: ").append(toIndentedString(detectTime)).append("\n");
        sb.append("    securityRiskNum: ").append(toIndentedString(securityRiskNum)).append("\n");
        sb.append("    freeHealthCheckTotalHostNum: ")
            .append(toIndentedString(freeHealthCheckTotalHostNum))
            .append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentIdList: ").append(toIndentedString(agentIdList)).append("\n");
        sb.append("    runtimeName: ").append(toIndentedString(runtimeName)).append("\n");
        sb.append("    runtimeId: ").append(toIndentedString(runtimeId)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    sdkStatus: ").append(toIndentedString(sdkStatus)).append("\n");
        sb.append("    existRiskTrace: ").append(toIndentedString(existRiskTrace)).append("\n");
        sb.append("    existRiskRuntime: ").append(toIndentedString(existRiskRuntime)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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
