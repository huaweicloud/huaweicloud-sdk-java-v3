package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListStylesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "styles")

    private List<StyleInfo> styles = null;

    public ListStylesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 风格信息总数
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListStylesResponse withStyles(List<StyleInfo> styles) {
        this.styles = styles;
        return this;
    }

    public ListStylesResponse addStylesItem(StyleInfo stylesItem) {
        if (this.styles == null) {
            this.styles = new ArrayList<>();
        }
        this.styles.add(stylesItem);
        return this;
    }

    public ListStylesResponse withStyles(Consumer<List<StyleInfo>> stylesSetter) {
        if (this.styles == null) {
            this.styles = new ArrayList<>();
        }
        stylesSetter.accept(this.styles);
        return this;
    }

    /**
     * 风格信息列表
     * @return styles
     */
    public List<StyleInfo> getStyles() {
        return styles;
    }

    public void setStyles(List<StyleInfo> styles) {
        this.styles = styles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStylesResponse that = (ListStylesResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.styles, that.styles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, styles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStylesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    styles: ").append(toIndentedString(styles)).append("\n");
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
