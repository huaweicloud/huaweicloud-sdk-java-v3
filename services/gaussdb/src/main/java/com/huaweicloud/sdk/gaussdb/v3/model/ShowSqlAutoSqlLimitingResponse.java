package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSqlAutoSqlLimitingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_sql_limiting_rules")

    private List<NodeSqlAutoSqlLimiting> autoSqlLimitingRules = null;

    public ShowSqlAutoSqlLimitingResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID，此参数是实例的唯一标识。  **取值范围**：  只能由英文字母、数字组成，后缀为in07，长度为36个字符。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowSqlAutoSqlLimitingResponse withAutoSqlLimitingRules(List<NodeSqlAutoSqlLimiting> autoSqlLimitingRules) {
        this.autoSqlLimitingRules = autoSqlLimitingRules;
        return this;
    }

    public ShowSqlAutoSqlLimitingResponse addAutoSqlLimitingRulesItem(NodeSqlAutoSqlLimiting autoSqlLimitingRulesItem) {
        if (this.autoSqlLimitingRules == null) {
            this.autoSqlLimitingRules = new ArrayList<>();
        }
        this.autoSqlLimitingRules.add(autoSqlLimitingRulesItem);
        return this;
    }

    public ShowSqlAutoSqlLimitingResponse withAutoSqlLimitingRules(
        Consumer<List<NodeSqlAutoSqlLimiting>> autoSqlLimitingRulesSetter) {
        if (this.autoSqlLimitingRules == null) {
            this.autoSqlLimitingRules = new ArrayList<>();
        }
        autoSqlLimitingRulesSetter.accept(this.autoSqlLimitingRules);
        return this;
    }

    /**
     * **参数解释**  节点的自治限流规则。
     * @return autoSqlLimitingRules
     */
    public List<NodeSqlAutoSqlLimiting> getAutoSqlLimitingRules() {
        return autoSqlLimitingRules;
    }

    public void setAutoSqlLimitingRules(List<NodeSqlAutoSqlLimiting> autoSqlLimitingRules) {
        this.autoSqlLimitingRules = autoSqlLimitingRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlAutoSqlLimitingResponse that = (ShowSqlAutoSqlLimitingResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.autoSqlLimitingRules, that.autoSqlLimitingRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, autoSqlLimitingRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlAutoSqlLimitingResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    autoSqlLimitingRules: ").append(toIndentedString(autoSqlLimitingRules)).append("\n");
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
