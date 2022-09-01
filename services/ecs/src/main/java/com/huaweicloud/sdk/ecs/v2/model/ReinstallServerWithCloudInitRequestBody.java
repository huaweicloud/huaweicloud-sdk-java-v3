package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ReinstallServerWithCloudInitRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-reinstall")

    @JacksonXmlProperty(localName = "os-reinstall")

    private ReinstallServerWithCloudInitOption osReinstall;

    public ReinstallServerWithCloudInitRequestBody withOsReinstall(ReinstallServerWithCloudInitOption osReinstall) {
        this.osReinstall = osReinstall;
        return this;
    }

    public ReinstallServerWithCloudInitRequestBody withOsReinstall(
        Consumer<ReinstallServerWithCloudInitOption> osReinstallSetter) {
        if (this.osReinstall == null) {
            this.osReinstall = new ReinstallServerWithCloudInitOption();
            osReinstallSetter.accept(this.osReinstall);
        }

        return this;
    }

    /**
     * Get osReinstall
     * @return osReinstall
     */
    public ReinstallServerWithCloudInitOption getOsReinstall() {
        return osReinstall;
    }

    public void setOsReinstall(ReinstallServerWithCloudInitOption osReinstall) {
        this.osReinstall = osReinstall;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReinstallServerWithCloudInitRequestBody reinstallServerWithCloudInitRequestBody =
            (ReinstallServerWithCloudInitRequestBody) o;
        return Objects.equals(this.osReinstall, reinstallServerWithCloudInitRequestBody.osReinstall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osReinstall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallServerWithCloudInitRequestBody {\n");
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
