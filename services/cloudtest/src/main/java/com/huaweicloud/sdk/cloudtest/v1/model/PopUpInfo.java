package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PopUpInfo
 */
public class PopUpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "popup")

    private Boolean popup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_limit")

    private Object timeLimit;

    public PopUpInfo withPopup(Boolean popup) {
        this.popup = popup;
        return this;
    }

    /**
     * 是否弹窗
     * @return popup
     */
    public Boolean getPopup() {
        return popup;
    }

    public void setPopup(Boolean popup) {
        this.popup = popup;
    }

    public PopUpInfo withTimeLimit(Object timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }

    /**
     * 包周期计费时长上限
     * @return timeLimit
     */
    public Object getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Object timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PopUpInfo that = (PopUpInfo) obj;
        return Objects.equals(this.popup, that.popup) && Objects.equals(this.timeLimit, that.timeLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(popup, timeLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PopUpInfo {\n");
        sb.append("    popup: ").append(toIndentedString(popup)).append("\n");
        sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
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
