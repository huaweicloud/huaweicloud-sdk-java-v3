package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IpsRuleUpdateTimeVO
 */
public class IpsRuleUpdateTimeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_type")

    private Integer ipsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_version")

    private String ipsVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public IpsRuleUpdateTimeVO withIpsType(Integer ipsType) {
        this.ipsType = ipsType;
        return this;
    }

    /**
     * ips类型，0表示基础防御，1表示虚拟补丁
     * @return ipsType
     */
    public Integer getIpsType() {
        return ipsType;
    }

    public void setIpsType(Integer ipsType) {
        this.ipsType = ipsType;
    }

    public IpsRuleUpdateTimeVO withIpsVersion(String ipsVersion) {
        this.ipsVersion = ipsVersion;
        return this;
    }

    /**
     * ips规则版本
     * @return ipsVersion
     */
    public String getIpsVersion() {
        return ipsVersion;
    }

    public void setIpsVersion(String ipsVersion) {
        this.ipsVersion = ipsVersion;
    }

    public IpsRuleUpdateTimeVO withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * ips更新时间戳
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpsRuleUpdateTimeVO that = (IpsRuleUpdateTimeVO) obj;
        return Objects.equals(this.ipsType, that.ipsType) && Objects.equals(this.ipsVersion, that.ipsVersion)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipsType, ipsVersion, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsRuleUpdateTimeVO {\n");
        sb.append("    ipsType: ").append(toIndentedString(ipsType)).append("\n");
        sb.append("    ipsVersion: ").append(toIndentedString(ipsVersion)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
