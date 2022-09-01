package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListYmlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    @JacksonXmlProperty(localName = "configurations")

    private Object configurations;

    public ListYmlsResponse withConfigurations(Object configurations) {
        this.configurations = configurations;
        return this;
    }

    /**
     * 集群参数配置列表。该对象中key值以具体获取为准，value拥有以下属性。 - id:  参数配置ID。 - key: 参数名称。 - vlaue:  参数值。 - defaultValue:  参数默认值。 - regex:  参数约束限制。 - desc:  参数中文描述。 - type:  参数类型描述。 - moduleDesc: 参数功能中文描述。 - modifyEnable: 参数是否可修改 true： 可以修改。 false：不可修改。 - enableValue: 参数支持修改的值。 - fileName: 参数存在的文件名称。默认为elasticsearch.yml。 - version:  版本信息。 - descENG: 参数英文描述。 - moduleDescENG:  参数功能英文描述。
     * @return configurations
     */
    public Object getConfigurations() {
        return configurations;
    }

    public void setConfigurations(Object configurations) {
        this.configurations = configurations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListYmlsResponse listYmlsResponse = (ListYmlsResponse) o;
        return Objects.equals(this.configurations, listYmlsResponse.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListYmlsResponse {\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
