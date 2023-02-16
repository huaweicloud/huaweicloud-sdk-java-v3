package com.huaweicloud.sdk.nlp.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class EntitySentimentReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    
    private String content;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entity")
    
    
    private String entity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private Integer type;

    public EntitySentimentReq withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 请求文本。文本编码要求为utf-8，仅支持中文实体情感分析。 限定content+entity长度为512以内，长度超过512时，只检测前512个字符。 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public EntitySentimentReq withEntity(String entity) {
        this.entity = entity;
        return this;
    }

    


    /**
     * 请求实体。文本编码要求为utf-8.仅支持中文实体情感分析。 限定content+entity长度为512以内，长度超过512时，只检测前512个字符。
     * @return entity
     */
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    

    public EntitySentimentReq withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 取值如下： 3 金融领域
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntitySentimentReq entitySentimentReq = (EntitySentimentReq) o;
        return Objects.equals(this.content, entitySentimentReq.content) &&
            Objects.equals(this.entity, entitySentimentReq.entity) &&
            Objects.equals(this.type, entitySentimentReq.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, entity, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntitySentimentReq {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

