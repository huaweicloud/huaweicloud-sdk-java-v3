package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtensionStar
 */
public class ExtensionStar {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_id")

    private String extensionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stars")

    private Integer stars;

    public ExtensionStar withExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * 插件id
     * @return extensionId
     */
    public String getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(String extensionId) {
        this.extensionId = extensionId;
    }

    public ExtensionStar withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 评星内容
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ExtensionStar withStars(Integer stars) {
        this.stars = stars;
        return this;
    }

    /**
     * 评星总数
     * minimum: 1
     * maximum: 5
     * @return stars
     */
    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionStar that = (ExtensionStar) obj;
        return Objects.equals(this.extensionId, that.extensionId) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.stars, that.stars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extensionId, comment, stars);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionStar {\n");
        sb.append("    extensionId: ").append(toIndentedString(extensionId)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
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
