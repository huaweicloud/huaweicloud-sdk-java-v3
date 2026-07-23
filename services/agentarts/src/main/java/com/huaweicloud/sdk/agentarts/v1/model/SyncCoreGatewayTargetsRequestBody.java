package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * **参数解释：** 同步网关目标的请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class SyncCoreGatewayTargetsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_list")

    private List<UUID> targetList = null;

    public SyncCoreGatewayTargetsRequestBody withTargetList(List<UUID> targetList) {
        this.targetList = targetList;
        return this;
    }

    public SyncCoreGatewayTargetsRequestBody addTargetListItem(UUID targetListItem) {
        if (this.targetList == null) {
            this.targetList = new ArrayList<>();
        }
        this.targetList.add(targetListItem);
        return this;
    }

    public SyncCoreGatewayTargetsRequestBody withTargetList(Consumer<List<UUID>> targetListSetter) {
        if (this.targetList == null) {
            this.targetList = new ArrayList<>();
        }
        targetListSetter.accept(this.targetList);
        return this;
    }

    /**
     * **参数解释：** 待同步的目标列表。 **约束限制：** 不涉及。 **取值范围：** 数组长度为1-50个。 **默认取值：** 不涉及。 
     * @return targetList
     */
    public List<UUID> getTargetList() {
        return targetList;
    }

    public void setTargetList(List<UUID> targetList) {
        this.targetList = targetList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncCoreGatewayTargetsRequestBody that = (SyncCoreGatewayTargetsRequestBody) obj;
        return Objects.equals(this.targetList, that.targetList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncCoreGatewayTargetsRequestBody {\n");
        sb.append("    targetList: ").append(toIndentedString(targetList)).append("\n");
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
