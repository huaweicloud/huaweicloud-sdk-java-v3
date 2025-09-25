package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 防护覆盖面信息
 */
public class ProtectInfoCoverAreaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_host_num")

    private Integer protectHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_protect_host_num")

    private Integer unProtectHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_rate")

    private Float protectRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beat_rate")

    private Float beatRate;

    public ProtectInfoCoverAreaInfo withProtectHostNum(Integer protectHostNum) {
        this.protectHostNum = protectHostNum;
        return this;
    }

    /**
     * **参数解释**: 防护主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return protectHostNum
     */
    public Integer getProtectHostNum() {
        return protectHostNum;
    }

    public void setProtectHostNum(Integer protectHostNum) {
        this.protectHostNum = protectHostNum;
    }

    public ProtectInfoCoverAreaInfo withUnProtectHostNum(Integer unProtectHostNum) {
        this.unProtectHostNum = unProtectHostNum;
        return this;
    }

    /**
     * **参数解释**: 未防护主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unProtectHostNum
     */
    public Integer getUnProtectHostNum() {
        return unProtectHostNum;
    }

    public void setUnProtectHostNum(Integer unProtectHostNum) {
        this.unProtectHostNum = unProtectHostNum;
    }

    public ProtectInfoCoverAreaInfo withProtectRate(Float protectRate) {
        this.protectRate = protectRate;
        return this;
    }

    /**
     * **参数解释**: 防护率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return protectRate
     */
    public Float getProtectRate() {
        return protectRate;
    }

    public void setProtectRate(Float protectRate) {
        this.protectRate = protectRate;
    }

    public ProtectInfoCoverAreaInfo withBeatRate(Float beatRate) {
        this.beatRate = beatRate;
        return this;
    }

    /**
     * **参数解释**: 击败用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return beatRate
     */
    public Float getBeatRate() {
        return beatRate;
    }

    public void setBeatRate(Float beatRate) {
        this.beatRate = beatRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectInfoCoverAreaInfo that = (ProtectInfoCoverAreaInfo) obj;
        return Objects.equals(this.protectHostNum, that.protectHostNum)
            && Objects.equals(this.unProtectHostNum, that.unProtectHostNum)
            && Objects.equals(this.protectRate, that.protectRate) && Objects.equals(this.beatRate, that.beatRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectHostNum, unProtectHostNum, protectRate, beatRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectInfoCoverAreaInfo {\n");
        sb.append("    protectHostNum: ").append(toIndentedString(protectHostNum)).append("\n");
        sb.append("    unProtectHostNum: ").append(toIndentedString(unProtectHostNum)).append("\n");
        sb.append("    protectRate: ").append(toIndentedString(protectRate)).append("\n");
        sb.append("    beatRate: ").append(toIndentedString(beatRate)).append("\n");
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
