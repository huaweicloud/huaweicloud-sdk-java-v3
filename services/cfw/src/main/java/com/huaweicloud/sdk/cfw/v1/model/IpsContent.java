package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 自定义IPS规则内容 **约束限制**：     不涉及 **取值范围**： 不涉及 **默认取值**：   不涉及
 */
public class IpsContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depth")

    private Integer depth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_hex")

    private Boolean isHex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ignore")

    private Boolean isIgnore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_uri")

    private Boolean isUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_position")

    private Integer relativePosition;

    public IpsContent withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**： 内容 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**：   不涉及
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public IpsContent withDepth(Integer depth) {
        this.depth = depth;
        return this;
    }

    /**
     * **参数解释**： 匹配特征时，截止匹配的位置 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**：   不涉及
     * minimum: 1
     * maximum: 65535
     * @return depth
     */
    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public IpsContent withIsHex(Boolean isHex) {
        this.isHex = isHex;
        return this;
    }

    /**
     * **参数解释**： 报文内容是否为十六进制 **约束限制**： 不涉及 **取值范围**： true： 是十六进制 false： 不是十六进制 **默认取值**：   不涉及
     * @return isHex
     */
    public Boolean getIsHex() {
        return isHex;
    }

    public void setIsHex(Boolean isHex) {
        this.isHex = isHex;
    }

    public IpsContent withIsIgnore(Boolean isIgnore) {
        this.isIgnore = isIgnore;
        return this;
    }

    /**
     * **参数解释**： 是否忽略大小写 **约束限制**： 不涉及 **取值范围**： true： 忽略 false： 不忽略 **默认取值**：   不涉及
     * @return isIgnore
     */
    public Boolean getIsIgnore() {
        return isIgnore;
    }

    public void setIsIgnore(Boolean isIgnore) {
        this.isIgnore = isIgnore;
    }

    public IpsContent withIsUri(Boolean isUri) {
        this.isUri = isUri;
        return this;
    }

    /**
     * **参数解释**： 是否匹配URL中跟“内容”一致的字段 **约束限制**： 不涉及 **取值范围**： true： 匹配 false： 不匹配 **默认取值**：   不涉及
     * @return isUri
     */
    public Boolean getIsUri() {
        return isUri;
    }

    public void setIsUri(Boolean isUri) {
        this.isUri = isUri;
    }

    public IpsContent withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 匹配特征时开始的位置 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**：   不涉及
     * minimum: 0
     * maximum: 65535
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public IpsContent withRelativePosition(Integer relativePosition) {
        this.relativePosition = relativePosition;
        return this;
    }

    /**
     * **参数解释**： 匹配特征时，指定开始的位置 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**：   不涉及
     * minimum: 0
     * maximum: 1
     * @return relativePosition
     */
    public Integer getRelativePosition() {
        return relativePosition;
    }

    public void setRelativePosition(Integer relativePosition) {
        this.relativePosition = relativePosition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpsContent that = (IpsContent) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.depth, that.depth)
            && Objects.equals(this.isHex, that.isHex) && Objects.equals(this.isIgnore, that.isIgnore)
            && Objects.equals(this.isUri, that.isUri) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.relativePosition, that.relativePosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, depth, isHex, isIgnore, isUri, offset, relativePosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsContent {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
        sb.append("    isHex: ").append(toIndentedString(isHex)).append("\n");
        sb.append("    isIgnore: ").append(toIndentedString(isIgnore)).append("\n");
        sb.append("    isUri: ").append(toIndentedString(isUri)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    relativePosition: ").append(toIndentedString(relativePosition)).append("\n");
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
