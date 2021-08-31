package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** WarningList */
public class WarningList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warningCode")

    private Integer warningCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warningMsg")

    private String warningMsg;

    public WarningList withWarningCode(Integer warningCode) {
        this.warningCode = warningCode;
        return this;
    }

    /** 警告ID。
     * 
     * @return warningCode */
    public Integer getWarningCode() {
        return warningCode;
    }

    public void setWarningCode(Integer warningCode) {
        this.warningCode = warningCode;
    }

    public WarningList withWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg;
        return this;
    }

    /** 告警消息。
     * 
     * @return warningMsg */
    public String getWarningMsg() {
        return warningMsg;
    }

    public void setWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WarningList warningList = (WarningList) o;
        return Objects.equals(this.warningCode, warningList.warningCode)
            && Objects.equals(this.warningMsg, warningList.warningMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warningCode, warningMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarningList {\n");
        sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
        sb.append("    warningMsg: ").append(toIndentedString(warningMsg)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
