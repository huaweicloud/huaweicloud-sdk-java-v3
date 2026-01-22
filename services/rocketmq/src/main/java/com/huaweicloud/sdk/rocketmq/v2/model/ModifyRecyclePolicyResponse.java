package com.huaweicloud.sdk.rocketmq.v2.model;

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
public class ModifyRecyclePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_use_recycle")

    private Boolean defaultUseRecycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_instances")

    private List<InstanceRecycleInfo> recycleInstances = null;

    public ModifyRecyclePolicyResponse withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * **参数解释**： 保留天数。 **约束限制**： 不涉及。 **取值范围**： 1~7。 **默认取值**： 不涉及。
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public ModifyRecyclePolicyResponse withDefaultUseRecycle(Boolean defaultUseRecycle) {
        this.defaultUseRecycle = defaultUseRecycle;
        return this;
    }

    /**
     * **参数解释**： 是否使用回收站。 **约束限制**： 不涉及。 **取值范围**： - true：使用回收站。 - false：不使用回收站。 **默认取值**： 不涉及。
     * @return defaultUseRecycle
     */
    public Boolean getDefaultUseRecycle() {
        return defaultUseRecycle;
    }

    public void setDefaultUseRecycle(Boolean defaultUseRecycle) {
        this.defaultUseRecycle = defaultUseRecycle;
    }

    public ModifyRecyclePolicyResponse withRecycleInstances(List<InstanceRecycleInfo> recycleInstances) {
        this.recycleInstances = recycleInstances;
        return this;
    }

    public ModifyRecyclePolicyResponse addRecycleInstancesItem(InstanceRecycleInfo recycleInstancesItem) {
        if (this.recycleInstances == null) {
            this.recycleInstances = new ArrayList<>();
        }
        this.recycleInstances.add(recycleInstancesItem);
        return this;
    }

    public ModifyRecyclePolicyResponse withRecycleInstances(
        Consumer<List<InstanceRecycleInfo>> recycleInstancesSetter) {
        if (this.recycleInstances == null) {
            this.recycleInstances = new ArrayList<>();
        }
        recycleInstancesSetter.accept(this.recycleInstances);
        return this;
    }

    /**
     * **参数解释**： 回收实例列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return recycleInstances
     */
    public List<InstanceRecycleInfo> getRecycleInstances() {
        return recycleInstances;
    }

    public void setRecycleInstances(List<InstanceRecycleInfo> recycleInstances) {
        this.recycleInstances = recycleInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyRecyclePolicyResponse that = (ModifyRecyclePolicyResponse) obj;
        return Objects.equals(this.retentionDays, that.retentionDays)
            && Objects.equals(this.defaultUseRecycle, that.defaultUseRecycle)
            && Objects.equals(this.recycleInstances, that.recycleInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retentionDays, defaultUseRecycle, recycleInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyRecyclePolicyResponse {\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("    defaultUseRecycle: ").append(toIndentedString(defaultUseRecycle)).append("\n");
        sb.append("    recycleInstances: ").append(toIndentedString(recycleInstances)).append("\n");
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
