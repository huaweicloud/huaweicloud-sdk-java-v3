package com.huaweicloud.sdk.imagesearch.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunCheckPictureResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exist")
    
    @JacksonXmlProperty(localName = "exist")
    
    private String exist;

    public RunCheckPictureResponse withExist(String exist) {
        this.exist = exist;
        return this;
    }

    


    /**
     * 调用成功时表示调用结果。  调用失败时无此字段。  - true表示图像索引库中存在查询的图片。  - false表示图像索引库中不存在查询的图片。 
     * @return exist
     */
    public String getExist() {
        return exist;
    }

    public void setExist(String exist) {
        this.exist = exist;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunCheckPictureResponse runCheckPictureResponse = (RunCheckPictureResponse) o;
        return Objects.equals(this.exist, runCheckPictureResponse.exist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(exist);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCheckPictureResponse {\n");
        sb.append("    exist: ").append(toIndentedString(exist)).append("\n");
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

