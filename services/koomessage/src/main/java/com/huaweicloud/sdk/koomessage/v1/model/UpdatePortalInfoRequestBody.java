package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新主页请求体。
 */
public class UpdatePortalInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_reason")

    private String changeReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_img")

    private String backgroundImg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private String summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tels")

    private List<TelModel> tels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fastapps")

    private List<UpdatePortalFastappModel> fastapps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw_pubs")

    private List<String> hwPubs = null;

    public UpdatePortalInfoRequestBody withChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    /**
     * 修改原因。
     * @return changeReason
     */
    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public UpdatePortalInfoRequestBody withBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
        return this;
    }

    /**
     * 主页背景图片资源ID。 > 分辨率大于等于1440*810，支持jpg、jpeg、bmp、png。参数值为上传智能信息服务号图片资源API返回的resource_id。 
     * @return backgroundImg
     */
    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public UpdatePortalInfoRequestBody withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 简介。
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public UpdatePortalInfoRequestBody withTels(List<TelModel> tels) {
        this.tels = tels;
        return this;
    }

    public UpdatePortalInfoRequestBody addTelsItem(TelModel telsItem) {
        if (this.tels == null) {
            this.tels = new ArrayList<>();
        }
        this.tels.add(telsItem);
        return this;
    }

    public UpdatePortalInfoRequestBody withTels(Consumer<List<TelModel>> telsSetter) {
        if (this.tels == null) {
            this.tels = new ArrayList<>();
        }
        telsSetter.accept(this.tels);
        return this;
    }

    /**
     * 热线号列表。
     * @return tels
     */
    public List<TelModel> getTels() {
        return tels;
    }

    public void setTels(List<TelModel> tels) {
        this.tels = tels;
    }

    public UpdatePortalInfoRequestBody withFastapps(List<UpdatePortalFastappModel> fastapps) {
        this.fastapps = fastapps;
        return this;
    }

    public UpdatePortalInfoRequestBody addFastappsItem(UpdatePortalFastappModel fastappsItem) {
        if (this.fastapps == null) {
            this.fastapps = new ArrayList<>();
        }
        this.fastapps.add(fastappsItem);
        return this;
    }

    public UpdatePortalInfoRequestBody withFastapps(Consumer<List<UpdatePortalFastappModel>> fastappsSetter) {
        if (this.fastapps == null) {
            this.fastapps = new ArrayList<>();
        }
        fastappsSetter.accept(this.fastapps);
        return this;
    }

    /**
     * 快应用列表。
     * @return fastapps
     */
    public List<UpdatePortalFastappModel> getFastapps() {
        return fastapps;
    }

    public void setFastapps(List<UpdatePortalFastappModel> fastapps) {
        this.fastapps = fastapps;
    }

    public UpdatePortalInfoRequestBody withHwPubs(List<String> hwPubs) {
        this.hwPubs = hwPubs;
        return this;
    }

    public UpdatePortalInfoRequestBody addHwPubsItem(String hwPubsItem) {
        if (this.hwPubs == null) {
            this.hwPubs = new ArrayList<>();
        }
        this.hwPubs.add(hwPubsItem);
        return this;
    }

    public UpdatePortalInfoRequestBody withHwPubs(Consumer<List<String>> hwPubsSetter) {
        if (this.hwPubs == null) {
            this.hwPubs = new ArrayList<>();
        }
        hwPubsSetter.accept(this.hwPubs);
        return this;
    }

    /**
     * 华为服务号列表。  > 预留，暂未使用。 
     * @return hwPubs
     */
    public List<String> getHwPubs() {
        return hwPubs;
    }

    public void setHwPubs(List<String> hwPubs) {
        this.hwPubs = hwPubs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePortalInfoRequestBody that = (UpdatePortalInfoRequestBody) obj;
        return Objects.equals(this.changeReason, that.changeReason)
            && Objects.equals(this.backgroundImg, that.backgroundImg) && Objects.equals(this.summary, that.summary)
            && Objects.equals(this.tels, that.tels) && Objects.equals(this.fastapps, that.fastapps)
            && Objects.equals(this.hwPubs, that.hwPubs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeReason, backgroundImg, summary, tels, fastapps, hwPubs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePortalInfoRequestBody {\n");
        sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
        sb.append("    backgroundImg: ").append(toIndentedString(backgroundImg)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    tels: ").append(toIndentedString(tels)).append("\n");
        sb.append("    fastapps: ").append(toIndentedString(fastapps)).append("\n");
        sb.append("    hwPubs: ").append(toIndentedString(hwPubs)).append("\n");
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
