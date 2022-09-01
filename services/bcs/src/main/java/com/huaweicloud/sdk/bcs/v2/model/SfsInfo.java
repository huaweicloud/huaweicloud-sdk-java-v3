package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SfsInfo
 */
public class SfsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pvc_name")

    @JacksonXmlProperty(localName = "pvc_name")

    private String pvcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    @JacksonXmlProperty(localName = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    public SfsInfo withPvcName(String pvcName) {
        this.pvcName = pvcName;
        return this;
    }

    /**
     * BCS服务下的SFS文件系统名称
     * @return pvcName
     */
    public String getPvcName() {
        return pvcName;
    }

    public void setPvcName(String pvcName) {
        this.pvcName = pvcName;
    }

    public SfsInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * BCS服务网络存储名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SfsInfo withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * BCS服务网络存储地址
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public SfsInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * BCS服务网络存储类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SfsInfo sfsInfo = (SfsInfo) o;
        return Objects.equals(this.pvcName, sfsInfo.pvcName) && Objects.equals(this.name, sfsInfo.name)
            && Objects.equals(this.addr, sfsInfo.addr) && Objects.equals(this.type, sfsInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pvcName, name, addr, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SfsInfo {\n");
        sb.append("    pvcName: ").append(toIndentedString(pvcName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
