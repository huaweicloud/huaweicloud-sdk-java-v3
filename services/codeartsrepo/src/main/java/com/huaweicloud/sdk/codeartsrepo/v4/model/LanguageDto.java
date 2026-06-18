package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LanguageDto
 */
public class LanguageDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_list")

    private List<String> extensionList = null;

    public LanguageDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 语言名称。 **约束限制：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LanguageDto withExtensionList(List<String> extensionList) {
        this.extensionList = extensionList;
        return this;
    }

    public LanguageDto addExtensionListItem(String extensionListItem) {
        if (this.extensionList == null) {
            this.extensionList = new ArrayList<>();
        }
        this.extensionList.add(extensionListItem);
        return this;
    }

    public LanguageDto withExtensionList(Consumer<List<String>> extensionListSetter) {
        if (this.extensionList == null) {
            this.extensionList = new ArrayList<>();
        }
        extensionListSetter.accept(this.extensionList);
        return this;
    }

    /**
     * **参数解释：** 文件后缀名。 **约束限制：** 不涉及。
     * @return extensionList
     */
    public List<String> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<String> extensionList) {
        this.extensionList = extensionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LanguageDto that = (LanguageDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.extensionList, that.extensionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, extensionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LanguageDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
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
