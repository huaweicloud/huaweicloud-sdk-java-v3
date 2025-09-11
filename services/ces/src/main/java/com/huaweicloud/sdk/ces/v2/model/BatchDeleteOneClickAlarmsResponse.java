package com.huaweicloud.sdk.ces.v2.model;

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
public class BatchDeleteOneClickAlarmsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_alarm_ids")

    private List<String> oneClickAlarmIds = null;

    public BatchDeleteOneClickAlarmsResponse withOneClickAlarmIds(List<String> oneClickAlarmIds) {
        this.oneClickAlarmIds = oneClickAlarmIds;
        return this;
    }

    public BatchDeleteOneClickAlarmsResponse addOneClickAlarmIdsItem(String oneClickAlarmIdsItem) {
        if (this.oneClickAlarmIds == null) {
            this.oneClickAlarmIds = new ArrayList<>();
        }
        this.oneClickAlarmIds.add(oneClickAlarmIdsItem);
        return this;
    }

    public BatchDeleteOneClickAlarmsResponse withOneClickAlarmIds(Consumer<List<String>> oneClickAlarmIdsSetter) {
        if (this.oneClickAlarmIds == null) {
            this.oneClickAlarmIds = new ArrayList<>();
        }
        oneClickAlarmIdsSetter.accept(this.oneClickAlarmIds);
        return this;
    }

    /**
     * **参数解释**： 成功删除的一键告警ID列表。 
     * @return oneClickAlarmIds
     */
    public List<String> getOneClickAlarmIds() {
        return oneClickAlarmIds;
    }

    public void setOneClickAlarmIds(List<String> oneClickAlarmIds) {
        this.oneClickAlarmIds = oneClickAlarmIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteOneClickAlarmsResponse that = (BatchDeleteOneClickAlarmsResponse) obj;
        return Objects.equals(this.oneClickAlarmIds, that.oneClickAlarmIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneClickAlarmIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteOneClickAlarmsResponse {\n");
        sb.append("    oneClickAlarmIds: ").append(toIndentedString(oneClickAlarmIds)).append("\n");
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
