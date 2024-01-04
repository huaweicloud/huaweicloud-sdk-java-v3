package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分身数字人推理预处理动作标记信息。
 */
public class InferenceActionMarkInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_info")

    private List<ActionMarkItem> actionInfo = null;

    public InferenceActionMarkInfo withActionInfo(List<ActionMarkItem> actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    public InferenceActionMarkInfo addActionInfoItem(ActionMarkItem actionInfoItem) {
        if (this.actionInfo == null) {
            this.actionInfo = new ArrayList<>();
        }
        this.actionInfo.add(actionInfoItem);
        return this;
    }

    public InferenceActionMarkInfo withActionInfo(Consumer<List<ActionMarkItem>> actionInfoSetter) {
        if (this.actionInfo == null) {
            this.actionInfo = new ArrayList<>();
        }
        actionInfoSetter.accept(this.actionInfo);
        return this;
    }

    /**
     * 动作列表。
     * @return actionInfo
     */
    public List<ActionMarkItem> getActionInfo() {
        return actionInfo;
    }

    public void setActionInfo(List<ActionMarkItem> actionInfo) {
        this.actionInfo = actionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InferenceActionMarkInfo that = (InferenceActionMarkInfo) obj;
        return Objects.equals(this.actionInfo, that.actionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InferenceActionMarkInfo {\n");
        sb.append("    actionInfo: ").append(toIndentedString(actionInfo)).append("\n");
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
