package com.huaweicloud.sdk.imagesearch.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateParam
 */
public class UpdateParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="item_id")
    
    
    private String itemId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desc")
    
    
    private String desc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="custom_tags")
    
    
    private Map<String, String> customTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="custom_num_tags")
    
    
    private Map<String, Double> customNumTags = null;
    
    public UpdateParam withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    


    /**
     * 数据的服务实例级唯一标识，字符长度范围为[1, 256]。
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    

    public UpdateParam withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    


    /**
     * 数据的描述信息，字符长度范围为[1, 2048]。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    

    public UpdateParam withCustomTags(Map<String, String> customTags) {
        this.customTags = customTags;
        return this;
    }

    

    public UpdateParam putCustomTagsItem(String key, String customTagsItem) {
        if(this.customTags == null) {
            this.customTags = new HashMap<>();
        }
        this.customTags.put(key, customTagsItem);
        return this;
    }

    public UpdateParam withCustomTags(Consumer<Map<String, String>> customTagsSetter) {
        if(this.customTags == null) {
            this.customTags = new HashMap<>();
        }
        customTagsSetter.accept(this.customTags);
        return this;
    }
    /**
     * 数据的自定义字符标签，可用于搜索时的过滤。格式为键值对{key:value}。 - key: 必须为服务实例custom_tags中已存在的key，可在创建服务实例时进行配置，或在更新服务实例时进行新增。 - value: 类型为字符串，字符长度范围为[1, 64]。
     * @return customTags
     */
    public Map<String, String> getCustomTags() {
        return customTags;
    }

    public void setCustomTags(Map<String, String> customTags) {
        this.customTags = customTags;
    }

    

    public UpdateParam withCustomNumTags(Map<String, Double> customNumTags) {
        this.customNumTags = customNumTags;
        return this;
    }

    

    public UpdateParam putCustomNumTagsItem(String key, Double customNumTagsItem) {
        if(this.customNumTags == null) {
            this.customNumTags = new HashMap<>();
        }
        this.customNumTags.put(key, customNumTagsItem);
        return this;
    }

    public UpdateParam withCustomNumTags(Consumer<Map<String, Double>> customNumTagsSetter) {
        if(this.customNumTags == null) {
            this.customNumTags = new HashMap<>();
        }
        customNumTagsSetter.accept(this.customNumTags);
        return this;
    }
    /**
     * 数据的自定义数值标签，可用于搜索时的过滤。格式为键值对{key:value}。 - key: 必须为服务实例custom_num_tags中已存在的key，可在创建服务实例时进行配置，或在更新服务实例时进行新增。 - value: 类型为数值，格式为double。
     * @return customNumTags
     */
    public Map<String, Double> getCustomNumTags() {
        return customNumTags;
    }

    public void setCustomNumTags(Map<String, Double> customNumTags) {
        this.customNumTags = customNumTags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateParam updateParam = (UpdateParam) o;
        return Objects.equals(this.itemId, updateParam.itemId) &&
            Objects.equals(this.desc, updateParam.desc) &&
            Objects.equals(this.customTags, updateParam.customTags) &&
            Objects.equals(this.customNumTags, updateParam.customNumTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(itemId, desc, customTags, customNumTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateParam {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
        sb.append("    customNumTags: ").append(toIndentedString(customNumTags)).append("\n");
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

