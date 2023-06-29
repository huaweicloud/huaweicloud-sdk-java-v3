package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto restart Body Object
 */
public class RestartInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart")

    private RestarInstanceInfo restart;

    public RestartInstanceReq withRestart(RestarInstanceInfo restart) {
        this.restart = restart;
        return this;
    }

    public RestartInstanceReq withRestart(Consumer<RestarInstanceInfo> restartSetter) {
        if (this.restart == null) {
            this.restart = new RestarInstanceInfo();
            restartSetter.accept(this.restart);
        }

        return this;
    }

    /**
     * Get restart
     * @return restart
     */
    public RestarInstanceInfo getRestart() {
        return restart;
    }

    public void setRestart(RestarInstanceInfo restart) {
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
        RestartInstanceReq that = (RestartInstanceReq) obj;
        return Objects.equals(this.restart, that.restart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartInstanceReq {\n");
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
