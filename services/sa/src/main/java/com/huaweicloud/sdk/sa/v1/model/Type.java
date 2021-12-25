package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Type */
public class Type {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business")

    private String business;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifier")

    private String classifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tech_domain")

    private String techDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private TypeProperties properties;

    public Type withBusiness(String business) {
        this.business = business;
        return this;
    }

    /** 事件所属业务领域标签，可选类别如下： attack – 攻击 vulnerability – 漏洞 compliance check – 合规检查 risk - 风险 public opinion - 舆情
     * illegal&violation - 违法违规 security bulletin - 公告
     * 
     * @return business */
    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public Type withCategory(String category) {
        this.category = category;
        return this;
    }

    /** 类别，推荐使用预定义的类型分类。
     * 
     * @return category */
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

    /** 分类器，推荐使用预定义的分类器。 如果指定了分类器，则必须指定类别。
     * 
     * @return classifier */
    public String getClassifier() {
        return classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public Type withTechDomain(String techDomain) {
        this.techDomain = techDomain;
        return this;
    }

    /** 技术领域标签： OS：主机 APP：应用 NET：网络 OPS：运维 CS：云服务 CSP：平台云服务
     * 
     * @return techDomain */
    public String getTechDomain() {
        return techDomain;
    }

    public void setTechDomain(String techDomain) {
        this.techDomain = techDomain;
    }

    public Type withProperties(TypeProperties properties) {
        this.properties = properties;
        return this;
    }

    public Type withProperties(Consumer<TypeProperties> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new TypeProperties();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /** Get properties
     * 
     * @return properties */
    public TypeProperties getProperties() {
        return properties;
    }

    public void setProperties(TypeProperties properties) {
        this.properties = properties;
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
        return Objects.equals(this.business, type.business) && Objects.equals(this.category, type.category)
            && Objects.equals(this.classifier, type.classifier) && Objects.equals(this.techDomain, type.techDomain)
            && Objects.equals(this.properties, type.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(business, category, classifier, techDomain, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Type {\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
        sb.append("    techDomain: ").append(toIndentedString(techDomain)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
