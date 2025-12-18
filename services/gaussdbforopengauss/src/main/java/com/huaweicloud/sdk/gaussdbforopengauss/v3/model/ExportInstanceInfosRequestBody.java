package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportInstanceInfosRequestBody
 */
public class ExportInstanceInfosRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_list")

    private List<String> instanceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_defined_columns")

    private List<String> userDefinedColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    public ExportInstanceInfosRequestBody withInstanceList(List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }

    public ExportInstanceInfosRequestBody addInstanceListItem(String instanceListItem) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        this.instanceList.add(instanceListItem);
        return this;
    }

    public ExportInstanceInfosRequestBody withInstanceList(Consumer<List<String>> instanceListSetter) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        instanceListSetter.accept(this.instanceList);
        return this;
    }

    /**
     * **参数解释**:   实例id列表。 **约束限制**:   不涉及。 **取值范围**:   不涉及 **默认取值**:   不涉及。
     * @return instanceList
     */
    public List<String> getInstanceList() {
        return instanceList;
    }

    public void setInstanceList(List<String> instanceList) {
        this.instanceList = instanceList;
    }

    public ExportInstanceInfosRequestBody withUserDefinedColumns(List<String> userDefinedColumns) {
        this.userDefinedColumns = userDefinedColumns;
        return this;
    }

    public ExportInstanceInfosRequestBody addUserDefinedColumnsItem(String userDefinedColumnsItem) {
        if (this.userDefinedColumns == null) {
            this.userDefinedColumns = new ArrayList<>();
        }
        this.userDefinedColumns.add(userDefinedColumnsItem);
        return this;
    }

    public ExportInstanceInfosRequestBody withUserDefinedColumns(Consumer<List<String>> userDefinedColumnsSetter) {
        if (this.userDefinedColumns == null) {
            this.userDefinedColumns = new ArrayList<>();
        }
        userDefinedColumnsSetter.accept(this.userDefinedColumns);
        return this;
    }

    /**
     * **参数解释**:   导出字段列表。 **约束限制**:   不涉及。 **取值范围**:   - name：实例名称   - id：实例ID   - alias：实例备注   - editionMode：产品类型   - haModel：实例类型   - deployMode：部署形态   - engine：数据库引擎版本   - hotfixVersions：已升级热补丁   - instanceStatus：实例状态   - payModel：计费模式   - targetEngineVersion：目标版本   - flavor：性能规格   - availableZones：可用区   - privateIp：内网地址   - dnsName：DNS   - ipv6：IPv6地址   - dbPort：数据库端口   - publicIp：弹性公网IP   - createAt：创建时间   - volumeType：存储空间类型   - volumeSize：存储空间大小   - vpcName：虚拟私有云名称   - vpcId：虚拟私有云ID   - securityGroupName：安全组   - enterpriseProjectName：企业项目  **默认取值**:   不涉及。
     * @return userDefinedColumns
     */
    public List<String> getUserDefinedColumns() {
        return userDefinedColumns;
    }

    public void setUserDefinedColumns(List<String> userDefinedColumns) {
        this.userDefinedColumns = userDefinedColumns;
    }

    public ExportInstanceInfosRequestBody withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * **参数解释**:   时区。 **约束限制**:   不涉及。 **取值范围**:   - +08:00 **默认取值**:   +08:00
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public ExportInstanceInfosRequestBody withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释**:   语言。 **约束限制**:   不涉及。 **取值范围**:   - zh-cn    - en-us  **默认取值**:   zh-cn
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportInstanceInfosRequestBody that = (ExportInstanceInfosRequestBody) obj;
        return Objects.equals(this.instanceList, that.instanceList)
            && Objects.equals(this.userDefinedColumns, that.userDefinedColumns)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceList, userDefinedColumns, timeZone, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportInstanceInfosRequestBody {\n");
        sb.append("    instanceList: ").append(toIndentedString(instanceList)).append("\n");
        sb.append("    userDefinedColumns: ").append(toIndentedString(userDefinedColumns)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
