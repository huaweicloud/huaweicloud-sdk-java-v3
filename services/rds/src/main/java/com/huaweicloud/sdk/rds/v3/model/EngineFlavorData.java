package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EngineFlavorData
 */
public class EngineFlavorData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private String ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ipv6_supported")

    private Boolean isIpv6Supported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_code")

    private String typeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Map<String, String> azStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connection")

    private String maxConnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps")

    private String tps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private String qps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_volume_size")

    private String minVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_volume_size")

    private String maxVolumeSize;

    public EngineFlavorData withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * CPU大小。例如：1表示1U。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public EngineFlavorData withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存大小，单位为GB。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public EngineFlavorData withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 资源规格编码。例如：rds.mysql.m1.xlarge.rr。  更多规格说明请参考数据库实例规格。  “rds”代表RDS产品。 “mysql”代表数据库引擎。 “m1.xlarge”代表性能规格，为高内存类型。 “rr”表示只读实例（“.ha”表示主备实例）。 “rha.rr”表示高可用只读实例，规格编码示例：rds.mysql.n1.large.4.rha.rr。 具有公测权限的用户才可选择高可用，您可联系华为云客服人员申请。 高可用只读功能介绍请参见高可用只读简介。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public EngineFlavorData withIsIpv6Supported(Boolean isIpv6Supported) {
        this.isIpv6Supported = isIpv6Supported;
        return this;
    }

    /**
     * 是否支持ipv6。
     * @return isIpv6Supported
     */
    public Boolean getIsIpv6Supported() {
        return isIpv6Supported;
    }

    public void setIsIpv6Supported(Boolean isIpv6Supported) {
        this.isIpv6Supported = isIpv6Supported;
    }

    public EngineFlavorData withTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }

    /**
     * 资源类型
     * @return typeCode
     */
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public EngineFlavorData withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    public EngineFlavorData putAzStatusItem(String key, String azStatusItem) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public EngineFlavorData withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }

    /**
     * 规格所在az的状态，包含以下状态： normal：在售。 unsupported：暂不支持该规格。 sellout：售罄。 abandon：未启用
     * @return azStatus
     */
    public Map<String, String> getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
    }

    public EngineFlavorData withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 性能规格，包含以下状态： normal：通用增强型。 normal2：通用增强Ⅱ型。 armFlavors：鲲鹏通用增强型。 dedicicateNormal（dedicatedNormalLocalssd）：x86独享型。 armLocalssd：鲲鹏通用型。 normalLocalssd：x86通用型。 general：通用型。 dedicated 对于MySQL引擎：独享型。 对于PostgreSQL和SQL Server引擎：独享型，仅云盘SSD支持。 rapid 对于MySQL引擎：独享型（已下线）。 对于PostgreSQL和SQL Server引擎：独享型，仅极速型SSD支持。 bigmem：超大内存型。 highPerformancePrivilegeEdition：超高IO 尊享版
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public EngineFlavorData withMaxConnection(String maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }

    /**
     * 最大连接数
     * @return maxConnection
     */
    public String getMaxConnection() {
        return maxConnection;
    }

    public void setMaxConnection(String maxConnection) {
        this.maxConnection = maxConnection;
    }

    public EngineFlavorData withTps(String tps) {
        this.tps = tps;
        return this;
    }

    /**
     * 数据库每秒执行的事务数，每个事务中包含18条SQL语句。
     * @return tps
     */
    public String getTps() {
        return tps;
    }

    public void setTps(String tps) {
        this.tps = tps;
    }

    public EngineFlavorData withQps(String qps) {
        this.qps = qps;
        return this;
    }

    /**
     * 数据库每秒执行的SQL数，包含insert、select、update、delete等。
     * @return qps
     */
    public String getQps() {
        return qps;
    }

    public void setQps(String qps) {
        this.qps = qps;
    }

    public EngineFlavorData withMinVolumeSize(String minVolumeSize) {
        this.minVolumeSize = minVolumeSize;
        return this;
    }

    /**
     * 最小磁盘容量，单位G
     * @return minVolumeSize
     */
    public String getMinVolumeSize() {
        return minVolumeSize;
    }

    public void setMinVolumeSize(String minVolumeSize) {
        this.minVolumeSize = minVolumeSize;
    }

    public EngineFlavorData withMaxVolumeSize(String maxVolumeSize) {
        this.maxVolumeSize = maxVolumeSize;
        return this;
    }

    /**
     * 最大磁盘容量，单位G
     * @return maxVolumeSize
     */
    public String getMaxVolumeSize() {
        return maxVolumeSize;
    }

    public void setMaxVolumeSize(String maxVolumeSize) {
        this.maxVolumeSize = maxVolumeSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineFlavorData that = (EngineFlavorData) obj;
        return Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.isIpv6Supported, that.isIpv6Supported)
            && Objects.equals(this.typeCode, that.typeCode) && Objects.equals(this.azStatus, that.azStatus)
            && Objects.equals(this.groupType, that.groupType) && Objects.equals(this.maxConnection, that.maxConnection)
            && Objects.equals(this.tps, that.tps) && Objects.equals(this.qps, that.qps)
            && Objects.equals(this.minVolumeSize, that.minVolumeSize)
            && Objects.equals(this.maxVolumeSize, that.maxVolumeSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vcpus,
            ram,
            specCode,
            isIpv6Supported,
            typeCode,
            azStatus,
            groupType,
            maxConnection,
            tps,
            qps,
            minVolumeSize,
            maxVolumeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineFlavorData {\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    isIpv6Supported: ").append(toIndentedString(isIpv6Supported)).append("\n");
        sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    maxConnection: ").append(toIndentedString(maxConnection)).append("\n");
        sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
        sb.append("    minVolumeSize: ").append(toIndentedString(minVolumeSize)).append("\n");
        sb.append("    maxVolumeSize: ").append(toIndentedString(maxVolumeSize)).append("\n");
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
