package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据盘加密信息，仅在创建节点数据盘需加密时须填写。
 */
public class DataVolumeMetadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__system__cmkid")
    
    private String systemCmkid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__system__encrypted")
    
    private String systemEncrypted;

    public DataVolumeMetadata withSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
        return this;
    }

    


    /**
     * 用户主密钥ID，是metadata中的表示加密功能的字段，与__system__encrypted配合使用。
     * @return systemCmkid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__system__cmkid")
    public String getSystemCmkid() {
        return systemCmkid;
    }

    public void setSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
    }

    public DataVolumeMetadata withSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
        return this;
    }

    


    /**
     * 表示云硬盘加密功能的字段，'0'代表不加密，'1'代表加密。  该字段不存在时，云硬盘默认为不加密。
     * @return systemEncrypted
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__system__encrypted")
    public String getSystemEncrypted() {
        return systemEncrypted;
    }

    public void setSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataVolumeMetadata dataVolumeMetadata = (DataVolumeMetadata) o;
        return Objects.equals(this.systemCmkid, dataVolumeMetadata.systemCmkid) &&
            Objects.equals(this.systemEncrypted, dataVolumeMetadata.systemEncrypted);
    }
    @Override
    public int hashCode() {
        return Objects.hash(systemCmkid, systemEncrypted);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataVolumeMetadata {\n");
        sb.append("    systemCmkid: ").append(toIndentedString(systemCmkid)).append("\n");
        sb.append("    systemEncrypted: ").append(toIndentedString(systemEncrypted)).append("\n");
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

