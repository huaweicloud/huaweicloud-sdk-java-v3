package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ReinstallServerWithoutCloudInitRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-reinstall")

    private ReinstallServerWithoutCloudInitOption osReinstall;

    public ReinstallServerWithoutCloudInitRequestBody withOsReinstall(
        ReinstallServerWithoutCloudInitOption osReinstall) {
        this.osReinstall = osReinstall;
        return this;
    }

    public ReinstallServerWithoutCloudInitRequestBody withOsReinstall(
        Consumer<ReinstallServerWithoutCloudInitOption> osReinstallSetter) {
        if (this.osReinstall == null) {
            this.osReinstall = new ReinstallServerWithoutCloudInitOption();
            osReinstallSetter.accept(this.osReinstall);
        }

        return this;
    }

    /**
     * Get osReinstall
     * @return osReinstall
     */
    public ReinstallServerWithoutCloudInitOption getOsReinstall() {
        return osReinstall;
    }

    public void setOsReinstall(ReinstallServerWithoutCloudInitOption osReinstall) {
        this.osReinstall = osReinstall;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReinstallServerWithoutCloudInitRequestBody that = (ReinstallServerWithoutCloudInitRequestBody) obj;
        return Objects.equals(this.osReinstall, that.osReinstall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osReinstall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallServerWithoutCloudInitRequestBody {\n");
        sb.append("    osReinstall: ").append(toIndentedString(osReinstall)).append("\n");
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
