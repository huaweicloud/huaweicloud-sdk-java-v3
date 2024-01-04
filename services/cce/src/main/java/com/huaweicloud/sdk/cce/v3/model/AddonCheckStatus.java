package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件限制检查状态
 */
public class AddonCheckStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "itemsStatus")

    private List<PreCheckItemStatus> itemsStatus = null;

    public AddonCheckStatus withPhase(String phase) {
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

    public AddonCheckStatus withItemsStatus(List<PreCheckItemStatus> itemsStatus) {
        this.itemsStatus = itemsStatus;
        return this;
    }

    public AddonCheckStatus addItemsStatusItem(PreCheckItemStatus itemsStatusItem) {
        if (this.itemsStatus == null) {
            this.itemsStatus = new ArrayList<>();
        }
        this.itemsStatus.add(itemsStatusItem);
        return this;
    }

    public AddonCheckStatus withItemsStatus(Consumer<List<PreCheckItemStatus>> itemsStatusSetter) {
        if (this.itemsStatus == null) {
            this.itemsStatus = new ArrayList<>();
        }
        itemsStatusSetter.accept(this.itemsStatus);
        return this;
    }

    /**
     * 检查项状态集合
     * @return itemsStatus
     */
    public List<PreCheckItemStatus> getItemsStatus() {
        return itemsStatus;
    }

    public void setItemsStatus(List<PreCheckItemStatus> itemsStatus) {
        this.itemsStatus = itemsStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddonCheckStatus that = (AddonCheckStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.itemsStatus, that.itemsStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, itemsStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonCheckStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    itemsStatus: ").append(toIndentedString(itemsStatus)).append("\n");
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
