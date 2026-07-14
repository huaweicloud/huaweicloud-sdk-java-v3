package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新镜像标签请求体，包含两个字段read_me和tags，其中read_me为镜像说明信息，支持30k长度以内字符串；tags为标签列表，标签为键值对
 */
public class UpdateImageGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_me")

    private String readMe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<UpdateImageGroupRequestBodyTags> tags = null;

    public UpdateImageGroupRequestBody withReadMe(String readMe) {
        this.readMe = readMe;
        return this;
    }

    /**
     * **参数解释**：镜像组更新的概览信息。 **约束限制**：不涉及。 **取值范围**：长度限制30000个字符。 **默认取值**：不涉及。
     * @return readMe
     */
    public String getReadMe() {
        return readMe;
    }

    public void setReadMe(String readMe) {
        this.readMe = readMe;
    }

    public UpdateImageGroupRequestBody withTags(List<UpdateImageGroupRequestBodyTags> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateImageGroupRequestBody addTagsItem(UpdateImageGroupRequestBodyTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateImageGroupRequestBody withTags(Consumer<List<UpdateImageGroupRequestBodyTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：镜像组更新的标签。 **约束限制**：最大支持20个标签。 **取值范围**：key值最大支持长度128，value值最大支持255。 **默认取值**：不涉及。
     * @return tags
     */
    public List<UpdateImageGroupRequestBodyTags> getTags() {
        return tags;
    }

    public void setTags(List<UpdateImageGroupRequestBodyTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateImageGroupRequestBody that = (UpdateImageGroupRequestBody) obj;
        return Objects.equals(this.readMe, that.readMe) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readMe, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateImageGroupRequestBody {\n");
        sb.append("    readMe: ").append(toIndentedString(readMe)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
