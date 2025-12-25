package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCollectorModuleTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private List<ModuleTemplateVo> common = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<ModuleTemplateVo> list = null;

    public ListCollectorModuleTemplateResponse withCommon(List<ModuleTemplateVo> common) {
        this.common = common;
        return this;
    }

    public ListCollectorModuleTemplateResponse addCommonItem(ModuleTemplateVo commonItem) {
        if (this.common == null) {
            this.common = new ArrayList<>();
        }
        this.common.add(commonItem);
        return this;
    }

    public ListCollectorModuleTemplateResponse withCommon(Consumer<List<ModuleTemplateVo>> commonSetter) {
        if (this.common == null) {
            this.common = new ArrayList<>();
        }
        commonSetter.accept(this.common);
        return this;
    }

    /**
     * 常用解析模板数组
     * @return common
     */
    public List<ModuleTemplateVo> getCommon() {
        return common;
    }

    public void setCommon(List<ModuleTemplateVo> common) {
        this.common = common;
    }

    public ListCollectorModuleTemplateResponse withList(List<ModuleTemplateVo> list) {
        this.list = list;
        return this;
    }

    public ListCollectorModuleTemplateResponse addListItem(ModuleTemplateVo listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListCollectorModuleTemplateResponse withList(Consumer<List<ModuleTemplateVo>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 列出解析模板数组
     * @return list
     */
    public List<ModuleTemplateVo> getList() {
        return list;
    }

    public void setList(List<ModuleTemplateVo> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectorModuleTemplateResponse that = (ListCollectorModuleTemplateResponse) obj;
        return Objects.equals(this.common, that.common) && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(common, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectorModuleTemplateResponse {\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
