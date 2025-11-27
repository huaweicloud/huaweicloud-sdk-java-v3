package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新回收站策略请求
 */
public class ModifyRecycleBinPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch")

    private Boolean _switch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_time")

    private Integer thresholdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_time")

    private Integer keepTime;

    public ModifyRecycleBinPolicyRequestBody withSwitch(Boolean _switch) {
        this._switch = _switch;
        return this;
    }

    /**
     * **参数解释** 回收站开关。 **约束限制** 不涉及。 **取值范围** - true：表示打开回收站。 - false：表示关闭回收站。 **默认取值** 不涉及。
     * @return _switch
     */
    public Boolean getSwitch() {
        return _switch;
    }

    public void setSwitch(Boolean _switch) {
        this._switch = _switch;
    }

    public ModifyRecycleBinPolicyRequestBody withThresholdTime(Integer thresholdTime) {
        this.thresholdTime = thresholdTime;
        return this;
    }

    /**
     * **参数解释** 回收站门槛时间，云硬盘创建多少天后删除才会放入回收站。 **约束限制** 不涉及。 **取值范围** 1-1000 **默认取值** 7
     * @return thresholdTime
     */
    public Integer getThresholdTime() {
        return thresholdTime;
    }

    public void setThresholdTime(Integer thresholdTime) {
        this.thresholdTime = thresholdTime;
    }

    public ModifyRecycleBinPolicyRequestBody withKeepTime(Integer keepTime) {
        this.keepTime = keepTime;
        return this;
    }

    /**
     * **参数解释** 回收站的云硬盘保存期限（天），云硬盘进入回收站后多少天才会被彻底删除。 **约束限制** 不涉及。 **取值范围** 1-365 **默认取值** 7
     * @return keepTime
     */
    public Integer getKeepTime() {
        return keepTime;
    }

    public void setKeepTime(Integer keepTime) {
        this.keepTime = keepTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyRecycleBinPolicyRequestBody that = (ModifyRecycleBinPolicyRequestBody) obj;
        return Objects.equals(this._switch, that._switch) && Objects.equals(this.thresholdTime, that.thresholdTime)
            && Objects.equals(this.keepTime, that.keepTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_switch, thresholdTime, keepTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyRecycleBinPolicyRequestBody {\n");
        sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
        sb.append("    thresholdTime: ").append(toIndentedString(thresholdTime)).append("\n");
        sb.append("    keepTime: ").append(toIndentedString(keepTime)).append("\n");
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
