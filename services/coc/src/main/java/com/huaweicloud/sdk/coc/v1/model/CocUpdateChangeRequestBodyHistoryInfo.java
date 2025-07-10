package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 变更历史信息。
 */
public class CocUpdateChangeRequestBodyHistoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public CocUpdateChangeRequestBodyHistoryInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * -| 操作类型。 · change_start_change_success：变更开始 · change_end_change_success：变更结束 · change_set_change_result_success：变更成功添加变更结果 · change_result_failed：变更失败添加变更结果 · change_cancel_change_success：变更取消
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
        CocUpdateChangeRequestBodyHistoryInfo that = (CocUpdateChangeRequestBodyHistoryInfo) obj;
        return Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocUpdateChangeRequestBodyHistoryInfo {\n");
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
