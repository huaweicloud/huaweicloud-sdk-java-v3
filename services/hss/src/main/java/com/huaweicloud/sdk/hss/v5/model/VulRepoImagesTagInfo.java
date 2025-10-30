package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 漏洞关联的镜像版本
 */
public class VulRepoImagesTagInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    public VulRepoImagesTagInfo withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * **参数解释**: 版本id **取值范围**: 字符长度0-65535位 
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public VulRepoImagesTagInfo withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * **参数解释**: 版本名称 **取值范围**: 字符长度0-65535位 
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public VulRepoImagesTagInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**: \"版本大小\" **取值范围**: 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public VulRepoImagesTagInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**: 版本app名称 **取值范围**: 字符长度0-65535位 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulRepoImagesTagInfo that = (VulRepoImagesTagInfo) obj;
        return Objects.equals(this.tagId, that.tagId) && Objects.equals(this.tagName, that.tagName)
            && Objects.equals(this.size, that.size) && Objects.equals(this.appName, that.appName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, tagName, size, appName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulRepoImagesTagInfo {\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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
