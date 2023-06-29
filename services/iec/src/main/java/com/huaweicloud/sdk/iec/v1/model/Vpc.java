package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 虚拟私有云的数据对象。
 */
public class Vpc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_num")

    private Integer subnetNum;

    public Vpc withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 虚拟私有云的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vpc withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 虚拟私有云名称  取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）  约束：同一个帐号下的名称不能重复
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vpc withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 虚拟私有云下可用子网的范围  取值范围： 10.0.0.0/8~24 172.16.0.0/12~24 192.168.0.0/16~24  约束：必须是cidr格式，例如:192.168.0.0/16
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public Vpc withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 虚拟私有云的模式。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Vpc withSubnetNum(Integer subnetNum) {
        this.subnetNum = subnetNum;
        return this;
    }

    /**
     * 子网的数目。
     * @return subnetNum
     */
    public Integer getSubnetNum() {
        return subnetNum;
    }

    public void setSubnetNum(Integer subnetNum) {
        this.subnetNum = subnetNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vpc that = (Vpc) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.cidr, that.cidr) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.subnetNum, that.subnetNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cidr, mode, subnetNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vpc {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    subnetNum: ").append(toIndentedString(subnetNum)).append("\n");
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
