package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSwitchConfigInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_info")

    private SwitchInfo switchInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_info")

    private VersionInfo versionInfo;

    public ListSwitchConfigInfoResponse withSwitchInfo(SwitchInfo switchInfo) {
        this.switchInfo = switchInfo;
        return this;
    }

    public ListSwitchConfigInfoResponse withSwitchInfo(Consumer<SwitchInfo> switchInfoSetter) {
        if (this.switchInfo == null) {
            this.switchInfo = new SwitchInfo();
            switchInfoSetter.accept(this.switchInfo);
        }

        return this;
    }

    /**
     * Get switchInfo
     * @return switchInfo
     */
    public SwitchInfo getSwitchInfo() {
        return switchInfo;
    }

    public void setSwitchInfo(SwitchInfo switchInfo) {
        this.switchInfo = switchInfo;
    }

    public ListSwitchConfigInfoResponse withVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }

    public ListSwitchConfigInfoResponse withVersionInfo(Consumer<VersionInfo> versionInfoSetter) {
        if (this.versionInfo == null) {
            this.versionInfo = new VersionInfo();
            versionInfoSetter.accept(this.versionInfo);
        }

        return this;
    }

    /**
     * Get versionInfo
     * @return versionInfo
     */
    public VersionInfo getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSwitchConfigInfoResponse that = (ListSwitchConfigInfoResponse) obj;
        return Objects.equals(this.switchInfo, that.switchInfo) && Objects.equals(this.versionInfo, that.versionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchInfo, versionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSwitchConfigInfoResponse {\n");
        sb.append("    switchInfo: ").append(toIndentedString(switchInfo)).append("\n");
        sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
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
