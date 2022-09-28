package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowEdgeNodeUpgradeDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_enable")

    private Boolean upgradeEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ShowEdgeNodeUpgradeDetailsResponse withUpgradeEnable(Boolean upgradeEnable) {
        this.upgradeEnable = upgradeEnable;
        return this;
    }

    /**
     * 是否升级成功
     * @return upgradeEnable
     */
    public Boolean getUpgradeEnable() {
        return upgradeEnable;
    }

    public void setUpgradeEnable(Boolean upgradeEnable) {
        this.upgradeEnable = upgradeEnable;
    }

    public ShowEdgeNodeUpgradeDetailsResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 未升级成功的原因，若升级成功，返回值为空字符串
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ShowEdgeNodeUpgradeDetailsResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 升级成功后，当前边缘节点的版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEdgeNodeUpgradeDetailsResponse showEdgeNodeUpgradeDetailsResponse = (ShowEdgeNodeUpgradeDetailsResponse) o;
        return Objects.equals(this.upgradeEnable, showEdgeNodeUpgradeDetailsResponse.upgradeEnable)
            && Objects.equals(this.reason, showEdgeNodeUpgradeDetailsResponse.reason)
            && Objects.equals(this.version, showEdgeNodeUpgradeDetailsResponse.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeEnable, reason, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEdgeNodeUpgradeDetailsResponse {\n");
        sb.append("    upgradeEnable: ").append(toIndentedString(upgradeEnable)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
