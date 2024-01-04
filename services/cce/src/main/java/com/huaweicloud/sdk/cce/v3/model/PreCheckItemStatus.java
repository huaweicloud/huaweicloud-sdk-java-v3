package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检查项状态信息
 */
public class PreCheckItemStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "riskSource")

    private RiskSource riskSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorCodes")

    private List<String> errorCodes = null;

    public PreCheckItemStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 检查项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PreCheckItemStatus withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 检查项类型，取值如下 - Exception: 异常类，需要用户解决 - Risk：风险类，用户确认后可选择跳过
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public PreCheckItemStatus withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 检查项分组，取值如下 - LimitCheck: 集群限制检查 - MasterCheck：控制节点检查 - NodeCheck：用户节点检查 - AddonCheck：插件检查 - ExecuteException：检查流程错误
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public PreCheckItemStatus withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 检查项风险级别，取值如下 - Info: 提示级别 - Warning：风险级别 - Fatal：严重级别
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public PreCheckItemStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 状态，取值如下 - Init: 初始化 - Running 运行中 - Success 成功 - Failed 失败
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public PreCheckItemStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 提示信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PreCheckItemStatus withRiskSource(RiskSource riskSource) {
        this.riskSource = riskSource;
        return this;
    }

    public PreCheckItemStatus withRiskSource(Consumer<RiskSource> riskSourceSetter) {
        if (this.riskSource == null) {
            this.riskSource = new RiskSource();
            riskSourceSetter.accept(this.riskSource);
        }

        return this;
    }

    /**
     * Get riskSource
     * @return riskSource
     */
    public RiskSource getRiskSource() {
        return riskSource;
    }

    public void setRiskSource(RiskSource riskSource) {
        this.riskSource = riskSource;
    }

    public PreCheckItemStatus withErrorCodes(List<String> errorCodes) {
        this.errorCodes = errorCodes;
        return this;
    }

    public PreCheckItemStatus addErrorCodesItem(String errorCodesItem) {
        if (this.errorCodes == null) {
            this.errorCodes = new ArrayList<>();
        }
        this.errorCodes.add(errorCodesItem);
        return this;
    }

    public PreCheckItemStatus withErrorCodes(Consumer<List<String>> errorCodesSetter) {
        if (this.errorCodes == null) {
            this.errorCodes = new ArrayList<>();
        }
        errorCodesSetter.accept(this.errorCodes);
        return this;
    }

    /**
     * 错误码集合
     * @return errorCodes
     */
    public List<String> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(List<String> errorCodes) {
        this.errorCodes = errorCodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreCheckItemStatus that = (PreCheckItemStatus) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.group, that.group) && Objects.equals(this.level, that.level)
            && Objects.equals(this.phase, that.phase) && Objects.equals(this.message, that.message)
            && Objects.equals(this.riskSource, that.riskSource) && Objects.equals(this.errorCodes, that.errorCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kind, group, level, phase, message, riskSource, errorCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreCheckItemStatus {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    riskSource: ").append(toIndentedString(riskSource)).append("\n");
        sb.append("    errorCodes: ").append(toIndentedString(errorCodes)).append("\n");
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
