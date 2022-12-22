package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新数据源配置
 */
public class ReconfigureExtDataSourceAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reboot")

    private Boolean reboot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    public ReconfigureExtDataSourceAction withReboot(Boolean reboot) {
        this.reboot = reboot;
        return this;
    }

    /**
     * 重启。
     * @return reboot
     */
    public Boolean getReboot() {
        return reboot;
    }

    public void setReboot(Boolean reboot) {
        this.reboot = reboot;
    }

    public ReconfigureExtDataSourceAction withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 委托。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReconfigureExtDataSourceAction reconfigureExtDataSourceAction = (ReconfigureExtDataSourceAction) o;
        return Objects.equals(this.reboot, reconfigureExtDataSourceAction.reboot)
            && Objects.equals(this.agency, reconfigureExtDataSourceAction.agency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reboot, agency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReconfigureExtDataSourceAction {\n");
        sb.append("    reboot: ").append(toIndentedString(reboot)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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
