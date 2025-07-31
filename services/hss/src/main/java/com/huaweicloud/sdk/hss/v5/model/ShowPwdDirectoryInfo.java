package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 弱口令检查策略目录详细信息
 */
public class ShowPwdDirectoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tag")

    private String subTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checked")

    private Boolean checked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public ShowPwdDirectoryInfo withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 弱口令及口令复杂度一级标签，包含如下:   - weakpwd_pwdcomplexity : 弱口令及口令复杂度检测   - weakpwd               : 弱口令检测
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ShowPwdDirectoryInfo withSubTag(String subTag) {
        this.subTag = subTag;
        return this;
    }

    /**
     * 口令检查包含子标签，包含如下:   - weak_pwd : 经典弱口令检测   - pwd_complexity : 口令复杂度策略检
     * @return subTag
     */
    public String getSubTag() {
        return subTag;
    }

    public void setSubTag(String subTag) {
        this.subTag = subTag;
    }

    public ShowPwdDirectoryInfo withChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    /**
     * **参数解释** 该项是否被选中 **取值范围**  - true : 被选中 - false: 未被选中
     * @return checked
     */
    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public ShowPwdDirectoryInfo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 表示目录中的唯一值:   - weak_pwd : 经典弱口令检测   - pwd_complexity : 口令复杂度策略检测
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPwdDirectoryInfo that = (ShowPwdDirectoryInfo) obj;
        return Objects.equals(this.tag, that.tag) && Objects.equals(this.subTag, that.subTag)
            && Objects.equals(this.checked, that.checked) && Objects.equals(this.key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, subTag, checked, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPwdDirectoryInfo {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    subTag: ").append(toIndentedString(subTag)).append("\n");
        sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
