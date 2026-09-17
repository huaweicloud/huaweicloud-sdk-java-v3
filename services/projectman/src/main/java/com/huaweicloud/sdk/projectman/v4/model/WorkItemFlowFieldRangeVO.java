package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项字段范围
 */
public class WorkItemFlowFieldRangeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_val_object")

    private List<Map<String, Object>> settingValObject = null;

    public WorkItemFlowFieldRangeVO withSettingValObject(List<Map<String, Object>> settingValObject) {
        this.settingValObject = settingValObject;
        return this;
    }

    public WorkItemFlowFieldRangeVO addSettingValObjectItem(Map<String, Object> settingValObjectItem) {
        if (this.settingValObject == null) {
            this.settingValObject = new ArrayList<>();
        }
        this.settingValObject.add(settingValObjectItem);
        return this;
    }

    public WorkItemFlowFieldRangeVO withSettingValObject(Consumer<List<Map<String, Object>>> settingValObjectSetter) {
        if (this.settingValObject == null) {
            this.settingValObject = new ArrayList<>();
        }
        settingValObjectSetter.accept(this.settingValObject);
        return this;
    }

    /**
     * 可选值对象列表
     * @return settingValObject
     */
    public List<Map<String, Object>> getSettingValObject() {
        return settingValObject;
    }

    public void setSettingValObject(List<Map<String, Object>> settingValObject) {
        this.settingValObject = settingValObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemFlowFieldRangeVO that = (WorkItemFlowFieldRangeVO) obj;
        return Objects.equals(this.settingValObject, that.settingValObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settingValObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemFlowFieldRangeVO {\n");
        sb.append("    settingValObject: ").append(toIndentedString(settingValObject)).append("\n");
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
