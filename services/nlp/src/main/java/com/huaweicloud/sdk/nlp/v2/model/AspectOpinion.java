package com.huaweicloud.sdk.nlp.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 属性观点列表
 */
public class AspectOpinion  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aspect_category")
    

    private String aspectCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aspect_term")
    

    private String aspectTerm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="opinion_term")
    

    private String opinionTerm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="span")
    
    private List<Integer> span = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    

    private Integer label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    

    private String tag;

    public AspectOpinion withAspectCategory(String aspectCategory) {
        this.aspectCategory = aspectCategory;
        return this;
    }

    


    /**
     * 属性类别 手机领域：['整体','性价比', '赠品','分期', '配件', '活动', '品牌', '物流派送', '包装', '游戏性能', '系统性能', '芯片', '屏幕', '电池', '自拍', '拍照', '音质', '散热', '防水', '信号', '解锁', '外形设计', '握持手感', '质感', '颜色', '内存/容量', '客服/售后', '其他']
     * @return aspectCategory
     */
    public String getAspectCategory() {
        return aspectCategory;
    }

    public void setAspectCategory(String aspectCategory) {
        this.aspectCategory = aspectCategory;
    }

    

    public AspectOpinion withAspectTerm(String aspectTerm) {
        this.aspectTerm = aspectTerm;
        return this;
    }

    


    /**
     * 属性词，与对应的描述词至少出现其中之一，可能为null。
     * @return aspectTerm
     */
    public String getAspectTerm() {
        return aspectTerm;
    }

    public void setAspectTerm(String aspectTerm) {
        this.aspectTerm = aspectTerm;
    }

    

    public AspectOpinion withOpinionTerm(String opinionTerm) {
        this.opinionTerm = opinionTerm;
        return this;
    }

    


    /**
     * 描述词，与对应的属性词至少出现其中之一，可能为null。
     * @return opinionTerm
     */
    public String getOpinionTerm() {
        return opinionTerm;
    }

    public void setOpinionTerm(String opinionTerm) {
        this.opinionTerm = opinionTerm;
    }

    

    public AspectOpinion withSpan(List<Integer> span) {
        this.span = span;
        return this;
    }

    
    public AspectOpinion addSpanItem(Integer spanItem) {
        if(this.span == null) {
            this.span = new ArrayList<>();
        }
        this.span.add(spanItem);
        return this;
    }

    public AspectOpinion withSpan(Consumer<List<Integer>> spanSetter) {
        if(this.span == null) {
            this.span = new ArrayList<>();
        }
        spanSetter.accept(this.span);
        return this;
    }

    /**
     * 共4个数字，分别表示属性词和描述词在文本中的起始位置和结束位置。若属性词为null，则1, 2两位不展示；若描述词为null，则3, 4位不展示。
     * @return span
     */
    public List<Integer> getSpan() {
        return span;
    }

    public void setSpan(List<Integer> span) {
        this.span = span;
    }

    

    public AspectOpinion withLabel(Integer label) {
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

    

    public AspectOpinion withConfidence(Float confidence) {
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

    

    public AspectOpinion withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 属性-描述词片段所对应的标签。若分类为'其他'，则不给出标签，返回null。
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
        AspectOpinion aspectOpinion = (AspectOpinion) o;
        return Objects.equals(this.aspectCategory, aspectOpinion.aspectCategory) &&
            Objects.equals(this.aspectTerm, aspectOpinion.aspectTerm) &&
            Objects.equals(this.opinionTerm, aspectOpinion.opinionTerm) &&
            Objects.equals(this.span, aspectOpinion.span) &&
            Objects.equals(this.label, aspectOpinion.label) &&
            Objects.equals(this.confidence, aspectOpinion.confidence) &&
            Objects.equals(this.tag, aspectOpinion.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(aspectCategory, aspectTerm, opinionTerm, span, label, confidence, tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AspectOpinion {\n");
        sb.append("    aspectCategory: ").append(toIndentedString(aspectCategory)).append("\n");
        sb.append("    aspectTerm: ").append(toIndentedString(aspectTerm)).append("\n");
        sb.append("    opinionTerm: ").append(toIndentedString(opinionTerm)).append("\n");
        sb.append("    span: ").append(toIndentedString(span)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

