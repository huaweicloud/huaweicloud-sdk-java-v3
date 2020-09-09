package com.huaweicloud.sdk.dms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dms.v2.model.ShowQuotasRespQuotasResources;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 配额信息。
 */
public class ShowQuotasRespQuotas  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<ShowQuotasRespQuotasResources> resources = null;
    
    public ShowQuotasRespQuotas withResources(List<ShowQuotasRespQuotasResources> resources) {
        this.resources = resources;
        return this;
    }

    
    public ShowQuotasRespQuotas addResourcesItem(ShowQuotasRespQuotasResources resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowQuotasRespQuotas withResources(Consumer<List<ShowQuotasRespQuotasResources>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 配额列表。
     * @return resources
     */
    public List<ShowQuotasRespQuotasResources> getResources() {
        return resources;
    }

    public void setResources(List<ShowQuotasRespQuotasResources> resources) {
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
        ShowQuotasRespQuotas showQuotasRespQuotas = (ShowQuotasRespQuotas) o;
        return Objects.equals(this.resources, showQuotasRespQuotas.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasRespQuotas {\n");
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

