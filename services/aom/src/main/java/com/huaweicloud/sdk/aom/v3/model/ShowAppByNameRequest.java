package com.huaweicloud.sdk.aom.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "ShowAppByNameRequest")
public class ShowAppByNameRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    public ShowAppByNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 应用唯一标识;字符集长度2-64，仅支持字符集：英文字母、数字、下划线、中划线、点；应用唯一标识与显示名称至少填写其一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowAppByNameRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 实体的显示名称；字符集长度2-64，仅支持字符集：中文字符、英文字母、数字、下划线、中划线、点；应用唯一标识与显示名称至少填写其一
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAppByNameRequest showAppByNameRequest = (ShowAppByNameRequest) o;
        return Objects.equals(this.name, showAppByNameRequest.name) &&
            Objects.equals(this.displayName, showAppByNameRequest.displayName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, displayName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppByNameRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

