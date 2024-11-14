package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 后端存储自动同步策略
 */
public class ObsDataRepositoryPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_export_policy")

    private AutoExportPolicy autoExportPolicy;

    public ObsDataRepositoryPolicy withAutoExportPolicy(AutoExportPolicy autoExportPolicy) {
        this.autoExportPolicy = autoExportPolicy;
        return this;
    }

    public ObsDataRepositoryPolicy withAutoExportPolicy(Consumer<AutoExportPolicy> autoExportPolicySetter) {
        if (this.autoExportPolicy == null) {
            this.autoExportPolicy = new AutoExportPolicy();
            autoExportPolicySetter.accept(this.autoExportPolicy);
        }

        return this;
    }

    /**
     * Get autoExportPolicy
     * @return autoExportPolicy
     */
    public AutoExportPolicy getAutoExportPolicy() {
        return autoExportPolicy;
    }

    public void setAutoExportPolicy(AutoExportPolicy autoExportPolicy) {
        this.autoExportPolicy = autoExportPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsDataRepositoryPolicy that = (ObsDataRepositoryPolicy) obj;
        return Objects.equals(this.autoExportPolicy, that.autoExportPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoExportPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsDataRepositoryPolicy {\n");
        sb.append("    autoExportPolicy: ").append(toIndentedString(autoExportPolicy)).append("\n");
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
