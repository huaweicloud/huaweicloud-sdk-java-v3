package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 镜像配置。 **约束限制：** 不涉及。
 */
public class ImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_path")

    private String swrPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public ImageInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 镜像ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释：** 镜像类别，标识镜像来源。 **约束限制：** 不涉及。 **取值范围：** - swr：软件仓库服务。 - [image：[通用镜像]。](tag:hws,hws_hk) **默认取值：** 不涉及。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ImageInfo withSwrPath(String swrPath) {
        this.swrPath = swrPath;
        return this;
    }

    /**
     * **参数解释：** 镜像地址，source不同取值时，地址为不同值。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return swrPath
     */
    public String getSwrPath() {
        return swrPath;
    }

    public void setSwrPath(String swrPath) {
        this.swrPath = swrPath;
    }

    public ImageInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释：** 镜像支持的规格。 **约束限制：** 不涉及。 **取值范围：** - GPU：图形处理器。 - CPU：中央处理器。 - ASCEND：昇腾芯片。 **默认取值：** CPU。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageInfo that = (ImageInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.source, that.source)
            && Objects.equals(this.swrPath, that.swrPath) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, source, swrPath, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    swrPath: ").append(toIndentedString(swrPath)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
