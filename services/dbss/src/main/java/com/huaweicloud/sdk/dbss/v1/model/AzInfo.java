package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AzInfo
 */
public class AzInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_number")

    private Integer zoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_type")

    private String azType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_us")

    private String aliasUs;

    public AzInfo withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * 可用区名称
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public AzInfo withZoneNumber(Integer zoneNumber) {
        this.zoneNumber = zoneNumber;
        return this;
    }

    /**
     * 可用区编号
     * @return zoneNumber
     */
    public Integer getZoneNumber() {
        return zoneNumber;
    }

    public void setZoneNumber(Integer zoneNumber) {
        this.zoneNumber = zoneNumber;
    }

    public AzInfo withAzType(String azType) {
        this.azType = azType;
        return this;
    }

    /**
     * 可用区类型 - DEDICATED：大网 - DEC：边缘小站 - EDGE：专属
     * @return azType
     */
    public String getAzType() {
        return azType;
    }

    public void setAzType(String azType) {
        this.azType = azType;
    }

    public AzInfo withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 可用区中文别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public AzInfo withAliasUs(String aliasUs) {
        this.aliasUs = aliasUs;
        return this;
    }

    /**
     * 可用区英文别名
     * @return aliasUs
     */
    public String getAliasUs() {
        return aliasUs;
    }

    public void setAliasUs(String aliasUs) {
        this.aliasUs = aliasUs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AzInfo that = (AzInfo) obj;
        return Objects.equals(this.zoneName, that.zoneName) && Objects.equals(this.zoneNumber, that.zoneNumber)
            && Objects.equals(this.azType, that.azType) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.aliasUs, that.aliasUs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneName, zoneNumber, azType, alias, aliasUs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzInfo {\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    zoneNumber: ").append(toIndentedString(zoneNumber)).append("\n");
        sb.append("    azType: ").append(toIndentedString(azType)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    aliasUs: ").append(toIndentedString(aliasUs)).append("\n");
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
