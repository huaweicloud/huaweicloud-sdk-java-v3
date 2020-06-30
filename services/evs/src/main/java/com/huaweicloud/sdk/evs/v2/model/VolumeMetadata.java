package com.huaweicloud.sdk.evs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 说明： 以上表格中仅提供了部分“metadata”字段信息说明供您参考，您还可以根据创建磁盘的要求输入其他字段。 如果是从快照创建云硬盘，则不支持传入“__system__encrypted”和“__system__cmkid”字段，创建出来的云硬盘与快照源云硬盘的加密属性一致。 如果是从镜像创建云硬盘，则不支持传入“__system__encrypted”和“__system__cmkid”字段，创建出来的云硬盘与镜像的加密属性一致。 如果是从快照创建云硬盘，则不支持传入“hw:passthrough”字段，创建出来的云硬盘的设备类型与快照源云硬盘保持一致。 如果是从镜像创建云硬盘，则不支持传入“hw:passthrough”字段，创建出来的云硬盘的设备类型为VBD类型。
 */
public class VolumeMetadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__system__cmkid")
    
    private String systemCmkid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__system__encrypted")
    
    private String systemEncrypted;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="full_clone")
    
    private String fullClone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hw:passthrough")
    
    private String hwPassthrough;

    public VolumeMetadata withSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
        return this;
    }

    


    /**
     * metadata中的加密cmkid字段，与__system__encrypted配合表示需要加密，cmkid长度固定为36个字节。  说明： 请参考 [查询密钥列表](https://support.huaweicloud.com/api-dew/dew_02_0017.html)，通过HTTPS请求获取密钥ID。
     * @return systemCmkid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getSystemCmkid() {
        return systemCmkid;
    }

    public void setSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
    }

    public VolumeMetadata withSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
        return this;
    }

    


    /**
     * metadata中的表示加密功能的字段，0代表不加密，1代表加密。 该字段不存在时，云硬盘默认为不加密。
     * @return systemEncrypted
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getSystemEncrypted() {
        return systemEncrypted;
    }

    public void setSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
    }

    public VolumeMetadata withFullClone(String fullClone) {
        this.fullClone = fullClone;
        return this;
    }

    


    /**
     * 从快照创建云硬盘时，如需使用link克隆方式，请指定该字段的值为0。
     * @return fullClone
     */
    public String getFullClone() {
        return fullClone;
    }

    public void setFullClone(String fullClone) {
        this.fullClone = fullClone;
    }

    public VolumeMetadata withHwPassthrough(String hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    


    /**
     * true表示云硬盘的设备类型为SCSI类型，即允许ECS操作系统直接访问底层存储介质。支持SCSI锁命令。 false表示云硬盘的设备类型为VBD (虚拟块存储设备 , Virtual Block Device)类型，即为默认类型，VBD只能支持简单的SCSI读写命令。 该字段不存在时，云硬盘默认为VBD类型。  >说明： >当shareable参数值设置为true，不指定hw:passthrough参数值时，创建的云硬盘为VBD类型共享云硬盘。
     * @return hwPassthrough
     */
    public String getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(String hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumeMetadata volumeMetadata = (VolumeMetadata) o;
        return Objects.equals(this.systemCmkid, volumeMetadata.systemCmkid) &&
            Objects.equals(this.systemEncrypted, volumeMetadata.systemEncrypted) &&
            Objects.equals(this.fullClone, volumeMetadata.fullClone) &&
            Objects.equals(this.hwPassthrough, volumeMetadata.hwPassthrough);
    }
    @Override
    public int hashCode() {
        return Objects.hash(systemCmkid, systemEncrypted, fullClone, hwPassthrough);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeMetadata {\n");
        sb.append("    systemCmkid: ").append(toIndentedString(systemCmkid)).append("\n");
        sb.append("    systemEncrypted: ").append(toIndentedString(systemEncrypted)).append("\n");
        sb.append("    fullClone: ").append(toIndentedString(fullClone)).append("\n");
        sb.append("    hwPassthrough: ").append(toIndentedString(hwPassthrough)).append("\n");
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

