package com.huaweicloud.sdk.iotda.v5.model;

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
public class StopBatchTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<BatchTargetResult> targets = null;

    public StopBatchTaskResponse withTargets(List<BatchTargetResult> targets) {
        this.targets = targets;
        return this;
    }

    public StopBatchTaskResponse addTargetsItem(BatchTargetResult targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public StopBatchTaskResponse withTargets(Consumer<List<BatchTargetResult>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 批量操作目标结果集合
     * @return targets
     */
    public List<BatchTargetResult> getTargets() {
        return targets;
    }

    public void setTargets(List<BatchTargetResult> targets) {
        this.targets = targets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopBatchTaskResponse that = (StopBatchTaskResponse) obj;
        return Objects.equals(this.targets, that.targets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopBatchTaskResponse {\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
