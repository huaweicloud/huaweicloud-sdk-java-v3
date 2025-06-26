package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 更新数据源配置。 **取值范围**： 不涉及。
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
     * **参数解释**： 重启。 **取值范围**： 不涉及。
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
     * **参数解释**： 委托。 **取值范围**： 不涉及。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReconfigureExtDataSourceAction that = (ReconfigureExtDataSourceAction) obj;
        return Objects.equals(this.reboot, that.reboot) && Objects.equals(this.agency, that.agency);
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
