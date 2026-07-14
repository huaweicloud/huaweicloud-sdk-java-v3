package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动扩缩容规则返回体
 */
public class HpaRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpa_id")

    private String hpaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_replicas")

    private Integer targetReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private String disable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public HpaRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则ID **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HpaRule withHpaId(String hpaId) {
        this.hpaId = hpaId;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则关联的策略ID **取值范围：** 不涉及。
     * @return hpaId
     */
    public String getHpaId() {
        return hpaId;
    }

    public void setHpaId(String hpaId) {
        this.hpaId = hpaId;
    }

    public HpaRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则名 **取值范围：** 支持4-64个字符，可以包含字母、汉字、数字、中划线和下划线。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HpaRule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容类型。 **取值范围：** - CRON_HPA：定时扩缩容策略 - METRIC_HPA：指标扩缩容策略
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HpaRule withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * **参数解释：** 定时自动扩缩容执行的cron表达式，不支持秒，从分钟开始设定 **取值范围：** 不涉及。
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public HpaRule withTargetReplicas(Integer targetReplicas) {
        this.targetReplicas = targetReplicas;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容目标实例数。 **取值范围：** 1-128
     * minimum: 1
     * maximum: 128
     * @return targetReplicas
     */
    public Integer getTargetReplicas() {
        return targetReplicas;
    }

    public void setTargetReplicas(Integer targetReplicas) {
        this.targetReplicas = targetReplicas;
    }

    public HpaRule withDisable(String disable) {
        this.disable = disable;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则是否启用。 **取值范围：** - false - true
     * @return disable
     */
    public String getDisable() {
        return disable;
    }

    public void setDisable(String disable) {
        this.disable = disable;
    }

    public HpaRule withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则状态。 **取值范围：** - CREATING：创建中 - CONFIG_SUCCESS：配置成功 - EXECUTE_SUCCESS：执行成功 - DELETED：已删除 - FAILED: 执行失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HpaRule that = (HpaRule) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.hpaId, that.hpaId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.targetReplicas, that.targetReplicas)
            && Objects.equals(this.disable, that.disable) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hpaId, name, type, schedule, targetReplicas, disable, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HpaRule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hpaId: ").append(toIndentedString(hpaId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    targetReplicas: ").append(toIndentedString(targetReplicas)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
