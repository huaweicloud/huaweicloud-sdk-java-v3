package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** StreamTranscodingTemplate */
public class StreamTranscodingTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_info")

    private List<QualityInfo> qualityInfo = null;

    public StreamTranscodingTemplate withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 推流域名
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public StreamTranscodingTemplate withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /** 应用名称。 默认为“live”，若您需要自定义应用名称，请先提交工单申请。
     * 
     * @return appName */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public StreamTranscodingTemplate withQualityInfo(List<QualityInfo> qualityInfo) {
        this.qualityInfo = qualityInfo;
        return this;
    }

    public StreamTranscodingTemplate addQualityInfoItem(QualityInfo qualityInfoItem) {
        if (this.qualityInfo == null) {
            this.qualityInfo = new ArrayList<>();
        }
        this.qualityInfo.add(qualityInfoItem);
        return this;
    }

    public StreamTranscodingTemplate withQualityInfo(Consumer<List<QualityInfo>> qualityInfoSetter) {
        if (this.qualityInfo == null) {
            this.qualityInfo = new ArrayList<>();
        }
        qualityInfoSetter.accept(this.qualityInfo);
        return this;
    }

    /** 视频质量信息
     * 
     * @return qualityInfo */
    public List<QualityInfo> getQualityInfo() {
        return qualityInfo;
    }

    public void setQualityInfo(List<QualityInfo> qualityInfo) {
        this.qualityInfo = qualityInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StreamTranscodingTemplate streamTranscodingTemplate = (StreamTranscodingTemplate) o;
        return Objects.equals(this.domain, streamTranscodingTemplate.domain)
            && Objects.equals(this.appName, streamTranscodingTemplate.appName)
            && Objects.equals(this.qualityInfo, streamTranscodingTemplate.qualityInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, qualityInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamTranscodingTemplate {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    qualityInfo: ").append(toIndentedString(qualityInfo)).append("\n");
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
