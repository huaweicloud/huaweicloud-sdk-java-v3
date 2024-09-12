package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 原子动作样例详情。
 */
public class ActionSampleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name_zh")

    private String actionNameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name_en")

    private String actionNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_tag")

    private String actionTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog")

    private String catalog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_selected")

    private Boolean isSelected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_download_url")

    private String sampleDownloadUrl;

    public ActionSampleInfo withActionNameZh(String actionNameZh) {
        this.actionNameZh = actionNameZh;
        return this;
    }

    /**
     * 原子动作中文名称。
     * @return actionNameZh
     */
    public String getActionNameZh() {
        return actionNameZh;
    }

    public void setActionNameZh(String actionNameZh) {
        this.actionNameZh = actionNameZh;
    }

    public ActionSampleInfo withActionNameEn(String actionNameEn) {
        this.actionNameEn = actionNameEn;
        return this;
    }

    /**
     * 原子动作英文名称。
     * @return actionNameEn
     */
    public String getActionNameEn() {
        return actionNameEn;
    }

    public void setActionNameEn(String actionNameEn) {
        this.actionNameEn = actionNameEn;
    }

    public ActionSampleInfo withActionTag(String actionTag) {
        this.actionTag = actionTag;
        return this;
    }

    /**
     * 动作Tag。
     * @return actionTag
     */
    public String getActionTag() {
        return actionTag;
    }

    public void setActionTag(String actionTag) {
        this.actionTag = actionTag;
    }

    public ActionSampleInfo withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * 动作分类名称。
     * @return catalog
     */
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public ActionSampleInfo withIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
        return this;
    }

    /**
     * 是否选择此动作。
     * @return isSelected
     */
    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public ActionSampleInfo withSampleDownloadUrl(String sampleDownloadUrl) {
        this.sampleDownloadUrl = sampleDownloadUrl;
        return this;
    }

    /**
     * 原子动作样例文件下载地址。24小时内有效。
     * @return sampleDownloadUrl
     */
    public String getSampleDownloadUrl() {
        return sampleDownloadUrl;
    }

    public void setSampleDownloadUrl(String sampleDownloadUrl) {
        this.sampleDownloadUrl = sampleDownloadUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionSampleInfo that = (ActionSampleInfo) obj;
        return Objects.equals(this.actionNameZh, that.actionNameZh)
            && Objects.equals(this.actionNameEn, that.actionNameEn) && Objects.equals(this.actionTag, that.actionTag)
            && Objects.equals(this.catalog, that.catalog) && Objects.equals(this.isSelected, that.isSelected)
            && Objects.equals(this.sampleDownloadUrl, that.sampleDownloadUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionNameZh, actionNameEn, actionTag, catalog, isSelected, sampleDownloadUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionSampleInfo {\n");
        sb.append("    actionNameZh: ").append(toIndentedString(actionNameZh)).append("\n");
        sb.append("    actionNameEn: ").append(toIndentedString(actionNameEn)).append("\n");
        sb.append("    actionTag: ").append(toIndentedString(actionTag)).append("\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
        sb.append("    sampleDownloadUrl: ").append(toIndentedString(sampleDownloadUrl)).append("\n");
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
