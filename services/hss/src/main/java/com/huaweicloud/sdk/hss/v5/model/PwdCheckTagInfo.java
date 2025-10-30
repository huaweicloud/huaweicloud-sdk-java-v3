package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 口令策略一级标签信息
 */
public class PwdCheckTagInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checked")

    private String checked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tags")

    private List<PwdCheckSubTagInfo> subTags = null;

    public PwdCheckTagInfo withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释** 口令检测一级tag **取值范围** - weakpwd_pwdcomplexity
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public PwdCheckTagInfo withChecked(String checked) {
        this.checked = checked;
        return this;
    }

    /**
     * **参数解释** 检测范围。 **取值范围** - true: 如果tag有值,则一级标签tag下所有的检测项都会检测。 - false: 如果tag有值，则一级标签tag下所有的检测项都不会检测。 - indeterminate: 部分检测，具体检测项由sub_tags决定。
     * @return checked
     */
    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public PwdCheckTagInfo withSubTags(List<PwdCheckSubTagInfo> subTags) {
        this.subTags = subTags;
        return this;
    }

    public PwdCheckTagInfo addSubTagsItem(PwdCheckSubTagInfo subTagsItem) {
        if (this.subTags == null) {
            this.subTags = new ArrayList<>();
        }
        this.subTags.add(subTagsItem);
        return this;
    }

    public PwdCheckTagInfo withSubTags(Consumer<List<PwdCheckSubTagInfo>> subTagsSetter) {
        if (this.subTags == null) {
            this.subTags = new ArrayList<>();
        }
        subTagsSetter.accept(this.subTags);
        return this;
    }

    /**
     * 服务器风险TOP5列表
     * @return subTags
     */
    public List<PwdCheckSubTagInfo> getSubTags() {
        return subTags;
    }

    public void setSubTags(List<PwdCheckSubTagInfo> subTags) {
        this.subTags = subTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PwdCheckTagInfo that = (PwdCheckTagInfo) obj;
        return Objects.equals(this.tag, that.tag) && Objects.equals(this.checked, that.checked)
            && Objects.equals(this.subTags, that.subTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, checked, subTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PwdCheckTagInfo {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
        sb.append("    subTags: ").append(toIndentedString(subTags)).append("\n");
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
