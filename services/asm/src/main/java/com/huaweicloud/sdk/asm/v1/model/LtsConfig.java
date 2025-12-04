package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LtsConfig
 */
public class LtsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logGroupID")

    private String logGroupID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logStreamID")

    private String logStreamID;

    public LtsConfig withLogGroupID(String logGroupID) {
        this.logGroupID = logGroupID;
        return this;
    }

    /**
     * AccessLog日志组ID
     * @return logGroupID
     */
    public String getLogGroupID() {
        return logGroupID;
    }

    public void setLogGroupID(String logGroupID) {
        this.logGroupID = logGroupID;
    }

    public LtsConfig withLogStreamID(String logStreamID) {
        this.logStreamID = logStreamID;
        return this;
    }

    /**
     * AccessLog输出日志流ID
     * @return logStreamID
     */
    public String getLogStreamID() {
        return logStreamID;
    }

    public void setLogStreamID(String logStreamID) {
        this.logStreamID = logStreamID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsConfig that = (LtsConfig) obj;
        return Objects.equals(this.logGroupID, that.logGroupID) && Objects.equals(this.logStreamID, that.logStreamID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupID, logStreamID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsConfig {\n");
        sb.append("    logGroupID: ").append(toIndentedString(logGroupID)).append("\n");
        sb.append("    logStreamID: ").append(toIndentedString(logStreamID)).append("\n");
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
