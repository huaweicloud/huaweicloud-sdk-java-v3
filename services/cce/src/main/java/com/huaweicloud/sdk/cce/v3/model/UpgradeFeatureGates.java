package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群升级特性开关
 */
public class UpgradeFeatureGates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportUpgradePageV4")

    private Boolean supportUpgradePageV4;

    public UpgradeFeatureGates withSupportUpgradePageV4(Boolean supportUpgradePageV4) {
        this.supportUpgradePageV4 = supportUpgradePageV4;
        return this;
    }

    /**
     * 集群升级Console界面是否支持V4版本，该字段一般由CCE Console使用。
     * @return supportUpgradePageV4
     */
    public Boolean getSupportUpgradePageV4() {
        return supportUpgradePageV4;
    }

    public void setSupportUpgradePageV4(Boolean supportUpgradePageV4) {
        this.supportUpgradePageV4 = supportUpgradePageV4;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeFeatureGates that = (UpgradeFeatureGates) obj;
        return Objects.equals(this.supportUpgradePageV4, that.supportUpgradePageV4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportUpgradePageV4);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeFeatureGates {\n");
        sb.append("    supportUpgradePageV4: ").append(toIndentedString(supportUpgradePageV4)).append("\n");
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
