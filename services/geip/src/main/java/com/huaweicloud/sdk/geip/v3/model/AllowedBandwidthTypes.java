package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 地址池支持的全域公网带宽类型资源
 */
public class AllowedBandwidthTypes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cn_name")

    private String cnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    public AllowedBandwidthTypes withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 全域公网带宽类型名称
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AllowedBandwidthTypes withCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }

    /**
     * 中文名称
     * @return cnName
     */
    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public AllowedBandwidthTypes withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * 英文名称
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AllowedBandwidthTypes that = (AllowedBandwidthTypes) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.cnName, that.cnName)
            && Objects.equals(this.enName, that.enName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cnName, enName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllowedBandwidthTypes {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
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
