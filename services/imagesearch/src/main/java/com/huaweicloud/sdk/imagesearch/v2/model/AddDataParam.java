package com.huaweicloud.sdk.imagesearch.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.AddDataOptionalParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AddDataParam
 */
public class AddDataParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="force")
    
    
    private Boolean force;


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
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_base64")
    
    
    private String imageBase64;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_url")
    
    
    private String imageUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keywords")
    
    
    private List<String> keywords = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="optional_params")
    
    
    private AddDataOptionalParam optionalParams;

    public AddDataParam withForce(Boolean force) {
        this.force = force;
        return this;
    }

    


    /**
     * 是否强制添加数据，默认为false。 - false: 数据已存在则不进行添加。 - true: 数据已存在仍然覆盖添加。
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    

    public AddDataParam withItemId(String itemId) {
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

    

    public AddDataParam withDesc(String desc) {
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

    

    public AddDataParam withCustomTags(Map<String, String> customTags) {
        this.customTags = customTags;
        return this;
    }

    

    public AddDataParam putCustomTagsItem(String key, String customTagsItem) {
        if(this.customTags == null) {
            this.customTags = new HashMap<>();
        }
        this.customTags.put(key, customTagsItem);
        return this;
    }

    public AddDataParam withCustomTags(Consumer<Map<String, String>> customTagsSetter) {
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

    

    public AddDataParam withCustomNumTags(Map<String, Double> customNumTags) {
        this.customNumTags = customNumTags;
        return this;
    }

    

    public AddDataParam putCustomNumTagsItem(String key, Double customNumTagsItem) {
        if(this.customNumTags == null) {
            this.customNumTags = new HashMap<>();
        }
        this.customNumTags.put(key, customNumTagsItem);
        return this;
    }

    public AddDataParam withCustomNumTags(Consumer<Map<String, Double>> customNumTagsSetter) {
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

    

    public AddDataParam withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    


    /**
     * 图像文件的base64字符串，图像入库时，与image_url二选一。要求如下： - 格式：目前仅支持JPEG/JPG/PNG/BMP格式的图像。 - 尺寸：默认情况下，要求图像的最短边大于128px，最长边小于4096px。部分服务类型有特殊要求，可参见服务类型说明。 - 大小：图像文件大小要求不超过5M。 - 其他：图片中不能包含旋转信息。
     * @return imageBase64
     */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    

    public AddDataParam withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    


    /**
     * 图像文件的服务可访问URL，字符长度范围为[1, 4096]。图像入库时，与image_base64二选一。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    

    public AddDataParam withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    
    public AddDataParam addKeywordsItem(String keywordsItem) {
        if(this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    public AddDataParam withKeywords(Consumer<List<String>> keywordsSetter) {
        if(this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        keywordsSetter.accept(this.keywords);
        return this;
    }

    /**
     * 关键词列表，关键词数量范围为[1, 100]，关键词字符长度范围为[1, 64]。支持关键词搜索的服务实例添加数据时，如给定此参数，则直接使用给定的keywords作为关键词，否则会自动生成对应的keywords。
     * @return keywords
     */
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    

    public AddDataParam withOptionalParams(AddDataOptionalParam optionalParams) {
        this.optionalParams = optionalParams;
        return this;
    }

    public AddDataParam withOptionalParams(Consumer<AddDataOptionalParam> optionalParamsSetter) {
        if(this.optionalParams == null ){
            this.optionalParams = new AddDataOptionalParam();
            optionalParamsSetter.accept(this.optionalParams);
        }
        
        return this;
    }


    /**
     * Get optionalParams
     * @return optionalParams
     */
    public AddDataOptionalParam getOptionalParams() {
        return optionalParams;
    }

    public void setOptionalParams(AddDataOptionalParam optionalParams) {
        this.optionalParams = optionalParams;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDataParam addDataParam = (AddDataParam) o;
        return Objects.equals(this.force, addDataParam.force) &&
            Objects.equals(this.itemId, addDataParam.itemId) &&
            Objects.equals(this.desc, addDataParam.desc) &&
            Objects.equals(this.customTags, addDataParam.customTags) &&
            Objects.equals(this.customNumTags, addDataParam.customNumTags) &&
            Objects.equals(this.imageBase64, addDataParam.imageBase64) &&
            Objects.equals(this.imageUrl, addDataParam.imageUrl) &&
            Objects.equals(this.keywords, addDataParam.keywords) &&
            Objects.equals(this.optionalParams, addDataParam.optionalParams);
    }
    @Override
    public int hashCode() {
        return Objects.hash(force, itemId, desc, customTags, customNumTags, imageBase64, imageUrl, keywords, optionalParams);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDataParam {\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
        sb.append("    customNumTags: ").append(toIndentedString(customNumTags)).append("\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    optionalParams: ").append(toIndentedString(optionalParams)).append("\n");
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

