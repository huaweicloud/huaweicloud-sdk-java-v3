package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepositoryInheritSettingsBodyDto
 */
public class RepositoryInheritSettingsBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<RepositoryInheritSettingUpdateBodyDto> data = null;

    public RepositoryInheritSettingsBodyDto withData(List<RepositoryInheritSettingUpdateBodyDto> data) {
        this.data = data;
        return this;
    }

    public RepositoryInheritSettingsBodyDto addDataItem(RepositoryInheritSettingUpdateBodyDto dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public RepositoryInheritSettingsBodyDto withData(Consumer<List<RepositoryInheritSettingUpdateBodyDto>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释：** 继承设置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return data
     */
    public List<RepositoryInheritSettingUpdateBodyDto> getData() {
        return data;
    }

    public void setData(List<RepositoryInheritSettingUpdateBodyDto> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryInheritSettingsBodyDto that = (RepositoryInheritSettingsBodyDto) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryInheritSettingsBodyDto {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
