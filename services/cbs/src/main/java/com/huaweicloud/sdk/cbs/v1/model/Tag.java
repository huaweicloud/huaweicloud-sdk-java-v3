package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Tag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "should")

    private List<String> should = null;

    public Tag withShould(List<String> should) {
        this.should = should;
        return this;
    }

    public Tag addShouldItem(String shouldItem) {
        if (this.should == null) {
            this.should = new ArrayList<>();
        }
        this.should.add(shouldItem);
        return this;
    }

    public Tag withShould(Consumer<List<String>> shouldSetter) {
        if (this.should == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tag that = (Tag) obj;
        return Objects.equals(this.should, that.should);
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
