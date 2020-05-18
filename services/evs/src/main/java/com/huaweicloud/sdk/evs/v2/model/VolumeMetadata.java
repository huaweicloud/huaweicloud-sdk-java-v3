package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * VolumeMetadata
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
     * metadata中的加密cmkid字段，与__system__encrypted配合表示需要加密，cmkid长度固定为36个字节。 > 说明： >  > 请求获取密钥ID的方法请参考：\"[查询密钥列表](https://support.huaweicloud.com/api-dew/dew_02_0017.html)\"。
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
     * metadata中的表示加密功能的字段，0代表不加密，1代表加密。 不指定该字段时，云硬盘的加密属性与数据源保持一致，如果不是从数据源创建的场景，则默认不加密。
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
     * * true表示云硬盘的设备类型为SCSI类型，即允许ECS操作系统直接访问底层存储介质。支持SCSI锁命令。 * false表示云硬盘的设备类型为VBD (虚拟块存储设备 , Virtual Block Device)类型，即为默认类型，VBD只能支持简单的SCSI读写命令。 * 该字段不存在时，云硬盘默认为VBD类型。
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

