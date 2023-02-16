package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ListQuotasRespQuotasResources;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * resource类型列表，请求失败时该字段为空。
 */
public class ListQuotasRespQuotas  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    
    private List<ListQuotasRespQuotasResources> resources = null;
    
    public ListQuotasRespQuotas withResources(List<ListQuotasRespQuotasResources> resources) {
        this.resources = resources;
        return this;
    }

    
    public ListQuotasRespQuotas addResourcesItem(ListQuotasRespQuotasResources resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListQuotasRespQuotas withResources(Consumer<List<ListQuotasRespQuotasResources>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * GES资源配额列表。
     * @return resources
     */
    public List<ListQuotasRespQuotasResources> getResources() {
        return resources;
    }

    public void setResources(List<ListQuotasRespQuotasResources> resources) {
        this.resources = resources;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQuotasRespQuotas listQuotasRespQuotas = (ListQuotasRespQuotas) o;
        return Objects.equals(this.resources, listQuotasRespQuotas.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotasRespQuotas {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

