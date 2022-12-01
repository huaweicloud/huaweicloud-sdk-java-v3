package com.huaweicloud.sdk.dws.v2.model;

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
public class ListSnapshotPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_day")

    private String keepDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategies")

    private List<BackupStrategyDetail> backupStrategies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ips")

    private List<String> serverIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_port")

    private String serverPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_param")

    private String backupParam;

    public ListSnapshotPolicyResponse withKeepDay(String keepDay) {
        this.keepDay = keepDay;
        return this;
    }

    /**
     * 保留天数。
     * @return keepDay
     */
    public String getKeepDay() {
        return keepDay;
    }

    public void setKeepDay(String keepDay) {
        this.keepDay = keepDay;
    }

    public ListSnapshotPolicyResponse withBackupStrategies(List<BackupStrategyDetail> backupStrategies) {
        this.backupStrategies = backupStrategies;
        return this;
    }

    public ListSnapshotPolicyResponse addBackupStrategiesItem(BackupStrategyDetail backupStrategiesItem) {
        if (this.backupStrategies == null) {
            this.backupStrategies = new ArrayList<>();
        }
        this.backupStrategies.add(backupStrategiesItem);
        return this;
    }

    public ListSnapshotPolicyResponse withBackupStrategies(
        Consumer<List<BackupStrategyDetail>> backupStrategiesSetter) {
        if (this.backupStrategies == null) {
            this.backupStrategies = new ArrayList<>();
        }
        backupStrategiesSetter.accept(this.backupStrategies);
        return this;
    }

    /**
     * 备份策略。
     * @return backupStrategies
     */
    public List<BackupStrategyDetail> getBackupStrategies() {
        return backupStrategies;
    }

    public void setBackupStrategies(List<BackupStrategyDetail> backupStrategies) {
        this.backupStrategies = backupStrategies;
    }

    public ListSnapshotPolicyResponse withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * 备份设备。
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public ListSnapshotPolicyResponse withServerIps(List<String> serverIps) {
        this.serverIps = serverIps;
        return this;
    }

    public ListSnapshotPolicyResponse addServerIpsItem(String serverIpsItem) {
        if (this.serverIps == null) {
            this.serverIps = new ArrayList<>();
        }
        this.serverIps.add(serverIpsItem);
        return this;
    }

    public ListSnapshotPolicyResponse withServerIps(Consumer<List<String>> serverIpsSetter) {
        if (this.serverIps == null) {
            this.serverIps = new ArrayList<>();
        }
        serverIpsSetter.accept(this.serverIps);
        return this;
    }

    /**
     * 服务IP。
     * @return serverIps
     */
    public List<String> getServerIps() {
        return serverIps;
    }

    public void setServerIps(List<String> serverIps) {
        this.serverIps = serverIps;
    }

    public ListSnapshotPolicyResponse withServerPort(String serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * 服务端口。
     * @return serverPort
     */
    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public ListSnapshotPolicyResponse withBackupParam(String backupParam) {
        this.backupParam = backupParam;
        return this;
    }

    /**
     * 参数。
     * @return backupParam
     */
    public String getBackupParam() {
        return backupParam;
    }

    public void setBackupParam(String backupParam) {
        this.backupParam = backupParam;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSnapshotPolicyResponse listSnapshotPolicyResponse = (ListSnapshotPolicyResponse) o;
        return Objects.equals(this.keepDay, listSnapshotPolicyResponse.keepDay)
            && Objects.equals(this.backupStrategies, listSnapshotPolicyResponse.backupStrategies)
            && Objects.equals(this.deviceName, listSnapshotPolicyResponse.deviceName)
            && Objects.equals(this.serverIps, listSnapshotPolicyResponse.serverIps)
            && Objects.equals(this.serverPort, listSnapshotPolicyResponse.serverPort)
            && Objects.equals(this.backupParam, listSnapshotPolicyResponse.backupParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDay, backupStrategies, deviceName, serverIps, serverPort, backupParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotPolicyResponse {\n");
        sb.append("    keepDay: ").append(toIndentedString(keepDay)).append("\n");
        sb.append("    backupStrategies: ").append(toIndentedString(backupStrategies)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    serverIps: ").append(toIndentedString(serverIps)).append("\n");
        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
        sb.append("    backupParam: ").append(toIndentedString(backupParam)).append("\n");
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
