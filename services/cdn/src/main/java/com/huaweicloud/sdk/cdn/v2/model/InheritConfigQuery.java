package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 鉴权继承，为M3U8/MPD索引文件下的TS/MP4文件添加鉴权参数，解决因鉴权不通过导致的TS/MP4文件无法播放的问题。
 */
public class InheritConfigQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_type")

    private String inheritType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_time_type")

    private String inheritTimeType;

    public InheritConfigQuery withStatus(String status) {
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

    public InheritConfigQuery withInheritType(String inheritType) {
        this.inheritType = inheritType;
        return this;
    }

    /**
     * 鉴权继承配置， m3u8：M3U8,mpd：MPD,“m3u8,mpd”。
     * @return inheritType
     */
    public String getInheritType() {
        return inheritType;
    }

    public void setInheritType(String inheritType) {
        this.inheritType = inheritType;
    }

    public InheritConfigQuery withInheritTimeType(String inheritTimeType) {
        this.inheritTimeType = inheritTimeType;
        return this;
    }

    /**
     * 鉴权继承的文件类型时间, sys_time：当前系统时间，parent_url_time：与m3u8和mpd访问链接保持一致。
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
        InheritConfigQuery that = (InheritConfigQuery) obj;
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
        sb.append("class InheritConfigQuery {\n");
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
