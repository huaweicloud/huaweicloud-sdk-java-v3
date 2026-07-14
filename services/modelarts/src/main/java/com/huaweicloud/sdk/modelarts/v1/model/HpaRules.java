package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动扩缩容规则
 */
public class HpaRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate")

    private String operate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_replicas")

    private Integer targetReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_replicas")

    private Integer minReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_replicas")

    private Integer maxReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downscale_window")

    private Integer downscaleWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upscale_window")

    private Integer upscaleWindow;

    public HpaRules withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则名。 **取值范围：** 支持4-64个字符，可以包含小写字母、数字和中划线，必须以小写字母开头，不能以中划线结尾。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HpaRules withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容id **取值范围：** 支持4-64个字符，可以包含字母、汉字、数字、中划线和下划线。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HpaRules withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则是否启用。 **取值范围：** - false：启动 - true：不启动 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public HpaRules withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容类型。 **取值范围：** - CRON_HPA：定时扩缩容策略 - METRIC_HPA：指标扩缩容策略 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HpaRules withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容类型。 **取值范围：** - CREATING：创建扩缩容策略 - CONFIG_SUCCESS：配置成功扩缩容策略 - EXECUTE_SUCCESS：执行成功扩缩容策略 - DELETED：删除扩缩容策略 - FAILED：失败扩缩容策略 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HpaRules withOperate(String operate) {
        this.operate = operate;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容类型。 **取值范围：** - ADD：添加扩缩容策略规则 - UPDATE：修改扩缩容策略规则 - DELETE：删除扩缩容策略规则 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return operate
     */
    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public HpaRules withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * **参数解释：** 定时自动扩缩容执行的cron表达式，不支持秒，从分钟开始设定 **取值范围：** 不涉及。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public HpaRules withTargetReplicas(Integer targetReplicas) {
        this.targetReplicas = targetReplicas;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容目标实例数。 **取值范围：** 1-128，接口能接受浮点类型，后端会自动向下取整 **约束限制：** 不涉及。 **默认取值：** 不涉及。
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

    public HpaRules withMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容最小实例数。 **取值范围：** 1-128，接口能接受浮点类型，后端会自动向下取整 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return minReplicas
     */
    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    public HpaRules withMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容最大实例数。 **取值范围：** 1-128，接口能接受浮点类型，后端会自动向下取整 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return maxReplicas
     */
    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public HpaRules withDownscaleWindow(Integer downscaleWindow) {
        this.downscaleWindow = downscaleWindow;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容扩容冷却时间。 **取值范围：** 1-128，接口能接受浮点类型，后端会自动向下取整 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return downscaleWindow
     */
    public Integer getDownscaleWindow() {
        return downscaleWindow;
    }

    public void setDownscaleWindow(Integer downscaleWindow) {
        this.downscaleWindow = downscaleWindow;
    }

    public HpaRules withUpscaleWindow(Integer upscaleWindow) {
        this.upscaleWindow = upscaleWindow;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容缩容冷却时间。 **取值范围：** 1-128，接口能接受浮点类型，后端会自动向下取整 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return upscaleWindow
     */
    public Integer getUpscaleWindow() {
        return upscaleWindow;
    }

    public void setUpscaleWindow(Integer upscaleWindow) {
        this.upscaleWindow = upscaleWindow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HpaRules that = (HpaRules) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.disable, that.disable) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.operate, that.operate)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.targetReplicas, that.targetReplicas)
            && Objects.equals(this.minReplicas, that.minReplicas) && Objects.equals(this.maxReplicas, that.maxReplicas)
            && Objects.equals(this.downscaleWindow, that.downscaleWindow)
            && Objects.equals(this.upscaleWindow, that.upscaleWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            disable,
            type,
            status,
            operate,
            schedule,
            targetReplicas,
            minReplicas,
            maxReplicas,
            downscaleWindow,
            upscaleWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HpaRules {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    operate: ").append(toIndentedString(operate)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    targetReplicas: ").append(toIndentedString(targetReplicas)).append("\n");
        sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
        sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
        sb.append("    downscaleWindow: ").append(toIndentedString(downscaleWindow)).append("\n");
        sb.append("    upscaleWindow: ").append(toIndentedString(upscaleWindow)).append("\n");
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
