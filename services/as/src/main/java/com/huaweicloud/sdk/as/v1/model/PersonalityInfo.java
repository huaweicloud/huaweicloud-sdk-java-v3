package com.huaweicloud.sdk.as.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 注入文件信息。仅支持注入文本文件，最大支持注入5个文件，每个文件最大1KB。
 */
public class PersonalityInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;

    public PersonalityInfo withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 注入文件路径信息。Linux系统请输入注入文件保存路径，例如 “/etc/foo.txt”。Windows系统注入文件自动保存在C盘根目录，只需要输入保存文件名，例如 “foo”，文件名只能包含字母（a~zA~Z）和数字（0~9）。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public PersonalityInfo withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 注入文件内容。该值应指定为注入文件的内容进行base64格式编码后的信息。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersonalityInfo personalityInfo = (PersonalityInfo) o;
        return Objects.equals(this.path, personalityInfo.path) &&
            Objects.equals(this.content, personalityInfo.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path, content);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonalityInfo {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

