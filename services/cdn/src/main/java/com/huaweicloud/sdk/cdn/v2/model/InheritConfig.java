package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 鉴权继承，为M3U8/MPD索引文件下的TS/MP4文件添加鉴权参数，解决因鉴权不通过导致的TS/MP4文件无法播放的问题。
 */
public class InheritConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_type")

    private String inheritType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_time_type")

    private String inheritTimeType;

    public InheritConfig withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 是否开启鉴权继承，on：开启,off：关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InheritConfig withInheritType(String inheritType) {
        this.inheritType = inheritType;
        return this;
    }

    /**
     * **参数解释：** 为m3u8/mpd索引文件下的ts/mp4文件添加鉴权参数，解决因鉴权不通过导致的ts/mp4文件无法播放的问题 **约束限制：** - 输入多个参数时用“,”分隔，例如“m3u8,mpd” - 开启鉴权继承时，该参数必填 **取值范围：** - m3u8 - mpd **默认取值：** 不涉及
     * @return inheritType
     */
    public String getInheritType() {
        return inheritType;
    }

    public void setInheritType(String inheritType) {
        this.inheritType = inheritType;
    }

    public InheritConfig withInheritTimeType(String inheritTimeType) {
        this.inheritTimeType = inheritTimeType;
        return this;
    }

    /**
     * 鉴权继承的文件类型时间, sys_time：当前系统时间，parent_url_time：与m3u8和mpd访问链接保持一致。  > 开启鉴权继承时，该参数必填。
     * @return inheritTimeType
     */
    public String getInheritTimeType() {
        return inheritTimeType;
    }

    public void setInheritTimeType(String inheritTimeType) {
        this.inheritTimeType = inheritTimeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InheritConfig that = (InheritConfig) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.inheritType, that.inheritType)
            && Objects.equals(this.inheritTimeType, that.inheritTimeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, inheritType, inheritTimeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InheritConfig {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inheritType: ").append(toIndentedString(inheritType)).append("\n");
        sb.append("    inheritTimeType: ").append(toIndentedString(inheritTimeType)).append("\n");
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
