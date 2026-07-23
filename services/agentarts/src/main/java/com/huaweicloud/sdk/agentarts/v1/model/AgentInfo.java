package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AgentInfo
 */
public class AgentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private String agentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_token")

    private Double totalToken;

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
    @JsonProperty(value = "apm_app_token")

    private String apmAppToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_access_code")

    private String aomAccessCode;

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
    @JsonProperty(value = "deleted")

    private Integer deleted;

    public AgentInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**： 智能体来源。  **取值范围**：   - studio   - agentrun   - api 
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public AgentInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**： 智能体ID。  **取值范围**： 不涉及。 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AgentInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 智能体名称。  **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgentInfo withAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * **参数解释**： 智能体类型。   **取值范围**：  - agent：单智能体。  - multiagents：多智能体。  - workflow：工作流。 
     * @return agentType
     */
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public AgentInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间。  **取值范围**： 不涉及。 
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AgentInfo withTotalToken(Double totalToken) {
        this.totalToken = totalToken;
        return this;
    }

    /**
     * **参数解释**： 按照给定时间计算出tokens消耗。  **取值范围**： 不涉及。 
     * @return totalToken
     */
    public Double getTotalToken() {
        return totalToken;
    }

    public void setTotalToken(Double totalToken) {
        this.totalToken = totalToken;
    }

    public AgentInfo withAvgRequestCount(Double avgRequestCount) {
        this.avgRequestCount = avgRequestCount;
        return this;
    }

    /**
     * **参数解释**： 平均请求次数 单位为分钟。  **取值范围**： 不涉及。 
     * @return avgRequestCount
     */
    public Double getAvgRequestCount() {
        return avgRequestCount;
    }

    public void setAvgRequestCount(Double avgRequestCount) {
        this.avgRequestCount = avgRequestCount;
    }

    public AgentInfo withAvgDurationTime(Double avgDurationTime) {
        this.avgDurationTime = avgDurationTime;
        return this;
    }

    /**
     * **参数解释**： 平均延迟时间 延迟时间总和除以次数。  **取值范围**： 不涉及。 
     * @return avgDurationTime
     */
    public Double getAvgDurationTime() {
        return avgDurationTime;
    }

    public void setAvgDurationTime(Double avgDurationTime) {
        this.avgDurationTime = avgDurationTime;
    }

    public AgentInfo withAvgFailCount(Double avgFailCount) {
        this.avgFailCount = avgFailCount;
        return this;
    }

    /**
     * **参数解释**： 平均请求失败次数 单位为分钟。  **取值范围**： 不涉及。 
     * @return avgFailCount
     */
    public Double getAvgFailCount() {
        return avgFailCount;
    }

    public void setAvgFailCount(Double avgFailCount) {
        this.avgFailCount = avgFailCount;
    }

    public AgentInfo withApmAppId(String apmAppId) {
        this.apmAppId = apmAppId;
        return this;
    }

    /**
     * **参数解释**： apm的app_id，非必填。  **取值范围**： 不涉及。 
     * @return apmAppId
     */
    public String getApmAppId() {
        return apmAppId;
    }

    public void setApmAppId(String apmAppId) {
        this.apmAppId = apmAppId;
    }

    public AgentInfo withAomPromId(String aomPromId) {
        this.aomPromId = aomPromId;
        return this;
    }

    /**
     * **参数解释**： aom的app_id，非必填。  **取值范围**： 不涉及。 
     * @return aomPromId
     */
    public String getAomPromId() {
        return aomPromId;
    }

    public void setAomPromId(String aomPromId) {
        this.aomPromId = aomPromId;
    }

    public AgentInfo withApmAppToken(String apmAppToken) {
        this.apmAppToken = apmAppToken;
        return this;
    }

    /**
     * **参数解释**： apm token，加密存储，非必填。  **取值范围**： 不涉及。 
     * @return apmAppToken
     */
    public String getApmAppToken() {
        return apmAppToken;
    }

    public void setApmAppToken(String apmAppToken) {
        this.apmAppToken = apmAppToken;
    }

    public AgentInfo withAomAccessCode(String aomAccessCode) {
        this.aomAccessCode = aomAccessCode;
        return this;
    }

    /**
     * **参数解释**： aom access_code，加密存储，非必填。  **取值范围**： 不涉及。 
     * @return aomAccessCode
     */
    public String getAomAccessCode() {
        return aomAccessCode;
    }

    public void setAomAccessCode(String aomAccessCode) {
        this.aomAccessCode = aomAccessCode;
    }

    public AgentInfo withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * **参数解释**： lts_group_id，非必填。  **取值范围**： 不涉及。 
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public AgentInfo withLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
        return this;
    }

    /**
     * **参数解释**： lts_stream_id，非必填。  **取值范围**： 不涉及。 
     * @return ltsStreamId
     */
    public String getLtsStreamId() {
        return ltsStreamId;
    }

    public void setLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
    }

    public AgentInfo withLtsLabelName(String ltsLabelName) {
        this.ltsLabelName = ltsLabelName;
        return this;
    }

    /**
     * **参数解释**： 用于过滤lts日志标签。  **取值范围**： 不涉及。 
     * @return ltsLabelName
     */
    public String getLtsLabelName() {
        return ltsLabelName;
    }

    public void setLtsLabelName(String ltsLabelName) {
        this.ltsLabelName = ltsLabelName;
    }

    public AgentInfo withApmExporterEndpoint(String apmExporterEndpoint) {
        this.apmExporterEndpoint = apmExporterEndpoint;
        return this;
    }

    /**
     * **参数解释**： apm上报地址。  **取值范围**： 不涉及。 
     * @return apmExporterEndpoint
     */
    public String getApmExporterEndpoint() {
        return apmExporterEndpoint;
    }

    public void setApmExporterEndpoint(String apmExporterEndpoint) {
        this.apmExporterEndpoint = apmExporterEndpoint;
    }

    public AgentInfo withAomExporterEndpoint(String aomExporterEndpoint) {
        this.aomExporterEndpoint = aomExporterEndpoint;
        return this;
    }

    /**
     * **参数解释**： aom上报地址。  **取值范围**： 不涉及。 
     * @return aomExporterEndpoint
     */
    public String getAomExporterEndpoint() {
        return aomExporterEndpoint;
    }

    public void setAomExporterEndpoint(String aomExporterEndpoint) {
        this.aomExporterEndpoint = aomExporterEndpoint;
    }

    public AgentInfo withDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * **参数解释**： 是否被刪除。  **取值范围**： 不涉及。 
     * @return deleted
     */
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentInfo that = (AgentInfo) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.agentType, that.agentType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.totalToken, that.totalToken)
            && Objects.equals(this.avgRequestCount, that.avgRequestCount)
            && Objects.equals(this.avgDurationTime, that.avgDurationTime)
            && Objects.equals(this.avgFailCount, that.avgFailCount) && Objects.equals(this.apmAppId, that.apmAppId)
            && Objects.equals(this.aomPromId, that.aomPromId) && Objects.equals(this.apmAppToken, that.apmAppToken)
            && Objects.equals(this.aomAccessCode, that.aomAccessCode)
            && Objects.equals(this.ltsGroupId, that.ltsGroupId) && Objects.equals(this.ltsStreamId, that.ltsStreamId)
            && Objects.equals(this.ltsLabelName, that.ltsLabelName)
            && Objects.equals(this.apmExporterEndpoint, that.apmExporterEndpoint)
            && Objects.equals(this.aomExporterEndpoint, that.aomExporterEndpoint)
            && Objects.equals(this.deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source,
            agentId,
            name,
            agentType,
            createTime,
            totalToken,
            avgRequestCount,
            avgDurationTime,
            avgFailCount,
            apmAppId,
            aomPromId,
            apmAppToken,
            aomAccessCode,
            ltsGroupId,
            ltsStreamId,
            ltsLabelName,
            apmExporterEndpoint,
            aomExporterEndpoint,
            deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentInfo {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    totalToken: ").append(toIndentedString(totalToken)).append("\n");
        sb.append("    avgRequestCount: ").append(toIndentedString(avgRequestCount)).append("\n");
        sb.append("    avgDurationTime: ").append(toIndentedString(avgDurationTime)).append("\n");
        sb.append("    avgFailCount: ").append(toIndentedString(avgFailCount)).append("\n");
        sb.append("    apmAppId: ").append(toIndentedString(apmAppId)).append("\n");
        sb.append("    aomPromId: ").append(toIndentedString(aomPromId)).append("\n");
        sb.append("    apmAppToken: ").append(toIndentedString(apmAppToken)).append("\n");
        sb.append("    aomAccessCode: ").append(toIndentedString(aomAccessCode)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsStreamId: ").append(toIndentedString(ltsStreamId)).append("\n");
        sb.append("    ltsLabelName: ").append(toIndentedString(ltsLabelName)).append("\n");
        sb.append("    apmExporterEndpoint: ").append(toIndentedString(apmExporterEndpoint)).append("\n");
        sb.append("    aomExporterEndpoint: ").append(toIndentedString(aomExporterEndpoint)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
