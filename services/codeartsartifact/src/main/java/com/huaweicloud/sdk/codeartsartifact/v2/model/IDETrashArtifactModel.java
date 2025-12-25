package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回收站信息
 */
public class IDETrashArtifactModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    public IDETrashArtifactModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 仓库id，格式为{region}_{domainId}_{format}_{sequence}。可以从私有依赖库首页->仓库概览->仓库地址 url 中获取，最后两个\"/\"中间的字符串即为仓库id。 **约束限制**: 根据仓库id格式中region, domainId需要为有效值，format有效值为:npm|go|pypi|rpm|composer|maven|debian|conan|nuget|docker2|cocoapods|ohpm, sequence取值根据套餐不同有不同上限值。 **取值范围**: 不涉及。 **默认取值**: 无。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IDETrashArtifactModel withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * **参数解释**: 制品类型。 **约束限制**: 不涉及。 **取值范围**: maven2|docker|npm|go|pypi|rpm|composer|debian|conan|nuget|docker2|cocoapods|ohpm|generic。 **默认取值**: 无。
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public IDETrashArtifactModel withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 当前仓库状态。 **约束限制**: 不涉及。 **取值范围**: active：正常。 trash：废弃。 delete：删除。 **默认取值**: 无。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IDETrashArtifactModel withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**: 待还原的仓库路径。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 无。
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDETrashArtifactModel that = (IDETrashArtifactModel) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.format, that.format)
            && Objects.equals(this.status, that.status) && Objects.equals(this.uri, that.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, format, status, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDETrashArtifactModel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
