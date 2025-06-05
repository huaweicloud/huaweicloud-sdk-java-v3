package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListClusterInstallStepResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installs")

    private List<InstallStep> installs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uninstalls")

    private List<InstallStep> uninstalls = null;

    public ListClusterInstallStepResponse withInstalls(List<InstallStep> installs) {
        this.installs = installs;
        return this;
    }

    public ListClusterInstallStepResponse addInstallsItem(InstallStep installsItem) {
        if (this.installs == null) {
            this.installs = new ArrayList<>();
        }
        this.installs.add(installsItem);
        return this;
    }

    public ListClusterInstallStepResponse withInstalls(Consumer<List<InstallStep>> installsSetter) {
        if (this.installs == null) {
            this.installs = new ArrayList<>();
        }
        installsSetter.accept(this.installs);
        return this;
    }

    /**
     * 安装步骤详情列表。
     * @return installs
     */
    public List<InstallStep> getInstalls() {
        return installs;
    }

    public void setInstalls(List<InstallStep> installs) {
        this.installs = installs;
    }

    public ListClusterInstallStepResponse withUninstalls(List<InstallStep> uninstalls) {
        this.uninstalls = uninstalls;
        return this;
    }

    public ListClusterInstallStepResponse addUninstallsItem(InstallStep uninstallsItem) {
        if (this.uninstalls == null) {
            this.uninstalls = new ArrayList<>();
        }
        this.uninstalls.add(uninstallsItem);
        return this;
    }

    public ListClusterInstallStepResponse withUninstalls(Consumer<List<InstallStep>> uninstallsSetter) {
        if (this.uninstalls == null) {
            this.uninstalls = new ArrayList<>();
        }
        uninstallsSetter.accept(this.uninstalls);
        return this;
    }

    /**
     * 卸载步骤详情列表。
     * @return uninstalls
     */
    public List<InstallStep> getUninstalls() {
        return uninstalls;
    }

    public void setUninstalls(List<InstallStep> uninstalls) {
        this.uninstalls = uninstalls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterInstallStepResponse that = (ListClusterInstallStepResponse) obj;
        return Objects.equals(this.installs, that.installs) && Objects.equals(this.uninstalls, that.uninstalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(installs, uninstalls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterInstallStepResponse {\n");
        sb.append("    installs: ").append(toIndentedString(installs)).append("\n");
        sb.append("    uninstalls: ").append(toIndentedString(uninstalls)).append("\n");
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
