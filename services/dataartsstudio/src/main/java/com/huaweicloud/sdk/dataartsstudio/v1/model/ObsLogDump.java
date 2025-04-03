package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ObsLogDump
 */
public class ObsLogDump {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_dump")

    private Boolean logDump;

    public ObsLogDump withLogDump(Boolean logDump) {
        this.logDump = logDump;
        return this;
    }

    /**
     * 是否开启Obs日志转储功能，true表示开启，false表示关闭。
     * @return logDump
     */
    public Boolean getLogDump() {
        return logDump;
    }

    public void setLogDump(Boolean logDump) {
        this.logDump = logDump;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsLogDump that = (ObsLogDump) obj;
        return Objects.equals(this.logDump, that.logDump);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logDump);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsLogDump {\n");
        sb.append("    logDump: ").append(toIndentedString(logDump)).append("\n");
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
