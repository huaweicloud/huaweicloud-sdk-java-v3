package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBackupRetainPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_delete_time")

    private Long instanceDeleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto")

    private String auto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manual")

    private String manual;

    public ShowBackupRetainPolicyResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例id  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowBackupRetainPolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  实例名字  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowBackupRetainPolicyResponse withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * **参数解释**：  引擎类型  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ShowBackupRetainPolicyResponse withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * **参数解释**：  实例引擎版本  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ShowBackupRetainPolicyResponse withInstanceDeleteTime(Long instanceDeleteTime) {
        this.instanceDeleteTime = instanceDeleteTime;
        return this;
    }

    /**
     * **参数解释**：  实例删除时间  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return instanceDeleteTime
     */
    public Long getInstanceDeleteTime() {
        return instanceDeleteTime;
    }

    public void setInstanceDeleteTime(Long instanceDeleteTime) {
        this.instanceDeleteTime = instanceDeleteTime;
    }

    public ShowBackupRetainPolicyResponse withAuto(String auto) {
        this.auto = auto;
        return this;
    }

    /**
     * **参数解释**  自动备份保留策略。NONE不保留，LAST保留最后一个，ALL全部保留。  **约束限制**  不涉及  **取值范围**  NONE、LAST、ALL  **默认取值**  不涉及
     * @return auto
     */
    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public ShowBackupRetainPolicyResponse withManual(String manual) {
        this.manual = manual;
        return this;
    }

    /**
     * **参数解释**  手动备份保留策略。NONE不保留，LAST保留最后一个，ALL全部保留。  **约束限制**  不涉及  **取值范围**  NONE、LAST、ALL  **默认取值**  不涉及
     * @return manual
     */
    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupRetainPolicyResponse that = (ShowBackupRetainPolicyResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.instanceDeleteTime, that.instanceDeleteTime) && Objects.equals(this.auto, that.auto)
            && Objects.equals(this.manual, that.manual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, name, engineName, engineVersion, instanceDeleteTime, auto, manual);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupRetainPolicyResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    instanceDeleteTime: ").append(toIndentedString(instanceDeleteTime)).append("\n");
        sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
        sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
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
