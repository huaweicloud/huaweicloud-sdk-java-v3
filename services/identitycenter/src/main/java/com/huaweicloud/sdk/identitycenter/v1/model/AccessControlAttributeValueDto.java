package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * The value used for mapping a specified attribute to an identity source.
 */
public class AccessControlAttributeValueDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private List<String> source = null;

    public AccessControlAttributeValueDto withSource(List<String> source) {
        this.source = source;
        return this;
    }

    public AccessControlAttributeValueDto addSourceItem(String sourceItem) {
        if (this.source == null) {
            this.source = new ArrayList<>();
        }
        this.source.add(sourceItem);
        return this;
    }

    public AccessControlAttributeValueDto withSource(Consumer<List<String>> sourceSetter) {
        if (this.source == null) {
            this.source = new ArrayList<>();
        }
        sourceSetter.accept(this.source);
        return this;
    }

    /**
     * 用于将指定属性映射到身份源的值
     * @return source
     */
    public List<String> getSource() {
        return source;
    }

    public void setSource(List<String> source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlAttributeValueDto that = (AccessControlAttributeValueDto) obj;
        return Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessControlAttributeValueDto {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
