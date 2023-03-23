package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 若想忽略来源于某攻击事件下指定字段的攻击，可在“高级设置”里选择指定字段进行配置，配置完成后，WAF将不再拦截指定字段的攻击事件。当时，当不检测模块为所有检测模块时，不支持配置该高级配置。
 */
public class IgnoreAdvanced {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<String> contents = null;

    public IgnoreAdvanced withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * 字段类型，支持的字段类型有：Params、Cookie、Header、Body、Multipart。   - 当选择“Params”、“Cookie”或者“Header”字段时，可以配置“全部”或根据需求配置子字段   - 当选择“Body”或“Multipart”字段时，可以配置“全部”
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public IgnoreAdvanced withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public IgnoreAdvanced addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public IgnoreAdvanced withContents(Consumer<List<String>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 指定字段类型的子字段，默认值为“全部”
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IgnoreAdvanced ignoreAdvanced = (IgnoreAdvanced) o;
        return Objects.equals(this.index, ignoreAdvanced.index)
            && Objects.equals(this.contents, ignoreAdvanced.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, contents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IgnoreAdvanced {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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
