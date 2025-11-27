package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * KustomizationStatus
 */
public class KustomizationStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observedGeneration")

    private Integer observedGeneration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<Object> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastAttemptedRevision")

    private String lastAttemptedRevision;

    public KustomizationStatus withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    /**
     * 最近一次成功协调的资源版本号，用于标识控制器已处理的对象代
     * @return observedGeneration
     */
    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    public KustomizationStatus withConditions(List<Object> conditions) {
        this.conditions = conditions;
        return this;
    }

    public KustomizationStatus addConditionsItem(Object conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public KustomizationStatus withConditions(Consumer<List<Object>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 当前对象的状态条件列表
     * @return conditions
     */
    public List<Object> getConditions() {
        return conditions;
    }

    public void setConditions(List<Object> conditions) {
        this.conditions = conditions;
    }

    public KustomizationStatus withLastAttemptedRevision(String lastAttemptedRevision) {
        this.lastAttemptedRevision = lastAttemptedRevision;
        return this;
    }

    /**
     * 最近一次成功应用的版本号
     * @return lastAttemptedRevision
     */
    public String getLastAttemptedRevision() {
        return lastAttemptedRevision;
    }

    public void setLastAttemptedRevision(String lastAttemptedRevision) {
        this.lastAttemptedRevision = lastAttemptedRevision;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KustomizationStatus that = (KustomizationStatus) obj;
        return Objects.equals(this.observedGeneration, that.observedGeneration)
            && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.lastAttemptedRevision, that.lastAttemptedRevision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(observedGeneration, conditions, lastAttemptedRevision);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KustomizationStatus {\n");
        sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    lastAttemptedRevision: ").append(toIndentedString(lastAttemptedRevision)).append("\n");
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
