package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 启动/停止插件请求体
 */
public class PluginControlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_code")

    private String pluginCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_all")

    private Boolean operateAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public PluginControlRequestBody withPluginCode(String pluginCode) {
        this.pluginCode = pluginCode;
        return this;
    }

    /**
     * **参数解释**： 插件编码 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return pluginCode
     */
    public String getPluginCode() {
        return pluginCode;
    }

    public void setPluginCode(String pluginCode) {
        this.pluginCode = pluginCode;
    }

    public PluginControlRequestBody withOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
        return this;
    }

    /**
     * **参数解释**： 是否是全量操作，优先级高于host_id_list，若取值为true且host_id_list不为空，仍执行全量操作 **约束限制**: 不涉及 **取值范围**: - true：全量操作，启动/停止所有符合条件的插件 - false: 非全量操作，仅对host_id_list内服务器执行启动/停止插件操作 **默认取值**: false 
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public PluginControlRequestBody withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public PluginControlRequestBody addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public PluginControlRequestBody withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * **参数解释**： 服务器ID列表 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及 
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginControlRequestBody that = (PluginControlRequestBody) obj;
        return Objects.equals(this.pluginCode, that.pluginCode) && Objects.equals(this.operateAll, that.operateAll)
            && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginCode, operateAll, hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginControlRequestBody {\n");
        sb.append("    pluginCode: ").append(toIndentedString(pluginCode)).append("\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
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
