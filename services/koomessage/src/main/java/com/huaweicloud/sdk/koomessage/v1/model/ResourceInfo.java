package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 智能信息基础版资源信息。
 */
public class ResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public ResourceInfo withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * 智能信息基础版序号。  从1开始，例如: 1-1，表示第1帧第1个元素；1-2：表示第1帧第2个元素；2-1：表示第2帧第1个元素。  > - 每帧支持最多2个元素，2个元素中必须包含有文本 > - 如果未填该字段，则每个元素独占一帧并按数组顺序排序 > - 最多支持8帧 > - 最多2帧同时包含2个元素 > - index必须全部指定，或者全为空，不能重复 
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public ResourceInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 智能信息基础版资源类型。 - 类型为文字填：txt - 类型为图片填：jpg/jpeg/png/gif - 类型为音频填：mp3/wav - 类型为视频填：3gp 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 智能信息基础版资源名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 智能信息基础版资源来源。  - txt：表示资源内容是纯文字 - file：表示资源内容来源于文件流 - url：表示资源内容来源于URL外链  > 资源来自于文字/文件流/URL外链。 
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ResourceInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 智能信息基础版。 - 当source=txt时，填写经过UTF-8编码的文字 - 当source=file时，填写经过Base64编码的文件流，不须带文件格式前缀，样例：\"iVBORw0KGgoAAAANSUhEUgA...\"，样例过长，未显示全部 - 当source=url时，填写资源URL地址，URL长度不能超过1024个字节  > - 支持文字图片，文字和图片使用#p_n#参数变量占位，n为1~100内的数字，不同类型的资源中不允许有重复的参数占位符，相同类型的资源同一参数占位符可复用。如：#p_1#已表示是文本参数占位符时，不可以同时是图片又是文本参数占位符。不能包含除模板签名外的“【】” > - 第一个文本帧，内容必须以：【签名】开始，'签名' 标识客户信息 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceInfo that = (ResourceInfo) obj;
        return Objects.equals(this.index, that.index) && Objects.equals(this.type, that.type)
            && Objects.equals(this.name, that.name) && Objects.equals(this.source, that.source)
            && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, type, name, source, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInfo {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
