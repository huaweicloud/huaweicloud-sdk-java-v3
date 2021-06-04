package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.SourceWithPort;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceBody
 */
public class ResourceBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sources")
    
    private List<SourceWithPort> sources = null;
    
    public ResourceBody withSources(List<SourceWithPort> sources) {
        this.sources = sources;
        return this;
    }

    
    public ResourceBody addSourcesItem(SourceWithPort sourcesItem) {
        if(this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ResourceBody withSources(Consumer<List<SourceWithPort>> sourcesSetter) {
        if(this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 源站域名或源站IP,IP仅支持IPv4,多个源站IP之间以英文逗号间隔,最多支持10个源站IP。
     * @return sources
     */
    public List<SourceWithPort> getSources() {
        return sources;
    }

    public void setSources(List<SourceWithPort> sources) {
        this.sources = sources;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceBody resourceBody = (ResourceBody) o;
        return Objects.equals(this.sources, resourceBody.sources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceBody {\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

