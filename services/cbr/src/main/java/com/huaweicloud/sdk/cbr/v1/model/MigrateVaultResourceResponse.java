package com.huaweicloud.sdk.cbr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class MigrateVaultResourceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migrated_resources")
    
    private List<String> migratedResources = null;
    
    public MigrateVaultResourceResponse withMigratedResources(List<String> migratedResources) {
        this.migratedResources = migratedResources;
        return this;
    }

    
    public MigrateVaultResourceResponse addMigratedResourcesItem(String migratedResourcesItem) {
        if (this.migratedResources == null) {
            this.migratedResources = new ArrayList<>();
        }
        this.migratedResources.add(migratedResourcesItem);
        return this;
    }

    public MigrateVaultResourceResponse withMigratedResources(Consumer<List<String>> migratedResourcesSetter) {
        if(this.migratedResources == null ){
            this.migratedResources = new ArrayList<>();
        }
        migratedResourcesSetter.accept(this.migratedResources);
        return this;
    }

    /**
     * 
     * @return migratedResources
     */
    public List<String> getMigratedResources() {
        return migratedResources;
    }

    public void setMigratedResources(List<String> migratedResources) {
        this.migratedResources = migratedResources;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateVaultResourceResponse migrateVaultResourceResponse = (MigrateVaultResourceResponse) o;
        return Objects.equals(this.migratedResources, migrateVaultResourceResponse.migratedResources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(migratedResources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateVaultResourceResponse {\n");
        sb.append("    migratedResources: ").append(toIndentedString(migratedResources)).append("\n");
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

