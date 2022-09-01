package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * CreateSnapshotReq
 */
public class CreateSnapshotReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indices")

    @JacksonXmlProperty(localName = "indices")

    private String indices;

    public CreateSnapshotReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 快照名称，快照名称在4位到64位之间，必须以字母开头，可以包含字母、数字、中划线或者下划线，注意字母不能大写且不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSnapshotReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 快照描述，0～256个字符，不能包含!<>=&\\\"'字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSnapshotReq withIndices(String indices) {
        this.indices = indices;
        return this;
    }

    /**
     * 指定要备份的索引名称，多个索引用逗号隔开，默认备份所有索引。支持使用“\\*”匹配多个索引，例如：2018-06\\*，表示备份名称前缀是2018-06的所有索引的数据。  0～1024个字符，不能包含空格和大写字母，且不能包含\\\"\\\\<|>/?特殊字符。
     * @return indices
     */
    public String getIndices() {
        return indices;
    }

    public void setIndices(String indices) {
        this.indices = indices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSnapshotReq createSnapshotReq = (CreateSnapshotReq) o;
        return Objects.equals(this.name, createSnapshotReq.name)
            && Objects.equals(this.description, createSnapshotReq.description)
            && Objects.equals(this.indices, createSnapshotReq.indices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, indices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
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
