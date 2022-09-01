package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 规则发现部分,数组中有多个对象时表示需要同时满足所有条件的进程才会被匹配到。 checkType为cmdLine时checkMode填contain,checkContent格式为[“xxx”]表示进程命令行参数中需要包含xxx。checkType为env时checkMode填contain,checkContent格式为 [\&quot;k1\&quot;,\&quot;v1\&quot;]表示进程环境变量中需要包含名为k1值为v1的环境变量。checkType为scope时checkMode填equals,checkContent格式为节点ID数组[\&quot;hostId1”,”hostId2”],表示规则仅会在这些节点上生效(如果不指定节点范围,规则将下发到该项目所有的节点)。
 */
public class DiscoveryRule  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checkContent")
    
    @JacksonXmlProperty(localName = "checkContent")
    
    private List<String> checkContent = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checkMode")
    
    @JacksonXmlProperty(localName = "checkMode")
    
    private String checkMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checkType")
    
    @JacksonXmlProperty(localName = "checkType")
    
    private String checkType;

    public DiscoveryRule withCheckContent(List<String> checkContent) {
        this.checkContent = checkContent;
        return this;
    }

    
    public DiscoveryRule addCheckContentItem(String checkContentItem) {
        if(this.checkContent == null) {
            this.checkContent = new ArrayList<>();
        }
        this.checkContent.add(checkContentItem);
        return this;
    }

    public DiscoveryRule withCheckContent(Consumer<List<String>> checkContentSetter) {
        if(this.checkContent == null) {
            this.checkContent = new ArrayList<>();
        }
        checkContentSetter.accept(this.checkContent);
        return this;
    }

    /**
     * 匹配值。
     * @return checkContent
     */
    public List<String> getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(List<String> checkContent) {
        this.checkContent = checkContent;
    }

    

    public DiscoveryRule withCheckMode(String checkMode) {
        this.checkMode = checkMode;
        return this;
    }

    


    /**
     * 匹配条件。 contain、equals
     * @return checkMode
     */
    public String getCheckMode() {
        return checkMode;
    }

    public void setCheckMode(String checkMode) {
        this.checkMode = checkMode;
    }

    

    public DiscoveryRule withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    


    /**
     * 匹配类型。 cmdLine、env、scope
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscoveryRule discoveryRule = (DiscoveryRule) o;
        return Objects.equals(this.checkContent, discoveryRule.checkContent) &&
            Objects.equals(this.checkMode, discoveryRule.checkMode) &&
            Objects.equals(this.checkType, discoveryRule.checkType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checkContent, checkMode, checkType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscoveryRule {\n");
        sb.append("    checkContent: ").append(toIndentedString(checkContent)).append("\n");
        sb.append("    checkMode: ").append(toIndentedString(checkMode)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
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

