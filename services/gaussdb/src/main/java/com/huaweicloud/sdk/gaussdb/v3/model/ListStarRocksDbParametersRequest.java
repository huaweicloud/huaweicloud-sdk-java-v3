package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListStarRocksDbParametersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_task_scenario")

    private String addTaskScenario;

    public ListStarRocksDbParametersRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * StarRocks实例ID，严格匹配UUID规则。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListStarRocksDbParametersRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型。默认en-us。 取值范围： - en-us - zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListStarRocksDbParametersRequest withAddTaskScenario(String addTaskScenario) {
        this.addTaskScenario = addTaskScenario;
        return this;
    }

    /**
     * **参数解释**：  新增子任务的场景，用于区分库参数是否支持修改。  **约束限制**：  非必填。  **取值范围**：  不涉及。  **默认值**：  不涉及。
     * @return addTaskScenario
     */
    public String getAddTaskScenario() {
        return addTaskScenario;
    }

    public void setAddTaskScenario(String addTaskScenario) {
        this.addTaskScenario = addTaskScenario;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStarRocksDbParametersRequest that = (ListStarRocksDbParametersRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.addTaskScenario, that.addTaskScenario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, xLanguage, addTaskScenario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStarRocksDbParametersRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    addTaskScenario: ").append(toIndentedString(addTaskScenario)).append("\n");
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
