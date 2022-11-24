package com.huaweicloud.sdk.imagesearch.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v1.model.SearchBoxDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SearchPictureReq
 */
public class SearchPictureReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file")
    
    
    private String file;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    
    private Object tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_crop")
    
    
    private Boolean isCrop;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="box")
    
    
    private SearchBoxDetail box;

    public SearchPictureReq withFile(String file) {
        this.file = file;
        return this;
    }

    


    /**
     * 图片文件Base64编码字符串，仅支持JPEG/JPG/PNG/BMP格式，图片最小边不小于100px，最大边不超过2048px。该参数与path二选一，如果两个参数都存在，则以file为主。 
     * @return file
     */
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    

    public SearchPictureReq withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 图片的URL路径，图片库中的图片索引ID。该参数与file二选一，如果两个参数都存在，则以file为主。 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public SearchPictureReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 返回被检索图像的数量，取值为1~100的整数，默认为10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public SearchPictureReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，指定搜索结果返回起始位置，取值为大于或等于0的整数，默认为0。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public SearchPictureReq withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 图片自定义标签，最多不超过10个，格式为key：value对。 标签名（key）添加方式：   - 登录管理控制台，单击“创建实例”，自定义标签名。   - 登录管理控制台，在“实例管理”页签，单击实例名称，进入“基础信息”页添加自定义标签。 使用图片标签搜索时该参数必选。
     * @return tags
     */
    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    

    public SearchPictureReq withIsCrop(Boolean isCrop) {
        this.isCrop = isCrop;
        return this;
    }

    


    /**
     * 是否用图片中指定区域（参数box）进行搜索。默认为false，该参数目前仅对某些特定模型有效，其他模型暂不支持目标检测。 - true：用图片中指定区域（参数box）进行搜索。 - false：用全图进行搜索。
     * @return isCrop
     */
    public Boolean getIsCrop() {
        return isCrop;
    }

    public void setIsCrop(Boolean isCrop) {
        this.isCrop = isCrop;
    }

    

    public SearchPictureReq withBox(SearchBoxDetail box) {
        this.box = box;
        return this;
    }

    public SearchPictureReq withBox(Consumer<SearchBoxDetail> boxSetter) {
        if(this.box == null ){
            this.box = new SearchBoxDetail();
            boxSetter.accept(this.box);
        }
        
        return this;
    }


    /**
     * Get box
     * @return box
     */
    public SearchBoxDetail getBox() {
        return box;
    }

    public void setBox(SearchBoxDetail box) {
        this.box = box;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchPictureReq searchPictureReq = (SearchPictureReq) o;
        return Objects.equals(this.file, searchPictureReq.file) &&
            Objects.equals(this.path, searchPictureReq.path) &&
            Objects.equals(this.limit, searchPictureReq.limit) &&
            Objects.equals(this.offset, searchPictureReq.offset) &&
            Objects.equals(this.tags, searchPictureReq.tags) &&
            Objects.equals(this.isCrop, searchPictureReq.isCrop) &&
            Objects.equals(this.box, searchPictureReq.box);
    }
    @Override
    public int hashCode() {
        return Objects.hash(file, path, limit, offset, tags, isCrop, box);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchPictureReq {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    isCrop: ").append(toIndentedString(isCrop)).append("\n");
        sb.append("    box: ").append(toIndentedString(box)).append("\n");
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

