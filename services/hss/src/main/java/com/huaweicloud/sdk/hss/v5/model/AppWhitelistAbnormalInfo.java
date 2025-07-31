package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 学习异常原因信息
 */
public class AppWhitelistAbnormalInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_type")

    private Integer abnormalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_description")

    private String abnormalDescription;

    public AppWhitelistAbnormalInfo withAbnormalType(Integer abnormalType) {
        this.abnormalType = abnormalType;
        return this;
    }

    /**
     * 异常类型
     * minimum: 0
     * maximum: 2147483647
     * @return abnormalType
     */
    public Integer getAbnormalType() {
        return abnormalType;
    }

    public void setAbnormalType(Integer abnormalType) {
        this.abnormalType = abnormalType;
    }

    public AppWhitelistAbnormalInfo withAbnormalDescription(String abnormalDescription) {
        this.abnormalDescription = abnormalDescription;
        return this;
    }

    /**
     * 异常描述
     * @return abnormalDescription
     */
    public String getAbnormalDescription() {
        return abnormalDescription;
    }

    public void setAbnormalDescription(String abnormalDescription) {
        this.abnormalDescription = abnormalDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppWhitelistAbnormalInfo that = (AppWhitelistAbnormalInfo) obj;
        return Objects.equals(this.abnormalType, that.abnormalType)
            && Objects.equals(this.abnormalDescription, that.abnormalDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalType, abnormalDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppWhitelistAbnormalInfo {\n");
        sb.append("    abnormalType: ").append(toIndentedString(abnormalType)).append("\n");
        sb.append("    abnormalDescription: ").append(toIndentedString(abnormalDescription)).append("\n");
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
