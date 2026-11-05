package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EventUpdate
 */
public class EventUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notBefore")

    private String notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redeployConfig")

    private RedeployConfig redeployConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceId")

    private List<String> instanceId = null;

    public EventUpdate withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * **参数解释**：计划执行开始时间，格式为yyyy-MM-ddTHH:mm:ssZ。 **约束限制**：不涉及。 **取值范围**：大于当前时间。 **默认取值**：不填表示立即执行。
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    public EventUpdate withRedeployConfig(RedeployConfig redeployConfig) {
        this.redeployConfig = redeployConfig;
        return this;
    }

    public EventUpdate withRedeployConfig(Consumer<RedeployConfig> redeployConfigSetter) {
        if (this.redeployConfig == null) {
            this.redeployConfig = new RedeployConfig();
            redeployConfigSetter.accept(this.redeployConfig);
        }

        return this;
    }

    /**
     * Get redeployConfig
     * @return redeployConfig
     */
    public RedeployConfig getRedeployConfig() {
        return redeployConfig;
    }

    public void setRedeployConfig(RedeployConfig redeployConfig) {
        this.redeployConfig = redeployConfig;
    }

    public EventUpdate withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public EventUpdate addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public EventUpdate withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /**
     * **参数解释**：授权节点ID列表。授权重部处理时可选填,支持填入单个故障节点ID。 **约束限制**：不涉及。 **取值范围**：计划事件故障节点列表。 **默认取值**：不填表示授权所有节点。
     * @return instanceId
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventUpdate that = (EventUpdate) obj;
        return Objects.equals(this.notBefore, that.notBefore)
            && Objects.equals(this.redeployConfig, that.redeployConfig)
            && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notBefore, redeployConfig, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventUpdate {\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    redeployConfig: ").append(toIndentedString(redeployConfig)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
