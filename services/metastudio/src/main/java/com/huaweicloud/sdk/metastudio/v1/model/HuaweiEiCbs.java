package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 华为云CBS应用配置
 */
public class HuaweiEiCbs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private Integer region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbs_project_id")

    private String cbsProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_region")

    private Integer sisRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_project_id")

    private String sisProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hot_words")

    private Boolean enableHotWords;

    public HuaweiEiCbs withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * CBS应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public HuaweiEiCbs withRegion(Integer region) {
        this.region = region;
        return this;
    }

    /**
     * CBS所在区域
     * minimum: 0
     * maximum: 32
     * @return region
     */
    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public HuaweiEiCbs withCbsProjectId(String cbsProjectId) {
        this.cbsProjectId = cbsProjectId;
        return this;
    }

    /**
     * CBS所在区域的projectId
     * @return cbsProjectId
     */
    public String getCbsProjectId() {
        return cbsProjectId;
    }

    public void setCbsProjectId(String cbsProjectId) {
        this.cbsProjectId = cbsProjectId;
    }

    public HuaweiEiCbs withSisRegion(Integer sisRegion) {
        this.sisRegion = sisRegion;
        return this;
    }

    /**
     * SIS所在区域
     * minimum: 0
     * maximum: 32
     * @return sisRegion
     */
    public Integer getSisRegion() {
        return sisRegion;
    }

    public void setSisRegion(Integer sisRegion) {
        this.sisRegion = sisRegion;
    }

    public HuaweiEiCbs withSisProjectId(String sisProjectId) {
        this.sisProjectId = sisProjectId;
        return this;
    }

    /**
     * SIS所在区域的projectId
     * @return sisProjectId
     */
    public String getSisProjectId() {
        return sisProjectId;
    }

    public void setSisProjectId(String sisProjectId) {
        this.sisProjectId = sisProjectId;
    }

    public HuaweiEiCbs withEnableHotWords(Boolean enableHotWords) {
        this.enableHotWords = enableHotWords;
        return this;
    }

    /**
     * 是否开启热词
     * @return enableHotWords
     */
    public Boolean getEnableHotWords() {
        return enableHotWords;
    }

    public void setEnableHotWords(Boolean enableHotWords) {
        this.enableHotWords = enableHotWords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HuaweiEiCbs that = (HuaweiEiCbs) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.cbsProjectId, that.cbsProjectId) && Objects.equals(this.sisRegion, that.sisRegion)
            && Objects.equals(this.sisProjectId, that.sisProjectId)
            && Objects.equals(this.enableHotWords, that.enableHotWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, region, cbsProjectId, sisRegion, sisProjectId, enableHotWords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HuaweiEiCbs {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    cbsProjectId: ").append(toIndentedString(cbsProjectId)).append("\n");
        sb.append("    sisRegion: ").append(toIndentedString(sisRegion)).append("\n");
        sb.append("    sisProjectId: ").append(toIndentedString(sisProjectId)).append("\n");
        sb.append("    enableHotWords: ").append(toIndentedString(enableHotWords)).append("\n");
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
