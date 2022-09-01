package com.huaweicloud.sdk.imagesearch.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 添加图片body体
 */
public class AddPictureRequestReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file")
    
    @JacksonXmlProperty(localName = "file")
    
    private String file;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    @JacksonXmlProperty(localName = "path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    @JacksonXmlProperty(localName = "tags")
    
    private Object tags;

    public AddPictureRequestReq withFile(String file) {
        this.file = file;
        return this;
    }

    


    /**
     * 图片文件Base64编码字符串，仅支持JPEG/JPG/PNG/BMP格式，图片最小边不小于100px，最大边不超过2048px。
     * @return file
     */
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    

    public AddPictureRequestReq withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 图片的URL路径，作为图片库中索引图片的ID，是必选参数。  > - 当file字段不为空时，图片从file获取，path作为图片索引ID使用；当file字段不存在或者为空时，图片需要通过下载获取，此时path作为下载图片的地址（当前仅支持从华为云图像搜索服务所在区域的OBS下载图片），同时，path也作为图片索引ID。 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public AddPictureRequestReq withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 图片自定义标签。格式为key：value对，所有图片的key总数最多不超过10个，但是每个key对应的value不限制个数，例如：key为动物，对应的value可以是猫、狗、鸟等多个。  标签名（key）添加方式：   - 登录管理控制台，单击“创建实例”，自定义标签名。    - 登录管理控制台，在“实例管理”页签，单击实例名称，进入“基础信息”页添加自定义标签。 
     * @return tags
     */
    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
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
        AddPictureRequestReq addPictureRequestReq = (AddPictureRequestReq) o;
        return Objects.equals(this.file, addPictureRequestReq.file) &&
            Objects.equals(this.path, addPictureRequestReq.path) &&
            Objects.equals(this.tags, addPictureRequestReq.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(file, path, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPictureRequestReq {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

