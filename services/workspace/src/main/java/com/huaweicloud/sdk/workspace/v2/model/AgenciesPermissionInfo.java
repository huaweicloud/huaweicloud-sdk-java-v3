package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 委托权限信息
 */
public class AgenciesPermissionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_permission_display_names")

    private List<String> systemPermissionDisplayNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wanted_system_permission_display_names")

    private List<String> wantedSystemPermissionDisplayNames = null;

    public AgenciesPermissionInfo withSystemPermissionDisplayNames(List<String> systemPermissionDisplayNames) {
        this.systemPermissionDisplayNames = systemPermissionDisplayNames;
        return this;
    }

    public AgenciesPermissionInfo addSystemPermissionDisplayNamesItem(String systemPermissionDisplayNamesItem) {
        if (this.systemPermissionDisplayNames == null) {
            this.systemPermissionDisplayNames = new ArrayList<>();
        }
        this.systemPermissionDisplayNames.add(systemPermissionDisplayNamesItem);
        return this;
    }

    public AgenciesPermissionInfo withSystemPermissionDisplayNames(
        Consumer<List<String>> systemPermissionDisplayNamesSetter) {
        if (this.systemPermissionDisplayNames == null) {
            this.systemPermissionDisplayNames = new ArrayList<>();
        }
        systemPermissionDisplayNamesSetter.accept(this.systemPermissionDisplayNames);
        return this;
    }

    /**
     * 委托权限项
     * @return systemPermissionDisplayNames
     */
    public List<String> getSystemPermissionDisplayNames() {
        return systemPermissionDisplayNames;
    }

    public void setSystemPermissionDisplayNames(List<String> systemPermissionDisplayNames) {
        this.systemPermissionDisplayNames = systemPermissionDisplayNames;
    }

    public AgenciesPermissionInfo withWantedSystemPermissionDisplayNames(
        List<String> wantedSystemPermissionDisplayNames) {
        this.wantedSystemPermissionDisplayNames = wantedSystemPermissionDisplayNames;
        return this;
    }

    public AgenciesPermissionInfo addWantedSystemPermissionDisplayNamesItem(
        String wantedSystemPermissionDisplayNamesItem) {
        if (this.wantedSystemPermissionDisplayNames == null) {
            this.wantedSystemPermissionDisplayNames = new ArrayList<>();
        }
        this.wantedSystemPermissionDisplayNames.add(wantedSystemPermissionDisplayNamesItem);
        return this;
    }

    public AgenciesPermissionInfo withWantedSystemPermissionDisplayNames(
        Consumer<List<String>> wantedSystemPermissionDisplayNamesSetter) {
        if (this.wantedSystemPermissionDisplayNames == null) {
            this.wantedSystemPermissionDisplayNames = new ArrayList<>();
        }
        wantedSystemPermissionDisplayNamesSetter.accept(this.wantedSystemPermissionDisplayNames);
        return this;
    }

    /**
     * 需要委托的权限项
     * @return wantedSystemPermissionDisplayNames
     */
    public List<String> getWantedSystemPermissionDisplayNames() {
        return wantedSystemPermissionDisplayNames;
    }

    public void setWantedSystemPermissionDisplayNames(List<String> wantedSystemPermissionDisplayNames) {
        this.wantedSystemPermissionDisplayNames = wantedSystemPermissionDisplayNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgenciesPermissionInfo that = (AgenciesPermissionInfo) obj;
        return Objects.equals(this.systemPermissionDisplayNames, that.systemPermissionDisplayNames)
            && Objects.equals(this.wantedSystemPermissionDisplayNames, that.wantedSystemPermissionDisplayNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemPermissionDisplayNames, wantedSystemPermissionDisplayNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgenciesPermissionInfo {\n");
        sb.append("    systemPermissionDisplayNames: ")
            .append(toIndentedString(systemPermissionDisplayNames))
            .append("\n");
        sb.append("    wantedSystemPermissionDisplayNames: ")
            .append(toIndentedString(wantedSystemPermissionDisplayNames))
            .append("\n");
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
