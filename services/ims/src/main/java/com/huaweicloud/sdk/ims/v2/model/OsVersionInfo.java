package com.huaweicloud.sdk.ims.v2.model;

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
 * 操作系统详情
 */
public class OsVersionInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform")
    
    private String platform;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_version_key")
    
    private String osVersionKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_version")
    
    private String osVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_bit")
    
    private String osBit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    private String osType;

    public OsVersionInfo withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * 操作系统的平台值
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public OsVersionInfo withOsVersionKey(String osVersionKey) {
        this.osVersionKey = osVersionKey;
        return this;
    }

    


    /**
     * os_version的key值，和os_version值相同
     * @return osVersionKey
     */
    public String getOsVersionKey() {
        return osVersionKey;
    }

    public void setOsVersionKey(String osVersionKey) {
        this.osVersionKey = osVersionKey;
    }

    public OsVersionInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    


    /**
     * 操作系统的版本
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public OsVersionInfo withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    


    /**
     * 操作系统的位数
     * @return osBit
     */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    public OsVersionInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 操作系统的类型，Linux或Windows
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OsVersionInfo osVersionInfo = (OsVersionInfo) o;
        return Objects.equals(this.platform, osVersionInfo.platform) &&
            Objects.equals(this.osVersionKey, osVersionInfo.osVersionKey) &&
            Objects.equals(this.osVersion, osVersionInfo.osVersion) &&
            Objects.equals(this.osBit, osVersionInfo.osBit) &&
            Objects.equals(this.osType, osVersionInfo.osType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(platform, osVersionKey, osVersion, osBit, osType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsVersionInfo {\n");
            sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
            sb.append("    osVersionKey: ").append(toIndentedString(osVersionKey)).append("\n");
            sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
            sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
            sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
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

