package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListConfigTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_num")

    private BigDecimal templateNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_templates")

    private List<ConfigTemplatesListInfo> configTemplates = null;

    public ListConfigTemplatesResponse withTemplateNum(BigDecimal templateNum) {
        this.templateNum = templateNum;
        return this;
    }

    /**
     * 模板个数。
     * @return templateNum
     */
    public BigDecimal getTemplateNum() {
        return templateNum;
    }

    public void setTemplateNum(BigDecimal templateNum) {
        this.templateNum = templateNum;
    }

    public ListConfigTemplatesResponse withConfigTemplates(List<ConfigTemplatesListInfo> configTemplates) {
        this.configTemplates = configTemplates;
        return this;
    }

    public ListConfigTemplatesResponse addConfigTemplatesItem(ConfigTemplatesListInfo configTemplatesItem) {
        if (this.configTemplates == null) {
            this.configTemplates = new ArrayList<>();
        }
        this.configTemplates.add(configTemplatesItem);
        return this;
    }

    public ListConfigTemplatesResponse withConfigTemplates(
        Consumer<List<ConfigTemplatesListInfo>> configTemplatesSetter) {
        if (this.configTemplates == null) {
            this.configTemplates = new ArrayList<>();
        }
        configTemplatesSetter.accept(this.configTemplates);
        return this;
    }

    /**
     * 模板的详情数组。
     * @return configTemplates
     */
    public List<ConfigTemplatesListInfo> getConfigTemplates() {
        return configTemplates;
    }

    public void setConfigTemplates(List<ConfigTemplatesListInfo> configTemplates) {
        this.configTemplates = configTemplates;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConfigTemplatesResponse listConfigTemplatesResponse = (ListConfigTemplatesResponse) o;
        return Objects.equals(this.templateNum, listConfigTemplatesResponse.templateNum)
            && Objects.equals(this.configTemplates, listConfigTemplatesResponse.configTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateNum, configTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigTemplatesResponse {\n");
        sb.append("    templateNum: ").append(toIndentedString(templateNum)).append("\n");
        sb.append("    configTemplates: ").append(toIndentedString(configTemplates)).append("\n");
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
