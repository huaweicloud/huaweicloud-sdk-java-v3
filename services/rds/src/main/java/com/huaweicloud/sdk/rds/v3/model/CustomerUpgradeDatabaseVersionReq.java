package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CustomerUpgradeDatabaseVersionReq */
public class CustomerUpgradeDatabaseVersionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Boolean delay;

    public CustomerUpgradeDatabaseVersionReq withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    /** 是否延迟升级。
     * 
     * @return delay */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerUpgradeDatabaseVersionReq customerUpgradeDatabaseVersionReq = (CustomerUpgradeDatabaseVersionReq) o;
        return Objects.equals(this.delay, customerUpgradeDatabaseVersionReq.delay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerUpgradeDatabaseVersionReq {\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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
