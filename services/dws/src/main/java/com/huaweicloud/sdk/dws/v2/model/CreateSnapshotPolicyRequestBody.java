package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 创建备份策略信息。 **取值范围**： 不涉及。
 */
public class CreateSnapshotPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_day")

    private Integer keepDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategies")

    private List<BackupStrategyRequest> backupStrategies = null;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_backup")

    private Boolean autoBackup;

    public CreateSnapshotPolicyRequestBody withKeepDay(Integer keepDay) {
        this.keepDay = keepDay;
        return this;
    }

    /**
     * **参数解释**： 保留天数。 **取值范围**： 输入值必须在1-31之间。
     * @return keepDay
     */
    public Integer getKeepDay() {
        return keepDay;
    }

    public void setKeepDay(Integer keepDay) {
        this.keepDay = keepDay;
    }

    public CreateSnapshotPolicyRequestBody withBackupStrategies(List<BackupStrategyRequest> backupStrategies) {
        this.backupStrategies = backupStrategies;
        return this;
    }

    public CreateSnapshotPolicyRequestBody addBackupStrategiesItem(BackupStrategyRequest backupStrategiesItem) {
        if (this.backupStrategies == null) {
            this.backupStrategies = new ArrayList<>();
        }
        this.backupStrategies.add(backupStrategiesItem);
        return this;
    }

    public CreateSnapshotPolicyRequestBody withBackupStrategies(
        Consumer<List<BackupStrategyRequest>> backupStrategiesSetter) {
        if (this.backupStrategies == null) {
            this.backupStrategies = new ArrayList<>();
        }
        backupStrategiesSetter.accept(this.backupStrategies);
        return this;
    }

    /**
     * **参数解释**： 策略列表信息。当需要添加策略时该参数为必选。 **取值范围**： 不涉及。
     * @return backupStrategies
     */
    public List<BackupStrategyRequest> getBackupStrategies() {
        return backupStrategies;
    }

    public void setBackupStrategies(List<BackupStrategyRequest> backupStrategies) {
        this.backupStrategies = backupStrategies;
    }

    public CreateSnapshotPolicyRequestBody withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * **参数解释**： 备份设备。支持OBS、NBU和NFS。 **取值范围**： 不涉及。
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public CreateSnapshotPolicyRequestBody withServerPort(String serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * **参数解释**： NBU备份介质端口。备份介质为NBU时该字段必填。 **取值范围**： 不涉及。
     * @return serverPort
     */
    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public CreateSnapshotPolicyRequestBody withBackupParam(String backupParam) {
        this.backupParam = backupParam;
        return this;
    }

    /**
     * **参数解释**： NBU备份参数。备份介质为NBU时该字段必选。 **取值范围**： 不涉及。
     * @return backupParam
     */
    public String getBackupParam() {
        return backupParam;
    }

    public void setBackupParam(String backupParam) {
        this.backupParam = backupParam;
    }

    public CreateSnapshotPolicyRequestBody withServerIps(List<String> serverIps) {
        this.serverIps = serverIps;
        return this;
    }

    public CreateSnapshotPolicyRequestBody addServerIpsItem(String serverIpsItem) {
        if (this.serverIps == null) {
            this.serverIps = new ArrayList<>();
        }
        this.serverIps.add(serverIpsItem);
        return this;
    }

    public CreateSnapshotPolicyRequestBody withServerIps(Consumer<List<String>> serverIpsSetter) {
        if (this.serverIps == null) {
            this.serverIps = new ArrayList<>();
        }
        serverIpsSetter.accept(this.serverIps);
        return this;
    }

    /**
     * **参数解释**： 备份介质服务IP。备份介质为NBU和NFS时该字段必填。备份介质为NBU时表示NBU服务器地址，备份介质为NFS时表示NFS服务器地址。 **取值范围**： 不涉及。
     * @return serverIps
     */
    public List<String> getServerIps() {
        return serverIps;
    }

    public void setServerIps(List<String> serverIps) {
        this.serverIps = serverIps;
    }

    public CreateSnapshotPolicyRequestBody withAutoBackup(Boolean autoBackup) {
        this.autoBackup = autoBackup;
        return this;
    }

    /**
     * **参数解释**： 是否自动备份。 **取值范围**： 不涉及。
     * @return autoBackup
     */
    public Boolean getAutoBackup() {
        return autoBackup;
    }

    public void setAutoBackup(Boolean autoBackup) {
        this.autoBackup = autoBackup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSnapshotPolicyRequestBody that = (CreateSnapshotPolicyRequestBody) obj;
        return Objects.equals(this.keepDay, that.keepDay)
            && Objects.equals(this.backupStrategies, that.backupStrategies)
            && Objects.equals(this.deviceName, that.deviceName) && Objects.equals(this.serverPort, that.serverPort)
            && Objects.equals(this.backupParam, that.backupParam) && Objects.equals(this.serverIps, that.serverIps)
            && Objects.equals(this.autoBackup, that.autoBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDay, backupStrategies, deviceName, serverPort, backupParam, serverIps, autoBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotPolicyRequestBody {\n");
        sb.append("    keepDay: ").append(toIndentedString(keepDay)).append("\n");
        sb.append("    backupStrategies: ").append(toIndentedString(backupStrategies)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
        sb.append("    backupParam: ").append(toIndentedString(backupParam)).append("\n");
        sb.append("    serverIps: ").append(toIndentedString(serverIps)).append("\n");
        sb.append("    autoBackup: ").append(toIndentedString(autoBackup)).append("\n");
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
