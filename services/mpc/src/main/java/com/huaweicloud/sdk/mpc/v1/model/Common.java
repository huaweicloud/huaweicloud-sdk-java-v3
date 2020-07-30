package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Common
 */
public class Common  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="QDS")
    
    private Boolean qds = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="PVC")
    
    private Boolean pvc = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="PVC_version")
    
    private String pvCVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="PVC_strength")
    
    private String pvCStrength = "100";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hls_interval")
    
    private Integer hlsInterval = 5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dash_interval")
    
    private Integer dashInterval = 5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pack_type")
    
    private Integer packType;

    public Common withQds(Boolean qds) {
        this.qds = qds;
        return this;
    }

    


    /**
     * QDS开关 0：关闭（当前默认关闭） 1：开启 
     * @return qds
     */
    public Boolean getQds() {
        return qds;
    }

    public void setQds(Boolean qds) {
        this.qds = qds;
    }

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

    public Common withPvCVersion(String pvCVersion) {
        this.pvCVersion = pvCVersion;
        return this;
    }

    


    /**
     * PVC版本（PVC开启时，此字段才生效） “2.0_normal”：感知编码2.0（降码率30%~40%） “2.0_high”：感知编码2.0+画质增强 
     * @return pvCVersion
     */
    public String getPvCVersion() {
        return pvCVersion;
    }

    public void setPvCVersion(String pvCVersion) {
        this.pvCVersion = pvCVersion;
    }

    public Common withPvCStrength(String pvCStrength) {
        this.pvCStrength = pvCStrength;
        return this;
    }

    


    /**
     * PVC感知编码强度（PVC开启时，此字段才生效），默认取值 “100” “100”：主观质量不变 “70”：主观质量适当下降 
     * @return pvCStrength
     */
    public String getPvCStrength() {
        return pvCStrength;
    }

    public void setPvCStrength(String pvCStrength) {
        this.pvCStrength = pvCStrength;
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Common common = (Common) o;
        return Objects.equals(this.qds, common.qds) &&
            Objects.equals(this.pvc, common.pvc) &&
            Objects.equals(this.pvCVersion, common.pvCVersion) &&
            Objects.equals(this.pvCStrength, common.pvCStrength) &&
            Objects.equals(this.hlsInterval, common.hlsInterval) &&
            Objects.equals(this.dashInterval, common.dashInterval) &&
            Objects.equals(this.packType, common.packType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qds, pvc, pvCVersion, pvCStrength, hlsInterval, dashInterval, packType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Common {\n");
        sb.append("    qds: ").append(toIndentedString(qds)).append("\n");
        sb.append("    pvc: ").append(toIndentedString(pvc)).append("\n");
        sb.append("    pvCVersion: ").append(toIndentedString(pvCVersion)).append("\n");
        sb.append("    pvCStrength: ").append(toIndentedString(pvCStrength)).append("\n");
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

