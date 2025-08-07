package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 威胁情报控制防护选项里，各个选项的描述 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class IpReputationMapResponseBodyLocale {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Dr.Peng")

    private String drPeng;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Google")

    private String google;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Tencent")

    private String tencent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "MeiTuan")

    private String meiTuan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Microsoft")

    private String microsoft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "AliCloud")

    private String aliCloud;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Amazon")

    private String amazon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "VNET")

    private String vnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "HW")

    private String hw;

    public IpReputationMapResponseBodyLocale withDrPeng(String drPeng) {
        this.drPeng = drPeng;
        return this;
    }

    /**
     * **参数解释：** 鹏博士，一家提供互联网数据中心、云计算等服务的企业 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return drPeng
     */
    public String getDrPeng() {
        return drPeng;
    }

    public void setDrPeng(String drPeng) {
        this.drPeng = drPeng;
    }

    public IpReputationMapResponseBodyLocale withGoogle(String google) {
        this.google = google;
        return this;
    }

    /**
     * **参数解释：** 谷歌公司，全球知名的科技企业，提供搜索引擎、云计算等服务 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return google
     */
    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public IpReputationMapResponseBodyLocale withTencent(String tencent) {
        this.tencent = tencent;
        return this;
    }

    /**
     * **参数解释：** 腾讯，中国知名的互联网企业，提供社交、游戏、金融等服务 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return tencent
     */
    public String getTencent() {
        return tencent;
    }

    public void setTencent(String tencent) {
        this.tencent = tencent;
    }

    public IpReputationMapResponseBodyLocale withMeiTuan(String meiTuan) {
        this.meiTuan = meiTuan;
        return this;
    }

    /**
     * **参数解释：** 美团网，中国领先的生活服务电子商务平台 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return meiTuan
     */
    public String getMeiTuan() {
        return meiTuan;
    }

    public void setMeiTuan(String meiTuan) {
        this.meiTuan = meiTuan;
    }

    public IpReputationMapResponseBodyLocale withMicrosoft(String microsoft) {
        this.microsoft = microsoft;
        return this;
    }

    /**
     * **参数解释：** 微软公司，全球知名的科技企业，提供操作系统、办公软件等服务 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return microsoft
     */
    public String getMicrosoft() {
        return microsoft;
    }

    public void setMicrosoft(String microsoft) {
        this.microsoft = microsoft;
    }

    public IpReputationMapResponseBodyLocale withAliCloud(String aliCloud) {
        this.aliCloud = aliCloud;
        return this;
    }

    /**
     * **参数解释：** 阿里云，阿里巴巴集团旗下的云计算品牌 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return aliCloud
     */
    public String getAliCloud() {
        return aliCloud;
    }

    public void setAliCloud(String aliCloud) {
        this.aliCloud = aliCloud;
    }

    public IpReputationMapResponseBodyLocale withAmazon(String amazon) {
        this.amazon = amazon;
        return this;
    }

    /**
     * **参数解释：** 亚马逊，全球知名的电子商务和云计算企业 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return amazon
     */
    public String getAmazon() {
        return amazon;
    }

    public void setAmazon(String amazon) {
        this.amazon = amazon;
    }

    public IpReputationMapResponseBodyLocale withVnet(String vnet) {
        this.vnet = vnet;
        return this;
    }

    /**
     * **参数解释：** 世纪互联，中国领先的电信中立互联网基础设施服务提供商 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return vnet
     */
    public String getVnet() {
        return vnet;
    }

    public void setVnet(String vnet) {
        this.vnet = vnet;
    }

    public IpReputationMapResponseBodyLocale withHw(String hw) {
        this.hw = hw;
        return this;
    }

    /**
     * **参数解释：** 华为，全球知名的通信技术企业 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return hw
     */
    public String getHw() {
        return hw;
    }

    public void setHw(String hw) {
        this.hw = hw;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpReputationMapResponseBodyLocale that = (IpReputationMapResponseBodyLocale) obj;
        return Objects.equals(this.drPeng, that.drPeng) && Objects.equals(this.google, that.google)
            && Objects.equals(this.tencent, that.tencent) && Objects.equals(this.meiTuan, that.meiTuan)
            && Objects.equals(this.microsoft, that.microsoft) && Objects.equals(this.aliCloud, that.aliCloud)
            && Objects.equals(this.amazon, that.amazon) && Objects.equals(this.vnet, that.vnet)
            && Objects.equals(this.hw, that.hw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drPeng, google, tencent, meiTuan, microsoft, aliCloud, amazon, vnet, hw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpReputationMapResponseBodyLocale {\n");
        sb.append("    drPeng: ").append(toIndentedString(drPeng)).append("\n");
        sb.append("    google: ").append(toIndentedString(google)).append("\n");
        sb.append("    tencent: ").append(toIndentedString(tencent)).append("\n");
        sb.append("    meiTuan: ").append(toIndentedString(meiTuan)).append("\n");
        sb.append("    microsoft: ").append(toIndentedString(microsoft)).append("\n");
        sb.append("    aliCloud: ").append(toIndentedString(aliCloud)).append("\n");
        sb.append("    amazon: ").append(toIndentedString(amazon)).append("\n");
        sb.append("    vnet: ").append(toIndentedString(vnet)).append("\n");
        sb.append("    hw: ").append(toIndentedString(hw)).append("\n");
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
