package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.Quota;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GesQuotaResp
 */
public class GesQuotaResp  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<Quota> resources = null;
    
    public GesQuotaResp withResources(List<Quota> resources) {
        this.resources = resources;
        return this;
    }

    
    public GesQuotaResp addResourcesItem(Quota resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public GesQuotaResp withResources(Consumer<List<Quota>> resourcesSetter) {
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
    public List<Quota> getResources() {
        return resources;
    }

    public void setResources(List<Quota> resources) {
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
        GesQuotaResp gesQuotaResp = (GesQuotaResp) o;
        return Objects.equals(this.resources, gesQuotaResp.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GesQuotaResp {\n");
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

