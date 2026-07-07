package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ShowSwitchableFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current")

    private Integer current;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<NotebookFlavor> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private Integer pages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<NotebookFlavor> flavors = null;

    public ShowSwitchableFlavorsResponse withCurrent(Integer current) {
        this.current = current;
        return this;
    }

    /**
     * **参数解释**：当前页数。 **取值范围**：正整数。
     * minimum: 1
     * @return current
     */
    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public ShowSwitchableFlavorsResponse withData(List<NotebookFlavor> data) {
        this.data = data;
        return this;
    }

    public ShowSwitchableFlavorsResponse addDataItem(NotebookFlavor dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ShowSwitchableFlavorsResponse withData(Consumer<List<NotebookFlavor>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释**：分页数据。
     * @return data
     */
    public List<NotebookFlavor> getData() {
        return data;
    }

    public void setData(List<NotebookFlavor> data) {
        this.data = data;
    }

    public ShowSwitchableFlavorsResponse withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    /**
     * **参数解释**：总的页数。 **取值范围**：正整数。
     * @return pages
     */
    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public ShowSwitchableFlavorsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：每一页的数量。 **取值范围**：正整数。
     * minimum: 1
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowSwitchableFlavorsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：总的记录数量。 **取值范围**：非负整数。
     * minimum: 1
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ShowSwitchableFlavorsResponse withFlavors(List<NotebookFlavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    public ShowSwitchableFlavorsResponse addFlavorsItem(NotebookFlavor flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ShowSwitchableFlavorsResponse withFlavors(Consumer<List<NotebookFlavor>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * **参数解释**：分页数据。
     * @return flavors
     */
    public List<NotebookFlavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<NotebookFlavor> flavors) {
        this.flavors = flavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSwitchableFlavorsResponse that = (ShowSwitchableFlavorsResponse) obj;
        return Objects.equals(this.current, that.current) && Objects.equals(this.data, that.data)
            && Objects.equals(this.pages, that.pages) && Objects.equals(this.size, that.size)
            && Objects.equals(this.total, that.total) && Objects.equals(this.flavors, that.flavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, data, pages, size, total, flavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSwitchableFlavorsResponse {\n");
        sb.append("    current: ").append(toIndentedString(current)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
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
