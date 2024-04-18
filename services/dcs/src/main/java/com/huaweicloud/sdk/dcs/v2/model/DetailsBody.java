package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 详细信息结构体
 */
public class DetailsBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_capacity")

    private String oldCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_capacity")

    private String newCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_public_ip")

    private Boolean enablePublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_id")

    private String publicIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    private String publicIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_cache_mode")

    private String oldCacheMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_cache_mode")

    private String newCacheMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_resource_spec_code")

    private String oldResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_resource_spec_code")

    private String newResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_replica_num")

    private Integer oldReplicaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_replica_num")

    private Integer newReplicaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_cache_type")

    private String oldCacheType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_cache_type")

    private String newCacheType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_ip")

    private String replicaIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_az")

    private String replicaAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_port")

    private Integer oldPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_port")

    private Integer newPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_only_adjust_charging")

    private Boolean isOnlyAdjustCharging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    private String sourceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ip")

    private String targetIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rename_commands")

    private List<String> renameCommands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_config_length")

    private Integer updatedConfigLength;

    public DetailsBody withOldCapacity(String oldCapacity) {
        this.oldCapacity = oldCapacity;
        return this;
    }

    /**
     * 变更前的容量，仅在变更规格时有值。
     * @return oldCapacity
     */
    public String getOldCapacity() {
        return oldCapacity;
    }

    public void setOldCapacity(String oldCapacity) {
        this.oldCapacity = oldCapacity;
    }

    public DetailsBody withNewCapacity(String newCapacity) {
        this.newCapacity = newCapacity;
        return this;
    }

    /**
     * 变更后的容量，仅在变更规格时有值。
     * @return newCapacity
     */
    public String getNewCapacity() {
        return newCapacity;
    }

    public void setNewCapacity(String newCapacity) {
        this.newCapacity = newCapacity;
    }

    public DetailsBody withEnablePublicIp(Boolean enablePublicIp) {
        this.enablePublicIp = enablePublicIp;
        return this;
    }

    /**
     * 是否开启公网访问，仅在开启公网访问时有值。
     * @return enablePublicIp
     */
    public Boolean getEnablePublicIp() {
        return enablePublicIp;
    }

    public void setEnablePublicIp(Boolean enablePublicIp) {
        this.enablePublicIp = enablePublicIp;
    }

    public DetailsBody withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * 公网IP的ID，仅在开启公网访问时有值。
     * @return publicIpId
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    public DetailsBody withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * 公网IP地址，仅在开启公网访问时有值。
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public DetailsBody withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * 是否开启SSL，仅在开启SSL时有值。
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public DetailsBody withOldCacheMode(String oldCacheMode) {
        this.oldCacheMode = oldCacheMode;
        return this;
    }

    /**
     * 变更前的缓存类型，仅在变更规格时有值。
     * @return oldCacheMode
     */
    public String getOldCacheMode() {
        return oldCacheMode;
    }

    public void setOldCacheMode(String oldCacheMode) {
        this.oldCacheMode = oldCacheMode;
    }

    public DetailsBody withNewCacheMode(String newCacheMode) {
        this.newCacheMode = newCacheMode;
        return this;
    }

    /**
     * 变更后的缓存类型，仅在变更规格时有值。
     * @return newCacheMode
     */
    public String getNewCacheMode() {
        return newCacheMode;
    }

    public void setNewCacheMode(String newCacheMode) {
        this.newCacheMode = newCacheMode;
    }

    public DetailsBody withOldResourceSpecCode(String oldResourceSpecCode) {
        this.oldResourceSpecCode = oldResourceSpecCode;
        return this;
    }

    /**
     * 变更前的规格参数，仅在变更规格时有值。
     * @return oldResourceSpecCode
     */
    public String getOldResourceSpecCode() {
        return oldResourceSpecCode;
    }

    public void setOldResourceSpecCode(String oldResourceSpecCode) {
        this.oldResourceSpecCode = oldResourceSpecCode;
    }

    public DetailsBody withNewResourceSpecCode(String newResourceSpecCode) {
        this.newResourceSpecCode = newResourceSpecCode;
        return this;
    }

    /**
     * 变更后的规格参数，仅在变更规格时有值。
     * @return newResourceSpecCode
     */
    public String getNewResourceSpecCode() {
        return newResourceSpecCode;
    }

    public void setNewResourceSpecCode(String newResourceSpecCode) {
        this.newResourceSpecCode = newResourceSpecCode;
    }

    public DetailsBody withOldReplicaNum(Integer oldReplicaNum) {
        this.oldReplicaNum = oldReplicaNum;
        return this;
    }

    /**
     * 变更前的副本数量，仅在变更规格时有值。
     * @return oldReplicaNum
     */
    public Integer getOldReplicaNum() {
        return oldReplicaNum;
    }

    public void setOldReplicaNum(Integer oldReplicaNum) {
        this.oldReplicaNum = oldReplicaNum;
    }

    public DetailsBody withNewReplicaNum(Integer newReplicaNum) {
        this.newReplicaNum = newReplicaNum;
        return this;
    }

    /**
     * 变更后的副本数量，仅在变更规格时有值。
     * @return newReplicaNum
     */
    public Integer getNewReplicaNum() {
        return newReplicaNum;
    }

    public void setNewReplicaNum(Integer newReplicaNum) {
        this.newReplicaNum = newReplicaNum;
    }

    public DetailsBody withOldCacheType(String oldCacheType) {
        this.oldCacheType = oldCacheType;
        return this;
    }

    /**
     * 变更前的缓存类型，仅在变更规格时有值。
     * @return oldCacheType
     */
    public String getOldCacheType() {
        return oldCacheType;
    }

    public void setOldCacheType(String oldCacheType) {
        this.oldCacheType = oldCacheType;
    }

    public DetailsBody withNewCacheType(String newCacheType) {
        this.newCacheType = newCacheType;
        return this;
    }

    /**
     * 变更后的规格类型，仅在变更规格时有值。
     * @return newCacheType
     */
    public String getNewCacheType() {
        return newCacheType;
    }

    public void setNewCacheType(String newCacheType) {
        this.newCacheType = newCacheType;
    }

    public DetailsBody withReplicaIp(String replicaIp) {
        this.replicaIp = replicaIp;
        return this;
    }

    /**
     * 副本IP。
     * @return replicaIp
     */
    public String getReplicaIp() {
        return replicaIp;
    }

    public void setReplicaIp(String replicaIp) {
        this.replicaIp = replicaIp;
    }

    public DetailsBody withReplicaAz(String replicaAz) {
        this.replicaAz = replicaAz;
        return this;
    }

    /**
     * 副本所在可用区。
     * @return replicaAz
     */
    public String getReplicaAz() {
        return replicaAz;
    }

    public void setReplicaAz(String replicaAz) {
        this.replicaAz = replicaAz;
    }

    public DetailsBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 组名。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public DetailsBody withOldPort(Integer oldPort) {
        this.oldPort = oldPort;
        return this;
    }

    /**
     * 旧端口。
     * @return oldPort
     */
    public Integer getOldPort() {
        return oldPort;
    }

    public void setOldPort(Integer oldPort) {
        this.oldPort = oldPort;
    }

    public DetailsBody withNewPort(Integer newPort) {
        this.newPort = newPort;
        return this;
    }

    /**
     * 新端口。
     * @return newPort
     */
    public Integer getNewPort() {
        return newPort;
    }

    public void setNewPort(Integer newPort) {
        this.newPort = newPort;
    }

    public DetailsBody withIsOnlyAdjustCharging(Boolean isOnlyAdjustCharging) {
        this.isOnlyAdjustCharging = isOnlyAdjustCharging;
        return this;
    }

    /**
     * 是否只是调整计费模式。
     * @return isOnlyAdjustCharging
     */
    public Boolean getIsOnlyAdjustCharging() {
        return isOnlyAdjustCharging;
    }

    public void setIsOnlyAdjustCharging(Boolean isOnlyAdjustCharging) {
        this.isOnlyAdjustCharging = isOnlyAdjustCharging;
    }

    public DetailsBody withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 账号名称。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public DetailsBody withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * 源IP。
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public DetailsBody withTargetIp(String targetIp) {
        this.targetIp = targetIp;
        return this;
    }

    /**
     * 目标IP。
     * @return targetIp
     */
    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

    public DetailsBody withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点信息。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public DetailsBody withRenameCommands(List<String> renameCommands) {
        this.renameCommands = renameCommands;
        return this;
    }

    public DetailsBody addRenameCommandsItem(String renameCommandsItem) {
        if (this.renameCommands == null) {
            this.renameCommands = new ArrayList<>();
        }
        this.renameCommands.add(renameCommandsItem);
        return this;
    }

    public DetailsBody withRenameCommands(Consumer<List<String>> renameCommandsSetter) {
        if (this.renameCommands == null) {
            this.renameCommands = new ArrayList<>();
        }
        renameCommandsSetter.accept(this.renameCommands);
        return this;
    }

    /**
     * 重命名的指令。
     * @return renameCommands
     */
    public List<String> getRenameCommands() {
        return renameCommands;
    }

    public void setRenameCommands(List<String> renameCommands) {
        this.renameCommands = renameCommands;
    }

    public DetailsBody withUpdatedConfigLength(Integer updatedConfigLength) {
        this.updatedConfigLength = updatedConfigLength;
        return this;
    }

    /**
     * 更新配置项的长度。
     * @return updatedConfigLength
     */
    public Integer getUpdatedConfigLength() {
        return updatedConfigLength;
    }

    public void setUpdatedConfigLength(Integer updatedConfigLength) {
        this.updatedConfigLength = updatedConfigLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetailsBody that = (DetailsBody) obj;
        return Objects.equals(this.oldCapacity, that.oldCapacity) && Objects.equals(this.newCapacity, that.newCapacity)
            && Objects.equals(this.enablePublicIp, that.enablePublicIp)
            && Objects.equals(this.publicIpId, that.publicIpId)
            && Objects.equals(this.publicIpAddress, that.publicIpAddress)
            && Objects.equals(this.enableSsl, that.enableSsl) && Objects.equals(this.oldCacheMode, that.oldCacheMode)
            && Objects.equals(this.newCacheMode, that.newCacheMode)
            && Objects.equals(this.oldResourceSpecCode, that.oldResourceSpecCode)
            && Objects.equals(this.newResourceSpecCode, that.newResourceSpecCode)
            && Objects.equals(this.oldReplicaNum, that.oldReplicaNum)
            && Objects.equals(this.newReplicaNum, that.newReplicaNum)
            && Objects.equals(this.oldCacheType, that.oldCacheType)
            && Objects.equals(this.newCacheType, that.newCacheType) && Objects.equals(this.replicaIp, that.replicaIp)
            && Objects.equals(this.replicaAz, that.replicaAz) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.oldPort, that.oldPort) && Objects.equals(this.newPort, that.newPort)
            && Objects.equals(this.isOnlyAdjustCharging, that.isOnlyAdjustCharging)
            && Objects.equals(this.accountName, that.accountName) && Objects.equals(this.sourceIp, that.sourceIp)
            && Objects.equals(this.targetIp, that.targetIp) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.renameCommands, that.renameCommands)
            && Objects.equals(this.updatedConfigLength, that.updatedConfigLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldCapacity,
            newCapacity,
            enablePublicIp,
            publicIpId,
            publicIpAddress,
            enableSsl,
            oldCacheMode,
            newCacheMode,
            oldResourceSpecCode,
            newResourceSpecCode,
            oldReplicaNum,
            newReplicaNum,
            oldCacheType,
            newCacheType,
            replicaIp,
            replicaAz,
            groupName,
            oldPort,
            newPort,
            isOnlyAdjustCharging,
            accountName,
            sourceIp,
            targetIp,
            nodeName,
            renameCommands,
            updatedConfigLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailsBody {\n");
        sb.append("    oldCapacity: ").append(toIndentedString(oldCapacity)).append("\n");
        sb.append("    newCapacity: ").append(toIndentedString(newCapacity)).append("\n");
        sb.append("    enablePublicIp: ").append(toIndentedString(enablePublicIp)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    oldCacheMode: ").append(toIndentedString(oldCacheMode)).append("\n");
        sb.append("    newCacheMode: ").append(toIndentedString(newCacheMode)).append("\n");
        sb.append("    oldResourceSpecCode: ").append(toIndentedString(oldResourceSpecCode)).append("\n");
        sb.append("    newResourceSpecCode: ").append(toIndentedString(newResourceSpecCode)).append("\n");
        sb.append("    oldReplicaNum: ").append(toIndentedString(oldReplicaNum)).append("\n");
        sb.append("    newReplicaNum: ").append(toIndentedString(newReplicaNum)).append("\n");
        sb.append("    oldCacheType: ").append(toIndentedString(oldCacheType)).append("\n");
        sb.append("    newCacheType: ").append(toIndentedString(newCacheType)).append("\n");
        sb.append("    replicaIp: ").append(toIndentedString(replicaIp)).append("\n");
        sb.append("    replicaAz: ").append(toIndentedString(replicaAz)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    oldPort: ").append(toIndentedString(oldPort)).append("\n");
        sb.append("    newPort: ").append(toIndentedString(newPort)).append("\n");
        sb.append("    isOnlyAdjustCharging: ").append(toIndentedString(isOnlyAdjustCharging)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    renameCommands: ").append(toIndentedString(renameCommands)).append("\n");
        sb.append("    updatedConfigLength: ").append(toIndentedString(updatedConfigLength)).append("\n");
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
