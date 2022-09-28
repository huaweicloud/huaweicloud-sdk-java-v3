package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 终止作业请求体
 */
public class TerminateJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private Boolean force;

    public TerminateJobReq withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * 是否强制终止,默认为false
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TerminateJobReq terminateJobReq = (TerminateJobReq) o;
        return Objects.equals(this.force, terminateJobReq.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(force);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TerminateJobReq {\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
