package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 域控制器信息。
 */
public class DomainController {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_ip")

    private String dcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_name")

    private String dcName;

    public DomainController withDcIp(String dcIp) {
        this.dcIp = dcIp;
        return this;
    }

    /**
     * 域控制器IP地址。
     * @return dcIp
     */
    public String getDcIp() {
        return dcIp;
    }

    public void setDcIp(String dcIp) {
        this.dcIp = dcIp;
    }

    public DomainController withDcName(String dcName) {
        this.dcName = dcName;
        return this;
    }

    /**
     * 域控制器名称。
     * @return dcName
     */
    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainController that = (DomainController) obj;
        return Objects.equals(this.dcIp, that.dcIp) && Objects.equals(this.dcName, that.dcName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dcIp, dcName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainController {\n");
        sb.append("    dcIp: ").append(toIndentedString(dcIp)).append("\n");
        sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
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
