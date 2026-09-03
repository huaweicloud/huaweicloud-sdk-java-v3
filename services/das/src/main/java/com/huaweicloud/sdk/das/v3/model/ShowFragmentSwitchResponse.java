package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowFragmentSwitchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_name")

    private String switchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open")

    private Boolean open;

    public ShowFragmentSwitchResponse withSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }

    /**
     * 开关名称
     * @return switchName
     */
    public String getSwitchName() {
        return switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public ShowFragmentSwitchResponse withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    /**
     * 是否开启
     * @return open
     */
    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFragmentSwitchResponse that = (ShowFragmentSwitchResponse) obj;
        return Objects.equals(this.switchName, that.switchName) && Objects.equals(this.open, that.open);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchName, open);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFragmentSwitchResponse {\n");
        sb.append("    switchName: ").append(toIndentedString(switchName)).append("\n");
        sb.append("    open: ").append(toIndentedString(open)).append("\n");
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
