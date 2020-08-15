package com.huaweicloud.sdk.cloudide.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * StacksAttribute
 */
public class StacksAttribute  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="specs")
    
    private List<String> specs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suggest")
    
    private String suggest;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suggest_title")
    
    private String suggestTitle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes")
    
    private List<String> volumes = null;
    
    public StacksAttribute withSpecs(List<String> specs) {
        this.specs = specs;
        return this;
    }

    
    public StacksAttribute addSpecsItem(String specsItem) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        this.specs.add(specsItem);
        return this;
    }

    public StacksAttribute withSpecs(Consumer<List<String>> specsSetter) {
        if(this.specs == null ){
            this.specs = new ArrayList<>();
        }
        specsSetter.accept(this.specs);
        return this;
    }

    /**
     * 规格列表
     * @return specs
     */
    public List<String> getSpecs() {
        return specs;
    }

    public void setSpecs(List<String> specs) {
        this.specs = specs;
    }

    public StacksAttribute withSuggest(String suggest) {
        this.suggest = suggest;
        return this;
    }

    


    /**
     * 提示id
     * @return suggest
     */
    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public StacksAttribute withSuggestTitle(String suggestTitle) {
        this.suggestTitle = suggestTitle;
        return this;
    }

    


    /**
     * 提示信息
     * @return suggestTitle
     */
    public String getSuggestTitle() {
        return suggestTitle;
    }

    public void setSuggestTitle(String suggestTitle) {
        this.suggestTitle = suggestTitle;
    }

    public StacksAttribute withVolumes(List<String> volumes) {
        this.volumes = volumes;
        return this;
    }

    
    public StacksAttribute addVolumesItem(String volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public StacksAttribute withVolumes(Consumer<List<String>> volumesSetter) {
        if(this.volumes == null ){
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 卷容量列表
     * @return volumes
     */
    public List<String> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<String> volumes) {
        this.volumes = volumes;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StacksAttribute stacksAttribute = (StacksAttribute) o;
        return Objects.equals(this.specs, stacksAttribute.specs) &&
            Objects.equals(this.suggest, stacksAttribute.suggest) &&
            Objects.equals(this.suggestTitle, stacksAttribute.suggestTitle) &&
            Objects.equals(this.volumes, stacksAttribute.volumes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(specs, suggest, suggestTitle, volumes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StacksAttribute {\n");
        sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
        sb.append("    suggest: ").append(toIndentedString(suggest)).append("\n");
        sb.append("    suggestTitle: ").append(toIndentedString(suggestTitle)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

