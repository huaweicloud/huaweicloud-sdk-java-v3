package com.huaweicloud.sdk.nlp.v2.model;





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
 * 属性观点列表
 */
public class AspectAdvanceOpinion  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aspect_category")
    
    @JacksonXmlProperty(localName = "aspect_category")
    
    private String aspectCategory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    @JacksonXmlProperty(localName = "label")
    
    private Integer label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    @JacksonXmlProperty(localName = "confidence")
    
    private Float confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aspect_term")
    
    @JacksonXmlProperty(localName = "aspect_term")
    
    private String aspectTerm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="opinion_term")
    
    @JacksonXmlProperty(localName = "opinion_term")
    
    private String opinionTerm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="span")
    
    @JacksonXmlProperty(localName = "span")
    
    private List<Integer> span = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    @JacksonXmlProperty(localName = "tag")
    
    private String tag;

    public AspectAdvanceOpinion withAspectCategory(String aspectCategory) {
        this.aspectCategory = aspectCategory;
        return this;
    }

    


    /**
     * 属性类别 手机领域：['整体','内存','外形设计','屏幕','性价比','拍照','散热','电池','人脸识别','信号','指纹识别','音质','握持手感','活动配件赠品','防水','客服','物流派送','包装'] 汽车领域：['动力','外观','内饰','空间','操控', '舒适性', '性价比','能耗']
     * @return aspectCategory
     */
    public String getAspectCategory() {
        return aspectCategory;
    }

    public void setAspectCategory(String aspectCategory) {
        this.aspectCategory = aspectCategory;
    }

    

    public AspectAdvanceOpinion withLabel(Integer label) {
        this.label = label;
        return this;
    }

    


    /**
     * 情感标签，0：负向，1：正向
     * @return label
     */
    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    

    public AspectAdvanceOpinion withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 情感标签置信度
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    

    public AspectAdvanceOpinion withAspectTerm(String aspectTerm) {
        this.aspectTerm = aspectTerm;
        return this;
    }

    


    /**
     * 属性描述词，预留参数，暂不支持。
     * @return aspectTerm
     */
    public String getAspectTerm() {
        return aspectTerm;
    }

    public void setAspectTerm(String aspectTerm) {
        this.aspectTerm = aspectTerm;
    }

    

    public AspectAdvanceOpinion withOpinionTerm(String opinionTerm) {
        this.opinionTerm = opinionTerm;
        return this;
    }

    


    /**
     * 观点描述词，预留参数，暂不支持。
     * @return opinionTerm
     */
    public String getOpinionTerm() {
        return opinionTerm;
    }

    public void setOpinionTerm(String opinionTerm) {
        this.opinionTerm = opinionTerm;
    }

    

    public AspectAdvanceOpinion withSpan(List<Integer> span) {
        this.span = span;
        return this;
    }

    
    public AspectAdvanceOpinion addSpanItem(Integer spanItem) {
        if(this.span == null) {
            this.span = new ArrayList<>();
        }
        this.span.add(spanItem);
        return this;
    }

    public AspectAdvanceOpinion withSpan(Consumer<List<Integer>> spanSetter) {
        if(this.span == null) {
            this.span = new ArrayList<>();
        }
        spanSetter.accept(this.span);
        return this;
    }

    /**
     * 属性评价起始位置，预留参数，暂不支持。
     * @return span
     */
    public List<Integer> getSpan() {
        return span;
    }

    public void setSpan(List<Integer> span) {
        this.span = span;
    }

    

    public AspectAdvanceOpinion withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 观点标签，预留参数，暂不支持。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AspectAdvanceOpinion aspectAdvanceOpinion = (AspectAdvanceOpinion) o;
        return Objects.equals(this.aspectCategory, aspectAdvanceOpinion.aspectCategory) &&
            Objects.equals(this.label, aspectAdvanceOpinion.label) &&
            Objects.equals(this.confidence, aspectAdvanceOpinion.confidence) &&
            Objects.equals(this.aspectTerm, aspectAdvanceOpinion.aspectTerm) &&
            Objects.equals(this.opinionTerm, aspectAdvanceOpinion.opinionTerm) &&
            Objects.equals(this.span, aspectAdvanceOpinion.span) &&
            Objects.equals(this.tag, aspectAdvanceOpinion.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(aspectCategory, label, confidence, aspectTerm, opinionTerm, span, tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AspectAdvanceOpinion {\n");
        sb.append("    aspectCategory: ").append(toIndentedString(aspectCategory)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    aspectTerm: ").append(toIndentedString(aspectTerm)).append("\n");
        sb.append("    opinionTerm: ").append(toIndentedString(opinionTerm)).append("\n");
        sb.append("    span: ").append(toIndentedString(span)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

