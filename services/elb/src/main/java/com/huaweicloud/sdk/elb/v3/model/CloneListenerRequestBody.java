package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 复制监听器接口请求体。
 */
public class CloneListenerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_listener_params")

    private List<CloneListenerOption> targetListenerParams = null;

    public CloneListenerRequestBody withTargetListenerParams(List<CloneListenerOption> targetListenerParams) {
        this.targetListenerParams = targetListenerParams;
        return this;
    }

    public CloneListenerRequestBody addTargetListenerParamsItem(CloneListenerOption targetListenerParamsItem) {
        if (this.targetListenerParams == null) {
            this.targetListenerParams = new ArrayList<>();
        }
        this.targetListenerParams.add(targetListenerParamsItem);
        return this;
    }

    public CloneListenerRequestBody withTargetListenerParams(
        Consumer<List<CloneListenerOption>> targetListenerParamsSetter) {
        if (this.targetListenerParams == null) {
            this.targetListenerParams = new ArrayList<>();
        }
        targetListenerParamsSetter.accept(this.targetListenerParams);
        return this;
    }

    /**
     * **参数解释**：复制后的新监听器相关配置。 **约束限制**：不涉及
     * @return targetListenerParams
     */
    public List<CloneListenerOption> getTargetListenerParams() {
        return targetListenerParams;
    }

    public void setTargetListenerParams(List<CloneListenerOption> targetListenerParams) {
        this.targetListenerParams = targetListenerParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloneListenerRequestBody that = (CloneListenerRequestBody) obj;
        return Objects.equals(this.targetListenerParams, that.targetListenerParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetListenerParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneListenerRequestBody {\n");
        sb.append("    targetListenerParams: ").append(toIndentedString(targetListenerParams)).append("\n");
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
