package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AimPersonalTemplatePage
 */
public class AimPersonalTemplatePage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_order")

    private Integer pageOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<AimPersonalTemplateContent> contents = null;

    public AimPersonalTemplatePage withPageOrder(Integer pageOrder) {
        this.pageOrder = pageOrder;
        return this;
    }

    /**
     * 分页显示，指示当前展示第几页，从1开始，最大支持10页。
     * @return pageOrder
     */
    public Integer getPageOrder() {
        return pageOrder;
    }

    public void setPageOrder(Integer pageOrder) {
        this.pageOrder = pageOrder;
    }

    public AimPersonalTemplatePage withContents(List<AimPersonalTemplateContent> contents) {
        this.contents = contents;
        return this;
    }

    public AimPersonalTemplatePage addContentsItem(AimPersonalTemplateContent contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public AimPersonalTemplatePage withContents(Consumer<List<AimPersonalTemplateContent>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 该page下的协议内容。
     * @return contents
     */
    public List<AimPersonalTemplateContent> getContents() {
        return contents;
    }

    public void setContents(List<AimPersonalTemplateContent> contents) {
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
        AimPersonalTemplatePage aimPersonalTemplatePage = (AimPersonalTemplatePage) o;
        return Objects.equals(this.pageOrder, aimPersonalTemplatePage.pageOrder)
            && Objects.equals(this.contents, aimPersonalTemplatePage.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageOrder, contents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AimPersonalTemplatePage {\n");
        sb.append("    pageOrder: ").append(toIndentedString(pageOrder)).append("\n");
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
