package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 滚动升级信息。
 */
public class RollUpgradeProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgraded_dn_group_numbers")

    private String upgradedDnGroupNumbers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_dn_group_numbers")

    private String totalDnGroupNumbers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_fully_upgraded_az")

    private String notFullyUpgradedAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "already_upgraded_az")

    private String alreadyUpgradedAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_description_map")

    private Map<String, String> azDescriptionMap = null;

    public RollUpgradeProgress withUpgradedDnGroupNumbers(String upgradedDnGroupNumbers) {
        this.upgradedDnGroupNumbers = upgradedDnGroupNumbers;
        return this;
    }

    /**
     * 已升级分片数，非独立部署返回null。
     * @return upgradedDnGroupNumbers
     */
    public String getUpgradedDnGroupNumbers() {
        return upgradedDnGroupNumbers;
    }

    public void setUpgradedDnGroupNumbers(String upgradedDnGroupNumbers) {
        this.upgradedDnGroupNumbers = upgradedDnGroupNumbers;
    }

    public RollUpgradeProgress withTotalDnGroupNumbers(String totalDnGroupNumbers) {
        this.totalDnGroupNumbers = totalDnGroupNumbers;
        return this;
    }

    /**
     * 总分片数，非独立部署返回null。
     * @return totalDnGroupNumbers
     */
    public String getTotalDnGroupNumbers() {
        return totalDnGroupNumbers;
    }

    public void setTotalDnGroupNumbers(String totalDnGroupNumbers) {
        this.totalDnGroupNumbers = totalDnGroupNumbers;
    }

    public RollUpgradeProgress withNotFullyUpgradedAz(String notFullyUpgradedAz) {
        this.notFullyUpgradedAz = notFullyUpgradedAz;
        return this;
    }

    /**
     * 未完成升级的az，以“,”隔开，独立部署返回null。
     * @return notFullyUpgradedAz
     */
    public String getNotFullyUpgradedAz() {
        return notFullyUpgradedAz;
    }

    public void setNotFullyUpgradedAz(String notFullyUpgradedAz) {
        this.notFullyUpgradedAz = notFullyUpgradedAz;
    }

    public RollUpgradeProgress withAlreadyUpgradedAz(String alreadyUpgradedAz) {
        this.alreadyUpgradedAz = alreadyUpgradedAz;
        return this;
    }

    /**
     * 已升级az，以“,”隔开，独立部署返回null。
     * @return alreadyUpgradedAz
     */
    public String getAlreadyUpgradedAz() {
        return alreadyUpgradedAz;
    }

    public void setAlreadyUpgradedAz(String alreadyUpgradedAz) {
        this.alreadyUpgradedAz = alreadyUpgradedAz;
    }

    public RollUpgradeProgress withAzDescriptionMap(Map<String, String> azDescriptionMap) {
        this.azDescriptionMap = azDescriptionMap;
        return this;
    }

    public RollUpgradeProgress putAzDescriptionMapItem(String key, String azDescriptionMapItem) {
        if (this.azDescriptionMap == null) {
            this.azDescriptionMap = new HashMap<>();
        }
        this.azDescriptionMap.put(key, azDescriptionMapItem);
        return this;
    }

    public RollUpgradeProgress withAzDescriptionMap(Consumer<Map<String, String>> azDescriptionMapSetter) {
        if (this.azDescriptionMap == null) {
            this.azDescriptionMap = new HashMap<>();
        }
        azDescriptionMapSetter.accept(this.azDescriptionMap);
        return this;
    }

    /**
     * az描述键值对Map<String,String>。
     * @return azDescriptionMap
     */
    public Map<String, String> getAzDescriptionMap() {
        return azDescriptionMap;
    }

    public void setAzDescriptionMap(Map<String, String> azDescriptionMap) {
        this.azDescriptionMap = azDescriptionMap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RollUpgradeProgress that = (RollUpgradeProgress) obj;
        return Objects.equals(this.upgradedDnGroupNumbers, that.upgradedDnGroupNumbers)
            && Objects.equals(this.totalDnGroupNumbers, that.totalDnGroupNumbers)
            && Objects.equals(this.notFullyUpgradedAz, that.notFullyUpgradedAz)
            && Objects.equals(this.alreadyUpgradedAz, that.alreadyUpgradedAz)
            && Objects.equals(this.azDescriptionMap, that.azDescriptionMap);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(upgradedDnGroupNumbers, totalDnGroupNumbers, notFullyUpgradedAz, alreadyUpgradedAz, azDescriptionMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollUpgradeProgress {\n");
        sb.append("    upgradedDnGroupNumbers: ").append(toIndentedString(upgradedDnGroupNumbers)).append("\n");
        sb.append("    totalDnGroupNumbers: ").append(toIndentedString(totalDnGroupNumbers)).append("\n");
        sb.append("    notFullyUpgradedAz: ").append(toIndentedString(notFullyUpgradedAz)).append("\n");
        sb.append("    alreadyUpgradedAz: ").append(toIndentedString(alreadyUpgradedAz)).append("\n");
        sb.append("    azDescriptionMap: ").append(toIndentedString(azDescriptionMap)).append("\n");
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
