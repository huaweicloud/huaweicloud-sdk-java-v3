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
            && Objects.equals(this.cbsProjectId, that.cbsProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, region, cbsProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HuaweiEiCbs {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    cbsProjectId: ").append(toIndentedString(cbsProjectId)).append("\n");
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
