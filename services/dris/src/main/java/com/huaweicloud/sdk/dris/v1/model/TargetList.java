package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数说明**：目标设备类型对应id的列表。
 */
public class TargetList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_rsu_ids")

    private List<String> targetRsuIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_obu_ids")

    private List<String> targetObuIds = null;

    public TargetList withTargetRsuIds(List<String> targetRsuIds) {
        this.targetRsuIds = targetRsuIds;
        return this;
    }

    public TargetList addTargetRsuIdsItem(String targetRsuIdsItem) {
        if (this.targetRsuIds == null) {
            this.targetRsuIds = new ArrayList<>();
        }
        this.targetRsuIds.add(targetRsuIdsItem);
        return this;
    }

    public TargetList withTargetRsuIds(Consumer<List<String>> targetRsuIdsSetter) {
        if (this.targetRsuIds == null) {
            this.targetRsuIds = new ArrayList<>();
        }
        targetRsuIdsSetter.accept(this.targetRsuIds);
        return this;
    }

    /**
     * **参数说明**：通过LTE-PC5传输通道（by_lte_pc5参数值为true）下发的rsu id列表。如果rsu id列表为空，则匹配事件范围内的在线rsu进行下发。
     * @return targetRsuIds
     */
    public List<String> getTargetRsuIds() {
        return targetRsuIds;
    }

    public void setTargetRsuIds(List<String> targetRsuIds) {
        this.targetRsuIds = targetRsuIds;
    }

    public TargetList withTargetObuIds(List<String> targetObuIds) {
        this.targetObuIds = targetObuIds;
        return this;
    }

    public TargetList addTargetObuIdsItem(String targetObuIdsItem) {
        if (this.targetObuIds == null) {
            this.targetObuIds = new ArrayList<>();
        }
        this.targetObuIds.add(targetObuIdsItem);
        return this;
    }

    public TargetList withTargetObuIds(Consumer<List<String>> targetObuIdsSetter) {
        if (this.targetObuIds == null) {
            this.targetObuIds = new ArrayList<>();
        }
        targetObuIdsSetter.accept(this.targetObuIds);
        return this;
    }

    /**
     * **参数说明**：通过LTE-Uu的传输通道（by_lte_uu参数值为true）下发的obu id列表。注意obu id列表不能为空。
     * @return targetObuIds
     */
    public List<String> getTargetObuIds() {
        return targetObuIds;
    }

    public void setTargetObuIds(List<String> targetObuIds) {
        this.targetObuIds = targetObuIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetList that = (TargetList) obj;
        return Objects.equals(this.targetRsuIds, that.targetRsuIds)
            && Objects.equals(this.targetObuIds, that.targetObuIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetRsuIds, targetObuIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetList {\n");
        sb.append("    targetRsuIds: ").append(toIndentedString(targetRsuIds)).append("\n");
        sb.append("    targetObuIds: ").append(toIndentedString(targetObuIds)).append("\n");
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
