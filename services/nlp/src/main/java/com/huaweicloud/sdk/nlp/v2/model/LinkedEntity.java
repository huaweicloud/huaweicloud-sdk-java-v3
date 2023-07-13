package com.huaweicloud.sdk.nlp.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 链接的实体 类
 */
public class LinkedEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mention")

    private String mention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_title")

    private String entityTitle;

    public LinkedEntity withMention(String mention) {
        this.mention = mention;
        return this;
    }

    /**
     * 实体指称
     * @return mention
     */
    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public LinkedEntity withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public LinkedEntity withEntityTitle(String entityTitle) {
        this.entityTitle = entityTitle;
        return this;
    }

    /**
     * 实体名称
     * @return entityTitle
     */
    public String getEntityTitle() {
        return entityTitle;
    }

    public void setEntityTitle(String entityTitle) {
        this.entityTitle = entityTitle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkedEntity that = (LinkedEntity) obj;
        return Objects.equals(this.mention, that.mention) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.entityTitle, that.entityTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mention, offset, entityTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkedEntity {\n");
        sb.append("    mention: ").append(toIndentedString(mention)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    entityTitle: ").append(toIndentedString(entityTitle)).append("\n");
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
