package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用于定义 Kubernetes Pod对Taint(污点)的容忍规则
 */
public class Toleration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private String effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tolerationSeconds")

    private Integer tolerationSeconds;

    public Toleration withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 表示要容忍的污点键名
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Toleration withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 定义Key与Value之间的关系，可选值为Exists或Equal，默认为Equal
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Toleration withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 表示要匹配的污点值，当Operator为Exists时，Value应为空
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Toleration withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 指定要匹配的污点效果，可选值为 NoSchedule、PreferNoSchedule或NoExecute，如果为空，表示匹配所有效果
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Toleration withTolerationSeconds(Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
        return this;
    }

    /**
     * 仅对NoExecute效果有效，表示Pod能容忍污点的时间
     * @return tolerationSeconds
     */
    public Integer getTolerationSeconds() {
        return tolerationSeconds;
    }

    public void setTolerationSeconds(Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Toleration that = (Toleration) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.effect, that.effect)
            && Objects.equals(this.tolerationSeconds, that.tolerationSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, operator, value, effect, tolerationSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Toleration {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    tolerationSeconds: ").append(toIndentedString(tolerationSeconds)).append("\n");
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
