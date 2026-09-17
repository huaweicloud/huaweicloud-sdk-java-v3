package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowIpdProjectListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    public ShowIpdProjectListRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释**： 项目名称搜索关键字。 **约束限制**： 最大256个字符。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ShowIpdProjectListRequest withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * **参数解释**： IPD项目模型id。 **约束限制**： 不涉及 **取值范围**： 10001（系统设备类） 10002（独立软件类） 10003（云服务类型） **默认取值**： 不涉及
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIpdProjectListRequest that = (ShowIpdProjectListRequest) obj;
        return Objects.equals(this.search, that.search) && Objects.equals(this.model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(search, model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpdProjectListRequest {\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
