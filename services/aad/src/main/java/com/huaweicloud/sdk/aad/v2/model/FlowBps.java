package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FlowBps
 */
public class FlowBps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "utime")

    private Long utime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_bps")

    private Integer attackBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_bps")

    private Integer normalBps;

    public FlowBps withUtime(Long utime) {
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

    public FlowBps withAttackBps(Integer attackBps) {
        this.attackBps = attackBps;
        return this;
    }

    /**
     * 攻击流量
     * @return attackBps
     */
    public Integer getAttackBps() {
        return attackBps;
    }

    public void setAttackBps(Integer attackBps) {
        this.attackBps = attackBps;
    }

    public FlowBps withNormalBps(Integer normalBps) {
        this.normalBps = normalBps;
        return this;
    }

    /**
     * 正常流量
     * @return normalBps
     */
    public Integer getNormalBps() {
        return normalBps;
    }

    public void setNormalBps(Integer normalBps) {
        this.normalBps = normalBps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowBps that = (FlowBps) obj;
        return Objects.equals(this.utime, that.utime) && Objects.equals(this.attackBps, that.attackBps)
            && Objects.equals(this.normalBps, that.normalBps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utime, attackBps, normalBps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowBps {\n");
        sb.append("    utime: ").append(toIndentedString(utime)).append("\n");
        sb.append("    attackBps: ").append(toIndentedString(attackBps)).append("\n");
        sb.append("    normalBps: ").append(toIndentedString(normalBps)).append("\n");
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
