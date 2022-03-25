package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 服务算法配置 */
public class ServiceConfigCommon {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_interval")

    private Integer frameInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private String categories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_categories")

    private String textCategories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_sis")

    private String useSis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_ocr")

    private String useOcr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload")

    private String upload;

    public ServiceConfigCommon withFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
        return this;
    }

    /** 截帧时间间隔，单位为秒/帧。
     * 
     * @return frameInterval */
    public Integer getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
    }

    public ServiceConfigCommon withCategories(String categories) {
        this.categories = categories;
        return this;
    }

    /** 视频检测场景。 politics：政治人物的检测。 terrorism：暴恐元素的检测。 porn：涉黄内容元素的检测。 可通过配置上述场景，来完成对应场景元素的检测。 说明：
     * 如需配置多个检测场景，则将多个场景名称使用英文半角逗号拼接。例如，\"categories\": \"politics,terrorism,porn\"
     * 
     * @return categories */
    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public ServiceConfigCommon withTextCategories(String textCategories) {
        this.textCategories = textCategories;
        return this;
    }

    /** 语音或文字审核服务的检测场景，目前主要支持以下几种： politics：政治人物的检测。 porn：涉黄内容元素的检测。 ad：广告的检测。 abuse：辱骂内容元素的检测。 contraband：违禁品的检测
     * flood：灌水内容元素的检测。 当使用语音或文字检测服务时，这里应当设置出对应的场景。 说明： 如需配置多个检测场景，则将多个场景名称使用英文半角逗号拼接。例如，\"text_categories\":
     * \"politics,porn\"。
     * 
     * @return textCategories */
    public String getTextCategories() {
        return textCategories;
    }

    public void setTextCategories(String textCategories) {
        this.textCategories = textCategories;
    }

    public ServiceConfigCommon withUseSis(String useSis) {
        this.useSis = useSis;
        return this;
    }

    /** 是否使用语音审核服务。 true：使用 false：不使用 当不设置该参数或参数为空时，默认为不使用。
     * 
     * @return useSis */
    public String getUseSis() {
        return useSis;
    }

    public void setUseSis(String useSis) {
        this.useSis = useSis;
    }

    public ServiceConfigCommon withUseOcr(String useOcr) {
        this.useOcr = useOcr;
        return this;
    }

    /** 是否使用文字审核服务。 true：使用 false：不使用 当不设置该参数或参数为空时，默认为不使用。
     * 
     * @return useOcr */
    public String getUseOcr() {
        return useOcr;
    }

    public void setUseOcr(String useOcr) {
        this.useOcr = useOcr;
    }

    public ServiceConfigCommon withUpload(String upload) {
        this.upload = upload;
        return this;
    }

    /** 是否使用问题场景图片上传服务。 true：使用 false：不使用 当不设置该参数或参数为空时，默认为不使用。 当使用该服务时，必须设置obs输出目录，否则图片无法上传。问题图片会自动上传至输出路径/task_id目录下。
     * 
     * @return upload */
    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceConfigCommon serviceConfigCommon = (ServiceConfigCommon) o;
        return Objects.equals(this.frameInterval, serviceConfigCommon.frameInterval)
            && Objects.equals(this.categories, serviceConfigCommon.categories)
            && Objects.equals(this.textCategories, serviceConfigCommon.textCategories)
            && Objects.equals(this.useSis, serviceConfigCommon.useSis)
            && Objects.equals(this.useOcr, serviceConfigCommon.useOcr)
            && Objects.equals(this.upload, serviceConfigCommon.upload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frameInterval, categories, textCategories, useSis, useOcr, upload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceConfigCommon {\n");
        sb.append("    frameInterval: ").append(toIndentedString(frameInterval)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    textCategories: ").append(toIndentedString(textCategories)).append("\n");
        sb.append("    useSis: ").append(toIndentedString(useSis)).append("\n");
        sb.append("    useOcr: ").append(toIndentedString(useOcr)).append("\n");
        sb.append("    upload: ").append(toIndentedString(upload)).append("\n");
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
