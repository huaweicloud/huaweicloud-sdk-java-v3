package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 若想忽略来源于某攻击事件下指定字段的攻击，可在“高级设置”里选择指定字段进行配置，配置完成后，WAF将不再拦截指定字段的攻击事件。当时，当不检测模块为所有检测模块时，不支持配置该高级配置。
 */
public class Advanced {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    @JacksonXmlProperty(localName = "index")

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contensts")

    @JacksonXmlProperty(localName = "contensts")

    private List<String> contensts = null;

    public Advanced withIndex(String index) {
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

    public Advanced withContensts(List<String> contensts) {
        this.contensts = contensts;
        return this;
    }

    public Advanced addContenstsItem(String contenstsItem) {
        if (this.contensts == null) {
            this.contensts = new ArrayList<>();
        }
        this.contensts.add(contenstsItem);
        return this;
    }

    public Advanced withContensts(Consumer<List<String>> contenstsSetter) {
        if (this.contensts == null) {
            this.contensts = new ArrayList<>();
        }
        contenstsSetter.accept(this.contensts);
        return this;
    }

    /**
     * 指定字段类型的子字段，默认值为“全部”
     * @return contensts
     */
    public List<String> getContensts() {
        return contensts;
    }

    public void setContensts(List<String> contensts) {
        this.contensts = contensts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Advanced advanced = (Advanced) o;
        return Objects.equals(this.index, advanced.index) && Objects.equals(this.contensts, advanced.contensts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, contensts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Advanced {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    contensts: ").append(toIndentedString(contensts)).append("\n");
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
