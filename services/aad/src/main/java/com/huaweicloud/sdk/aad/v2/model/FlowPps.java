package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FlowPps
 */
public class FlowPps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "utime")

    private Long utime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_pps")

    private Integer attackPps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_pps")

    private Integer normalPps;

    public FlowPps withUtime(Long utime) {
        this.utime = utime;
        return this;
    }

    /**
     * 数据时间
     * @return utime
     */
    public Long getUtime() {
        return utime;
    }

    public void setUtime(Long utime) {
        this.utime = utime;
    }

    public FlowPps withAttackPps(Integer attackPps) {
        this.attackPps = attackPps;
        return this;
    }

    /**
     * 攻击包速率
     * @return attackPps
     */
    public Integer getAttackPps() {
        return attackPps;
    }

    public void setAttackPps(Integer attackPps) {
        this.attackPps = attackPps;
    }

    public FlowPps withNormalPps(Integer normalPps) {
        this.normalPps = normalPps;
        return this;
    }

    /**
     * 正常包速率
     * @return normalPps
     */
    public Integer getNormalPps() {
        return normalPps;
    }

    public void setNormalPps(Integer normalPps) {
        this.normalPps = normalPps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowPps that = (FlowPps) obj;
        return Objects.equals(this.utime, that.utime) && Objects.equals(this.attackPps, that.attackPps)
            && Objects.equals(this.normalPps, that.normalPps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utime, attackPps, normalPps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowPps {\n");
        sb.append("    utime: ").append(toIndentedString(utime)).append("\n");
        sb.append("    attackPps: ").append(toIndentedString(attackPps)).append("\n");
        sb.append("    normalPps: ").append(toIndentedString(normalPps)).append("\n");
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
