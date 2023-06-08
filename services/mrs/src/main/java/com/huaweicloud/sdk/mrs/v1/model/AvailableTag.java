package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 可用区标签
 */
public class AvailableTag  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alias")
    

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_border_group")
    

    private String publicBorderGroup;

    public AvailableTag withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 可用区计费模式，分为专属dedicated和共享shard
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    

    public AvailableTag withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    


    /**
     * az的别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    

    public AvailableTag withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    


    /**
     * 所属group。默认为”center”
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailableTag availableTag = (AvailableTag) o;
        return Objects.equals(this.mode, availableTag.mode) &&
            Objects.equals(this.alias, availableTag.alias) &&
            Objects.equals(this.publicBorderGroup, availableTag.publicBorderGroup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mode, alias, publicBorderGroup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableTag {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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

