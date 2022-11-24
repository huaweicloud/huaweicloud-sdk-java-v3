package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class Tag  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="should")
    
    
    private List<String> should = null;
    
    public Tag withShould(List<String> should) {
        this.should = should;
        return this;
    }

    
    public Tag addShouldItem(String shouldItem) {
        if(this.should == null) {
            this.should = new ArrayList<>();
        }
        this.should.add(shouldItem);
        return this;
    }

    public Tag withShould(Consumer<List<String>> shouldSetter) {
        if(this.should == null) {
            this.should = new ArrayList<>();
        }
        shouldSetter.accept(this.should);
        return this;
    }

    /**
     * 必须要包含其中之一的答案标签id列表
     * @return should
     */
    public List<String> getShould() {
        return should;
    }

    public void setShould(List<String> should) {
        this.should = should;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tag tag = (Tag) o;
        return Objects.equals(this.should, tag.should);
    }
    @Override
    public int hashCode() {
        return Objects.hash(should);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tag {\n");
        sb.append("    should: ").append(toIndentedString(should)).append("\n");
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

