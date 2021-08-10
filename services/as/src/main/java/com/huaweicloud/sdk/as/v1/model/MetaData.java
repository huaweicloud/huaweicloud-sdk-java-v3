package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 创建磁盘的元数据 */
public class MetaData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")

    private String systemEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")

    private String systemCmkid;

    public MetaData withSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
        return this;
    }

    /** metadata中的表示加密功能的字段，0代表不加密，1代表加密。 该字段不存在时，云硬盘默认为不加密。
     * 
     * @return systemEncrypted */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")
    public String getSystemEncrypted() {
        return systemEncrypted;
    }

    public void setSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
    }

    public MetaData withSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
        return this;
    }

    /** 用户主密钥ID，是metadata中的表示加密功能的字段，与__system__encrypted配合使用。
     * 
     * @return systemCmkid */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")
    public String getSystemCmkid() {
        return systemCmkid;
    }

    public void setSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetaData metaData = (MetaData) o;
        return Objects.equals(this.systemEncrypted, metaData.systemEncrypted)
            && Objects.equals(this.systemCmkid, metaData.systemCmkid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemEncrypted, systemCmkid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaData {\n");
        sb.append("    systemEncrypted: ").append(toIndentedString(systemEncrypted)).append("\n");
        sb.append("    systemCmkid: ").append(toIndentedString(systemCmkid)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
