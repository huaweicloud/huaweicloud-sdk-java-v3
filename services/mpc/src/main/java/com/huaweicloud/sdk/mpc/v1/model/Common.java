package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Common
 */
public class Common {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PVC")

    private Boolean pvc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_interval")

    private Integer hlsInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dash_interval")

    private Integer dashInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pack_type")

    private Integer packType;

    public Common withPvc(Boolean pvc) {
        this.pvc = pvc;
        return this;
    }

    /**
     * 是否开启高清低码功能。  取值如下： - false：关闭。 - true：开启。 
     * @return pvc
     */
    public Boolean getPvc() {
        return pvc;
    }

    public void setPvc(Boolean pvc) {
        this.pvc = pvc;
    }

    public Common withHlsInterval(Integer hlsInterval) {
        this.hlsInterval = hlsInterval;
        return this;
    }

    /**
     * HLS分片间隔，仅封装类型“pack_type”取值为1或3时，该参数生效。  取值范围：[2，10]。  单位：秒。 
     * minimum: 2
     * maximum: 10
     * @return hlsInterval
     */
    public Integer getHlsInterval() {
        return hlsInterval;
    }

    public void setHlsInterval(Integer hlsInterval) {
        this.hlsInterval = hlsInterval;
    }

    public Common withDashInterval(Integer dashInterval) {
        this.dashInterval = dashInterval;
        return this;
    }

    /**
     * DASH间隔，仅封装类型“pack_type”取值为2或3时，该参数生效。  取值范围：[2，10]。  单位：秒。 
     * minimum: 2
     * maximum: 10
     * @return dashInterval
     */
    public Integer getDashInterval() {
        return dashInterval;
    }

    public void setDashInterval(Integer dashInterval) {
        this.dashInterval = dashInterval;
    }

    public Common withPackType(Integer packType) {
        this.packType = packType;
        return this;
    }

    /**
     * 封装类型。  取值如下： - 1：HLS - 2：DASH - 3：HLS+DASH - 4：MP4 - 5：MP3 - 6：ADTS  > pack_type设置为5和6时，不能设置视频参数。 
     * minimum: 1
     * maximum: 6
     * @return packType
     */
    public Integer getPackType() {
        return packType;
    }

    public void setPackType(Integer packType) {
        this.packType = packType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Common that = (Common) obj;
        return Objects.equals(this.pvc, that.pvc) && Objects.equals(this.hlsInterval, that.hlsInterval)
            && Objects.equals(this.dashInterval, that.dashInterval) && Objects.equals(this.packType, that.packType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pvc, hlsInterval, dashInterval, packType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Common {\n");
        sb.append("    pvc: ").append(toIndentedString(pvc)).append("\n");
        sb.append("    hlsInterval: ").append(toIndentedString(hlsInterval)).append("\n");
        sb.append("    dashInterval: ").append(toIndentedString(dashInterval)).append("\n");
        sb.append("    packType: ").append(toIndentedString(packType)).append("\n");
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
