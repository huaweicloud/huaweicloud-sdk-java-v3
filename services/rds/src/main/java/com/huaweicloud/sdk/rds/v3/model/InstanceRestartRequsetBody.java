package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceRestartRequsetBody
 */
public class InstanceRestartRequsetBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart")

    private RestartConfiguration restart;

    public InstanceRestartRequsetBody withRestart(RestartConfiguration restart) {
        this.restart = restart;
        return this;
    }

    public InstanceRestartRequsetBody withRestart(Consumer<RestartConfiguration> restartSetter) {
        if (this.restart == null) {
            this.restart = new RestartConfiguration();
            restartSetter.accept(this.restart);
        }

        return this;
    }

    /**
     * Get restart
     * @return restart
     */
    public RestartConfiguration getRestart() {
        return restart;
    }

    public void setRestart(RestartConfiguration restart) {
        this.restart = restart;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceRestartRequsetBody that = (InstanceRestartRequsetBody) obj;
        return Objects.equals(this.restart, that.restart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceRestartRequsetBody {\n");
        sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
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
