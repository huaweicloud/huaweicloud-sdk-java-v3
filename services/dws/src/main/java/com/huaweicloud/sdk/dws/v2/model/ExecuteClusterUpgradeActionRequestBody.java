package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExecuteClusterUpgradeActionRequestBody
 */
public class ExecuteClusterUpgradeActionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    public ExecuteClusterUpgradeActionRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 当前集群要做的操作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ExecuteClusterUpgradeActionRequestBody withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * 升级项ID
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteClusterUpgradeActionRequestBody that = (ExecuteClusterUpgradeActionRequestBody) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, itemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteClusterUpgradeActionRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
