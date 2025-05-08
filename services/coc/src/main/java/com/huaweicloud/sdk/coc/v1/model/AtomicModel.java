package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AtomicModel
 */
public class AtomicModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_unique_key")

    private String atomicUniqueKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_name_zh")

    private String atomicNameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_name_en")

    private String atomicNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public AtomicModel withAtomicUniqueKey(String atomicUniqueKey) {
        this.atomicUniqueKey = atomicUniqueKey;
        return this;
    }

    /**
     * 原子能力唯一标识
     * @return atomicUniqueKey
     */
    public String getAtomicUniqueKey() {
        return atomicUniqueKey;
    }

    public void setAtomicUniqueKey(String atomicUniqueKey) {
        this.atomicUniqueKey = atomicUniqueKey;
    }

    public AtomicModel withAtomicNameZh(String atomicNameZh) {
        this.atomicNameZh = atomicNameZh;
        return this;
    }

    /**
     * 中文名
     * @return atomicNameZh
     */
    public String getAtomicNameZh() {
        return atomicNameZh;
    }

    public void setAtomicNameZh(String atomicNameZh) {
        this.atomicNameZh = atomicNameZh;
    }

    public AtomicModel withAtomicNameEn(String atomicNameEn) {
        this.atomicNameEn = atomicNameEn;
        return this;
    }

    /**
     * 英文名
     * @return atomicNameEn
     */
    public String getAtomicNameEn() {
        return atomicNameEn;
    }

    public void setAtomicNameEn(String atomicNameEn) {
        this.atomicNameEn = atomicNameEn;
    }

    public AtomicModel withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public AtomicModel addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public AtomicModel withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息：CLOUD_API、FUNCTION
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
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
        AtomicModel that = (AtomicModel) obj;
        return Objects.equals(this.atomicUniqueKey, that.atomicUniqueKey)
            && Objects.equals(this.atomicNameZh, that.atomicNameZh)
            && Objects.equals(this.atomicNameEn, that.atomicNameEn) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atomicUniqueKey, atomicNameZh, atomicNameEn, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AtomicModel {\n");
        sb.append("    atomicUniqueKey: ").append(toIndentedString(atomicUniqueKey)).append("\n");
        sb.append("    atomicNameZh: ").append(toIndentedString(atomicNameZh)).append("\n");
        sb.append("    atomicNameEn: ").append(toIndentedString(atomicNameEn)).append("\n");
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
