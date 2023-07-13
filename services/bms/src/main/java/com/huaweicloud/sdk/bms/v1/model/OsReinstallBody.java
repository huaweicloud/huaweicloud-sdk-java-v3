package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重装裸金属服务器操作系统接口请求结构体
 */
public class OsReinstallBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-reinstall")

    private OsReinstall osReinstall;

    public OsReinstallBody withOsReinstall(OsReinstall osReinstall) {
        this.osReinstall = osReinstall;
        return this;
    }

    public OsReinstallBody withOsReinstall(Consumer<OsReinstall> osReinstallSetter) {
        if (this.osReinstall == null) {
            this.osReinstall = new OsReinstall();
            osReinstallSetter.accept(this.osReinstall);
        }

        return this;
    }

    /**
     * Get osReinstall
     * @return osReinstall
     */
    public OsReinstall getOsReinstall() {
        return osReinstall;
    }

    public void setOsReinstall(OsReinstall osReinstall) {
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
        OsReinstallBody that = (OsReinstallBody) obj;
        return Objects.equals(this.osReinstall, that.osReinstall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osReinstall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsReinstallBody {\n");
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
