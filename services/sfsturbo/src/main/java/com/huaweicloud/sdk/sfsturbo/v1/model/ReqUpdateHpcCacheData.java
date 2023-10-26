package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 后端挂载地址信息
 */
public class ReqUpdateHpcCacheData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gc_time")

    private Long gcTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ck_time")

    private Long ckTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nas")

    private List<ConfigNasTarget> nas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private List<ConfigObsTarget> obs = null;

    public ReqUpdateHpcCacheData withGcTime(Long gcTime) {
        this.gcTime = gcTime;
        return this;
    }

    /**
     * 冷数据淘汰时间。单位：小时。指定时间内线上缓存的数据如果没有被访问则会自动从缓存中删除。0表示数据不会因为时间原因自动从缓存中删除。
     * @return gcTime
     */
    public Long getGcTime() {
        return gcTime;
    }

    public void setGcTime(Long gcTime) {
        this.gcTime = gcTime;
    }

    public ReqUpdateHpcCacheData withCkTime(Long ckTime) {
        this.ckTime = ckTime;
        return this;
    }

    /**
     * 后端校验时间。单位：秒。指定时间间隔进行线上缓存文件与后端存储文件比较，存在变化则自动更新。0表示文件进行实时校验。
     * @return ckTime
     */
    public Long getCkTime() {
        return ckTime;
    }

    public void setCkTime(Long ckTime) {
        this.ckTime = ckTime;
    }

    public ReqUpdateHpcCacheData withNas(List<ConfigNasTarget> nas) {
        this.nas = nas;
        return this;
    }

    public ReqUpdateHpcCacheData addNasItem(ConfigNasTarget nasItem) {
        if (this.nas == null) {
            this.nas = new ArrayList<>();
        }
        this.nas.add(nasItem);
        return this;
    }

    public ReqUpdateHpcCacheData withNas(Consumer<List<ConfigNasTarget>> nasSetter) {
        if (this.nas == null) {
            this.nas = new ArrayList<>();
        }
        nasSetter.accept(this.nas);
        return this;
    }

    /**
     * 配置 nas 后端的信息, 和 obs 字段为二选一的关系
     * @return nas
     */
    public List<ConfigNasTarget> getNas() {
        return nas;
    }

    public void setNas(List<ConfigNasTarget> nas) {
        this.nas = nas;
    }

    public ReqUpdateHpcCacheData withObs(List<ConfigObsTarget> obs) {
        this.obs = obs;
        return this;
    }

    public ReqUpdateHpcCacheData addObsItem(ConfigObsTarget obsItem) {
        if (this.obs == null) {
            this.obs = new ArrayList<>();
        }
        this.obs.add(obsItem);
        return this;
    }

    public ReqUpdateHpcCacheData withObs(Consumer<List<ConfigObsTarget>> obsSetter) {
        if (this.obs == null) {
            this.obs = new ArrayList<>();
        }
        obsSetter.accept(this.obs);
        return this;
    }

    /**
     * 配置 obs 后端的信息, 和 nas 字段为二选一的关系
     * @return obs
     */
    public List<ConfigObsTarget> getObs() {
        return obs;
    }

    public void setObs(List<ConfigObsTarget> obs) {
        this.obs = obs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReqUpdateHpcCacheData that = (ReqUpdateHpcCacheData) obj;
        return Objects.equals(this.gcTime, that.gcTime) && Objects.equals(this.ckTime, that.ckTime)
            && Objects.equals(this.nas, that.nas) && Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gcTime, ckTime, nas, obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqUpdateHpcCacheData {\n");
        sb.append("    gcTime: ").append(toIndentedString(gcTime)).append("\n");
        sb.append("    ckTime: ").append(toIndentedString(ckTime)).append("\n");
        sb.append("    nas: ").append(toIndentedString(nas)).append("\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
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
