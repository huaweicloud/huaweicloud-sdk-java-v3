package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 具体返回信息。 **约束限制**： 不涉及 **取值范围**： 不涉及。 **默认取值**： 不涉及 
 */
public class PayloadObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<Object> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private Object item;

    public PayloadObject withList(List<Object> list) {
        this.list = list;
        return this;
    }

    public PayloadObject addListItem(Object listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public PayloadObject withList(Consumer<List<Object>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * **参数解释**： 返回信息列表。 **约束限制**： 不涉及 **取值范围**： 元素数量范围[0,100000000]。 **默认取值**： 不涉及 
     * @return list
     */
    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public PayloadObject withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public PayloadObject withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public PayloadObject withItem(Object item) {
        this.item = item;
        return this;
    }

    /**
     * **参数解释**： 返回对象信息。 **约束限制**： 不涉及 **取值范围**： 不涉及。 **默认取值**： 不涉及 
     * @return item
     */
    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PayloadObject that = (PayloadObject) obj;
        return Objects.equals(this.list, that.list) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, pageInfo, item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PayloadObject {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
