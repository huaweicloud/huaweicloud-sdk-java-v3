package com.huaweicloud.sdk.bss.v2.model;

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
public class ListFreeResourceUsagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resources")

    private List<FreeResourceDetail> freeResources = null;

    public ListFreeResourceUsagesResponse withFreeResources(List<FreeResourceDetail> freeResources) {
        this.freeResources = freeResources;
        return this;
    }

    public ListFreeResourceUsagesResponse addFreeResourcesItem(FreeResourceDetail freeResourcesItem) {
        if (this.freeResources == null) {
            this.freeResources = new ArrayList<>();
        }
        this.freeResources.add(freeResourcesItem);
        return this;
    }

    public ListFreeResourceUsagesResponse withFreeResources(Consumer<List<FreeResourceDetail>> freeResourcesSetter) {
        if (this.freeResources == null) {
            this.freeResources = new ArrayList<>();
        }
        freeResourcesSetter.accept(this.freeResources);
        return this;
    }

    /**
     * 资源套餐内的资源项信息（资源项ID级的详情），具体参见表2。
     * @return freeResources
     */
    public List<FreeResourceDetail> getFreeResources() {
        return freeResources;
    }

    public void setFreeResources(List<FreeResourceDetail> freeResources) {
        this.freeResources = freeResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFreeResourceUsagesResponse that = (ListFreeResourceUsagesResponse) obj;
        return Objects.equals(this.freeResources, that.freeResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFreeResourceUsagesResponse {\n");
        sb.append("    freeResources: ").append(toIndentedString(freeResources)).append("\n");
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
