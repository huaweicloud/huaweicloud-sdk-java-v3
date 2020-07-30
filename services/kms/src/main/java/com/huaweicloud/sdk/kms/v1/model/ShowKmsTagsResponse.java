package com.huaweicloud.sdk.kms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.TagItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowKmsTagsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagItem> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exist_tag_num")
    
    private Integer existTagNum;

    public ShowKmsTagsResponse withTags(List<TagItem> tags) {
        this.tags = tags;
        return this;
    }

    
    public ShowKmsTagsResponse addTagsItem(TagItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowKmsTagsResponse withTags(Consumer<List<TagItem>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，key和value键值对的集合。  - key：表示标签键，一个密钥下最多包含10个key，key不能为空，不能重复，同一个key中value不能重复。key最大长度为36个字符。  - value：表示标签值。每个值最大长度43个字符，value之间为“与”的关系。
     * @return tags
     */
    public List<TagItem> getTags() {
        return tags;
    }

    public void setTags(List<TagItem> tags) {
        this.tags = tags;
    }

    public ShowKmsTagsResponse withExistTagNum(Integer existTagNum) {
        this.existTagNum = existTagNum;
        return this;
    }

    


    /**
     * 密钥的标签个数。。
     * minimum: 0
     * maximum: 100
     * @return existTagNum
     */
    public Integer getExistTagNum() {
        return existTagNum;
    }

    public void setExistTagNum(Integer existTagNum) {
        this.existTagNum = existTagNum;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowKmsTagsResponse showKmsTagsResponse = (ShowKmsTagsResponse) o;
        return Objects.equals(this.tags, showKmsTagsResponse.tags) &&
            Objects.equals(this.existTagNum, showKmsTagsResponse.existTagNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, existTagNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKmsTagsResponse {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    existTagNum: ").append(toIndentedString(existTagNum)).append("\n");
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

