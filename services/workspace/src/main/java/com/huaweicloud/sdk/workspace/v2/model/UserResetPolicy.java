package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户重置策略。
 */
public class UserResetPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset_count_per_day")

    private Integer resetCountPerDay;

    public UserResetPolicy withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 开关
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public UserResetPolicy withResetCountPerDay(Integer resetCountPerDay) {
        this.resetCountPerDay = resetCountPerDay;
        return this;
    }

    /**
     * 用户每天自动重试次数,重置次数每天0点刷新。
     * minimum: 1
     * maximum: 100
     * @return resetCountPerDay
     */
    public Integer getResetCountPerDay() {
        return resetCountPerDay;
    }

    public void setResetCountPerDay(Integer resetCountPerDay) {
        this.resetCountPerDay = resetCountPerDay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserResetPolicy that = (UserResetPolicy) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.resetCountPerDay, that.resetCountPerDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, resetCountPerDay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserResetPolicy {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    resetCountPerDay: ").append(toIndentedString(resetCountPerDay)).append("\n");
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
