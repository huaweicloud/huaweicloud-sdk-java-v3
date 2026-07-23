package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RDMParamVOListMultiViewModelVersionViewCreateDTO
 */
public class RDMParamVOListMultiViewModelVersionViewCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<MultiViewModelVersionViewCreateDTO> params = null;

    public RDMParamVOListMultiViewModelVersionViewCreateDTO withApplicationId(String applicationId) {
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

    public RDMParamVOListMultiViewModelVersionViewCreateDTO withParams(
        List<MultiViewModelVersionViewCreateDTO> params) {
        this.params = params;
        return this;
    }

    public RDMParamVOListMultiViewModelVersionViewCreateDTO addParamsItem(
        MultiViewModelVersionViewCreateDTO paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public RDMParamVOListMultiViewModelVersionViewCreateDTO withParams(
        Consumer<List<MultiViewModelVersionViewCreateDTO>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释：**  请求参数对象数组，每个元素包含一个待创建多维视图的版本ID、引用对象及关系复制类型等信息。支持批量操作。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return params
     */
    public List<MultiViewModelVersionViewCreateDTO> getParams() {
        return params;
    }

    public void setParams(List<MultiViewModelVersionViewCreateDTO> params) {
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
        RDMParamVOListMultiViewModelVersionViewCreateDTO that = (RDMParamVOListMultiViewModelVersionViewCreateDTO) obj;
        return Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDMParamVOListMultiViewModelVersionViewCreateDTO {\n");
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
