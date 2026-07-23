package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RDMParamVOStructuredDocInfo
 */
public class RDMParamVOStructuredDocInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private StructuredDocInfo params;

    public RDMParamVOStructuredDocInfo withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释：**  应用ID，用于指定实例所属的应用。 当URL路径中已能明确应用上下文时，此参数可不传。 获取方法请参见[获取租户下的应用清单 - ListApps](https://support.huaweicloud.com/api-idme/ListApps.html)。  **约束限制：**  不涉及。  **取值范围：**  - 于2023年06月01日之前创建的应用：由英文字母和数字组成，长度为1-36个字符。 - 于2023年06月01日之后创建的应用：由英文字母和数字组成，且长度为32个字符。  **默认取值：**  不涉及。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public RDMParamVOStructuredDocInfo withParams(StructuredDocInfo params) {
        this.params = params;
        return this;
    }

    public RDMParamVOStructuredDocInfo withParams(Consumer<StructuredDocInfo> paramsSetter) {
        if (this.params == null) {
            this.params = new StructuredDocInfo();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public StructuredDocInfo getParams() {
        return params;
    }

    public void setParams(StructuredDocInfo params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RDMParamVOStructuredDocInfo that = (RDMParamVOStructuredDocInfo) obj;
        return Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDMParamVOStructuredDocInfo {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
