package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Type
 */
public class Type  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private String category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="classifier")
    
    private String classifier;

    public Type withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 命名空间，只能使用预定义的命名空间值，有效取值如下： Compliance Checks、Vulnerabilities、Attack、Illegal and Violation、Risk、Public Opinion、TTPs、Killchain、Effects、Sensitive Data Identifications、Unusual Behaviors
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public Type withCategory(String category) {
        this.category = category;
        return this;
    }

    


    /**
     * 类别，推荐使用预定义的类型分类。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    public Type withClassifier(String classifier) {
        this.classifier = classifier;
        return this;
    }

    


    /**
     * 分类器，推荐使用预定义的分类器。 如果指定了分类器，则必须指定类别。
     * @return classifier
     */
    public String getClassifier() {
        return classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Type type = (Type) o;
        return Objects.equals(this.namespace, type.namespace) &&
            Objects.equals(this.category, type.category) &&
            Objects.equals(this.classifier, type.classifier);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, category, classifier);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Type {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
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

