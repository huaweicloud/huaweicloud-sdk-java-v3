package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 备份策略
 */
public class BackupPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_day")

    private Integer keepDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategies")

    private BackupStrategyDetail backupStrategies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_port")

    private String serverPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_param")

    private String backupParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ips")

    private List<String> serverIps = null;

    public BackupPolicy withKeepDay(Integer keepDay) {
        this.keepDay = keepDay;
        return this;
    }

    /**
     * 保留天数。
     * @return keepDay
     */
    public Integer getKeepDay() {
        return keepDay;
    }

    public void setKeepDay(Integer keepDay) {
        this.keepDay = keepDay;
    }

    public BackupPolicy withBackupStrategies(BackupStrategyDetail backupStrategies) {
        this.backupStrategies = backupStrategies;
        return this;
    }

    public BackupPolicy withBackupStrategies(Consumer<BackupStrategyDetail> backupStrategiesSetter) {
        if (this.backupStrategies == null) {
            this.backupStrategies = new BackupStrategyDetail();
            backupStrategiesSetter.accept(this.backupStrategies);
        }

        return this;
    }

    /**
     * Get backupStrategies
     * @return backupStrategies
     */
    public BackupStrategyDetail getBackupStrategies() {
        return backupStrategies;
    }

    public void setBackupStrategies(BackupStrategyDetail backupStrategies) {
        this.backupStrategies = backupStrategies;
    }

    public BackupPolicy withDeviceName(String deviceName) {
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

    public BackupPolicy withServerPort(String serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * 端口。
     * @return serverPort
     */
    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public BackupPolicy withBackupParam(String backupParam) {
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

    public BackupPolicy withServerIps(List<String> serverIps) {
        this.serverIps = serverIps;
        return this;
    }

    public BackupPolicy addServerIpsItem(String serverIpsItem) {
        if (this.serverIps == null) {
            this.serverIps = new ArrayList<>();
        }
        this.serverIps.add(serverIpsItem);
        return this;
    }

    public BackupPolicy withServerIps(Consumer<List<String>> serverIpsSetter) {
        if (this.serverIps == null) {
            this.serverIps = new ArrayList<>();
        }
        serverIpsSetter.accept(this.serverIps);
        return this;
    }

    /**
     * 备份介质服务IP。
     * @return serverIps
     */
    public List<String> getServerIps() {
        return serverIps;
    }

    public void setServerIps(List<String> serverIps) {
        this.serverIps = serverIps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupPolicy backupPolicy = (BackupPolicy) o;
        return Objects.equals(this.keepDay, backupPolicy.keepDay)
            && Objects.equals(this.backupStrategies, backupPolicy.backupStrategies)
            && Objects.equals(this.deviceName, backupPolicy.deviceName)
            && Objects.equals(this.serverPort, backupPolicy.serverPort)
            && Objects.equals(this.backupParam, backupPolicy.backupParam)
            && Objects.equals(this.serverIps, backupPolicy.serverIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDay, backupStrategies, deviceName, serverPort, backupParam, serverIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPolicy {\n");
        sb.append("    keepDay: ").append(toIndentedString(keepDay)).append("\n");
        sb.append("    backupStrategies: ").append(toIndentedString(backupStrategies)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
        sb.append("    backupParam: ").append(toIndentedString(backupParam)).append("\n");
        sb.append("    serverIps: ").append(toIndentedString(serverIps)).append("\n");
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
