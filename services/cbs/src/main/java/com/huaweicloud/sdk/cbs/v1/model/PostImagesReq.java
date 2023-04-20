package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 上传图片请求
 */
public class PostImagesReq implements SdkFormDataBody {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    
    @JsonProperty(value="file",access=JsonProperty.Access.WRITE_ONLY)
    

    private FormDataFilePart file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resolution_type")
    

    private Integer resolutionType;

    public PostImagesReq withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 图片类型： 0：背景 最大 1920*1080 2：图标  最大1920*1080 图片格式：jpg，png
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public PostImagesReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public PostImagesReq withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    


    /**
     * 图片文件
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    

    public PostImagesReq withResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
        return this;
    }

    


    /**
     * 横竖屏模式 0：横屏（默认） 1：竖屏
     * @return resolutionType
     */
    public Integer getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
    }

    
    
    public PostImagesReq withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public PostImagesReq withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public PostImagesReq withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }
    

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {
            private static final long serialVersionUID = 1L;
            {
                put("type", new FormDataPart<>(type));
                put("name", new FormDataPart<>(name));
                put("file", file);
                if (resolutionType != null) {
                    put("resolution_type", new FormDataPart<>(resolutionType));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostImagesReq postImagesReq = (PostImagesReq) o;
        return Objects.equals(this.type, postImagesReq.type) &&
            Objects.equals(this.name, postImagesReq.name) &&
            Objects.equals(this.file, postImagesReq.file) &&
            Objects.equals(this.resolutionType, postImagesReq.resolutionType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, name, file, resolutionType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostImagesReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    resolutionType: ").append(toIndentedString(resolutionType)).append("\n");
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

