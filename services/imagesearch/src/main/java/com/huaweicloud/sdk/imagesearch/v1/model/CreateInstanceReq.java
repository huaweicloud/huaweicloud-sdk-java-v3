package com.huaweicloud.sdk.imagesearch.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建实例的body体
 */
public class CreateInstanceReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="model")
    

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    
    public CreateInstanceReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。  - 仅支持小写字母（a-z）、数字，横杠和下划线。  - 以字母开头，长度在16位以内。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateInstanceReq withModel(String model) {
        this.model = model;
        return this;
    }

    


    /**
     * 模型名称，支持如下模型名称：  - common-search，通用图片搜索，适用于图片库中搜索相似内容或类别的图片。  - image-recommend，版权图片推荐，适用于版权摄影图片库中查找并推荐相同或相似版权图片。  - image-copyright，图片版权，适用于从海量图片库中快速识别侵权盗用图片。 
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    public CreateInstanceReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateInstanceReq withLevel(Integer level) {
        this.level = level;
        return this;
    }

    


    /**
     * 规格，即实例的图片数量规格。默认为30000000（单位：张），当前仅支持默认规格。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    

    public CreateInstanceReq withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateInstanceReq addTagsItem(String tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateInstanceReq withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 图片自定义标签，每个实例最多支持10个标签，自定义标签不支持英文字母大写。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceReq createInstanceReq = (CreateInstanceReq) o;
        return Objects.equals(this.name, createInstanceReq.name) &&
            Objects.equals(this.model, createInstanceReq.model) &&
            Objects.equals(this.description, createInstanceReq.description) &&
            Objects.equals(this.level, createInstanceReq.level) &&
            Objects.equals(this.tags, createInstanceReq.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, model, description, level, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

