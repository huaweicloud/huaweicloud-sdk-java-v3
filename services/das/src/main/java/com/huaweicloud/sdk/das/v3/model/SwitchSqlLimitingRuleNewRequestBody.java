package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 切换SQL限流规则请求体
 */
public class SwitchSqlLimitingRuleNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_ids")

    private String itemIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public SwitchSqlLimitingRuleNewRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public SwitchSqlLimitingRuleNewRequestBody withItemIds(String itemIds) {
        this.itemIds = itemIds;
        return this;
    }

    /**
     * SQL限流规则ID，可组合，用逗号分隔
     * @return itemIds
     */
    public String getItemIds() {
        return itemIds;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public SwitchSqlLimitingRuleNewRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * SQL限流动作标志
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchSqlLimitingRuleNewRequestBody that = (SwitchSqlLimitingRuleNewRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.itemIds, that.itemIds)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, itemIds, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchSqlLimitingRuleNewRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
