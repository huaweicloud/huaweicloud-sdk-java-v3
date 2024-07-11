package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResumePluginExtensionsRequestBody
 */
public class ResumePluginExtensionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_list")

    private List<String> dbList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_name")

    private String extensionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_action")

    private String extensionAction;

    public ResumePluginExtensionsRequestBody withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * 插件名称
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public ResumePluginExtensionsRequestBody withDbList(List<String> dbList) {
        this.dbList = dbList;
        return this;
    }

    public ResumePluginExtensionsRequestBody addDbListItem(String dbListItem) {
        if (this.dbList == null) {
            this.dbList = new ArrayList<>();
        }
        this.dbList.add(dbListItem);
        return this;
    }

    public ResumePluginExtensionsRequestBody withDbList(Consumer<List<String>> dbListSetter) {
        if (this.dbList == null) {
            this.dbList = new ArrayList<>();
        }
        dbListSetter.accept(this.dbList);
        return this;
    }

    /**
     * 数据库列表
     * @return dbList
     */
    public List<String> getDbList() {
        return dbList;
    }

    public void setDbList(List<String> dbList) {
        this.dbList = dbList;
    }

    public ResumePluginExtensionsRequestBody withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * 拓展模块名称
     * @return extensionName
     */
    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(String extensionName) {
        this.extensionName = extensionName;
    }

    public ResumePluginExtensionsRequestBody withExtensionAction(String extensionAction) {
        this.extensionAction = extensionAction;
        return this;
    }

    /**
     * 扩展开关。on表示开启，off表示关闭。
     * @return extensionAction
     */
    public String getExtensionAction() {
        return extensionAction;
    }

    public void setExtensionAction(String extensionAction) {
        this.extensionAction = extensionAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResumePluginExtensionsRequestBody that = (ResumePluginExtensionsRequestBody) obj;
        return Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.dbList, that.dbList)
            && Objects.equals(this.extensionName, that.extensionName)
            && Objects.equals(this.extensionAction, that.extensionAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginName, dbList, extensionName, extensionAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResumePluginExtensionsRequestBody {\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    dbList: ").append(toIndentedString(dbList)).append("\n");
        sb.append("    extensionName: ").append(toIndentedString(extensionName)).append("\n");
        sb.append("    extensionAction: ").append(toIndentedString(extensionAction)).append("\n");
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
