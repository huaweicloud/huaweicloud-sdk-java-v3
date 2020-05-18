package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * FuncCode结构返回体。
 */
public class FuncCode  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file")
    
    private String file;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="link")
    
    private String link;

    public FuncCode withFile(String file) {
        this.file = file;
        return this;
    }

    


    /**
     * 函数代码，当CodeTye为inline/zip/jar时必选，且代码必须要进行base64编码。
     * @return file
     */
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public FuncCode withLink(String link) {
        this.link = link;
        return this;
    }

    


    /**
     * 函数代码链接。
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuncCode funcCode = (FuncCode) o;
        return Objects.equals(this.file, funcCode.file) &&
            Objects.equals(this.link, funcCode.link);
    }
    @Override
    public int hashCode() {
        return Objects.hash(file, link);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuncCode {\n");
            sb.append("    file: ").append(toIndentedString(file)).append("\n");
            sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

