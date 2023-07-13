package com.huaweicloud.sdk.cbr.v1.model;

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
public class ShowMetadataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backups")

    private String backups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floatingips")

    private List<String> floatingips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface")

    private String _interface;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<String> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private String server;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<String> volumes = null;

    public ShowMetadataResponse withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public ShowMetadataResponse withBackups(String backups) {
        this.backups = backups;
        return this;
    }

    /**
     * 云服务器备份信息
     * @return backups
     */
    public String getBackups() {
        return backups;
    }

    public void setBackups(String backups) {
        this.backups = backups;
    }

    public ShowMetadataResponse withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 云服务器规格信息
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ShowMetadataResponse withFloatingips(List<String> floatingips) {
        this.floatingips = floatingips;
        return this;
    }

    public ShowMetadataResponse addFloatingipsItem(String floatingipsItem) {
        if (this.floatingips == null) {
            this.floatingips = new ArrayList<>();
        }
        this.floatingips.add(floatingipsItem);
        return this;
    }

    public ShowMetadataResponse withFloatingips(Consumer<List<String>> floatingipsSetter) {
        if (this.floatingips == null) {
            this.floatingips = new ArrayList<>();
        }
        floatingipsSetter.accept(this.floatingips);
        return this;
    }

    /**
     * 云服务器浮动IP信息
     * @return floatingips
     */
    public List<String> getFloatingips() {
        return floatingips;
    }

    public void setFloatingips(List<String> floatingips) {
        this.floatingips = floatingips;
    }

    public ShowMetadataResponse withInterface(String _interface) {
        this._interface = _interface;
        return this;
    }

    /**
     * 云服务器接口信息
     * @return _interface
     */
    public String getInterface() {
        return _interface;
    }

    public void setInterface(String _interface) {
        this._interface = _interface;
    }

    public ShowMetadataResponse withPorts(List<String> ports) {
        this.ports = ports;
        return this;
    }

    public ShowMetadataResponse addPortsItem(String portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public ShowMetadataResponse withPorts(Consumer<List<String>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 云服务器端口信息
     * @return ports
     */
    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    public ShowMetadataResponse withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * 云服务器信息
     * @return server
     */
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public ShowMetadataResponse withVolumes(List<String> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ShowMetadataResponse addVolumesItem(String volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ShowMetadataResponse withVolumes(Consumer<List<String>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 云服务器卷信息
     * @return volumes
     */
    public List<String> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<String> volumes) {
        this.volumes = volumes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMetadataResponse that = (ShowMetadataResponse) obj;
        return Objects.equals(this.backupId, that.backupId) && Objects.equals(this.backups, that.backups)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.floatingips, that.floatingips)
            && Objects.equals(this._interface, that._interface) && Objects.equals(this.ports, that.ports)
            && Objects.equals(this.server, that.server) && Objects.equals(this.volumes, that.volumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId, backups, flavor, floatingips, _interface, ports, server, volumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetadataResponse {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    floatingips: ").append(toIndentedString(floatingips)).append("\n");
        sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
