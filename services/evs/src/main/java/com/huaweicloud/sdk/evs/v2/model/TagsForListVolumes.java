package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * TagsForListVolumes
 */
public class TagsForListVolumes  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private List<String> values = new ArrayList<>();
    
    public TagsForListVolumes withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 标签键。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TagsForListVolumes withValues(List<String> values) {
        this.values = values;
        return this;
    }

    
    public TagsForListVolumes addValuesItem(String valuesItem) {
        this.values.add(valuesItem);
        return this;
    }

    public TagsForListVolumes withValues(Consumer<List<String>> valuesSetter) {
        if(this.values == null ){
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 标签值。  标签列表中最多包含10个value。 标签列表中的标签value值不允许重复。 标签列表如果为空列表，表示匹配任意值。标签列表中多个value之间是“或”的关系，在key已经满足要求的前提下，云硬盘满足请求中的某个value就会匹配出来。
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagsForListVolumes tagsForListVolumes = (TagsForListVolumes) o;
        return Objects.equals(this.key, tagsForListVolumes.key) &&
            Objects.equals(this.values, tagsForListVolumes.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagsForListVolumes {\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

