package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateDatabaseResourceReq
 */
public class CreateDatabaseResourceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_space")

    private Integer diskSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encrypt")

    private Boolean diskEncrypt;

    public CreateDatabaseResourceReq withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public CreateDatabaseResourceReq withDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
        return this;
    }

    /**
     * 磁盘存储空间，该字段暂不生效
     * minimum: 40
     * maximum: 1000
     * @return diskSpace
     */
    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public CreateDatabaseResourceReq withDiskEncrypt(Boolean diskEncrypt) {
        this.diskEncrypt = diskEncrypt;
        return this;
    }

    /**
     * 磁盘是否加密
     * @return diskEncrypt
     */
    public Boolean getDiskEncrypt() {
        return diskEncrypt;
    }

    public void setDiskEncrypt(Boolean diskEncrypt) {
        this.diskEncrypt = diskEncrypt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDatabaseResourceReq that = (CreateDatabaseResourceReq) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.diskSpace, that.diskSpace)
            && Objects.equals(this.diskEncrypt, that.diskEncrypt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, diskSpace, diskEncrypt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseResourceReq {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    diskSpace: ").append(toIndentedString(diskSpace)).append("\n");
        sb.append("    diskEncrypt: ").append(toIndentedString(diskEncrypt)).append("\n");
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
