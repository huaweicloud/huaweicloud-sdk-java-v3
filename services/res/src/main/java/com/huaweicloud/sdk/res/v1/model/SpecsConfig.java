package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class SpecsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline")

    private String offline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nearline")

    private String nearline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank")

    private String rank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_tps")

    private Integer onlineTps;

    public SpecsConfig withOffline(String offline) {
        this.offline = offline;
        return this;
    }

    /** 离线计算规格。
     * 
     * @return offline */
    public String getOffline() {
        return offline;
    }

    public void setOffline(String offline) {
        this.offline = offline;
    }

    public SpecsConfig withNearline(String nearline) {
        this.nearline = nearline;
        return this;
    }

    /** 实时计算规格。
     * 
     * @return nearline */
    public String getNearline() {
        return nearline;
    }

    public void setNearline(String nearline) {
        this.nearline = nearline;
    }

    public SpecsConfig withRank(String rank) {
        this.rank = rank;
        return this;
    }

    /** 深度学习计算规格。
     * 
     * @return rank */
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public SpecsConfig withOnlineTps(Integer onlineTps) {
        this.onlineTps = onlineTps;
        return this;
    }

    /** 在线服务最大并发数。
     * 
     * @return onlineTps */
    public Integer getOnlineTps() {
        return onlineTps;
    }

    public void setOnlineTps(Integer onlineTps) {
        this.onlineTps = onlineTps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpecsConfig specsConfig = (SpecsConfig) o;
        return Objects.equals(this.offline, specsConfig.offline) && Objects.equals(this.nearline, specsConfig.nearline)
            && Objects.equals(this.rank, specsConfig.rank) && Objects.equals(this.onlineTps, specsConfig.onlineTps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offline, nearline, rank, onlineTps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecsConfig {\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
        sb.append("    nearline: ").append(toIndentedString(nearline)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    onlineTps: ").append(toIndentedString(onlineTps)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
