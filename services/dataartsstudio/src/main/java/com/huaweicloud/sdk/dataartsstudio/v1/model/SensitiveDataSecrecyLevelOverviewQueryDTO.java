package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 敏感规则数据结果表查询对象
 */
public class SensitiveDataSecrecyLevelOverviewQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_id")

    private String secrecyLevelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_name")

    private String secrecyLevelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_number")

    private Long secrecyLevelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public SensitiveDataSecrecyLevelOverviewQueryDTO withSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
        return this;
    }

    /**
     * 密级ID
     * @return secrecyLevelId
     */
    public String getSecrecyLevelId() {
        return secrecyLevelId;
    }

    public void setSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
    }

    public SensitiveDataSecrecyLevelOverviewQueryDTO withSecrecyLevelName(String secrecyLevelName) {
        this.secrecyLevelName = secrecyLevelName;
        return this;
    }

    /**
     * 密级名称
     * @return secrecyLevelName
     */
    public String getSecrecyLevelName() {
        return secrecyLevelName;
    }

    public void setSecrecyLevelName(String secrecyLevelName) {
        this.secrecyLevelName = secrecyLevelName;
    }

    public SensitiveDataSecrecyLevelOverviewQueryDTO withSecrecyLevelNumber(Long secrecyLevelNumber) {
        this.secrecyLevelNumber = secrecyLevelNumber;
        return this;
    }

    /**
     * 密级的等级
     * minimum: 1
     * maximum: 128
     * @return secrecyLevelNumber
     */
    public Long getSecrecyLevelNumber() {
        return secrecyLevelNumber;
    }

    public void setSecrecyLevelNumber(Long secrecyLevelNumber) {
        this.secrecyLevelNumber = secrecyLevelNumber;
    }

    public SensitiveDataSecrecyLevelOverviewQueryDTO withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 当前密级下的敏感字段数量
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SensitiveDataSecrecyLevelOverviewQueryDTO that = (SensitiveDataSecrecyLevelOverviewQueryDTO) obj;
        return Objects.equals(this.secrecyLevelId, that.secrecyLevelId)
            && Objects.equals(this.secrecyLevelName, that.secrecyLevelName)
            && Objects.equals(this.secrecyLevelNumber, that.secrecyLevelNumber)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secrecyLevelId, secrecyLevelName, secrecyLevelNumber, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SensitiveDataSecrecyLevelOverviewQueryDTO {\n");
        sb.append("    secrecyLevelId: ").append(toIndentedString(secrecyLevelId)).append("\n");
        sb.append("    secrecyLevelName: ").append(toIndentedString(secrecyLevelName)).append("\n");
        sb.append("    secrecyLevelNumber: ").append(toIndentedString(secrecyLevelNumber)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
