package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteOneClickAlarmsRequestBody
 */
public class BatchDeleteOneClickAlarmsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_alarm_ids")

    private List<String> oneClickAlarmIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private String actionType;

    public BatchDeleteOneClickAlarmsRequestBody withOneClickAlarmIds(List<String> oneClickAlarmIds) {
        this.oneClickAlarmIds = oneClickAlarmIds;
        return this;
    }

    public BatchDeleteOneClickAlarmsRequestBody addOneClickAlarmIdsItem(String oneClickAlarmIdsItem) {
        if (this.oneClickAlarmIds == null) {
            this.oneClickAlarmIds = new ArrayList<>();
        }
        this.oneClickAlarmIds.add(oneClickAlarmIdsItem);
        return this;
    }

    public BatchDeleteOneClickAlarmsRequestBody withOneClickAlarmIds(Consumer<List<String>> oneClickAlarmIdsSetter) {
        if (this.oneClickAlarmIds == null) {
            this.oneClickAlarmIds = new ArrayList<>();
        }
        oneClickAlarmIdsSetter.accept(this.oneClickAlarmIds);
        return this;
    }

    /**
     * **参数解释**： 需要批量删除的一键告警ID列表。 **约束限制**： 一键告警ID数量最多为100个，至少1个。 
     * @return oneClickAlarmIds
     */
    public List<String> getOneClickAlarmIds() {
        return oneClickAlarmIds;
    }

    public void setOneClickAlarmIds(List<String> oneClickAlarmIds) {
        this.oneClickAlarmIds = oneClickAlarmIds;
    }

    public BatchDeleteOneClickAlarmsRequestBody withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释**： 操作类型。 **约束限制**： 不涉及。 **取值范围**： 枚举值。取值为disable - disable: 关闭一键告警 **默认取值**： 不涉及。 
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteOneClickAlarmsRequestBody that = (BatchDeleteOneClickAlarmsRequestBody) obj;
        return Objects.equals(this.oneClickAlarmIds, that.oneClickAlarmIds)
            && Objects.equals(this.actionType, that.actionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneClickAlarmIds, actionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteOneClickAlarmsRequestBody {\n");
        sb.append("    oneClickAlarmIds: ").append(toIndentedString(oneClickAlarmIds)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
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
