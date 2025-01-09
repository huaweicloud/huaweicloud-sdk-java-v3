package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 定时任务策略。
 */
public class ScheduleTaskPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enforcement_enable")

    private Boolean enforcementEnable;

    public ScheduleTaskPolicy withEnforcementEnable(Boolean enforcementEnable) {
        this.enforcementEnable = enforcementEnable;
        return this;
    }

    /**
     * 当存在会话的时候，是否强制执行，强制执行开关。取值为： * false：表示关闭。 * true：表示开启。
     * @return enforcementEnable
     */
    public Boolean getEnforcementEnable() {
        return enforcementEnable;
    }

    public void setEnforcementEnable(Boolean enforcementEnable) {
        this.enforcementEnable = enforcementEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleTaskPolicy that = (ScheduleTaskPolicy) obj;
        return Objects.equals(this.enforcementEnable, that.enforcementEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enforcementEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleTaskPolicy {\n");
        sb.append("    enforcementEnable: ").append(toIndentedString(enforcementEnable)).append("\n");
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
