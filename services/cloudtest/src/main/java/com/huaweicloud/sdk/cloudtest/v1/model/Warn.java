package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Warn
 */
public class Warn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warn_code")

    private String warnCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warn_msg")

    private String warnMsg;

    public Warn withWarnCode(String warnCode) {
        this.warnCode = warnCode;
        return this;
    }

    /**
     * Get warnCode
     * @return warnCode
     */
    public String getWarnCode() {
        return warnCode;
    }

    public void setWarnCode(String warnCode) {
        this.warnCode = warnCode;
    }

    public Warn withWarnMsg(String warnMsg) {
        this.warnMsg = warnMsg;
        return this;
    }

    /**
     * Get warnMsg
     * @return warnMsg
     */
    public String getWarnMsg() {
        return warnMsg;
    }

    public void setWarnMsg(String warnMsg) {
        this.warnMsg = warnMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Warn that = (Warn) obj;
        return Objects.equals(this.warnCode, that.warnCode) && Objects.equals(this.warnMsg, that.warnMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warnCode, warnMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Warn {\n");
        sb.append("    warnCode: ").append(toIndentedString(warnCode)).append("\n");
        sb.append("    warnMsg: ").append(toIndentedString(warnMsg)).append("\n");
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
