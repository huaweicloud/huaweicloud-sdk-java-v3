package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListModelProxiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_proxies")

    private List<ListModelProxiesItem> modelProxies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListModelProxiesResponse withModelProxies(List<ListModelProxiesItem> modelProxies) {
        this.modelProxies = modelProxies;
        return this;
    }

    public ListModelProxiesResponse addModelProxiesItem(ListModelProxiesItem modelProxiesItem) {
        if (this.modelProxies == null) {
            this.modelProxies = new ArrayList<>();
        }
        this.modelProxies.add(modelProxiesItem);
        return this;
    }

    public ListModelProxiesResponse withModelProxies(Consumer<List<ListModelProxiesItem>> modelProxiesSetter) {
        if (this.modelProxies == null) {
            this.modelProxies = new ArrayList<>();
        }
        modelProxiesSetter.accept(this.modelProxies);
        return this;
    }

    /**
     * **参数解释：** 模型代理详情。 **取值范围：** 数组长度为0-500个。 
     * @return modelProxies
     */
    public List<ListModelProxiesItem> getModelProxies() {
        return modelProxies;
    }

    public void setModelProxies(List<ListModelProxiesItem> modelProxies) {
        this.modelProxies = modelProxies;
    }

    public ListModelProxiesResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 当前页返回的模型代理数量。 **取值范围：** 取值 0-100。 
     * minimum: 0
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListModelProxiesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 模型代理总数。 **取值范围：** 取值 0-1000000。 
     * minimum: 0
     * maximum: 1000000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListModelProxiesResponse that = (ListModelProxiesResponse) obj;
        return Objects.equals(this.modelProxies, that.modelProxies) && Objects.equals(this.size, that.size)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelProxies, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListModelProxiesResponse {\n");
        sb.append("    modelProxies: ").append(toIndentedString(modelProxies)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
