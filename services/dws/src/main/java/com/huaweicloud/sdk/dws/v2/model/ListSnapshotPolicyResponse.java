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

    private Integer keepDay;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_backup")

    private Boolean autoBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy_cluster_type_limit_num")

    private Integer backupStrategyClusterTypeLimitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy_schema_type_limit_num")

    private Integer backupStrategySchemaTypeLimitNum;

    public ListSnapshotPolicyResponse withKeepDay(Integer keepDay) {
        this.keepDay = keepDay;
        return this;
    }

    /**
     * **参数解释**： 保留天数。 **取值范围**： 大于等于0。
     * @return keepDay
     */
    public Integer getKeepDay() {
        return keepDay;
    }

    public void setKeepDay(Integer keepDay) {
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
     * **参数解释**： 备份策略列表。 **取值范围**： 不涉及。
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
     * **参数解释**： 备份设备，一般为OBS。 **取值范围**： 不涉及。
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
     * **参数解释**： 服务IP。 **取值范围**： 不涉及。
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
     * **参数解释**： 服务端口。 **取值范围**： 不涉及。
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
     * **参数解释**： 备份参数。 **取值范围**： 不涉及。
     * @return backupParam
     */
    public String getBackupParam() {
        return backupParam;
    }

    public void setBackupParam(String backupParam) {
        this.backupParam = backupParam;
    }

    public ListSnapshotPolicyResponse withAutoBackup(Boolean autoBackup) {
        this.autoBackup = autoBackup;
        return this;
    }

    /**
     * **参数解释**： 自动备份开关状态。 **取值范围**： true：已开启自动备份选项； false：已关闭自动备份选项；
     * @return autoBackup
     */
    public Boolean getAutoBackup() {
        return autoBackup;
    }

    public void setAutoBackup(Boolean autoBackup) {
        this.autoBackup = autoBackup;
    }

    public ListSnapshotPolicyResponse withBackupStrategyClusterTypeLimitNum(Integer backupStrategyClusterTypeLimitNum) {
        this.backupStrategyClusterTypeLimitNum = backupStrategyClusterTypeLimitNum;
        return this;
    }

    /**
     * **参数解释**： 此策略下集群级快照最大数量。 **取值范围**： 大于等于0。
     * @return backupStrategyClusterTypeLimitNum
     */
    public Integer getBackupStrategyClusterTypeLimitNum() {
        return backupStrategyClusterTypeLimitNum;
    }

    public void setBackupStrategyClusterTypeLimitNum(Integer backupStrategyClusterTypeLimitNum) {
        this.backupStrategyClusterTypeLimitNum = backupStrategyClusterTypeLimitNum;
    }

    public ListSnapshotPolicyResponse withBackupStrategySchemaTypeLimitNum(Integer backupStrategySchemaTypeLimitNum) {
        this.backupStrategySchemaTypeLimitNum = backupStrategySchemaTypeLimitNum;
        return this;
    }

    /**
     * **参数解释**： 此策略下schema级快照最大数量。 **取值范围**： 大于等于0。
     * @return backupStrategySchemaTypeLimitNum
     */
    public Integer getBackupStrategySchemaTypeLimitNum() {
        return backupStrategySchemaTypeLimitNum;
    }

    public void setBackupStrategySchemaTypeLimitNum(Integer backupStrategySchemaTypeLimitNum) {
        this.backupStrategySchemaTypeLimitNum = backupStrategySchemaTypeLimitNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotPolicyResponse that = (ListSnapshotPolicyResponse) obj;
        return Objects.equals(this.keepDay, that.keepDay)
            && Objects.equals(this.backupStrategies, that.backupStrategies)
            && Objects.equals(this.deviceName, that.deviceName) && Objects.equals(this.serverIps, that.serverIps)
            && Objects.equals(this.serverPort, that.serverPort) && Objects.equals(this.backupParam, that.backupParam)
            && Objects.equals(this.autoBackup, that.autoBackup)
            && Objects.equals(this.backupStrategyClusterTypeLimitNum, that.backupStrategyClusterTypeLimitNum)
            && Objects.equals(this.backupStrategySchemaTypeLimitNum, that.backupStrategySchemaTypeLimitNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDay,
            backupStrategies,
            deviceName,
            serverIps,
            serverPort,
            backupParam,
            autoBackup,
            backupStrategyClusterTypeLimitNum,
            backupStrategySchemaTypeLimitNum);
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
        sb.append("    autoBackup: ").append(toIndentedString(autoBackup)).append("\n");
        sb.append("    backupStrategyClusterTypeLimitNum: ")
            .append(toIndentedString(backupStrategyClusterTypeLimitNum))
            .append("\n");
        sb.append("    backupStrategySchemaTypeLimitNum: ")
            .append(toIndentedString(backupStrategySchemaTypeLimitNum))
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
