package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.Links;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * image字段数据结构说明
 */
public class Image  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private UUID id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Links> links = null;
    
    public Image withId(UUID id) {
        this.id = id;
        return this;
    }

    


    /**
     * 裸金属服务器镜像ID
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    

    public Image withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    
    public Image addLinksItem(Links linksItem) {
        this.links.add(linksItem);
        return this;
    }

    public Image withLinks(Consumer<List<Links>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 裸金属服务器镜像相关快捷链接信息
     * @return links
     */
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image image = (Image) o;
        return Objects.equals(this.id, image.id) &&
            Objects.equals(this.links, image.links);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, links);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Image {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

