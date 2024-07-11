package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PushDomainApplication
 */
public class PushDomainApplication {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_fragment")

    private Integer hlsFragment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_ts_count")

    private Integer hlsTsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_min_frags")

    private Integer hlsMinFrags;

    public PushDomainApplication withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名，默认为live
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PushDomainApplication withHlsFragment(Integer hlsFragment) {
        this.hlsFragment = hlsFragment;
        return this;
    }

    /**
     * HLS切片时长，单位：s。
     * minimum: 1
     * maximum: 10
     * @return hlsFragment
     */
    public Integer getHlsFragment() {
        return hlsFragment;
    }

    public void setHlsFragment(Integer hlsFragment) {
        this.hlsFragment = hlsFragment;
    }

    public PushDomainApplication withHlsTsCount(Integer hlsTsCount) {
        this.hlsTsCount = hlsTsCount;
        return this;
    }

    /**
     * 每个M3U8文件内ts切片个数
     * minimum: 3
     * maximum: 10
     * @return hlsTsCount
     */
    public Integer getHlsTsCount() {
        return hlsTsCount;
    }

    public void setHlsTsCount(Integer hlsTsCount) {
        this.hlsTsCount = hlsTsCount;
    }

    public PushDomainApplication withHlsMinFrags(Integer hlsMinFrags) {
        this.hlsMinFrags = hlsMinFrags;
        return this;
    }

    /**
     * 每个M3U8文件内最小ts分片数
     * minimum: 2
     * maximum: 10
     * @return hlsMinFrags
     */
    public Integer getHlsMinFrags() {
        return hlsMinFrags;
    }

    public void setHlsMinFrags(Integer hlsMinFrags) {
        this.hlsMinFrags = hlsMinFrags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PushDomainApplication that = (PushDomainApplication) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.hlsFragment, that.hlsFragment)
            && Objects.equals(this.hlsTsCount, that.hlsTsCount) && Objects.equals(this.hlsMinFrags, that.hlsMinFrags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hlsFragment, hlsTsCount, hlsMinFrags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushDomainApplication {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hlsFragment: ").append(toIndentedString(hlsFragment)).append("\n");
        sb.append("    hlsTsCount: ").append(toIndentedString(hlsTsCount)).append("\n");
        sb.append("    hlsMinFrags: ").append(toIndentedString(hlsMinFrags)).append("\n");
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
